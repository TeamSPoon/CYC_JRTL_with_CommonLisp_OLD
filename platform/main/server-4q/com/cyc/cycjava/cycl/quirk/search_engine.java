package com.cyc.cycjava.cycl.quirk;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_make_tag;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_start_timer;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_stop_timer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_underbar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equalp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.gensym;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_string_input_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.abstract_lexicon;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cyclifier;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.document;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.pos_tagger;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.pph_methods_lexicon;
import com.cyc.cycjava.cycl.pph_question;
import com.cyc.cycjava.cycl.pph_vars;
import com.cyc.cycjava.cycl.red_infrastructure_macros;
import com.cyc.cycjava.cycl.semtrans_lexicon;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.cycjava.cycl.subloop_tcp_client;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class search_engine extends SubLTranslatedFile {
    public static final SubLFile me = new search_engine();

    public static final String myName = "com.cyc.cycjava.cycl.quirk.search_engine";

    public static final String myFingerPrint = "8f93d90346f8af9c9a47198352efbb5d61551394d5849393f339deb6fa185246";

    // defparameter
    private static final SubLSymbol $default_corpus$ = makeSymbol("*DEFAULT-CORPUS*");

    // defparameter
    private static final SubLSymbol $world_wide_web_corpus$ = makeSymbol("*WORLD-WIDE-WEB-CORPUS*");

    // defvar
    private static final SubLSymbol $authorized_google_key$ = makeSymbol("*AUTHORIZED-GOOGLE-KEY*");







    // defparameter
    private static final SubLSymbol $google_client$ = makeSymbol("*GOOGLE-CLIENT*");

    // defparameter
    private static final SubLSymbol $wikipedia$ = makeSymbol("*WIKIPEDIA*");

    // defvar
    private static final SubLSymbol $lucene_client_host$ = makeSymbol("*LUCENE-CLIENT-HOST*");

    // defvar
    private static final SubLSymbol $lucene_client_port$ = makeSymbol("*LUCENE-CLIENT-PORT*");

    // defvar
    private static final SubLSymbol $lucene_client$ = makeSymbol("*LUCENE-CLIENT*");

    // defparameter
    /**
     * The number of times that the Google API methods have been invoked; adjusts
     * for errors.
     */
    public static final SubLSymbol $google_api_method_invocation_count$ = makeSymbol("*GOOGLE-API-METHOD-INVOCATION-COUNT*");

    // Internal Constants
    public static final SubLSymbol INFORMATION = makeSymbol("INFORMATION");



    public static final SubLList $list2 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SOURCE"), NIL, makeKeyword("PUBLIC")));



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_INFORMATION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INFORMATION-CLASS");





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_INFORMATION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INFORMATION-INSTANCE");



    public static final SubLList $list9 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list10 = list(makeString("@return objectp; the source of this piece of information, nil if unknown"), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol INFORMATION_GET_SOURCE_METHOD = makeSymbol("INFORMATION-GET-SOURCE-METHOD");

    public static final SubLSymbol ABSTRACT_PASSAGE = makeSymbol("ABSTRACT-PASSAGE");

    public static final SubLList $list13 = list(list(makeSymbol("VECTOR"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("MORE-RECENT"), list(makeSymbol("PASSAGE1"), makeSymbol("PASSAGE2")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-VECTOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DATES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PUBLICATION-DATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), EQUAL, list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("OLDER"), list(makeSymbol("OTHER-PASSAGE")), makeKeyword("PUBLIC")));



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_PASSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ABSTRACT-PASSAGE-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_PASSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ABSTRACT-PASSAGE-INSTANCE");

    public static final SubLList $list17 = list(makeSymbol("OBJECT"));

    public static final SubLList $list18 = list(makeString("@return boolean; t if OBJECT is equal to this passage, nil otherwise"), list(makeSymbol("RET"), list(makeSymbol("CAND"), list(makeSymbol("ABSTRACT-PASSAGE-P"), makeSymbol("OBJECT")), list(EQUALP, list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTENT"))), list(makeSymbol("FIM"), makeSymbol("OBJECT"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTENT")))))));



    public static final SubLSymbol ABSTRACT_PASSAGE_EQUAL_METHOD = makeSymbol("ABSTRACT-PASSAGE-EQUAL-METHOD");

    public static final SubLSymbol SIMILARITY = makeSymbol("SIMILARITY");

    public static final SubLList $list22 = list(makeSymbol("PASSAGE1"), makeSymbol("PASSAGE2"));

    public static final SubLList $list23 = list(makeString("@param PASSAGE1 abstract-passage-p\n   @param PASSAGE2 abstract-passage-p\n   @return non-negative-integerp; the similarity between PASSAGE1 and PASSAGE2 with\n   0 indicating no similarity and 1 indicating identity"), list(makeSymbol("CHECK-TYPE"), makeSymbol("PASSAGE1"), makeSymbol("ABSTRACT-PASSAGE-P")), list(makeSymbol("CHECK-TYPE"), makeSymbol("PASSAGE2"), makeSymbol("ABSTRACT-PASSAGE-P")), list(makeSymbol("PWHEN"), list(makeSymbol("STRING="), list(makeSymbol("FIM"), makeSymbol("PASSAGE1"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTENT"))), list(makeSymbol("FIM"), makeSymbol("PASSAGE2"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTENT")))), list(makeSymbol("RET"), ONE_INTEGER)), list(makeSymbol("RET"), list(makeSymbol("SAFE-SVECTOR-COSINE-ANGLE"), list(makeSymbol("FIM"), makeSymbol("PASSAGE1"), list(makeSymbol("QUOTE"), makeSymbol("GET-VECTOR"))), list(makeSymbol("FIM"), makeSymbol("PASSAGE2"), list(makeSymbol("QUOTE"), makeSymbol("GET-VECTOR"))))));





    public static final SubLSymbol ABSTRACT_PASSAGE_SIMILARITY_METHOD = makeSymbol("ABSTRACT-PASSAGE-SIMILARITY-METHOD");

    public static final SubLSymbol GET_DATES = makeSymbol("GET-DATES");

    public static final SubLList $list28 = list(makeString("@return listp; the list of dates found in this passage"), list(makeSymbol("CLET"), list(list(makeSymbol("DATES"), NIL), makeSymbol("DATE")), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("THISDAY"), makeSymbol("THISMONTH"), makeSymbol("THISYEAR")), list(makeSymbol("DECODE-UNIVERSAL-DATE"), list(makeSymbol("GET-UNIVERSAL-DATE"))), list(makeSymbol("IGNORE"), makeSymbol("THISDAY"), makeSymbol("THISMONTH")), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("PDAY"), makeSymbol("PMONTH"), makeSymbol("PYEAR")), list(makeSymbol("DECODE-UNIVERSAL-DATE"), list(makeSymbol("CYCL-DATE-TO-UNIVERSAL-DATE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-PUBLICATION-DATE"))))), list(makeSymbol("IGNORE"), makeSymbol("PMONTH"), makeSymbol("PDAY")), list(makeSymbol("CDOLIST"), list(makeSymbol("TYPE.STRING"), list(makeSymbol("RESPORATOR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTENT"))))), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), list(makeSymbol("CAR"), makeSymbol("TYPE.STRING")), list(makeSymbol("QUOTE"), list(makeSymbol("DATE"), makeSymbol("YEAR"), makeSymbol("TIMEOFYEAR"))), list(makeSymbol("QUOTE"), EQL)), list(makeSymbol("CSETQ"), makeSymbol("DATE"), list(makeSymbol("PARSE-DATE"), list(makeSymbol("CDR"), makeSymbol("TYPE.STRING")))), list(makeSymbol("PWHEN"), makeSymbol("DATE"), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("SECOND"), makeSymbol("MINUTE"), makeSymbol("HOUR"), makeSymbol("DAY"), makeSymbol("MONTH"), makeSymbol("YEAR")), list(makeSymbol("DECODE-EXTENDED-UNIVERSAL-DATE"), makeSymbol("DATE")), list(makeSymbol("IGNORE"), makeSymbol("SECOND"), makeSymbol("MINUTE"), makeSymbol("HOUR")), list(makeSymbol("PWHEN"), list(makeSymbol("="), makeSymbol("YEAR"), makeSymbol("THISYEAR")), list(makeSymbol("CSETQ"), makeSymbol("YEAR"), list(makeSymbol("GUESS-YEAR"), makeSymbol("PYEAR"), makeSymbol("PMONTH"), makeSymbol("PDAY"), makeSymbol("MONTH"), makeSymbol("DAY")))), list(makeSymbol("CPUSH"), list(makeSymbol("CONSTRUCT-REDUCED-CYCL-DATE"), NIL, NIL, NIL, makeSymbol("DAY"), makeSymbol("MONTH"), makeSymbol("YEAR")), makeSymbol("DATES")))))))), list(makeSymbol("RET"), makeSymbol("DATES"))));



    public static final SubLList $list30 = list(makeSymbol("DATE"), makeSymbol("YEAR"), makeSymbol("TIMEOFYEAR"));

    public static final SubLSymbol ABSTRACT_PASSAGE_GET_DATES_METHOD = makeSymbol("ABSTRACT-PASSAGE-GET-DATES-METHOD");

    public static final SubLSymbol OLDER = makeSymbol("OLDER");

    public static final SubLList $list33 = list(makeSymbol("OTHER-PASSAGE"));

    public static final SubLList $list34 = list(makeString("@param OTHER-PASSAGE, abstract-passage-p\n   @return BOOLEAN, T is this passage is older than OTHER-PASSAGE, NIL otherwise.\n   @owner bertolo"), list(makeSymbol("CHECK-TYPE"), makeSymbol("OTHER-PASSAGE"), makeSymbol("ABSTRACT-PASSAGE-P")), list(makeSymbol("CLET"), list(list(makeSymbol("SELF-DATE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-PUBLICATION-DATE")))), list(makeSymbol("OTHER-DATE"), list(makeSymbol("FIM"), makeSymbol("OTHER-PASSAGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-PUBLICATION-DATE"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("DATE-P"), makeSymbol("SELF-DATE")), list(makeSymbol("DATE-P"), makeSymbol("OTHER-DATE"))), list(makeSymbol("PIF"), list(makeSymbol("DATE<"), makeSymbol("SELF-DATE"), makeSymbol("OTHER-DATE")), list(makeSymbol("RET"), T), list(makeSymbol("CLET"), list(list(makeSymbol("SELF-DOC-ID"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("DOC-ID"))))), list(makeSymbol("PUNLESS"), makeSymbol("SELF-DOC-ID"), list(makeSymbol("RET"), NIL)), list(makeSymbol("PUNLESS"), list(EQUAL, makeSymbol("SELF-DOC-ID"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER-PASSAGE"), list(makeSymbol("QUOTE"), makeSymbol("DOC-ID")))), list(makeSymbol("RET"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("SELF-SENTENCE-NUM"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("SENTENCE-NUMBER")))), list(makeSymbol("OTHER-SENTENCE-NUM"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER-PASSAGE"), list(makeSymbol("QUOTE"), makeSymbol("SENTENCE-NUMBER"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("SELF-SENTENCE-NUM")), list(makeSymbol("INTEGERP"), makeSymbol("OTHER-SENTENCE-NUM"))), list(makeSymbol("RET"), NIL)), list(makeSymbol("RET"), list(makeSymbol("<"), makeSymbol("SELF-SENTENCE-NUM"), makeSymbol("OTHER-SENTENCE-NUM")))))))));





    public static final SubLSymbol ABSTRACT_PASSAGE_OLDER_METHOD = makeSymbol("ABSTRACT-PASSAGE-OLDER-METHOD");

    public static final SubLList $list38 = list(makeString("@return date-p; the publication date of this passage, or nil if it can't be determined"), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol ABSTRACT_PASSAGE_GET_PUBLICATION_DATE_METHOD = makeSymbol("ABSTRACT-PASSAGE-GET-PUBLICATION-DATE-METHOD");

    public static final SubLSymbol SIMPLE_PASSAGE = makeSymbol("SIMPLE-PASSAGE");

    public static final SubLList $list41 = list(list(makeSymbol("TEXT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")));



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SIMPLE_PASSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SIMPLE-PASSAGE-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SIMPLE_PASSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SIMPLE-PASSAGE-INSTANCE");



    public static final SubLList $list46 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list47 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    public static final SubLList $list48 = list(makeString("Prints PASSAGE to STREAM, ignoring depth"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PRINC"), makeSymbol("TEXT"), makeSymbol("STREAM")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym49$OUTER_CATCH_FOR_SIMPLE_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SIMPLE-PASSAGE-METHOD");

    public static final SubLSymbol SIMPLE_PASSAGE_PRINT_METHOD = makeSymbol("SIMPLE-PASSAGE-PRINT-METHOD");

    public static final SubLList $list51 = list(makeString("@return stringp; the text of this passage"), list(makeSymbol("RET"), makeSymbol("TEXT")));

    public static final SubLSymbol $sym52$OUTER_CATCH_FOR_SIMPLE_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SIMPLE-PASSAGE-METHOD");

    public static final SubLSymbol SIMPLE_PASSAGE_GET_CONTENT_METHOD = makeSymbol("SIMPLE-PASSAGE-GET-CONTENT-METHOD");

    public static final SubLSymbol CORPUS_PASSAGE = makeSymbol("CORPUS-PASSAGE");

    public static final SubLList $list55 = list(list(makeSymbol("CORPUS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TEXT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SCORE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CORPUS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARSE-TREES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("IDENTIFY-ENTITIES"), NIL, makeKeyword("PUBLIC")));



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CORPUS_PASSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CORPUS-PASSAGE-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CORPUS_PASSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CORPUS-PASSAGE-INSTANCE");

    public static final SubLSymbol GET_CORPUS = makeSymbol("GET-CORPUS");

    public static final SubLList $list60 = list(makeString("@return stringp; the symbolical name of the corpus this passage came from"), list(makeSymbol("RET"), makeSymbol("CORPUS")));

    public static final SubLSymbol $sym61$OUTER_CATCH_FOR_CORPUS_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CORPUS-PASSAGE-METHOD");

    public static final SubLSymbol CORPUS_PASSAGE_GET_CORPUS_METHOD = makeSymbol("CORPUS-PASSAGE-GET-CORPUS-METHOD");

    public static final SubLList $list63 = list(makeString("@return svector-p; the word vector corresponding to this passage"), list(makeSymbol("PUNLESS"), makeSymbol("VECTOR"), list(makeSymbol("CSETQ"), makeSymbol("VECTOR"), list(makeSymbol("NEW-STRING-VECTOR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTENT")))))), list(makeSymbol("RET"), makeSymbol("VECTOR")));

    public static final SubLSymbol $sym64$OUTER_CATCH_FOR_ABSTRACT_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ABSTRACT-PASSAGE-METHOD");

    public static final SubLSymbol ABSTRACT_PASSAGE_GET_VECTOR_METHOD = makeSymbol("ABSTRACT-PASSAGE-GET-VECTOR-METHOD");

    public static final SubLSymbol $sym66$OUTER_CATCH_FOR_CORPUS_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CORPUS-PASSAGE-METHOD");

    public static final SubLSymbol CORPUS_PASSAGE_GET_CONTENT_METHOD = makeSymbol("CORPUS-PASSAGE-GET-CONTENT-METHOD");

    public static final SubLSymbol IDENTIFY_ENTITIES = makeSymbol("IDENTIFY-ENTITIES");

    public static final SubLList $list69 = list(makeSymbol("LEXICON"), makeSymbol("&OPTIONAL"), list(makeSymbol("TYPES-TO-IDENTIFY"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("Person")), reader_make_constant_shell(makeString("Place")), reader_make_constant_shell(makeString("Organization"))))));

    public static final SubLList $list70 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("TYPES-TO-IDENTIFY"), makeSymbol("LISTP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("LEXICON"), makeSymbol("ABSTRACT-LEXICON-P")), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(makeSymbol("QUOTE"), makeSymbol("LEARN")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTENT")))), list(makeSymbol("CLET"), list(list(makeSymbol("TAGGER"), list(makeSymbol("GET-TAGGER"))), list(makeSymbol("ENTITIES"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("SENTENCES"), list(makeSymbol("STRING-SENTENCIFY"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTENT")))))), list(makeSymbol("DO-VECTOR"), list(makeSymbol("SENTENCE"), makeSymbol("SENTENCES")), list(makeSymbol("CLET"), list(list(makeSymbol("TAGGED"), list(makeSymbol("TAGGER-TAG-SENTENCE"), makeSymbol("TAGGER"), makeSymbol("SENTENCE"))), list(makeSymbol("LEXIFIED"), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(makeSymbol("QUOTE"), makeSymbol("LEXIFY-SENTENCE")), makeSymbol("TAGGED")))), list(makeSymbol("SENTENCE-DO-WORDS"), list(makeSymbol("WORD"), makeSymbol("LEXIFIED")), list(makeSymbol("CDOLIST"), list(makeSymbol("LEX-ENTRY"), list(makeSymbol("WORD-INFO"), makeSymbol("WORD"))), list(makeSymbol("CLET"), list(list(makeSymbol("DENOT"), list(makeSymbol("FIF"), list(makeSymbol("SEMTRANS-LEXICON-P"), makeSymbol("LEXICON")), list(makeSymbol("EXTRACT-CYCL-FROM-SEMTRANS-LEX-ENTRY"), makeSymbol("LEX-ENTRY")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("DENOT")))), list(makeSymbol("POS-TAGS"), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("PENN-TAGS"))), list(makeSymbol("STRING"), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("STRING")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol(">"), list(makeSymbol("LENGTH"), makeSymbol("STRING")), ONE_INTEGER), list(makeSymbol("INTERSECTION"), makeSymbol("POS-TAGS"), list(makeSymbol("QUOTE"), list(makeKeyword("NNP"), makeKeyword("NNPS"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("TYPE"), makeSymbol("TYPES-TO-IDENTIFY")), list(makeSymbol("PWHEN"), list(makeSymbol("MORE-SPECIFIC-P"), makeSymbol("DENOT"), makeSymbol("TYPE")), list(makeSymbol("PUNLESS"), list(makeSymbol("INDIVIDUAL?"), makeSymbol("DENOT")), list(makeSymbol("CSETQ"), makeSymbol("DENOT"), list(makeSymbol("MAKE-EL-FORMULA"), reader_make_constant_shell(makeString("InstanceNamedFn")), list(makeSymbol("BQ-LIST"), makeSymbol("STRING"), makeSymbol("DENOT"))))), list(makeSymbol("CLET"), list(list(makeSymbol("ENTITY"), list(makeSymbol("NEW-TEXTUAL-FOCUS-ENTITY"), makeSymbol("STRING"), makeSymbol("DENOT")))), list(makeSymbol("FIM"), makeSymbol("ENTITY"), list(makeSymbol("QUOTE"), makeSymbol("ADD-PASSAGE")), makeSymbol("SELF")), list(makeSymbol("CPUSHNEW"), makeSymbol("ENTITY"), makeSymbol("ENTITIES"), list(makeSymbol("QUOTE"), EQUALP)))))))))))), list(makeSymbol("RET"), makeSymbol("ENTITIES"))));

    public static final SubLList $list71 = list(reader_make_constant_shell(makeString("Person")), reader_make_constant_shell(makeString("Place")), reader_make_constant_shell(makeString("Organization")));

















    public static final SubLList $list80 = list(makeKeyword("NNP"), makeKeyword("NNPS"));

    private static final SubLObject $$InstanceNamedFn = reader_make_constant_shell(makeString("InstanceNamedFn"));

    public static final SubLSymbol ADD_PASSAGE = makeSymbol("ADD-PASSAGE");

    public static final SubLSymbol CORPUS_PASSAGE_IDENTIFY_ENTITIES_METHOD = makeSymbol("CORPUS-PASSAGE-IDENTIFY-ENTITIES-METHOD");

    public static final SubLSymbol MAX_INSTANCES = makeSymbol("MAX-INSTANCES");

    public static final SubLList $list85 = list(makeSymbol("PASSAGES"));

    public static final SubLList $list86 = list(makeString("@param PASSAGES listp\n    @return list-p; the highest scoring passages among PASSAGES"), list(makeSymbol("CHECK-TYPE"), makeSymbol("PASSAGES"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("MAX-SCORE"), ZERO_INTEGER), list(makeSymbol("MAX-PASSAGES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("PASSAGE"), makeSymbol("PASSAGES")), list(makeSymbol("PWHEN"), list(makeSymbol(">"), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SCORE"))), makeSymbol("MAX-SCORE")), list(makeSymbol("CSETQ"), makeSymbol("MAX-SCORE"), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SCORE")))))), list(makeSymbol("CDOLIST"), list(makeSymbol("PASSAGE"), makeSymbol("PASSAGES")), list(makeSymbol("PWHEN"), list(makeSymbol("="), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SCORE"))), makeSymbol("MAX-SCORE")), list(makeSymbol("CPUSH"), makeSymbol("PASSAGE"), makeSymbol("MAX-PASSAGES")))), list(makeSymbol("RET"), makeSymbol("MAX-PASSAGES"))));



    public static final SubLSymbol CORPUS_PASSAGE_MAX_INSTANCES_METHOD = makeSymbol("CORPUS-PASSAGE-MAX-INSTANCES-METHOD");

    public static final SubLSymbol GET_PARSE_TREES = makeSymbol("GET-PARSE-TREES");

    public static final SubLList $list90 = list(makeString("@return listp; the list of the parse trees obtained\n  from parsing the sentences of this passage. The passage\n  is broken into sentences by first turning it into a \n  document-p.\n  @owner bertolo"), list(makeSymbol("CLET"), list(list(makeSymbol("DOCUMENT"), list(makeSymbol("NEW-DOCUMENT"), list(makeSymbol("MAKE-STRING-INPUT-STREAM"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTENT")))))), list(makeSymbol("TREES"), NIL)), list(makeSymbol("DOCUMENT-DO-SENTENCES"), list(makeSymbol("SENTENCE"), makeSymbol("DOCUMENT")), list(makeSymbol("CLET"), list(list(makeSymbol("SENT-STRING"), list(makeSymbol("SENTENCE-STRING"), makeSymbol("SENTENCE"))), makeSymbol("PARSE-TREE")), list(makeSymbol("PWHEN"), makeSymbol("SENT-STRING"), list(makeSymbol("CSETQ"), makeSymbol("PARSE-TREE"), list(makeSymbol("FIM"), list(makeSymbol("FCM"), list(makeSymbol("QUOTE"), makeSymbol("CHARNIAK-PARSER")), list(makeSymbol("QUOTE"), makeSymbol("GET-PARSER"))), list(makeSymbol("QUOTE"), makeSymbol("PARSE")), makeSymbol("SENT-STRING"))), list(makeSymbol("PWHEN"), makeSymbol("PARSE-TREE"), list(makeSymbol("CPUSH"), makeSymbol("PARSE-TREE"), makeSymbol("TREES")))))), list(makeSymbol("RET"), makeSymbol("TREES"))));

    public static final SubLSymbol CHARNIAK_PARSER = makeSymbol("CHARNIAK-PARSER");





    public static final SubLSymbol CORPUS_PASSAGE_GET_PARSE_TREES_METHOD = makeSymbol("CORPUS-PASSAGE-GET-PARSE-TREES-METHOD");



    public static final SubLList $list96 = list(list(makeSymbol("ERROR-HANDLING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TIMEOUT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HANDLE-ERROR"), list(makeSymbol("ERROR")), makeKeyword("PROTECTED")));





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_INFORMATION_REQUEST_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INFORMATION-REQUEST-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_INFORMATION_REQUEST_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INFORMATION-REQUEST-INSTANCE");



    public static final SubLList $list102 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("ERROR-HANDLING"), makeKeyword("WARN")), list(makeSymbol("CSETQ"), makeSymbol("TIMEOUT"), makeInteger(720)), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym103$OUTER_CATCH_FOR_INFORMATION_REQUEST_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-INFORMATION-REQUEST-METHOD");



    private static final SubLInteger $int$720 = makeInteger(720);

    public static final SubLSymbol INFORMATION_REQUEST_INITIALIZE_METHOD = makeSymbol("INFORMATION-REQUEST-INITIALIZE-METHOD");

    public static final SubLSymbol KNOWLEDGE_SOURCE_QUERY = makeSymbol("KNOWLEDGE-SOURCE-QUERY");

    public static final SubLList $list108 = list(list(makeSymbol("QUERY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET"), NIL, makeKeyword("PROTECTED")));



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_KNOWLEDGE_SOURCE_QUERY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-KNOWLEDGE-SOURCE-QUERY-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_KNOWLEDGE_SOURCE_QUERY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-KNOWLEDGE-SOURCE-QUERY-INSTANCE");



    public static final SubLList $list113 = list(makeString("@return listp; the list of answers that is the result of executing this query"), list(makeSymbol("CLET"), list(makeSymbol("ANSWERS"), makeSymbol("ERROR"), makeSymbol("TIMEDOUT?")), list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR")), list(makeSymbol("WITH-TIMEOUT"), list(makeSymbol("TIMEOUT"), makeSymbol("TIMEDOUT?")), list(makeSymbol("CSETQ"), makeSymbol("ANSWERS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET"))))), list(makeSymbol("PWHEN"), makeSymbol("TIMEDOUT?"), list(makeSymbol("ERROR"), makeString("Query execution timeout after ~a seconds"), makeSymbol("TIMEOUT")))), list(makeSymbol("PWHEN"), makeSymbol("ERROR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("HANDLE-ERROR")), makeSymbol("ERROR"))), list(makeSymbol("RET"), makeSymbol("ANSWERS"))));

    public static final SubLSymbol $sym114$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-KNOWLEDGE-SOURCE-QUERY-METHOD");



    public static final SubLString $str116$Query_execution_timeout_after__a_ = makeString("Query execution timeout after ~a seconds");



    public static final SubLSymbol KNOWLEDGE_SOURCE_QUERY_ANSWER_METHOD = makeSymbol("KNOWLEDGE-SOURCE-QUERY-ANSWER-METHOD");

    public static final SubLList $list119 = list(makeString("Prints this search engine query to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<QUERY: "), makeSymbol("STREAM")), list(makeSymbol("PRIN1"), makeSymbol("QUERY"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")), list(makeSymbol("TERPRI"), makeSymbol("STREAM")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym120$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-KNOWLEDGE-SOURCE-QUERY-METHOD");

    public static final SubLString $str121$__QUERY__ = makeString("#<QUERY: ");

    public static final SubLString $str122$_ = makeString(">");

    public static final SubLSymbol KNOWLEDGE_SOURCE_QUERY_PRINT_METHOD = makeSymbol("KNOWLEDGE-SOURCE-QUERY-PRINT-METHOD");

    public static final SubLList $list124 = list(makeSymbol("ERROR"));

    public static final SubLList $list125 = list(list(makeSymbol("PCASE"), makeSymbol("ERROR-HANDLING"), list(makeKeyword("THROW"), list(makeSymbol("ERROR"), makeSymbol("ERROR"))), list(makeKeyword("WARN"), list(makeSymbol("WARN"), makeSymbol("ERROR")))));

    public static final SubLSymbol $sym126$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-KNOWLEDGE-SOURCE-QUERY-METHOD");



    public static final SubLSymbol KNOWLEDGE_SOURCE_QUERY_HANDLE_ERROR_METHOD = makeSymbol("KNOWLEDGE-SOURCE-QUERY-HANDLE-ERROR-METHOD");

    public static final SubLString $$$CNSjan2004 = makeString("CNSjan2004");

    public static final SubLSymbol CORPUS_QUERY = makeSymbol("CORPUS-QUERY");

    public static final SubLList $list131 = list(list(makeSymbol("CORPUS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("GET-CORPUS-PATH-MAPPING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CORPUS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CORPUS-PATH"), list(makeSymbol("CORPUS")), makeKeyword("PROTECTED")));

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CORPUS_QUERY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CORPUS-QUERY-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CORPUS_QUERY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CORPUS-QUERY-INSTANCE");

    public static final SubLSymbol GET_CORPUS_PATH_MAPPING = makeSymbol("GET-CORPUS-PATH-MAPPING");

    public static final SubLList $list135 = list(makeString("@return listp; an association list from corpora to physical index or configuration\n   files actually used by the software to access said corpus"), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol CORPUS_QUERY_GET_CORPUS_PATH_MAPPING_METHOD = makeSymbol("CORPUS-QUERY-GET-CORPUS-PATH-MAPPING-METHOD");

    public static final SubLList $list137 = list(makeString("@return stringp; the corpus of this query"), list(makeSymbol("RET"), makeSymbol("CORPUS")));

    public static final SubLSymbol $sym138$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CORPUS-QUERY-METHOD");

    public static final SubLSymbol CORPUS_QUERY_GET_CORPUS_METHOD = makeSymbol("CORPUS-QUERY-GET-CORPUS-METHOD");

    public static final SubLSymbol GET_CORPUS_PATH = makeSymbol("GET-CORPUS-PATH");

    public static final SubLList $list141 = list(makeString("@return stringp; the specific index or config file used for CORPUS by this query"), list(makeSymbol("RET"), list(makeSymbol("CDR"), list(makeSymbol("ASSOC"), makeSymbol("CORPUS"), list(makeSymbol("FCM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CORPUS-PATH-MAPPING"))), list(makeSymbol("QUOTE"), EQUALP)))));

    public static final SubLSymbol $sym142$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CORPUS-QUERY-METHOD");

    public static final SubLSymbol CORPUS_QUERY_GET_CORPUS_PATH_METHOD = makeSymbol("CORPUS-QUERY-GET-CORPUS-PATH-METHOD");

    public static final SubLList $list144 = list(new SubLObject[]{ makeString("Prints this search engine query to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<QUERY("), makeSymbol("STREAM")), list(makeSymbol("PRINC"), makeSymbol("CORPUS"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString("): "), makeSymbol("STREAM")), list(makeSymbol("PRIN1"), makeSymbol("QUERY"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")), list(makeSymbol("TERPRI"), makeSymbol("STREAM")), list(makeSymbol("RET"), makeSymbol("SELF")) });

    public static final SubLSymbol $sym145$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CORPUS-QUERY-METHOD");

    public static final SubLString $str146$__QUERY_ = makeString("#<QUERY(");

    public static final SubLString $str147$___ = makeString("): ");

    public static final SubLSymbol CORPUS_QUERY_PRINT_METHOD = makeSymbol("CORPUS-QUERY-PRINT-METHOD");

    public static final SubLSymbol GLIMPSE_QUERY = makeSymbol("GLIMPSE-QUERY");

    public static final SubLList $list150 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET"), NIL, makeKeyword("PRIVATE")));

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_QUERY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GLIMPSE-QUERY-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_QUERY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GLIMPSE-QUERY-INSTANCE");

    public static final SubLString $str153$Non_supported_corpus__a = makeString("Non supported corpus ~a");

    public static final SubLList $list154 = list(makeString("@return listp; an association list from corpora to physical index or configuration\n   files actually used by the software to access said corpus"), list(makeSymbol("RET"), list(makeSymbol("QUOTE"), list(cons(makeString("AQUAINT"), makeString("/home/elmore0/scratch/quirk/corpora/trec-10.glimpse-small")), cons(makeString("CNS"), makeString("/cyc/projects/aquaint/CNS/MITRE-cleanup/cns_glimpse.glimpse-small")), cons(makeString("CNSjan2004"), makeString("/home/elmore0/scratch/corpora/CNSjan2004glimpse/CNSjan2004trec.glimpse-small"))))));

    public static final SubLList $list155 = list(cons(makeString("AQUAINT"), makeString("/home/elmore0/scratch/quirk/corpora/trec-10.glimpse-small")), cons(makeString("CNS"), makeString("/cyc/projects/aquaint/CNS/MITRE-cleanup/cns_glimpse.glimpse-small")), cons(makeString("CNSjan2004"), makeString("/home/elmore0/scratch/corpora/CNSjan2004glimpse/CNSjan2004trec.glimpse-small")));

    public static final SubLSymbol GLIMPSE_QUERY_GET_CORPUS_PATH_MAPPING_METHOD = makeSymbol("GLIMPSE-QUERY-GET-CORPUS-PATH-MAPPING-METHOD");

    public static final SubLList $list157 = list(makeKeyword("PRIVATE"));

    public static final SubLList $list158 = list(makeString("@param QUERY stringpe\n   @return listp; a ranked list @xref corpus-passages matching QUERY"), list(makeSymbol("CLET"), list(list(makeSymbol("PASSAGES"), NIL), list(makeSymbol("ANSWERS"), list(makeSymbol("ASK-GLIMPSE"), makeSymbol("QUERY"), list(makeSymbol("BQ-CONS"), list(makeSymbol("BQ-LIST"), makeString("index"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CORPUS-PATH")))), list(makeSymbol("QUOTE"), list(list(makeString("limit"), makeString("100:100")))))))), list(makeSymbol("CDOLIST"), list(makeSymbol("ANSWER"), makeSymbol("ANSWERS")), list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("&KEY"), makeSymbol("FILE"), makeSymbol("ARTICLE"), makeSymbol("LINE"), makeSymbol("TEXT"), makeSymbol("&ALLOW-OTHER-KEYS")), makeSymbol("ANSWER"), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-GLIMPSE-PASSAGE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CORPUS"))), makeSymbol("FILE"), makeSymbol("ARTICLE"), makeSymbol("LINE"), makeSymbol("TEXT")), makeSymbol("PASSAGES")))), list(makeSymbol("RET"), list(makeSymbol("REMOVE-DUPLICATES"), makeSymbol("PASSAGES"), list(makeSymbol("FUNCTION"), makeSymbol("PASSAGE-EQUAL"))))));

    public static final SubLSymbol $sym159$OUTER_CATCH_FOR_GLIMPSE_QUERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GLIMPSE-QUERY-METHOD");

    public static final SubLString $$$index = makeString("index");

    public static final SubLList $list161 = list(list(makeString("limit"), makeString("100:100")));









    public static final SubLSymbol PASSAGE_EQUAL = makeSymbol("PASSAGE-EQUAL");

    public static final SubLSymbol GLIMPSE_QUERY_GET_METHOD = makeSymbol("GLIMPSE-QUERY-GET-METHOD");

    public static final SubLString $str168$_glimpse_cgi = makeString("/glimpse.cgi");



    public static final SubLString $$$query = makeString("query");

    public static final SubLSymbol GLIMPSE_PASSAGE = makeSymbol("GLIMPSE-PASSAGE");

    public static final SubLList $list172 = list(list(makeSymbol("FILE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("ARTICLE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("LINE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PUBLICATION-DATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SOURCE"), NIL, makeKeyword("PUBLIC")));



    public static final SubLSymbol ARTICLE = makeSymbol("ARTICLE");



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_PASSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GLIMPSE-PASSAGE-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_PASSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GLIMPSE-PASSAGE-INSTANCE");







    public static final SubLList $list181 = list(makeString("Prints this glimpse passage to STREM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PRINC"), list(makeSymbol("GET-SOURCE"), makeSymbol("SELF")), makeSymbol("STREAM")), list(makeSymbol("TERPRI"), makeSymbol("STREAM")), list(makeSymbol("PWHEN"), makeSymbol("TEXT"), list(makeSymbol("PRINC"), makeSymbol("TEXT"), makeSymbol("STREAM"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym182$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GLIMPSE-PASSAGE-METHOD");

    public static final SubLSymbol GLIMPSE_PASSAGE_PRINT_METHOD = makeSymbol("GLIMPSE-PASSAGE-PRINT-METHOD");

    public static final SubLList $list184 = list(makeString("@return date-p; the publication date of this passage, or nil if it can't be determined"), list(makeSymbol("PWHEN"), list(makeSymbol(">"), list(makeSymbol("LENGTH"), makeSymbol("FILE")), EIGHT_INTEGER), list(makeSymbol("CLET"), list(list(makeSymbol("YEAR"), list(makeSymbol("READ-FROM-STRING"), list(makeSymbol("SUBSTRING"), makeSymbol("FILE"), ZERO_INTEGER, FOUR_INTEGER))), list(makeSymbol("MONTH"), list(makeSymbol("READ-FROM-STRING"), list(makeSymbol("SUBSTRING"), makeSymbol("FILE"), FOUR_INTEGER, SIX_INTEGER))), list(makeSymbol("DAY"), list(makeSymbol("READ-FROM-STRING"), list(makeSymbol("SUBSTRING"), makeSymbol("FILE"), SIX_INTEGER, EIGHT_INTEGER)))), list(makeSymbol("RET"), list(makeSymbol("CONSTRUCT-REDUCED-CYCL-DATE"), NIL, NIL, NIL, makeSymbol("DAY"), makeSymbol("MONTH"), makeSymbol("YEAR"))))));

    public static final SubLSymbol $sym185$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GLIMPSE-PASSAGE-METHOD");

    public static final SubLSymbol GLIMPSE_PASSAGE_GET_PUBLICATION_DATE_METHOD = makeSymbol("GLIMPSE-PASSAGE-GET-PUBLICATION-DATE-METHOD");

    public static final SubLList $list187 = list(makeString("@return stringp; the location of this passage"), list(makeSymbol("RET"), list(makeSymbol("FORMAT"), NIL, makeString("~&Corpus: ~a;~%File: ~a;~%Article: ~a;~%Line: ~a"), makeSymbol("CORPUS"), makeSymbol("FILE"), makeSymbol("ARTICLE"), makeSymbol("LINE"))));

    public static final SubLSymbol $sym188$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GLIMPSE-PASSAGE-METHOD");

    public static final SubLString $str189$__Corpus___a___File___a___Article = makeString("~&Corpus: ~a;~%File: ~a;~%Article: ~a;~%Line: ~a");

    public static final SubLSymbol GLIMPSE_PASSAGE_GET_SOURCE_METHOD = makeSymbol("GLIMPSE-PASSAGE-GET-SOURCE-METHOD");

    public static final SubLSymbol GURUQA_QUERY = makeSymbol("GURUQA-QUERY");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GURUQA_QUERY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GURUQA-QUERY-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GURUQA_QUERY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GURUQA-QUERY-INSTANCE");

    public static final SubLList $list194 = list(makeString("@param QUERY stringp\n   @return listp; a ranked list @xref corpus-passages matching QUERY"), list(makeSymbol("CLET"), list(list(makeSymbol("INDICES"), list(makeSymbol("GURUQA-ANSWER-INDEXES"), makeSymbol("QUERY"))), makeSymbol("PASSAGES")), list(makeSymbol("CDOLIST"), list(makeSymbol("INDEX"), makeSymbol("INDICES")), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-GURUQA-PASSAGE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CORPUS"))), list(makeSymbol("GETF"), makeSymbol("INDEX"), makeKeyword("DOC")), list(makeSymbol("GETF"), makeSymbol("INDEX"), makeKeyword("SENT")), list(makeSymbol("GETF"), makeSymbol("INDEX"), makeKeyword("LEN")), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ERROR-HANDLING")))), makeSymbol("PASSAGES"))), list(makeSymbol("RET"), list(makeSymbol("NREVERSE"), makeSymbol("PASSAGES")))));

    public static final SubLSymbol $sym195$OUTER_CATCH_FOR_GURUQA_QUERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GURUQA-QUERY-METHOD");







    public static final SubLSymbol GURUQA_QUERY_GET_METHOD = makeSymbol("GURUQA-QUERY-GET-METHOD");

    public static final SubLSymbol GURUQA_PASSAGE = makeSymbol("GURUQA-PASSAGE");

    public static final SubLList $list201 = list(list(makeSymbol("DOCUMENT-ID"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("SENTENCE-ID"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("SPAN"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("ERROR-HANDLING"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HANDLE-ERROR"), list(makeSymbol("ERROR")), makeKeyword("PRIVATE")));





    public static final SubLSymbol DOCUMENT_ID = makeSymbol("DOCUMENT-ID");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GURUQA_PASSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GURUQA-PASSAGE-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GURUQA_PASSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GURUQA-PASSAGE-INSTANCE");



    public static final SubLList $list208 = list(makeKeyword("THROW"), makeKeyword("WARN"), makeKeyword("IGNORE"));

    public static final SubLString $str209$Invalid_error_handling_tag = makeString("Invalid error-handling tag");

    public static final SubLList $list210 = list(makeString("Prints this guruqa passage to STREAM, ignoring depth"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PRINC"), list(makeSymbol("GET-SOURCE"), makeSymbol("SELF")), makeSymbol("STREAM")), list(makeSymbol("TERPRI"), makeSymbol("STREAM")), list(makeSymbol("PWHEN"), makeSymbol("TEXT"), list(makeSymbol("PRINC"), makeSymbol("TEXT"), makeSymbol("STREAM"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym211$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GURUQA-PASSAGE-METHOD");

    public static final SubLSymbol GURUQA_PASSAGE_PRINT_METHOD = makeSymbol("GURUQA-PASSAGE-PRINT-METHOD");

    public static final SubLList $list213 = list(makeString("@return stringp; the location of this passage"), list(makeSymbol("RET"), list(makeSymbol("FORMAT"), NIL, makeString("Corpus: ~a; Document: ~a; Sentence: ~a; Span: ~a"), makeSymbol("CORPUS"), makeSymbol("DOCUMENT-ID"), makeSymbol("SENTENCE-ID"), makeSymbol("SPAN"))));

    public static final SubLSymbol $sym214$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GURUQA-PASSAGE-METHOD");

    public static final SubLString $str215$Corpus___a__Document___a__Sentenc = makeString("Corpus: ~a; Document: ~a; Sentence: ~a; Span: ~a");

    public static final SubLSymbol GURUQA_PASSAGE_GET_SOURCE_METHOD = makeSymbol("GURUQA-PASSAGE-GET-SOURCE-METHOD");

    public static final SubLList $list217 = list(makeString("@return stringp; the text of this passage"), list(makeSymbol("PUNLESS"), makeSymbol("TEXT"), list(makeSymbol("CLET"), list(makeSymbol("ERROR")), list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR")), list(makeSymbol("CSETQ"), makeSymbol("TEXT"), list(makeSymbol("GURUQA-RETRIEVE-PASSAGE"), makeSymbol("DOCUMENT-ID"), makeSymbol("SENTENCE-ID"), makeSymbol("SPAN")))), list(makeSymbol("PWHEN"), makeSymbol("ERROR"), list(makeSymbol("HANDLE-ERROR"), makeSymbol("SELF"), makeSymbol("ERROR"))))), list(makeSymbol("RET"), makeSymbol("TEXT")));

    public static final SubLSymbol $sym218$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GURUQA-PASSAGE-METHOD");

    public static final SubLSymbol GURUQA_PASSAGE_GET_CONTENT_METHOD = makeSymbol("GURUQA-PASSAGE-GET-CONTENT-METHOD");

    public static final SubLSymbol $sym220$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GURUQA-PASSAGE-METHOD");

    public static final SubLSymbol GURUQA_PASSAGE_HANDLE_ERROR_METHOD = makeSymbol("GURUQA-PASSAGE-HANDLE-ERROR-METHOD");

    public static final SubLSymbol LEMUR_QUERY = makeSymbol("LEMUR-QUERY");

    public static final SubLList $list223 = list(list(makeSymbol("DOCNO"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SENTNO"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("GET-CORPUS-PATH-MAPPING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET"), NIL, makeKeyword("PRIVATE")));

    public static final SubLSymbol SENTNO = makeSymbol("SENTNO");



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LEMUR_QUERY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LEMUR-QUERY-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LEMUR_QUERY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LEMUR-QUERY-INSTANCE");

    private static final SubLInteger $int$50 = makeInteger(50);



    public static final SubLList $list230 = list(makeString("@return listp; an association list from corpora to physical index or configuration\n   files actually used by the software to access said corpus"), list(makeSymbol("RET"), list(makeSymbol("QUOTE"), list(cons(makeString("AQUAINT"), makeString("/cyc/projects/aquaint/lemur-indices/AQUAINT/simple_kl_dir_param")), cons(makeString("CNS"), makeString("/cyc/projects/aquaint/lemur-indices/CNS/simple_kl_dir_param")), cons(makeString("XCNS"), makeString("/cyc/projects/aquaint/lemur-indices/XCNS/simple_kl_dir_param")), cons(makeString("WIKIPEDIA"), makeString("/cyc/projects/aquaint/lemur-indices/Wikipedia2/simple_kl_dir_param")), cons(makeString("CNSjan2004"), makeString("/cyc/projects/aquaint/lemur-indices/CNSjan2004/simple_kl_dir_param"))))));

    public static final SubLList $list231 = list(cons(makeString("AQUAINT"), makeString("/cyc/projects/aquaint/lemur-indices/AQUAINT/simple_kl_dir_param")), cons(makeString("CNS"), makeString("/cyc/projects/aquaint/lemur-indices/CNS/simple_kl_dir_param")), cons(makeString("XCNS"), makeString("/cyc/projects/aquaint/lemur-indices/XCNS/simple_kl_dir_param")), cons(makeString("WIKIPEDIA"), makeString("/cyc/projects/aquaint/lemur-indices/Wikipedia2/simple_kl_dir_param")), cons(makeString("CNSjan2004"), makeString("/cyc/projects/aquaint/lemur-indices/CNSjan2004/simple_kl_dir_param")));

    public static final SubLSymbol LEMUR_QUERY_GET_CORPUS_PATH_MAPPING_METHOD = makeSymbol("LEMUR-QUERY-GET-CORPUS-PATH-MAPPING-METHOD");

    public static final SubLList $list233 = list(makeString("@param QUERY stringp\n   @return listp; a ranked list @xref corpus-passages matching QUERY"), list(makeSymbol("CLET"), list(list(makeSymbol("PASSAGES"), NIL), list(makeSymbol("ANSWERS"), list(makeSymbol("ASK-LEMUR"), makeSymbol("QUERY"), makeSymbol("DOCNO"), makeSymbol("SENTNO"), ONE_INTEGER, list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CORPUS-PATH")))))), list(makeSymbol("CDOLIST"), list(makeSymbol("ANSWER"), makeSymbol("ANSWERS")), list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("ID"), makeSymbol("SCORE"), makeSymbol("TEXT")), makeSymbol("ANSWER"), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-LEMUR-PASSAGE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CORPUS"))), makeSymbol("ID"), makeSymbol("SCORE"), list(makeSymbol("STRIP-PASSAGE-HEADER"), makeSymbol("TEXT"))), makeSymbol("PASSAGES")))), list(makeSymbol("RET"), list(makeSymbol("NREVERSE"), list(makeSymbol("REMOVE-DUPLICATES"), makeSymbol("PASSAGES"), list(makeSymbol("FUNCTION"), makeSymbol("PASSAGE-EQUAL")))))));

    public static final SubLSymbol $sym234$OUTER_CATCH_FOR_LEMUR_QUERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LEMUR-QUERY-METHOD");

    public static final SubLList $list235 = list(makeSymbol("ID"), makeSymbol("SCORE"), makeSymbol("TEXT"));

    public static final SubLSymbol LEMUR_QUERY_GET_METHOD = makeSymbol("LEMUR-QUERY-GET-METHOD");

    public static final SubLString $str237$_cyc_projects_aquaint_lemur_indic = makeString("/cyc/projects/aquaint/lemur-indices/AQUAINT/simple_kl_dir_param");

    public static final SubLString $str238$_lemur_cgi = makeString("/lemur.cgi");

    public static final SubLString $$$n = makeString("n");

    public static final SubLString $$$N = makeString("N");

    public static final SubLString $$$l = makeString("l");

    public static final SubLString $$$p = makeString("p");

    public static final SubLSymbol LEMUR_PASSAGE = makeSymbol("LEMUR-PASSAGE");

    public static final SubLList $list244 = list(list(makeSymbol("DOC-ID"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SENTENCE-NUMBER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SCORE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PUBLICATION-DATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SCORE"), NIL, makeKeyword("PUBLIC")));



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LEMUR_PASSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LEMUR-PASSAGE-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LEMUR_PASSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LEMUR-PASSAGE-INSTANCE");

    public static final SubLList $list248 = list(CHAR_period);

    public static final SubLList $list249 = list(makeString("Prints this lemur passage to STREM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PRINC"), list(makeSymbol("GET-SOURCE"), makeSymbol("SELF")), makeSymbol("STREAM")), list(makeSymbol("TERPRI"), makeSymbol("STREAM")), list(makeSymbol("PRINC"), makeSymbol("TEXT"), makeSymbol("STREAM")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym250$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LEMUR-PASSAGE-METHOD");

    public static final SubLSymbol LEMUR_PASSAGE_PRINT_METHOD = makeSymbol("LEMUR-PASSAGE-PRINT-METHOD");

    public static final SubLList $list252 = list(makeString("@return stringp; the location of this passage"), list(makeSymbol("RET"), list(makeSymbol("FORMAT"), NIL, makeString("~&Corpus: ~a; Source: ~a; Sentence ~a Score: ~a"), makeSymbol("CORPUS"), makeSymbol("DOC-ID"), makeSymbol("SENTENCE-NUMBER"), makeSymbol("SCORE"))));

    public static final SubLSymbol $sym253$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LEMUR-PASSAGE-METHOD");

    public static final SubLString $str254$__Corpus___a__Source___a__Sentenc = makeString("~&Corpus: ~a; Source: ~a; Sentence ~a Score: ~a");

    public static final SubLSymbol LEMUR_PASSAGE_GET_SOURCE_METHOD = makeSymbol("LEMUR-PASSAGE-GET-SOURCE-METHOD");

    public static final SubLList $list256 = list(makeString("@return date-p; the publication date of this passage, or nil if it can't be determined"), list(makeSymbol("PWHEN"), list(makeSymbol(">"), list(makeSymbol("LENGTH"), makeSymbol("DOC-ID")), ELEVEN_INTEGER), list(makeSymbol("CLET"), list(list(makeSymbol("YEAR"), list(makeSymbol("READ-FROM-STRING"), list(makeSymbol("SUBSTRING"), makeSymbol("DOC-ID"), THREE_INTEGER, SEVEN_INTEGER))), list(makeSymbol("MONTH"), list(makeSymbol("READ-FROM-STRING"), list(makeSymbol("SUBSTRING"), makeSymbol("DOC-ID"), SEVEN_INTEGER, NINE_INTEGER))), list(makeSymbol("DAY"), list(makeSymbol("READ-FROM-STRING"), list(makeSymbol("SUBSTRING"), makeSymbol("DOC-ID"), NINE_INTEGER, ELEVEN_INTEGER)))), list(makeSymbol("RET"), list(makeSymbol("CONSTRUCT-REDUCED-CYCL-DATE"), NIL, NIL, NIL, makeSymbol("DAY"), makeSymbol("MONTH"), makeSymbol("YEAR"))))));

    public static final SubLSymbol $sym257$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LEMUR-PASSAGE-METHOD");

    public static final SubLSymbol LEMUR_PASSAGE_GET_PUBLICATION_DATE_METHOD = makeSymbol("LEMUR-PASSAGE-GET-PUBLICATION-DATE-METHOD");

    public static final SubLList $list259 = list(makeString("@return numberp; the score of this passage"), list(makeSymbol("RET"), makeSymbol("SCORE")));

    public static final SubLSymbol $sym260$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LEMUR-PASSAGE-METHOD");

    public static final SubLSymbol LEMUR_PASSAGE_GET_SCORE_METHOD = makeSymbol("LEMUR-PASSAGE-GET-SCORE-METHOD");

    public static final SubLSymbol QAGA_QUERY = makeSymbol("QAGA-QUERY");

    public static final SubLList $list263 = list(list(makeSymbol("AUGMENTATION-TERMS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-AUGMENTATION-TERMS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET"), NIL, makeKeyword("PRIVATE")));



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_QAGA_QUERY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QAGA-QUERY-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_QAGA_QUERY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QAGA-QUERY-INSTANCE");

    public static final SubLList $list267 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PASSAGES"), NIL), list(makeSymbol("ANSWERS"), list(makeSymbol("ASK-QAGA"), list(makeSymbol("SPLIT-STRING"), makeSymbol("QUERY"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("ANSWER"), makeSymbol("ANSWERS")), list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("&KEY"), makeSymbol("TEXT"), makeSymbol("DOCID"), makeSymbol("SCORE"), makeSymbol("AUGMENT"), makeSymbol("&ALLOW-OTHER-KEYS")), makeSymbol("ANSWER"), list(makeSymbol("CSETQ"), makeSymbol("AUGMENTATION-TERMS"), makeSymbol("AUGMENT")), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-LEMUR-PASSAGE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CORPUS"))), makeSymbol("DOCID"), makeSymbol("SCORE"), makeSymbol("TEXT")), makeSymbol("PASSAGES")))), list(makeSymbol("RET"), list(makeSymbol("NREVERSE"), list(makeSymbol("REMOVE-DUPLICATES"), makeSymbol("PASSAGES"), list(makeSymbol("FUNCTION"), makeSymbol("PASSAGE-EQUAL")))))));

    public static final SubLSymbol $sym268$OUTER_CATCH_FOR_QAGA_QUERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QAGA-QUERY-METHOD");







    public static final SubLSymbol QAGA_QUERY_GET_METHOD = makeSymbol("QAGA-QUERY-GET-METHOD");

    public static final SubLSymbol GET_AUGMENTATION_TERMS = makeSymbol("GET-AUGMENTATION-TERMS");

    public static final SubLList $list274 = list(list(makeSymbol("RET"), makeSymbol("AUGMENTATION-TERMS")));

    public static final SubLSymbol $sym275$OUTER_CATCH_FOR_QAGA_QUERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QAGA-QUERY-METHOD");

    public static final SubLSymbol QAGA_QUERY_GET_AUGMENTATION_TERMS_METHOD = makeSymbol("QAGA-QUERY-GET-AUGMENTATION-TERMS-METHOD");

    public static final SubLString $$$WWW = makeString("WWW");

    public static final SubLSymbol GOOGLE_QUERY = makeSymbol("GOOGLE-QUERY");

    public static final SubLList $list279 = list(list(makeSymbol("DOCNO"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("START"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("GOOGLE-KEY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SPELLING"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET"), NIL, makeKeyword("PRIVATE")));

    public static final SubLSymbol GOOGLE_KEY = makeSymbol("GOOGLE-KEY");



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GOOGLE_QUERY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GOOGLE-QUERY-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GOOGLE_QUERY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GOOGLE-QUERY-INSTANCE");

    public static final SubLList $list284 = list(makeString("@return listp; a ranked list @xref google-passages matching QUERY"), list(makeSymbol("RET"), list(makeSymbol("FIM"), list(makeSymbol("GET-GOOGLE-CLIENT"), makeSymbol("GOOGLE-KEY")), list(makeSymbol("QUOTE"), makeSymbol("SEARCH")), makeSymbol("QUERY"), makeSymbol("START"), makeSymbol("DOCNO"))));

    public static final SubLSymbol $sym285$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-QUERY-METHOD");



    public static final SubLSymbol GOOGLE_QUERY_GET_METHOD = makeSymbol("GOOGLE-QUERY-GET-METHOD");



    public static final SubLList $list289 = list(makeString("@return integerp; the number of hits for QUERY"), list(makeSymbol("RET"), list(makeSymbol("FIM"), list(makeSymbol("GET-GOOGLE-CLIENT"), makeSymbol("GOOGLE-KEY")), list(makeSymbol("QUOTE"), makeSymbol("COUNT")), makeSymbol("QUERY"))));

    public static final SubLSymbol $sym290$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-QUERY-METHOD");

    public static final SubLSymbol GOOGLE_QUERY_COUNT_METHOD = makeSymbol("GOOGLE-QUERY-COUNT-METHOD");



    public static final SubLList $list293 = list(makeString("@return boolean; the server is assumed to be shut down"), list(makeSymbol("FIM"), list(makeSymbol("GET-GOOGLE-CLIENT"), makeSymbol("GOOGLE-KEY")), list(makeSymbol("QUOTE"), makeSymbol("QUIT"))), list(makeSymbol("RET"), T));

    public static final SubLSymbol $sym294$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-QUERY-METHOD");

    public static final SubLSymbol GOOGLE_QUERY_QUIT_METHOD = makeSymbol("GOOGLE-QUERY-QUIT-METHOD");

    public static final SubLSymbol SPELLING = makeSymbol("SPELLING");

    public static final SubLList $list297 = list(makeString("@return boolean; the server is assumed to be shut down"), list(makeSymbol("RET"), list(makeSymbol("FIM"), list(makeSymbol("GET-GOOGLE-CLIENT"), makeSymbol("GOOGLE-KEY")), list(makeSymbol("QUOTE"), makeSymbol("SPELLING")), makeSymbol("QUERY"))));

    public static final SubLSymbol $sym298$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-QUERY-METHOD");

    public static final SubLSymbol GOOGLE_QUERY_SPELLING_METHOD = makeSymbol("GOOGLE-QUERY-SPELLING-METHOD");



    public static final SubLList $list301 = list(makeString("@return stringp; the server sends back various information"), list(makeSymbol("RET"), list(makeSymbol("FIM"), list(makeSymbol("GET-GOOGLE-CLIENT"), makeSymbol("GOOGLE-KEY")), list(makeSymbol("QUOTE"), makeSymbol("VERSION")))));

    public static final SubLSymbol $sym302$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-QUERY-METHOD");

    public static final SubLSymbol GOOGLE_QUERY_VERSION_METHOD = makeSymbol("GOOGLE-QUERY-VERSION-METHOD");

    public static final SubLList $list304 = list(makeString("application.cyc-ir.google.client-key-file"));

    public static final SubLSymbol $google_client_key_file$ = makeSymbol("*GOOGLE-CLIENT-KEY-FILE*");

    public static final SubLString $str306$data_googlekey_txt = makeString("data/googlekey.txt");



    public static final SubLList $list308 = list(makeString("application.cyc-ir.google.client-host"));

    public static final SubLSymbol $google_client_host$ = makeSymbol("*GOOGLE-CLIENT-HOST*");

    public static final SubLString $str310$googleserver_cyc_com = makeString("googleserver.cyc.com");

    public static final SubLList $list311 = list(makeString("application.cyc-ir.google.client-port"));

    public static final SubLSymbol $google_client_port$ = makeSymbol("*GOOGLE-CLIENT-PORT*");

    private static final SubLInteger $int$6667 = makeInteger(6667);





    private static final SubLSymbol $IF_DOES_NOT_EXIST = makeKeyword("IF-DOES-NOT-EXIST");



    public static final SubLSymbol GOOGLE_CLIENT = makeSymbol("GOOGLE-CLIENT");

    public static final SubLSymbol SET_HOST = makeSymbol("SET-HOST");

    public static final SubLSymbol SET_PORT = makeSymbol("SET-PORT");

    public static final SubLSymbol SET_CLIENT_KEY = makeSymbol("SET-CLIENT-KEY");

    public static final SubLSymbol TCP_CLIENT = makeSymbol("TCP-CLIENT");

    public static final SubLList $list323 = list(new SubLObject[]{ list(makeSymbol("CLIENT-KEY"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("CLIENT-INTERACTION"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CLIENT-KEY"), list(makeSymbol("CLIENT-KEY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DOCNO"), list(makeSymbol("DOC-NUMBER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SEARCH"), list(makeSymbol("DIRECTIVE-ARG"), makeSymbol("&OPTIONAL"), list(makeSymbol("START"), ONE_INTEGER), list(makeSymbol("HITS"), TEN_INTEGER)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COUNT"), list(makeSymbol("DIRECTIVE-ARG")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SPELLING"), list(makeSymbol("DIRECTIVE-ARG")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("QUIT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VERSION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GOOGLE-REQUEST"), list(makeSymbol("DIRECTIVE"), makeSymbol("DIRECTIVE-ARG")), makeKeyword("PRIVATE")) });





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GOOGLE-CLIENT-CLASS");





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GOOGLE-CLIENT-INSTANCE");

    public static final SubLList $list330 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol GOOGLE_CLIENT_INITIALIZE_METHOD = makeSymbol("GOOGLE-CLIENT-INITIALIZE-METHOD");

    public static final SubLList $list332 = list(makeSymbol("KEY"));

    public static final SubLList $list333 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("KEY"), makeSymbol("STRINGP")), list(makeSymbol("CSETQ"), makeSymbol("CLIENT-KEY"), makeSymbol("KEY")), list(makeSymbol("RET"), makeSymbol("KEY")));

    public static final SubLSymbol $sym334$OUTER_CATCH_FOR_GOOGLE_CLIENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-CLIENT-METHOD");

    public static final SubLSymbol GOOGLE_CLIENT_SET_CLIENT_KEY_METHOD = makeSymbol("GOOGLE-CLIENT-SET-CLIENT-KEY-METHOD");

    public static final SubLList $list336 = list(makeKeyword("PUBLIC"), makeKeyword("AUTO-UPDATE"));

    public static final SubLList $list337 = list(makeSymbol("DIRECTIVE-ARG"), makeSymbol("&OPTIONAL"), list(makeSymbol("START"), ONE_INTEGER), list(makeSymbol("HITS"), TEN_INTEGER));

    public static final SubLList $list338 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("DIRECTIVE-ARG"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("START"), makeSymbol("NON-NEGATIVE-INTEGER-P")), list(makeSymbol("CHECK-TYPE"), makeSymbol("HITS"), makeSymbol("NON-NEGATIVE-INTEGER-P")), list(makeSymbol("CSETQ"), makeSymbol("CLIENT-INTERACTION"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("BUILD-BASIC-GOOGLE-REQUEST")), makeString("search"), makeSymbol("DIRECTIVE-ARG"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CLIENT-INTERACTION"), list(makeSymbol("QUOTE"), makeSymbol("SET-DOCNO")), makeSymbol("HITS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CLIENT-INTERACTION"), list(makeSymbol("QUOTE"), makeSymbol("SET-START")), makeSymbol("START")), list(makeSymbol("RET"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-ANSWER-FROM-REQUEST")))));

    public static final SubLSymbol BUILD_BASIC_GOOGLE_REQUEST = makeSymbol("BUILD-BASIC-GOOGLE-REQUEST");

    public static final SubLString $$$search = makeString("search");

    public static final SubLSymbol SET_DOCNO = makeSymbol("SET-DOCNO");

    public static final SubLSymbol SET_START = makeSymbol("SET-START");

    public static final SubLSymbol GET_ANSWER_FROM_REQUEST = makeSymbol("GET-ANSWER-FROM-REQUEST");

    public static final SubLSymbol GOOGLE_CLIENT_SEARCH_METHOD = makeSymbol("GOOGLE-CLIENT-SEARCH-METHOD");

    public static final SubLList $list345 = list(makeSymbol("DIRECTIVE-ARG"));

    public static final SubLList $list346 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("DIRECTIVE-ARG"), makeSymbol("STRINGP")), list(makeSymbol("RET"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GOOGLE-REQUEST")), makeString("count"), makeSymbol("DIRECTIVE-ARG"))));

    public static final SubLSymbol GOOGLE_REQUEST = makeSymbol("GOOGLE-REQUEST");

    public static final SubLString $$$count = makeString("count");

    public static final SubLSymbol GOOGLE_CLIENT_COUNT_METHOD = makeSymbol("GOOGLE-CLIENT-COUNT-METHOD");

    public static final SubLList $list350 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("DIRECTIVE-ARG"), makeSymbol("STRINGP")), list(makeSymbol("RET"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GOOGLE-REQUEST")), makeString("spell"), makeSymbol("DIRECTIVE-ARG"))));

    public static final SubLString $$$spell = makeString("spell");

    public static final SubLSymbol GOOGLE_CLIENT_SPELLING_METHOD = makeSymbol("GOOGLE-CLIENT-SPELLING-METHOD");

    public static final SubLList $list353 = list(list(makeSymbol("RET"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GOOGLE-REQUEST")), makeString("$quit$"), makeString(""))));

    public static final SubLString $str354$_quit_ = makeString("$quit$");

    public static final SubLString $str355$ = makeString("");

    public static final SubLSymbol GOOGLE_CLIENT_QUIT_METHOD = makeSymbol("GOOGLE-CLIENT-QUIT-METHOD");

    public static final SubLList $list357 = list(list(makeSymbol("RET"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GOOGLE-REQUEST")), makeString("version"), makeString(""))));

    public static final SubLString $$$version = makeString("version");

    public static final SubLSymbol GOOGLE_CLIENT_VERSION_METHOD = makeSymbol("GOOGLE-CLIENT-VERSION-METHOD");

    public static final SubLList $list360 = list(makeKeyword("AUTO-UPDATE"), makeKeyword("PRIVATE"));

    public static final SubLList $list361 = list(makeSymbol("DIRECTIVE"), makeSymbol("DIRECTIVE-ARG"));

    public static final SubLList $list362 = list(list(makeSymbol("CLET"), list(list(makeSymbol("REQUEST"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("GOOGLE-CLIENT-INTERACTION"))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("REQUEST"), list(makeSymbol("QUOTE"), makeSymbol("SET-KEY")), makeSymbol("CLIENT-KEY")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("REQUEST"), list(makeSymbol("QUOTE"), makeSymbol("SET-DIRECTIVE")), makeSymbol("DIRECTIVE")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("REQUEST"), list(makeSymbol("QUOTE"), makeSymbol("SET-DIRECTIVE-ARG")), makeSymbol("DIRECTIVE-ARG")), list(makeSymbol("RET"), makeSymbol("REQUEST"))));

    public static final SubLSymbol GOOGLE_CLIENT_INTERACTION = makeSymbol("GOOGLE-CLIENT-INTERACTION");

    public static final SubLSymbol SET_KEY = makeSymbol("SET-KEY");

    public static final SubLSymbol SET_DIRECTIVE = makeSymbol("SET-DIRECTIVE");

    public static final SubLSymbol SET_DIRECTIVE_ARG = makeSymbol("SET-DIRECTIVE-ARG");

    public static final SubLSymbol GOOGLE_CLIENT_BUILD_BASIC_GOOGLE_REQUEST_METHOD = makeSymbol("GOOGLE-CLIENT-BUILD-BASIC-GOOGLE-REQUEST-METHOD");

    public static final SubLList $list368 = list(list(makeSymbol("CLET"), list(makeSymbol("RESPONSE"), makeSymbol("ERROR")), list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR")), list(makeSymbol("CSETQ"), makeSymbol("RESPONSE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("PERFORM-REQUEST")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CLIENT-INTERACTION"), list(makeSymbol("QUOTE"), makeSymbol("REQUEST-STRING")))))), list(makeSymbol("PCOND"), list(list(makeSymbol("CNOT"), list(makeSymbol("STRINGP"), makeSymbol("ERROR"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CLIENT-INTERACTION"), list(makeSymbol("QUOTE"), makeSymbol("BUILD-ANSWER")), makeSymbol("RESPONSE")), list(makeSymbol("RET"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CLIENT-INTERACTION"), list(makeSymbol("QUOTE"), makeSymbol("GET-ANSWER"))))), list(T, list(makeSymbol("WARN"), makeString("Error when contacting Google server: ~A"), makeSymbol("ERROR")), list(makeSymbol("RET"), makeKeyword("ERROR"))))));

    public static final SubLSymbol PERFORM_REQUEST = makeSymbol("PERFORM-REQUEST");



    public static final SubLSymbol BUILD_ANSWER = makeSymbol("BUILD-ANSWER");



    public static final SubLString $str373$Error_when_contacting_Google_serv = makeString("Error when contacting Google server: ~A");

    public static final SubLSymbol GOOGLE_CLIENT_GET_ANSWER_FROM_REQUEST_METHOD = makeSymbol("GOOGLE-CLIENT-GET-ANSWER-FROM-REQUEST-METHOD");

    public static final SubLList $list375 = list(list(makeSymbol("CSETQ"), makeSymbol("CLIENT-INTERACTION"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("BUILD-BASIC-GOOGLE-REQUEST")), makeSymbol("DIRECTIVE"), makeSymbol("DIRECTIVE-ARG"))), list(makeSymbol("RET"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-ANSWER-FROM-REQUEST")))));

    public static final SubLSymbol GOOGLE_CLIENT_GOOGLE_REQUEST_METHOD = makeSymbol("GOOGLE-CLIENT-GOOGLE-REQUEST-METHOD");

    public static final SubLList $list377 = list(new SubLObject[]{ list(makeSymbol("SEARCH-DIRECTIVE-TAG"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("search")), list(makeSymbol("COUNT-DIRECTIVE-TAG"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("count")), list(makeSymbol("SPELL-DIRECTIVE-TAG"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("spell")), list(makeSymbol("QUIT-DIRECTIVE-TAG"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("$quit$")), list(makeSymbol("VERSION-DIRECTIVE-TAG"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("version")), list(makeSymbol("SUBL-DIRECTIVE-TAG"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("SubL")), list(makeSymbol("QUERY-TAG"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("query")), list(makeSymbol("QUERY-TYPE-ATTR"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("type")), list(makeSymbol("QUERY-COUNT-ATTR"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("hitnum")), list(makeSymbol("QUERY-START-ATTR"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("startnum")), list(makeSymbol("QUERY-KEY-ATTR"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("key")), list(makeSymbol("QUERY-LANGUAGE-ATTR"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("language")), list(makeSymbol("CONTENT-KEYWORD"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeKeyword("CONTENT")), list(makeSymbol("URL-KEYWORD"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeKeyword("URL")), list(makeSymbol("TITLE-KEYWORD"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeKeyword("TITLE")), list(makeSymbol("FULL-TEXT-KEYWORD"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeKeyword("FULL-TEXT")), list(makeSymbol("SNIPPET-KEYWORD"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeKeyword("SNIPPET")), list(makeSymbol("OFFSET-IN-FULL-TEXT-KEYWORD"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeKeyword("OFFSET-IN-FULL-TEXT")), list(makeSymbol("OFFSET-IN-SNIPPET-KEYWORD"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeKeyword("OFFSET-IN-SNIPPET")), list(makeSymbol("RANK-KEYWORD"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeKeyword("RANK")), list(makeSymbol("TOTAL-KEYWORD"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeKeyword("TOTAL")), list(makeSymbol("CLIENT-KEY"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DIRECTIVE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DIRECTIVE-ARG"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DOCNO"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("START"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("GOOGLE-PASSAGES"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("GOOGLE-COUNT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("GOOGLE-SPELLING"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("GOOGLE-VERSION"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("GOOGLE-IO-ERROR"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("EXTRACT-URL-FROM-START-TAG"), list(makeSymbol("XML-TAG")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KEY"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DIRECTIVE"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECTIVE"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DIRECTIVE-ARG"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-RAW-ANSWER"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ANSWER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-IO-ERROR-FLAG"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REQUEST-STRING"), NIL, makeKeyword("PUBLIC")) });

    public static final SubLSymbol GOOGLE_IO_ERROR = makeSymbol("GOOGLE-IO-ERROR");

    public static final SubLSymbol GOOGLE_VERSION = makeSymbol("GOOGLE-VERSION");

    public static final SubLSymbol GOOGLE_SPELLING = makeSymbol("GOOGLE-SPELLING");



    public static final SubLSymbol GOOGLE_PASSAGES = makeSymbol("GOOGLE-PASSAGES");





    private static final SubLInteger $int$21 = makeInteger(21);



    public static final SubLSymbol COUNT_DIRECTIVE_TAG = makeSymbol("COUNT-DIRECTIVE-TAG");

    public static final SubLSymbol SPELL_DIRECTIVE_TAG = makeSymbol("SPELL-DIRECTIVE-TAG");

    public static final SubLSymbol QUIT_DIRECTIVE_TAG = makeSymbol("QUIT-DIRECTIVE-TAG");

    public static final SubLSymbol VERSION_DIRECTIVE_TAG = makeSymbol("VERSION-DIRECTIVE-TAG");



    public static final SubLString $$$SubL = makeString("SubL");





    public static final SubLString $$$type = makeString("type");

    public static final SubLSymbol QUERY_COUNT_ATTR = makeSymbol("QUERY-COUNT-ATTR");

    public static final SubLString $$$hitnum = makeString("hitnum");

    public static final SubLSymbol QUERY_START_ATTR = makeSymbol("QUERY-START-ATTR");

    public static final SubLString $$$startnum = makeString("startnum");

    public static final SubLSymbol QUERY_KEY_ATTR = makeSymbol("QUERY-KEY-ATTR");

    public static final SubLString $$$key = makeString("key");



    public static final SubLString $$$language = makeString("language");

    public static final SubLSymbol CONTENT_KEYWORD = makeSymbol("CONTENT-KEYWORD");



    public static final SubLSymbol URL_KEYWORD = makeSymbol("URL-KEYWORD");



    public static final SubLSymbol TITLE_KEYWORD = makeSymbol("TITLE-KEYWORD");



    public static final SubLSymbol FULL_TEXT_KEYWORD = makeSymbol("FULL-TEXT-KEYWORD");



    public static final SubLSymbol SNIPPET_KEYWORD = makeSymbol("SNIPPET-KEYWORD");



    public static final SubLSymbol OFFSET_IN_FULL_TEXT_KEYWORD = makeSymbol("OFFSET-IN-FULL-TEXT-KEYWORD");

    private static final SubLSymbol $OFFSET_IN_FULL_TEXT = makeKeyword("OFFSET-IN-FULL-TEXT");

    public static final SubLSymbol OFFSET_IN_SNIPPET_KEYWORD = makeSymbol("OFFSET-IN-SNIPPET-KEYWORD");

    private static final SubLSymbol $OFFSET_IN_SNIPPET = makeKeyword("OFFSET-IN-SNIPPET");

    public static final SubLSymbol RANK_KEYWORD = makeSymbol("RANK-KEYWORD");



    public static final SubLSymbol TOTAL_KEYWORD = makeSymbol("TOTAL-KEYWORD");



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_INTERACTION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GOOGLE-CLIENT-INTERACTION-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_INTERACTION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GOOGLE-CLIENT-INTERACTION-INSTANCE");

    public static final SubLList $list424 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("GOOGLE-PASSAGES"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("GOOGLE-PASSAGE-LIST")))), list(makeSymbol("CSETQ"), makeSymbol("DOCNO"), TEN_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("START"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("GOOGLE-IO-ERROR"), NIL), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym425$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD");

    public static final SubLSymbol GOOGLE_PASSAGE_LIST = makeSymbol("GOOGLE-PASSAGE-LIST");

    public static final SubLSymbol GOOGLE_CLIENT_INTERACTION_INITIALIZE_METHOD = makeSymbol("GOOGLE-CLIENT-INTERACTION-INITIALIZE-METHOD");

    public static final SubLList $list428 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("STRINGP")), list(makeSymbol("CSETQ"), makeSymbol("CLIENT-KEY"), makeSymbol("OBJECT")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym429$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD");

    public static final SubLSymbol GOOGLE_CLIENT_INTERACTION_SET_KEY_METHOD = makeSymbol("GOOGLE-CLIENT-INTERACTION-SET-KEY-METHOD");

    public static final SubLList $list431 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("STRINGP")), list(makeSymbol("CSETQ"), makeSymbol("DIRECTIVE"), makeSymbol("OBJECT")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym432$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD");

    public static final SubLSymbol GOOGLE_CLIENT_INTERACTION_SET_DIRECTIVE_METHOD = makeSymbol("GOOGLE-CLIENT-INTERACTION-SET-DIRECTIVE-METHOD");

    public static final SubLList $list434 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("INTEGERP")), list(makeSymbol("CSETQ"), makeSymbol("DOCNO"), makeSymbol("OBJECT")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym435$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD");

    public static final SubLSymbol GOOGLE_CLIENT_INTERACTION_SET_DOCNO_METHOD = makeSymbol("GOOGLE-CLIENT-INTERACTION-SET-DOCNO-METHOD");

    public static final SubLList $list437 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("INTEGERP")), list(makeSymbol("CSETQ"), makeSymbol("START"), makeSymbol("OBJECT")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym438$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD");

    public static final SubLSymbol GOOGLE_CLIENT_INTERACTION_SET_START_METHOD = makeSymbol("GOOGLE-CLIENT-INTERACTION-SET-START-METHOD");

    public static final SubLSymbol GET_IO_ERROR_FLAG = makeSymbol("GET-IO-ERROR-FLAG");

    public static final SubLList $list441 = list(list(makeSymbol("RET"), makeSymbol("GOOGLE-IO-ERROR")));

    public static final SubLSymbol $sym442$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD");

    public static final SubLSymbol GOOGLE_CLIENT_INTERACTION_GET_IO_ERROR_FLAG_METHOD = makeSymbol("GOOGLE-CLIENT-INTERACTION-GET-IO-ERROR-FLAG-METHOD");

    public static final SubLList $list444 = list(makeSymbol("RESPONSE-STRING"));

    public static final SubLList $list445 = list(list(makeSymbol("CLET"), list(makeSymbol("RESPONSE"), makeSymbol("ERROR")), list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR")), list(makeSymbol("CSETQ"), makeSymbol("RESPONSE"), list(makeSymbol("READ-FROM-STRING"), makeSymbol("RESPONSE-STRING")))), list(makeSymbol("PWHEN"), makeSymbol("ERROR"), list(makeSymbol("WARN"), makeString("Could not build answer; the response string ~A created an error: ~A"), makeSymbol("RESPONSE-STRING"), makeSymbol("ERROR")), list(makeSymbol("RET"), makeSymbol("SELF"))), list(makeSymbol("PCOND"), list(list(EQ, makeSymbol("RESPONSE"), makeKeyword("IO-ERROR")), list(makeSymbol("CSETQ"), makeSymbol("GOOGLE-IO-ERROR"), T)), list(list(EQUALP, makeSymbol("DIRECTIVE"), makeSymbol("COUNT-DIRECTIVE-TAG")), list(makeSymbol("PCOND"), list(list(makeSymbol("INTEGERP"), makeSymbol("RESPONSE")), list(makeSymbol("CSETQ"), makeSymbol("GOOGLE-COUNT"), makeSymbol("RESPONSE"))), list(T, list(makeSymbol("WARN"), makeString("Google count is not a digit-string. Setting it to 0.")), list(makeSymbol("CSETQ"), makeSymbol("GOOGLE-COUNT"), ZERO_INTEGER)))), list(list(EQUALP, makeSymbol("DIRECTIVE"), makeSymbol("SEARCH-DIRECTIVE-TAG")), list(makeSymbol("PCOND"), list(list(makeSymbol("LISTP"), makeSymbol("RESPONSE")), list(makeSymbol("CDOLIST"), list(makeSymbol("PASSAGE"), makeSymbol("RESPONSE")), list(makeSymbol("CLET"), list(new SubLObject[]{ list(makeSymbol("URL"), list(makeSymbol("GETF"), makeSymbol("PASSAGE"), makeSymbol("URL-KEYWORD"))), list(makeSymbol("TITLE"), list(makeSymbol("GETF"), makeSymbol("PASSAGE"), makeSymbol("TITLE-KEYWORD"))), list(makeSymbol("CONTENT"), list(makeSymbol("GETF"), makeSymbol("PASSAGE"), makeSymbol("CONTENT-KEYWORD"))), list(makeSymbol("FULL-TEXT"), list(makeSymbol("GETF"), makeSymbol("PASSAGE"), makeSymbol("FULL-TEXT-KEYWORD"))), list(makeSymbol("SNIPPET"), list(makeSymbol("GETF"), makeSymbol("PASSAGE"), makeSymbol("SNIPPET-KEYWORD"))), list(makeSymbol("OFFSET-IN-SNIPPET"), list(makeSymbol("GETF"), makeSymbol("PASSAGE"), makeSymbol("OFFSET-IN-SNIPPET-KEYWORD"))), list(makeSymbol("TEXT"), list(makeSymbol("FIF"), list(makeSymbol("STRINGP"), makeSymbol("FULL-TEXT")), makeSymbol("FULL-TEXT"), makeSymbol("CONTENT"))), list(makeSymbol("OFFSET-IN-FULL-TEXT"), list(makeSymbol("FIF"), list(makeSymbol("STRINGP"), makeSymbol("FULL-TEXT")), list(makeSymbol("GETF"), makeSymbol("PASSAGE"), makeSymbol("OFFSET-IN-FULL-TEXT-KEYWORD")), makeSymbol("OFFSET-IN-SNIPPET"))), list(makeSymbol("RANK"), list(makeSymbol("GETF"), makeSymbol("PASSAGE"), makeSymbol("RANK-KEYWORD"))), list(makeSymbol("TOTAL"), list(makeSymbol("GETF"), makeSymbol("PASSAGE"), makeSymbol("TOTAL-KEYWORD"))) }), list(makeSymbol("FIM"), makeSymbol("GOOGLE-PASSAGES"), list(makeSymbol("QUOTE"), makeSymbol("ADD")), list(new SubLObject[]{ makeSymbol("NEW-GOOGLE-PASSAGE"), makeSymbol("URL"), makeSymbol("RANK"), makeSymbol("TITLE"), makeSymbol("TEXT"), makeSymbol("SNIPPET"), makeSymbol("OFFSET-IN-FULL-TEXT"), makeSymbol("OFFSET-IN-SNIPPET"), makeSymbol("TOTAL") }))))), list(T, list(makeSymbol("WARN"), makeString("Response ~A is of unwanted type ~S."), makeSymbol("RESPONSE"), list(makeSymbol("TYPE-OF"), makeSymbol("RESPONSE")))))), list(list(EQUALP, makeSymbol("DIRECTIVE"), makeSymbol("VERSION-DIRECTIVE-TAG")), list(makeSymbol("PCOND"), list(list(makeSymbol("PROPERTY-LIST-P"), makeSymbol("RESPONSE")), list(makeSymbol("CSETQ"), makeSymbol("GOOGLE-VERSION"), makeSymbol("RESPONSE"))), list(T, list(makeSymbol("WARN"), makeString("Response ~A is of unwanted type ~S."), makeSymbol("RESPONSE"), list(makeSymbol("TYPE-OF"), makeSymbol("RESPONSE")))))), list(list(EQUALP, makeSymbol("DIRECTIVE"), makeSymbol("QUIT-DIRECTIVE-TAG"))), list(list(EQUALP, makeSymbol("DIRECTIVE"), makeSymbol("SPELL-DIRECTIVE-TAG")), list(makeSymbol("PCOND"), list(list(makeSymbol("PROPERTY-LIST-P"), makeSymbol("RESPONSE")), list(makeSymbol("CSETQ"), makeSymbol("GOOGLE-SPELLING"), list(makeSymbol("SECOND"), makeSymbol("RESPONSE")))), list(T, list(makeSymbol("WARN"), makeString("Response ~A is of unwanted type ~S."), list(makeSymbol("TYPE-OF"), makeSymbol("RESPONSE")))))), list(T, list(makeSymbol("WARN"), makeString("Query directive ~S is not supported."), makeSymbol("DIRECTIVE")))), list(makeSymbol("RET"), makeSymbol("SELF"))));

    public static final SubLSymbol $sym446$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD");

    public static final SubLString $str447$Could_not_build_answer__the_respo = makeString("Could not build answer; the response string ~A created an error: ~A");



    public static final SubLString $str449$Google_count_is_not_a_digit_strin = makeString("Google count is not a digit-string. Setting it to 0.");



    public static final SubLString $str451$Response__A_is_of_unwanted_type__ = makeString("Response ~A is of unwanted type ~S.");

    public static final SubLString $str452$Query_directive__S_is_not_support = makeString("Query directive ~S is not supported.");

    public static final SubLSymbol GOOGLE_CLIENT_INTERACTION_BUILD_ANSWER_METHOD = makeSymbol("GOOGLE-CLIENT-INTERACTION-BUILD-ANSWER-METHOD");

    public static final SubLSymbol GET_DIRECTIVE = makeSymbol("GET-DIRECTIVE");

    public static final SubLList $list455 = list(list(makeSymbol("RET"), makeSymbol("DIRECTIVE")));

    public static final SubLSymbol $sym456$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD");

    public static final SubLSymbol GOOGLE_CLIENT_INTERACTION_GET_DIRECTIVE_METHOD = makeSymbol("GOOGLE-CLIENT-INTERACTION-GET-DIRECTIVE-METHOD");

    public static final SubLList $list458 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("OBJECT"), makeSymbol("STRINGP")), list(makeSymbol("CSETQ"), makeSymbol("DIRECTIVE-ARG"), makeSymbol("OBJECT")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym459$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD");

    public static final SubLSymbol GOOGLE_CLIENT_INTERACTION_SET_DIRECTIVE_ARG_METHOD = makeSymbol("GOOGLE-CLIENT-INTERACTION-SET-DIRECTIVE-ARG-METHOD");

    public static final SubLList $list461 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), makeString(""))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("CLIENT-KEY"), makeSymbol("DIRECTIVE"), makeSymbol("DIRECTIVE-ARG")), list(makeSymbol("CLET"), list(list(makeSymbol("OUTSTREAM"), list(makeSymbol("MAKE-STRING-OUTPUT-STREAM"))), list(makeSymbol("XML-WRITER"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("XML-WRITER"))))), list(makeSymbol("FIM"), makeSymbol("XML-WRITER"), list(makeSymbol("QUOTE"), makeSymbol("SET-STREAM")), makeSymbol("OUTSTREAM")), list(makeSymbol("FIM"), makeSymbol("XML-WRITER"), list(makeSymbol("QUOTE"), makeSymbol("START-TAG")), makeSymbol("QUERY-TAG"), list(new SubLObject[]{ makeSymbol("BQ-LIST"), makeSymbol("QUERY-KEY-ATTR"), makeSymbol("CLIENT-KEY"), makeSymbol("QUERY-TYPE-ATTR"), makeSymbol("DIRECTIVE"), makeSymbol("QUERY-COUNT-ATTR"), makeSymbol("DOCNO"), makeSymbol("QUERY-START-ATTR"), makeSymbol("START"), makeSymbol("QUERY-LANGUAGE-ATTR"), makeSymbol("SUBL-DIRECTIVE-TAG") }), NIL, NIL), list(makeSymbol("FIM"), makeSymbol("XML-WRITER"), list(makeSymbol("QUOTE"), makeSymbol("XML-PRINT")), makeSymbol("DIRECTIVE-ARG"), NIL), list(makeSymbol("FIM"), makeSymbol("XML-WRITER"), list(makeSymbol("QUOTE"), makeSymbol("END-TAG")), makeSymbol("QUERY-TAG"), NIL), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("TRIM-WHITESPACE"), list(makeSymbol("GET-OUTPUT-STREAM-STRING"), makeSymbol("OUTSTREAM")))))), list(makeSymbol("RET"), makeSymbol("RESULT"))));

    public static final SubLSymbol $sym462$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD");











    public static final SubLSymbol GOOGLE_CLIENT_INTERACTION_REQUEST_STRING_METHOD = makeSymbol("GOOGLE-CLIENT-INTERACTION-REQUEST-STRING-METHOD");

    public static final SubLList $list469 = list(list(makeSymbol("PCOND"), list(list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-IO-ERROR-FLAG"))), list(makeSymbol("RET"), makeKeyword("SERVER-ERROR"))), list(list(EQUALP, makeSymbol("DIRECTIVE"), makeSymbol("COUNT-DIRECTIVE-TAG")), list(makeSymbol("RET"), makeSymbol("GOOGLE-COUNT"))), list(list(EQUALP, makeSymbol("DIRECTIVE"), makeSymbol("SPELL-DIRECTIVE-TAG")), list(makeSymbol("RET"), makeSymbol("GOOGLE-SPELLING"))), list(list(EQUALP, makeSymbol("DIRECTIVE"), makeSymbol("VERSION-DIRECTIVE-TAG")), list(makeSymbol("RET"), makeSymbol("GOOGLE-VERSION"))), list(list(EQUALP, makeSymbol("DIRECTIVE"), makeSymbol("SEARCH-DIRECTIVE-TAG")), list(makeSymbol("RET"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-GOOGLE-PASSAGES")))))));

    public static final SubLSymbol $sym470$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD");



    public static final SubLSymbol GET_GOOGLE_PASSAGES = makeSymbol("GET-GOOGLE-PASSAGES");

    public static final SubLSymbol GOOGLE_CLIENT_INTERACTION_GET_ANSWER_METHOD = makeSymbol("GOOGLE-CLIENT-INTERACTION-GET-ANSWER-METHOD");

    public static final SubLList $list474 = list(list(makeSymbol("CLET"), list(makeSymbol("SNIPPET-LIST"), makeSymbol("ENUMERATOR")), list(makeSymbol("PUNLESS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("GOOGLE-PASSAGES"), list(makeSymbol("QUOTE"), makeSymbol("EMPTY-P"))), list(makeSymbol("CSETQ"), makeSymbol("ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("GOOGLE-PASSAGES"), list(makeSymbol("QUOTE"), makeSymbol("ALLOCATE-ENUMERATOR")))), list(makeSymbol("CPUSH"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("FIRST"))), makeSymbol("SNIPPET-LIST")), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("LAST-P")))), list(makeSymbol("CPUSH"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("NEXT"))), makeSymbol("SNIPPET-LIST")))), list(makeSymbol("RET"), list(makeSymbol("NREVERSE"), makeSymbol("SNIPPET-LIST")))));

    public static final SubLSymbol $sym475$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-CLIENT-INTERACTION-METHOD");











    public static final SubLSymbol GOOGLE_CLIENT_INTERACTION_GET_GOOGLE_PASSAGES_METHOD = makeSymbol("GOOGLE-CLIENT-INTERACTION-GET-GOOGLE-PASSAGES-METHOD");

    public static final SubLSymbol BASIC_LIST = makeSymbol("BASIC-LIST");

    public static final SubLList $list483 = list(makeSymbol("PROTECTED-MEMBERSHIP-TEMPLATE"));

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_LIST_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GOOGLE-PASSAGE-LIST-CLASS");

    public static final SubLSymbol BASIC_COLLECTION = makeSymbol("BASIC-COLLECTION");





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_LIST_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GOOGLE-PASSAGE-LIST-INSTANCE");

    public static final SubLSymbol ACCEPTABLE_P = makeSymbol("ACCEPTABLE-P");

    public static final SubLList $list490 = list(makeSymbol("NEW-ELEMENT"));

    public static final SubLList $list491 = list(list(makeSymbol("RET"), list(makeSymbol("CAND"), list(makeSymbol("INSTANCE-OF-P"), makeSymbol("NEW-ELEMENT"), list(makeSymbol("QUOTE"), makeSymbol("GOOGLE-PASSAGE"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-ELEMENT"), list(makeSymbol("QUOTE"), makeSymbol("IS-COMPLETE"))))));

    public static final SubLSymbol GOOGLE_PASSAGE = makeSymbol("GOOGLE-PASSAGE");

    public static final SubLSymbol IS_COMPLETE = makeSymbol("IS-COMPLETE");

    public static final SubLSymbol GOOGLE_PASSAGE_LIST_ACCEPTABLE_P_METHOD = makeSymbol("GOOGLE-PASSAGE-LIST-ACCEPTABLE-P-METHOD");

    public static final SubLList $list495 = list(list(makeSymbol("PIF"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ACCEPTABLE-P")), makeSymbol("NEW-ELEMENT")), list(makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ADD")), makeSymbol("NEW-ELEMENT")), list(makeSymbol("WARN"), makeString("~%Cannot add ~S to a google-passage-list"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLString $str496$__Cannot_add__S_to_a_google_passa = makeString("~%Cannot add ~S to a google-passage-list");

    public static final SubLSymbol GOOGLE_PASSAGE_LIST_ADD_METHOD = makeSymbol("GOOGLE-PASSAGE-LIST-ADD-METHOD");

    public static final SubLList $list498 = list(new SubLObject[]{ list(makeSymbol("RANK"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("URL"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("TITLE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("SNIPPET"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("OFFSET-IN-SNIPPET"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("OFFSET-IN-TEXT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("TOTAL"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("PARSE-TREES"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SCORE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("IS-COMPLETE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-URL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TITLE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SNIPPET"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FULL-TEXT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OFFSET-IN-SNIPPET"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OFFSET-IN-FULL-TEXT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TOTAL-FOR-RANK"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-RANK-AND-TOTAL"), NIL, makeKeyword("PUBLIC")) });





    public static final SubLSymbol OFFSET_IN_TEXT = makeSymbol("OFFSET-IN-TEXT");

    public static final SubLSymbol OFFSET_IN_SNIPPET = makeSymbol("OFFSET-IN-SNIPPET");

    public static final SubLSymbol SNIPPET = makeSymbol("SNIPPET");







    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GOOGLE-PASSAGE-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GOOGLE-PASSAGE-INSTANCE");

    public static final SubLList $list509 = list(makeString("@return stringp; the URL of this passage"), list(makeSymbol("RET"), makeSymbol("URL")));

    public static final SubLSymbol $sym510$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD");

    public static final SubLSymbol GOOGLE_PASSAGE_GET_SOURCE_METHOD = makeSymbol("GOOGLE-PASSAGE-GET-SOURCE-METHOD");

    public static final SubLList $list512 = list(list(makeSymbol("RET"), list(makeSymbol("/"), ONE_INTEGER, makeSymbol("RANK"))));

    public static final SubLSymbol $sym513$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD");

    public static final SubLSymbol GOOGLE_PASSAGE_GET_SCORE_METHOD = makeSymbol("GOOGLE-PASSAGE-GET-SCORE-METHOD");

    public static final SubLList $list515 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("NON-NEGATIVE-INTEGER-P"), makeSymbol("RANK")), list(makeSymbol("RET"), NIL)), list(makeSymbol("PUNLESS"), list(makeSymbol("STRINGP"), makeSymbol("URL")), list(makeSymbol("RET"), NIL)), list(makeSymbol("PUNLESS"), list(makeSymbol("STRINGP"), makeSymbol("TEXT")), list(makeSymbol("RET"), NIL)), list(makeSymbol("RET"), T));

    public static final SubLSymbol $sym516$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD");

    public static final SubLSymbol GOOGLE_PASSAGE_IS_COMPLETE_METHOD = makeSymbol("GOOGLE-PASSAGE-IS-COMPLETE-METHOD");

    public static final SubLSymbol GET_OFFSET_IN_FULL_TEXT = makeSymbol("GET-OFFSET-IN-FULL-TEXT");

    public static final SubLList $list519 = list(list(makeSymbol("RET"), makeSymbol("OFFSET-IN-TEXT")));

    public static final SubLSymbol $sym520$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD");

    public static final SubLSymbol GOOGLE_PASSAGE_GET_OFFSET_IN_FULL_TEXT_METHOD = makeSymbol("GOOGLE-PASSAGE-GET-OFFSET-IN-FULL-TEXT-METHOD");

    public static final SubLSymbol GET_OFFSET_IN_SNIPPET = makeSymbol("GET-OFFSET-IN-SNIPPET");

    public static final SubLList $list523 = list(list(makeSymbol("RET"), makeSymbol("OFFSET-IN-SNIPPET")));

    public static final SubLSymbol $sym524$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD");

    public static final SubLSymbol GOOGLE_PASSAGE_GET_OFFSET_IN_SNIPPET_METHOD = makeSymbol("GOOGLE-PASSAGE-GET-OFFSET-IN-SNIPPET-METHOD");

    public static final SubLSymbol GET_URL = makeSymbol("GET-URL");

    public static final SubLList $list527 = list(list(makeSymbol("RET"), makeSymbol("URL")));

    public static final SubLSymbol $sym528$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD");

    public static final SubLSymbol GOOGLE_PASSAGE_GET_URL_METHOD = makeSymbol("GOOGLE-PASSAGE-GET-URL-METHOD");

    public static final SubLSymbol GET_TITLE = makeSymbol("GET-TITLE");

    public static final SubLList $list531 = list(list(makeSymbol("RET"), makeSymbol("TITLE")));

    public static final SubLSymbol $sym532$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD");

    public static final SubLSymbol GOOGLE_PASSAGE_GET_TITLE_METHOD = makeSymbol("GOOGLE-PASSAGE-GET-TITLE-METHOD");

    public static final SubLSymbol GET_CACHED_FILE_ID = makeSymbol("GET-CACHED-FILE-ID");

    public static final SubLList $list535 = list(list(makeSymbol("RET"), list(makeSymbol("GET-URL"), makeSymbol("SELF"))));

    public static final SubLSymbol GOOGLE_PASSAGE_GET_CACHED_FILE_ID_METHOD = makeSymbol("GOOGLE-PASSAGE-GET-CACHED-FILE-ID-METHOD");

    public static final SubLSymbol GET_FULL_TEXT = makeSymbol("GET-FULL-TEXT");

    public static final SubLList $list538 = list(list(makeSymbol("RET"), list(makeSymbol("GET-CORPUS-PASSAGE-TEXT"), makeSymbol("SELF"))));

    public static final SubLSymbol GOOGLE_PASSAGE_GET_FULL_TEXT_METHOD = makeSymbol("GOOGLE-PASSAGE-GET-FULL-TEXT-METHOD");

    public static final SubLSymbol GET_SNIPPET = makeSymbol("GET-SNIPPET");

    public static final SubLList $list541 = list(list(makeSymbol("RET"), makeSymbol("SNIPPET")));

    public static final SubLSymbol $sym542$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD");

    public static final SubLSymbol GOOGLE_PASSAGE_GET_SNIPPET_METHOD = makeSymbol("GOOGLE-PASSAGE-GET-SNIPPET-METHOD");

    public static final SubLSymbol GET_RANK = makeSymbol("GET-RANK");

    public static final SubLList $list545 = list(list(makeSymbol("RET"), makeSymbol("RANK")));

    public static final SubLSymbol $sym546$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD");

    public static final SubLSymbol GOOGLE_PASSAGE_GET_RANK_METHOD = makeSymbol("GOOGLE-PASSAGE-GET-RANK-METHOD");

    public static final SubLSymbol GET_TOTAL_FOR_RANK = makeSymbol("GET-TOTAL-FOR-RANK");

    public static final SubLList $list549 = list(list(makeSymbol("RET"), makeSymbol("TOTAL")));

    public static final SubLSymbol $sym550$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GOOGLE-PASSAGE-METHOD");

    public static final SubLSymbol GOOGLE_PASSAGE_GET_TOTAL_FOR_RANK_METHOD = makeSymbol("GOOGLE-PASSAGE-GET-TOTAL-FOR-RANK-METHOD");

    public static final SubLSymbol GET_RANK_AND_TOTAL = makeSymbol("GET-RANK-AND-TOTAL");

    public static final SubLList $list553 = list(list(makeSymbol("RET"), list(makeSymbol("VALUES"), list(makeSymbol("GET-RANK"), makeSymbol("SELF")), list(makeSymbol("GET-TOTAL-FOR-RANK"), makeSymbol("SELF")))));

    public static final SubLSymbol GOOGLE_PASSAGE_GET_RANK_AND_TOTAL_METHOD = makeSymbol("GOOGLE-PASSAGE-GET-RANK-AND-TOTAL-METHOD");

    public static final SubLList $list555 = list(makeString("Prints this google passage to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PRINC"), list(makeSymbol("GET-SOURCE"), makeSymbol("SELF")), makeSymbol("STREAM")), list(makeSymbol("TERPRI"), makeSymbol("STREAM")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol GOOGLE_PASSAGE_PRINT_METHOD = makeSymbol("GOOGLE-PASSAGE-PRINT-METHOD");

    public static final SubLSymbol GOOGLE_PASSAGE_GET_PUBLICATION_DATE_METHOD = makeSymbol("GOOGLE-PASSAGE-GET-PUBLICATION-DATE-METHOD");

    public static final SubLString $$$Wikipedia = makeString("Wikipedia");

    public static final SubLSymbol LUCENE_QUERY = makeSymbol("LUCENE-QUERY");

    public static final SubLList $list560 = list(list(makeSymbol("DOCNO"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SENTNO"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET"), NIL, makeKeyword("PRIVATE")));

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LUCENE_QUERY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LUCENE-QUERY-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LUCENE_QUERY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LUCENE-QUERY-INSTANCE");

    public static final SubLList $list563 = list(makeString("@param QUERY stringp\n   @return listp; a ranked list @xref lucene-passages matching QUERY"), list(makeSymbol("RET"), list(makeSymbol("FIM"), list(makeSymbol("GET-LUCENE-CLIENT")), list(makeSymbol("QUOTE"), makeSymbol("SEARCH")), makeSymbol("QUERY"), makeSymbol("DOCNO"))));

    public static final SubLSymbol $sym564$OUTER_CATCH_FOR_LUCENE_QUERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-QUERY-METHOD");

    public static final SubLSymbol LUCENE_QUERY_GET_METHOD = makeSymbol("LUCENE-QUERY-GET-METHOD");

    public static final SubLSymbol LUCENE_CLIENT = makeSymbol("LUCENE-CLIENT");

    public static final SubLList $list567 = list(list(makeSymbol("CLIENT-INTERACTION"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CLIENT-KEY"), list(makeSymbol("CLIENT-KEY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SEARCH"), list(makeSymbol("DIRECTIVE-ARG")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COUNT"), list(makeSymbol("DIRECTIVE-ARG")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SPELLING"), list(makeSymbol("DIRECTIVE-ARG")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LUCENE-REQUEST"), list(makeSymbol("DIRECTIVE"), makeSymbol("DIRECTIVE-ARG")), makeKeyword("PRIVATE")));

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LUCENE-CLIENT-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LUCENE-CLIENT-INSTANCE");

    public static final SubLSymbol LUCENE_CLIENT_INITIALIZE_METHOD = makeSymbol("LUCENE-CLIENT-INITIALIZE-METHOD");

    public static final SubLList $list571 = list(makeSymbol("DIRECTIVE-ARG"), makeSymbol("&OPTIONAL"), list(makeSymbol("DOCNO"), makeInteger(50)));

    public static final SubLList $list572 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("DIRECTIVE-ARG"), makeSymbol("STRINGP")), list(makeSymbol("RET"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("LUCENE-REQUEST")), makeString("search"), makeSymbol("DIRECTIVE-ARG"), makeSymbol("DOCNO"))));

    public static final SubLSymbol LUCENE_REQUEST = makeSymbol("LUCENE-REQUEST");

    public static final SubLSymbol LUCENE_CLIENT_SEARCH_METHOD = makeSymbol("LUCENE-CLIENT-SEARCH-METHOD");

    public static final SubLList $list575 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("DIRECTIVE-ARG"), makeSymbol("STRINGP")), list(makeSymbol("RET"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("LUCENE-REQUEST")), makeString("count"), makeSymbol("DIRECTIVE-ARG"))));

    public static final SubLSymbol LUCENE_CLIENT_COUNT_METHOD = makeSymbol("LUCENE-CLIENT-COUNT-METHOD");

    public static final SubLList $list577 = list(makeSymbol("DIRECTIVE"), makeSymbol("DIRECTIVE-ARG"), makeSymbol("&OPTIONAL"), list(makeSymbol("DOCNO"), TEN_INTEGER));

    public static final SubLList $list578 = list(list(makeSymbol("CLET"), list(list(makeSymbol("REQUEST"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("LUCENE-CLIENT-INTERACTION"))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("REQUEST"), list(makeSymbol("QUOTE"), makeSymbol("SET-DIRECTIVE")), makeSymbol("DIRECTIVE")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("REQUEST"), list(makeSymbol("QUOTE"), makeSymbol("SET-DIRECTIVE-ARG")), makeSymbol("DIRECTIVE-ARG")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("REQUEST"), list(makeSymbol("QUOTE"), makeSymbol("SET-DOCNO")), makeSymbol("DOCNO")), list(makeSymbol("CSETQ"), makeSymbol("CLIENT-INTERACTION"), makeSymbol("REQUEST")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CLIENT-INTERACTION"), list(makeSymbol("QUOTE"), makeSymbol("BUILD-ANSWER")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("PERFORM-REQUEST")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CLIENT-INTERACTION"), list(makeSymbol("QUOTE"), makeSymbol("REQUEST-STRING"))))), list(makeSymbol("RET"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CLIENT-INTERACTION"), list(makeSymbol("QUOTE"), makeSymbol("GET-ANSWER"))))));

    public static final SubLSymbol LUCENE_CLIENT_INTERACTION = makeSymbol("LUCENE-CLIENT-INTERACTION");

    public static final SubLSymbol LUCENE_CLIENT_LUCENE_REQUEST_METHOD = makeSymbol("LUCENE-CLIENT-LUCENE-REQUEST-METHOD");

    public static final SubLList $list581 = list(new SubLObject[]{ list(makeSymbol("SEARCH-DIRECTIVE-TAG"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("search")), list(makeSymbol("COUNT-DIRECTIVE-TAG"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("count")), list(makeSymbol("SUBL-DIRECTIVE-TAG"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("SubL")), list(makeSymbol("QUERY-TAG"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("query")), list(makeSymbol("QUERY-TYPE-ATTR"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("type")), list(makeSymbol("QUERY-COUNT-ATTR"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("hitnum")), list(makeSymbol("QUERY-LANGUAGE-ATTR"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeString("language")), list(makeSymbol("ID-KEYWORD"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeKeyword("ID")), list(makeSymbol("CONTENT-KEYWORD"), makeKeyword("CLASS"), makeKeyword("PUBLIC"), makeKeyword("VALUE"), makeKeyword("CONTENT")), list(makeSymbol("DOCNO"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DIRECTIVE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DIRECTIVE-ARG"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("LUCENE-PASSAGES"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("LUCENE-COUNT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DIRECTIVE"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECTIVE"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DIRECTIVE-ARG"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-RAW-ANSWER"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ANSWER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REQUEST-STRING"), NIL, makeKeyword("PUBLIC")) });

    public static final SubLSymbol LUCENE_COUNT = makeSymbol("LUCENE-COUNT");

    public static final SubLSymbol LUCENE_PASSAGES = makeSymbol("LUCENE-PASSAGES");

    public static final SubLSymbol ID_KEYWORD = makeSymbol("ID-KEYWORD");



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_INTERACTION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LUCENE-CLIENT-INTERACTION-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_INTERACTION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LUCENE-CLIENT-INTERACTION-INSTANCE");

    public static final SubLList $list588 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("LUCENE-PASSAGES"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("LUCENE-PASSAGE-LIST")))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym589$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-CLIENT-INTERACTION-METHOD");

    public static final SubLSymbol LUCENE_PASSAGE_LIST = makeSymbol("LUCENE-PASSAGE-LIST");

    public static final SubLSymbol LUCENE_CLIENT_INTERACTION_INITIALIZE_METHOD = makeSymbol("LUCENE-CLIENT-INTERACTION-INITIALIZE-METHOD");

    public static final SubLSymbol $sym592$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-CLIENT-INTERACTION-METHOD");

    public static final SubLSymbol LUCENE_CLIENT_INTERACTION_SET_DIRECTIVE_METHOD = makeSymbol("LUCENE-CLIENT-INTERACTION-SET-DIRECTIVE-METHOD");

    public static final SubLList $list594 = list(list(makeSymbol("CLET"), list(makeSymbol("RESPONSE"), makeSymbol("ERROR")), list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR")), list(makeSymbol("CSETQ"), makeSymbol("RESPONSE"), list(makeSymbol("READ-FROM-STRING"), makeSymbol("RESPONSE-STRING")))), list(makeSymbol("PWHEN"), makeSymbol("ERROR"), list(makeSymbol("WARN"), makeSymbol("ERROR")), list(makeSymbol("RET"), makeSymbol("SELF"))), list(makeSymbol("PCOND"), list(list(EQUALP, makeSymbol("DIRECTIVE"), makeSymbol("COUNT-DIRECTIVE-TAG")), list(makeSymbol("PCOND"), list(list(makeSymbol("INTEGERP"), makeSymbol("RESPONSE")), list(makeSymbol("CSETQ"), makeSymbol("LUCENE-COUNT"), makeSymbol("RESPONSE"))), list(T, list(makeSymbol("WARN"), makeString("Lucene count is not a digit-string. Setting it to 0.")), list(makeSymbol("CSETQ"), makeSymbol("LUCENE-COUNT"), ZERO_INTEGER)))), list(list(EQUALP, makeSymbol("DIRECTIVE"), makeSymbol("SEARCH-DIRECTIVE-TAG")), list(makeSymbol("PCOND"), list(list(makeSymbol("LISTP"), makeSymbol("RESPONSE")), list(makeSymbol("CLET"), list(list(makeSymbol("RANK"), ONE_INTEGER)), list(makeSymbol("CDOLIST"), list(makeSymbol("PASSAGE"), makeSymbol("RESPONSE")), list(makeSymbol("CLET"), list(list(makeSymbol("ID"), list(makeSymbol("GETF"), makeSymbol("PASSAGE"), makeSymbol("ID-KEYWORD"))), list(makeSymbol("TEXT"), list(makeSymbol("GETF"), makeSymbol("PASSAGE"), makeSymbol("CONTENT-KEYWORD")))), list(makeSymbol("FIM"), makeSymbol("LUCENE-PASSAGES"), list(makeSymbol("QUOTE"), makeSymbol("ADD")), list(makeSymbol("NEW-LUCENE-PASSAGE"), makeSymbol("ID"), makeSymbol("RANK"), makeSymbol("TEXT"))))))), list(T, list(makeSymbol("WARN"), makeString("Response is of unwanted type ~S."), list(makeSymbol("TYPE-OF"), makeSymbol("RESPONSE")))))), list(T, list(makeSymbol("WARN"), makeString("Query directive ~S is not supported."), makeSymbol("DIRECTIVE")))), list(makeSymbol("RET"), makeSymbol("SELF"))));

    public static final SubLSymbol $sym595$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-CLIENT-INTERACTION-METHOD");

    public static final SubLString $str596$Lucene_count_is_not_a_digit_strin = makeString("Lucene count is not a digit-string. Setting it to 0.");

    public static final SubLString $str597$Response_is_of_unwanted_type__S_ = makeString("Response is of unwanted type ~S.");

    public static final SubLSymbol LUCENE_CLIENT_INTERACTION_BUILD_ANSWER_METHOD = makeSymbol("LUCENE-CLIENT-INTERACTION-BUILD-ANSWER-METHOD");

    public static final SubLSymbol $sym599$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-CLIENT-INTERACTION-METHOD");

    public static final SubLSymbol LUCENE_CLIENT_INTERACTION_GET_DIRECTIVE_METHOD = makeSymbol("LUCENE-CLIENT-INTERACTION-GET-DIRECTIVE-METHOD");

    public static final SubLSymbol $sym601$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-CLIENT-INTERACTION-METHOD");

    public static final SubLSymbol LUCENE_CLIENT_INTERACTION_SET_DIRECTIVE_ARG_METHOD = makeSymbol("LUCENE-CLIENT-INTERACTION-SET-DIRECTIVE-ARG-METHOD");

    public static final SubLSymbol $sym603$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-CLIENT-INTERACTION-METHOD");

    public static final SubLSymbol LUCENE_CLIENT_INTERACTION_SET_DOCNO_METHOD = makeSymbol("LUCENE-CLIENT-INTERACTION-SET-DOCNO-METHOD");

    public static final SubLList $list605 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), makeString(""))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("DIRECTIVE"), makeSymbol("DIRECTIVE-ARG")), list(makeSymbol("CLET"), list(list(makeSymbol("OUTSTREAM"), list(makeSymbol("MAKE-STRING-OUTPUT-STREAM"))), list(makeSymbol("XML-WRITER"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("XML-WRITER"))))), list(makeSymbol("FIM"), makeSymbol("XML-WRITER"), list(makeSymbol("QUOTE"), makeSymbol("SET-STREAM")), makeSymbol("OUTSTREAM")), list(makeSymbol("FIM"), makeSymbol("XML-WRITER"), list(makeSymbol("QUOTE"), makeSymbol("START-TAG")), makeSymbol("QUERY-TAG"), list(makeSymbol("BQ-LIST"), makeSymbol("QUERY-TYPE-ATTR"), makeSymbol("DIRECTIVE"), makeSymbol("QUERY-COUNT-ATTR"), makeSymbol("DOCNO"), makeSymbol("QUERY-LANGUAGE-ATTR"), makeSymbol("SUBL-DIRECTIVE-TAG")), NIL, NIL), list(makeSymbol("FIM"), makeSymbol("XML-WRITER"), list(makeSymbol("QUOTE"), makeSymbol("XML-PRINT")), makeSymbol("DIRECTIVE-ARG"), NIL), list(makeSymbol("FIM"), makeSymbol("XML-WRITER"), list(makeSymbol("QUOTE"), makeSymbol("END-TAG")), makeSymbol("QUERY-TAG"), NIL), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("TRIM-WHITESPACE"), list(makeSymbol("GET-OUTPUT-STREAM-STRING"), makeSymbol("OUTSTREAM")))))), list(makeSymbol("RET"), makeSymbol("RESULT"))));

    public static final SubLSymbol $sym606$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-CLIENT-INTERACTION-METHOD");

    public static final SubLSymbol LUCENE_CLIENT_INTERACTION_REQUEST_STRING_METHOD = makeSymbol("LUCENE-CLIENT-INTERACTION-REQUEST-STRING-METHOD");

    public static final SubLList $list608 = list(list(makeSymbol("PCOND"), list(list(EQUALP, makeSymbol("DIRECTIVE"), makeSymbol("COUNT-DIRECTIVE-TAG")), list(makeSymbol("RET"), makeSymbol("LUCENE-COUNT"))), list(list(EQUALP, makeSymbol("DIRECTIVE"), makeSymbol("SEARCH-DIRECTIVE-TAG")), list(makeSymbol("RET"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-LUCENE-PASSAGES")))))));

    public static final SubLSymbol $sym609$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-CLIENT-INTERACTION-METHOD");

    public static final SubLSymbol GET_LUCENE_PASSAGES = makeSymbol("GET-LUCENE-PASSAGES");

    public static final SubLSymbol LUCENE_CLIENT_INTERACTION_GET_ANSWER_METHOD = makeSymbol("LUCENE-CLIENT-INTERACTION-GET-ANSWER-METHOD");

    public static final SubLList $list612 = list(list(makeSymbol("CLET"), list(makeSymbol("PASSAGE-LIST"), makeSymbol("ENUMERATOR")), list(makeSymbol("PUNLESS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("LUCENE-PASSAGES"), list(makeSymbol("QUOTE"), makeSymbol("EMPTY-P"))), list(makeSymbol("CSETQ"), makeSymbol("ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("LUCENE-PASSAGES"), list(makeSymbol("QUOTE"), makeSymbol("ALLOCATE-ENUMERATOR")))), list(makeSymbol("CPUSH"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("FIRST"))), makeSymbol("PASSAGE-LIST")), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("LAST-P")))), list(makeSymbol("CPUSH"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("NEXT"))), makeSymbol("PASSAGE-LIST")))), list(makeSymbol("RET"), list(makeSymbol("NREVERSE"), makeSymbol("PASSAGE-LIST")))));

    public static final SubLSymbol $sym613$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-CLIENT-INTERACTION-METHOD");

    public static final SubLSymbol LUCENE_CLIENT_INTERACTION_GET_LUCENE_PASSAGES_METHOD = makeSymbol("LUCENE-CLIENT-INTERACTION-GET-LUCENE-PASSAGES-METHOD");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_LIST_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LUCENE-PASSAGE-LIST-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_LIST_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LUCENE-PASSAGE-LIST-INSTANCE");

    public static final SubLList $list617 = list(list(makeSymbol("RET"), list(makeSymbol("CAND"), list(makeSymbol("INSTANCE-OF-P"), makeSymbol("NEW-ELEMENT"), list(makeSymbol("QUOTE"), makeSymbol("LUCENE-PASSAGE"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-ELEMENT"), list(makeSymbol("QUOTE"), makeSymbol("IS-COMPLETE"))))));

    public static final SubLSymbol LUCENE_PASSAGE = makeSymbol("LUCENE-PASSAGE");

    public static final SubLSymbol LUCENE_PASSAGE_LIST_ACCEPTABLE_P_METHOD = makeSymbol("LUCENE-PASSAGE-LIST-ACCEPTABLE-P-METHOD");

    public static final SubLList $list620 = list(list(makeSymbol("PIF"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ACCEPTABLE-P")), makeSymbol("NEW-ELEMENT")), list(makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ADD")), makeSymbol("NEW-ELEMENT")), list(makeSymbol("WARN"), makeString("~%Cannot add ~S to a lucene-passage-list"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLString $str621$__Cannot_add__S_to_a_lucene_passa = makeString("~%Cannot add ~S to a lucene-passage-list");

    public static final SubLSymbol LUCENE_PASSAGE_LIST_ADD_METHOD = makeSymbol("LUCENE-PASSAGE-LIST-ADD-METHOD");

    public static final SubLList $list623 = list(list(makeSymbol("RANK"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("ID"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("PARSE-TREES"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SCORE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("IS-COMPLETE"), NIL, makeKeyword("PUBLIC")));



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LUCENE-PASSAGE-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LUCENE-PASSAGE-INSTANCE");

    public static final SubLList $list627 = list(makeString("@return stringp; the URL of this passage"), list(makeSymbol("RET"), makeSymbol("ID")));

    public static final SubLSymbol $sym628$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-PASSAGE-METHOD");

    public static final SubLSymbol LUCENE_PASSAGE_GET_SOURCE_METHOD = makeSymbol("LUCENE-PASSAGE-GET-SOURCE-METHOD");

    public static final SubLList $list630 = list(list(makeSymbol("PUNLESS"), makeSymbol("RANK"), list(makeSymbol("RET"), ZERO_INTEGER)), list(makeSymbol("RET"), list(makeSymbol("/"), ONE_INTEGER, makeSymbol("RANK"))));

    public static final SubLSymbol $sym631$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-PASSAGE-METHOD");

    public static final SubLSymbol LUCENE_PASSAGE_GET_SCORE_METHOD = makeSymbol("LUCENE-PASSAGE-GET-SCORE-METHOD");

    public static final SubLList $list633 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("NON-NEGATIVE-INTEGER-P"), makeSymbol("RANK")), list(makeSymbol("RET"), NIL)), list(makeSymbol("PUNLESS"), list(makeSymbol("STRINGP"), makeSymbol("ID")), list(makeSymbol("RET"), NIL)), list(makeSymbol("PUNLESS"), list(makeSymbol("STRINGP"), makeSymbol("TEXT")), list(makeSymbol("RET"), NIL)), list(makeSymbol("RET"), T));

    public static final SubLSymbol $sym634$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-PASSAGE-METHOD");

    public static final SubLSymbol LUCENE_PASSAGE_IS_COMPLETE_METHOD = makeSymbol("LUCENE-PASSAGE-IS-COMPLETE-METHOD");

    public static final SubLList $list636 = list(makeString("Prints this lucene passage to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PRINC"), list(makeSymbol("GET-SOURCE"), makeSymbol("SELF")), makeSymbol("STREAM")), list(makeSymbol("TERPRI"), makeSymbol("STREAM")), list(makeSymbol("PRINC"), makeSymbol("TEXT"), makeSymbol("STREAM")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym637$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LUCENE-PASSAGE-METHOD");

    public static final SubLSymbol LUCENE_PASSAGE_PRINT_METHOD = makeSymbol("LUCENE-PASSAGE-PRINT-METHOD");

    public static final SubLSymbol LUCENE_PASSAGE_GET_PUBLICATION_DATE_METHOD = makeSymbol("LUCENE-PASSAGE-GET-PUBLICATION-DATE-METHOD");

    public static final SubLSymbol CYCL_QUERY = makeSymbol("CYCL-QUERY");

    public static final SubLList $list641 = list(list(makeSymbol("KNOWLEDGE-SOURCES"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("PROPERTIES"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FROM-KB"), list(makeSymbol("MT")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FROM-CORPUS"), list(makeSymbol("CORPUS")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GENERATE-ASSIGNMENTS"), list(makeSymbol("PASSAGE")), makeKeyword("PRIVATE")));





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYCL_QUERY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCL-QUERY-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYCL_QUERY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCL-QUERY-INSTANCE");

    public static final SubLList $list646 = list(reader_make_constant_shell(makeString("EverythingPSC")));

    public static final SubLList $list647 = list(makeKeyword("RETURN"), makeKeyword("BINDINGS-AND-SUPPORTS"), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));



    public static final SubLSymbol CYCL_QUERY_P = makeSymbol("CYCL-QUERY-P");

    public static final SubLList $list650 = list(makeString("@param QUERY stringp\n   @return listp; a list of variable assignments"), list(makeSymbol("CLET"), list(list(makeSymbol("ASSIGNMENTS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("KS"), makeSymbol("KNOWLEDGE-SOURCES")), list(makeSymbol("PCOND"), list(list(makeSymbol("MT?"), makeSymbol("KS")), list(makeSymbol("CSETQ"), makeSymbol("ASSIGNMENTS"), list(makeSymbol("APPEND"), makeSymbol("ASSIGNMENTS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-FROM-KB")), makeSymbol("KS"))))), list(list(makeSymbol("CORPUS-P"), makeSymbol("KS")), list(makeSymbol("CSETQ"), makeSymbol("ASSIGNMENTS"), list(makeSymbol("APPEND"), makeSymbol("ASSIGNMENTS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-FROM-CORPUS")), makeSymbol("KS"))))), list(T, list(makeSymbol("ERROR"), makeString("Unknown knowledge source ~a"), makeSymbol("KS"))))), list(makeSymbol("RET"), makeSymbol("ASSIGNMENTS"))));

    public static final SubLSymbol $sym651$OUTER_CATCH_FOR_CYCL_QUERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-QUERY-METHOD");

    public static final SubLSymbol GET_FROM_KB = makeSymbol("GET-FROM-KB");

    public static final SubLSymbol GET_FROM_CORPUS = makeSymbol("GET-FROM-CORPUS");

    public static final SubLString $str654$Unknown_knowledge_source__a = makeString("Unknown knowledge source ~a");

    public static final SubLSymbol CYCL_QUERY_GET_METHOD = makeSymbol("CYCL-QUERY-GET-METHOD");

    public static final SubLList $list656 = list(makeSymbol("MT"));

    public static final SubLList $list657 = list(makeString("@param MT mt?; the microtheory from which to get an assignment for this query\n   @return listp; a list of variable assignments"), list(makeSymbol("CLET"), list(list(makeSymbol("ANSWERS"), list(makeSymbol("NEW-CYC-QUERY"), makeSymbol("QUERY"), makeSymbol("MT"), makeSymbol("PROPERTIES"))), list(makeSymbol("ASSIGNMENTS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("ANSWER"), makeSymbol("ANSWERS")), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-VAR-ASSIGNMENT"), list(makeSymbol("FIRST"), makeSymbol("ANSWER")), list(makeSymbol("SECOND"), makeSymbol("ANSWER"))), makeSymbol("ASSIGNMENTS"))), list(makeSymbol("RET"), makeSymbol("ASSIGNMENTS"))));

    public static final SubLSymbol $sym658$OUTER_CATCH_FOR_CYCL_QUERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-QUERY-METHOD");

    public static final SubLSymbol CYCL_QUERY_GET_FROM_KB_METHOD = makeSymbol("CYCL-QUERY-GET-FROM-KB-METHOD");

    public static final SubLList $list660 = list(makeSymbol("CORPUS"));

    public static final SubLList $list661 = list(makeString("@param CORPUS corpus-p; the corpus from which to get an assignment for this query\n   @return listp; a list of variable assignments"), list(makeSymbol("CLET"), list(list(makeSymbol("PARAPHRASE"), list(makeSymbol("GENERATE-QUESTION"), makeSymbol("QUERY"))), list(makeSymbol("QUESTION"), list(makeSymbol("FWHEN"), makeSymbol("PARAPHRASE"), list(makeSymbol("NEW-QUESTION"), makeSymbol("PARAPHRASE"), list(makeSymbol("LIST"), makeSymbol("CORPUS"))))), list(makeSymbol("TMP-MT"), list(makeSymbol("NEW-TMP-MT"))), list(makeSymbol("ASSIGNMENTS"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("QUESTION"), list(makeSymbol("PRINC"), makeSymbol("QUESTION")), list(makeSymbol("TERPRI")), list(makeSymbol("CDOLIST"), list(makeSymbol("ANSWER"), list(makeSymbol("LIST"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("QUESTION"), list(makeSymbol("QUOTE"), makeSymbol("ANSWER")))))), list(makeSymbol("PRINC"), makeSymbol("ANSWER")), list(makeSymbol("TERPRI")), list(makeSymbol("CSETQ"), makeSymbol("ASSIGNMENTS"), list(makeSymbol("APPEND"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GENERATE-ASSIGNMENTS")), makeSymbol("ANSWER"), makeSymbol("TMP-MT")), makeSymbol("ASSIGNMENTS"))))), list(makeSymbol("RET"), makeSymbol("ASSIGNMENTS"))));

    public static final SubLSymbol $sym662$OUTER_CATCH_FOR_CYCL_QUERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-QUERY-METHOD");

    public static final SubLSymbol GENERATE_ASSIGNMENTS = makeSymbol("GENERATE-ASSIGNMENTS");

    public static final SubLSymbol CYCL_QUERY_GET_FROM_CORPUS_METHOD = makeSymbol("CYCL-QUERY-GET-FROM-CORPUS-METHOD");

    public static final SubLList $list665 = list(makeSymbol("ANSWER"), makeSymbol("TMP-MT"));

    public static final SubLList $list666 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("ANSWER"), makeSymbol("ANSWER-P")), list(makeSymbol("CLET"), list(list(makeSymbol("ASSIGNMENTS"), NIL), list(makeSymbol("HYP-BINDINGS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("CYCL"), list(makeSymbol("CYCLIFY"), list(makeSymbol("FIM"), makeSymbol("ANSWER"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTENT"))))), list(makeSymbol("CPUSH"), list(makeSymbol("FI-HYPOTHESIZE-INT"), makeSymbol("CYCL"), makeSymbol("TMP-MT")), makeSymbol("HYP-BINDINGS"))), list(makeSymbol("CDOLIST"), list(makeSymbol("BINDING"), list(makeSymbol("NEW-CYC-QUERY"), makeSymbol("QUERY"), makeSymbol("TMP-MT"), makeSymbol("PROPERTIES"))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-VAR-ASSIGNMENT"), list(makeSymbol("FIRST"), makeSymbol("BINDING")), list(makeSymbol("LIST"), list(makeSymbol("SECOND"), makeSymbol("BINDING")), makeSymbol("ANSWER"))), makeSymbol("ASSIGNMENTS"))), list(makeSymbol("RET"), makeSymbol("ASSIGNMENTS"))));

    public static final SubLSymbol $sym667$OUTER_CATCH_FOR_CYCL_QUERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-QUERY-METHOD");

    public static final SubLSymbol ANSWER_P = makeSymbol("ANSWER-P");

    public static final SubLSymbol CYCL_QUERY_GENERATE_ASSIGNMENTS_METHOD = makeSymbol("CYCL-QUERY-GENERATE-ASSIGNMENTS-METHOD");



    public static final SubLString $str671$TEMP_MT_ = makeString("TEMP-MT-");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    public static final SubLList $list673 = list(reader_make_constant_shell(makeString("Microtheory")));

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    private static final SubLObject $$genlMt = reader_make_constant_shell(makeString("genlMt"));

    public static final SubLSymbol VAR_ASSIGNMENT = makeSymbol("VAR-ASSIGNMENT");

    public static final SubLList $list677 = list(list(makeSymbol("BINDINGS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("JUSTIFICATION"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SOURCE"), NIL, makeKeyword("PUBLIC")));





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VAR_ASSIGNMENT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VAR-ASSIGNMENT-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VAR_ASSIGNMENT_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VAR-ASSIGNMENT-INSTANCE");

    public static final SubLSymbol BINDINGS_P = makeSymbol("BINDINGS-P");

    public static final SubLList $list683 = list(makeString("Prints this assignment to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<CYC-ASSIGNMENT: "), makeSymbol("STREAM")), list(makeSymbol("PRINC"), makeSymbol("BINDINGS"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym684$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VAR-ASSIGNMENT-METHOD");

    public static final SubLString $str685$__CYC_ASSIGNMENT__ = makeString("#<CYC-ASSIGNMENT: ");

    public static final SubLSymbol VAR_ASSIGNMENT_PRINT_METHOD = makeSymbol("VAR-ASSIGNMENT-PRINT-METHOD");

    public static final SubLList $list687 = list(makeString("@return binding-list-p; the bindings of this assignment"), list(makeSymbol("RET"), makeSymbol("BINDINGS")));

    public static final SubLSymbol $sym688$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VAR-ASSIGNMENT-METHOD");

    public static final SubLSymbol VAR_ASSIGNMENT_GET_CONTENT_METHOD = makeSymbol("VAR-ASSIGNMENT-GET-CONTENT-METHOD");

    public static final SubLList $list690 = list(makeString("@return listp; the source of this assignment"), list(makeSymbol("RET"), makeSymbol("JUSTIFICATION")));

    public static final SubLSymbol $sym691$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VAR-ASSIGNMENT-METHOD");

    public static final SubLSymbol VAR_ASSIGNMENT_GET_SOURCE_METHOD = makeSymbol("VAR-ASSIGNMENT-GET-SOURCE-METHOD");

    public static final SubLSymbol WORDNET_QUERY = makeSymbol("WORDNET-QUERY");

    public static final SubLList $list694 = list(list(makeSymbol("POS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET"), NIL, makeKeyword("PROTECTED")));



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_WORDNET_QUERY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WORDNET-QUERY-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_WORDNET_QUERY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WORDNET-QUERY-INSTANCE");

    public static final SubLSymbol WORDNET_POS_P = makeSymbol("WORDNET-POS-P");

    public static final SubLList $list699 = list(makeString("noun"), makeString("verb"), makeString("adjective"), makeString("adverb"));

    public static final SubLList $list700 = list(makeString("@return listp; a list of wordnet-glosses for this wordnet query"), list(makeSymbol("CLET"), list(list(makeSymbol("GLOSSES"), NIL), list(makeSymbol("WORD"), list(makeSymbol("NEW-WORD-PROXY"), makeSymbol("QUERY"), makeSymbol("POS")))), list(makeSymbol("PWHEN"), list(makeSymbol("WORD-PROXY-P"), makeSymbol("WORD")), list(makeSymbol("CDOLIST"), list(makeSymbol("SYNSET"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(makeSymbol("QUOTE"), makeSymbol("SYNSETS")))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-WORDNET-GLOSS"), list(makeSymbol("GET-SLOT"), makeSymbol("SYNSET"), list(makeSymbol("QUOTE"), makeSymbol("GLOSS")))), makeSymbol("GLOSSES")))), list(makeSymbol("RET"), makeSymbol("GLOSSES"))));

    public static final SubLSymbol $sym701$OUTER_CATCH_FOR_WORDNET_QUERY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORDNET-QUERY-METHOD");





    public static final SubLSymbol WORDNET_QUERY_GET_METHOD = makeSymbol("WORDNET-QUERY-GET-METHOD");

    public static final SubLSymbol WORDNET_GLOSS = makeSymbol("WORDNET-GLOSS");

    public static final SubLList $list706 = list(list(makeSymbol("GLOSS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SOURCE"), NIL, makeKeyword("PUBLIC")));

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_WORDNET_GLOSS_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WORDNET-GLOSS-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_WORDNET_GLOSS_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WORDNET-GLOSS-INSTANCE");

    public static final SubLList $list709 = list(makeString("@return stringp; the information of this gloss, as a string"), list(makeSymbol("RET"), makeSymbol("GLOSS")));

    public static final SubLSymbol $sym710$OUTER_CATCH_FOR_WORDNET_GLOSS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORDNET-GLOSS-METHOD");

    public static final SubLSymbol WORDNET_GLOSS_GET_CONTENT_METHOD = makeSymbol("WORDNET-GLOSS-GET-CONTENT-METHOD");

    public static final SubLList $list712 = list(makeString("@return objectp; the source of this gloss\n   @note should become more detailled than just saying wordnet"), list(makeSymbol("RET"), makeString("Wordnet 1.7.1")));

    public static final SubLString $str713$Wordnet_1_7_1 = makeString("Wordnet 1.7.1");

    public static final SubLSymbol WORDNET_GLOSS_GET_SOURCE_METHOD = makeSymbol("WORDNET-GLOSS-GET-SOURCE-METHOD");

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLObject $$TheList = reader_make_constant_shell(makeString("TheList"));

    private static final SubLObject $$disjointWith = reader_make_constant_shell(makeString("disjointWith"));

    private static final SubLInteger $int$200000 = makeInteger(200000);

    private static final SubLInteger $int$5000 = makeInteger(5000);



    private static final SubLSymbol $sym721$_ = makeSymbol(">");

    private static final SubLList $list722 = list(list(makeSymbol("FINAL-COUNT")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLList $list724 = list(list(makeSymbol("*GOOGLE-API-METHOD-INVOCATION-COUNT*"), ZERO_INTEGER));





    private static final SubLList $list727 = list(list(makeSymbol("CURRENT-GOOGLE-API-METHOD-INVOCATION-COUNT")));

    private static final SubLString $str728$_S__ = makeString("~S~%");

    private static final SubLSymbol $sym729$_ = makeSymbol("<");



    private static final SubLSymbol $sym731$FORT__ = makeSymbol("FORT-<");



    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $str735$http___www_google_com_search_q__A = makeString("http://www.google.com/search?q=~A&start=~A&num=~A");

    public static SubLObject subloop_reserved_initialize_information_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_information_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        return NIL;
    }

    public static SubLObject information_p(final SubLObject information) {
        return classes.subloop_instanceof_class(information, INFORMATION);
    }

    public static SubLObject information_get_source_method(final SubLObject self) {
        return NIL;
    }

    public static SubLObject get_abstract_passage_vector(final SubLObject abstract_passage) {
        return classes.subloop_get_access_protected_instance_slot(abstract_passage, ONE_INTEGER, VECTOR);
    }

    public static SubLObject set_abstract_passage_vector(final SubLObject abstract_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(abstract_passage, value, ONE_INTEGER, VECTOR);
    }

    public static SubLObject subloop_reserved_initialize_abstract_passage_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_abstract_passage_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_PASSAGE, VECTOR, NIL);
        return NIL;
    }

    public static SubLObject abstract_passage_p(final SubLObject abstract_passage) {
        return classes.subloop_instanceof_class(abstract_passage, ABSTRACT_PASSAGE);
    }

    public static SubLObject abstract_passage_equal_method(final SubLObject self, final SubLObject v_object) {
        return makeBoolean((NIL != abstract_passage_p(v_object)) && methods.funcall_instance_method_with_0_args(self, GET_CONTENT).equalp(methods.funcall_instance_method_with_0_args(v_object, GET_CONTENT)));
    }

    public static SubLObject abstract_passage_similarity_method(final SubLObject self, final SubLObject passage1, final SubLObject passage2) {
        assert NIL != abstract_passage_p(passage1) : "search_engine.abstract_passage_p(passage1) " + "CommonSymbols.NIL != search_engine.abstract_passage_p(passage1) " + passage1;
        assert NIL != abstract_passage_p(passage2) : "search_engine.abstract_passage_p(passage2) " + "CommonSymbols.NIL != search_engine.abstract_passage_p(passage2) " + passage2;
        if (NIL != Strings.stringE(methods.funcall_instance_method_with_0_args(passage1, GET_CONTENT), methods.funcall_instance_method_with_0_args(passage2, GET_CONTENT), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return ONE_INTEGER;
        }
        return scenario.safe_svector_cosine_angle(methods.funcall_instance_method_with_0_args(passage1, GET_VECTOR), methods.funcall_instance_method_with_0_args(passage2, GET_VECTOR), UNPROVIDED);
    }

    public static SubLObject abstract_passage_get_dates_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject dates = NIL;
        SubLObject date = NIL;
        thread.resetMultipleValues();
        final SubLObject thisday = numeric_date_utilities.decode_universal_date(numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED));
        final SubLObject thismonth = thread.secondMultipleValue();
        final SubLObject thisyear = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject pday = numeric_date_utilities.decode_universal_date(date_utilities.cycl_date_to_universal_date(methods.funcall_instance_method_with_0_args(self, GET_PUBLICATION_DATE)));
        final SubLObject pmonth = thread.secondMultipleValue();
        final SubLObject pyear = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = external_interfaces.resporator(methods.funcall_instance_method_with_0_args(self, GET_CONTENT), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject typeXstring = NIL;
        typeXstring = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != subl_promotions.memberP(typeXstring.first(), $list30, EQL, UNPROVIDED)) {
                date = external_interfaces.parse_date(typeXstring.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != date) {
                    thread.resetMultipleValues();
                    final SubLObject second = numeric_date_utilities.decode_extended_universal_date(date);
                    final SubLObject minute = thread.secondMultipleValue();
                    final SubLObject hour = thread.thirdMultipleValue();
                    final SubLObject day = thread.fourthMultipleValue();
                    final SubLObject month = thread.fifthMultipleValue();
                    SubLObject year = thread.sixthMultipleValue();
                    thread.resetMultipleValues();
                    if (year.numE(thisyear)) {
                        year = guess_year(pyear, pmonth, pday, month, day);
                    }
                    dates = cons(date_utilities.construct_reduced_cycl_date(NIL, NIL, NIL, day, month, year), dates);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            typeXstring = cdolist_list_var.first();
        } 
        return dates;
    }

    public static SubLObject abstract_passage_older_method(final SubLObject self, final SubLObject other_passage) {
        assert NIL != abstract_passage_p(other_passage) : "search_engine.abstract_passage_p(other_passage) " + "CommonSymbols.NIL != search_engine.abstract_passage_p(other_passage) " + other_passage;
        final SubLObject self_date = methods.funcall_instance_method_with_0_args(self, GET_PUBLICATION_DATE);
        final SubLObject other_date = methods.funcall_instance_method_with_0_args(other_passage, GET_PUBLICATION_DATE);
        if ((NIL == date_utilities.date_p(self_date)) || (NIL == date_utilities.date_p(other_date))) {
            return NIL;
        }
        if (NIL != date_utilities.dateL(self_date, other_date)) {
            return T;
        }
        final SubLObject self_doc_id = instances.get_slot(self, DOC_ID);
        if (NIL == self_doc_id) {
            return NIL;
        }
        if (!self_doc_id.equal(instances.get_slot(other_passage, DOC_ID))) {
            return NIL;
        }
        final SubLObject self_sentence_num = instances.get_slot(self, SENTENCE_NUMBER);
        final SubLObject other_sentence_num = instances.get_slot(other_passage, SENTENCE_NUMBER);
        if ((!self_sentence_num.isInteger()) || (!other_sentence_num.isInteger())) {
            return NIL;
        }
        return numL(self_sentence_num, other_sentence_num);
    }

    public static SubLObject guess_year(final SubLObject pub_year, final SubLObject pub_month, final SubLObject pub_day, final SubLObject month, final SubLObject day) {
        final SubLObject pub_date = date_utilities.construct_reduced_cycl_date(NIL, NIL, NIL, pub_day, pub_month, pub_year);
        final SubLObject next_year_date = date_utilities.construct_reduced_cycl_date(NIL, NIL, NIL, day, month, number_utilities.f_1X(pub_year));
        final SubLObject this_year_date = date_utilities.construct_reduced_cycl_date(NIL, NIL, NIL, day, month, pub_year);
        final SubLObject previous_year_date = date_utilities.construct_reduced_cycl_date(NIL, NIL, NIL, day, month, number_utilities.f_1_(pub_year));
        final SubLObject next_year_delta = cycl_utilities.formula_arg1(date_utilities.time_elapsed(pub_date, next_year_date, UNPROVIDED), UNPROVIDED);
        final SubLObject this_year_delta = cycl_utilities.formula_arg1(date_utilities.time_elapsed(pub_date, this_year_date, UNPROVIDED), UNPROVIDED);
        final SubLObject previous_year_delta = cycl_utilities.formula_arg1(date_utilities.time_elapsed(pub_date, previous_year_date, UNPROVIDED), UNPROVIDED);
        final SubLObject min = min(next_year_delta, new SubLObject[]{ this_year_delta, previous_year_delta });
        if (min.numE(next_year_delta)) {
            return number_utilities.f_1X(pub_year);
        }
        if (min.numE(this_year_delta)) {
            return pub_year;
        }
        if (min.numE(previous_year_delta)) {
            return number_utilities.f_1_(pub_year);
        }
        return NIL;
    }

    public static SubLObject abstract_passage_get_publication_date_method(final SubLObject self) {
        return NIL;
    }

    public static SubLObject passage_equal(final SubLObject passage1, final SubLObject passage2) {
        return methods.funcall_instance_method_with_1_args(passage1, EQUAL, passage2);
    }

    public static SubLObject get_simple_passage_text(final SubLObject simple_passage) {
        return classes.subloop_get_access_protected_instance_slot(simple_passage, TWO_INTEGER, TEXT);
    }

    public static SubLObject set_simple_passage_text(final SubLObject simple_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(simple_passage, value, TWO_INTEGER, TEXT);
    }

    public static SubLObject subloop_reserved_initialize_simple_passage_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_simple_passage_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_PASSAGE, VECTOR, NIL);
        classes.subloop_initialize_slot(new_instance, SIMPLE_PASSAGE, TEXT, NIL);
        return NIL;
    }

    public static SubLObject simple_passage_p(final SubLObject simple_passage) {
        return classes.subloop_instanceof_class(simple_passage, SIMPLE_PASSAGE);
    }

    public static SubLObject new_simple_passage(final SubLObject text) {
        final SubLObject passage = object.new_class_instance(SIMPLE_PASSAGE);
        set_simple_passage_text(passage, text);
        return passage;
    }

    public static SubLObject simple_passage_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_simple_passage_method = NIL;
        final SubLObject text = get_simple_passage_text(self);
        try {
            thread.throwStack.push($sym49$OUTER_CATCH_FOR_SIMPLE_PASSAGE_METHOD);
            try {
                princ(text, stream);
                sublisp_throw($sym49$OUTER_CATCH_FOR_SIMPLE_PASSAGE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_simple_passage_text(self, text);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_simple_passage_method = Errors.handleThrowable(ccatch_env_var, $sym49$OUTER_CATCH_FOR_SIMPLE_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_simple_passage_method;
    }

    public static SubLObject simple_passage_get_content_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_simple_passage_method = NIL;
        final SubLObject text = get_simple_passage_text(self);
        try {
            thread.throwStack.push($sym52$OUTER_CATCH_FOR_SIMPLE_PASSAGE_METHOD);
            try {
                sublisp_throw($sym52$OUTER_CATCH_FOR_SIMPLE_PASSAGE_METHOD, text);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_simple_passage_text(self, text);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_simple_passage_method = Errors.handleThrowable(ccatch_env_var, $sym52$OUTER_CATCH_FOR_SIMPLE_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_simple_passage_method;
    }

    public static SubLObject get_corpus_passage_text(final SubLObject corpus_passage) {
        return classes.subloop_get_access_protected_instance_slot(corpus_passage, THREE_INTEGER, TEXT);
    }

    public static SubLObject set_corpus_passage_text(final SubLObject corpus_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(corpus_passage, value, THREE_INTEGER, TEXT);
    }

    public static SubLObject get_corpus_passage_corpus(final SubLObject corpus_passage) {
        return classes.subloop_get_access_protected_instance_slot(corpus_passage, TWO_INTEGER, CORPUS);
    }

    public static SubLObject set_corpus_passage_corpus(final SubLObject corpus_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(corpus_passage, value, TWO_INTEGER, CORPUS);
    }

    public static SubLObject subloop_reserved_initialize_corpus_passage_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_corpus_passage_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_PASSAGE, VECTOR, NIL);
        classes.subloop_initialize_slot(new_instance, CORPUS_PASSAGE, CORPUS, NIL);
        classes.subloop_initialize_slot(new_instance, CORPUS_PASSAGE, TEXT, NIL);
        return NIL;
    }

    public static SubLObject corpus_passage_p(final SubLObject corpus_passage) {
        return classes.subloop_instanceof_class(corpus_passage, CORPUS_PASSAGE);
    }

    public static SubLObject corpus_passage_get_corpus_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_corpus_passage_method = NIL;
        final SubLObject corpus = get_corpus_passage_corpus(self);
        try {
            thread.throwStack.push($sym61$OUTER_CATCH_FOR_CORPUS_PASSAGE_METHOD);
            try {
                sublisp_throw($sym61$OUTER_CATCH_FOR_CORPUS_PASSAGE_METHOD, corpus);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_corpus_passage_corpus(self, corpus);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_corpus_passage_method = Errors.handleThrowable(ccatch_env_var, $sym61$OUTER_CATCH_FOR_CORPUS_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_corpus_passage_method;
    }

    public static SubLObject abstract_passage_get_vector_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_abstract_passage_method = NIL;
        SubLObject vector = get_abstract_passage_vector(self);
        try {
            thread.throwStack.push($sym64$OUTER_CATCH_FOR_ABSTRACT_PASSAGE_METHOD);
            try {
                if (NIL == vector) {
                    vector = question.new_string_vector(methods.funcall_instance_method_with_0_args(self, GET_CONTENT));
                }
                sublisp_throw($sym64$OUTER_CATCH_FOR_ABSTRACT_PASSAGE_METHOD, vector);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_abstract_passage_vector(self, vector);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_abstract_passage_method = Errors.handleThrowable(ccatch_env_var, $sym64$OUTER_CATCH_FOR_ABSTRACT_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_abstract_passage_method;
    }

    public static SubLObject corpus_passage_get_content_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_corpus_passage_method = NIL;
        final SubLObject text = get_corpus_passage_text(self);
        try {
            thread.throwStack.push($sym66$OUTER_CATCH_FOR_CORPUS_PASSAGE_METHOD);
            try {
                sublisp_throw($sym66$OUTER_CATCH_FOR_CORPUS_PASSAGE_METHOD, text);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_corpus_passage_text(self, text);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_corpus_passage_method = Errors.handleThrowable(ccatch_env_var, $sym66$OUTER_CATCH_FOR_CORPUS_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_corpus_passage_method;
    }

    public static SubLObject corpus_passage_identify_entities_method(final SubLObject self, final SubLObject lexicon, SubLObject types_to_identify) {
        if (types_to_identify == UNPROVIDED) {
            types_to_identify = $list71;
        }
        assert NIL != listp(types_to_identify) : "Types.listp(types_to_identify) " + "CommonSymbols.NIL != Types.listp(types_to_identify) " + types_to_identify;
        assert NIL != abstract_lexicon.abstract_lexicon_p(lexicon) : "abstract_lexicon.abstract_lexicon_p(lexicon) " + "CommonSymbols.NIL != abstract_lexicon.abstract_lexicon_p(lexicon) " + lexicon;
        methods.funcall_instance_method_with_1_args(lexicon, LEARN, methods.funcall_instance_method_with_0_args(self, GET_CONTENT));
        final SubLObject tagger = pos_tagger.get_tagger();
        SubLObject entities = NIL;
        final SubLObject vector_var;
        final SubLObject sentences = vector_var = document.string_sentencify(methods.funcall_instance_method_with_0_args(self, GET_CONTENT), UNPROVIDED);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sentence;
        SubLObject tagged;
        SubLObject lexified;
        SubLObject cdolist_list_var;
        SubLObject word;
        SubLObject cdolist_list_var_$1;
        SubLObject lex_entry;
        SubLObject denot;
        SubLObject pos_tags;
        SubLObject string;
        SubLObject cdolist_list_var_$2;
        SubLObject type;
        SubLObject entity;
        SubLObject item_var;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            sentence = aref(vector_var, element_num);
            tagged = pos_tagger.tagger_tag_sentence(tagger, sentence);
            lexified = methods.funcall_instance_method_with_1_args(lexicon, LEXIFY_SENTENCE, tagged);
            cdolist_list_var = document.sentence_yield_exhaustive(lexified);
            word = NIL;
            word = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cdolist_list_var_$1 = document.word_info(word);
                lex_entry = NIL;
                lex_entry = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    denot = (NIL != semtrans_lexicon.semtrans_lexicon_p(lexicon)) ? semtrans_lexicon.extract_cycl_from_semtrans_lex_entry(lex_entry, UNPROVIDED) : methods.funcall_instance_method_with_1_args(lex_entry, GET, $DENOT);
                    pos_tags = methods.funcall_instance_method_with_1_args(lex_entry, GET, $PENN_TAGS);
                    string = methods.funcall_instance_method_with_1_args(lex_entry, GET, $STRING);
                    if (length(string).numG(ONE_INTEGER) && (NIL != intersection(pos_tags, $list80, UNPROVIDED, UNPROVIDED))) {
                        cdolist_list_var_$2 = types_to_identify;
                        type = NIL;
                        type = cdolist_list_var_$2.first();
                        while (NIL != cdolist_list_var_$2) {
                            if (NIL != at_utilities.more_specific_p(denot, type, UNPROVIDED)) {
                                if (NIL == kb_accessors.individualP(denot)) {
                                    denot = make_el_formula($$InstanceNamedFn, list(string, denot), UNPROVIDED);
                                }
                                entity = focus_entity.new_textual_focus_entity(string, denot, UNPROVIDED);
                                methods.funcall_instance_method_with_1_args(entity, ADD_PASSAGE, self);
                                item_var = entity;
                                if (NIL == member(item_var, entities, EQUALP, symbol_function(IDENTITY))) {
                                    entities = cons(item_var, entities);
                                }
                            }
                            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                            type = cdolist_list_var_$2.first();
                        } 
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    lex_entry = cdolist_list_var_$1.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            } 
        }
        return entities;
    }

    public static SubLObject corpus_passage_max_instances_method(final SubLObject self, final SubLObject passages) {
        assert NIL != listp(passages) : "Types.listp(passages) " + "CommonSymbols.NIL != Types.listp(passages) " + passages;
        SubLObject max_score = ZERO_INTEGER;
        SubLObject max_passages = NIL;
        SubLObject cdolist_list_var = passages;
        SubLObject passage = NIL;
        passage = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (methods.funcall_instance_method_with_0_args(passage, GET_SCORE).numG(max_score)) {
                max_score = methods.funcall_instance_method_with_0_args(passage, GET_SCORE);
            }
            cdolist_list_var = cdolist_list_var.rest();
            passage = cdolist_list_var.first();
        } 
        cdolist_list_var = passages;
        passage = NIL;
        passage = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (methods.funcall_instance_method_with_0_args(passage, GET_SCORE).numE(max_score)) {
                max_passages = cons(passage, max_passages);
            }
            cdolist_list_var = cdolist_list_var.rest();
            passage = cdolist_list_var.first();
        } 
        return max_passages;
    }

    public static SubLObject corpus_passage_get_parse_trees_method(final SubLObject self) {
        final SubLObject v_document = document.new_document(make_string_input_stream(methods.funcall_instance_method_with_0_args(self, GET_CONTENT), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        SubLObject trees = NIL;
        final SubLObject vector_var = document.document_paragraphs(v_document);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$3;
        SubLObject backwardP_var_$4;
        SubLObject length_$5;
        SubLObject v_iteration_$6;
        SubLObject element_num_$7;
        SubLObject sentence;
        SubLObject sent_string;
        SubLObject v_parse_tree;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            vector_var_$3 = document.paragraph_sentences(paragraph);
            backwardP_var_$4 = NIL;
            for (length_$5 = length(vector_var_$3), v_iteration_$6 = NIL, v_iteration_$6 = ZERO_INTEGER; v_iteration_$6.numL(length_$5); v_iteration_$6 = add(v_iteration_$6, ONE_INTEGER)) {
                element_num_$7 = (NIL != backwardP_var_$4) ? subtract(length_$5, v_iteration_$6, ONE_INTEGER) : v_iteration_$6;
                sentence = aref(vector_var_$3, element_num_$7);
                sent_string = document.sentence_string(sentence);
                v_parse_tree = NIL;
                if (NIL != sent_string) {
                    v_parse_tree = methods.funcall_instance_method_with_1_args(methods.funcall_class_method_with_0_args(CHARNIAK_PARSER, GET_PARSER), PARSE, sent_string);
                    if (NIL != v_parse_tree) {
                        trees = cons(v_parse_tree, trees);
                    }
                }
            }
        }
        return trees;
    }

    public static SubLObject get_information_request_timeout(final SubLObject information_request) {
        return classes.subloop_get_access_protected_instance_slot(information_request, TWO_INTEGER, TIMEOUT);
    }

    public static SubLObject set_information_request_timeout(final SubLObject information_request, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(information_request, value, TWO_INTEGER, TIMEOUT);
    }

    public static SubLObject get_information_request_error_handling(final SubLObject information_request) {
        return classes.subloop_get_access_protected_instance_slot(information_request, ONE_INTEGER, ERROR_HANDLING);
    }

    public static SubLObject set_information_request_error_handling(final SubLObject information_request, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(information_request, value, ONE_INTEGER, ERROR_HANDLING);
    }

    public static SubLObject subloop_reserved_initialize_information_request_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_information_request_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, ERROR_HANDLING, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, TIMEOUT, NIL);
        return NIL;
    }

    public static SubLObject information_request_p(final SubLObject information_request) {
        return classes.subloop_instanceof_class(information_request, INFORMATION_REQUEST);
    }

    public static SubLObject information_request_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_information_request_method = NIL;
        SubLObject timeout = get_information_request_timeout(self);
        SubLObject error_handling = get_information_request_error_handling(self);
        try {
            thread.throwStack.push($sym103$OUTER_CATCH_FOR_INFORMATION_REQUEST_METHOD);
            try {
                object.object_initialize_method(self);
                error_handling = $WARN;
                timeout = $int$720;
                sublisp_throw($sym103$OUTER_CATCH_FOR_INFORMATION_REQUEST_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_information_request_timeout(self, timeout);
                    set_information_request_error_handling(self, error_handling);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_information_request_method = Errors.handleThrowable(ccatch_env_var, $sym103$OUTER_CATCH_FOR_INFORMATION_REQUEST_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_information_request_method;
    }

    public static SubLObject get_knowledge_source_query_query(final SubLObject knowledge_source_query) {
        return classes.subloop_get_access_protected_instance_slot(knowledge_source_query, THREE_INTEGER, QUERY);
    }

    public static SubLObject set_knowledge_source_query_query(final SubLObject knowledge_source_query, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(knowledge_source_query, value, THREE_INTEGER, QUERY);
    }

    public static SubLObject subloop_reserved_initialize_knowledge_source_query_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_knowledge_source_query_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, ERROR_HANDLING, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, KNOWLEDGE_SOURCE_QUERY, QUERY, NIL);
        return NIL;
    }

    public static SubLObject knowledge_source_query_p(final SubLObject knowledge_source_query) {
        return classes.subloop_instanceof_class(knowledge_source_query, KNOWLEDGE_SOURCE_QUERY);
    }

    public static SubLObject knowledge_source_query_answer_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_knowledge_source_query_method = NIL;
        final SubLObject timeout = get_information_request_timeout(self);
        try {
            thread.throwStack.push($sym114$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD);
            try {
                SubLObject answers = NIL;
                SubLObject error = NIL;
                SubLObject timedoutP = NIL;
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            final SubLObject tag = with_timeout_make_tag();
                            try {
                                thread.throwStack.push(tag);
                                final SubLObject _prev_bind_0_$8 = $within_with_timeout$.currentBinding(thread);
                                try {
                                    $within_with_timeout$.bind(T, thread);
                                    SubLObject timer = NIL;
                                    try {
                                        final SubLObject _prev_bind_0_$9 = $with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = with_timeout_start_timer(timeout, tag);
                                            answers = methods.funcall_instance_method_with_0_args(self, GET);
                                        } finally {
                                            $with_timeout_nesting_depth$.rebind(_prev_bind_0_$9, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            with_timeout_stop_timer(timer);
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                        }
                                    }
                                } finally {
                                    $within_with_timeout$.rebind(_prev_bind_0_$8, thread);
                                }
                            } catch (final Throwable ccatch_env_var) {
                                timedoutP = Errors.handleThrowable(ccatch_env_var, tag);
                            } finally {
                                thread.throwStack.pop();
                            }
                            if (NIL != timedoutP) {
                                Errors.error($str116$Query_execution_timeout_after__a_, timeout);
                            }
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var2) {
                    error = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
                if (NIL != error) {
                    methods.funcall_instance_method_with_1_args(self, HANDLE_ERROR, error);
                }
                sublisp_throw($sym114$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD, answers);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    set_information_request_timeout(self, timeout);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var3) {
            catch_var_for_knowledge_source_query_method = Errors.handleThrowable(ccatch_env_var3, $sym114$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_knowledge_source_query_method;
    }

    public static SubLObject knowledge_source_query_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_knowledge_source_query_method = NIL;
        final SubLObject query = get_knowledge_source_query_query(self);
        try {
            thread.throwStack.push($sym120$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD);
            try {
                write_string($str121$__QUERY__, stream, UNPROVIDED, UNPROVIDED);
                prin1(query, stream);
                write_string($str122$_, stream, UNPROVIDED, UNPROVIDED);
                terpri(stream);
                sublisp_throw($sym120$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_knowledge_source_query_query(self, query);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_knowledge_source_query_method = Errors.handleThrowable(ccatch_env_var, $sym120$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_knowledge_source_query_method;
    }

    public static SubLObject knowledge_source_query_handle_error_method(final SubLObject self, final SubLObject error) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_knowledge_source_query_method = NIL;
        final SubLObject error_handling = get_information_request_error_handling(self);
        try {
            thread.throwStack.push($sym126$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD);
            try {
                final SubLObject pcase_var = error_handling;
                if (pcase_var.eql($THROW)) {
                    Errors.error(error);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(error);
                    }

            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_information_request_error_handling(self, error_handling);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_knowledge_source_query_method = Errors.handleThrowable(ccatch_env_var, $sym126$OUTER_CATCH_FOR_KNOWLEDGE_SOURCE_QUERY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_knowledge_source_query_method;
    }

    public static SubLObject get_corpus_query_corpus(final SubLObject corpus_query) {
        return classes.subloop_get_access_protected_instance_slot(corpus_query, FOUR_INTEGER, CORPUS);
    }

    public static SubLObject set_corpus_query_corpus(final SubLObject corpus_query, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(corpus_query, value, FOUR_INTEGER, CORPUS);
    }

    public static SubLObject subloop_reserved_initialize_corpus_query_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_corpus_query_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, ERROR_HANDLING, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, KNOWLEDGE_SOURCE_QUERY, QUERY, NIL);
        classes.subloop_initialize_slot(new_instance, CORPUS_QUERY, CORPUS, NIL);
        return NIL;
    }

    public static SubLObject corpus_query_p(final SubLObject corpus_query) {
        return classes.subloop_instanceof_class(corpus_query, CORPUS_QUERY);
    }

    public static SubLObject corpus_query_get_corpus_path_mapping_method(final SubLObject self) {
        return NIL;
    }

    public static SubLObject corpus_query_get_corpus_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_corpus_query_method = NIL;
        final SubLObject corpus = get_corpus_query_corpus(self);
        try {
            thread.throwStack.push($sym138$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD);
            try {
                sublisp_throw($sym138$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD, corpus);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_corpus_query_corpus(self, corpus);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_corpus_query_method = Errors.handleThrowable(ccatch_env_var, $sym138$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_corpus_query_method;
    }

    public static SubLObject corpus_query_get_corpus_path_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_corpus_query_method = NIL;
        final SubLObject corpus = get_corpus_query_corpus(self);
        try {
            thread.throwStack.push($sym142$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD);
            try {
                sublisp_throw($sym142$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD, assoc(corpus, methods.funcall_class_method_with_0_args(self, GET_CORPUS_PATH_MAPPING), EQUALP, UNPROVIDED).rest());
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_corpus_query_corpus(self, corpus);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_corpus_query_method = Errors.handleThrowable(ccatch_env_var, $sym142$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_corpus_query_method;
    }

    public static SubLObject corpus_query_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_corpus_query_method = NIL;
        final SubLObject corpus = get_corpus_query_corpus(self);
        final SubLObject query = get_knowledge_source_query_query(self);
        try {
            thread.throwStack.push($sym145$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD);
            try {
                write_string($str146$__QUERY_, stream, UNPROVIDED, UNPROVIDED);
                princ(corpus, stream);
                write_string($str147$___, stream, UNPROVIDED, UNPROVIDED);
                prin1(query, stream);
                write_string($str122$_, stream, UNPROVIDED, UNPROVIDED);
                terpri(stream);
                sublisp_throw($sym145$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_corpus_query_corpus(self, corpus);
                    set_knowledge_source_query_query(self, query);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_corpus_query_method = Errors.handleThrowable(ccatch_env_var, $sym145$OUTER_CATCH_FOR_CORPUS_QUERY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_corpus_query_method;
    }

    public static SubLObject subloop_reserved_initialize_glimpse_query_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_glimpse_query_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, ERROR_HANDLING, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, KNOWLEDGE_SOURCE_QUERY, QUERY, NIL);
        classes.subloop_initialize_slot(new_instance, CORPUS_QUERY, CORPUS, NIL);
        return NIL;
    }

    public static SubLObject glimpse_query_p(final SubLObject glimpse_query) {
        return classes.subloop_instanceof_class(glimpse_query, GLIMPSE_QUERY);
    }

    public static SubLObject new_glimpse_query(final SubLObject string, SubLObject corpus) {
        if (corpus == UNPROVIDED) {
            corpus = $default_corpus$.getDynamicValue();
        }
        final SubLObject query = object.new_class_instance(GLIMPSE_QUERY);
        set_knowledge_source_query_query(query, string);
        set_corpus_query_corpus(query, corpus);
        if (NIL == methods.funcall_instance_method_with_0_args(query, GET_CORPUS_PATH)) {
            Errors.error($str153$Non_supported_corpus__a, corpus);
        }
        return query;
    }

    public static SubLObject glimpse_query_get_corpus_path_mapping_method(final SubLObject self) {
        return $list155;
    }

    public static SubLObject glimpse_query_get_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_glimpse_query_method = NIL;
        final SubLObject query = get_knowledge_source_query_query(self);
        try {
            thread.throwStack.push($sym159$OUTER_CATCH_FOR_GLIMPSE_QUERY_METHOD);
            try {
                SubLObject passages = NIL;
                SubLObject cdolist_list_var;
                final SubLObject answers = cdolist_list_var = ask_glimpse(query, bq_cons(list($$$index, methods.funcall_instance_method_with_0_args(self, GET_CORPUS_PATH)), $list161), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject v_answer = NIL;
                v_answer = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject current;
                    final SubLObject datum = current = v_answer;
                    final SubLObject file_tail = property_list_member($FILE, current);
                    final SubLObject file = (NIL != file_tail) ? cadr(file_tail) : NIL;
                    final SubLObject article_tail = property_list_member($ARTICLE, current);
                    final SubLObject article = (NIL != article_tail) ? cadr(article_tail) : NIL;
                    final SubLObject line_tail = property_list_member($LINE, current);
                    final SubLObject line = (NIL != line_tail) ? cadr(line_tail) : NIL;
                    final SubLObject text_tail = property_list_member($TEXT, current);
                    final SubLObject text = (NIL != text_tail) ? cadr(text_tail) : NIL;
                    passages = cons(new_glimpse_passage(methods.funcall_instance_method_with_0_args(self, GET_CORPUS), file, article, line, text), passages);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_answer = cdolist_list_var.first();
                } 
                sublisp_throw($sym159$OUTER_CATCH_FOR_GLIMPSE_QUERY_METHOD, remove_duplicates(passages, symbol_function(PASSAGE_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_knowledge_source_query_query(self, query);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_glimpse_query_method = Errors.handleThrowable(ccatch_env_var, $sym159$OUTER_CATCH_FOR_GLIMPSE_QUERY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_glimpse_query_method;
    }

    public static SubLObject ask_glimpse(final SubLObject query, SubLObject options, SubLObject path, SubLObject host, SubLObject port, SubLObject method) {
        if (options == UNPROVIDED) {
            options = NIL;
        }
        if (path == UNPROVIDED) {
            path = cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), $str168$_glimpse_cgi);
        }
        if (host == UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        return read_from_string(web_utilities.http_retrieve(bq_cons(list($$$query, query), append(options, NIL)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_glimpse_passage_line(final SubLObject glimpse_passage) {
        return classes.subloop_get_access_protected_instance_slot(glimpse_passage, SIX_INTEGER, LINE);
    }

    public static SubLObject set_glimpse_passage_line(final SubLObject glimpse_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(glimpse_passage, value, SIX_INTEGER, LINE);
    }

    public static SubLObject get_glimpse_passage_article(final SubLObject glimpse_passage) {
        return classes.subloop_get_access_protected_instance_slot(glimpse_passage, FIVE_INTEGER, ARTICLE);
    }

    public static SubLObject set_glimpse_passage_article(final SubLObject glimpse_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(glimpse_passage, value, FIVE_INTEGER, ARTICLE);
    }

    public static SubLObject get_glimpse_passage_file(final SubLObject glimpse_passage) {
        return classes.subloop_get_access_protected_instance_slot(glimpse_passage, FOUR_INTEGER, FILE);
    }

    public static SubLObject set_glimpse_passage_file(final SubLObject glimpse_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(glimpse_passage, value, FOUR_INTEGER, FILE);
    }

    public static SubLObject subloop_reserved_initialize_glimpse_passage_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_glimpse_passage_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_PASSAGE, VECTOR, NIL);
        classes.subloop_initialize_slot(new_instance, CORPUS_PASSAGE, CORPUS, NIL);
        classes.subloop_initialize_slot(new_instance, CORPUS_PASSAGE, TEXT, NIL);
        classes.subloop_initialize_slot(new_instance, GLIMPSE_PASSAGE, FILE, NIL);
        classes.subloop_initialize_slot(new_instance, GLIMPSE_PASSAGE, ARTICLE, NIL);
        classes.subloop_initialize_slot(new_instance, GLIMPSE_PASSAGE, LINE, NIL);
        return NIL;
    }

    public static SubLObject glimpse_passage_p(final SubLObject glimpse_passage) {
        return classes.subloop_instanceof_class(glimpse_passage, GLIMPSE_PASSAGE);
    }

    public static SubLObject new_glimpse_passage(final SubLObject corpus, final SubLObject file, final SubLObject article, final SubLObject line, final SubLObject text) {
        assert NIL != stringp(corpus) : "Types.stringp(corpus) " + "CommonSymbols.NIL != Types.stringp(corpus) " + corpus;
        assert NIL != stringp(file) : "Types.stringp(file) " + "CommonSymbols.NIL != Types.stringp(file) " + file;
        assert NIL != subl_promotions.non_negative_integer_p(line) : "subl_promotions.non_negative_integer_p(line) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(line) " + line;
        assert NIL != Strings.string(text) : "Strings.string(text) " + "CommonSymbols.NIL != Strings.string(text) " + text;
        final SubLObject passage = object.new_class_instance(GLIMPSE_PASSAGE);
        set_corpus_passage_corpus(passage, corpus);
        set_glimpse_passage_file(passage, file);
        set_glimpse_passage_article(passage, article);
        set_glimpse_passage_line(passage, line);
        set_corpus_passage_text(passage, text);
        return passage;
    }

    public static SubLObject glimpse_passage_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_glimpse_passage_method = NIL;
        final SubLObject text = get_corpus_passage_text(self);
        try {
            thread.throwStack.push($sym182$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD);
            try {
                princ(glimpse_passage_get_source_method(self), stream);
                terpri(stream);
                if (NIL != text) {
                    princ(text, stream);
                }
                sublisp_throw($sym182$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_corpus_passage_text(self, text);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_glimpse_passage_method = Errors.handleThrowable(ccatch_env_var, $sym182$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_glimpse_passage_method;
    }

    public static SubLObject glimpse_passage_get_publication_date_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_glimpse_passage_method = NIL;
        final SubLObject file = get_glimpse_passage_file(self);
        try {
            thread.throwStack.push($sym185$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD);
            try {
                if (length(file).numG(EIGHT_INTEGER)) {
                    final SubLObject year = read_from_string(string_utilities.substring(file, ZERO_INTEGER, FOUR_INTEGER), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject month = read_from_string(string_utilities.substring(file, FOUR_INTEGER, SIX_INTEGER), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject day = read_from_string(string_utilities.substring(file, SIX_INTEGER, EIGHT_INTEGER), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    sublisp_throw($sym185$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD, date_utilities.construct_reduced_cycl_date(NIL, NIL, NIL, day, month, year));
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_glimpse_passage_file(self, file);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_glimpse_passage_method = Errors.handleThrowable(ccatch_env_var, $sym185$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_glimpse_passage_method;
    }

    public static SubLObject glimpse_passage_get_source_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_glimpse_passage_method = NIL;
        final SubLObject line = get_glimpse_passage_line(self);
        final SubLObject article = get_glimpse_passage_article(self);
        final SubLObject file = get_glimpse_passage_file(self);
        final SubLObject corpus = get_corpus_passage_corpus(self);
        try {
            thread.throwStack.push($sym188$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD);
            try {
                sublisp_throw($sym188$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD, format(NIL, $str189$__Corpus___a___File___a___Article, new SubLObject[]{ corpus, file, article, line }));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_glimpse_passage_line(self, line);
                    set_glimpse_passage_article(self, article);
                    set_glimpse_passage_file(self, file);
                    set_corpus_passage_corpus(self, corpus);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_glimpse_passage_method = Errors.handleThrowable(ccatch_env_var, $sym188$OUTER_CATCH_FOR_GLIMPSE_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_glimpse_passage_method;
    }

    public static SubLObject subloop_reserved_initialize_guruqa_query_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_guruqa_query_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, ERROR_HANDLING, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, KNOWLEDGE_SOURCE_QUERY, QUERY, NIL);
        classes.subloop_initialize_slot(new_instance, CORPUS_QUERY, CORPUS, NIL);
        return NIL;
    }

    public static SubLObject guruqa_query_p(final SubLObject guruqa_query) {
        return classes.subloop_instanceof_class(guruqa_query, GURUQA_QUERY);
    }

    public static SubLObject new_guruqa_query(final SubLObject string, SubLObject corpus) {
        if (corpus == UNPROVIDED) {
            corpus = $default_corpus$.getDynamicValue();
        }
        final SubLObject query = object.new_class_instance(GURUQA_QUERY);
        set_knowledge_source_query_query(query, string);
        set_corpus_query_corpus(query, corpus);
        return query;
    }

    public static SubLObject guruqa_query_get_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_guruqa_query_method = NIL;
        final SubLObject query = get_knowledge_source_query_query(self);
        final SubLObject error_handling = get_information_request_error_handling(self);
        try {
            thread.throwStack.push($sym195$OUTER_CATCH_FOR_GURUQA_QUERY_METHOD);
            try {
                final SubLObject indices = external_interfaces.guruqa_answer_indexes(query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject passages = NIL;
                SubLObject cdolist_list_var = indices;
                SubLObject index = NIL;
                index = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    passages = cons(new_guruqa_passage(methods.funcall_instance_method_with_0_args(self, GET_CORPUS), getf(index, $DOC, UNPROVIDED), getf(index, $SENT, UNPROVIDED), getf(index, $LEN, UNPROVIDED), instances.get_slot(self, ERROR_HANDLING)), passages);
                    cdolist_list_var = cdolist_list_var.rest();
                    index = cdolist_list_var.first();
                } 
                sublisp_throw($sym195$OUTER_CATCH_FOR_GURUQA_QUERY_METHOD, nreverse(passages));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_knowledge_source_query_query(self, query);
                    set_information_request_error_handling(self, error_handling);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_guruqa_query_method = Errors.handleThrowable(ccatch_env_var, $sym195$OUTER_CATCH_FOR_GURUQA_QUERY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_guruqa_query_method;
    }

    public static SubLObject get_guruqa_passage_error_handling(final SubLObject guruqa_passage) {
        return classes.subloop_get_access_protected_instance_slot(guruqa_passage, SEVEN_INTEGER, ERROR_HANDLING);
    }

    public static SubLObject set_guruqa_passage_error_handling(final SubLObject guruqa_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(guruqa_passage, value, SEVEN_INTEGER, ERROR_HANDLING);
    }

    public static SubLObject get_guruqa_passage_span(final SubLObject guruqa_passage) {
        return classes.subloop_get_access_protected_instance_slot(guruqa_passage, SIX_INTEGER, SPAN);
    }

    public static SubLObject set_guruqa_passage_span(final SubLObject guruqa_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(guruqa_passage, value, SIX_INTEGER, SPAN);
    }

    public static SubLObject get_guruqa_passage_sentence_id(final SubLObject guruqa_passage) {
        return classes.subloop_get_access_protected_instance_slot(guruqa_passage, FIVE_INTEGER, SENTENCE_ID);
    }

    public static SubLObject set_guruqa_passage_sentence_id(final SubLObject guruqa_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(guruqa_passage, value, FIVE_INTEGER, SENTENCE_ID);
    }

    public static SubLObject get_guruqa_passage_document_id(final SubLObject guruqa_passage) {
        return classes.subloop_get_access_protected_instance_slot(guruqa_passage, FOUR_INTEGER, DOCUMENT_ID);
    }

    public static SubLObject set_guruqa_passage_document_id(final SubLObject guruqa_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(guruqa_passage, value, FOUR_INTEGER, DOCUMENT_ID);
    }

    public static SubLObject subloop_reserved_initialize_guruqa_passage_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_guruqa_passage_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_PASSAGE, VECTOR, NIL);
        classes.subloop_initialize_slot(new_instance, CORPUS_PASSAGE, CORPUS, NIL);
        classes.subloop_initialize_slot(new_instance, CORPUS_PASSAGE, TEXT, NIL);
        classes.subloop_initialize_slot(new_instance, GURUQA_PASSAGE, DOCUMENT_ID, NIL);
        classes.subloop_initialize_slot(new_instance, GURUQA_PASSAGE, SENTENCE_ID, NIL);
        classes.subloop_initialize_slot(new_instance, GURUQA_PASSAGE, SPAN, NIL);
        classes.subloop_initialize_slot(new_instance, GURUQA_PASSAGE, ERROR_HANDLING, NIL);
        return NIL;
    }

    public static SubLObject guruqa_passage_p(final SubLObject guruqa_passage) {
        return classes.subloop_instanceof_class(guruqa_passage, GURUQA_PASSAGE);
    }

    public static SubLObject new_guruqa_passage(final SubLObject corpus, final SubLObject v_document, final SubLObject sentence, SubLObject span, SubLObject error_handling) {
        if (span == UNPROVIDED) {
            span = ZERO_INTEGER;
        }
        if (error_handling == UNPROVIDED) {
            error_handling = $THROW;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(corpus) : "Types.stringp(corpus) " + "CommonSymbols.NIL != Types.stringp(corpus) " + corpus;
        assert NIL != integerp(v_document) : "Types.integerp(v_document) " + "CommonSymbols.NIL != Types.integerp(v_document) " + v_document;
        assert NIL != subl_promotions.non_negative_integer_p(sentence) : "subl_promotions.non_negative_integer_p(sentence) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(sentence) " + sentence;
        assert NIL != subl_promotions.non_negative_integer_p(span) : "subl_promotions.non_negative_integer_p(span) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(span) " + span;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == member(error_handling, $list208, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str209$Invalid_error_handling_tag);
        }
        final SubLObject passage = object.new_class_instance(GURUQA_PASSAGE);
        set_corpus_passage_corpus(passage, corpus);
        set_guruqa_passage_document_id(passage, v_document);
        set_guruqa_passage_sentence_id(passage, sentence);
        set_guruqa_passage_span(passage, span);
        set_guruqa_passage_error_handling(passage, error_handling);
        return passage;
    }

    public static SubLObject guruqa_passage_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_guruqa_passage_method = NIL;
        final SubLObject text = get_corpus_passage_text(self);
        try {
            thread.throwStack.push($sym211$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD);
            try {
                princ(guruqa_passage_get_source_method(self), stream);
                terpri(stream);
                if (NIL != text) {
                    princ(text, stream);
                }
                sublisp_throw($sym211$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_corpus_passage_text(self, text);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_guruqa_passage_method = Errors.handleThrowable(ccatch_env_var, $sym211$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_guruqa_passage_method;
    }

    public static SubLObject guruqa_passage_get_source_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_guruqa_passage_method = NIL;
        final SubLObject span = get_guruqa_passage_span(self);
        final SubLObject sentence_id = get_guruqa_passage_sentence_id(self);
        final SubLObject document_id = get_guruqa_passage_document_id(self);
        final SubLObject corpus = get_corpus_passage_corpus(self);
        try {
            thread.throwStack.push($sym214$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD);
            try {
                sublisp_throw($sym214$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD, format(NIL, $str215$Corpus___a__Document___a__Sentenc, new SubLObject[]{ corpus, document_id, sentence_id, span }));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_guruqa_passage_span(self, span);
                    set_guruqa_passage_sentence_id(self, sentence_id);
                    set_guruqa_passage_document_id(self, document_id);
                    set_corpus_passage_corpus(self, corpus);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_guruqa_passage_method = Errors.handleThrowable(ccatch_env_var, $sym214$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_guruqa_passage_method;
    }

    public static SubLObject guruqa_passage_get_content_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_guruqa_passage_method = NIL;
        final SubLObject span = get_guruqa_passage_span(self);
        final SubLObject sentence_id = get_guruqa_passage_sentence_id(self);
        final SubLObject document_id = get_guruqa_passage_document_id(self);
        SubLObject text = get_corpus_passage_text(self);
        try {
            thread.throwStack.push($sym218$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD);
            try {
                if (NIL == text) {
                    SubLObject error = NIL;
                    try {
                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                text = external_interfaces.guruqa_retrieve_passage(document_id, sentence_id, span, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } catch (final Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    } finally {
                        thread.throwStack.pop();
                    }
                    if (NIL != error) {
                        guruqa_passage_handle_error_method(self, error);
                    }
                }
                sublisp_throw($sym218$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD, text);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_guruqa_passage_span(self, span);
                    set_guruqa_passage_sentence_id(self, sentence_id);
                    set_guruqa_passage_document_id(self, document_id);
                    set_corpus_passage_text(self, text);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var2) {
            catch_var_for_guruqa_passage_method = Errors.handleThrowable(ccatch_env_var2, $sym218$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_guruqa_passage_method;
    }

    public static SubLObject guruqa_passage_handle_error_method(final SubLObject self, final SubLObject error) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_guruqa_passage_method = NIL;
        final SubLObject error_handling = get_guruqa_passage_error_handling(self);
        try {
            thread.throwStack.push($sym220$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD);
            try {
                final SubLObject pcase_var = error_handling;
                if (pcase_var.eql($THROW)) {
                    Errors.error(error);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(error);
                    }

            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_guruqa_passage_error_handling(self, error_handling);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_guruqa_passage_method = Errors.handleThrowable(ccatch_env_var, $sym220$OUTER_CATCH_FOR_GURUQA_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_guruqa_passage_method;
    }

    public static SubLObject get_lemur_query_sentno(final SubLObject lemur_query) {
        return classes.subloop_get_access_protected_instance_slot(lemur_query, SIX_INTEGER, SENTNO);
    }

    public static SubLObject set_lemur_query_sentno(final SubLObject lemur_query, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lemur_query, value, SIX_INTEGER, SENTNO);
    }

    public static SubLObject get_lemur_query_docno(final SubLObject lemur_query) {
        return classes.subloop_get_access_protected_instance_slot(lemur_query, FIVE_INTEGER, DOCNO);
    }

    public static SubLObject set_lemur_query_docno(final SubLObject lemur_query, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lemur_query, value, FIVE_INTEGER, DOCNO);
    }

    public static SubLObject subloop_reserved_initialize_lemur_query_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_lemur_query_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, ERROR_HANDLING, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, KNOWLEDGE_SOURCE_QUERY, QUERY, NIL);
        classes.subloop_initialize_slot(new_instance, CORPUS_QUERY, CORPUS, NIL);
        classes.subloop_initialize_slot(new_instance, LEMUR_QUERY, DOCNO, NIL);
        classes.subloop_initialize_slot(new_instance, LEMUR_QUERY, SENTNO, NIL);
        return NIL;
    }

    public static SubLObject lemur_query_p(final SubLObject lemur_query) {
        return classes.subloop_instanceof_class(lemur_query, LEMUR_QUERY);
    }

    public static SubLObject new_lemur_query(final SubLObject string, SubLObject corpus, SubLObject docno, SubLObject sentno) {
        if (corpus == UNPROVIDED) {
            corpus = $default_corpus$.getDynamicValue();
        }
        if (docno == UNPROVIDED) {
            docno = $int$50;
        }
        if (sentno == UNPROVIDED) {
            sentno = $int$50;
        }
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != subl_promotions.positive_integer_p(docno) : "subl_promotions.positive_integer_p(docno) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(docno) " + docno;
        assert NIL != subl_promotions.positive_integer_p(sentno) : "subl_promotions.positive_integer_p(sentno) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(sentno) " + sentno;
        final SubLObject query = object.new_class_instance(LEMUR_QUERY);
        set_knowledge_source_query_query(query, string);
        set_corpus_query_corpus(query, corpus);
        set_lemur_query_docno(query, docno);
        set_lemur_query_sentno(query, sentno);
        if (NIL == methods.funcall_instance_method_with_0_args(query, GET_CORPUS_PATH)) {
            Errors.error($str153$Non_supported_corpus__a, corpus);
        }
        return query;
    }

    public static SubLObject lemur_query_get_corpus_path_mapping_method(final SubLObject self) {
        return $list231;
    }

    public static SubLObject lemur_query_get_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lemur_query_method = NIL;
        final SubLObject sentno = get_lemur_query_sentno(self);
        final SubLObject docno = get_lemur_query_docno(self);
        final SubLObject query = get_knowledge_source_query_query(self);
        try {
            thread.throwStack.push($sym234$OUTER_CATCH_FOR_LEMUR_QUERY_METHOD);
            try {
                SubLObject passages = NIL;
                SubLObject cdolist_list_var;
                final SubLObject answers = cdolist_list_var = ask_lemur(query, docno, sentno, ONE_INTEGER, methods.funcall_instance_method_with_0_args(self, GET_CORPUS_PATH), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject v_answer = NIL;
                v_answer = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = v_answer;
                    SubLObject id = NIL;
                    SubLObject score = NIL;
                    SubLObject text = NIL;
                    destructuring_bind_must_consp(current, datum, $list235);
                    id = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list235);
                    score = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list235);
                    text = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        passages = cons(new_lemur_passage(methods.funcall_instance_method_with_0_args(self, GET_CORPUS), id, score, strip_passage_header(text)), passages);
                    } else {
                        cdestructuring_bind_error(datum, $list235);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_answer = cdolist_list_var.first();
                } 
                sublisp_throw($sym234$OUTER_CATCH_FOR_LEMUR_QUERY_METHOD, nreverse(remove_duplicates(passages, symbol_function(PASSAGE_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lemur_query_sentno(self, sentno);
                    set_lemur_query_docno(self, docno);
                    set_knowledge_source_query_query(self, query);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lemur_query_method = Errors.handleThrowable(ccatch_env_var, $sym234$OUTER_CATCH_FOR_LEMUR_QUERY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lemur_query_method;
    }

    public static SubLObject ask_lemur(final SubLObject query, SubLObject doc_num, SubLObject sent_num, SubLObject l, SubLObject param_file, SubLObject path, SubLObject host, SubLObject port, SubLObject method, SubLObject options) {
        if (doc_num == UNPROVIDED) {
            doc_num = TEN_INTEGER;
        }
        if (sent_num == UNPROVIDED) {
            sent_num = TEN_INTEGER;
        }
        if (l == UNPROVIDED) {
            l = ONE_INTEGER;
        }
        if (param_file == UNPROVIDED) {
            param_file = $str237$_cyc_projects_aquaint_lemur_indic;
        }
        if (path == UNPROVIDED) {
            path = cconcatenate(web_utilities.$cgi_path$.getDynamicValue(), $str238$_lemur_cgi);
        }
        if (host == UNPROVIDED) {
            host = web_utilities.$cgi_host$.getDynamicValue();
        }
        if (port == UNPROVIDED) {
            port = web_utilities.$cgi_port$.getDynamicValue();
        }
        if (method == UNPROVIDED) {
            method = $POST;
        }
        if (options == UNPROVIDED) {
            options = NIL;
        }
        return read_from_string(web_utilities.http_retrieve(listS(list($$$query, query), list($$$n, sent_num), list($$$N, doc_num), list($$$l, l), list($$$p, param_file), append(options, NIL)), path, host, port, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_lemur_passage_score(final SubLObject lemur_passage) {
        return classes.subloop_get_access_protected_instance_slot(lemur_passage, SIX_INTEGER, SCORE);
    }

    public static SubLObject set_lemur_passage_score(final SubLObject lemur_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lemur_passage, value, SIX_INTEGER, SCORE);
    }

    public static SubLObject get_lemur_passage_sentence_number(final SubLObject lemur_passage) {
        return classes.subloop_get_access_protected_instance_slot(lemur_passage, FIVE_INTEGER, SENTENCE_NUMBER);
    }

    public static SubLObject set_lemur_passage_sentence_number(final SubLObject lemur_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lemur_passage, value, FIVE_INTEGER, SENTENCE_NUMBER);
    }

    public static SubLObject get_lemur_passage_doc_id(final SubLObject lemur_passage) {
        return classes.subloop_get_access_protected_instance_slot(lemur_passage, FOUR_INTEGER, DOC_ID);
    }

    public static SubLObject set_lemur_passage_doc_id(final SubLObject lemur_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lemur_passage, value, FOUR_INTEGER, DOC_ID);
    }

    public static SubLObject subloop_reserved_initialize_lemur_passage_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_lemur_passage_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_PASSAGE, VECTOR, NIL);
        classes.subloop_initialize_slot(new_instance, CORPUS_PASSAGE, CORPUS, NIL);
        classes.subloop_initialize_slot(new_instance, CORPUS_PASSAGE, TEXT, NIL);
        classes.subloop_initialize_slot(new_instance, LEMUR_PASSAGE, DOC_ID, NIL);
        classes.subloop_initialize_slot(new_instance, LEMUR_PASSAGE, SENTENCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LEMUR_PASSAGE, SCORE, NIL);
        return NIL;
    }

    public static SubLObject lemur_passage_p(final SubLObject lemur_passage) {
        return classes.subloop_instanceof_class(lemur_passage, LEMUR_PASSAGE);
    }

    public static SubLObject new_lemur_passage(final SubLObject corpus, final SubLObject id_string, final SubLObject score, final SubLObject text) {
        final SubLObject passage = object.new_class_instance(LEMUR_PASSAGE);
        final SubLObject split = string_utilities.split_string(id_string, $list248);
        final SubLObject doc_id = string_utilities.bunge(butlast(split, UNPROVIDED), CHAR_period);
        final SubLObject sentence_number = parse_integer(last(split, UNPROVIDED).first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        set_corpus_passage_corpus(passage, corpus);
        set_corpus_passage_text(passage, text);
        set_lemur_passage_doc_id(passage, doc_id);
        set_lemur_passage_sentence_number(passage, sentence_number);
        set_lemur_passage_score(passage, score);
        return passage;
    }

    public static SubLObject lemur_passage_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lemur_passage_method = NIL;
        final SubLObject text = get_corpus_passage_text(self);
        try {
            thread.throwStack.push($sym250$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD);
            try {
                princ(lemur_passage_get_source_method(self), stream);
                terpri(stream);
                princ(text, stream);
                sublisp_throw($sym250$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_corpus_passage_text(self, text);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lemur_passage_method = Errors.handleThrowable(ccatch_env_var, $sym250$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lemur_passage_method;
    }

    public static SubLObject lemur_passage_get_source_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lemur_passage_method = NIL;
        final SubLObject score = get_lemur_passage_score(self);
        final SubLObject sentence_number = get_lemur_passage_sentence_number(self);
        final SubLObject doc_id = get_lemur_passage_doc_id(self);
        final SubLObject corpus = get_corpus_passage_corpus(self);
        try {
            thread.throwStack.push($sym253$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD);
            try {
                sublisp_throw($sym253$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD, format(NIL, $str254$__Corpus___a__Source___a__Sentenc, new SubLObject[]{ corpus, doc_id, sentence_number, score }));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lemur_passage_score(self, score);
                    set_lemur_passage_sentence_number(self, sentence_number);
                    set_lemur_passage_doc_id(self, doc_id);
                    set_corpus_passage_corpus(self, corpus);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lemur_passage_method = Errors.handleThrowable(ccatch_env_var, $sym253$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lemur_passage_method;
    }

    public static SubLObject lemur_passage_get_publication_date_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lemur_passage_method = NIL;
        final SubLObject doc_id = get_lemur_passage_doc_id(self);
        try {
            thread.throwStack.push($sym257$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD);
            try {
                if (length(doc_id).numG(ELEVEN_INTEGER)) {
                    final SubLObject year = read_from_string(string_utilities.substring(doc_id, THREE_INTEGER, SEVEN_INTEGER), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject month = read_from_string(string_utilities.substring(doc_id, SEVEN_INTEGER, NINE_INTEGER), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject day = read_from_string(string_utilities.substring(doc_id, NINE_INTEGER, ELEVEN_INTEGER), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    sublisp_throw($sym257$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD, date_utilities.construct_reduced_cycl_date(NIL, NIL, NIL, day, month, year));
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lemur_passage_doc_id(self, doc_id);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lemur_passage_method = Errors.handleThrowable(ccatch_env_var, $sym257$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lemur_passage_method;
    }

    public static SubLObject lemur_passage_get_score_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lemur_passage_method = NIL;
        final SubLObject score = get_lemur_passage_score(self);
        try {
            thread.throwStack.push($sym260$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD);
            try {
                sublisp_throw($sym260$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD, score);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lemur_passage_score(self, score);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lemur_passage_method = Errors.handleThrowable(ccatch_env_var, $sym260$OUTER_CATCH_FOR_LEMUR_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lemur_passage_method;
    }

    public static SubLObject get_qaga_query_augmentation_terms(final SubLObject qaga_query) {
        return classes.subloop_get_access_protected_instance_slot(qaga_query, FIVE_INTEGER, AUGMENTATION_TERMS);
    }

    public static SubLObject set_qaga_query_augmentation_terms(final SubLObject qaga_query, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(qaga_query, value, FIVE_INTEGER, AUGMENTATION_TERMS);
    }

    public static SubLObject subloop_reserved_initialize_qaga_query_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_qaga_query_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, ERROR_HANDLING, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, KNOWLEDGE_SOURCE_QUERY, QUERY, NIL);
        classes.subloop_initialize_slot(new_instance, CORPUS_QUERY, CORPUS, NIL);
        classes.subloop_initialize_slot(new_instance, QAGA_QUERY, AUGMENTATION_TERMS, NIL);
        return NIL;
    }

    public static SubLObject qaga_query_p(final SubLObject qaga_query) {
        return classes.subloop_instanceof_class(qaga_query, QAGA_QUERY);
    }

    public static SubLObject new_qaga_query(final SubLObject string, SubLObject corpus) {
        if (corpus == UNPROVIDED) {
            corpus = $default_corpus$.getDynamicValue();
        }
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        final SubLObject query = object.new_class_instance(QAGA_QUERY);
        set_knowledge_source_query_query(query, string);
        set_corpus_query_corpus(query, corpus);
        return query;
    }

    public static SubLObject qaga_query_get_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_qaga_query_method = NIL;
        SubLObject augmentation_terms = get_qaga_query_augmentation_terms(self);
        final SubLObject query = get_knowledge_source_query_query(self);
        try {
            thread.throwStack.push($sym268$OUTER_CATCH_FOR_QAGA_QUERY_METHOD);
            try {
                SubLObject passages = NIL;
                SubLObject cdolist_list_var;
                final SubLObject answers = cdolist_list_var = external_interfaces.ask_qaga(string_utilities.split_string(query, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject v_answer = NIL;
                v_answer = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject current;
                    final SubLObject datum = current = v_answer;
                    final SubLObject text_tail = property_list_member($TEXT, current);
                    final SubLObject text = (NIL != text_tail) ? cadr(text_tail) : NIL;
                    final SubLObject docid_tail = property_list_member($DOCID, current);
                    final SubLObject docid = (NIL != docid_tail) ? cadr(docid_tail) : NIL;
                    final SubLObject score_tail = property_list_member($SCORE, current);
                    final SubLObject score = (NIL != score_tail) ? cadr(score_tail) : NIL;
                    final SubLObject augment_tail = property_list_member($AUGMENT, current);
                    final SubLObject augment = augmentation_terms = (NIL != augment_tail) ? cadr(augment_tail) : NIL;
                    passages = cons(new_lemur_passage(methods.funcall_instance_method_with_0_args(self, GET_CORPUS), docid, score, text), passages);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_answer = cdolist_list_var.first();
                } 
                sublisp_throw($sym268$OUTER_CATCH_FOR_QAGA_QUERY_METHOD, nreverse(remove_duplicates(passages, symbol_function(PASSAGE_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_qaga_query_augmentation_terms(self, augmentation_terms);
                    set_knowledge_source_query_query(self, query);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_qaga_query_method = Errors.handleThrowable(ccatch_env_var, $sym268$OUTER_CATCH_FOR_QAGA_QUERY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_qaga_query_method;
    }

    public static SubLObject qaga_query_get_augmentation_terms_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_qaga_query_method = NIL;
        final SubLObject augmentation_terms = get_qaga_query_augmentation_terms(self);
        try {
            thread.throwStack.push($sym275$OUTER_CATCH_FOR_QAGA_QUERY_METHOD);
            try {
                sublisp_throw($sym275$OUTER_CATCH_FOR_QAGA_QUERY_METHOD, augmentation_terms);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_qaga_query_augmentation_terms(self, augmentation_terms);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_qaga_query_method = Errors.handleThrowable(ccatch_env_var, $sym275$OUTER_CATCH_FOR_QAGA_QUERY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_qaga_query_method;
    }

    public static SubLObject get_google_query_google_key(final SubLObject google_query) {
        return classes.subloop_get_access_protected_instance_slot(google_query, SEVEN_INTEGER, GOOGLE_KEY);
    }

    public static SubLObject set_google_query_google_key(final SubLObject google_query, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_query, value, SEVEN_INTEGER, GOOGLE_KEY);
    }

    public static SubLObject get_google_query_start(final SubLObject google_query) {
        return classes.subloop_get_access_protected_instance_slot(google_query, SIX_INTEGER, START);
    }

    public static SubLObject set_google_query_start(final SubLObject google_query, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_query, value, SIX_INTEGER, START);
    }

    public static SubLObject get_google_query_docno(final SubLObject google_query) {
        return classes.subloop_get_access_protected_instance_slot(google_query, FIVE_INTEGER, DOCNO);
    }

    public static SubLObject set_google_query_docno(final SubLObject google_query, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_query, value, FIVE_INTEGER, DOCNO);
    }

    public static SubLObject subloop_reserved_initialize_google_query_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_google_query_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, ERROR_HANDLING, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, KNOWLEDGE_SOURCE_QUERY, QUERY, NIL);
        classes.subloop_initialize_slot(new_instance, CORPUS_QUERY, CORPUS, NIL);
        classes.subloop_initialize_slot(new_instance, GOOGLE_QUERY, DOCNO, NIL);
        classes.subloop_initialize_slot(new_instance, GOOGLE_QUERY, START, NIL);
        classes.subloop_initialize_slot(new_instance, GOOGLE_QUERY, GOOGLE_KEY, NIL);
        return NIL;
    }

    public static SubLObject google_query_p(final SubLObject google_query) {
        return classes.subloop_instanceof_class(google_query, GOOGLE_QUERY);
    }

    public static SubLObject new_google_query(final SubLObject string, final SubLObject google_key, SubLObject docno, SubLObject sentno, SubLObject start) {
        if (docno == UNPROVIDED) {
            docno = $int$50;
        }
        if (sentno == UNPROVIDED) {
            sentno = $int$50;
        }
        if (start == UNPROVIDED) {
            start = ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != stringp(google_key) : "Types.stringp(google_key) " + "CommonSymbols.NIL != Types.stringp(google_key) " + google_key;
        assert NIL != subl_promotions.positive_integer_p(docno) : "subl_promotions.positive_integer_p(docno) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(docno) " + docno;
        assert NIL != subl_promotions.positive_integer_p(start) : "subl_promotions.positive_integer_p(start) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(start) " + start;
        final SubLObject query = object.new_class_instance(GOOGLE_QUERY);
        set_knowledge_source_query_query(query, string);
        set_corpus_query_corpus(query, $world_wide_web_corpus$.getDynamicValue(thread));
        set_google_query_docno(query, docno);
        set_google_query_start(query, start);
        set_google_query_google_key(query, google_key);
        return query;
    }

    public static SubLObject google_query_get_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_query_method = NIL;
        final SubLObject google_key = get_google_query_google_key(self);
        final SubLObject start = get_google_query_start(self);
        final SubLObject docno = get_google_query_docno(self);
        final SubLObject query = get_knowledge_source_query_query(self);
        try {
            thread.throwStack.push($sym285$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD);
            try {
                sublisp_throw($sym285$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD, methods.funcall_instance_method_with_3_args(get_google_client(google_key), SEARCH, query, start, docno));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_query_google_key(self, google_key);
                    set_google_query_start(self, start);
                    set_google_query_docno(self, docno);
                    set_knowledge_source_query_query(self, query);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_google_query_method = Errors.handleThrowable(ccatch_env_var, $sym285$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_query_method;
    }

    public static SubLObject google_query_count_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_query_method = NIL;
        final SubLObject google_key = get_google_query_google_key(self);
        final SubLObject query = get_knowledge_source_query_query(self);
        try {
            thread.throwStack.push($sym290$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD);
            try {
                sublisp_throw($sym290$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD, methods.funcall_instance_method_with_1_args(get_google_client(google_key), COUNT, query));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_query_google_key(self, google_key);
                    set_knowledge_source_query_query(self, query);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_google_query_method = Errors.handleThrowable(ccatch_env_var, $sym290$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_query_method;
    }

    public static SubLObject google_query_quit_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_query_method = NIL;
        final SubLObject google_key = get_google_query_google_key(self);
        try {
            thread.throwStack.push($sym294$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD);
            try {
                methods.funcall_instance_method_with_0_args(get_google_client(google_key), QUIT);
                sublisp_throw($sym294$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_query_google_key(self, google_key);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_google_query_method = Errors.handleThrowable(ccatch_env_var, $sym294$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_query_method;
    }

    public static SubLObject google_query_spelling_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_query_method = NIL;
        final SubLObject google_key = get_google_query_google_key(self);
        final SubLObject query = get_knowledge_source_query_query(self);
        try {
            thread.throwStack.push($sym298$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD);
            try {
                sublisp_throw($sym298$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD, methods.funcall_instance_method_with_1_args(get_google_client(google_key), SPELLING, query));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_query_google_key(self, google_key);
                    set_knowledge_source_query_query(self, query);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_google_query_method = Errors.handleThrowable(ccatch_env_var, $sym298$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_query_method;
    }

    public static SubLObject google_query_version_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_query_method = NIL;
        final SubLObject google_key = get_google_query_google_key(self);
        try {
            thread.throwStack.push($sym302$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD);
            try {
                sublisp_throw($sym302$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD, methods.funcall_instance_method_with_0_args(get_google_client(google_key), VERSION));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_query_google_key(self, google_key);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_google_query_method = Errors.handleThrowable(ccatch_env_var, $sym302$OUTER_CATCH_FOR_GOOGLE_QUERY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_query_method;
    }

    public static SubLObject get_google_key() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == Filesys.probe_file($google_client_key_file$.getDynamicValue(thread))) {
            return NIL;
        }
        final SubLObject google_key_file = StreamsLow.open($google_client_key_file$.getDynamicValue(thread), new SubLObject[]{ $DIRECTION, $INPUT, $IF_DOES_NOT_EXIST, $ERROR });
        final SubLObject google_key = read_line(google_key_file, NIL, UNPROVIDED, UNPROVIDED);
        close(google_key_file, UNPROVIDED);
        return google_key;
    }

    public static SubLObject seed_google_client(final SubLObject key, final SubLObject machine, final SubLObject port) {
        assert NIL != stringp(key) : "Types.stringp(key) " + "CommonSymbols.NIL != Types.stringp(key) " + key;
        assert NIL != stringp(machine) : "Types.stringp(machine) " + "CommonSymbols.NIL != Types.stringp(machine) " + machine;
        assert NIL != subl_promotions.positive_integer_p(port) : "subl_promotions.positive_integer_p(port) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(port) " + port;
        $authorized_google_key$.setDynamicValue(key);
        $google_client_host$.setDynamicValue(machine);
        $google_client_port$.setDynamicValue(port);
        return T;
    }

    public static SubLObject get_google_client(SubLObject licence_key) {
        if (licence_key == UNPROVIDED) {
            licence_key = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $google_client$.getDynamicValue(thread)) {
            final SubLObject client = object.new_class_instance(GOOGLE_CLIENT);
            methods.funcall_instance_method_with_1_args(client, SET_HOST, $google_client_host$.getDynamicValue(thread));
            methods.funcall_instance_method_with_1_args(client, SET_PORT, $google_client_port$.getDynamicValue(thread));
            $google_client$.setDynamicValue(client, thread);
        }
        if (NIL != licence_key) {
            methods.funcall_instance_method_with_1_args($google_client$.getDynamicValue(thread), SET_CLIENT_KEY, licence_key);
        } else {
            methods.funcall_instance_method_with_1_args($google_client$.getDynamicValue(thread), SET_CLIENT_KEY, $authorized_google_key$.getDynamicValue(thread));
        }
        return $google_client$.getDynamicValue(thread);
    }

    public static SubLObject get_google_client_client_interaction(final SubLObject google_client) {
        return classes.subloop_get_access_protected_instance_slot(google_client, FOUR_INTEGER, CLIENT_INTERACTION);
    }

    public static SubLObject set_google_client_client_interaction(final SubLObject google_client, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_client, value, FOUR_INTEGER, CLIENT_INTERACTION);
    }

    public static SubLObject get_google_client_client_key(final SubLObject google_client) {
        return classes.subloop_get_access_protected_instance_slot(google_client, THREE_INTEGER, CLIENT_KEY);
    }

    public static SubLObject set_google_client_client_key(final SubLObject google_client, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_client, value, THREE_INTEGER, CLIENT_KEY);
    }

    public static SubLObject subloop_reserved_initialize_google_client_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_google_client_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TCP_CLIENT, HOST, NIL);
        classes.subloop_initialize_slot(new_instance, TCP_CLIENT, PORT, NIL);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT, CLIENT_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT, CLIENT_INTERACTION, NIL);
        return NIL;
    }

    public static SubLObject google_client_p(final SubLObject google_client) {
        return classes.subloop_instanceof_class(google_client, GOOGLE_CLIENT);
    }

    public static SubLObject google_client_initialize_method(final SubLObject self) {
        subloop_tcp_client.tcp_client_initialize_method(self);
        return self;
    }

    public static SubLObject google_client_set_client_key_method(final SubLObject self, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_client_method = NIL;
        SubLObject client_key = get_google_client_client_key(self);
        try {
            thread.throwStack.push($sym334$OUTER_CATCH_FOR_GOOGLE_CLIENT_METHOD);
            try {
                assert NIL != stringp(key) : "Types.stringp(key) " + "CommonSymbols.NIL != Types.stringp(key) " + key;
                client_key = key;
                sublisp_throw($sym334$OUTER_CATCH_FOR_GOOGLE_CLIENT_METHOD, key);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_client_client_key(self, client_key);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_google_client_method = Errors.handleThrowable(ccatch_env_var, $sym334$OUTER_CATCH_FOR_GOOGLE_CLIENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_client_method;
    }

    public static SubLObject google_client_search_method(final SubLObject self, final SubLObject directive_arg, SubLObject start, SubLObject hits) {
        if (start == UNPROVIDED) {
            start = ONE_INTEGER;
        }
        if (hits == UNPROVIDED) {
            hits = TEN_INTEGER;
        }
        SubLObject client_interaction = get_google_client_client_interaction(self);
        assert NIL != stringp(directive_arg) : "Types.stringp(directive_arg) " + "CommonSymbols.NIL != Types.stringp(directive_arg) " + directive_arg;
        assert NIL != subl_promotions.non_negative_integer_p(start) : "subl_promotions.non_negative_integer_p(start) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(start) " + start;
        assert NIL != subl_promotions.non_negative_integer_p(hits) : "subl_promotions.non_negative_integer_p(hits) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(hits) " + hits;
        client_interaction = methods.funcall_instance_method_with_2_args(self, BUILD_BASIC_GOOGLE_REQUEST, $$$search, directive_arg);
        set_google_client_client_interaction(self, client_interaction);
        methods.funcall_instance_method_with_1_args(client_interaction, SET_DOCNO, hits);
        methods.funcall_instance_method_with_1_args(client_interaction, SET_START, start);
        return methods.funcall_instance_method_with_0_args(self, GET_ANSWER_FROM_REQUEST);
    }

    public static SubLObject google_client_count_method(final SubLObject self, final SubLObject directive_arg) {
        assert NIL != stringp(directive_arg) : "Types.stringp(directive_arg) " + "CommonSymbols.NIL != Types.stringp(directive_arg) " + directive_arg;
        return methods.funcall_instance_method_with_2_args(self, GOOGLE_REQUEST, $$$count, directive_arg);
    }

    public static SubLObject google_client_spelling_method(final SubLObject self, final SubLObject directive_arg) {
        assert NIL != stringp(directive_arg) : "Types.stringp(directive_arg) " + "CommonSymbols.NIL != Types.stringp(directive_arg) " + directive_arg;
        return methods.funcall_instance_method_with_2_args(self, GOOGLE_REQUEST, $$$spell, directive_arg);
    }

    public static SubLObject google_client_quit_method(final SubLObject self) {
        return methods.funcall_instance_method_with_2_args(self, GOOGLE_REQUEST, $str354$_quit_, $str355$);
    }

    public static SubLObject google_client_version_method(final SubLObject self) {
        return methods.funcall_instance_method_with_2_args(self, GOOGLE_REQUEST, $$$version, $str355$);
    }

    public static SubLObject google_client_build_basic_google_request_method(final SubLObject self, final SubLObject directive, final SubLObject directive_arg) {
        final SubLObject client_key = get_google_client_client_key(self);
        final SubLObject request = object.new_class_instance(GOOGLE_CLIENT_INTERACTION);
        methods.funcall_instance_method_with_1_args(request, SET_KEY, client_key);
        methods.funcall_instance_method_with_1_args(request, SET_DIRECTIVE, directive);
        methods.funcall_instance_method_with_1_args(request, SET_DIRECTIVE_ARG, directive_arg);
        return request;
    }

    public static SubLObject google_client_get_answer_from_request_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject client_interaction = get_google_client_client_interaction(self);
        SubLObject response = NIL;
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    response = methods.funcall_instance_method_with_1_args(self, PERFORM_REQUEST, methods.funcall_instance_method_with_0_args(client_interaction, REQUEST_STRING));
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (!error.isString()) {
            methods.funcall_instance_method_with_1_args(client_interaction, BUILD_ANSWER, response);
            return methods.funcall_instance_method_with_0_args(client_interaction, GET_ANSWER);
        }
        Errors.warn($str373$Error_when_contacting_Google_serv, error);
        return $ERROR;
    }

    public static SubLObject google_client_google_request_method(final SubLObject self, final SubLObject directive, final SubLObject directive_arg) {
        SubLObject client_interaction = get_google_client_client_interaction(self);
        client_interaction = methods.funcall_instance_method_with_2_args(self, BUILD_BASIC_GOOGLE_REQUEST, directive, directive_arg);
        set_google_client_client_interaction(self, client_interaction);
        return methods.funcall_instance_method_with_0_args(self, GET_ANSWER_FROM_REQUEST);
    }

    public static SubLObject get_google_client_interaction_google_io_error(final SubLObject google_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(google_client_interaction, TEN_INTEGER, GOOGLE_IO_ERROR);
    }

    public static SubLObject set_google_client_interaction_google_io_error(final SubLObject google_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_client_interaction, value, TEN_INTEGER, GOOGLE_IO_ERROR);
    }

    public static SubLObject get_google_client_interaction_google_version(final SubLObject google_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(google_client_interaction, NINE_INTEGER, GOOGLE_VERSION);
    }

    public static SubLObject set_google_client_interaction_google_version(final SubLObject google_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_client_interaction, value, NINE_INTEGER, GOOGLE_VERSION);
    }

    public static SubLObject get_google_client_interaction_google_spelling(final SubLObject google_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(google_client_interaction, EIGHT_INTEGER, GOOGLE_SPELLING);
    }

    public static SubLObject set_google_client_interaction_google_spelling(final SubLObject google_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_client_interaction, value, EIGHT_INTEGER, GOOGLE_SPELLING);
    }

    public static SubLObject get_google_client_interaction_google_count(final SubLObject google_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(google_client_interaction, SEVEN_INTEGER, GOOGLE_COUNT);
    }

    public static SubLObject set_google_client_interaction_google_count(final SubLObject google_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_client_interaction, value, SEVEN_INTEGER, GOOGLE_COUNT);
    }

    public static SubLObject get_google_client_interaction_google_passages(final SubLObject google_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(google_client_interaction, SIX_INTEGER, GOOGLE_PASSAGES);
    }

    public static SubLObject set_google_client_interaction_google_passages(final SubLObject google_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_client_interaction, value, SIX_INTEGER, GOOGLE_PASSAGES);
    }

    public static SubLObject get_google_client_interaction_start(final SubLObject google_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(google_client_interaction, FIVE_INTEGER, START);
    }

    public static SubLObject set_google_client_interaction_start(final SubLObject google_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_client_interaction, value, FIVE_INTEGER, START);
    }

    public static SubLObject get_google_client_interaction_docno(final SubLObject google_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(google_client_interaction, FOUR_INTEGER, DOCNO);
    }

    public static SubLObject set_google_client_interaction_docno(final SubLObject google_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_client_interaction, value, FOUR_INTEGER, DOCNO);
    }

    public static SubLObject get_google_client_interaction_directive_arg(final SubLObject google_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(google_client_interaction, THREE_INTEGER, DIRECTIVE_ARG);
    }

    public static SubLObject set_google_client_interaction_directive_arg(final SubLObject google_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_client_interaction, value, THREE_INTEGER, DIRECTIVE_ARG);
    }

    public static SubLObject get_google_client_interaction_directive(final SubLObject google_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(google_client_interaction, TWO_INTEGER, DIRECTIVE);
    }

    public static SubLObject set_google_client_interaction_directive(final SubLObject google_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_client_interaction, value, TWO_INTEGER, DIRECTIVE);
    }

    public static SubLObject get_google_client_interaction_client_key(final SubLObject google_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(google_client_interaction, ONE_INTEGER, CLIENT_KEY);
    }

    public static SubLObject set_google_client_interaction_client_key(final SubLObject google_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_client_interaction, value, ONE_INTEGER, CLIENT_KEY);
    }

    public static SubLObject get_google_client_interaction_total_keyword(final SubLObject google_client_interaction) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), $int$21);
        }
        return NIL;
    }

    public static SubLObject set_google_client_interaction_total_keyword(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), $int$21, value);
        }
        return NIL;
    }

    public static SubLObject get_google_client_interaction_rank_keyword(final SubLObject google_client_interaction) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), TWENTY_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_google_client_interaction_rank_keyword(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), TWENTY_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_google_client_interaction_offset_in_snippet_keyword(final SubLObject google_client_interaction) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), NINETEEN_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_google_client_interaction_offset_in_snippet_keyword(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), NINETEEN_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_google_client_interaction_offset_in_full_text_keyword(final SubLObject google_client_interaction) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), EIGHTEEN_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_google_client_interaction_offset_in_full_text_keyword(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), EIGHTEEN_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_google_client_interaction_snippet_keyword(final SubLObject google_client_interaction) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), SEVENTEEN_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_google_client_interaction_snippet_keyword(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), SEVENTEEN_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_google_client_interaction_full_text_keyword(final SubLObject google_client_interaction) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), SIXTEEN_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_google_client_interaction_full_text_keyword(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), SIXTEEN_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_google_client_interaction_title_keyword(final SubLObject google_client_interaction) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), FIFTEEN_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_google_client_interaction_title_keyword(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), FIFTEEN_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_google_client_interaction_url_keyword(final SubLObject google_client_interaction) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), FOURTEEN_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_google_client_interaction_url_keyword(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), FOURTEEN_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_google_client_interaction_content_keyword(final SubLObject google_client_interaction) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), THIRTEEN_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_google_client_interaction_content_keyword(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), THIRTEEN_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_google_client_interaction_query_language_attr(final SubLObject google_client_interaction) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), TWELVE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_google_client_interaction_query_language_attr(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), TWELVE_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_google_client_interaction_query_key_attr(final SubLObject google_client_interaction) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), ELEVEN_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_google_client_interaction_query_key_attr(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), ELEVEN_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_google_client_interaction_query_start_attr(final SubLObject google_client_interaction) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), TEN_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_google_client_interaction_query_start_attr(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), TEN_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_google_client_interaction_query_count_attr(final SubLObject google_client_interaction) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), NINE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_google_client_interaction_query_count_attr(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), NINE_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_google_client_interaction_query_type_attr(final SubLObject google_client_interaction) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), EIGHT_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_google_client_interaction_query_type_attr(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), EIGHT_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_google_client_interaction_query_tag(final SubLObject google_client_interaction) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), SEVEN_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_google_client_interaction_query_tag(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), SEVEN_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_google_client_interaction_subl_directive_tag(final SubLObject google_client_interaction) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), SIX_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_google_client_interaction_subl_directive_tag(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), SIX_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_google_client_interaction_version_directive_tag(final SubLObject google_client_interaction) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), FIVE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_google_client_interaction_version_directive_tag(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), FIVE_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_google_client_interaction_quit_directive_tag(final SubLObject google_client_interaction) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), FOUR_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_google_client_interaction_quit_directive_tag(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), FOUR_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_google_client_interaction_spell_directive_tag(final SubLObject google_client_interaction) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_google_client_interaction_spell_directive_tag(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_google_client_interaction_count_directive_tag(final SubLObject google_client_interaction) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_google_client_interaction_count_directive_tag(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_google_client_interaction_search_directive_tag(final SubLObject google_client_interaction) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_google_client_interaction_search_directive_tag(final SubLObject google_client_interaction, final SubLObject value) {
        final SubLObject v_class = (google_client_interaction.isSymbol()) ? classes.classes_retrieve_class(google_client_interaction) : NIL != subloop_structures.class_p(google_client_interaction) ? google_client_interaction : NIL != subloop_structures.instance_p(google_client_interaction) ? subloop_structures.instance_class(google_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_google_client_interaction_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, SEARCH_DIRECTIVE_TAG, $$$search);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, COUNT_DIRECTIVE_TAG, $$$count);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, SPELL_DIRECTIVE_TAG, $$$spell);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, QUIT_DIRECTIVE_TAG, $str354$_quit_);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, VERSION_DIRECTIVE_TAG, $$$version);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, SUBL_DIRECTIVE_TAG, $$$SubL);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, QUERY_TAG, $$$query);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, QUERY_TYPE_ATTR, $$$type);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, QUERY_COUNT_ATTR, $$$hitnum);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, QUERY_START_ATTR, $$$startnum);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, QUERY_KEY_ATTR, $$$key);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, QUERY_LANGUAGE_ATTR, $$$language);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, CONTENT_KEYWORD, $CONTENT);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, URL_KEYWORD, $URL);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, TITLE_KEYWORD, $TITLE);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, FULL_TEXT_KEYWORD, $FULL_TEXT);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, SNIPPET_KEYWORD, $SNIPPET);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, OFFSET_IN_FULL_TEXT_KEYWORD, $OFFSET_IN_FULL_TEXT);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, OFFSET_IN_SNIPPET_KEYWORD, $OFFSET_IN_SNIPPET);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, RANK_KEYWORD, $RANK);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, TOTAL_KEYWORD, $TOTAL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_google_client_interaction_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, CLIENT_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, DIRECTIVE, NIL);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, DIRECTIVE_ARG, NIL);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, DOCNO, NIL);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, START, NIL);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, GOOGLE_PASSAGES, NIL);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, GOOGLE_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, GOOGLE_SPELLING, NIL);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, GOOGLE_VERSION, NIL);
        classes.subloop_initialize_slot(new_instance, GOOGLE_CLIENT_INTERACTION, GOOGLE_IO_ERROR, NIL);
        return NIL;
    }

    public static SubLObject google_client_interaction_p(final SubLObject google_client_interaction) {
        return classes.subloop_instanceof_class(google_client_interaction, GOOGLE_CLIENT_INTERACTION);
    }

    public static SubLObject google_client_interaction_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_client_interaction_method = NIL;
        SubLObject google_io_error = get_google_client_interaction_google_io_error(self);
        SubLObject google_passages = get_google_client_interaction_google_passages(self);
        SubLObject start = get_google_client_interaction_start(self);
        SubLObject docno = get_google_client_interaction_docno(self);
        try {
            thread.throwStack.push($sym425$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
            try {
                object.object_initialize_method(self);
                google_passages = object.new_class_instance(GOOGLE_PASSAGE_LIST);
                docno = TEN_INTEGER;
                start = ZERO_INTEGER;
                google_io_error = NIL;
                sublisp_throw($sym425$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_client_interaction_google_io_error(self, google_io_error);
                    set_google_client_interaction_google_passages(self, google_passages);
                    set_google_client_interaction_start(self, start);
                    set_google_client_interaction_docno(self, docno);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_google_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym425$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_client_interaction_method;
    }

    public static SubLObject google_client_interaction_set_key_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_client_interaction_method = NIL;
        SubLObject client_key = get_google_client_interaction_client_key(self);
        try {
            thread.throwStack.push($sym429$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
            try {
                assert NIL != stringp(v_object) : "Types.stringp error :" + v_object;
                client_key = v_object;
                sublisp_throw($sym429$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_client_interaction_client_key(self, client_key);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_google_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym429$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_client_interaction_method;
    }

    public static SubLObject google_client_interaction_set_directive_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_client_interaction_method = NIL;
        SubLObject directive = get_google_client_interaction_directive(self);
        try {
            thread.throwStack.push($sym432$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
            try {
                assert NIL != stringp(v_object) : "Types.stringp error :" + v_object;
                directive = v_object;
                sublisp_throw($sym432$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_client_interaction_directive(self, directive);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_google_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym432$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_client_interaction_method;
    }

    public static SubLObject google_client_interaction_set_docno_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_client_interaction_method = NIL;
        SubLObject docno = get_google_client_interaction_docno(self);
        try {
            thread.throwStack.push($sym435$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
            try {
                assert NIL != integerp(v_object) : "Types.integerp error :" + v_object;
                docno = v_object;
                sublisp_throw($sym435$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_client_interaction_docno(self, docno);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_google_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym435$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_client_interaction_method;
    }

    public static SubLObject google_client_interaction_set_start_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_client_interaction_method = NIL;
        SubLObject start = get_google_client_interaction_start(self);
        try {
            thread.throwStack.push($sym438$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
            try {
                assert NIL != integerp(v_object) : "Types.integerp error :" + v_object;
                start = v_object;
                sublisp_throw($sym438$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_client_interaction_start(self, start);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_google_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym438$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_client_interaction_method;
    }

    public static SubLObject google_client_interaction_get_io_error_flag_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_client_interaction_method = NIL;
        final SubLObject google_io_error = get_google_client_interaction_google_io_error(self);
        try {
            thread.throwStack.push($sym442$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
            try {
                sublisp_throw($sym442$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, google_io_error);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_client_interaction_google_io_error(self, google_io_error);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_google_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym442$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_client_interaction_method;
    }

    public static SubLObject google_client_interaction_build_answer_method(final SubLObject self, final SubLObject response_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_client_interaction_method = NIL;
        final SubLObject total_keyword = get_google_client_interaction_total_keyword(self);
        final SubLObject rank_keyword = get_google_client_interaction_rank_keyword(self);
        final SubLObject offset_in_snippet_keyword = get_google_client_interaction_offset_in_snippet_keyword(self);
        final SubLObject offset_in_full_text_keyword = get_google_client_interaction_offset_in_full_text_keyword(self);
        final SubLObject snippet_keyword = get_google_client_interaction_snippet_keyword(self);
        final SubLObject full_text_keyword = get_google_client_interaction_full_text_keyword(self);
        final SubLObject title_keyword = get_google_client_interaction_title_keyword(self);
        final SubLObject url_keyword = get_google_client_interaction_url_keyword(self);
        final SubLObject content_keyword = get_google_client_interaction_content_keyword(self);
        final SubLObject version_directive_tag = get_google_client_interaction_version_directive_tag(self);
        final SubLObject quit_directive_tag = get_google_client_interaction_quit_directive_tag(self);
        final SubLObject spell_directive_tag = get_google_client_interaction_spell_directive_tag(self);
        final SubLObject count_directive_tag = get_google_client_interaction_count_directive_tag(self);
        final SubLObject search_directive_tag = get_google_client_interaction_search_directive_tag(self);
        SubLObject google_io_error = get_google_client_interaction_google_io_error(self);
        SubLObject google_version = get_google_client_interaction_google_version(self);
        SubLObject google_spelling = get_google_client_interaction_google_spelling(self);
        SubLObject google_count = get_google_client_interaction_google_count(self);
        final SubLObject google_passages = get_google_client_interaction_google_passages(self);
        final SubLObject directive = get_google_client_interaction_directive(self);
        try {
            thread.throwStack.push($sym446$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
            try {
                SubLObject response = NIL;
                SubLObject error = NIL;
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            response = read_from_string(response_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
                if (NIL != error) {
                    Errors.warn($str447$Could_not_build_answer__the_respo, response_string, error);
                    sublisp_throw($sym446$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, self);
                }
                if (response == $IO_ERROR) {
                    google_io_error = T;
                } else
                    if (directive.equalp(count_directive_tag)) {
                        if (response.isInteger()) {
                            google_count = response;
                        } else {
                            Errors.warn($str449$Google_count_is_not_a_digit_strin);
                            google_count = ZERO_INTEGER;
                        }
                    } else
                        if (directive.equalp(search_directive_tag)) {
                            if (response.isList()) {
                                SubLObject cdolist_list_var = response;
                                SubLObject passage = NIL;
                                passage = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    final SubLObject url = getf(passage, url_keyword, UNPROVIDED);
                                    final SubLObject title = getf(passage, title_keyword, UNPROVIDED);
                                    final SubLObject content = getf(passage, content_keyword, UNPROVIDED);
                                    final SubLObject full_text = getf(passage, full_text_keyword, UNPROVIDED);
                                    final SubLObject snippet = getf(passage, snippet_keyword, UNPROVIDED);
                                    final SubLObject offset_in_snippet = getf(passage, offset_in_snippet_keyword, UNPROVIDED);
                                    final SubLObject text = (full_text.isString()) ? full_text : content;
                                    final SubLObject offset_in_full_text = (full_text.isString()) ? getf(passage, offset_in_full_text_keyword, UNPROVIDED) : offset_in_snippet;
                                    final SubLObject rank = getf(passage, rank_keyword, UNPROVIDED);
                                    final SubLObject total = getf(passage, total_keyword, UNPROVIDED);
                                    methods.funcall_instance_method_with_1_args(google_passages, ADD, new_google_passage(url, rank, title, text, snippet, offset_in_full_text, offset_in_snippet, total));
                                    cdolist_list_var = cdolist_list_var.rest();
                                    passage = cdolist_list_var.first();
                                } 
                            } else {
                                Errors.warn($str451$Response__A_is_of_unwanted_type__, response, type_of(response));
                            }
                        } else
                            if (directive.equalp(version_directive_tag)) {
                                if (NIL != list_utilities.property_list_p(response)) {
                                    google_version = response;
                                } else {
                                    Errors.warn($str451$Response__A_is_of_unwanted_type__, response, type_of(response));
                                }
                            } else
                                if (!directive.equalp(quit_directive_tag)) {
                                    if (directive.equalp(spell_directive_tag)) {
                                        if (NIL != list_utilities.property_list_p(response)) {
                                            google_spelling = second(response);
                                        } else {
                                            Errors.warn($str451$Response__A_is_of_unwanted_type__, type_of(response));
                                        }
                                    } else {
                                        Errors.warn($str452$Query_directive__S_is_not_support, directive);
                                    }
                                }




                sublisp_throw($sym446$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_client_interaction_total_keyword(self, total_keyword);
                    set_google_client_interaction_rank_keyword(self, rank_keyword);
                    set_google_client_interaction_offset_in_snippet_keyword(self, offset_in_snippet_keyword);
                    set_google_client_interaction_offset_in_full_text_keyword(self, offset_in_full_text_keyword);
                    set_google_client_interaction_snippet_keyword(self, snippet_keyword);
                    set_google_client_interaction_full_text_keyword(self, full_text_keyword);
                    set_google_client_interaction_title_keyword(self, title_keyword);
                    set_google_client_interaction_url_keyword(self, url_keyword);
                    set_google_client_interaction_content_keyword(self, content_keyword);
                    set_google_client_interaction_version_directive_tag(self, version_directive_tag);
                    set_google_client_interaction_quit_directive_tag(self, quit_directive_tag);
                    set_google_client_interaction_spell_directive_tag(self, spell_directive_tag);
                    set_google_client_interaction_count_directive_tag(self, count_directive_tag);
                    set_google_client_interaction_search_directive_tag(self, search_directive_tag);
                    set_google_client_interaction_google_io_error(self, google_io_error);
                    set_google_client_interaction_google_version(self, google_version);
                    set_google_client_interaction_google_spelling(self, google_spelling);
                    set_google_client_interaction_google_count(self, google_count);
                    set_google_client_interaction_google_passages(self, google_passages);
                    set_google_client_interaction_directive(self, directive);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var2) {
            catch_var_for_google_client_interaction_method = Errors.handleThrowable(ccatch_env_var2, $sym446$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_client_interaction_method;
    }

    public static SubLObject google_client_interaction_get_directive_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_client_interaction_method = NIL;
        final SubLObject directive = get_google_client_interaction_directive(self);
        try {
            thread.throwStack.push($sym456$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
            try {
                sublisp_throw($sym456$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, directive);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_client_interaction_directive(self, directive);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_google_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym456$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_client_interaction_method;
    }

    public static SubLObject google_client_interaction_set_directive_arg_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_client_interaction_method = NIL;
        SubLObject directive_arg = get_google_client_interaction_directive_arg(self);
        try {
            thread.throwStack.push($sym459$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
            try {
                assert NIL != stringp(v_object) : "Types.stringp error :" + v_object;
                directive_arg = v_object;
                sublisp_throw($sym459$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_client_interaction_directive_arg(self, directive_arg);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_google_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym459$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_client_interaction_method;
    }

    public static SubLObject google_client_interaction_request_string_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_client_interaction_method = NIL;
        final SubLObject query_language_attr = get_google_client_interaction_query_language_attr(self);
        final SubLObject query_key_attr = get_google_client_interaction_query_key_attr(self);
        final SubLObject query_start_attr = get_google_client_interaction_query_start_attr(self);
        final SubLObject query_count_attr = get_google_client_interaction_query_count_attr(self);
        final SubLObject query_type_attr = get_google_client_interaction_query_type_attr(self);
        final SubLObject query_tag = get_google_client_interaction_query_tag(self);
        final SubLObject subl_directive_tag = get_google_client_interaction_subl_directive_tag(self);
        final SubLObject start = get_google_client_interaction_start(self);
        final SubLObject docno = get_google_client_interaction_docno(self);
        final SubLObject directive_arg = get_google_client_interaction_directive_arg(self);
        final SubLObject directive = get_google_client_interaction_directive(self);
        final SubLObject client_key = get_google_client_interaction_client_key(self);
        try {
            thread.throwStack.push($sym462$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
            try {
                SubLObject result = $str355$;
                if (((NIL != client_key) && (NIL != directive)) && (NIL != directive_arg)) {
                    final SubLObject outstream = make_string_output_stream();
                    final SubLObject v_xml_writer = object.new_class_instance(XML_WRITER);
                    methods.funcall_instance_method_with_1_args(v_xml_writer, SET_STREAM, outstream);
                    methods.funcall_instance_method_with_4_args(v_xml_writer, START_TAG, query_tag, list(new SubLObject[]{ query_key_attr, client_key, query_type_attr, directive, query_count_attr, docno, query_start_attr, start, query_language_attr, subl_directive_tag }), NIL, NIL);
                    methods.funcall_instance_method_with_2_args(v_xml_writer, XML_PRINT, directive_arg, NIL);
                    methods.funcall_instance_method_with_2_args(v_xml_writer, END_TAG, query_tag, NIL);
                    result = string_utilities.trim_whitespace(get_output_stream_string(outstream));
                }
                sublisp_throw($sym462$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, result);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_client_interaction_query_language_attr(self, query_language_attr);
                    set_google_client_interaction_query_key_attr(self, query_key_attr);
                    set_google_client_interaction_query_start_attr(self, query_start_attr);
                    set_google_client_interaction_query_count_attr(self, query_count_attr);
                    set_google_client_interaction_query_type_attr(self, query_type_attr);
                    set_google_client_interaction_query_tag(self, query_tag);
                    set_google_client_interaction_subl_directive_tag(self, subl_directive_tag);
                    set_google_client_interaction_start(self, start);
                    set_google_client_interaction_docno(self, docno);
                    set_google_client_interaction_directive_arg(self, directive_arg);
                    set_google_client_interaction_directive(self, directive);
                    set_google_client_interaction_client_key(self, client_key);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_google_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym462$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_client_interaction_method;
    }

    public static SubLObject google_client_interaction_get_answer_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_client_interaction_method = NIL;
        final SubLObject version_directive_tag = get_google_client_interaction_version_directive_tag(self);
        final SubLObject spell_directive_tag = get_google_client_interaction_spell_directive_tag(self);
        final SubLObject count_directive_tag = get_google_client_interaction_count_directive_tag(self);
        final SubLObject search_directive_tag = get_google_client_interaction_search_directive_tag(self);
        final SubLObject google_version = get_google_client_interaction_google_version(self);
        final SubLObject google_spelling = get_google_client_interaction_google_spelling(self);
        final SubLObject google_count = get_google_client_interaction_google_count(self);
        final SubLObject directive = get_google_client_interaction_directive(self);
        try {
            thread.throwStack.push($sym470$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
            try {
                if (NIL != methods.funcall_instance_method_with_0_args(self, GET_IO_ERROR_FLAG)) {
                    sublisp_throw($sym470$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, $SERVER_ERROR);
                } else
                    if (directive.equalp(count_directive_tag)) {
                        sublisp_throw($sym470$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, google_count);
                    } else
                        if (directive.equalp(spell_directive_tag)) {
                            sublisp_throw($sym470$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, google_spelling);
                        } else
                            if (directive.equalp(version_directive_tag)) {
                                sublisp_throw($sym470$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, google_version);
                            } else
                                if (directive.equalp(search_directive_tag)) {
                                    sublisp_throw($sym470$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, methods.funcall_instance_method_with_0_args(self, GET_GOOGLE_PASSAGES));
                                }




            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_client_interaction_version_directive_tag(self, version_directive_tag);
                    set_google_client_interaction_spell_directive_tag(self, spell_directive_tag);
                    set_google_client_interaction_count_directive_tag(self, count_directive_tag);
                    set_google_client_interaction_search_directive_tag(self, search_directive_tag);
                    set_google_client_interaction_google_version(self, google_version);
                    set_google_client_interaction_google_spelling(self, google_spelling);
                    set_google_client_interaction_google_count(self, google_count);
                    set_google_client_interaction_directive(self, directive);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_google_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym470$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_client_interaction_method;
    }

    public static SubLObject google_client_interaction_get_google_passages_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_client_interaction_method = NIL;
        final SubLObject google_passages = get_google_client_interaction_google_passages(self);
        try {
            thread.throwStack.push($sym475$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
            try {
                SubLObject snippet_list = NIL;
                SubLObject enumerator = NIL;
                if (NIL == methods.funcall_instance_method_with_0_args(google_passages, EMPTY_P)) {
                    enumerator = methods.funcall_instance_method_with_0_args(google_passages, ALLOCATE_ENUMERATOR);
                    snippet_list = cons(methods.funcall_instance_method_with_0_args(enumerator, FIRST), snippet_list);
                    while (NIL == methods.funcall_instance_method_with_0_args(enumerator, LAST_P)) {
                        snippet_list = cons(methods.funcall_instance_method_with_0_args(enumerator, NEXT), snippet_list);
                    } 
                }
                sublisp_throw($sym475$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD, nreverse(snippet_list));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_client_interaction_google_passages(self, google_passages);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_google_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym475$OUTER_CATCH_FOR_GOOGLE_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_client_interaction_method;
    }

    public static SubLObject subloop_reserved_initialize_google_passage_list_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_google_passage_list_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_COLLECTION, CONTENTS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_COLLECTION, ELEMENT_EQUALITY_PREDICATE, NIL);
        return NIL;
    }

    public static SubLObject google_passage_list_p(final SubLObject google_passage_list) {
        return classes.subloop_instanceof_class(google_passage_list, GOOGLE_PASSAGE_LIST);
    }

    public static SubLObject google_passage_list_acceptable_p_method(final SubLObject self, final SubLObject new_element) {
        return makeBoolean((NIL != instances.instance_of_p(new_element, GOOGLE_PASSAGE)) && (NIL != methods.funcall_instance_method_with_0_args(new_element, IS_COMPLETE)));
    }

    public static SubLObject google_passage_list_add_method(final SubLObject self, final SubLObject new_element) {
        if (NIL != methods.funcall_instance_method_with_1_args(self, ACCEPTABLE_P, new_element)) {
            methods.funcall_instance_super_method_with_1_args(self, ADD, new_element);
        } else {
            Errors.warn($str496$__Cannot_add__S_to_a_google_passa, new_element);
        }
        return self;
    }

    public static SubLObject get_google_passage_parse_trees(final SubLObject google_passage) {
        return classes.subloop_get_access_protected_instance_slot(google_passage, ELEVEN_INTEGER, PARSE_TREES);
    }

    public static SubLObject set_google_passage_parse_trees(final SubLObject google_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_passage, value, ELEVEN_INTEGER, PARSE_TREES);
    }

    public static SubLObject get_google_passage_total(final SubLObject google_passage) {
        return classes.subloop_get_access_protected_instance_slot(google_passage, TEN_INTEGER, TOTAL);
    }

    public static SubLObject set_google_passage_total(final SubLObject google_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_passage, value, TEN_INTEGER, TOTAL);
    }

    public static SubLObject get_google_passage_offset_in_text(final SubLObject google_passage) {
        return classes.subloop_get_access_protected_instance_slot(google_passage, NINE_INTEGER, OFFSET_IN_TEXT);
    }

    public static SubLObject set_google_passage_offset_in_text(final SubLObject google_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_passage, value, NINE_INTEGER, OFFSET_IN_TEXT);
    }

    public static SubLObject get_google_passage_offset_in_snippet(final SubLObject google_passage) {
        return classes.subloop_get_access_protected_instance_slot(google_passage, EIGHT_INTEGER, OFFSET_IN_SNIPPET);
    }

    public static SubLObject set_google_passage_offset_in_snippet(final SubLObject google_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_passage, value, EIGHT_INTEGER, OFFSET_IN_SNIPPET);
    }

    public static SubLObject get_google_passage_snippet(final SubLObject google_passage) {
        return classes.subloop_get_access_protected_instance_slot(google_passage, SEVEN_INTEGER, SNIPPET);
    }

    public static SubLObject set_google_passage_snippet(final SubLObject google_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_passage, value, SEVEN_INTEGER, SNIPPET);
    }

    public static SubLObject get_google_passage_title(final SubLObject google_passage) {
        return classes.subloop_get_access_protected_instance_slot(google_passage, SIX_INTEGER, TITLE);
    }

    public static SubLObject set_google_passage_title(final SubLObject google_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_passage, value, SIX_INTEGER, TITLE);
    }

    public static SubLObject get_google_passage_url(final SubLObject google_passage) {
        return classes.subloop_get_access_protected_instance_slot(google_passage, FIVE_INTEGER, URL);
    }

    public static SubLObject set_google_passage_url(final SubLObject google_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_passage, value, FIVE_INTEGER, URL);
    }

    public static SubLObject get_google_passage_rank(final SubLObject google_passage) {
        return classes.subloop_get_access_protected_instance_slot(google_passage, FOUR_INTEGER, RANK);
    }

    public static SubLObject set_google_passage_rank(final SubLObject google_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(google_passage, value, FOUR_INTEGER, RANK);
    }

    public static SubLObject subloop_reserved_initialize_google_passage_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_google_passage_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_PASSAGE, VECTOR, NIL);
        classes.subloop_initialize_slot(new_instance, CORPUS_PASSAGE, CORPUS, NIL);
        classes.subloop_initialize_slot(new_instance, CORPUS_PASSAGE, TEXT, NIL);
        classes.subloop_initialize_slot(new_instance, GOOGLE_PASSAGE, RANK, NIL);
        classes.subloop_initialize_slot(new_instance, GOOGLE_PASSAGE, URL, NIL);
        classes.subloop_initialize_slot(new_instance, GOOGLE_PASSAGE, TITLE, NIL);
        classes.subloop_initialize_slot(new_instance, GOOGLE_PASSAGE, SNIPPET, NIL);
        classes.subloop_initialize_slot(new_instance, GOOGLE_PASSAGE, OFFSET_IN_SNIPPET, NIL);
        classes.subloop_initialize_slot(new_instance, GOOGLE_PASSAGE, OFFSET_IN_TEXT, NIL);
        classes.subloop_initialize_slot(new_instance, GOOGLE_PASSAGE, TOTAL, NIL);
        classes.subloop_initialize_slot(new_instance, GOOGLE_PASSAGE, PARSE_TREES, NIL);
        return NIL;
    }

    public static SubLObject google_passage_p(final SubLObject google_passage) {
        return classes.subloop_instanceof_class(google_passage, GOOGLE_PASSAGE);
    }

    public static SubLObject new_google_passage(final SubLObject url, final SubLObject rank, final SubLObject title, final SubLObject text, SubLObject snippet, SubLObject text_offset, SubLObject snippet_offset, SubLObject total) {
        if (snippet == UNPROVIDED) {
            snippet = NIL;
        }
        if (text_offset == UNPROVIDED) {
            text_offset = NIL;
        }
        if (snippet_offset == UNPROVIDED) {
            snippet_offset = NIL;
        }
        if (total == UNPROVIDED) {
            total = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(url) : "Types.stringp(url) " + "CommonSymbols.NIL != Types.stringp(url) " + url;
        assert NIL != subl_promotions.non_negative_integer_p(rank) : "subl_promotions.non_negative_integer_p(rank) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(rank) " + rank;
        assert NIL != stringp(text) : "Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) " + text;
        assert NIL != stringp(title) : "Types.stringp(title) " + "CommonSymbols.NIL != Types.stringp(title) " + title;
        if (NIL != text_offset) {
            assert NIL != subl_promotions.non_negative_integer_p(text_offset) : "subl_promotions.non_negative_integer_p(text_offset) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(text_offset) " + text_offset;
        } else {
            text_offset = ZERO_INTEGER;
        }
        if (NIL != snippet) {
            assert NIL != stringp(snippet) : "Types.stringp(snippet) " + "CommonSymbols.NIL != Types.stringp(snippet) " + snippet;
        } else {
            snippet = text;
            snippet_offset = text_offset;
        }
        if (NIL != snippet_offset) {
            assert NIL != subl_promotions.non_negative_integer_p(snippet_offset) : "subl_promotions.non_negative_integer_p(snippet_offset) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(snippet_offset) " + snippet_offset;
        } else {
            snippet_offset = ZERO_INTEGER;
        }
        if (NIL != total) {
            assert NIL != subl_promotions.non_negative_integer_p(total) : "subl_promotions.non_negative_integer_p(total) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(total) " + total;
        } else {
            total = ZERO_INTEGER;
        }
        final SubLObject passage = object.new_class_instance(GOOGLE_PASSAGE);
        set_corpus_passage_corpus(passage, $world_wide_web_corpus$.getDynamicValue(thread));
        set_corpus_passage_text(passage, text);
        set_google_passage_url(passage, url);
        set_google_passage_title(passage, title);
        set_google_passage_rank(passage, rank);
        set_google_passage_snippet(passage, snippet);
        set_google_passage_offset_in_text(passage, text_offset);
        set_google_passage_offset_in_snippet(passage, snippet_offset);
        set_google_passage_total(passage, total);
        return passage;
    }

    public static SubLObject google_passage_get_source_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_passage_method = NIL;
        final SubLObject url = get_google_passage_url(self);
        try {
            thread.throwStack.push($sym510$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
            try {
                sublisp_throw($sym510$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, url);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_passage_url(self, url);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_google_passage_method = Errors.handleThrowable(ccatch_env_var, $sym510$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_passage_method;
    }

    public static SubLObject google_passage_get_score_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_passage_method = NIL;
        final SubLObject rank = get_google_passage_rank(self);
        try {
            thread.throwStack.push($sym513$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
            try {
                sublisp_throw($sym513$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, divide(ONE_INTEGER, rank));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_passage_rank(self, rank);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_google_passage_method = Errors.handleThrowable(ccatch_env_var, $sym513$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_passage_method;
    }

    public static SubLObject google_passage_is_complete_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_passage_method = NIL;
        final SubLObject url = get_google_passage_url(self);
        final SubLObject rank = get_google_passage_rank(self);
        final SubLObject text = get_corpus_passage_text(self);
        try {
            thread.throwStack.push($sym516$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
            try {
                if (NIL == subl_promotions.non_negative_integer_p(rank)) {
                    sublisp_throw($sym516$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, NIL);
                }
                if (!url.isString()) {
                    sublisp_throw($sym516$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, NIL);
                }
                if (!text.isString()) {
                    sublisp_throw($sym516$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, NIL);
                }
                sublisp_throw($sym516$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_passage_url(self, url);
                    set_google_passage_rank(self, rank);
                    set_corpus_passage_text(self, text);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_google_passage_method = Errors.handleThrowable(ccatch_env_var, $sym516$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_passage_method;
    }

    public static SubLObject google_passage_get_offset_in_full_text_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_passage_method = NIL;
        final SubLObject offset_in_text = get_google_passage_offset_in_text(self);
        try {
            thread.throwStack.push($sym520$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
            try {
                sublisp_throw($sym520$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, offset_in_text);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_passage_offset_in_text(self, offset_in_text);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_google_passage_method = Errors.handleThrowable(ccatch_env_var, $sym520$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_passage_method;
    }

    public static SubLObject google_passage_get_offset_in_snippet_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_passage_method = NIL;
        final SubLObject offset_in_snippet = get_google_passage_offset_in_snippet(self);
        try {
            thread.throwStack.push($sym524$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
            try {
                sublisp_throw($sym524$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, offset_in_snippet);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_passage_offset_in_snippet(self, offset_in_snippet);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_google_passage_method = Errors.handleThrowable(ccatch_env_var, $sym524$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_passage_method;
    }

    public static SubLObject google_passage_get_url_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_passage_method = NIL;
        final SubLObject url = get_google_passage_url(self);
        try {
            thread.throwStack.push($sym528$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
            try {
                sublisp_throw($sym528$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, url);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_passage_url(self, url);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_google_passage_method = Errors.handleThrowable(ccatch_env_var, $sym528$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_passage_method;
    }

    public static SubLObject google_passage_get_title_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_passage_method = NIL;
        final SubLObject title = get_google_passage_title(self);
        try {
            thread.throwStack.push($sym532$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
            try {
                sublisp_throw($sym532$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, title);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_passage_title(self, title);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_google_passage_method = Errors.handleThrowable(ccatch_env_var, $sym532$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_passage_method;
    }

    public static SubLObject google_passage_get_cached_file_id_method(final SubLObject self) {
        return google_passage_get_url_method(self);
    }

    public static SubLObject google_passage_get_full_text_method(final SubLObject self) {
        return get_corpus_passage_text(self);
    }

    public static SubLObject google_passage_get_snippet_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_passage_method = NIL;
        final SubLObject snippet = get_google_passage_snippet(self);
        try {
            thread.throwStack.push($sym542$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
            try {
                sublisp_throw($sym542$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, snippet);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_passage_snippet(self, snippet);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_google_passage_method = Errors.handleThrowable(ccatch_env_var, $sym542$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_passage_method;
    }

    public static SubLObject google_passage_get_rank_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_passage_method = NIL;
        final SubLObject rank = get_google_passage_rank(self);
        try {
            thread.throwStack.push($sym546$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
            try {
                sublisp_throw($sym546$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, rank);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_passage_rank(self, rank);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_google_passage_method = Errors.handleThrowable(ccatch_env_var, $sym546$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_passage_method;
    }

    public static SubLObject google_passage_get_total_for_rank_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_google_passage_method = NIL;
        final SubLObject total = get_google_passage_total(self);
        try {
            thread.throwStack.push($sym550$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
            try {
                sublisp_throw($sym550$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD, total);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_google_passage_total(self, total);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_google_passage_method = Errors.handleThrowable(ccatch_env_var, $sym550$OUTER_CATCH_FOR_GOOGLE_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_google_passage_method;
    }

    public static SubLObject google_passage_get_rank_and_total_method(final SubLObject self) {
        return values(google_passage_get_rank_method(self), google_passage_get_total_for_rank_method(self));
    }

    public static SubLObject google_passage_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        princ(google_passage_get_source_method(self), stream);
        terpri(stream);
        return self;
    }

    public static SubLObject google_passage_get_publication_date_method(final SubLObject self) {
        return NIL;
    }

    public static SubLObject get_lucene_query_sentno(final SubLObject lucene_query) {
        return classes.subloop_get_access_protected_instance_slot(lucene_query, SIX_INTEGER, SENTNO);
    }

    public static SubLObject set_lucene_query_sentno(final SubLObject lucene_query, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lucene_query, value, SIX_INTEGER, SENTNO);
    }

    public static SubLObject get_lucene_query_docno(final SubLObject lucene_query) {
        return classes.subloop_get_access_protected_instance_slot(lucene_query, FIVE_INTEGER, DOCNO);
    }

    public static SubLObject set_lucene_query_docno(final SubLObject lucene_query, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lucene_query, value, FIVE_INTEGER, DOCNO);
    }

    public static SubLObject subloop_reserved_initialize_lucene_query_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_lucene_query_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, ERROR_HANDLING, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, KNOWLEDGE_SOURCE_QUERY, QUERY, NIL);
        classes.subloop_initialize_slot(new_instance, CORPUS_QUERY, CORPUS, NIL);
        classes.subloop_initialize_slot(new_instance, LUCENE_QUERY, DOCNO, NIL);
        classes.subloop_initialize_slot(new_instance, LUCENE_QUERY, SENTNO, NIL);
        return NIL;
    }

    public static SubLObject lucene_query_p(final SubLObject lucene_query) {
        return classes.subloop_instanceof_class(lucene_query, LUCENE_QUERY);
    }

    public static SubLObject new_lucene_query(final SubLObject string, SubLObject docno, SubLObject sentno) {
        if (docno == UNPROVIDED) {
            docno = $int$50;
        }
        if (sentno == UNPROVIDED) {
            sentno = $int$50;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != subl_promotions.positive_integer_p(docno) : "subl_promotions.positive_integer_p(docno) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(docno) " + docno;
        assert NIL != subl_promotions.positive_integer_p(sentno) : "subl_promotions.positive_integer_p(sentno) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(sentno) " + sentno;
        final SubLObject query = object.new_class_instance(LUCENE_QUERY);
        set_knowledge_source_query_query(query, string);
        set_corpus_query_corpus(query, $wikipedia$.getDynamicValue(thread));
        set_lucene_query_docno(query, docno);
        set_lucene_query_sentno(query, sentno);
        return query;
    }

    public static SubLObject lucene_query_get_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_query_method = NIL;
        final SubLObject docno = get_lucene_query_docno(self);
        final SubLObject query = get_knowledge_source_query_query(self);
        try {
            thread.throwStack.push($sym564$OUTER_CATCH_FOR_LUCENE_QUERY_METHOD);
            try {
                sublisp_throw($sym564$OUTER_CATCH_FOR_LUCENE_QUERY_METHOD, methods.funcall_instance_method_with_2_args(get_lucene_client(), SEARCH, query, docno));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lucene_query_docno(self, docno);
                    set_knowledge_source_query_query(self, query);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lucene_query_method = Errors.handleThrowable(ccatch_env_var, $sym564$OUTER_CATCH_FOR_LUCENE_QUERY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_query_method;
    }

    public static SubLObject seed_lucene_client(final SubLObject machine, final SubLObject port) {
        assert NIL != stringp(machine) : "Types.stringp(machine) " + "CommonSymbols.NIL != Types.stringp(machine) " + machine;
        assert NIL != subl_promotions.positive_integer_p(port) : "subl_promotions.positive_integer_p(port) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(port) " + port;
        $lucene_client_host$.setDynamicValue(machine);
        $lucene_client_port$.setDynamicValue(port);
        return T;
    }

    public static SubLObject get_lucene_client() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $lucene_client$.getDynamicValue(thread)) {
            $lucene_client$.setDynamicValue(object.new_class_instance(LUCENE_CLIENT), thread);
            methods.funcall_instance_method_with_1_args($lucene_client$.getDynamicValue(thread), SET_HOST, $lucene_client_host$.getDynamicValue(thread));
            methods.funcall_instance_method_with_1_args($lucene_client$.getDynamicValue(thread), SET_PORT, $lucene_client_port$.getDynamicValue(thread));
        }
        return $lucene_client$.getDynamicValue(thread);
    }

    public static SubLObject get_lucene_client_client_interaction(final SubLObject lucene_client) {
        return classes.subloop_get_access_protected_instance_slot(lucene_client, THREE_INTEGER, CLIENT_INTERACTION);
    }

    public static SubLObject set_lucene_client_client_interaction(final SubLObject lucene_client, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lucene_client, value, THREE_INTEGER, CLIENT_INTERACTION);
    }

    public static SubLObject subloop_reserved_initialize_lucene_client_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_lucene_client_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TCP_CLIENT, HOST, NIL);
        classes.subloop_initialize_slot(new_instance, TCP_CLIENT, PORT, NIL);
        classes.subloop_initialize_slot(new_instance, LUCENE_CLIENT, CLIENT_INTERACTION, NIL);
        return NIL;
    }

    public static SubLObject lucene_client_p(final SubLObject lucene_client) {
        return classes.subloop_instanceof_class(lucene_client, LUCENE_CLIENT);
    }

    public static SubLObject lucene_client_initialize_method(final SubLObject self) {
        subloop_tcp_client.tcp_client_initialize_method(self);
        return self;
    }

    public static SubLObject lucene_client_search_method(final SubLObject self, final SubLObject directive_arg, SubLObject docno) {
        if (docno == UNPROVIDED) {
            docno = $int$50;
        }
        assert NIL != stringp(directive_arg) : "Types.stringp(directive_arg) " + "CommonSymbols.NIL != Types.stringp(directive_arg) " + directive_arg;
        return methods.funcall_instance_method_with_3_args(self, LUCENE_REQUEST, $$$search, directive_arg, docno);
    }

    public static SubLObject lucene_client_count_method(final SubLObject self, final SubLObject directive_arg) {
        assert NIL != stringp(directive_arg) : "Types.stringp(directive_arg) " + "CommonSymbols.NIL != Types.stringp(directive_arg) " + directive_arg;
        return methods.funcall_instance_method_with_2_args(self, LUCENE_REQUEST, $$$count, directive_arg);
    }

    public static SubLObject lucene_client_lucene_request_method(final SubLObject self, final SubLObject directive, final SubLObject directive_arg, SubLObject docno) {
        if (docno == UNPROVIDED) {
            docno = TEN_INTEGER;
        }
        SubLObject client_interaction = get_lucene_client_client_interaction(self);
        final SubLObject request = object.new_class_instance(LUCENE_CLIENT_INTERACTION);
        methods.funcall_instance_method_with_1_args(request, SET_DIRECTIVE, directive);
        methods.funcall_instance_method_with_1_args(request, SET_DIRECTIVE_ARG, directive_arg);
        methods.funcall_instance_method_with_1_args(request, SET_DOCNO, docno);
        client_interaction = request;
        set_lucene_client_client_interaction(self, client_interaction);
        methods.funcall_instance_method_with_1_args(client_interaction, BUILD_ANSWER, methods.funcall_instance_method_with_1_args(self, PERFORM_REQUEST, methods.funcall_instance_method_with_0_args(client_interaction, REQUEST_STRING)));
        return methods.funcall_instance_method_with_0_args(client_interaction, GET_ANSWER);
    }

    public static SubLObject get_lucene_client_interaction_lucene_count(final SubLObject lucene_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(lucene_client_interaction, FIVE_INTEGER, LUCENE_COUNT);
    }

    public static SubLObject set_lucene_client_interaction_lucene_count(final SubLObject lucene_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lucene_client_interaction, value, FIVE_INTEGER, LUCENE_COUNT);
    }

    public static SubLObject get_lucene_client_interaction_lucene_passages(final SubLObject lucene_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(lucene_client_interaction, FOUR_INTEGER, LUCENE_PASSAGES);
    }

    public static SubLObject set_lucene_client_interaction_lucene_passages(final SubLObject lucene_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lucene_client_interaction, value, FOUR_INTEGER, LUCENE_PASSAGES);
    }

    public static SubLObject get_lucene_client_interaction_directive_arg(final SubLObject lucene_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(lucene_client_interaction, THREE_INTEGER, DIRECTIVE_ARG);
    }

    public static SubLObject set_lucene_client_interaction_directive_arg(final SubLObject lucene_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lucene_client_interaction, value, THREE_INTEGER, DIRECTIVE_ARG);
    }

    public static SubLObject get_lucene_client_interaction_directive(final SubLObject lucene_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(lucene_client_interaction, TWO_INTEGER, DIRECTIVE);
    }

    public static SubLObject set_lucene_client_interaction_directive(final SubLObject lucene_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lucene_client_interaction, value, TWO_INTEGER, DIRECTIVE);
    }

    public static SubLObject get_lucene_client_interaction_docno(final SubLObject lucene_client_interaction) {
        return classes.subloop_get_access_protected_instance_slot(lucene_client_interaction, ONE_INTEGER, DOCNO);
    }

    public static SubLObject set_lucene_client_interaction_docno(final SubLObject lucene_client_interaction, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lucene_client_interaction, value, ONE_INTEGER, DOCNO);
    }

    public static SubLObject get_lucene_client_interaction_content_keyword(final SubLObject lucene_client_interaction) {
        final SubLObject v_class = (lucene_client_interaction.isSymbol()) ? classes.classes_retrieve_class(lucene_client_interaction) : NIL != subloop_structures.class_p(lucene_client_interaction) ? lucene_client_interaction : NIL != subloop_structures.instance_p(lucene_client_interaction) ? subloop_structures.instance_class(lucene_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), NINE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_lucene_client_interaction_content_keyword(final SubLObject lucene_client_interaction, final SubLObject value) {
        final SubLObject v_class = (lucene_client_interaction.isSymbol()) ? classes.classes_retrieve_class(lucene_client_interaction) : NIL != subloop_structures.class_p(lucene_client_interaction) ? lucene_client_interaction : NIL != subloop_structures.instance_p(lucene_client_interaction) ? subloop_structures.instance_class(lucene_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), NINE_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_lucene_client_interaction_id_keyword(final SubLObject lucene_client_interaction) {
        final SubLObject v_class = (lucene_client_interaction.isSymbol()) ? classes.classes_retrieve_class(lucene_client_interaction) : NIL != subloop_structures.class_p(lucene_client_interaction) ? lucene_client_interaction : NIL != subloop_structures.instance_p(lucene_client_interaction) ? subloop_structures.instance_class(lucene_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), EIGHT_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_lucene_client_interaction_id_keyword(final SubLObject lucene_client_interaction, final SubLObject value) {
        final SubLObject v_class = (lucene_client_interaction.isSymbol()) ? classes.classes_retrieve_class(lucene_client_interaction) : NIL != subloop_structures.class_p(lucene_client_interaction) ? lucene_client_interaction : NIL != subloop_structures.instance_p(lucene_client_interaction) ? subloop_structures.instance_class(lucene_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), EIGHT_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_lucene_client_interaction_query_language_attr(final SubLObject lucene_client_interaction) {
        final SubLObject v_class = (lucene_client_interaction.isSymbol()) ? classes.classes_retrieve_class(lucene_client_interaction) : NIL != subloop_structures.class_p(lucene_client_interaction) ? lucene_client_interaction : NIL != subloop_structures.instance_p(lucene_client_interaction) ? subloop_structures.instance_class(lucene_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), SEVEN_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_lucene_client_interaction_query_language_attr(final SubLObject lucene_client_interaction, final SubLObject value) {
        final SubLObject v_class = (lucene_client_interaction.isSymbol()) ? classes.classes_retrieve_class(lucene_client_interaction) : NIL != subloop_structures.class_p(lucene_client_interaction) ? lucene_client_interaction : NIL != subloop_structures.instance_p(lucene_client_interaction) ? subloop_structures.instance_class(lucene_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), SEVEN_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_lucene_client_interaction_query_count_attr(final SubLObject lucene_client_interaction) {
        final SubLObject v_class = (lucene_client_interaction.isSymbol()) ? classes.classes_retrieve_class(lucene_client_interaction) : NIL != subloop_structures.class_p(lucene_client_interaction) ? lucene_client_interaction : NIL != subloop_structures.instance_p(lucene_client_interaction) ? subloop_structures.instance_class(lucene_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), SIX_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_lucene_client_interaction_query_count_attr(final SubLObject lucene_client_interaction, final SubLObject value) {
        final SubLObject v_class = (lucene_client_interaction.isSymbol()) ? classes.classes_retrieve_class(lucene_client_interaction) : NIL != subloop_structures.class_p(lucene_client_interaction) ? lucene_client_interaction : NIL != subloop_structures.instance_p(lucene_client_interaction) ? subloop_structures.instance_class(lucene_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), SIX_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_lucene_client_interaction_query_type_attr(final SubLObject lucene_client_interaction) {
        final SubLObject v_class = (lucene_client_interaction.isSymbol()) ? classes.classes_retrieve_class(lucene_client_interaction) : NIL != subloop_structures.class_p(lucene_client_interaction) ? lucene_client_interaction : NIL != subloop_structures.instance_p(lucene_client_interaction) ? subloop_structures.instance_class(lucene_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), FIVE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_lucene_client_interaction_query_type_attr(final SubLObject lucene_client_interaction, final SubLObject value) {
        final SubLObject v_class = (lucene_client_interaction.isSymbol()) ? classes.classes_retrieve_class(lucene_client_interaction) : NIL != subloop_structures.class_p(lucene_client_interaction) ? lucene_client_interaction : NIL != subloop_structures.instance_p(lucene_client_interaction) ? subloop_structures.instance_class(lucene_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), FIVE_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_lucene_client_interaction_query_tag(final SubLObject lucene_client_interaction) {
        final SubLObject v_class = (lucene_client_interaction.isSymbol()) ? classes.classes_retrieve_class(lucene_client_interaction) : NIL != subloop_structures.class_p(lucene_client_interaction) ? lucene_client_interaction : NIL != subloop_structures.instance_p(lucene_client_interaction) ? subloop_structures.instance_class(lucene_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), FOUR_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_lucene_client_interaction_query_tag(final SubLObject lucene_client_interaction, final SubLObject value) {
        final SubLObject v_class = (lucene_client_interaction.isSymbol()) ? classes.classes_retrieve_class(lucene_client_interaction) : NIL != subloop_structures.class_p(lucene_client_interaction) ? lucene_client_interaction : NIL != subloop_structures.instance_p(lucene_client_interaction) ? subloop_structures.instance_class(lucene_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), FOUR_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_lucene_client_interaction_subl_directive_tag(final SubLObject lucene_client_interaction) {
        final SubLObject v_class = (lucene_client_interaction.isSymbol()) ? classes.classes_retrieve_class(lucene_client_interaction) : NIL != subloop_structures.class_p(lucene_client_interaction) ? lucene_client_interaction : NIL != subloop_structures.instance_p(lucene_client_interaction) ? subloop_structures.instance_class(lucene_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_lucene_client_interaction_subl_directive_tag(final SubLObject lucene_client_interaction, final SubLObject value) {
        final SubLObject v_class = (lucene_client_interaction.isSymbol()) ? classes.classes_retrieve_class(lucene_client_interaction) : NIL != subloop_structures.class_p(lucene_client_interaction) ? lucene_client_interaction : NIL != subloop_structures.instance_p(lucene_client_interaction) ? subloop_structures.instance_class(lucene_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_lucene_client_interaction_count_directive_tag(final SubLObject lucene_client_interaction) {
        final SubLObject v_class = (lucene_client_interaction.isSymbol()) ? classes.classes_retrieve_class(lucene_client_interaction) : NIL != subloop_structures.class_p(lucene_client_interaction) ? lucene_client_interaction : NIL != subloop_structures.instance_p(lucene_client_interaction) ? subloop_structures.instance_class(lucene_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_lucene_client_interaction_count_directive_tag(final SubLObject lucene_client_interaction, final SubLObject value) {
        final SubLObject v_class = (lucene_client_interaction.isSymbol()) ? classes.classes_retrieve_class(lucene_client_interaction) : NIL != subloop_structures.class_p(lucene_client_interaction) ? lucene_client_interaction : NIL != subloop_structures.instance_p(lucene_client_interaction) ? subloop_structures.instance_class(lucene_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_lucene_client_interaction_search_directive_tag(final SubLObject lucene_client_interaction) {
        final SubLObject v_class = (lucene_client_interaction.isSymbol()) ? classes.classes_retrieve_class(lucene_client_interaction) : NIL != subloop_structures.class_p(lucene_client_interaction) ? lucene_client_interaction : NIL != subloop_structures.instance_p(lucene_client_interaction) ? subloop_structures.instance_class(lucene_client_interaction) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_lucene_client_interaction_search_directive_tag(final SubLObject lucene_client_interaction, final SubLObject value) {
        final SubLObject v_class = (lucene_client_interaction.isSymbol()) ? classes.classes_retrieve_class(lucene_client_interaction) : NIL != subloop_structures.class_p(lucene_client_interaction) ? lucene_client_interaction : NIL != subloop_structures.instance_p(lucene_client_interaction) ? subloop_structures.instance_class(lucene_client_interaction) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_lucene_client_interaction_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, LUCENE_CLIENT_INTERACTION, SEARCH_DIRECTIVE_TAG, $$$search);
        classes.subloop_initialize_slot(new_instance, LUCENE_CLIENT_INTERACTION, COUNT_DIRECTIVE_TAG, $$$count);
        classes.subloop_initialize_slot(new_instance, LUCENE_CLIENT_INTERACTION, SUBL_DIRECTIVE_TAG, $$$SubL);
        classes.subloop_initialize_slot(new_instance, LUCENE_CLIENT_INTERACTION, QUERY_TAG, $$$query);
        classes.subloop_initialize_slot(new_instance, LUCENE_CLIENT_INTERACTION, QUERY_TYPE_ATTR, $$$type);
        classes.subloop_initialize_slot(new_instance, LUCENE_CLIENT_INTERACTION, QUERY_COUNT_ATTR, $$$hitnum);
        classes.subloop_initialize_slot(new_instance, LUCENE_CLIENT_INTERACTION, QUERY_LANGUAGE_ATTR, $$$language);
        classes.subloop_initialize_slot(new_instance, LUCENE_CLIENT_INTERACTION, ID_KEYWORD, $ID);
        classes.subloop_initialize_slot(new_instance, LUCENE_CLIENT_INTERACTION, CONTENT_KEYWORD, $CONTENT);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_lucene_client_interaction_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LUCENE_CLIENT_INTERACTION, DOCNO, NIL);
        classes.subloop_initialize_slot(new_instance, LUCENE_CLIENT_INTERACTION, DIRECTIVE, NIL);
        classes.subloop_initialize_slot(new_instance, LUCENE_CLIENT_INTERACTION, DIRECTIVE_ARG, NIL);
        classes.subloop_initialize_slot(new_instance, LUCENE_CLIENT_INTERACTION, LUCENE_PASSAGES, NIL);
        classes.subloop_initialize_slot(new_instance, LUCENE_CLIENT_INTERACTION, LUCENE_COUNT, NIL);
        return NIL;
    }

    public static SubLObject lucene_client_interaction_p(final SubLObject lucene_client_interaction) {
        return classes.subloop_instanceof_class(lucene_client_interaction, LUCENE_CLIENT_INTERACTION);
    }

    public static SubLObject lucene_client_interaction_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_client_interaction_method = NIL;
        SubLObject lucene_passages = get_lucene_client_interaction_lucene_passages(self);
        try {
            thread.throwStack.push($sym589$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
            try {
                object.object_initialize_method(self);
                lucene_passages = object.new_class_instance(LUCENE_PASSAGE_LIST);
                sublisp_throw($sym589$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lucene_client_interaction_lucene_passages(self, lucene_passages);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lucene_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym589$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_client_interaction_method;
    }

    public static SubLObject lucene_client_interaction_set_directive_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_client_interaction_method = NIL;
        SubLObject directive = get_lucene_client_interaction_directive(self);
        try {
            thread.throwStack.push($sym592$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
            try {
                assert NIL != stringp(v_object) : "Types.stringp error :" + v_object;
                directive = v_object;
                sublisp_throw($sym592$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lucene_client_interaction_directive(self, directive);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lucene_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym592$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_client_interaction_method;
    }

    public static SubLObject lucene_client_interaction_build_answer_method(final SubLObject self, final SubLObject response_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_client_interaction_method = NIL;
        final SubLObject content_keyword = get_lucene_client_interaction_content_keyword(self);
        final SubLObject id_keyword = get_lucene_client_interaction_id_keyword(self);
        final SubLObject count_directive_tag = get_lucene_client_interaction_count_directive_tag(self);
        final SubLObject search_directive_tag = get_lucene_client_interaction_search_directive_tag(self);
        SubLObject lucene_count = get_lucene_client_interaction_lucene_count(self);
        final SubLObject lucene_passages = get_lucene_client_interaction_lucene_passages(self);
        final SubLObject directive = get_lucene_client_interaction_directive(self);
        try {
            thread.throwStack.push($sym595$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
            try {
                SubLObject response = NIL;
                SubLObject error = NIL;
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            response = read_from_string(response_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
                if (NIL != error) {
                    Errors.warn(error);
                    sublisp_throw($sym595$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, self);
                }
                if (directive.equalp(count_directive_tag)) {
                    if (response.isInteger()) {
                        lucene_count = response;
                    } else {
                        Errors.warn($str596$Lucene_count_is_not_a_digit_strin);
                        lucene_count = ZERO_INTEGER;
                    }
                } else
                    if (directive.equalp(search_directive_tag)) {
                        if (response.isList()) {
                            final SubLObject rank = ONE_INTEGER;
                            SubLObject cdolist_list_var = response;
                            SubLObject passage = NIL;
                            passage = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                final SubLObject id = getf(passage, id_keyword, UNPROVIDED);
                                final SubLObject text = getf(passage, content_keyword, UNPROVIDED);
                                methods.funcall_instance_method_with_1_args(lucene_passages, ADD, new_lucene_passage(id, rank, text));
                                cdolist_list_var = cdolist_list_var.rest();
                                passage = cdolist_list_var.first();
                            } 
                        } else {
                            Errors.warn($str597$Response_is_of_unwanted_type__S_, type_of(response));
                        }
                    } else {
                        Errors.warn($str452$Query_directive__S_is_not_support, directive);
                    }

                sublisp_throw($sym595$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lucene_client_interaction_content_keyword(self, content_keyword);
                    set_lucene_client_interaction_id_keyword(self, id_keyword);
                    set_lucene_client_interaction_count_directive_tag(self, count_directive_tag);
                    set_lucene_client_interaction_search_directive_tag(self, search_directive_tag);
                    set_lucene_client_interaction_lucene_count(self, lucene_count);
                    set_lucene_client_interaction_lucene_passages(self, lucene_passages);
                    set_lucene_client_interaction_directive(self, directive);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var2) {
            catch_var_for_lucene_client_interaction_method = Errors.handleThrowable(ccatch_env_var2, $sym595$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_client_interaction_method;
    }

    public static SubLObject lucene_client_interaction_get_directive_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_client_interaction_method = NIL;
        final SubLObject directive = get_lucene_client_interaction_directive(self);
        try {
            thread.throwStack.push($sym599$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
            try {
                sublisp_throw($sym599$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, directive);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lucene_client_interaction_directive(self, directive);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lucene_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym599$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_client_interaction_method;
    }

    public static SubLObject lucene_client_interaction_set_directive_arg_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_client_interaction_method = NIL;
        SubLObject directive_arg = get_lucene_client_interaction_directive_arg(self);
        try {
            thread.throwStack.push($sym601$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
            try {
                assert NIL != stringp(v_object) : "Types.stringp error :" + v_object;
                directive_arg = v_object;
                sublisp_throw($sym601$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lucene_client_interaction_directive_arg(self, directive_arg);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lucene_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym601$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_client_interaction_method;
    }

    public static SubLObject lucene_client_interaction_set_docno_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_client_interaction_method = NIL;
        SubLObject docno = get_lucene_client_interaction_docno(self);
        try {
            thread.throwStack.push($sym603$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
            try {
                assert NIL != integerp(v_object) : "Types.integerp error :" + v_object;
                docno = v_object;
                sublisp_throw($sym603$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lucene_client_interaction_docno(self, docno);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lucene_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym603$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_client_interaction_method;
    }

    public static SubLObject lucene_client_interaction_request_string_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_client_interaction_method = NIL;
        final SubLObject query_language_attr = get_lucene_client_interaction_query_language_attr(self);
        final SubLObject query_count_attr = get_lucene_client_interaction_query_count_attr(self);
        final SubLObject query_type_attr = get_lucene_client_interaction_query_type_attr(self);
        final SubLObject query_tag = get_lucene_client_interaction_query_tag(self);
        final SubLObject subl_directive_tag = get_lucene_client_interaction_subl_directive_tag(self);
        final SubLObject directive_arg = get_lucene_client_interaction_directive_arg(self);
        final SubLObject directive = get_lucene_client_interaction_directive(self);
        final SubLObject docno = get_lucene_client_interaction_docno(self);
        try {
            thread.throwStack.push($sym606$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
            try {
                SubLObject result = $str355$;
                if ((NIL != directive) && (NIL != directive_arg)) {
                    final SubLObject outstream = make_string_output_stream();
                    final SubLObject v_xml_writer = object.new_class_instance(XML_WRITER);
                    methods.funcall_instance_method_with_1_args(v_xml_writer, SET_STREAM, outstream);
                    methods.funcall_instance_method_with_4_args(v_xml_writer, START_TAG, query_tag, list(query_type_attr, directive, query_count_attr, docno, query_language_attr, subl_directive_tag), NIL, NIL);
                    methods.funcall_instance_method_with_2_args(v_xml_writer, XML_PRINT, directive_arg, NIL);
                    methods.funcall_instance_method_with_2_args(v_xml_writer, END_TAG, query_tag, NIL);
                    result = string_utilities.trim_whitespace(get_output_stream_string(outstream));
                }
                sublisp_throw($sym606$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, result);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lucene_client_interaction_query_language_attr(self, query_language_attr);
                    set_lucene_client_interaction_query_count_attr(self, query_count_attr);
                    set_lucene_client_interaction_query_type_attr(self, query_type_attr);
                    set_lucene_client_interaction_query_tag(self, query_tag);
                    set_lucene_client_interaction_subl_directive_tag(self, subl_directive_tag);
                    set_lucene_client_interaction_directive_arg(self, directive_arg);
                    set_lucene_client_interaction_directive(self, directive);
                    set_lucene_client_interaction_docno(self, docno);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lucene_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym606$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_client_interaction_method;
    }

    public static SubLObject lucene_client_interaction_get_answer_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_client_interaction_method = NIL;
        final SubLObject count_directive_tag = get_lucene_client_interaction_count_directive_tag(self);
        final SubLObject search_directive_tag = get_lucene_client_interaction_search_directive_tag(self);
        final SubLObject lucene_count = get_lucene_client_interaction_lucene_count(self);
        final SubLObject directive = get_lucene_client_interaction_directive(self);
        try {
            thread.throwStack.push($sym609$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
            try {
                if (directive.equalp(count_directive_tag)) {
                    sublisp_throw($sym609$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, lucene_count);
                } else
                    if (directive.equalp(search_directive_tag)) {
                        sublisp_throw($sym609$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, methods.funcall_instance_method_with_0_args(self, GET_LUCENE_PASSAGES));
                    }

            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lucene_client_interaction_count_directive_tag(self, count_directive_tag);
                    set_lucene_client_interaction_search_directive_tag(self, search_directive_tag);
                    set_lucene_client_interaction_lucene_count(self, lucene_count);
                    set_lucene_client_interaction_directive(self, directive);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lucene_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym609$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_client_interaction_method;
    }

    public static SubLObject lucene_client_interaction_get_lucene_passages_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_client_interaction_method = NIL;
        final SubLObject lucene_passages = get_lucene_client_interaction_lucene_passages(self);
        try {
            thread.throwStack.push($sym613$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
            try {
                SubLObject passage_list = NIL;
                SubLObject enumerator = NIL;
                if (NIL == methods.funcall_instance_method_with_0_args(lucene_passages, EMPTY_P)) {
                    enumerator = methods.funcall_instance_method_with_0_args(lucene_passages, ALLOCATE_ENUMERATOR);
                    passage_list = cons(methods.funcall_instance_method_with_0_args(enumerator, FIRST), passage_list);
                    while (NIL == methods.funcall_instance_method_with_0_args(enumerator, LAST_P)) {
                        passage_list = cons(methods.funcall_instance_method_with_0_args(enumerator, NEXT), passage_list);
                    } 
                }
                sublisp_throw($sym613$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD, nreverse(passage_list));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lucene_client_interaction_lucene_passages(self, lucene_passages);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lucene_client_interaction_method = Errors.handleThrowable(ccatch_env_var, $sym613$OUTER_CATCH_FOR_LUCENE_CLIENT_INTERACTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_client_interaction_method;
    }

    public static SubLObject subloop_reserved_initialize_lucene_passage_list_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_lucene_passage_list_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_COLLECTION, CONTENTS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_COLLECTION, ELEMENT_EQUALITY_PREDICATE, NIL);
        return NIL;
    }

    public static SubLObject lucene_passage_list_p(final SubLObject lucene_passage_list) {
        return classes.subloop_instanceof_class(lucene_passage_list, LUCENE_PASSAGE_LIST);
    }

    public static SubLObject lucene_passage_list_acceptable_p_method(final SubLObject self, final SubLObject new_element) {
        return makeBoolean((NIL != instances.instance_of_p(new_element, LUCENE_PASSAGE)) && (NIL != methods.funcall_instance_method_with_0_args(new_element, IS_COMPLETE)));
    }

    public static SubLObject lucene_passage_list_add_method(final SubLObject self, final SubLObject new_element) {
        if (NIL != methods.funcall_instance_method_with_1_args(self, ACCEPTABLE_P, new_element)) {
            methods.funcall_instance_super_method_with_1_args(self, ADD, new_element);
        } else {
            Errors.warn($str621$__Cannot_add__S_to_a_lucene_passa, new_element);
        }
        return self;
    }

    public static SubLObject get_lucene_passage_parse_trees(final SubLObject lucene_passage) {
        return classes.subloop_get_access_protected_instance_slot(lucene_passage, SIX_INTEGER, PARSE_TREES);
    }

    public static SubLObject set_lucene_passage_parse_trees(final SubLObject lucene_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lucene_passage, value, SIX_INTEGER, PARSE_TREES);
    }

    public static SubLObject get_lucene_passage_id(final SubLObject lucene_passage) {
        return classes.subloop_get_access_protected_instance_slot(lucene_passage, FIVE_INTEGER, ID);
    }

    public static SubLObject set_lucene_passage_id(final SubLObject lucene_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lucene_passage, value, FIVE_INTEGER, ID);
    }

    public static SubLObject get_lucene_passage_rank(final SubLObject lucene_passage) {
        return classes.subloop_get_access_protected_instance_slot(lucene_passage, FOUR_INTEGER, RANK);
    }

    public static SubLObject set_lucene_passage_rank(final SubLObject lucene_passage, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lucene_passage, value, FOUR_INTEGER, RANK);
    }

    public static SubLObject subloop_reserved_initialize_lucene_passage_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_lucene_passage_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_PASSAGE, VECTOR, NIL);
        classes.subloop_initialize_slot(new_instance, CORPUS_PASSAGE, CORPUS, NIL);
        classes.subloop_initialize_slot(new_instance, CORPUS_PASSAGE, TEXT, NIL);
        classes.subloop_initialize_slot(new_instance, LUCENE_PASSAGE, RANK, NIL);
        classes.subloop_initialize_slot(new_instance, LUCENE_PASSAGE, ID, NIL);
        classes.subloop_initialize_slot(new_instance, LUCENE_PASSAGE, PARSE_TREES, NIL);
        return NIL;
    }

    public static SubLObject lucene_passage_p(final SubLObject lucene_passage) {
        return classes.subloop_instanceof_class(lucene_passage, LUCENE_PASSAGE);
    }

    public static SubLObject new_lucene_passage(final SubLObject id, final SubLObject rank, final SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(id) : "Types.stringp(id) " + "CommonSymbols.NIL != Types.stringp(id) " + id;
        assert NIL != subl_promotions.non_negative_integer_p(rank) : "subl_promotions.non_negative_integer_p(rank) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(rank) " + rank;
        assert NIL != stringp(text) : "Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) " + text;
        final SubLObject passage = object.new_class_instance(LUCENE_PASSAGE);
        set_corpus_passage_corpus(passage, $wikipedia$.getDynamicValue(thread));
        set_corpus_passage_text(passage, text);
        set_lucene_passage_id(passage, id);
        set_lucene_passage_rank(passage, rank);
        return passage;
    }

    public static SubLObject lucene_passage_get_source_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_passage_method = NIL;
        final SubLObject id = get_lucene_passage_id(self);
        try {
            thread.throwStack.push($sym628$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD);
            try {
                sublisp_throw($sym628$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD, id);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lucene_passage_id(self, id);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lucene_passage_method = Errors.handleThrowable(ccatch_env_var, $sym628$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_passage_method;
    }

    public static SubLObject lucene_passage_get_score_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_passage_method = NIL;
        final SubLObject rank = get_lucene_passage_rank(self);
        try {
            thread.throwStack.push($sym631$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD);
            try {
                if (NIL == rank) {
                    sublisp_throw($sym631$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD, ZERO_INTEGER);
                }
                sublisp_throw($sym631$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD, divide(ONE_INTEGER, rank));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lucene_passage_rank(self, rank);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lucene_passage_method = Errors.handleThrowable(ccatch_env_var, $sym631$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_passage_method;
    }

    public static SubLObject lucene_passage_is_complete_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_passage_method = NIL;
        final SubLObject id = get_lucene_passage_id(self);
        final SubLObject rank = get_lucene_passage_rank(self);
        final SubLObject text = get_corpus_passage_text(self);
        try {
            thread.throwStack.push($sym634$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD);
            try {
                if (NIL == subl_promotions.non_negative_integer_p(rank)) {
                    sublisp_throw($sym634$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD, NIL);
                }
                if (!id.isString()) {
                    sublisp_throw($sym634$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD, NIL);
                }
                if (!text.isString()) {
                    sublisp_throw($sym634$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD, NIL);
                }
                sublisp_throw($sym634$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lucene_passage_id(self, id);
                    set_lucene_passage_rank(self, rank);
                    set_corpus_passage_text(self, text);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lucene_passage_method = Errors.handleThrowable(ccatch_env_var, $sym634$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_passage_method;
    }

    public static SubLObject lucene_passage_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lucene_passage_method = NIL;
        final SubLObject text = get_corpus_passage_text(self);
        try {
            thread.throwStack.push($sym637$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD);
            try {
                princ(lucene_passage_get_source_method(self), stream);
                terpri(stream);
                princ(text, stream);
                sublisp_throw($sym637$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_corpus_passage_text(self, text);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lucene_passage_method = Errors.handleThrowable(ccatch_env_var, $sym637$OUTER_CATCH_FOR_LUCENE_PASSAGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lucene_passage_method;
    }

    public static SubLObject lucene_passage_get_publication_date_method(final SubLObject self) {
        return NIL;
    }

    public static SubLObject get_cycl_query_properties(final SubLObject cycl_query) {
        return classes.subloop_get_access_protected_instance_slot(cycl_query, FIVE_INTEGER, PROPERTIES);
    }

    public static SubLObject set_cycl_query_properties(final SubLObject cycl_query, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cycl_query, value, FIVE_INTEGER, PROPERTIES);
    }

    public static SubLObject get_cycl_query_knowledge_sources(final SubLObject cycl_query) {
        return classes.subloop_get_access_protected_instance_slot(cycl_query, FOUR_INTEGER, KNOWLEDGE_SOURCES);
    }

    public static SubLObject set_cycl_query_knowledge_sources(final SubLObject cycl_query, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cycl_query, value, FOUR_INTEGER, KNOWLEDGE_SOURCES);
    }

    public static SubLObject subloop_reserved_initialize_cycl_query_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_cycl_query_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, ERROR_HANDLING, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, KNOWLEDGE_SOURCE_QUERY, QUERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYCL_QUERY, KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYCL_QUERY, PROPERTIES, NIL);
        return NIL;
    }

    public static SubLObject cycl_query_p(final SubLObject cycl_query) {
        return classes.subloop_instanceof_class(cycl_query, CYCL_QUERY);
    }

    public static SubLObject new_cycl_query(final SubLObject formula, SubLObject knowledge_sources, SubLObject v_properties) {
        if (knowledge_sources == UNPROVIDED) {
            knowledge_sources = $list646;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = $list647;
        }
        assert NIL != el_formula_p(formula) : "el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) " + formula;
        assert NIL != listp(knowledge_sources) : "Types.listp(knowledge_sources) " + "CommonSymbols.NIL != Types.listp(knowledge_sources) " + knowledge_sources;
        assert NIL != listp(v_properties) : "Types.listp(v_properties) " + "CommonSymbols.NIL != Types.listp(v_properties) " + v_properties;
        final SubLObject query = object.new_class_instance(CYCL_QUERY);
        set_knowledge_source_query_query(query, formula);
        set_cycl_query_knowledge_sources(query, knowledge_sources);
        set_cycl_query_properties(query, v_properties);
        return query;
    }

    public static SubLObject cycl_query_equal_p(final SubLObject obj1, final SubLObject obj2) {
        assert NIL != cycl_query_p(obj1) : "search_engine.cycl_query_p(obj1) " + "CommonSymbols.NIL != search_engine.cycl_query_p(obj1) " + obj1;
        assert NIL != cycl_query_p(obj2) : "search_engine.cycl_query_p(obj2) " + "CommonSymbols.NIL != search_engine.cycl_query_p(obj2) " + obj2;
        return equalp(instances.get_slot(obj1, QUERY), instances.get_slot(obj2, QUERY));
    }

    public static SubLObject cycl_query_get_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cycl_query_method = NIL;
        final SubLObject knowledge_sources = get_cycl_query_knowledge_sources(self);
        try {
            thread.throwStack.push($sym651$OUTER_CATCH_FOR_CYCL_QUERY_METHOD);
            try {
                SubLObject assignments = NIL;
                SubLObject cdolist_list_var = knowledge_sources;
                SubLObject ks = NIL;
                ks = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != fort_types_interface.mtP(ks)) {
                        assignments = append(assignments, methods.funcall_instance_method_with_1_args(self, GET_FROM_KB, ks));
                    } else
                        if (NIL != corpus_p(ks)) {
                            assignments = append(assignments, methods.funcall_instance_method_with_1_args(self, GET_FROM_CORPUS, ks));
                        } else {
                            Errors.error($str654$Unknown_knowledge_source__a, ks);
                        }

                    cdolist_list_var = cdolist_list_var.rest();
                    ks = cdolist_list_var.first();
                } 
                sublisp_throw($sym651$OUTER_CATCH_FOR_CYCL_QUERY_METHOD, assignments);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_cycl_query_knowledge_sources(self, knowledge_sources);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cycl_query_method = Errors.handleThrowable(ccatch_env_var, $sym651$OUTER_CATCH_FOR_CYCL_QUERY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cycl_query_method;
    }

    public static SubLObject corpus_p(final SubLObject v_object) {
        return stringp(v_object);
    }

    public static SubLObject cycl_query_get_from_kb_method(final SubLObject self, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cycl_query_method = NIL;
        final SubLObject v_properties = get_cycl_query_properties(self);
        final SubLObject query = get_knowledge_source_query_query(self);
        try {
            thread.throwStack.push($sym658$OUTER_CATCH_FOR_CYCL_QUERY_METHOD);
            try {
                final SubLObject answers = inference_kernel.new_cyc_query(query, mt, v_properties);
                SubLObject assignments = NIL;
                SubLObject cdolist_list_var = answers;
                SubLObject v_answer = NIL;
                v_answer = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    assignments = cons(new_var_assignment(v_answer.first(), second(v_answer)), assignments);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_answer = cdolist_list_var.first();
                } 
                sublisp_throw($sym658$OUTER_CATCH_FOR_CYCL_QUERY_METHOD, assignments);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_cycl_query_properties(self, v_properties);
                    set_knowledge_source_query_query(self, query);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cycl_query_method = Errors.handleThrowable(ccatch_env_var, $sym658$OUTER_CATCH_FOR_CYCL_QUERY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cycl_query_method;
    }

    public static SubLObject cycl_query_get_from_corpus_method(final SubLObject self, final SubLObject corpus) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cycl_query_method = NIL;
        final SubLObject query = get_knowledge_source_query_query(self);
        try {
            thread.throwStack.push($sym662$OUTER_CATCH_FOR_CYCL_QUERY_METHOD);
            try {
                final SubLObject paraphrase = pph_question.generate_question(query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject v_question = (NIL != paraphrase) ? question.new_question(paraphrase, list(corpus), UNPROVIDED) : NIL;
                final SubLObject tmp_mt = new_tmp_mt(UNPROVIDED);
                SubLObject assignments = NIL;
                if (NIL != v_question) {
                    princ(v_question, UNPROVIDED);
                    terpri(UNPROVIDED);
                    SubLObject cdolist_list_var = list(methods.funcall_instance_method_with_0_args(v_question, ANSWER).first());
                    SubLObject v_answer = NIL;
                    v_answer = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        princ(v_answer, UNPROVIDED);
                        terpri(UNPROVIDED);
                        assignments = append(methods.funcall_instance_method_with_2_args(self, GENERATE_ASSIGNMENTS, v_answer, tmp_mt), assignments);
                        cdolist_list_var = cdolist_list_var.rest();
                        v_answer = cdolist_list_var.first();
                    } 
                }
                sublisp_throw($sym662$OUTER_CATCH_FOR_CYCL_QUERY_METHOD, assignments);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_knowledge_source_query_query(self, query);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cycl_query_method = Errors.handleThrowable(ccatch_env_var, $sym662$OUTER_CATCH_FOR_CYCL_QUERY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cycl_query_method;
    }

    public static SubLObject cycl_query_generate_assignments_method(final SubLObject self, final SubLObject v_answer, final SubLObject tmp_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cycl_query_method = NIL;
        final SubLObject v_properties = get_cycl_query_properties(self);
        final SubLObject query = get_knowledge_source_query_query(self);
        try {
            thread.throwStack.push($sym667$OUTER_CATCH_FOR_CYCL_QUERY_METHOD);
            try {
                assert NIL != answer.answer_p(v_answer) : "answer.answer_p(v_answer) " + "CommonSymbols.NIL != answer.answer_p(v_answer) " + v_answer;
                SubLObject assignments = NIL;
                SubLObject hyp_bindings = NIL;
                SubLObject cdolist_list_var = cyclifier.cyclify(methods.funcall_instance_method_with_0_args(v_answer, GET_CONTENT), UNPROVIDED);
                SubLObject cycl = NIL;
                cycl = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    hyp_bindings = cons(prove.fi_hypothesize_int(cycl, tmp_mt, UNPROVIDED, UNPROVIDED), hyp_bindings);
                    cdolist_list_var = cdolist_list_var.rest();
                    cycl = cdolist_list_var.first();
                } 
                cdolist_list_var = inference_kernel.new_cyc_query(query, tmp_mt, v_properties);
                SubLObject binding = NIL;
                binding = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    assignments = cons(new_var_assignment(binding.first(), list(second(binding), v_answer)), assignments);
                    cdolist_list_var = cdolist_list_var.rest();
                    binding = cdolist_list_var.first();
                } 
                sublisp_throw($sym667$OUTER_CATCH_FOR_CYCL_QUERY_METHOD, assignments);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_cycl_query_properties(self, v_properties);
                    set_knowledge_source_query_query(self, query);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cycl_query_method = Errors.handleThrowable(ccatch_env_var, $sym667$OUTER_CATCH_FOR_CYCL_QUERY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cycl_query_method;
    }

    public static SubLObject new_tmp_mt(SubLObject super_mt) {
        if (super_mt == UNPROVIDED) {
            super_mt = NIL;
        }
        if (((NIL != super_mt) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == fort_types_interface.microtheory_p(super_mt))) {
            throw new AssertionError(super_mt);
        }
        final SubLObject spec_mt = fi.fi_create_int(princ_to_string(gensym($str671$TEMP_MT_)), UNPROVIDED);
        fi.fi_assert_int(listS($$isa, spec_mt, $list673), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
        if (NIL != super_mt) {
            fi.fi_assert_int(list($$genlMt, spec_mt, super_mt), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED);
        }
        return spec_mt;
    }

    public static SubLObject get_var_assignment_justification(final SubLObject var_assignment) {
        return classes.subloop_get_access_protected_instance_slot(var_assignment, TWO_INTEGER, JUSTIFICATION);
    }

    public static SubLObject set_var_assignment_justification(final SubLObject var_assignment, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(var_assignment, value, TWO_INTEGER, JUSTIFICATION);
    }

    public static SubLObject get_var_assignment_bindings(final SubLObject var_assignment) {
        return classes.subloop_get_access_protected_instance_slot(var_assignment, ONE_INTEGER, BINDINGS);
    }

    public static SubLObject set_var_assignment_bindings(final SubLObject var_assignment, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(var_assignment, value, ONE_INTEGER, BINDINGS);
    }

    public static SubLObject subloop_reserved_initialize_var_assignment_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_var_assignment_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, VAR_ASSIGNMENT, BINDINGS, NIL);
        classes.subloop_initialize_slot(new_instance, VAR_ASSIGNMENT, JUSTIFICATION, NIL);
        return NIL;
    }

    public static SubLObject var_assignment_p(final SubLObject var_assignment) {
        return classes.subloop_instanceof_class(var_assignment, VAR_ASSIGNMENT);
    }

    public static SubLObject new_var_assignment(final SubLObject v_bindings, SubLObject justification) {
        if (justification == UNPROVIDED) {
            justification = NIL;
        }
        assert NIL != bindings.bindings_p(v_bindings) : "bindings.bindings_p(v_bindings) " + "CommonSymbols.NIL != bindings.bindings_p(v_bindings) " + v_bindings;
        final SubLObject assignment = object.new_class_instance(VAR_ASSIGNMENT);
        set_var_assignment_bindings(assignment, v_bindings);
        set_var_assignment_justification(assignment, justification);
        return assignment;
    }

    public static SubLObject var_assignment_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_var_assignment_method = NIL;
        final SubLObject v_bindings = get_var_assignment_bindings(self);
        try {
            thread.throwStack.push($sym684$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD);
            try {
                write_string($str685$__CYC_ASSIGNMENT__, stream, UNPROVIDED, UNPROVIDED);
                princ(v_bindings, stream);
                write_string($str122$_, stream, UNPROVIDED, UNPROVIDED);
                sublisp_throw($sym684$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_var_assignment_bindings(self, v_bindings);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_var_assignment_method = Errors.handleThrowable(ccatch_env_var, $sym684$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_var_assignment_method;
    }

    public static SubLObject var_assignment_get_content_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_var_assignment_method = NIL;
        final SubLObject v_bindings = get_var_assignment_bindings(self);
        try {
            thread.throwStack.push($sym688$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD);
            try {
                sublisp_throw($sym688$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD, v_bindings);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_var_assignment_bindings(self, v_bindings);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_var_assignment_method = Errors.handleThrowable(ccatch_env_var, $sym688$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_var_assignment_method;
    }

    public static SubLObject var_assignment_get_source_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_var_assignment_method = NIL;
        final SubLObject justification = get_var_assignment_justification(self);
        try {
            thread.throwStack.push($sym691$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD);
            try {
                sublisp_throw($sym691$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD, justification);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_var_assignment_justification(self, justification);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_var_assignment_method = Errors.handleThrowable(ccatch_env_var, $sym691$OUTER_CATCH_FOR_VAR_ASSIGNMENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_var_assignment_method;
    }

    public static SubLObject get_wordnet_query_pos(final SubLObject wordnet_query) {
        return classes.subloop_get_access_protected_instance_slot(wordnet_query, FOUR_INTEGER, POS);
    }

    public static SubLObject set_wordnet_query_pos(final SubLObject wordnet_query, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(wordnet_query, value, FOUR_INTEGER, POS);
    }

    public static SubLObject subloop_reserved_initialize_wordnet_query_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_wordnet_query_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, ERROR_HANDLING, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, KNOWLEDGE_SOURCE_QUERY, QUERY, NIL);
        classes.subloop_initialize_slot(new_instance, WORDNET_QUERY, POS, NIL);
        return NIL;
    }

    public static SubLObject wordnet_query_p(final SubLObject wordnet_query) {
        return classes.subloop_instanceof_class(wordnet_query, WORDNET_QUERY);
    }

    public static SubLObject new_wordnet_query(final SubLObject word, final SubLObject pos) {
        assert NIL != stringp(word) : "Types.stringp(word) " + "CommonSymbols.NIL != Types.stringp(word) " + word;
        assert NIL != wordnet_pos_p(pos) : "search_engine.wordnet_pos_p(pos) " + "CommonSymbols.NIL != search_engine.wordnet_pos_p(pos) " + pos;
        final SubLObject query = object.new_class_instance(WORDNET_QUERY);
        set_knowledge_source_query_query(query, word);
        set_wordnet_query_pos(query, pos);
        return query;
    }

    public static SubLObject wordnet_pos_p(final SubLObject string) {
        return member(string, $list699, EQUALP, UNPROVIDED);
    }

    public static SubLObject wordnet_query_get_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_wordnet_query_method = NIL;
        final SubLObject pos = get_wordnet_query_pos(self);
        final SubLObject query = get_knowledge_source_query_query(self);
        try {
            thread.throwStack.push($sym701$OUTER_CATCH_FOR_WORDNET_QUERY_METHOD);
            try {
                SubLObject glosses = NIL;
                final SubLObject word = wordnet_proxy.new_word_proxy(query, pos);
                if (NIL != wordnet_proxy.word_proxy_p(word)) {
                    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(word, SYNSETS);
                    SubLObject synset = NIL;
                    synset = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        glosses = cons(new_wordnet_gloss(instances.get_slot(synset, GLOSS)), glosses);
                        cdolist_list_var = cdolist_list_var.rest();
                        synset = cdolist_list_var.first();
                    } 
                }
                sublisp_throw($sym701$OUTER_CATCH_FOR_WORDNET_QUERY_METHOD, glosses);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_wordnet_query_pos(self, pos);
                    set_knowledge_source_query_query(self, query);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_wordnet_query_method = Errors.handleThrowable(ccatch_env_var, $sym701$OUTER_CATCH_FOR_WORDNET_QUERY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_wordnet_query_method;
    }

    public static SubLObject get_wordnet_gloss_gloss(final SubLObject wordnet_gloss) {
        return classes.subloop_get_access_protected_instance_slot(wordnet_gloss, ONE_INTEGER, GLOSS);
    }

    public static SubLObject set_wordnet_gloss_gloss(final SubLObject wordnet_gloss, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(wordnet_gloss, value, ONE_INTEGER, GLOSS);
    }

    public static SubLObject subloop_reserved_initialize_wordnet_gloss_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_wordnet_gloss_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, WORDNET_GLOSS, GLOSS, NIL);
        return NIL;
    }

    public static SubLObject wordnet_gloss_p(final SubLObject wordnet_gloss) {
        return classes.subloop_instanceof_class(wordnet_gloss, WORDNET_GLOSS);
    }

    public static SubLObject new_wordnet_gloss(final SubLObject string) {
        final SubLObject gloss = object.new_class_instance(WORDNET_GLOSS);
        set_wordnet_gloss_gloss(gloss, string);
        return gloss;
    }

    public static SubLObject wordnet_gloss_get_content_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_wordnet_gloss_method = NIL;
        final SubLObject gloss = get_wordnet_gloss_gloss(self);
        try {
            thread.throwStack.push($sym710$OUTER_CATCH_FOR_WORDNET_GLOSS_METHOD);
            try {
                sublisp_throw($sym710$OUTER_CATCH_FOR_WORDNET_GLOSS_METHOD, gloss);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_wordnet_gloss_gloss(self, gloss);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_wordnet_gloss_method = Errors.handleThrowable(ccatch_env_var, $sym710$OUTER_CATCH_FOR_WORDNET_GLOSS_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_wordnet_gloss_method;
    }

    public static SubLObject wordnet_gloss_get_source_method(final SubLObject self) {
        return $str713$Wordnet_1_7_1;
    }

    public static SubLObject strip_passage_header(final SubLObject string) {
        final SubLObject position = position(CHAR_underbar, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL != position ? string_utilities.strip_first_n(string, number_utilities.f_1X(position)) : string;
    }

    public static SubLObject passage_similarity(final SubLObject passage1, final SubLObject passage2) {
        assert NIL != abstract_passage_p(passage1) : "search_engine.abstract_passage_p(passage1) " + "CommonSymbols.NIL != search_engine.abstract_passage_p(passage1) " + passage1;
        assert NIL != abstract_passage_p(passage2) : "search_engine.abstract_passage_p(passage2) " + "CommonSymbols.NIL != search_engine.abstract_passage_p(passage2) " + passage2;
        return methods.funcall_class_method_with_2_args(ABSTRACT_PASSAGE, SIMILARITY, passage1, passage2);
    }

    public static SubLObject augment_search_string(final SubLObject word_string, SubLObject num) {
        if (num == UNPROVIDED) {
            num = TEN_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject denots = lexicon_accessors.denots_of_string(word_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject auxiliary_forts = NIL;
        SubLObject auxiliary_terms = NIL;
        final SubLObject ass_count = assertion_handles.assertion_count();
        SubLObject cdolist_list_var = denots;
        SubLObject denot = NIL;
        denot = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != isa.isa_in_any_mtP(denot, $$Collection)) {
                SubLObject cdolist_list_var_$11 = kb_mapping.gather_index_in_any_mt(denot, T);
                SubLObject assertion = NIL;
                assertion = cdolist_list_var_$11.first();
                while (NIL != cdolist_list_var_$11) {
                    final SubLObject ass_forts = assertions_high.assertion_forts(assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if ((NIL == subl_promotions.memberP($$TheList, ass_forts, UNPROVIDED, UNPROVIDED)) && (NIL == member($$disjointWith, ass_forts, UNPROVIDED, UNPROVIDED))) {
                        SubLObject cdolist_list_var_$12 = ass_forts;
                        SubLObject fort = NIL;
                        fort = cdolist_list_var_$12.first();
                        while (NIL != cdolist_list_var_$12) {
                            if ((NIL != isa.isa_in_any_mtP(fort, $$Collection)) && (NIL == subl_promotions.memberP(fort, auxiliary_forts, UNPROVIDED, UNPROVIDED))) {
                                final SubLObject idf_score = divide(ass_count, kb_indexing.num_index(fort));
                                SubLObject generation = NIL;
                                auxiliary_forts = cons(fort, auxiliary_forts);
                                final SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                                try {
                                    pph_vars.$pph_demerit_cutoff$.bind(ZERO_INTEGER, thread);
                                    generation = pph_main.generate_phrase(fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0, thread);
                                }
                                if ((idf_score.numL($int$200000) && idf_score.numG($int$5000)) && generation.isString()) {
                                    final SubLObject item_var = list(idf_score, generation, assertion);
                                    if (NIL == member(item_var, auxiliary_terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        auxiliary_terms = cons(item_var, auxiliary_terms);
                                    }
                                }
                            }
                            cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                            fort = cdolist_list_var_$12.first();
                        } 
                    }
                    cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                    assertion = cdolist_list_var_$11.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            denot = cdolist_list_var.first();
        } 
        return list_utilities.first_n(num, Mapping.mapcar(SECOND, Sort.sort(auxiliary_terms, $sym721$_, FIRST)));
    }

    public static SubLObject current_google_api_method_invocation_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $google_api_method_invocation_count$.getDynamicValue(thread);
    }

    public static SubLObject update_google_api_method_invocation_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($google_api_method_invocation_count$.getDynamicValue(thread).isFixnum()) {
            $google_api_method_invocation_count$.setDynamicValue(add($google_api_method_invocation_count$.getDynamicValue(thread), ONE_INTEGER), thread);
        }
        return $google_api_method_invocation_count$.getDynamicValue(thread);
    }

    public static SubLObject with_google_api_method_invocation_tracking(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list722);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject final_count = NIL;
        destructuring_bind_must_consp(current, datum, $list722);
        final_count = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CLET, $list724, bq_cons(PROGN, append(body, NIL)), listS(CSETF, final_count, $list727));
        }
        cdestructuring_bind_error(datum, $list722);
        return NIL;
    }

    public static SubLObject google_frequencies(final SubLObject string) {
        final SubLObject v_forts = lexicon_accessors.denots_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = v_forts;
        SubLObject fort = NIL;
        fort = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$13 = pph_methods_lexicon.all_phrases_for_term(fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject generation = NIL;
            generation = cdolist_list_var_$13.first();
            while (NIL != cdolist_list_var_$13) {
                final SubLObject google_query = new_google_query(generation, get_google_key(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject count = methods.funcall_instance_method_with_0_args(google_query, COUNT);
                if (count == $IO_ERROR) {
                    return NIL;
                }
                update_google_api_method_invocation_count();
                result = cons(list(fort, generation, count), result);
                Errors.warn($str728$_S__, list(fort, generation, count));
                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                generation = cdolist_list_var_$13.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            fort = cdolist_list_var.first();
        } 
        return Sort.stable_sort(Sort.sort(result, $sym729$_, THIRD), $sym731$FORT__, FIRST);
    }

    public static SubLObject google_search(final SubLObject string, SubLObject start, SubLObject hits) {
        if (start == UNPROVIDED) {
            start = ONE_INTEGER;
        }
        if (hits == UNPROVIDED) {
            hits = TEN_INTEGER;
        }
        final SubLObject google_query = new_google_query(string, get_google_key(), hits, $int$50, start);
        final SubLObject results = methods.funcall_instance_method_with_0_args(google_query, GET);
        if (NIL == google_error_tokenP(results)) {
            update_google_api_method_invocation_count();
        }
        return results;
    }

    public static SubLObject google_count(final SubLObject string) {
        final SubLObject google_query = new_google_query(string, get_google_key(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject results = methods.funcall_instance_method_with_0_args(google_query, COUNT);
        if (NIL == google_error_tokenP(results)) {
            update_google_api_method_invocation_count();
        }
        return results;
    }

    public static SubLObject google_status() {
        final SubLObject google_query = new_google_query($str355$, get_google_key(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject results = methods.funcall_instance_method_with_0_args(google_query, VERSION);
        if (NIL == google_error_tokenP(results)) {
            update_google_api_method_invocation_count();
        }
        return results;
    }

    public static SubLObject google_spelling(final SubLObject string) {
        final SubLObject google_query = new_google_query(string, get_google_key(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject results = methods.funcall_instance_method_with_0_args(google_query, SPELLING);
        if (NIL == google_error_tokenP(results)) {
            update_google_api_method_invocation_count();
        }
        return results;
    }

    public static SubLObject google_server_aliveP() {
        return list_utilities.property_list_p(google_status());
    }

    public static SubLObject google_license_count() {
        final SubLObject status = google_status();
        if (NIL != list_utilities.property_list_p(status)) {
            return getf(status, $LICENSE_USE, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject google_quit() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query = new_google_query($str355$, get_google_key(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    methods.funcall_instance_method_with_0_args(query, QUIT);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return T;
    }

    public static SubLObject google_error_tokenP(final SubLObject v_object) {
        return makeBoolean(v_object.isKeyword() && (($ERROR == v_object) || ($SERVER_ERROR == v_object)));
    }

    public static SubLObject google_search_url(final SubLObject search_string, SubLObject start, SubLObject hits) {
        if (start == UNPROVIDED) {
            start = ONE_INTEGER;
        }
        if (hits == UNPROVIDED) {
            hits = TEN_INTEGER;
        }
        return format(NIL, $str735$http___www_google_com_search_q__A, new SubLObject[]{ web_utilities.html_url_encode(search_string, UNPROVIDED), subtract(start, ONE_INTEGER), hits });
    }

    public static SubLObject declare_search_engine_file() {
        declareFunction(me, "subloop_reserved_initialize_information_class", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_information_instance", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-INSTANCE", 1, 0, false);
        declareFunction(me, "information_p", "INFORMATION-P", 1, 0, false);
        declareFunction(me, "information_get_source_method", "INFORMATION-GET-SOURCE-METHOD", 1, 0, false);
        declareFunction(me, "get_abstract_passage_vector", "GET-ABSTRACT-PASSAGE-VECTOR", 1, 0, false);
        declareFunction(me, "set_abstract_passage_vector", "SET-ABSTRACT-PASSAGE-VECTOR", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_abstract_passage_class", "SUBLOOP-RESERVED-INITIALIZE-ABSTRACT-PASSAGE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_abstract_passage_instance", "SUBLOOP-RESERVED-INITIALIZE-ABSTRACT-PASSAGE-INSTANCE", 1, 0, false);
        declareFunction(me, "abstract_passage_p", "ABSTRACT-PASSAGE-P", 1, 0, false);
        declareFunction(me, "abstract_passage_equal_method", "ABSTRACT-PASSAGE-EQUAL-METHOD", 2, 0, false);
        declareFunction(me, "abstract_passage_similarity_method", "ABSTRACT-PASSAGE-SIMILARITY-METHOD", 3, 0, false);
        declareFunction(me, "abstract_passage_get_dates_method", "ABSTRACT-PASSAGE-GET-DATES-METHOD", 1, 0, false);
        declareFunction(me, "abstract_passage_older_method", "ABSTRACT-PASSAGE-OLDER-METHOD", 2, 0, false);
        declareFunction(me, "guess_year", "GUESS-YEAR", 5, 0, false);
        declareFunction(me, "abstract_passage_get_publication_date_method", "ABSTRACT-PASSAGE-GET-PUBLICATION-DATE-METHOD", 1, 0, false);
        declareFunction(me, "passage_equal", "PASSAGE-EQUAL", 2, 0, false);
        declareFunction(me, "get_simple_passage_text", "GET-SIMPLE-PASSAGE-TEXT", 1, 0, false);
        declareFunction(me, "set_simple_passage_text", "SET-SIMPLE-PASSAGE-TEXT", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_simple_passage_class", "SUBLOOP-RESERVED-INITIALIZE-SIMPLE-PASSAGE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_simple_passage_instance", "SUBLOOP-RESERVED-INITIALIZE-SIMPLE-PASSAGE-INSTANCE", 1, 0, false);
        declareFunction(me, "simple_passage_p", "SIMPLE-PASSAGE-P", 1, 0, false);
        declareFunction(me, "new_simple_passage", "NEW-SIMPLE-PASSAGE", 1, 0, false);
        declareFunction(me, "simple_passage_print_method", "SIMPLE-PASSAGE-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "simple_passage_get_content_method", "SIMPLE-PASSAGE-GET-CONTENT-METHOD", 1, 0, false);
        declareFunction(me, "get_corpus_passage_text", "GET-CORPUS-PASSAGE-TEXT", 1, 0, false);
        declareFunction(me, "set_corpus_passage_text", "SET-CORPUS-PASSAGE-TEXT", 2, 0, false);
        declareFunction(me, "get_corpus_passage_corpus", "GET-CORPUS-PASSAGE-CORPUS", 1, 0, false);
        declareFunction(me, "set_corpus_passage_corpus", "SET-CORPUS-PASSAGE-CORPUS", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_corpus_passage_class", "SUBLOOP-RESERVED-INITIALIZE-CORPUS-PASSAGE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_corpus_passage_instance", "SUBLOOP-RESERVED-INITIALIZE-CORPUS-PASSAGE-INSTANCE", 1, 0, false);
        declareFunction(me, "corpus_passage_p", "CORPUS-PASSAGE-P", 1, 0, false);
        declareFunction(me, "corpus_passage_get_corpus_method", "CORPUS-PASSAGE-GET-CORPUS-METHOD", 1, 0, false);
        declareFunction(me, "abstract_passage_get_vector_method", "ABSTRACT-PASSAGE-GET-VECTOR-METHOD", 1, 0, false);
        declareFunction(me, "corpus_passage_get_content_method", "CORPUS-PASSAGE-GET-CONTENT-METHOD", 1, 0, false);
        declareFunction(me, "corpus_passage_identify_entities_method", "CORPUS-PASSAGE-IDENTIFY-ENTITIES-METHOD", 2, 1, false);
        declareFunction(me, "corpus_passage_max_instances_method", "CORPUS-PASSAGE-MAX-INSTANCES-METHOD", 2, 0, false);
        declareFunction(me, "corpus_passage_get_parse_trees_method", "CORPUS-PASSAGE-GET-PARSE-TREES-METHOD", 1, 0, false);
        declareFunction(me, "get_information_request_timeout", "GET-INFORMATION-REQUEST-TIMEOUT", 1, 0, false);
        declareFunction(me, "set_information_request_timeout", "SET-INFORMATION-REQUEST-TIMEOUT", 2, 0, false);
        declareFunction(me, "get_information_request_error_handling", "GET-INFORMATION-REQUEST-ERROR-HANDLING", 1, 0, false);
        declareFunction(me, "set_information_request_error_handling", "SET-INFORMATION-REQUEST-ERROR-HANDLING", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_information_request_class", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-REQUEST-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_information_request_instance", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-REQUEST-INSTANCE", 1, 0, false);
        declareFunction(me, "information_request_p", "INFORMATION-REQUEST-P", 1, 0, false);
        declareFunction(me, "information_request_initialize_method", "INFORMATION-REQUEST-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "get_knowledge_source_query_query", "GET-KNOWLEDGE-SOURCE-QUERY-QUERY", 1, 0, false);
        declareFunction(me, "set_knowledge_source_query_query", "SET-KNOWLEDGE-SOURCE-QUERY-QUERY", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_knowledge_source_query_class", "SUBLOOP-RESERVED-INITIALIZE-KNOWLEDGE-SOURCE-QUERY-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_knowledge_source_query_instance", "SUBLOOP-RESERVED-INITIALIZE-KNOWLEDGE-SOURCE-QUERY-INSTANCE", 1, 0, false);
        declareFunction(me, "knowledge_source_query_p", "KNOWLEDGE-SOURCE-QUERY-P", 1, 0, false);
        declareFunction(me, "knowledge_source_query_answer_method", "KNOWLEDGE-SOURCE-QUERY-ANSWER-METHOD", 1, 0, false);
        declareFunction(me, "knowledge_source_query_print_method", "KNOWLEDGE-SOURCE-QUERY-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "knowledge_source_query_handle_error_method", "KNOWLEDGE-SOURCE-QUERY-HANDLE-ERROR-METHOD", 2, 0, false);
        declareFunction(me, "get_corpus_query_corpus", "GET-CORPUS-QUERY-CORPUS", 1, 0, false);
        declareFunction(me, "set_corpus_query_corpus", "SET-CORPUS-QUERY-CORPUS", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_corpus_query_class", "SUBLOOP-RESERVED-INITIALIZE-CORPUS-QUERY-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_corpus_query_instance", "SUBLOOP-RESERVED-INITIALIZE-CORPUS-QUERY-INSTANCE", 1, 0, false);
        declareFunction(me, "corpus_query_p", "CORPUS-QUERY-P", 1, 0, false);
        declareFunction(me, "corpus_query_get_corpus_path_mapping_method", "CORPUS-QUERY-GET-CORPUS-PATH-MAPPING-METHOD", 1, 0, false);
        declareFunction(me, "corpus_query_get_corpus_method", "CORPUS-QUERY-GET-CORPUS-METHOD", 1, 0, false);
        declareFunction(me, "corpus_query_get_corpus_path_method", "CORPUS-QUERY-GET-CORPUS-PATH-METHOD", 1, 0, false);
        declareFunction(me, "corpus_query_print_method", "CORPUS-QUERY-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "subloop_reserved_initialize_glimpse_query_class", "SUBLOOP-RESERVED-INITIALIZE-GLIMPSE-QUERY-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_glimpse_query_instance", "SUBLOOP-RESERVED-INITIALIZE-GLIMPSE-QUERY-INSTANCE", 1, 0, false);
        declareFunction(me, "glimpse_query_p", "GLIMPSE-QUERY-P", 1, 0, false);
        declareFunction(me, "new_glimpse_query", "NEW-GLIMPSE-QUERY", 1, 1, false);
        declareFunction(me, "glimpse_query_get_corpus_path_mapping_method", "GLIMPSE-QUERY-GET-CORPUS-PATH-MAPPING-METHOD", 1, 0, false);
        declareFunction(me, "glimpse_query_get_method", "GLIMPSE-QUERY-GET-METHOD", 1, 0, false);
        declareFunction(me, "ask_glimpse", "ASK-GLIMPSE", 1, 5, false);
        declareFunction(me, "get_glimpse_passage_line", "GET-GLIMPSE-PASSAGE-LINE", 1, 0, false);
        declareFunction(me, "set_glimpse_passage_line", "SET-GLIMPSE-PASSAGE-LINE", 2, 0, false);
        declareFunction(me, "get_glimpse_passage_article", "GET-GLIMPSE-PASSAGE-ARTICLE", 1, 0, false);
        declareFunction(me, "set_glimpse_passage_article", "SET-GLIMPSE-PASSAGE-ARTICLE", 2, 0, false);
        declareFunction(me, "get_glimpse_passage_file", "GET-GLIMPSE-PASSAGE-FILE", 1, 0, false);
        declareFunction(me, "set_glimpse_passage_file", "SET-GLIMPSE-PASSAGE-FILE", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_glimpse_passage_class", "SUBLOOP-RESERVED-INITIALIZE-GLIMPSE-PASSAGE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_glimpse_passage_instance", "SUBLOOP-RESERVED-INITIALIZE-GLIMPSE-PASSAGE-INSTANCE", 1, 0, false);
        declareFunction(me, "glimpse_passage_p", "GLIMPSE-PASSAGE-P", 1, 0, false);
        declareFunction(me, "new_glimpse_passage", "NEW-GLIMPSE-PASSAGE", 5, 0, false);
        declareFunction(me, "glimpse_passage_print_method", "GLIMPSE-PASSAGE-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "glimpse_passage_get_publication_date_method", "GLIMPSE-PASSAGE-GET-PUBLICATION-DATE-METHOD", 1, 0, false);
        declareFunction(me, "glimpse_passage_get_source_method", "GLIMPSE-PASSAGE-GET-SOURCE-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_guruqa_query_class", "SUBLOOP-RESERVED-INITIALIZE-GURUQA-QUERY-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_guruqa_query_instance", "SUBLOOP-RESERVED-INITIALIZE-GURUQA-QUERY-INSTANCE", 1, 0, false);
        declareFunction(me, "guruqa_query_p", "GURUQA-QUERY-P", 1, 0, false);
        declareFunction(me, "new_guruqa_query", "NEW-GURUQA-QUERY", 1, 1, false);
        declareFunction(me, "guruqa_query_get_method", "GURUQA-QUERY-GET-METHOD", 1, 0, false);
        declareFunction(me, "get_guruqa_passage_error_handling", "GET-GURUQA-PASSAGE-ERROR-HANDLING", 1, 0, false);
        declareFunction(me, "set_guruqa_passage_error_handling", "SET-GURUQA-PASSAGE-ERROR-HANDLING", 2, 0, false);
        declareFunction(me, "get_guruqa_passage_span", "GET-GURUQA-PASSAGE-SPAN", 1, 0, false);
        declareFunction(me, "set_guruqa_passage_span", "SET-GURUQA-PASSAGE-SPAN", 2, 0, false);
        declareFunction(me, "get_guruqa_passage_sentence_id", "GET-GURUQA-PASSAGE-SENTENCE-ID", 1, 0, false);
        declareFunction(me, "set_guruqa_passage_sentence_id", "SET-GURUQA-PASSAGE-SENTENCE-ID", 2, 0, false);
        declareFunction(me, "get_guruqa_passage_document_id", "GET-GURUQA-PASSAGE-DOCUMENT-ID", 1, 0, false);
        declareFunction(me, "set_guruqa_passage_document_id", "SET-GURUQA-PASSAGE-DOCUMENT-ID", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_guruqa_passage_class", "SUBLOOP-RESERVED-INITIALIZE-GURUQA-PASSAGE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_guruqa_passage_instance", "SUBLOOP-RESERVED-INITIALIZE-GURUQA-PASSAGE-INSTANCE", 1, 0, false);
        declareFunction(me, "guruqa_passage_p", "GURUQA-PASSAGE-P", 1, 0, false);
        declareFunction(me, "new_guruqa_passage", "NEW-GURUQA-PASSAGE", 3, 2, false);
        declareFunction(me, "guruqa_passage_print_method", "GURUQA-PASSAGE-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "guruqa_passage_get_source_method", "GURUQA-PASSAGE-GET-SOURCE-METHOD", 1, 0, false);
        declareFunction(me, "guruqa_passage_get_content_method", "GURUQA-PASSAGE-GET-CONTENT-METHOD", 1, 0, false);
        declareFunction(me, "guruqa_passage_handle_error_method", "GURUQA-PASSAGE-HANDLE-ERROR-METHOD", 2, 0, false);
        declareFunction(me, "get_lemur_query_sentno", "GET-LEMUR-QUERY-SENTNO", 1, 0, false);
        declareFunction(me, "set_lemur_query_sentno", "SET-LEMUR-QUERY-SENTNO", 2, 0, false);
        declareFunction(me, "get_lemur_query_docno", "GET-LEMUR-QUERY-DOCNO", 1, 0, false);
        declareFunction(me, "set_lemur_query_docno", "SET-LEMUR-QUERY-DOCNO", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_lemur_query_class", "SUBLOOP-RESERVED-INITIALIZE-LEMUR-QUERY-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_lemur_query_instance", "SUBLOOP-RESERVED-INITIALIZE-LEMUR-QUERY-INSTANCE", 1, 0, false);
        declareFunction(me, "lemur_query_p", "LEMUR-QUERY-P", 1, 0, false);
        declareFunction(me, "new_lemur_query", "NEW-LEMUR-QUERY", 1, 3, false);
        declareFunction(me, "lemur_query_get_corpus_path_mapping_method", "LEMUR-QUERY-GET-CORPUS-PATH-MAPPING-METHOD", 1, 0, false);
        declareFunction(me, "lemur_query_get_method", "LEMUR-QUERY-GET-METHOD", 1, 0, false);
        declareFunction(me, "ask_lemur", "ASK-LEMUR", 1, 9, false);
        declareFunction(me, "get_lemur_passage_score", "GET-LEMUR-PASSAGE-SCORE", 1, 0, false);
        declareFunction(me, "set_lemur_passage_score", "SET-LEMUR-PASSAGE-SCORE", 2, 0, false);
        declareFunction(me, "get_lemur_passage_sentence_number", "GET-LEMUR-PASSAGE-SENTENCE-NUMBER", 1, 0, false);
        declareFunction(me, "set_lemur_passage_sentence_number", "SET-LEMUR-PASSAGE-SENTENCE-NUMBER", 2, 0, false);
        declareFunction(me, "get_lemur_passage_doc_id", "GET-LEMUR-PASSAGE-DOC-ID", 1, 0, false);
        declareFunction(me, "set_lemur_passage_doc_id", "SET-LEMUR-PASSAGE-DOC-ID", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_lemur_passage_class", "SUBLOOP-RESERVED-INITIALIZE-LEMUR-PASSAGE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_lemur_passage_instance", "SUBLOOP-RESERVED-INITIALIZE-LEMUR-PASSAGE-INSTANCE", 1, 0, false);
        declareFunction(me, "lemur_passage_p", "LEMUR-PASSAGE-P", 1, 0, false);
        declareFunction(me, "new_lemur_passage", "NEW-LEMUR-PASSAGE", 4, 0, false);
        declareFunction(me, "lemur_passage_print_method", "LEMUR-PASSAGE-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "lemur_passage_get_source_method", "LEMUR-PASSAGE-GET-SOURCE-METHOD", 1, 0, false);
        declareFunction(me, "lemur_passage_get_publication_date_method", "LEMUR-PASSAGE-GET-PUBLICATION-DATE-METHOD", 1, 0, false);
        declareFunction(me, "lemur_passage_get_score_method", "LEMUR-PASSAGE-GET-SCORE-METHOD", 1, 0, false);
        declareFunction(me, "get_qaga_query_augmentation_terms", "GET-QAGA-QUERY-AUGMENTATION-TERMS", 1, 0, false);
        declareFunction(me, "set_qaga_query_augmentation_terms", "SET-QAGA-QUERY-AUGMENTATION-TERMS", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_qaga_query_class", "SUBLOOP-RESERVED-INITIALIZE-QAGA-QUERY-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_qaga_query_instance", "SUBLOOP-RESERVED-INITIALIZE-QAGA-QUERY-INSTANCE", 1, 0, false);
        declareFunction(me, "qaga_query_p", "QAGA-QUERY-P", 1, 0, false);
        declareFunction(me, "new_qaga_query", "NEW-QAGA-QUERY", 1, 1, false);
        declareFunction(me, "qaga_query_get_method", "QAGA-QUERY-GET-METHOD", 1, 0, false);
        declareFunction(me, "qaga_query_get_augmentation_terms_method", "QAGA-QUERY-GET-AUGMENTATION-TERMS-METHOD", 1, 0, false);
        declareFunction(me, "get_google_query_google_key", "GET-GOOGLE-QUERY-GOOGLE-KEY", 1, 0, false);
        declareFunction(me, "set_google_query_google_key", "SET-GOOGLE-QUERY-GOOGLE-KEY", 2, 0, false);
        declareFunction(me, "get_google_query_start", "GET-GOOGLE-QUERY-START", 1, 0, false);
        declareFunction(me, "set_google_query_start", "SET-GOOGLE-QUERY-START", 2, 0, false);
        declareFunction(me, "get_google_query_docno", "GET-GOOGLE-QUERY-DOCNO", 1, 0, false);
        declareFunction(me, "set_google_query_docno", "SET-GOOGLE-QUERY-DOCNO", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_google_query_class", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-QUERY-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_google_query_instance", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-QUERY-INSTANCE", 1, 0, false);
        declareFunction(me, "google_query_p", "GOOGLE-QUERY-P", 1, 0, false);
        declareFunction(me, "new_google_query", "NEW-GOOGLE-QUERY", 2, 3, false);
        declareFunction(me, "google_query_get_method", "GOOGLE-QUERY-GET-METHOD", 1, 0, false);
        declareFunction(me, "google_query_count_method", "GOOGLE-QUERY-COUNT-METHOD", 1, 0, false);
        declareFunction(me, "google_query_quit_method", "GOOGLE-QUERY-QUIT-METHOD", 1, 0, false);
        declareFunction(me, "google_query_spelling_method", "GOOGLE-QUERY-SPELLING-METHOD", 1, 0, false);
        declareFunction(me, "google_query_version_method", "GOOGLE-QUERY-VERSION-METHOD", 1, 0, false);
        declareFunction(me, "get_google_key", "GET-GOOGLE-KEY", 0, 0, false);
        declareFunction(me, "seed_google_client", "SEED-GOOGLE-CLIENT", 3, 0, false);
        declareFunction(me, "get_google_client", "GET-GOOGLE-CLIENT", 0, 1, false);
        declareFunction(me, "get_google_client_client_interaction", "GET-GOOGLE-CLIENT-CLIENT-INTERACTION", 1, 0, false);
        declareFunction(me, "set_google_client_client_interaction", "SET-GOOGLE-CLIENT-CLIENT-INTERACTION", 2, 0, false);
        declareFunction(me, "get_google_client_client_key", "GET-GOOGLE-CLIENT-CLIENT-KEY", 1, 0, false);
        declareFunction(me, "set_google_client_client_key", "SET-GOOGLE-CLIENT-CLIENT-KEY", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_google_client_class", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-CLIENT-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_google_client_instance", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-CLIENT-INSTANCE", 1, 0, false);
        declareFunction(me, "google_client_p", "GOOGLE-CLIENT-P", 1, 0, false);
        declareFunction(me, "google_client_initialize_method", "GOOGLE-CLIENT-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "google_client_set_client_key_method", "GOOGLE-CLIENT-SET-CLIENT-KEY-METHOD", 2, 0, false);
        declareFunction(me, "google_client_search_method", "GOOGLE-CLIENT-SEARCH-METHOD", 2, 2, false);
        declareFunction(me, "google_client_count_method", "GOOGLE-CLIENT-COUNT-METHOD", 2, 0, false);
        declareFunction(me, "google_client_spelling_method", "GOOGLE-CLIENT-SPELLING-METHOD", 2, 0, false);
        declareFunction(me, "google_client_quit_method", "GOOGLE-CLIENT-QUIT-METHOD", 1, 0, false);
        declareFunction(me, "google_client_version_method", "GOOGLE-CLIENT-VERSION-METHOD", 1, 0, false);
        declareFunction(me, "google_client_build_basic_google_request_method", "GOOGLE-CLIENT-BUILD-BASIC-GOOGLE-REQUEST-METHOD", 3, 0, false);
        declareFunction(me, "google_client_get_answer_from_request_method", "GOOGLE-CLIENT-GET-ANSWER-FROM-REQUEST-METHOD", 1, 0, false);
        declareFunction(me, "google_client_google_request_method", "GOOGLE-CLIENT-GOOGLE-REQUEST-METHOD", 3, 0, false);
        declareFunction(me, "get_google_client_interaction_google_io_error", "GET-GOOGLE-CLIENT-INTERACTION-GOOGLE-IO-ERROR", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_google_io_error", "SET-GOOGLE-CLIENT-INTERACTION-GOOGLE-IO-ERROR", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_google_version", "GET-GOOGLE-CLIENT-INTERACTION-GOOGLE-VERSION", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_google_version", "SET-GOOGLE-CLIENT-INTERACTION-GOOGLE-VERSION", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_google_spelling", "GET-GOOGLE-CLIENT-INTERACTION-GOOGLE-SPELLING", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_google_spelling", "SET-GOOGLE-CLIENT-INTERACTION-GOOGLE-SPELLING", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_google_count", "GET-GOOGLE-CLIENT-INTERACTION-GOOGLE-COUNT", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_google_count", "SET-GOOGLE-CLIENT-INTERACTION-GOOGLE-COUNT", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_google_passages", "GET-GOOGLE-CLIENT-INTERACTION-GOOGLE-PASSAGES", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_google_passages", "SET-GOOGLE-CLIENT-INTERACTION-GOOGLE-PASSAGES", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_start", "GET-GOOGLE-CLIENT-INTERACTION-START", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_start", "SET-GOOGLE-CLIENT-INTERACTION-START", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_docno", "GET-GOOGLE-CLIENT-INTERACTION-DOCNO", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_docno", "SET-GOOGLE-CLIENT-INTERACTION-DOCNO", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_directive_arg", "GET-GOOGLE-CLIENT-INTERACTION-DIRECTIVE-ARG", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_directive_arg", "SET-GOOGLE-CLIENT-INTERACTION-DIRECTIVE-ARG", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_directive", "GET-GOOGLE-CLIENT-INTERACTION-DIRECTIVE", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_directive", "SET-GOOGLE-CLIENT-INTERACTION-DIRECTIVE", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_client_key", "GET-GOOGLE-CLIENT-INTERACTION-CLIENT-KEY", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_client_key", "SET-GOOGLE-CLIENT-INTERACTION-CLIENT-KEY", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_total_keyword", "GET-GOOGLE-CLIENT-INTERACTION-TOTAL-KEYWORD", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_total_keyword", "SET-GOOGLE-CLIENT-INTERACTION-TOTAL-KEYWORD", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_rank_keyword", "GET-GOOGLE-CLIENT-INTERACTION-RANK-KEYWORD", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_rank_keyword", "SET-GOOGLE-CLIENT-INTERACTION-RANK-KEYWORD", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_offset_in_snippet_keyword", "GET-GOOGLE-CLIENT-INTERACTION-OFFSET-IN-SNIPPET-KEYWORD", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_offset_in_snippet_keyword", "SET-GOOGLE-CLIENT-INTERACTION-OFFSET-IN-SNIPPET-KEYWORD", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_offset_in_full_text_keyword", "GET-GOOGLE-CLIENT-INTERACTION-OFFSET-IN-FULL-TEXT-KEYWORD", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_offset_in_full_text_keyword", "SET-GOOGLE-CLIENT-INTERACTION-OFFSET-IN-FULL-TEXT-KEYWORD", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_snippet_keyword", "GET-GOOGLE-CLIENT-INTERACTION-SNIPPET-KEYWORD", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_snippet_keyword", "SET-GOOGLE-CLIENT-INTERACTION-SNIPPET-KEYWORD", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_full_text_keyword", "GET-GOOGLE-CLIENT-INTERACTION-FULL-TEXT-KEYWORD", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_full_text_keyword", "SET-GOOGLE-CLIENT-INTERACTION-FULL-TEXT-KEYWORD", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_title_keyword", "GET-GOOGLE-CLIENT-INTERACTION-TITLE-KEYWORD", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_title_keyword", "SET-GOOGLE-CLIENT-INTERACTION-TITLE-KEYWORD", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_url_keyword", "GET-GOOGLE-CLIENT-INTERACTION-URL-KEYWORD", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_url_keyword", "SET-GOOGLE-CLIENT-INTERACTION-URL-KEYWORD", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_content_keyword", "GET-GOOGLE-CLIENT-INTERACTION-CONTENT-KEYWORD", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_content_keyword", "SET-GOOGLE-CLIENT-INTERACTION-CONTENT-KEYWORD", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_query_language_attr", "GET-GOOGLE-CLIENT-INTERACTION-QUERY-LANGUAGE-ATTR", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_query_language_attr", "SET-GOOGLE-CLIENT-INTERACTION-QUERY-LANGUAGE-ATTR", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_query_key_attr", "GET-GOOGLE-CLIENT-INTERACTION-QUERY-KEY-ATTR", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_query_key_attr", "SET-GOOGLE-CLIENT-INTERACTION-QUERY-KEY-ATTR", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_query_start_attr", "GET-GOOGLE-CLIENT-INTERACTION-QUERY-START-ATTR", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_query_start_attr", "SET-GOOGLE-CLIENT-INTERACTION-QUERY-START-ATTR", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_query_count_attr", "GET-GOOGLE-CLIENT-INTERACTION-QUERY-COUNT-ATTR", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_query_count_attr", "SET-GOOGLE-CLIENT-INTERACTION-QUERY-COUNT-ATTR", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_query_type_attr", "GET-GOOGLE-CLIENT-INTERACTION-QUERY-TYPE-ATTR", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_query_type_attr", "SET-GOOGLE-CLIENT-INTERACTION-QUERY-TYPE-ATTR", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_query_tag", "GET-GOOGLE-CLIENT-INTERACTION-QUERY-TAG", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_query_tag", "SET-GOOGLE-CLIENT-INTERACTION-QUERY-TAG", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_subl_directive_tag", "GET-GOOGLE-CLIENT-INTERACTION-SUBL-DIRECTIVE-TAG", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_subl_directive_tag", "SET-GOOGLE-CLIENT-INTERACTION-SUBL-DIRECTIVE-TAG", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_version_directive_tag", "GET-GOOGLE-CLIENT-INTERACTION-VERSION-DIRECTIVE-TAG", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_version_directive_tag", "SET-GOOGLE-CLIENT-INTERACTION-VERSION-DIRECTIVE-TAG", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_quit_directive_tag", "GET-GOOGLE-CLIENT-INTERACTION-QUIT-DIRECTIVE-TAG", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_quit_directive_tag", "SET-GOOGLE-CLIENT-INTERACTION-QUIT-DIRECTIVE-TAG", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_spell_directive_tag", "GET-GOOGLE-CLIENT-INTERACTION-SPELL-DIRECTIVE-TAG", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_spell_directive_tag", "SET-GOOGLE-CLIENT-INTERACTION-SPELL-DIRECTIVE-TAG", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_count_directive_tag", "GET-GOOGLE-CLIENT-INTERACTION-COUNT-DIRECTIVE-TAG", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_count_directive_tag", "SET-GOOGLE-CLIENT-INTERACTION-COUNT-DIRECTIVE-TAG", 2, 0, false);
        declareFunction(me, "get_google_client_interaction_search_directive_tag", "GET-GOOGLE-CLIENT-INTERACTION-SEARCH-DIRECTIVE-TAG", 1, 0, false);
        declareFunction(me, "set_google_client_interaction_search_directive_tag", "SET-GOOGLE-CLIENT-INTERACTION-SEARCH-DIRECTIVE-TAG", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_google_client_interaction_class", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-CLIENT-INTERACTION-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_google_client_interaction_instance", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-CLIENT-INTERACTION-INSTANCE", 1, 0, false);
        declareFunction(me, "google_client_interaction_p", "GOOGLE-CLIENT-INTERACTION-P", 1, 0, false);
        declareFunction(me, "google_client_interaction_initialize_method", "GOOGLE-CLIENT-INTERACTION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "google_client_interaction_set_key_method", "GOOGLE-CLIENT-INTERACTION-SET-KEY-METHOD", 2, 0, false);
        declareFunction(me, "google_client_interaction_set_directive_method", "GOOGLE-CLIENT-INTERACTION-SET-DIRECTIVE-METHOD", 2, 0, false);
        declareFunction(me, "google_client_interaction_set_docno_method", "GOOGLE-CLIENT-INTERACTION-SET-DOCNO-METHOD", 2, 0, false);
        declareFunction(me, "google_client_interaction_set_start_method", "GOOGLE-CLIENT-INTERACTION-SET-START-METHOD", 2, 0, false);
        declareFunction(me, "google_client_interaction_get_io_error_flag_method", "GOOGLE-CLIENT-INTERACTION-GET-IO-ERROR-FLAG-METHOD", 1, 0, false);
        declareFunction(me, "google_client_interaction_build_answer_method", "GOOGLE-CLIENT-INTERACTION-BUILD-ANSWER-METHOD", 2, 0, false);
        declareFunction(me, "google_client_interaction_get_directive_method", "GOOGLE-CLIENT-INTERACTION-GET-DIRECTIVE-METHOD", 1, 0, false);
        declareFunction(me, "google_client_interaction_set_directive_arg_method", "GOOGLE-CLIENT-INTERACTION-SET-DIRECTIVE-ARG-METHOD", 2, 0, false);
        declareFunction(me, "google_client_interaction_request_string_method", "GOOGLE-CLIENT-INTERACTION-REQUEST-STRING-METHOD", 1, 0, false);
        declareFunction(me, "google_client_interaction_get_answer_method", "GOOGLE-CLIENT-INTERACTION-GET-ANSWER-METHOD", 1, 0, false);
        declareFunction(me, "google_client_interaction_get_google_passages_method", "GOOGLE-CLIENT-INTERACTION-GET-GOOGLE-PASSAGES-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_google_passage_list_class", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-PASSAGE-LIST-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_google_passage_list_instance", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-PASSAGE-LIST-INSTANCE", 1, 0, false);
        declareFunction(me, "google_passage_list_p", "GOOGLE-PASSAGE-LIST-P", 1, 0, false);
        declareFunction(me, "google_passage_list_acceptable_p_method", "GOOGLE-PASSAGE-LIST-ACCEPTABLE-P-METHOD", 2, 0, false);
        declareFunction(me, "google_passage_list_add_method", "GOOGLE-PASSAGE-LIST-ADD-METHOD", 2, 0, false);
        declareFunction(me, "get_google_passage_parse_trees", "GET-GOOGLE-PASSAGE-PARSE-TREES", 1, 0, false);
        declareFunction(me, "set_google_passage_parse_trees", "SET-GOOGLE-PASSAGE-PARSE-TREES", 2, 0, false);
        declareFunction(me, "get_google_passage_total", "GET-GOOGLE-PASSAGE-TOTAL", 1, 0, false);
        declareFunction(me, "set_google_passage_total", "SET-GOOGLE-PASSAGE-TOTAL", 2, 0, false);
        declareFunction(me, "get_google_passage_offset_in_text", "GET-GOOGLE-PASSAGE-OFFSET-IN-TEXT", 1, 0, false);
        declareFunction(me, "set_google_passage_offset_in_text", "SET-GOOGLE-PASSAGE-OFFSET-IN-TEXT", 2, 0, false);
        declareFunction(me, "get_google_passage_offset_in_snippet", "GET-GOOGLE-PASSAGE-OFFSET-IN-SNIPPET", 1, 0, false);
        declareFunction(me, "set_google_passage_offset_in_snippet", "SET-GOOGLE-PASSAGE-OFFSET-IN-SNIPPET", 2, 0, false);
        declareFunction(me, "get_google_passage_snippet", "GET-GOOGLE-PASSAGE-SNIPPET", 1, 0, false);
        declareFunction(me, "set_google_passage_snippet", "SET-GOOGLE-PASSAGE-SNIPPET", 2, 0, false);
        declareFunction(me, "get_google_passage_title", "GET-GOOGLE-PASSAGE-TITLE", 1, 0, false);
        declareFunction(me, "set_google_passage_title", "SET-GOOGLE-PASSAGE-TITLE", 2, 0, false);
        declareFunction(me, "get_google_passage_url", "GET-GOOGLE-PASSAGE-URL", 1, 0, false);
        declareFunction(me, "set_google_passage_url", "SET-GOOGLE-PASSAGE-URL", 2, 0, false);
        declareFunction(me, "get_google_passage_rank", "GET-GOOGLE-PASSAGE-RANK", 1, 0, false);
        declareFunction(me, "set_google_passage_rank", "SET-GOOGLE-PASSAGE-RANK", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_google_passage_class", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-PASSAGE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_google_passage_instance", "SUBLOOP-RESERVED-INITIALIZE-GOOGLE-PASSAGE-INSTANCE", 1, 0, false);
        declareFunction(me, "google_passage_p", "GOOGLE-PASSAGE-P", 1, 0, false);
        declareFunction(me, "new_google_passage", "NEW-GOOGLE-PASSAGE", 4, 4, false);
        declareFunction(me, "google_passage_get_source_method", "GOOGLE-PASSAGE-GET-SOURCE-METHOD", 1, 0, false);
        declareFunction(me, "google_passage_get_score_method", "GOOGLE-PASSAGE-GET-SCORE-METHOD", 1, 0, false);
        declareFunction(me, "google_passage_is_complete_method", "GOOGLE-PASSAGE-IS-COMPLETE-METHOD", 1, 0, false);
        declareFunction(me, "google_passage_get_offset_in_full_text_method", "GOOGLE-PASSAGE-GET-OFFSET-IN-FULL-TEXT-METHOD", 1, 0, false);
        declareFunction(me, "google_passage_get_offset_in_snippet_method", "GOOGLE-PASSAGE-GET-OFFSET-IN-SNIPPET-METHOD", 1, 0, false);
        declareFunction(me, "google_passage_get_url_method", "GOOGLE-PASSAGE-GET-URL-METHOD", 1, 0, false);
        declareFunction(me, "google_passage_get_title_method", "GOOGLE-PASSAGE-GET-TITLE-METHOD", 1, 0, false);
        declareFunction(me, "google_passage_get_cached_file_id_method", "GOOGLE-PASSAGE-GET-CACHED-FILE-ID-METHOD", 1, 0, false);
        declareFunction(me, "google_passage_get_full_text_method", "GOOGLE-PASSAGE-GET-FULL-TEXT-METHOD", 1, 0, false);
        declareFunction(me, "google_passage_get_snippet_method", "GOOGLE-PASSAGE-GET-SNIPPET-METHOD", 1, 0, false);
        declareFunction(me, "google_passage_get_rank_method", "GOOGLE-PASSAGE-GET-RANK-METHOD", 1, 0, false);
        declareFunction(me, "google_passage_get_total_for_rank_method", "GOOGLE-PASSAGE-GET-TOTAL-FOR-RANK-METHOD", 1, 0, false);
        declareFunction(me, "google_passage_get_rank_and_total_method", "GOOGLE-PASSAGE-GET-RANK-AND-TOTAL-METHOD", 1, 0, false);
        declareFunction(me, "google_passage_print_method", "GOOGLE-PASSAGE-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "google_passage_get_publication_date_method", "GOOGLE-PASSAGE-GET-PUBLICATION-DATE-METHOD", 1, 0, false);
        declareFunction(me, "get_lucene_query_sentno", "GET-LUCENE-QUERY-SENTNO", 1, 0, false);
        declareFunction(me, "set_lucene_query_sentno", "SET-LUCENE-QUERY-SENTNO", 2, 0, false);
        declareFunction(me, "get_lucene_query_docno", "GET-LUCENE-QUERY-DOCNO", 1, 0, false);
        declareFunction(me, "set_lucene_query_docno", "SET-LUCENE-QUERY-DOCNO", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_lucene_query_class", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-QUERY-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_lucene_query_instance", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-QUERY-INSTANCE", 1, 0, false);
        declareFunction(me, "lucene_query_p", "LUCENE-QUERY-P", 1, 0, false);
        declareFunction(me, "new_lucene_query", "NEW-LUCENE-QUERY", 1, 2, false);
        declareFunction(me, "lucene_query_get_method", "LUCENE-QUERY-GET-METHOD", 1, 0, false);
        declareFunction(me, "seed_lucene_client", "SEED-LUCENE-CLIENT", 2, 0, false);
        declareFunction(me, "get_lucene_client", "GET-LUCENE-CLIENT", 0, 0, false);
        declareFunction(me, "get_lucene_client_client_interaction", "GET-LUCENE-CLIENT-CLIENT-INTERACTION", 1, 0, false);
        declareFunction(me, "set_lucene_client_client_interaction", "SET-LUCENE-CLIENT-CLIENT-INTERACTION", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_lucene_client_class", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-CLIENT-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_lucene_client_instance", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-CLIENT-INSTANCE", 1, 0, false);
        declareFunction(me, "lucene_client_p", "LUCENE-CLIENT-P", 1, 0, false);
        declareFunction(me, "lucene_client_initialize_method", "LUCENE-CLIENT-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "lucene_client_search_method", "LUCENE-CLIENT-SEARCH-METHOD", 2, 1, false);
        declareFunction(me, "lucene_client_count_method", "LUCENE-CLIENT-COUNT-METHOD", 2, 0, false);
        declareFunction(me, "lucene_client_lucene_request_method", "LUCENE-CLIENT-LUCENE-REQUEST-METHOD", 3, 1, false);
        declareFunction(me, "get_lucene_client_interaction_lucene_count", "GET-LUCENE-CLIENT-INTERACTION-LUCENE-COUNT", 1, 0, false);
        declareFunction(me, "set_lucene_client_interaction_lucene_count", "SET-LUCENE-CLIENT-INTERACTION-LUCENE-COUNT", 2, 0, false);
        declareFunction(me, "get_lucene_client_interaction_lucene_passages", "GET-LUCENE-CLIENT-INTERACTION-LUCENE-PASSAGES", 1, 0, false);
        declareFunction(me, "set_lucene_client_interaction_lucene_passages", "SET-LUCENE-CLIENT-INTERACTION-LUCENE-PASSAGES", 2, 0, false);
        declareFunction(me, "get_lucene_client_interaction_directive_arg", "GET-LUCENE-CLIENT-INTERACTION-DIRECTIVE-ARG", 1, 0, false);
        declareFunction(me, "set_lucene_client_interaction_directive_arg", "SET-LUCENE-CLIENT-INTERACTION-DIRECTIVE-ARG", 2, 0, false);
        declareFunction(me, "get_lucene_client_interaction_directive", "GET-LUCENE-CLIENT-INTERACTION-DIRECTIVE", 1, 0, false);
        declareFunction(me, "set_lucene_client_interaction_directive", "SET-LUCENE-CLIENT-INTERACTION-DIRECTIVE", 2, 0, false);
        declareFunction(me, "get_lucene_client_interaction_docno", "GET-LUCENE-CLIENT-INTERACTION-DOCNO", 1, 0, false);
        declareFunction(me, "set_lucene_client_interaction_docno", "SET-LUCENE-CLIENT-INTERACTION-DOCNO", 2, 0, false);
        declareFunction(me, "get_lucene_client_interaction_content_keyword", "GET-LUCENE-CLIENT-INTERACTION-CONTENT-KEYWORD", 1, 0, false);
        declareFunction(me, "set_lucene_client_interaction_content_keyword", "SET-LUCENE-CLIENT-INTERACTION-CONTENT-KEYWORD", 2, 0, false);
        declareFunction(me, "get_lucene_client_interaction_id_keyword", "GET-LUCENE-CLIENT-INTERACTION-ID-KEYWORD", 1, 0, false);
        declareFunction(me, "set_lucene_client_interaction_id_keyword", "SET-LUCENE-CLIENT-INTERACTION-ID-KEYWORD", 2, 0, false);
        declareFunction(me, "get_lucene_client_interaction_query_language_attr", "GET-LUCENE-CLIENT-INTERACTION-QUERY-LANGUAGE-ATTR", 1, 0, false);
        declareFunction(me, "set_lucene_client_interaction_query_language_attr", "SET-LUCENE-CLIENT-INTERACTION-QUERY-LANGUAGE-ATTR", 2, 0, false);
        declareFunction(me, "get_lucene_client_interaction_query_count_attr", "GET-LUCENE-CLIENT-INTERACTION-QUERY-COUNT-ATTR", 1, 0, false);
        declareFunction(me, "set_lucene_client_interaction_query_count_attr", "SET-LUCENE-CLIENT-INTERACTION-QUERY-COUNT-ATTR", 2, 0, false);
        declareFunction(me, "get_lucene_client_interaction_query_type_attr", "GET-LUCENE-CLIENT-INTERACTION-QUERY-TYPE-ATTR", 1, 0, false);
        declareFunction(me, "set_lucene_client_interaction_query_type_attr", "SET-LUCENE-CLIENT-INTERACTION-QUERY-TYPE-ATTR", 2, 0, false);
        declareFunction(me, "get_lucene_client_interaction_query_tag", "GET-LUCENE-CLIENT-INTERACTION-QUERY-TAG", 1, 0, false);
        declareFunction(me, "set_lucene_client_interaction_query_tag", "SET-LUCENE-CLIENT-INTERACTION-QUERY-TAG", 2, 0, false);
        declareFunction(me, "get_lucene_client_interaction_subl_directive_tag", "GET-LUCENE-CLIENT-INTERACTION-SUBL-DIRECTIVE-TAG", 1, 0, false);
        declareFunction(me, "set_lucene_client_interaction_subl_directive_tag", "SET-LUCENE-CLIENT-INTERACTION-SUBL-DIRECTIVE-TAG", 2, 0, false);
        declareFunction(me, "get_lucene_client_interaction_count_directive_tag", "GET-LUCENE-CLIENT-INTERACTION-COUNT-DIRECTIVE-TAG", 1, 0, false);
        declareFunction(me, "set_lucene_client_interaction_count_directive_tag", "SET-LUCENE-CLIENT-INTERACTION-COUNT-DIRECTIVE-TAG", 2, 0, false);
        declareFunction(me, "get_lucene_client_interaction_search_directive_tag", "GET-LUCENE-CLIENT-INTERACTION-SEARCH-DIRECTIVE-TAG", 1, 0, false);
        declareFunction(me, "set_lucene_client_interaction_search_directive_tag", "SET-LUCENE-CLIENT-INTERACTION-SEARCH-DIRECTIVE-TAG", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_lucene_client_interaction_class", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-CLIENT-INTERACTION-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_lucene_client_interaction_instance", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-CLIENT-INTERACTION-INSTANCE", 1, 0, false);
        declareFunction(me, "lucene_client_interaction_p", "LUCENE-CLIENT-INTERACTION-P", 1, 0, false);
        declareFunction(me, "lucene_client_interaction_initialize_method", "LUCENE-CLIENT-INTERACTION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "lucene_client_interaction_set_directive_method", "LUCENE-CLIENT-INTERACTION-SET-DIRECTIVE-METHOD", 2, 0, false);
        declareFunction(me, "lucene_client_interaction_build_answer_method", "LUCENE-CLIENT-INTERACTION-BUILD-ANSWER-METHOD", 2, 0, false);
        declareFunction(me, "lucene_client_interaction_get_directive_method", "LUCENE-CLIENT-INTERACTION-GET-DIRECTIVE-METHOD", 1, 0, false);
        declareFunction(me, "lucene_client_interaction_set_directive_arg_method", "LUCENE-CLIENT-INTERACTION-SET-DIRECTIVE-ARG-METHOD", 2, 0, false);
        declareFunction(me, "lucene_client_interaction_set_docno_method", "LUCENE-CLIENT-INTERACTION-SET-DOCNO-METHOD", 2, 0, false);
        declareFunction(me, "lucene_client_interaction_request_string_method", "LUCENE-CLIENT-INTERACTION-REQUEST-STRING-METHOD", 1, 0, false);
        declareFunction(me, "lucene_client_interaction_get_answer_method", "LUCENE-CLIENT-INTERACTION-GET-ANSWER-METHOD", 1, 0, false);
        declareFunction(me, "lucene_client_interaction_get_lucene_passages_method", "LUCENE-CLIENT-INTERACTION-GET-LUCENE-PASSAGES-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_lucene_passage_list_class", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-PASSAGE-LIST-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_lucene_passage_list_instance", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-PASSAGE-LIST-INSTANCE", 1, 0, false);
        declareFunction(me, "lucene_passage_list_p", "LUCENE-PASSAGE-LIST-P", 1, 0, false);
        declareFunction(me, "lucene_passage_list_acceptable_p_method", "LUCENE-PASSAGE-LIST-ACCEPTABLE-P-METHOD", 2, 0, false);
        declareFunction(me, "lucene_passage_list_add_method", "LUCENE-PASSAGE-LIST-ADD-METHOD", 2, 0, false);
        declareFunction(me, "get_lucene_passage_parse_trees", "GET-LUCENE-PASSAGE-PARSE-TREES", 1, 0, false);
        declareFunction(me, "set_lucene_passage_parse_trees", "SET-LUCENE-PASSAGE-PARSE-TREES", 2, 0, false);
        declareFunction(me, "get_lucene_passage_id", "GET-LUCENE-PASSAGE-ID", 1, 0, false);
        declareFunction(me, "set_lucene_passage_id", "SET-LUCENE-PASSAGE-ID", 2, 0, false);
        declareFunction(me, "get_lucene_passage_rank", "GET-LUCENE-PASSAGE-RANK", 1, 0, false);
        declareFunction(me, "set_lucene_passage_rank", "SET-LUCENE-PASSAGE-RANK", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_lucene_passage_class", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-PASSAGE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_lucene_passage_instance", "SUBLOOP-RESERVED-INITIALIZE-LUCENE-PASSAGE-INSTANCE", 1, 0, false);
        declareFunction(me, "lucene_passage_p", "LUCENE-PASSAGE-P", 1, 0, false);
        declareFunction(me, "new_lucene_passage", "NEW-LUCENE-PASSAGE", 3, 0, false);
        declareFunction(me, "lucene_passage_get_source_method", "LUCENE-PASSAGE-GET-SOURCE-METHOD", 1, 0, false);
        declareFunction(me, "lucene_passage_get_score_method", "LUCENE-PASSAGE-GET-SCORE-METHOD", 1, 0, false);
        declareFunction(me, "lucene_passage_is_complete_method", "LUCENE-PASSAGE-IS-COMPLETE-METHOD", 1, 0, false);
        declareFunction(me, "lucene_passage_print_method", "LUCENE-PASSAGE-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "lucene_passage_get_publication_date_method", "LUCENE-PASSAGE-GET-PUBLICATION-DATE-METHOD", 1, 0, false);
        declareFunction(me, "get_cycl_query_properties", "GET-CYCL-QUERY-PROPERTIES", 1, 0, false);
        declareFunction(me, "set_cycl_query_properties", "SET-CYCL-QUERY-PROPERTIES", 2, 0, false);
        declareFunction(me, "get_cycl_query_knowledge_sources", "GET-CYCL-QUERY-KNOWLEDGE-SOURCES", 1, 0, false);
        declareFunction(me, "set_cycl_query_knowledge_sources", "SET-CYCL-QUERY-KNOWLEDGE-SOURCES", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_cycl_query_class", "SUBLOOP-RESERVED-INITIALIZE-CYCL-QUERY-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_cycl_query_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCL-QUERY-INSTANCE", 1, 0, false);
        declareFunction(me, "cycl_query_p", "CYCL-QUERY-P", 1, 0, false);
        declareFunction(me, "new_cycl_query", "NEW-CYCL-QUERY", 1, 2, false);
        declareFunction(me, "cycl_query_equal_p", "CYCL-QUERY-EQUAL-P", 2, 0, false);
        declareFunction(me, "cycl_query_get_method", "CYCL-QUERY-GET-METHOD", 1, 0, false);
        declareFunction(me, "corpus_p", "CORPUS-P", 1, 0, false);
        declareFunction(me, "cycl_query_get_from_kb_method", "CYCL-QUERY-GET-FROM-KB-METHOD", 2, 0, false);
        declareFunction(me, "cycl_query_get_from_corpus_method", "CYCL-QUERY-GET-FROM-CORPUS-METHOD", 2, 0, false);
        declareFunction(me, "cycl_query_generate_assignments_method", "CYCL-QUERY-GENERATE-ASSIGNMENTS-METHOD", 3, 0, false);
        declareFunction(me, "new_tmp_mt", "NEW-TMP-MT", 0, 1, false);
        declareFunction(me, "get_var_assignment_justification", "GET-VAR-ASSIGNMENT-JUSTIFICATION", 1, 0, false);
        declareFunction(me, "set_var_assignment_justification", "SET-VAR-ASSIGNMENT-JUSTIFICATION", 2, 0, false);
        declareFunction(me, "get_var_assignment_bindings", "GET-VAR-ASSIGNMENT-BINDINGS", 1, 0, false);
        declareFunction(me, "set_var_assignment_bindings", "SET-VAR-ASSIGNMENT-BINDINGS", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_var_assignment_class", "SUBLOOP-RESERVED-INITIALIZE-VAR-ASSIGNMENT-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_var_assignment_instance", "SUBLOOP-RESERVED-INITIALIZE-VAR-ASSIGNMENT-INSTANCE", 1, 0, false);
        declareFunction(me, "var_assignment_p", "VAR-ASSIGNMENT-P", 1, 0, false);
        declareFunction(me, "new_var_assignment", "NEW-VAR-ASSIGNMENT", 1, 1, false);
        declareFunction(me, "var_assignment_print_method", "VAR-ASSIGNMENT-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "var_assignment_get_content_method", "VAR-ASSIGNMENT-GET-CONTENT-METHOD", 1, 0, false);
        declareFunction(me, "var_assignment_get_source_method", "VAR-ASSIGNMENT-GET-SOURCE-METHOD", 1, 0, false);
        declareFunction(me, "get_wordnet_query_pos", "GET-WORDNET-QUERY-POS", 1, 0, false);
        declareFunction(me, "set_wordnet_query_pos", "SET-WORDNET-QUERY-POS", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_wordnet_query_class", "SUBLOOP-RESERVED-INITIALIZE-WORDNET-QUERY-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_wordnet_query_instance", "SUBLOOP-RESERVED-INITIALIZE-WORDNET-QUERY-INSTANCE", 1, 0, false);
        declareFunction(me, "wordnet_query_p", "WORDNET-QUERY-P", 1, 0, false);
        declareFunction(me, "new_wordnet_query", "NEW-WORDNET-QUERY", 2, 0, false);
        declareFunction(me, "wordnet_pos_p", "WORDNET-POS-P", 1, 0, false);
        declareFunction(me, "wordnet_query_get_method", "WORDNET-QUERY-GET-METHOD", 1, 0, false);
        declareFunction(me, "get_wordnet_gloss_gloss", "GET-WORDNET-GLOSS-GLOSS", 1, 0, false);
        declareFunction(me, "set_wordnet_gloss_gloss", "SET-WORDNET-GLOSS-GLOSS", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_wordnet_gloss_class", "SUBLOOP-RESERVED-INITIALIZE-WORDNET-GLOSS-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_wordnet_gloss_instance", "SUBLOOP-RESERVED-INITIALIZE-WORDNET-GLOSS-INSTANCE", 1, 0, false);
        declareFunction(me, "wordnet_gloss_p", "WORDNET-GLOSS-P", 1, 0, false);
        declareFunction(me, "new_wordnet_gloss", "NEW-WORDNET-GLOSS", 1, 0, false);
        declareFunction(me, "wordnet_gloss_get_content_method", "WORDNET-GLOSS-GET-CONTENT-METHOD", 1, 0, false);
        declareFunction(me, "wordnet_gloss_get_source_method", "WORDNET-GLOSS-GET-SOURCE-METHOD", 1, 0, false);
        declareFunction(me, "strip_passage_header", "STRIP-PASSAGE-HEADER", 1, 0, false);
        declareFunction(me, "passage_similarity", "PASSAGE-SIMILARITY", 2, 0, false);
        declareFunction(me, "augment_search_string", "AUGMENT-SEARCH-STRING", 1, 1, false);
        declareFunction(me, "current_google_api_method_invocation_count", "CURRENT-GOOGLE-API-METHOD-INVOCATION-COUNT", 0, 0, false);
        declareFunction(me, "update_google_api_method_invocation_count", "UPDATE-GOOGLE-API-METHOD-INVOCATION-COUNT", 0, 0, false);
        declareMacro(me, "with_google_api_method_invocation_tracking", "WITH-GOOGLE-API-METHOD-INVOCATION-TRACKING");
        declareFunction(me, "google_frequencies", "GOOGLE-FREQUENCIES", 1, 0, false);
        declareFunction(me, "google_search", "GOOGLE-SEARCH", 1, 2, false);
        declareFunction(me, "google_count", "GOOGLE-COUNT", 1, 0, false);
        declareFunction(me, "google_status", "GOOGLE-STATUS", 0, 0, false);
        declareFunction(me, "google_spelling", "GOOGLE-SPELLING", 1, 0, false);
        declareFunction(me, "google_server_aliveP", "GOOGLE-SERVER-ALIVE?", 0, 0, false);
        declareFunction(me, "google_license_count", "GOOGLE-LICENSE-COUNT", 0, 0, false);
        declareFunction(me, "google_quit", "GOOGLE-QUIT", 0, 0, false);
        declareFunction(me, "google_error_tokenP", "GOOGLE-ERROR-TOKEN?", 1, 0, false);
        declareFunction(me, "google_search_url", "GOOGLE-SEARCH-URL", 1, 2, false);
        return NIL;
    }

    public static SubLObject init_search_engine_file() {
        defparameter("*DEFAULT-CORPUS*", $$$CNSjan2004);
        defparameter("*WORLD-WIDE-WEB-CORPUS*", $$$WWW);
        defvar("*AUTHORIZED-GOOGLE-KEY*", NIL);
        defparameter("*GOOGLE-CLIENT-KEY-FILE*", red_infrastructure_macros.red_def_helper($list304.isSymbol() ? symbol_value($list304) : $list304, $google_client_key_file$, $str306$data_googlekey_txt.isSymbol() ? symbol_value($str306$data_googlekey_txt) : $str306$data_googlekey_txt, $PARAMETER, UNPROVIDED));
        defparameter("*GOOGLE-CLIENT-HOST*", red_infrastructure_macros.red_def_helper($list308.isSymbol() ? symbol_value($list308) : $list308, $google_client_host$, $str310$googleserver_cyc_com.isSymbol() ? symbol_value($str310$googleserver_cyc_com) : $str310$googleserver_cyc_com, $PARAMETER, UNPROVIDED));
        defparameter("*GOOGLE-CLIENT-PORT*", red_infrastructure_macros.red_def_helper($list311.isSymbol() ? symbol_value($list311) : $list311, $google_client_port$, $int$6667.isSymbol() ? symbol_value($int$6667) : $int$6667, $PARAMETER, UNPROVIDED));
        defparameter("*GOOGLE-CLIENT*", NIL);
        defparameter("*WIKIPEDIA*", $$$Wikipedia);
        defvar("*LUCENE-CLIENT-HOST*", NIL);
        defvar("*LUCENE-CLIENT-PORT*", NIL);
        defvar("*LUCENE-CLIENT*", NIL);
        defparameter("*GOOGLE-API-METHOD-INVOCATION-COUNT*", NIL);
        return NIL;
    }

    public static SubLObject setup_search_engine_file() {
        classes.subloop_new_class(INFORMATION, OBJECT, NIL, T, $list2);
        classes.class_set_implements_slot_listeners(INFORMATION, NIL);
        classes.subloop_note_class_initialization_function(INFORMATION, SUBLOOP_RESERVED_INITIALIZE_INFORMATION_CLASS);
        classes.subloop_note_instance_initialization_function(INFORMATION, SUBLOOP_RESERVED_INITIALIZE_INFORMATION_INSTANCE);
        subloop_reserved_initialize_information_class(INFORMATION);
        methods.methods_incorporate_instance_method(GET_SOURCE, INFORMATION, $list9, NIL, $list10);
        methods.subloop_register_instance_method(INFORMATION, GET_SOURCE, INFORMATION_GET_SOURCE_METHOD);
        classes.subloop_new_class(ABSTRACT_PASSAGE, INFORMATION, NIL, T, $list13);
        classes.class_set_implements_slot_listeners(ABSTRACT_PASSAGE, NIL);
        classes.subloop_note_class_initialization_function(ABSTRACT_PASSAGE, SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_PASSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(ABSTRACT_PASSAGE, SUBLOOP_RESERVED_INITIALIZE_ABSTRACT_PASSAGE_INSTANCE);
        subloop_reserved_initialize_abstract_passage_class(ABSTRACT_PASSAGE);
        methods.methods_incorporate_instance_method(EQUAL, ABSTRACT_PASSAGE, $list9, $list17, $list18);
        methods.subloop_register_instance_method(ABSTRACT_PASSAGE, EQUAL, ABSTRACT_PASSAGE_EQUAL_METHOD);
        methods.methods_incorporate_class_method(SIMILARITY, ABSTRACT_PASSAGE, $list9, $list22, $list23);
        methods.subloop_register_class_method(ABSTRACT_PASSAGE, SIMILARITY, ABSTRACT_PASSAGE_SIMILARITY_METHOD);
        methods.methods_incorporate_instance_method(GET_DATES, ABSTRACT_PASSAGE, $list9, NIL, $list28);
        methods.subloop_register_instance_method(ABSTRACT_PASSAGE, GET_DATES, ABSTRACT_PASSAGE_GET_DATES_METHOD);
        methods.methods_incorporate_instance_method(OLDER, ABSTRACT_PASSAGE, $list9, $list33, $list34);
        methods.subloop_register_instance_method(ABSTRACT_PASSAGE, OLDER, ABSTRACT_PASSAGE_OLDER_METHOD);
        methods.methods_incorporate_instance_method(GET_PUBLICATION_DATE, ABSTRACT_PASSAGE, $list9, NIL, $list38);
        methods.subloop_register_instance_method(ABSTRACT_PASSAGE, GET_PUBLICATION_DATE, ABSTRACT_PASSAGE_GET_PUBLICATION_DATE_METHOD);
        classes.subloop_new_class(SIMPLE_PASSAGE, ABSTRACT_PASSAGE, NIL, NIL, $list41);
        classes.class_set_implements_slot_listeners(SIMPLE_PASSAGE, NIL);
        classes.subloop_note_class_initialization_function(SIMPLE_PASSAGE, SUBLOOP_RESERVED_INITIALIZE_SIMPLE_PASSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(SIMPLE_PASSAGE, SUBLOOP_RESERVED_INITIALIZE_SIMPLE_PASSAGE_INSTANCE);
        subloop_reserved_initialize_simple_passage_class(SIMPLE_PASSAGE);
        methods.methods_incorporate_instance_method(PRINT, SIMPLE_PASSAGE, $list46, $list47, $list48);
        methods.subloop_register_instance_method(SIMPLE_PASSAGE, PRINT, SIMPLE_PASSAGE_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENT, SIMPLE_PASSAGE, $list9, NIL, $list51);
        methods.subloop_register_instance_method(SIMPLE_PASSAGE, GET_CONTENT, SIMPLE_PASSAGE_GET_CONTENT_METHOD);
        classes.subloop_new_class(CORPUS_PASSAGE, ABSTRACT_PASSAGE, NIL, T, $list55);
        classes.class_set_implements_slot_listeners(CORPUS_PASSAGE, NIL);
        classes.subloop_note_class_initialization_function(CORPUS_PASSAGE, SUBLOOP_RESERVED_INITIALIZE_CORPUS_PASSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(CORPUS_PASSAGE, SUBLOOP_RESERVED_INITIALIZE_CORPUS_PASSAGE_INSTANCE);
        subloop_reserved_initialize_corpus_passage_class(CORPUS_PASSAGE);
        methods.methods_incorporate_instance_method(GET_CORPUS, CORPUS_PASSAGE, $list9, NIL, $list60);
        methods.subloop_register_instance_method(CORPUS_PASSAGE, GET_CORPUS, CORPUS_PASSAGE_GET_CORPUS_METHOD);
        methods.methods_incorporate_instance_method(GET_VECTOR, ABSTRACT_PASSAGE, $list9, NIL, $list63);
        methods.subloop_register_instance_method(ABSTRACT_PASSAGE, GET_VECTOR, ABSTRACT_PASSAGE_GET_VECTOR_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENT, CORPUS_PASSAGE, $list9, NIL, $list51);
        methods.subloop_register_instance_method(CORPUS_PASSAGE, GET_CONTENT, CORPUS_PASSAGE_GET_CONTENT_METHOD);
        methods.methods_incorporate_instance_method(IDENTIFY_ENTITIES, CORPUS_PASSAGE, $list9, $list69, $list70);
        methods.subloop_register_instance_method(CORPUS_PASSAGE, IDENTIFY_ENTITIES, CORPUS_PASSAGE_IDENTIFY_ENTITIES_METHOD);
        methods.methods_incorporate_class_method(MAX_INSTANCES, CORPUS_PASSAGE, $list9, $list85, $list86);
        methods.subloop_register_class_method(CORPUS_PASSAGE, MAX_INSTANCES, CORPUS_PASSAGE_MAX_INSTANCES_METHOD);
        methods.methods_incorporate_instance_method(GET_PARSE_TREES, CORPUS_PASSAGE, $list9, NIL, $list90);
        methods.subloop_register_instance_method(CORPUS_PASSAGE, GET_PARSE_TREES, CORPUS_PASSAGE_GET_PARSE_TREES_METHOD);
        classes.subloop_new_class(INFORMATION_REQUEST, OBJECT, NIL, NIL, $list96);
        classes.class_set_implements_slot_listeners(INFORMATION_REQUEST, NIL);
        classes.subloop_note_class_initialization_function(INFORMATION_REQUEST, SUBLOOP_RESERVED_INITIALIZE_INFORMATION_REQUEST_CLASS);
        classes.subloop_note_instance_initialization_function(INFORMATION_REQUEST, SUBLOOP_RESERVED_INITIALIZE_INFORMATION_REQUEST_INSTANCE);
        subloop_reserved_initialize_information_request_class(INFORMATION_REQUEST);
        methods.methods_incorporate_instance_method(INITIALIZE, INFORMATION_REQUEST, $list46, NIL, $list102);
        methods.subloop_register_instance_method(INFORMATION_REQUEST, INITIALIZE, INFORMATION_REQUEST_INITIALIZE_METHOD);
        classes.subloop_new_class(KNOWLEDGE_SOURCE_QUERY, INFORMATION_REQUEST, NIL, T, $list108);
        classes.class_set_implements_slot_listeners(KNOWLEDGE_SOURCE_QUERY, NIL);
        classes.subloop_note_class_initialization_function(KNOWLEDGE_SOURCE_QUERY, SUBLOOP_RESERVED_INITIALIZE_KNOWLEDGE_SOURCE_QUERY_CLASS);
        classes.subloop_note_instance_initialization_function(KNOWLEDGE_SOURCE_QUERY, SUBLOOP_RESERVED_INITIALIZE_KNOWLEDGE_SOURCE_QUERY_INSTANCE);
        subloop_reserved_initialize_knowledge_source_query_class(KNOWLEDGE_SOURCE_QUERY);
        methods.methods_incorporate_instance_method(ANSWER, KNOWLEDGE_SOURCE_QUERY, $list9, NIL, $list113);
        methods.subloop_register_instance_method(KNOWLEDGE_SOURCE_QUERY, ANSWER, KNOWLEDGE_SOURCE_QUERY_ANSWER_METHOD);
        methods.methods_incorporate_instance_method(PRINT, KNOWLEDGE_SOURCE_QUERY, $list46, $list47, $list119);
        methods.subloop_register_instance_method(KNOWLEDGE_SOURCE_QUERY, PRINT, KNOWLEDGE_SOURCE_QUERY_PRINT_METHOD);
        methods.methods_incorporate_instance_method(HANDLE_ERROR, KNOWLEDGE_SOURCE_QUERY, $list46, $list124, $list125);
        methods.subloop_register_instance_method(KNOWLEDGE_SOURCE_QUERY, HANDLE_ERROR, KNOWLEDGE_SOURCE_QUERY_HANDLE_ERROR_METHOD);
        classes.subloop_new_class(CORPUS_QUERY, KNOWLEDGE_SOURCE_QUERY, NIL, NIL, $list131);
        classes.class_set_implements_slot_listeners(CORPUS_QUERY, NIL);
        classes.subloop_note_class_initialization_function(CORPUS_QUERY, SUBLOOP_RESERVED_INITIALIZE_CORPUS_QUERY_CLASS);
        classes.subloop_note_instance_initialization_function(CORPUS_QUERY, SUBLOOP_RESERVED_INITIALIZE_CORPUS_QUERY_INSTANCE);
        subloop_reserved_initialize_corpus_query_class(CORPUS_QUERY);
        methods.methods_incorporate_class_method(GET_CORPUS_PATH_MAPPING, CORPUS_QUERY, $list9, NIL, $list135);
        methods.subloop_register_class_method(CORPUS_QUERY, GET_CORPUS_PATH_MAPPING, CORPUS_QUERY_GET_CORPUS_PATH_MAPPING_METHOD);
        methods.methods_incorporate_instance_method(GET_CORPUS, CORPUS_QUERY, $list9, NIL, $list137);
        methods.subloop_register_instance_method(CORPUS_QUERY, GET_CORPUS, CORPUS_QUERY_GET_CORPUS_METHOD);
        methods.methods_incorporate_class_method(GET_CORPUS_PATH, CORPUS_QUERY, $list46, NIL, $list141);
        methods.subloop_register_class_method(CORPUS_QUERY, GET_CORPUS_PATH, CORPUS_QUERY_GET_CORPUS_PATH_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CORPUS_QUERY, $list46, $list47, $list144);
        methods.subloop_register_instance_method(CORPUS_QUERY, PRINT, CORPUS_QUERY_PRINT_METHOD);
        classes.subloop_new_class(GLIMPSE_QUERY, CORPUS_QUERY, NIL, NIL, $list150);
        classes.class_set_implements_slot_listeners(GLIMPSE_QUERY, NIL);
        classes.subloop_note_class_initialization_function(GLIMPSE_QUERY, SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_QUERY_CLASS);
        classes.subloop_note_instance_initialization_function(GLIMPSE_QUERY, SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_QUERY_INSTANCE);
        subloop_reserved_initialize_glimpse_query_class(GLIMPSE_QUERY);
        methods.methods_incorporate_class_method(GET_CORPUS_PATH_MAPPING, GLIMPSE_QUERY, $list9, NIL, $list154);
        methods.subloop_register_class_method(GLIMPSE_QUERY, GET_CORPUS_PATH_MAPPING, GLIMPSE_QUERY_GET_CORPUS_PATH_MAPPING_METHOD);
        methods.methods_incorporate_instance_method(GET, GLIMPSE_QUERY, $list157, NIL, $list158);
        methods.subloop_register_instance_method(GLIMPSE_QUERY, GET, GLIMPSE_QUERY_GET_METHOD);
        classes.subloop_new_class(GLIMPSE_PASSAGE, CORPUS_PASSAGE, NIL, NIL, $list172);
        classes.class_set_implements_slot_listeners(GLIMPSE_PASSAGE, NIL);
        classes.subloop_note_class_initialization_function(GLIMPSE_PASSAGE, SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_PASSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(GLIMPSE_PASSAGE, SUBLOOP_RESERVED_INITIALIZE_GLIMPSE_PASSAGE_INSTANCE);
        subloop_reserved_initialize_glimpse_passage_class(GLIMPSE_PASSAGE);
        methods.methods_incorporate_instance_method(PRINT, GLIMPSE_PASSAGE, $list46, $list47, $list181);
        methods.subloop_register_instance_method(GLIMPSE_PASSAGE, PRINT, GLIMPSE_PASSAGE_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_PUBLICATION_DATE, GLIMPSE_PASSAGE, $list9, NIL, $list184);
        methods.subloop_register_instance_method(GLIMPSE_PASSAGE, GET_PUBLICATION_DATE, GLIMPSE_PASSAGE_GET_PUBLICATION_DATE_METHOD);
        methods.methods_incorporate_instance_method(GET_SOURCE, GLIMPSE_PASSAGE, $list9, NIL, $list187);
        methods.subloop_register_instance_method(GLIMPSE_PASSAGE, GET_SOURCE, GLIMPSE_PASSAGE_GET_SOURCE_METHOD);
        classes.subloop_new_class(GURUQA_QUERY, CORPUS_QUERY, NIL, NIL, $list150);
        classes.class_set_implements_slot_listeners(GURUQA_QUERY, NIL);
        classes.subloop_note_class_initialization_function(GURUQA_QUERY, SUBLOOP_RESERVED_INITIALIZE_GURUQA_QUERY_CLASS);
        classes.subloop_note_instance_initialization_function(GURUQA_QUERY, SUBLOOP_RESERVED_INITIALIZE_GURUQA_QUERY_INSTANCE);
        subloop_reserved_initialize_guruqa_query_class(GURUQA_QUERY);
        methods.methods_incorporate_instance_method(GET, GURUQA_QUERY, $list157, NIL, $list194);
        methods.subloop_register_instance_method(GURUQA_QUERY, GET, GURUQA_QUERY_GET_METHOD);
        classes.subloop_new_class(GURUQA_PASSAGE, CORPUS_PASSAGE, NIL, NIL, $list201);
        classes.class_set_implements_slot_listeners(GURUQA_PASSAGE, NIL);
        classes.subloop_note_class_initialization_function(GURUQA_PASSAGE, SUBLOOP_RESERVED_INITIALIZE_GURUQA_PASSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(GURUQA_PASSAGE, SUBLOOP_RESERVED_INITIALIZE_GURUQA_PASSAGE_INSTANCE);
        subloop_reserved_initialize_guruqa_passage_class(GURUQA_PASSAGE);
        methods.methods_incorporate_instance_method(PRINT, GURUQA_PASSAGE, $list9, $list47, $list210);
        methods.subloop_register_instance_method(GURUQA_PASSAGE, PRINT, GURUQA_PASSAGE_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_SOURCE, GURUQA_PASSAGE, $list9, NIL, $list213);
        methods.subloop_register_instance_method(GURUQA_PASSAGE, GET_SOURCE, GURUQA_PASSAGE_GET_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENT, GURUQA_PASSAGE, $list9, NIL, $list217);
        methods.subloop_register_instance_method(GURUQA_PASSAGE, GET_CONTENT, GURUQA_PASSAGE_GET_CONTENT_METHOD);
        methods.methods_incorporate_instance_method(HANDLE_ERROR, GURUQA_PASSAGE, $list157, $list124, $list125);
        methods.subloop_register_instance_method(GURUQA_PASSAGE, HANDLE_ERROR, GURUQA_PASSAGE_HANDLE_ERROR_METHOD);
        classes.subloop_new_class(LEMUR_QUERY, CORPUS_QUERY, NIL, NIL, $list223);
        classes.class_set_implements_slot_listeners(LEMUR_QUERY, NIL);
        classes.subloop_note_class_initialization_function(LEMUR_QUERY, SUBLOOP_RESERVED_INITIALIZE_LEMUR_QUERY_CLASS);
        classes.subloop_note_instance_initialization_function(LEMUR_QUERY, SUBLOOP_RESERVED_INITIALIZE_LEMUR_QUERY_INSTANCE);
        subloop_reserved_initialize_lemur_query_class(LEMUR_QUERY);
        methods.methods_incorporate_class_method(GET_CORPUS_PATH_MAPPING, LEMUR_QUERY, $list9, NIL, $list230);
        methods.subloop_register_class_method(LEMUR_QUERY, GET_CORPUS_PATH_MAPPING, LEMUR_QUERY_GET_CORPUS_PATH_MAPPING_METHOD);
        methods.methods_incorporate_instance_method(GET, LEMUR_QUERY, $list157, NIL, $list233);
        methods.subloop_register_instance_method(LEMUR_QUERY, GET, LEMUR_QUERY_GET_METHOD);
        classes.subloop_new_class(LEMUR_PASSAGE, CORPUS_PASSAGE, NIL, NIL, $list244);
        classes.class_set_implements_slot_listeners(LEMUR_PASSAGE, NIL);
        classes.subloop_note_class_initialization_function(LEMUR_PASSAGE, SUBLOOP_RESERVED_INITIALIZE_LEMUR_PASSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(LEMUR_PASSAGE, SUBLOOP_RESERVED_INITIALIZE_LEMUR_PASSAGE_INSTANCE);
        subloop_reserved_initialize_lemur_passage_class(LEMUR_PASSAGE);
        methods.methods_incorporate_instance_method(PRINT, LEMUR_PASSAGE, $list9, $list47, $list249);
        methods.subloop_register_instance_method(LEMUR_PASSAGE, PRINT, LEMUR_PASSAGE_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_SOURCE, LEMUR_PASSAGE, $list9, NIL, $list252);
        methods.subloop_register_instance_method(LEMUR_PASSAGE, GET_SOURCE, LEMUR_PASSAGE_GET_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(GET_PUBLICATION_DATE, LEMUR_PASSAGE, $list9, NIL, $list256);
        methods.subloop_register_instance_method(LEMUR_PASSAGE, GET_PUBLICATION_DATE, LEMUR_PASSAGE_GET_PUBLICATION_DATE_METHOD);
        methods.methods_incorporate_instance_method(GET_SCORE, LEMUR_PASSAGE, $list9, NIL, $list259);
        methods.subloop_register_instance_method(LEMUR_PASSAGE, GET_SCORE, LEMUR_PASSAGE_GET_SCORE_METHOD);
        classes.subloop_new_class(QAGA_QUERY, CORPUS_QUERY, NIL, NIL, $list263);
        classes.class_set_implements_slot_listeners(QAGA_QUERY, NIL);
        classes.subloop_note_class_initialization_function(QAGA_QUERY, SUBLOOP_RESERVED_INITIALIZE_QAGA_QUERY_CLASS);
        classes.subloop_note_instance_initialization_function(QAGA_QUERY, SUBLOOP_RESERVED_INITIALIZE_QAGA_QUERY_INSTANCE);
        subloop_reserved_initialize_qaga_query_class(QAGA_QUERY);
        methods.methods_incorporate_instance_method(GET, QAGA_QUERY, $list157, NIL, $list267);
        methods.subloop_register_instance_method(QAGA_QUERY, GET, QAGA_QUERY_GET_METHOD);
        methods.methods_incorporate_instance_method(GET_AUGMENTATION_TERMS, QAGA_QUERY, $list9, NIL, $list274);
        methods.subloop_register_instance_method(QAGA_QUERY, GET_AUGMENTATION_TERMS, QAGA_QUERY_GET_AUGMENTATION_TERMS_METHOD);
        classes.subloop_new_class(GOOGLE_QUERY, CORPUS_QUERY, NIL, NIL, $list279);
        classes.class_set_implements_slot_listeners(GOOGLE_QUERY, NIL);
        classes.subloop_note_class_initialization_function(GOOGLE_QUERY, SUBLOOP_RESERVED_INITIALIZE_GOOGLE_QUERY_CLASS);
        classes.subloop_note_instance_initialization_function(GOOGLE_QUERY, SUBLOOP_RESERVED_INITIALIZE_GOOGLE_QUERY_INSTANCE);
        subloop_reserved_initialize_google_query_class(GOOGLE_QUERY);
        methods.methods_incorporate_instance_method(GET, GOOGLE_QUERY, $list157, NIL, $list284);
        methods.subloop_register_instance_method(GOOGLE_QUERY, GET, GOOGLE_QUERY_GET_METHOD);
        methods.methods_incorporate_instance_method(COUNT, GOOGLE_QUERY, $list157, NIL, $list289);
        methods.subloop_register_instance_method(GOOGLE_QUERY, COUNT, GOOGLE_QUERY_COUNT_METHOD);
        methods.methods_incorporate_instance_method(QUIT, GOOGLE_QUERY, $list157, NIL, $list293);
        methods.subloop_register_instance_method(GOOGLE_QUERY, QUIT, GOOGLE_QUERY_QUIT_METHOD);
        methods.methods_incorporate_instance_method(SPELLING, GOOGLE_QUERY, $list157, NIL, $list297);
        methods.subloop_register_instance_method(GOOGLE_QUERY, SPELLING, GOOGLE_QUERY_SPELLING_METHOD);
        methods.methods_incorporate_instance_method(VERSION, GOOGLE_QUERY, $list157, NIL, $list301);
        methods.subloop_register_instance_method(GOOGLE_QUERY, VERSION, GOOGLE_QUERY_VERSION_METHOD);
        classes.subloop_new_class(GOOGLE_CLIENT, TCP_CLIENT, NIL, NIL, $list323);
        classes.class_set_implements_slot_listeners(GOOGLE_CLIENT, NIL);
        classes.subloop_note_class_initialization_function(GOOGLE_CLIENT, SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_CLASS);
        classes.subloop_note_instance_initialization_function(GOOGLE_CLIENT, SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_INSTANCE);
        subloop_reserved_initialize_google_client_class(GOOGLE_CLIENT);
        methods.methods_incorporate_instance_method(INITIALIZE, GOOGLE_CLIENT, $list46, NIL, $list330);
        methods.subloop_register_instance_method(GOOGLE_CLIENT, INITIALIZE, GOOGLE_CLIENT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_CLIENT_KEY, GOOGLE_CLIENT, $list9, $list332, $list333);
        methods.subloop_register_instance_method(GOOGLE_CLIENT, SET_CLIENT_KEY, GOOGLE_CLIENT_SET_CLIENT_KEY_METHOD);
        methods.methods_incorporate_instance_method(SEARCH, GOOGLE_CLIENT, $list336, $list337, $list338);
        methods.subloop_register_instance_method(GOOGLE_CLIENT, SEARCH, GOOGLE_CLIENT_SEARCH_METHOD);
        methods.methods_incorporate_instance_method(COUNT, GOOGLE_CLIENT, $list9, $list345, $list346);
        methods.subloop_register_instance_method(GOOGLE_CLIENT, COUNT, GOOGLE_CLIENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(SPELLING, GOOGLE_CLIENT, $list9, $list345, $list350);
        methods.subloop_register_instance_method(GOOGLE_CLIENT, SPELLING, GOOGLE_CLIENT_SPELLING_METHOD);
        methods.methods_incorporate_instance_method(QUIT, GOOGLE_CLIENT, $list9, NIL, $list353);
        methods.subloop_register_instance_method(GOOGLE_CLIENT, QUIT, GOOGLE_CLIENT_QUIT_METHOD);
        methods.methods_incorporate_instance_method(VERSION, GOOGLE_CLIENT, $list9, NIL, $list357);
        methods.subloop_register_instance_method(GOOGLE_CLIENT, VERSION, GOOGLE_CLIENT_VERSION_METHOD);
        methods.methods_incorporate_instance_method(BUILD_BASIC_GOOGLE_REQUEST, GOOGLE_CLIENT, $list360, $list361, $list362);
        methods.subloop_register_instance_method(GOOGLE_CLIENT, BUILD_BASIC_GOOGLE_REQUEST, GOOGLE_CLIENT_BUILD_BASIC_GOOGLE_REQUEST_METHOD);
        methods.methods_incorporate_instance_method(GET_ANSWER_FROM_REQUEST, GOOGLE_CLIENT, $list360, NIL, $list368);
        methods.subloop_register_instance_method(GOOGLE_CLIENT, GET_ANSWER_FROM_REQUEST, GOOGLE_CLIENT_GET_ANSWER_FROM_REQUEST_METHOD);
        methods.methods_incorporate_instance_method(GOOGLE_REQUEST, GOOGLE_CLIENT, $list360, $list361, $list375);
        methods.subloop_register_instance_method(GOOGLE_CLIENT, GOOGLE_REQUEST, GOOGLE_CLIENT_GOOGLE_REQUEST_METHOD);
        classes.subloop_new_class(GOOGLE_CLIENT_INTERACTION, OBJECT, NIL, NIL, $list377);
        classes.class_set_implements_slot_listeners(GOOGLE_CLIENT_INTERACTION, NIL);
        classes.subloop_note_class_initialization_function(GOOGLE_CLIENT_INTERACTION, SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_INTERACTION_CLASS);
        classes.subloop_note_instance_initialization_function(GOOGLE_CLIENT_INTERACTION, SUBLOOP_RESERVED_INITIALIZE_GOOGLE_CLIENT_INTERACTION_INSTANCE);
        subloop_reserved_initialize_google_client_interaction_class(GOOGLE_CLIENT_INTERACTION);
        methods.methods_incorporate_instance_method(INITIALIZE, GOOGLE_CLIENT_INTERACTION, $list46, NIL, $list424);
        methods.subloop_register_instance_method(GOOGLE_CLIENT_INTERACTION, INITIALIZE, GOOGLE_CLIENT_INTERACTION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_KEY, GOOGLE_CLIENT_INTERACTION, $list9, $list17, $list428);
        methods.subloop_register_instance_method(GOOGLE_CLIENT_INTERACTION, SET_KEY, GOOGLE_CLIENT_INTERACTION_SET_KEY_METHOD);
        methods.methods_incorporate_instance_method(SET_DIRECTIVE, GOOGLE_CLIENT_INTERACTION, $list9, $list17, $list431);
        methods.subloop_register_instance_method(GOOGLE_CLIENT_INTERACTION, SET_DIRECTIVE, GOOGLE_CLIENT_INTERACTION_SET_DIRECTIVE_METHOD);
        methods.methods_incorporate_instance_method(SET_DOCNO, GOOGLE_CLIENT_INTERACTION, $list9, $list17, $list434);
        methods.subloop_register_instance_method(GOOGLE_CLIENT_INTERACTION, SET_DOCNO, GOOGLE_CLIENT_INTERACTION_SET_DOCNO_METHOD);
        methods.methods_incorporate_instance_method(SET_START, GOOGLE_CLIENT_INTERACTION, $list9, $list17, $list437);
        methods.subloop_register_instance_method(GOOGLE_CLIENT_INTERACTION, SET_START, GOOGLE_CLIENT_INTERACTION_SET_START_METHOD);
        methods.methods_incorporate_instance_method(GET_IO_ERROR_FLAG, GOOGLE_CLIENT_INTERACTION, $list9, NIL, $list441);
        methods.subloop_register_instance_method(GOOGLE_CLIENT_INTERACTION, GET_IO_ERROR_FLAG, GOOGLE_CLIENT_INTERACTION_GET_IO_ERROR_FLAG_METHOD);
        methods.methods_incorporate_instance_method(BUILD_ANSWER, GOOGLE_CLIENT_INTERACTION, $list9, $list444, $list445);
        methods.subloop_register_instance_method(GOOGLE_CLIENT_INTERACTION, BUILD_ANSWER, GOOGLE_CLIENT_INTERACTION_BUILD_ANSWER_METHOD);
        methods.methods_incorporate_instance_method(GET_DIRECTIVE, GOOGLE_CLIENT_INTERACTION, $list9, NIL, $list455);
        methods.subloop_register_instance_method(GOOGLE_CLIENT_INTERACTION, GET_DIRECTIVE, GOOGLE_CLIENT_INTERACTION_GET_DIRECTIVE_METHOD);
        methods.methods_incorporate_instance_method(SET_DIRECTIVE_ARG, GOOGLE_CLIENT_INTERACTION, $list9, $list17, $list458);
        methods.subloop_register_instance_method(GOOGLE_CLIENT_INTERACTION, SET_DIRECTIVE_ARG, GOOGLE_CLIENT_INTERACTION_SET_DIRECTIVE_ARG_METHOD);
        methods.methods_incorporate_instance_method(REQUEST_STRING, GOOGLE_CLIENT_INTERACTION, $list9, NIL, $list461);
        methods.subloop_register_instance_method(GOOGLE_CLIENT_INTERACTION, REQUEST_STRING, GOOGLE_CLIENT_INTERACTION_REQUEST_STRING_METHOD);
        methods.methods_incorporate_instance_method(GET_ANSWER, GOOGLE_CLIENT_INTERACTION, $list9, NIL, $list469);
        methods.subloop_register_instance_method(GOOGLE_CLIENT_INTERACTION, GET_ANSWER, GOOGLE_CLIENT_INTERACTION_GET_ANSWER_METHOD);
        methods.methods_incorporate_instance_method(GET_GOOGLE_PASSAGES, GOOGLE_CLIENT_INTERACTION, $list9, NIL, $list474);
        methods.subloop_register_instance_method(GOOGLE_CLIENT_INTERACTION, GET_GOOGLE_PASSAGES, GOOGLE_CLIENT_INTERACTION_GET_GOOGLE_PASSAGES_METHOD);
        classes.subloop_new_class(GOOGLE_PASSAGE_LIST, BASIC_LIST, $list483, NIL, NIL);
        classes.class_set_implements_slot_listeners(GOOGLE_PASSAGE_LIST, NIL);
        classes.subloop_note_class_initialization_function(GOOGLE_PASSAGE_LIST, SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_LIST_CLASS);
        classes.subloop_note_instance_initialization_function(GOOGLE_PASSAGE_LIST, SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_LIST_INSTANCE);
        subloop_reserved_initialize_google_passage_list_class(GOOGLE_PASSAGE_LIST);
        methods.methods_incorporate_instance_method(ACCEPTABLE_P, GOOGLE_PASSAGE_LIST, $list9, $list490, $list491);
        methods.subloop_register_instance_method(GOOGLE_PASSAGE_LIST, ACCEPTABLE_P, GOOGLE_PASSAGE_LIST_ACCEPTABLE_P_METHOD);
        methods.methods_incorporate_instance_method(ADD, GOOGLE_PASSAGE_LIST, $list9, $list490, $list495);
        methods.subloop_register_instance_method(GOOGLE_PASSAGE_LIST, ADD, GOOGLE_PASSAGE_LIST_ADD_METHOD);
        classes.subloop_new_class(GOOGLE_PASSAGE, CORPUS_PASSAGE, NIL, NIL, $list498);
        classes.class_set_implements_slot_listeners(GOOGLE_PASSAGE, NIL);
        classes.subloop_note_class_initialization_function(GOOGLE_PASSAGE, SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(GOOGLE_PASSAGE, SUBLOOP_RESERVED_INITIALIZE_GOOGLE_PASSAGE_INSTANCE);
        subloop_reserved_initialize_google_passage_class(GOOGLE_PASSAGE);
        methods.methods_incorporate_instance_method(GET_SOURCE, GOOGLE_PASSAGE, $list9, NIL, $list509);
        methods.subloop_register_instance_method(GOOGLE_PASSAGE, GET_SOURCE, GOOGLE_PASSAGE_GET_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(GET_SCORE, GOOGLE_PASSAGE, $list9, NIL, $list512);
        methods.subloop_register_instance_method(GOOGLE_PASSAGE, GET_SCORE, GOOGLE_PASSAGE_GET_SCORE_METHOD);
        methods.methods_incorporate_instance_method(IS_COMPLETE, GOOGLE_PASSAGE, $list9, NIL, $list515);
        methods.subloop_register_instance_method(GOOGLE_PASSAGE, IS_COMPLETE, GOOGLE_PASSAGE_IS_COMPLETE_METHOD);
        methods.methods_incorporate_instance_method(GET_OFFSET_IN_FULL_TEXT, GOOGLE_PASSAGE, $list9, NIL, $list519);
        methods.subloop_register_instance_method(GOOGLE_PASSAGE, GET_OFFSET_IN_FULL_TEXT, GOOGLE_PASSAGE_GET_OFFSET_IN_FULL_TEXT_METHOD);
        methods.methods_incorporate_instance_method(GET_OFFSET_IN_SNIPPET, GOOGLE_PASSAGE, $list9, NIL, $list523);
        methods.subloop_register_instance_method(GOOGLE_PASSAGE, GET_OFFSET_IN_SNIPPET, GOOGLE_PASSAGE_GET_OFFSET_IN_SNIPPET_METHOD);
        methods.methods_incorporate_instance_method(GET_URL, GOOGLE_PASSAGE, $list9, NIL, $list527);
        methods.subloop_register_instance_method(GOOGLE_PASSAGE, GET_URL, GOOGLE_PASSAGE_GET_URL_METHOD);
        methods.methods_incorporate_instance_method(GET_TITLE, GOOGLE_PASSAGE, $list9, NIL, $list531);
        methods.subloop_register_instance_method(GOOGLE_PASSAGE, GET_TITLE, GOOGLE_PASSAGE_GET_TITLE_METHOD);
        methods.methods_incorporate_instance_method(GET_CACHED_FILE_ID, GOOGLE_PASSAGE, $list9, NIL, $list535);
        methods.subloop_register_instance_method(GOOGLE_PASSAGE, GET_CACHED_FILE_ID, GOOGLE_PASSAGE_GET_CACHED_FILE_ID_METHOD);
        methods.methods_incorporate_instance_method(GET_FULL_TEXT, GOOGLE_PASSAGE, $list9, NIL, $list538);
        methods.subloop_register_instance_method(GOOGLE_PASSAGE, GET_FULL_TEXT, GOOGLE_PASSAGE_GET_FULL_TEXT_METHOD);
        methods.methods_incorporate_instance_method(GET_SNIPPET, GOOGLE_PASSAGE, $list9, NIL, $list541);
        methods.subloop_register_instance_method(GOOGLE_PASSAGE, GET_SNIPPET, GOOGLE_PASSAGE_GET_SNIPPET_METHOD);
        methods.methods_incorporate_instance_method(GET_RANK, GOOGLE_PASSAGE, $list9, NIL, $list545);
        methods.subloop_register_instance_method(GOOGLE_PASSAGE, GET_RANK, GOOGLE_PASSAGE_GET_RANK_METHOD);
        methods.methods_incorporate_instance_method(GET_TOTAL_FOR_RANK, GOOGLE_PASSAGE, $list9, NIL, $list549);
        methods.subloop_register_instance_method(GOOGLE_PASSAGE, GET_TOTAL_FOR_RANK, GOOGLE_PASSAGE_GET_TOTAL_FOR_RANK_METHOD);
        methods.methods_incorporate_instance_method(GET_RANK_AND_TOTAL, GOOGLE_PASSAGE, $list9, NIL, $list553);
        methods.subloop_register_instance_method(GOOGLE_PASSAGE, GET_RANK_AND_TOTAL, GOOGLE_PASSAGE_GET_RANK_AND_TOTAL_METHOD);
        methods.methods_incorporate_instance_method(PRINT, GOOGLE_PASSAGE, $list9, $list47, $list555);
        methods.subloop_register_instance_method(GOOGLE_PASSAGE, PRINT, GOOGLE_PASSAGE_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_PUBLICATION_DATE, GOOGLE_PASSAGE, $list9, NIL, $list38);
        methods.subloop_register_instance_method(GOOGLE_PASSAGE, GET_PUBLICATION_DATE, GOOGLE_PASSAGE_GET_PUBLICATION_DATE_METHOD);
        classes.subloop_new_class(LUCENE_QUERY, CORPUS_QUERY, NIL, NIL, $list560);
        classes.class_set_implements_slot_listeners(LUCENE_QUERY, NIL);
        classes.subloop_note_class_initialization_function(LUCENE_QUERY, SUBLOOP_RESERVED_INITIALIZE_LUCENE_QUERY_CLASS);
        classes.subloop_note_instance_initialization_function(LUCENE_QUERY, SUBLOOP_RESERVED_INITIALIZE_LUCENE_QUERY_INSTANCE);
        subloop_reserved_initialize_lucene_query_class(LUCENE_QUERY);
        methods.methods_incorporate_instance_method(GET, LUCENE_QUERY, $list157, NIL, $list563);
        methods.subloop_register_instance_method(LUCENE_QUERY, GET, LUCENE_QUERY_GET_METHOD);
        classes.subloop_new_class(LUCENE_CLIENT, TCP_CLIENT, NIL, NIL, $list567);
        classes.class_set_implements_slot_listeners(LUCENE_CLIENT, NIL);
        classes.subloop_note_class_initialization_function(LUCENE_CLIENT, SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_CLASS);
        classes.subloop_note_instance_initialization_function(LUCENE_CLIENT, SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_INSTANCE);
        subloop_reserved_initialize_lucene_client_class(LUCENE_CLIENT);
        methods.methods_incorporate_instance_method(INITIALIZE, LUCENE_CLIENT, $list46, NIL, $list330);
        methods.subloop_register_instance_method(LUCENE_CLIENT, INITIALIZE, LUCENE_CLIENT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SEARCH, LUCENE_CLIENT, $list9, $list571, $list572);
        methods.subloop_register_instance_method(LUCENE_CLIENT, SEARCH, LUCENE_CLIENT_SEARCH_METHOD);
        methods.methods_incorporate_instance_method(COUNT, LUCENE_CLIENT, $list9, $list345, $list575);
        methods.subloop_register_instance_method(LUCENE_CLIENT, COUNT, LUCENE_CLIENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(LUCENE_REQUEST, LUCENE_CLIENT, $list360, $list577, $list578);
        methods.subloop_register_instance_method(LUCENE_CLIENT, LUCENE_REQUEST, LUCENE_CLIENT_LUCENE_REQUEST_METHOD);
        classes.subloop_new_class(LUCENE_CLIENT_INTERACTION, OBJECT, NIL, NIL, $list581);
        classes.class_set_implements_slot_listeners(LUCENE_CLIENT_INTERACTION, NIL);
        classes.subloop_note_class_initialization_function(LUCENE_CLIENT_INTERACTION, SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_INTERACTION_CLASS);
        classes.subloop_note_instance_initialization_function(LUCENE_CLIENT_INTERACTION, SUBLOOP_RESERVED_INITIALIZE_LUCENE_CLIENT_INTERACTION_INSTANCE);
        subloop_reserved_initialize_lucene_client_interaction_class(LUCENE_CLIENT_INTERACTION);
        methods.methods_incorporate_instance_method(INITIALIZE, LUCENE_CLIENT_INTERACTION, $list46, NIL, $list588);
        methods.subloop_register_instance_method(LUCENE_CLIENT_INTERACTION, INITIALIZE, LUCENE_CLIENT_INTERACTION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_DIRECTIVE, LUCENE_CLIENT_INTERACTION, $list9, $list17, $list431);
        methods.subloop_register_instance_method(LUCENE_CLIENT_INTERACTION, SET_DIRECTIVE, LUCENE_CLIENT_INTERACTION_SET_DIRECTIVE_METHOD);
        methods.methods_incorporate_instance_method(BUILD_ANSWER, LUCENE_CLIENT_INTERACTION, $list9, $list444, $list594);
        methods.subloop_register_instance_method(LUCENE_CLIENT_INTERACTION, BUILD_ANSWER, LUCENE_CLIENT_INTERACTION_BUILD_ANSWER_METHOD);
        methods.methods_incorporate_instance_method(GET_DIRECTIVE, LUCENE_CLIENT_INTERACTION, $list9, NIL, $list455);
        methods.subloop_register_instance_method(LUCENE_CLIENT_INTERACTION, GET_DIRECTIVE, LUCENE_CLIENT_INTERACTION_GET_DIRECTIVE_METHOD);
        methods.methods_incorporate_instance_method(SET_DIRECTIVE_ARG, LUCENE_CLIENT_INTERACTION, $list9, $list17, $list458);
        methods.subloop_register_instance_method(LUCENE_CLIENT_INTERACTION, SET_DIRECTIVE_ARG, LUCENE_CLIENT_INTERACTION_SET_DIRECTIVE_ARG_METHOD);
        methods.methods_incorporate_instance_method(SET_DOCNO, LUCENE_CLIENT_INTERACTION, $list9, $list17, $list434);
        methods.subloop_register_instance_method(LUCENE_CLIENT_INTERACTION, SET_DOCNO, LUCENE_CLIENT_INTERACTION_SET_DOCNO_METHOD);
        methods.methods_incorporate_instance_method(REQUEST_STRING, LUCENE_CLIENT_INTERACTION, $list9, NIL, $list605);
        methods.subloop_register_instance_method(LUCENE_CLIENT_INTERACTION, REQUEST_STRING, LUCENE_CLIENT_INTERACTION_REQUEST_STRING_METHOD);
        methods.methods_incorporate_instance_method(GET_ANSWER, LUCENE_CLIENT_INTERACTION, $list9, NIL, $list608);
        methods.subloop_register_instance_method(LUCENE_CLIENT_INTERACTION, GET_ANSWER, LUCENE_CLIENT_INTERACTION_GET_ANSWER_METHOD);
        methods.methods_incorporate_instance_method(GET_LUCENE_PASSAGES, LUCENE_CLIENT_INTERACTION, $list9, NIL, $list612);
        methods.subloop_register_instance_method(LUCENE_CLIENT_INTERACTION, GET_LUCENE_PASSAGES, LUCENE_CLIENT_INTERACTION_GET_LUCENE_PASSAGES_METHOD);
        classes.subloop_new_class(LUCENE_PASSAGE_LIST, BASIC_LIST, $list483, NIL, NIL);
        classes.class_set_implements_slot_listeners(LUCENE_PASSAGE_LIST, NIL);
        classes.subloop_note_class_initialization_function(LUCENE_PASSAGE_LIST, SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_LIST_CLASS);
        classes.subloop_note_instance_initialization_function(LUCENE_PASSAGE_LIST, SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_LIST_INSTANCE);
        subloop_reserved_initialize_lucene_passage_list_class(LUCENE_PASSAGE_LIST);
        methods.methods_incorporate_instance_method(ACCEPTABLE_P, LUCENE_PASSAGE_LIST, $list9, $list490, $list617);
        methods.subloop_register_instance_method(LUCENE_PASSAGE_LIST, ACCEPTABLE_P, LUCENE_PASSAGE_LIST_ACCEPTABLE_P_METHOD);
        methods.methods_incorporate_instance_method(ADD, LUCENE_PASSAGE_LIST, $list9, $list490, $list620);
        methods.subloop_register_instance_method(LUCENE_PASSAGE_LIST, ADD, LUCENE_PASSAGE_LIST_ADD_METHOD);
        classes.subloop_new_class(LUCENE_PASSAGE, CORPUS_PASSAGE, NIL, NIL, $list623);
        classes.class_set_implements_slot_listeners(LUCENE_PASSAGE, NIL);
        classes.subloop_note_class_initialization_function(LUCENE_PASSAGE, SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_CLASS);
        classes.subloop_note_instance_initialization_function(LUCENE_PASSAGE, SUBLOOP_RESERVED_INITIALIZE_LUCENE_PASSAGE_INSTANCE);
        subloop_reserved_initialize_lucene_passage_class(LUCENE_PASSAGE);
        methods.methods_incorporate_instance_method(GET_SOURCE, LUCENE_PASSAGE, $list9, NIL, $list627);
        methods.subloop_register_instance_method(LUCENE_PASSAGE, GET_SOURCE, LUCENE_PASSAGE_GET_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(GET_SCORE, LUCENE_PASSAGE, $list9, NIL, $list630);
        methods.subloop_register_instance_method(LUCENE_PASSAGE, GET_SCORE, LUCENE_PASSAGE_GET_SCORE_METHOD);
        methods.methods_incorporate_instance_method(IS_COMPLETE, LUCENE_PASSAGE, $list9, NIL, $list633);
        methods.subloop_register_instance_method(LUCENE_PASSAGE, IS_COMPLETE, LUCENE_PASSAGE_IS_COMPLETE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, LUCENE_PASSAGE, $list9, $list47, $list636);
        methods.subloop_register_instance_method(LUCENE_PASSAGE, PRINT, LUCENE_PASSAGE_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_PUBLICATION_DATE, LUCENE_PASSAGE, $list9, NIL, $list38);
        methods.subloop_register_instance_method(LUCENE_PASSAGE, GET_PUBLICATION_DATE, LUCENE_PASSAGE_GET_PUBLICATION_DATE_METHOD);
        classes.subloop_new_class(CYCL_QUERY, KNOWLEDGE_SOURCE_QUERY, NIL, NIL, $list641);
        classes.class_set_implements_slot_listeners(CYCL_QUERY, NIL);
        classes.subloop_note_class_initialization_function(CYCL_QUERY, SUBLOOP_RESERVED_INITIALIZE_CYCL_QUERY_CLASS);
        classes.subloop_note_instance_initialization_function(CYCL_QUERY, SUBLOOP_RESERVED_INITIALIZE_CYCL_QUERY_INSTANCE);
        subloop_reserved_initialize_cycl_query_class(CYCL_QUERY);
        methods.methods_incorporate_instance_method(GET, CYCL_QUERY, $list157, NIL, $list650);
        methods.subloop_register_instance_method(CYCL_QUERY, GET, CYCL_QUERY_GET_METHOD);
        methods.methods_incorporate_instance_method(GET_FROM_KB, CYCL_QUERY, $list157, $list656, $list657);
        methods.subloop_register_instance_method(CYCL_QUERY, GET_FROM_KB, CYCL_QUERY_GET_FROM_KB_METHOD);
        methods.methods_incorporate_instance_method(GET_FROM_CORPUS, CYCL_QUERY, $list157, $list660, $list661);
        methods.subloop_register_instance_method(CYCL_QUERY, GET_FROM_CORPUS, CYCL_QUERY_GET_FROM_CORPUS_METHOD);
        methods.methods_incorporate_instance_method(GENERATE_ASSIGNMENTS, CYCL_QUERY, $list157, $list665, $list666);
        methods.subloop_register_instance_method(CYCL_QUERY, GENERATE_ASSIGNMENTS, CYCL_QUERY_GENERATE_ASSIGNMENTS_METHOD);
        classes.subloop_new_class(VAR_ASSIGNMENT, INFORMATION, NIL, NIL, $list677);
        classes.class_set_implements_slot_listeners(VAR_ASSIGNMENT, NIL);
        classes.subloop_note_class_initialization_function(VAR_ASSIGNMENT, SUBLOOP_RESERVED_INITIALIZE_VAR_ASSIGNMENT_CLASS);
        classes.subloop_note_instance_initialization_function(VAR_ASSIGNMENT, SUBLOOP_RESERVED_INITIALIZE_VAR_ASSIGNMENT_INSTANCE);
        subloop_reserved_initialize_var_assignment_class(VAR_ASSIGNMENT);
        methods.methods_incorporate_instance_method(PRINT, VAR_ASSIGNMENT, $list9, $list47, $list683);
        methods.subloop_register_instance_method(VAR_ASSIGNMENT, PRINT, VAR_ASSIGNMENT_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENT, VAR_ASSIGNMENT, $list9, NIL, $list687);
        methods.subloop_register_instance_method(VAR_ASSIGNMENT, GET_CONTENT, VAR_ASSIGNMENT_GET_CONTENT_METHOD);
        methods.methods_incorporate_instance_method(GET_SOURCE, VAR_ASSIGNMENT, $list9, NIL, $list690);
        methods.subloop_register_instance_method(VAR_ASSIGNMENT, GET_SOURCE, VAR_ASSIGNMENT_GET_SOURCE_METHOD);
        classes.subloop_new_class(WORDNET_QUERY, KNOWLEDGE_SOURCE_QUERY, NIL, NIL, $list694);
        classes.class_set_implements_slot_listeners(WORDNET_QUERY, NIL);
        classes.subloop_note_class_initialization_function(WORDNET_QUERY, SUBLOOP_RESERVED_INITIALIZE_WORDNET_QUERY_CLASS);
        classes.subloop_note_instance_initialization_function(WORDNET_QUERY, SUBLOOP_RESERVED_INITIALIZE_WORDNET_QUERY_INSTANCE);
        subloop_reserved_initialize_wordnet_query_class(WORDNET_QUERY);
        methods.methods_incorporate_instance_method(GET, WORDNET_QUERY, $list46, NIL, $list700);
        methods.subloop_register_instance_method(WORDNET_QUERY, GET, WORDNET_QUERY_GET_METHOD);
        classes.subloop_new_class(WORDNET_GLOSS, INFORMATION, NIL, NIL, $list706);
        classes.class_set_implements_slot_listeners(WORDNET_GLOSS, NIL);
        classes.subloop_note_class_initialization_function(WORDNET_GLOSS, SUBLOOP_RESERVED_INITIALIZE_WORDNET_GLOSS_CLASS);
        classes.subloop_note_instance_initialization_function(WORDNET_GLOSS, SUBLOOP_RESERVED_INITIALIZE_WORDNET_GLOSS_INSTANCE);
        subloop_reserved_initialize_wordnet_gloss_class(WORDNET_GLOSS);
        methods.methods_incorporate_instance_method(GET_CONTENT, WORDNET_GLOSS, $list9, NIL, $list709);
        methods.subloop_register_instance_method(WORDNET_GLOSS, GET_CONTENT, WORDNET_GLOSS_GET_CONTENT_METHOD);
        methods.methods_incorporate_instance_method(GET_SOURCE, WORDNET_GLOSS, $list9, NIL, $list712);
        methods.subloop_register_instance_method(WORDNET_GLOSS, GET_SOURCE, WORDNET_GLOSS_GET_SOURCE_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_search_engine_file();
    }

    @Override
    public void initializeVariables() {
        init_search_engine_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_search_engine_file();
    }

    
}

/**
 * Total time: 4336 ms synthetic
 */
