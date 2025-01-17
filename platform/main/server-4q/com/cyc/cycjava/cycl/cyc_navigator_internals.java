package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_assertion_el_formula_cache$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.cb_back_button;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.declare_cb_tool;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$cb_major_presentation_language$;
import static com.cyc.cycjava.cycl.control_vars.$use_transcriptP$;
import static com.cyc.cycjava.cycl.control_vars.cyc_image_id;
import static com.cyc.cycjava.cycl.control_vars.set_cyc_image_id;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_br;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_checkbox_input;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input;
import static com.cyc.cycjava.cycl.html_utilities.html_filename_input;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_radio_input;
import static com.cyc.cycjava.cycl.html_utilities.html_reset_input;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_submit_input;
import static com.cyc.cycjava.cycl.html_utilities.html_text_input;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equalp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.ceiling;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.vectorp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.adjoin;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
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


public final class cyc_navigator_internals extends SubLTranslatedFile {
    public static final SubLFile me = new cyc_navigator_internals();

    public static final String myName = "com.cyc.cycjava.cycl.cyc_navigator_internals";

    public static final String myFingerPrint = "e0833408bf582f1f82bdba5f7a6f9913c0f3965598e7b1d08bf520b8593c7e2d";

    // defparameter
    public static final SubLSymbol $navigator_links_sorted$ = makeSymbol("*NAVIGATOR-LINKS-SORTED*");











    // deflexical
    /**
     * The default length of the vectors used to define navigator links. Each
     * separate link is defined in one vector. The vectors are stored in a hash
     * table.
     */
    public static final SubLSymbol $navigator_vector_length$ = makeSymbol("*NAVIGATOR-VECTOR-LENGTH*");





    // deflexical
    /**
     * A list of keywords. Each keyword designates a kind of navigator link. The two
     * current types are :text and :image.
     */
    public static final SubLSymbol $navigator_link_types$ = makeSymbol("*NAVIGATOR-LINK-TYPES*");

    // deflexical
    /**
     * The various categories into which Cyc Navigator links are organized. A link
     * may belong to more than one category.
     */
    public static final SubLSymbol $navigator_link_categories$ = makeSymbol("*NAVIGATOR-LINK-CATEGORIES*");



    // defparameter
    /**
     * A table (a-list) of methods for producing properly-formatted URLs (href
     * strings)
     */
    public static final SubLSymbol $nav_link_method_table$ = makeSymbol("*NAV-LINK-METHOD-TABLE*");

    // Internal Constants
    public static final SubLSymbol $navigator_columns$ = makeSymbol("*NAVIGATOR-COLUMNS*");

    public static final SubLSymbol $navigator_column_padding$ = makeSymbol("*NAVIGATOR-COLUMN-PADDING*");

    public static final SubLSymbol $columnize_by_category$ = makeSymbol("*COLUMNIZE-BY-CATEGORY*");

    public static final SubLString $$$single = makeString("single");

    public static final SubLSymbol $navigator_line_spacing$ = makeSymbol("*NAVIGATOR-LINE-SPACING*");

    public static final SubLSymbol $navigator_table_border$ = makeSymbol("*NAVIGATOR-TABLE-BORDER*");

    public static final SubLSymbol $navigator_link_definition_table$ = makeSymbol("*NAVIGATOR-LINK-DEFINITION-TABLE*");



    public static final SubLSymbol $navigator_link_category_table$ = makeSymbol("*NAVIGATOR-LINK-CATEGORY-TABLE*");

    private static final SubLInteger $int$50 = makeInteger(50);

    public static final SubLList $list10 = list(makeKeyword("TEXT"), makeKeyword("IMAGE"));

    public static final SubLList $list11 = list(new SubLObject[]{ list(makeKeyword("BROWSING-AND-EDITING"), makeString("Browsing and Editing"), T), list(makeKeyword("COMMUNICATION-MODES"), makeString("Communication Modes"), T), list(makeKeyword("CYC-MAIN-MENU"), makeString("Cyc Main Menu"), T), list(makeKeyword("CYC-SYSTEM"), makeString("Cyc System"), T), list(makeKeyword("FILE-HANDLING"), makeString("File Handling"), T), list(makeKeyword("INFERENCE"), makeString("Inference"), T), list(makeKeyword("NL-TOOLS"), makeString("NL Tools"), T), list(makeKeyword("INFO-RETRIEVAL")), list(makeKeyword("HIERARCHY-BROWSER")), list(makeKeyword("TELL-ASK")), list(makeKeyword("OTHER")) });

    public static final SubLList $list12 = list(new SubLObject[]{ cons(makeKeyword("LINK-TYPE"), ZERO_INTEGER), cons(makeKeyword("CATEGORIES"), ONE_INTEGER), cons(makeKeyword("HREF-BASE-STRING"), TWO_INTEGER), cons(makeKeyword("NUMBER-OF-ARGS"), THREE_INTEGER), cons(makeKeyword("HREF-TAGS"), FOUR_INTEGER), cons(makeKeyword("TARGET"), FIVE_INTEGER), cons(makeKeyword("LINK-TEXT"), SIX_INTEGER), cons(makeKeyword("IMAGE-SRC"), SEVEN_INTEGER), cons(makeKeyword("ISMAP"), EIGHT_INTEGER), cons(makeKeyword("ALT"), NINE_INTEGER), cons(makeKeyword("ALIGN"), TEN_INTEGER), cons(makeKeyword("BORDER"), ELEVEN_INTEGER) });





    public static final SubLString $str15$No_vector_in__s_for_the_link_key_ = makeString("No vector in ~s for the link key ~s");

    public static final SubLString $str16$No_index_in__s_for_the_definition = makeString("No index in ~s for the definition key ~s");

    public static final SubLSymbol $navigator_link_definition_keys$ = makeSymbol("*NAVIGATOR-LINK-DEFINITION-KEYS*");













    public static final SubLString $str24$_s_is_not_a_supported_method_for_ = makeString("~s is not a supported method for ~s");

    public static final SubLSymbol SET_LINK_VALUE = makeSymbol("SET-LINK-VALUE");

    public static final SubLString $str26$_s = makeString("~s");

    public static final SubLString $str27$___a_a____s = makeString("~%~a~a . ~s");

    public static final SubLString $str28$in_def_navigator_link_for__s___s_ = makeString("in def-navigator-link for ~s: ~s must be one of these, ~s, but is this: ~s");

    public static final SubLSymbol LINK_TYPE = makeSymbol("LINK-TYPE");

    public static final SubLString $str30$in_def_navigator_link_for__s___s_ = makeString("in def-navigator-link for ~s: ~s must include one of these, and may include only these: ~s");



    public static final SubLString $str32$in_def_navigator_link_for__s___s_ = makeString("in def-navigator-link for ~s: ~s must be an integer, but is ~s");

    public static final SubLSymbol NUMBER_OF_ARGS = makeSymbol("NUMBER-OF-ARGS");

    public static final SubLString $str34$in_def_navigator_link_for__s___s_ = makeString("in def-navigator-link for ~s: ~s must be a specified, and should be form which evaluates to a string, but is ~s");

    public static final SubLSymbol HREF_BASE_STRING = makeSymbol("HREF-BASE-STRING");





    private static final SubLSymbol $HREF_BASE_STRING = makeKeyword("HREF-BASE-STRING");

    private static final SubLSymbol $NUMBER_OF_ARGS = makeKeyword("NUMBER-OF-ARGS");

















    public static final SubLList $list48 = list(makeKeyword("LINK-TEXT"), makeKeyword("ALT"), makeKeyword("HREF-BASE-STRING"));

    public static final SubLString $$$1 = makeString("1");

    public static final SubLString $$$_ = makeString(" ");

    public static final SubLSymbol $sym51$STRING_ = makeSymbol("STRING<");

    public static final SubLSymbol NAVIGATOR_CATEGORIES_SORT_KEY = makeSymbol("NAVIGATOR-CATEGORIES-SORT-KEY");

    public static final SubLSymbol LINK_SORT_KEY = makeSymbol("LINK-SORT-KEY");

    public static final SubLList $list54 = list(cons(makeKeyword("SPLICE-IN-CGI-PROGRAM"), makeSymbol("SPLICE-IN-CGI-PROGRAM")), cons(makeKeyword("STRING-IS-RELATIVE-URL"), makeSymbol("STRING-IS-RELATIVE-URL")), cons(makeKeyword("HREF-IS-BASE-STRING"), makeSymbol("HREF-IS-BASE-STRING")));

    public static final SubLString $str55$No_link_text_found_for__s_in_call = makeString("No link text found for ~s in call to ~s");

    public static final SubLSymbol NAV_LINK_FOR_TEXT = makeSymbol("NAV-LINK-FOR-TEXT");







    public static final SubLString $str60$Error___a_must_be_one_of__s__but_ = makeString("Error: ~a must be one of ~s, but is not.");

    public static final SubLString $$$Malformed_Navigator_Link = makeString("Malformed Navigator Link");

    public static final SubLString $str62$The_navigator_link__s_is_malforme = makeString("The navigator link ~s is malformed.");

    public static final SubLSymbol NAV_MALFORMED_LINK = makeSymbol("NAV-MALFORMED-LINK");



    private static final SubLString $str65$ = makeString("");

    private static final SubLString $str66$_a_nav_malformed_link__s = makeString("~a?nav-malformed-link&~s");



    private static final SubLString $str68$_a__a = makeString("~a?~a");

    private static final SubLString $$$cg = makeString("cg");

    private static final SubLList $list70 = list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER);

    private static final SubLString $$$left = makeString("left");

    private static final SubLString $$$top = makeString("top");

    private static final SubLString $$$double = makeString("double");

    private static final SubLString $str74$Untitled_Category_ = makeString("Untitled Category!");

    private static final SubLSymbol $sym75$VALID_NAVIGATOR_LINK_ = makeSymbol("VALID-NAVIGATOR-LINK?");

    private static final SubLSymbol COLUMNIZE_BY_LINKS = makeSymbol("COLUMNIZE-BY-LINKS");

    private static final SubLSymbol COLUMNIZE_BY_CATEGORIES = makeSymbol("COLUMNIZE-BY-CATEGORIES");



    private static final SubLSymbol $sym79$CATEGORY_HAS_LINKS_ = makeSymbol("CATEGORY-HAS-LINKS?");

    private static final SubLString $$$Cyc_Navigator = makeString("Cyc Navigator");

    private static final SubLString $str81$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str82$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");



    private static final SubLString $str87$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");



    private static final SubLString $$$Back = makeString("Back");

    private static final SubLString $str94$There_are_no_Cyc_Navigator_links_ = makeString("There are no Cyc Navigator links to display.");

    private static final SubLString $$$Go_Back = makeString("Go Back");

    private static final SubLSymbol CYC_NAVIGATOR = makeSymbol("CYC-NAVIGATOR");

    private static final SubLString $$$right = makeString("right");

    private static final SubLString $str98$Number_of_columns__ = makeString("Number of columns: ");

    private static final SubLString $str99$column_number = makeString("column-number");

    private static final SubLString $str100$Width_between_columns__ = makeString("Width between columns: ");

    private static final SubLString $str101$column_padding = makeString("column-padding");

    private static final SubLString $str102$Link_category_arrangement__ = makeString("Link category arrangement: ");

    private static final SubLString $str103$columnize_by_category = makeString("columnize-by-category");

    private static final SubLString $$$yes = makeString("yes");

    private static final SubLString $$$_one_column_per_category = makeString(" one column per category");

    private static final SubLString $$$no = makeString("no");

    private static final SubLString $$$_multiple_columns_per_category = makeString(" multiple columns per category");

    private static final SubLString $str108$Line_spacing__ = makeString("Line spacing: ");

    private static final SubLString $str109$line_spacing = makeString("line-spacing");

    private static final SubLList $list110 = list(makeString("single"), makeString("double"));

    private static final SubLSymbol FORMAT_NAVIGATOR_PREFERENCES = makeSymbol("FORMAT-NAVIGATOR-PREFERENCES");

    private static final SubLString $$$Cyc_Navigator_Preferences = makeString("Cyc Navigator Preferences");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str114$handle_navigator_preferences = makeString("handle-navigator-preferences");

    private static final SubLString $$$middle = makeString("middle");

    private static final SubLString $$$Current_Values = makeString("Current Values");

    private static final SubLString $$$Update = makeString("Update");

    private static final SubLSymbol SET_NAVIGATOR_PREFERENCES = makeSymbol("SET-NAVIGATOR-PREFERENCES");

    private static final SubLInteger $int$200 = makeInteger(200);

    private static final SubLSymbol HANDLE_NAVIGATOR_PREFERENCES = makeSymbol("HANDLE-NAVIGATOR-PREFERENCES");

    private static final SubLObject $$Guest = reader_make_constant_shell(makeString("Guest"));

    private static final SubLString $$$Please_Login_Now = makeString("Please Login Now");

    private static final SubLSymbol GUEST_WARN = makeSymbol("GUEST-WARN");

    private static final SubLString $str124$Sorry___a_cannot_be_used_by_peopl = makeString("Sorry, ~a cannot be used by people logged in as ");

    private static final SubLString $$$this_facility = makeString("this facility");

    private static final SubLString $str126$___Failure_to_login_using_your_un = makeString(".  Failure to login using your unique name might cause your actions to interfere with those of other users.  Please ");



    private static final SubLString $$$login = makeString("login");

    private static final SubLString $str129$_using_your_real_name_now_ = makeString(" using your real name now.");

    private static final SubLString $str130$Sorry___a_cannot_be_used_by_peopl = makeString("Sorry, ~a cannot be used by people logged in as ~S");

    private static final SubLString $str131$___Failure_to_login_using_your_un = makeString(".  Failure to login using your unique name might cause your actions to interfere with those of other users.  Please login using your real name now.");

    private static final SubLSymbol STRING_CAPITALIZE = makeSymbol("STRING-CAPITALIZE");

    private static final SubLString $$$Load_Transcript = makeString("Load Transcript");



    private static final SubLString $str135$cb_load_transcript = makeString("cb-load-transcript");



    private static final SubLSymbol CB_LINK_LOAD_TRANSCRIPT = makeSymbol("CB-LINK-LOAD-TRANSCRIPT");

    private static final SubLString $$$Transcript_Load = makeString("Transcript Load");

    private static final SubLString $$$TLoad = makeString("TLoad");

    private static final SubLString $$$Load_transcript_file = makeString("Load transcript file");

    private static final SubLSymbol HTML_LOAD_TRANSCRIPT = makeSymbol("HTML-LOAD-TRANSCRIPT");

    private static final SubLString $$$the_Load_Transcript_File_page = makeString("the Load Transcript File page");

    private static final SubLString $$$Load_Transcript_File = makeString("Load Transcript File");

    private static final SubLString $str144$handle_load_transcript = makeString("handle-load-transcript");

    private static final SubLString $$$center = makeString("center");

    private static final SubLString $str146$Pathname_ = makeString("Pathname:");

    private static final SubLString $str147$load_file = makeString("load_file");

    private static final SubLInteger $int$40 = makeInteger(40);

    private static final SubLString $$$Clear = makeString("Clear");

    private static final SubLString $$$Load = makeString("Load");

    private static final SubLString $str151$Destination_queue__ = makeString("Destination queue: ");

    private static final SubLString $$$queue = makeString("queue");

    private static final SubLString $str153$_aux = makeString(":aux");

    private static final SubLString $str154$__AUXILIARY = makeString(" :AUXILIARY");

    private static final SubLString $str155$_local = makeString(":local");

    private static final SubLString $str156$__LOCAL = makeString(" :LOCAL");

    private static final SubLString $str157$_none = makeString(":none");

    private static final SubLString $str158$__NONE = makeString(" :NONE");

    private static final SubLString $$$transcript = makeString("transcript");

    private static final SubLString $str160$_Transcript_unenqueued___NONE__op = makeString(" Transcript unenqueued (:NONE) operations");

    private static final SubLString $str161$READ_THIS_BEFORE_LOADING_A_TRANSC = makeString("READ THIS BEFORE LOADING A TRANSCRIPT FILE: ");

    private static final SubLString $str162$The_possible_values_for_the_desti = makeString("The possible values for the destination queue -- the place newly-loaded transcript operations are to be put for processing -- are :AUXILIARY, :LOCAL, and :NONE.  If you choose :AUXILIARY (the default), newly-loaded operations will be put in the *auxiliary-queue* and processed.  They will not be put in a (new) transcript file after they are processed.  If you choose :LOCAL, newly-loaded operations will be put in the *local-queue* and processed.  They will be put on the *transcript-queue* after they are processed, and will be saved in a new transcript file if you are in a communication mode which allows this.  If you choose :NONE, operations will simply be unencapsulated and evaluated in your local Cyc image.  They will not be put in any queue.  If you choose :NONE, and you want to have the newly-loaded operations saved in a new trancsript file, select the option \"Transcript unenqueued (:NONE) operations\".");

    private static final SubLString $str163$Loading_a_transcript_file_may_hav = makeString("Loading a transcript file may have unintended consequences if you do not understand what you are doing.  Please ask an experienced Cyclist for advice if you still do not understand what the choices above mean.");

    private static final SubLSymbol CB_LOAD_TRANSCRIPT = makeSymbol("CB-LOAD-TRANSCRIPT");

    private static final SubLString $$$Transcript_File_Loaded = makeString("Transcript File Loaded");

    private static final SubLString $str166$The_file__s_containing__s_operati = makeString("The file ~s containing ~s operations was successfully loaded into the Cyc image ~a.");

    private static final SubLString $$$Transcript_File_Problem = makeString("Transcript File Problem");

    private static final SubLString $str168$The_file__s_exists__but_no_operat = makeString("The file ~s exists, but no operations were loaded into the Cyc image ~a.");

    private static final SubLString $$$File_Not_Available = makeString("File Not Available");

    private static final SubLString $str170$The_file__s_cannot_be_accessed___ = makeString("The file ~s cannot be accessed.  Make sure that the file exists, or check to see if there is a file access permission problem.");

    private static final SubLSymbol HANDLE_LOAD_TRANSCRIPT = makeSymbol("HANDLE-LOAD-TRANSCRIPT");

    private static final SubLString $$$The_file_ = makeString("The file ");

    private static final SubLString $str173$_does_not_exist__or_cannot_be_acc = makeString(" does not exist, or cannot be accessed.  Make sure that the file exists, or check to see if there is a file access permission problem.");

    private static final SubLSymbol REPORT_FILE_NOT_AVAILABLE = makeSymbol("REPORT-FILE-NOT-AVAILABLE");





    private static final SubLSymbol MAYBE_USE_ENGLISH = makeSymbol("MAYBE-USE-ENGLISH");

    private static final SubLString $$$Show_Assertions_in_English = makeString("Show Assertions in English");

    private static final SubLString $$$Show_Assertions_in_CycL = makeString("Show Assertions in CycL");

    private static final SubLSymbol CLEAR_PG_CACHES = makeSymbol("CLEAR-PG-CACHES");

    private static final SubLSymbol CYC_NAV_CLEAR_EL_FORMULAS_CACHE = makeSymbol("CYC-NAV-CLEAR-EL-FORMULAS-CACHE");

    private static final SubLSymbol HTML_START_AGENDA = makeSymbol("HTML-START-AGENDA");

    private static final SubLSymbol HTML_HALT_AGENDA = makeSymbol("HTML-HALT-AGENDA");

    private static final SubLSymbol HTML_RESTART_AGENDA = makeSymbol("HTML-RESTART-AGENDA");

    public static SubLObject make_new_link_vector(SubLObject length) {
        if (length == UNPROVIDED) {
            length = $navigator_vector_length$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!length.isInteger()) {
            length = length($navigator_link_definition_keys$.getDynamicValue(thread));
        }
        return make_vector(length, NIL);
    }

    public static SubLObject get_link_vector(final SubLObject link_key) {
        return gethash(link_key, $navigator_link_definition_table$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject navigator_link(final SubLObject keyword) {
        return get_link_vector(keyword);
    }

    public static SubLObject navigator_links(SubLObject category_keyword) {
        if (category_keyword == UNPROVIDED) {
            category_keyword = NIL;
        }
        if (NIL != category_keyword) {
            return gethash(category_keyword, $navigator_link_category_table$.getGlobalValue(), UNPROVIDED);
        }
        SubLObject ans = NIL;
        SubLObject key = NIL;
        SubLObject val = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator($navigator_link_definition_table$.getGlobalValue());
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                val = getEntryValue(cdohash_entry);
                if (val.isVector()) {
                    ans = cons(key, ans);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return ans;
    }

    public static SubLObject navigator_link_categories() {
        return Mapping.mapcar(symbol_function(CAR), $navigator_link_categories$.getGlobalValue());
    }

    public static SubLObject navigator_link_categoryP(final SubLObject keyword) {
        return find(keyword, navigator_link_categories(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_link_value(final SubLObject link_key, final SubLObject definition_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject vector = get_link_vector(link_key);
        final SubLObject index = assoc(definition_key, $navigator_link_definition_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
        final SubLObject value = (vector.isVector() && index.isInteger()) ? aref(vector, index) : NIL;
        return value;
    }

    public static SubLObject set_link_value(final SubLObject link_key, final SubLObject definition_key, final SubLObject v_new, SubLObject method, SubLObject test) {
        if (method == UNPROVIDED) {
            method = $REPLACE;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject vector = get_link_vector(link_key);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!vector.isVector())) {
            Errors.error($str15$No_vector_in__s_for_the_link_key_, $navigator_link_definition_table$, link_key);
        }
        final SubLObject index = assoc(definition_key, $navigator_link_definition_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!index.isInteger())) {
            Errors.error($str16$No_index_in__s_for_the_definition, $navigator_link_definition_keys$, definition_key);
        }
        final SubLObject value = aref(vector, index);
        final SubLObject pcase_var = method;
        if (pcase_var.eql($REPLACE)) {
            set_aref(vector, index, v_new);
        } else
            if (pcase_var.eql($CONS)) {
                set_aref(vector, index, cons(v_new, value));
            } else
                if (pcase_var.eql($ADJOIN)) {
                    set_aref(vector, index, adjoin(v_new, value, test, UNPROVIDED));
                } else
                    if (pcase_var.eql($APPEND)) {
                        set_aref(vector, index, append(v_new, value));
                    } else
                        if (pcase_var.eql($NCONC)) {
                            set_aref(vector, index, nconc(v_new, value));
                        } else
                            if (pcase_var.eql($UNION)) {
                                set_aref(vector, index, union(v_new, value, test, UNPROVIDED));
                            } else {
                                if (!pcase_var.eql($INTERSECTION)) {
                                    Errors.error($str24$_s_is_not_a_supported_method_for_, method, SET_LINK_VALUE);
                                    return NIL;
                                }
                                set_aref(vector, index, intersection(v_new, value, test, UNPROVIDED));
                            }





        return aref(vector, index);
    }

    public static SubLObject return_link_definition(final SubLObject link_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject vector = get_link_vector(link_key);
        SubLObject ans = NIL;
        if (vector.isVector()) {
            SubLObject cdolist_list_var = $navigator_link_definition_keys$.getDynamicValue(thread);
            SubLObject pair = NIL;
            pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ans = cons(list(pair.first(), aref(vector, pair.rest())), ans);
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
            } 
        }
        return nreverse(ans);
    }

    public static SubLObject print_link_definition(final SubLObject link_key) {
        final SubLObject result = return_link_definition(link_key);
        SubLObject longest = ZERO_INTEGER;
        SubLObject cdolist_list_var = result;
        SubLObject x = NIL;
        x = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject len1 = length(format(NIL, $str26$_s, x.first()));
            if (len1.numG(longest)) {
                longest = len1;
            }
            cdolist_list_var = cdolist_list_var.rest();
            x = cdolist_list_var.first();
        } 
        cdolist_list_var = result;
        x = NIL;
        x = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject key = format(NIL, $str26$_s, x.first());
            final SubLObject len2 = length(key);
            final SubLObject fill = Strings.make_string(subtract(longest, len2), UNPROVIDED);
            format(T, $str27$___a_a____s, new SubLObject[]{ key, fill, second(x) });
            cdolist_list_var = cdolist_list_var.rest();
            x = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject def_navigator_link(final SubLObject link_key, final SubLObject link_type, final SubLObject categories, final SubLObject href_base_string, final SubLObject number_of_args, SubLObject target, SubLObject link_text, SubLObject href_tags, SubLObject image_src, SubLObject ismap, SubLObject alt, SubLObject align, SubLObject border) {
        if (target == UNPROVIDED) {
            target = html_macros.$html_self_target$.getGlobalValue();
        }
        if (link_text == UNPROVIDED) {
            link_text = NIL;
        }
        if (href_tags == UNPROVIDED) {
            href_tags = NIL;
        }
        if (image_src == UNPROVIDED) {
            image_src = NIL;
        }
        if (ismap == UNPROVIDED) {
            ismap = NIL;
        }
        if (alt == UNPROVIDED) {
            alt = NIL;
        }
        if (align == UNPROVIDED) {
            align = NIL;
        }
        if (border == UNPROVIDED) {
            border = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == find(link_type, $navigator_link_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str28$in_def_navigator_link_for__s___s_, new SubLObject[]{ link_key, LINK_TYPE, $navigator_link_types$.getGlobalValue(), link_type });
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == intersection(categories, navigator_link_categories(), UNPROVIDED, UNPROVIDED))) {
            Errors.error($str30$in_def_navigator_link_for__s___s_, link_key, CATEGORIES, navigator_link_categories());
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == (NIL == href_tags ? integerp(number_of_args) : T))) {
            Errors.error($str32$in_def_navigator_link_for__s___s_, link_key, NUMBER_OF_ARGS, number_of_args);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == href_base_string)) {
            Errors.error($str34$in_def_navigator_link_for__s___s_, link_key, HREF_BASE_STRING, href_base_string);
        }
        final SubLObject vector = get_link_vector(link_key);
        if ((!vector.isVector()) || (!length(vector).numGE(length($navigator_link_definition_keys$.getDynamicValue(thread))))) {
            sethash(link_key, $navigator_link_definition_table$.getGlobalValue(), make_new_link_vector(UNPROVIDED));
        }
        set_link_value(link_key, $LINK_TYPE, link_type, UNPROVIDED, UNPROVIDED);
        set_link_value(link_key, $CATEGORIES, categories, UNPROVIDED, UNPROVIDED);
        set_link_value(link_key, $HREF_BASE_STRING, href_base_string, UNPROVIDED, UNPROVIDED);
        set_link_value(link_key, $NUMBER_OF_ARGS, number_of_args, UNPROVIDED, UNPROVIDED);
        set_link_value(link_key, $TARGET, target, UNPROVIDED, UNPROVIDED);
        set_link_value(link_key, $LINK_TEXT, link_text, UNPROVIDED, UNPROVIDED);
        set_link_value(link_key, $HREF_TAGS, href_tags, UNPROVIDED, UNPROVIDED);
        set_link_value(link_key, $IMAGE_SRC, image_src, UNPROVIDED, UNPROVIDED);
        set_link_value(link_key, $ISMAP, ismap, UNPROVIDED, UNPROVIDED);
        set_link_value(link_key, $ALT, alt, UNPROVIDED, UNPROVIDED);
        set_link_value(link_key, $ALIGN, align, UNPROVIDED, UNPROVIDED);
        set_link_value(link_key, $BORDER, border, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = categories;
        SubLObject category = NIL;
        category = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject value = gethash(category, $navigator_link_category_table$.getGlobalValue(), UNPROVIDED);
            final SubLObject v_new = adjoin(link_key, value, UNPROVIDED, UNPROVIDED);
            sethash(category, $navigator_link_category_table$.getGlobalValue(), v_new);
            cdolist_list_var = cdolist_list_var.rest();
            category = cdolist_list_var.first();
        } 
        $navigator_links_sorted$.setDynamicValue(NIL, thread);
        return get_link_vector(link_key);
    }

    public static SubLObject remove_navigator_link(final SubLObject link_key) {
        final SubLObject value = gethash(link_key, $navigator_link_definition_table$.getGlobalValue(), UNPROVIDED);
        if (NIL != value) {
            SubLObject cdolist_list_var;
            final SubLObject categories = cdolist_list_var = get_link_value(link_key, $CATEGORIES);
            SubLObject c = NIL;
            c = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject keylist = gethash(c, $navigator_link_category_table$.getGlobalValue(), UNPROVIDED);
                sethash(c, $navigator_link_category_table$.getGlobalValue(), remove(link_key, keylist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                cdolist_list_var = cdolist_list_var.rest();
                c = cdolist_list_var.first();
            } 
        }
        sethash(link_key, $navigator_link_definition_table$.getGlobalValue(), NIL);
        return NIL;
    }

    public static SubLObject eval_link_sort_key(final SubLObject v_object) {
        SubLObject ans = NIL;
        ans = (v_object.isSymbol() && (NIL != fboundp(v_object))) ? funcall(v_object) : v_object.isCons() ? eval(v_object) : v_object;
        return ans;
    }

    public static SubLObject link_sort_key(final SubLObject link_keyword) {
        SubLObject sort_key = NIL;
        if (NIL == sort_key) {
            SubLObject csome_list_var;
            SubLObject definition_key;
            for (csome_list_var = $list48, definition_key = NIL, definition_key = csome_list_var.first(); (NIL == sort_key) && (NIL != csome_list_var); sort_key = get_link_value(link_keyword, definition_key) , csome_list_var = csome_list_var.rest() , definition_key = csome_list_var.first()) {
            }
        }
        if (NIL == string_utilities.non_empty_stringP(sort_key)) {
            sort_key = eval_link_sort_key(sort_key);
        }
        if (NIL == string_utilities.non_empty_stringP(sort_key)) {
            sort_key = $$$1;
        }
        return sort_key;
    }

    public static SubLObject navigator_categories_sort_key(final SubLObject form) {
        SubLObject string = second(form);
        if (NIL == string_utilities.non_empty_stringP(string)) {
            string = $$$_;
        }
        return string;
    }

    public static SubLObject sort_navigator_links() {
        $navigator_link_categories$.setGlobalValue(Sort.sort($navigator_link_categories$.getGlobalValue(), symbol_function($sym51$STRING_), symbol_function(NAVIGATOR_CATEGORIES_SORT_KEY)));
        SubLObject cdolist_list_var = navigator_link_categories();
        SubLObject category = NIL;
        category = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject value = gethash(category, $navigator_link_category_table$.getGlobalValue(), UNPROVIDED);
            value = Sort.sort(value, symbol_function($sym51$STRING_), symbol_function(LINK_SORT_KEY));
            sethash(category, $navigator_link_category_table$.getGlobalValue(), value);
            cdolist_list_var = cdolist_list_var.rest();
            category = cdolist_list_var.first();
        } 
        $navigator_links_sorted$.setDynamicValue(T);
        return NIL;
    }

    public static SubLObject splice_in_cgi_program(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject href_base_string = arglist.first();
        final SubLObject cgi_program = second(arglist);
        return format(NIL, href_base_string, cgi_program);
    }

    public static SubLObject string_is_relative_url(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject href_base_string = arglist.first();
        return href_base_string;
    }

    public static SubLObject href_is_base_string(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject href_base_string = arglist.first();
        return href_base_string;
    }

    public static SubLObject set_link_text(final SubLObject cached_link_text_form) {
        SubLObject link_text = NIL;
        if (cached_link_text_form.isSymbol() && (NIL != fboundp(cached_link_text_form))) {
            link_text = funcall(cached_link_text_form);
        } else
            if (cached_link_text_form.isCons()) {
                link_text = eval(cached_link_text_form);
            } else {
                link_text = cached_link_text_form;
            }

        return link_text;
    }

    public static SubLObject nav_link_for_text(final SubLObject link_keyword, final SubLObject href, final SubLObject target, final SubLObject text_link_text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cached_link_text_form = get_link_value(link_keyword, $LINK_TEXT);
        final SubLObject cached_link_text = set_link_text(cached_link_text_form);
        final SubLObject link_text = (NIL != string_utilities.non_empty_stringP(text_link_text)) ? text_link_text : NIL != string_utilities.non_empty_stringP(cached_link_text) ? cached_link_text : format(NIL, $str55$No_link_text_found_for__s_in_call, link_keyword, NAV_LINK_FOR_TEXT);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(href);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != target) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(target);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(link_text);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject set_image_src(final SubLObject image_src_form) {
        SubLObject image_src = NIL;
        if (image_src_form.isSymbol() && (NIL != fboundp(image_src_form))) {
            image_src = funcall(image_src_form);
        } else
            if (image_src_form.isCons()) {
                image_src = eval(image_src_form);
            } else {
                image_src = image_src_form;
            }

        return image_src;
    }

    public static SubLObject set_image_alt_text(final SubLObject cached_alt_form) {
        SubLObject alt_text = NIL;
        if (cached_alt_form.isSymbol() && (NIL != fboundp(cached_alt_form))) {
            alt_text = funcall(cached_alt_form);
        } else
            if (cached_alt_form.isCons()) {
                alt_text = eval(cached_alt_form);
            } else {
                alt_text = cached_alt_form;
            }

        return alt_text;
    }

    public static SubLObject nav_link_for_image(final SubLObject link_keyword, final SubLObject href, final SubLObject target, final SubLObject image_source, final SubLObject image_alt_text, final SubLObject image_align, final SubLObject image_border, final SubLObject image_ismap) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject image_src_form = get_link_value(link_keyword, $IMAGE_SRC);
        final SubLObject cached_image_src = set_image_src(image_src_form);
        final SubLObject cached_ismap = get_link_value(link_keyword, $ISMAP);
        final SubLObject cached_alt_form = get_link_value(link_keyword, $ALT);
        final SubLObject cached_alt = set_image_alt_text(cached_alt_form);
        final SubLObject cached_align = get_link_value(link_keyword, $ALIGN);
        final SubLObject cached_border = get_link_value(link_keyword, $BORDER);
        final SubLObject ismap = (NIL != image_ismap) ? image_ismap : cached_ismap;
        final SubLObject image_src = (NIL != image_source) ? image_source : cached_image_src;
        final SubLObject alt = (NIL != image_alt_text) ? image_alt_text : cached_alt;
        final SubLObject align = (NIL != image_align) ? image_align : cached_align;
        final SubLObject border = (NIL != image_border) ? image_border : cached_border;
        final SubLObject image_source_url = (image_src.isKeyword()) ? cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.cb_icon_src(image_src)) : image_src;
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(href);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != target) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(target);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(image_source_url);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != ismap) {
                html_simple_attribute(html_macros.$html_image_ismap$.getGlobalValue());
            }
            if (NIL != alt) {
                html_markup(html_macros.$html_image_alt$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(alt);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != align) {
                html_markup(html_macros.$html_image_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align(align));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (NIL != border) {
                html_markup(html_macros.$html_image_border$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(border);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
            }
            html_markup(html_macros.$html_image_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject nav_link_for_type(final SubLObject link_keyword, final SubLObject href, final SubLObject link_type, final SubLObject target, final SubLObject text_link_text, final SubLObject image_src, final SubLObject image_alt_text, final SubLObject image_align, final SubLObject image_border, final SubLObject image_ismap) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (link_type.eql($TEXT)) {
            nav_link_for_text(link_keyword, href, target, text_link_text);
        } else
            if (link_type.eql($IMAGE)) {
                nav_link_for_image(link_keyword, href, target, image_src, image_alt_text, image_align, image_border, image_ismap);
            } else {
                html_markup(html_macros.$html_font_head$.getGlobalValue());
                html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_color($RED));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str60$Error___a_must_be_one_of__s__but_, LINK_TYPE, $navigator_link_types$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_font_tail$.getGlobalValue());
            }

        return NIL;
    }

    public static SubLObject nav_malformed_link(final SubLObject args) {
        final SubLObject keyword = read_from_string_ignoring_errors(args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        generic_message_page($$$Malformed_Navigator_Link, format(NIL, $str62$The_navigator_link__s_is_malforme, keyword));
        return NIL;
    }

    public static SubLObject set_navigator_href(final SubLObject link_keyword, final SubLObject arglist, SubLObject href_base_string, final SubLObject href_tags, final SubLObject number_of_args, final SubLObject cgi_program) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject href = $str65$;
        if ((NIL == href_tags) && ((NIL == number_of_args) || (!length(arglist).numE(number_of_args)))) {
            href = format(NIL, $str66$_a_nav_malformed_link__s, cgi_program, link_keyword);
        } else
            if (NIL == href_tags) {
                href_base_string = apply(symbol_function(FORMAT), NIL, new SubLObject[]{ href_base_string, arglist });
                href = format(NIL, $str68$_a__a, cgi_program, href_base_string);
            } else {
                SubLObject cdolist_list_var = href_tags;
                SubLObject tag = NIL;
                tag = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject args = list(href_base_string, cgi_program);
                    final SubLObject function_symbol = assoc(tag, $nav_link_method_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
                    if (NIL != fboundp(function_symbol)) {
                        href = funcall(function_symbol, args);
                    } else {
                        href = href_base_string;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    tag = cdolist_list_var.first();
                } 
                if (NIL == string_utilities.non_empty_stringP(href)) {
                    href = href_base_string;
                }
            }

        return href;
    }

    public static SubLObject set_href_base_string(final SubLObject href_base_string_form) {
        SubLObject href_base_string = NIL;
        if (href_base_string_form.isSymbol() && (NIL != fboundp(href_base_string_form))) {
            href_base_string = funcall(href_base_string_form);
        } else
            if (href_base_string_form.isCons()) {
                href_base_string = eval(href_base_string_form);
            } else {
                href_base_string = href_base_string_form;
            }

        return href_base_string;
    }

    public static SubLObject nav_link(final SubLObject link_keyword, SubLObject arglist, SubLObject target, SubLObject text_link_text, SubLObject image_src, SubLObject image_alt_text, SubLObject image_align, SubLObject image_border, SubLObject image_ismap) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        if (target == UNPROVIDED) {
            target = NIL;
        }
        if (text_link_text == UNPROVIDED) {
            text_link_text = NIL;
        }
        if (image_src == UNPROVIDED) {
            image_src = NIL;
        }
        if (image_alt_text == UNPROVIDED) {
            image_alt_text = NIL;
        }
        if (image_align == UNPROVIDED) {
            image_align = NIL;
        }
        if (image_border == UNPROVIDED) {
            image_border = NIL;
        }
        if (image_ismap == UNPROVIDED) {
            image_ismap = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject link_type = get_link_value(link_keyword, $LINK_TYPE);
        final SubLObject href_base_string_form = get_link_value(link_keyword, $HREF_BASE_STRING);
        final SubLObject href_base_string = set_href_base_string(href_base_string_form);
        final SubLObject href_tags = get_link_value(link_keyword, $HREF_TAGS);
        final SubLObject number_of_args = get_link_value(link_keyword, $NUMBER_OF_ARGS);
        final SubLObject cached_target = get_link_value(link_keyword, $TARGET);
        final SubLObject cgi_program = (NIL != string_utilities.non_empty_stringP(system_parameters.$cyc_cgi_program$.getDynamicValue(thread))) ? system_parameters.$cyc_cgi_program$.getDynamicValue(thread) : $$$cg;
        final SubLObject href = set_navigator_href(link_keyword, arglist, href_base_string, href_tags, number_of_args, cgi_program);
        if (NIL == target) {
            target = cached_target;
        }
        if (!target.isString()) {
            target = cb_frame_name(target);
        }
        nav_link_for_type(link_keyword, href, link_type, target, text_link_text, image_src, image_alt_text, image_align, image_border, image_ismap);
        return NIL;
    }

    public static SubLObject valid_navigator_linkP(final SubLObject keyword) {
        return vectorp(gethash(keyword, $navigator_link_definition_table$.getGlobalValue(), UNPROVIDED));
    }

    public static SubLObject category_has_linksP(final SubLObject category) {
        final SubLObject links = gethash(category, $navigator_link_category_table$.getGlobalValue(), UNPROVIDED);
        SubLObject some_validP = NIL;
        if (NIL == some_validP) {
            SubLObject csome_list_var;
            SubLObject link;
            for (csome_list_var = links, link = NIL, link = csome_list_var.first(); (NIL == some_validP) && (NIL != csome_list_var); some_validP = valid_navigator_linkP(link) , csome_list_var = csome_list_var.rest() , link = csome_list_var.first()) {
            }
        }
        return some_validP;
    }

    public static SubLObject fill_navigator_columns(final SubLObject sorted_link_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject no_of_cols = (NIL != find($navigator_columns$.getDynamicValue(thread), $list70, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? $navigator_columns$.getDynamicValue(thread) : THREE_INTEGER;
        SubLObject column1 = NIL;
        SubLObject column2 = NIL;
        SubLObject column3 = NIL;
        SubLObject column4 = NIL;
        final SubLObject len = length(sorted_link_list);
        final SubLObject n_per_column1 = ceiling(divide(len, no_of_cols), UNPROVIDED);
        final SubLObject n_per_column2 = (no_of_cols.numG(ONE_INTEGER)) ? ceiling(divide(subtract(len, n_per_column1), subtract(no_of_cols, ONE_INTEGER)), UNPROVIDED) : ZERO_INTEGER;
        final SubLObject n_per_column3 = (no_of_cols.numG(TWO_INTEGER)) ? ceiling(divide(subtract(len, n_per_column2), subtract(no_of_cols, ONE_INTEGER)), UNPROVIDED) : ZERO_INTEGER;
        SubLObject count = ONE_INTEGER;
        SubLObject column_number = ONE_INTEGER;
        SubLObject cdolist_list_var = sorted_link_list;
        SubLObject link = NIL;
        link = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pcase_var = column_number;
            if (pcase_var.eql(ONE_INTEGER)) {
                column1 = cons(link, column1);
                if (count.numGE(n_per_column1)) {
                    count = ONE_INTEGER;
                    column_number = add(column_number, ONE_INTEGER);
                } else {
                    count = add(count, ONE_INTEGER);
                }
            } else
                if (pcase_var.eql(TWO_INTEGER)) {
                    column2 = cons(link, column2);
                    if (count.numGE(n_per_column2)) {
                        count = ONE_INTEGER;
                        column_number = add(column_number, ONE_INTEGER);
                    } else {
                        count = add(count, ONE_INTEGER);
                    }
                } else
                    if (pcase_var.eql(THREE_INTEGER)) {
                        column3 = cons(link, column3);
                        if (count.numGE(n_per_column3)) {
                            count = ONE_INTEGER;
                            column_number = add(column_number, ONE_INTEGER);
                        } else {
                            count = add(count, ONE_INTEGER);
                        }
                    } else
                        if (pcase_var.eql(FOUR_INTEGER)) {
                            column4 = cons(link, column4);
                        }



            cdolist_list_var = cdolist_list_var.rest();
            link = cdolist_list_var.first();
        } 
        column1 = nreverse(column1);
        column2 = nreverse(column2);
        column3 = nreverse(column3);
        column4 = nreverse(column4);
        return list(column1, column2, column3, column4);
    }

    public static SubLObject arrange_navigator_links(final SubLObject title, final SubLObject columns) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_align($$$left));
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ(title);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_br();
                html_br();
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        SubLObject column1;
        SubLObject column2;
        SubLObject column3;
        SubLObject column4;
        SubLObject key1;
        SubLObject key2;
        SubLObject key3;
        SubLObject key4;
        SubLObject _prev_bind_2;
        SubLObject _prev_bind_0_$3;
        SubLObject _prev_bind_0_$4;
        SubLObject _prev_bind_0_$5;
        SubLObject _prev_bind_0_$6;
        SubLObject _prev_bind_0_$7;
        SubLObject _prev_bind_0_$8;
        SubLObject _prev_bind_0_$9;
        for (column1 = NIL, column2 = NIL, column3 = NIL, column4 = NIL, column1 = columns.first(), column2 = second(columns), column3 = third(columns), column4 = fourth(columns); (((NIL != column1) || (NIL != column2)) || (NIL != column3)) || (NIL != column4); column1 = column1.rest() , column2 = column2.rest() , column3 = column3.rest() , column4 = column4.rest()) {
            key1 = column1.first();
            key2 = column2.first();
            key3 = column3.first();
            key4 = column4.first();
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$left));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$top));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    nav_link(key1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if ($navigator_line_spacing$.getDynamicValue(thread).equalp($$$double)) {
                        html_br();
                        html_br();
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                if (NIL != key2) {
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        html_indent($navigator_column_padding$.getDynamicValue(thread));
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($$$left));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($$$top));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        nav_link(key2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    if (NIL != key3) {
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            html_indent($navigator_column_padding$.getDynamicValue(thread));
                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($$$left));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($$$top));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            nav_link(key3, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        if (NIL != key4) {
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                html_indent($navigator_column_padding$.getDynamicValue(thread));
                                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($$$left));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($$$top));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                nav_link(key4, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                    }
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject columnize_by_links(final SubLObject categories) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject first_category = categories.first();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        if (NIL != $navigator_table_border$.getDynamicValue(thread)) {
            html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($navigator_table_border$.getDynamicValue(thread));
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            SubLObject cdolist_list_var = categories;
            SubLObject category = NIL;
            category = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject form = assoc(category, $navigator_link_categories$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                SubLObject title = second(form);
                if (NIL == title) {
                    title = $str74$Untitled_Category_;
                }
                if (NIL != third(form)) {
                    SubLObject links = gethash(category, $navigator_link_category_table$.getGlobalValue(), UNPROVIDED);
                    links = list_utilities.remove_if_not(symbol_function($sym75$VALID_NAVIGATOR_LINK_), links, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != links) {
                        if ((!category.eql(first_category)) && (!$navigator_line_spacing$.getDynamicValue(thread).equalp($$$double))) {
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_br();
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        }
                        arrange_navigator_links(title, fill_navigator_columns(links));
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                category = cdolist_list_var.first();
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject columnize_by_categories(final SubLObject categories) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject no_of_cols = (NIL != find($navigator_columns$.getDynamicValue(thread), $list70, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? $navigator_columns$.getDynamicValue(thread) : THREE_INTEGER;
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        if (NIL != $navigator_table_border$.getDynamicValue(thread)) {
            html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($navigator_table_border$.getDynamicValue(thread));
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            SubLObject cats;
            SubLObject first_n_cats;
            SubLObject _prev_bind_0_$12;
            SubLObject cdolist_list_var;
            SubLObject category;
            SubLObject form;
            SubLObject title;
            SubLObject links;
            SubLObject _prev_bind_0_$13;
            SubLObject cdolist_list_var_$14;
            SubLObject link;
            SubLObject _prev_bind_0_$14;
            for (cats = NIL, first_n_cats = NIL, cats = categories, first_n_cats = list_utilities.first_n(no_of_cols, cats); NIL != first_n_cats; first_n_cats = list_utilities.first_n(no_of_cols, cats)) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cdolist_list_var = first_n_cats;
                    category = NIL;
                    category = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        form = assoc(category, $navigator_link_categories$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                        title = second(form);
                        if (NIL == title) {
                            title = $str74$Untitled_Category_;
                        }
                        if (NIL != third(form)) {
                            links = gethash(category, $navigator_link_category_table$.getGlobalValue(), UNPROVIDED);
                            links = list_utilities.remove_if_not(symbol_function($sym75$VALID_NAVIGATOR_LINK_), links, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL != links) {
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($$$left));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($$$top));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    format(html_macros.$html_stream$.getDynamicValue(thread), title);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_br();
                                    cdolist_list_var_$14 = links;
                                    link = NIL;
                                    link = cdolist_list_var_$14.first();
                                    while (NIL != cdolist_list_var_$14) {
                                        html_br();
                                        nav_link(link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        if ($navigator_line_spacing$.getDynamicValue(thread).equalp($$$double)) {
                                            html_br();
                                        }
                                        cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                                        link = cdolist_list_var_$14.first();
                                    } 
                                    html_br();
                                    if ($navigator_line_spacing$.getDynamicValue(thread).equalp($$$single)) {
                                        html_br();
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_newline(UNPROVIDED);
                                    html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                    html_indent($navigator_column_padding$.getDynamicValue(thread));
                                    html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        category = cdolist_list_var.first();
                    } 
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                cats = nthcdr(no_of_cols, cats);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject navigator_categories_for_display() {
        return Mapping.mapcar(symbol_function(CAR), list_utilities.remove_if_not(symbol_function(THIRD), $navigator_link_categories$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject cyc_navigator(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $navigator_links_sorted$.getDynamicValue(thread)) {
            sort_navigator_links();
        }
        SubLObject categories = navigator_categories_for_display();
        categories = list_utilities.remove_if_not(symbol_function($sym79$CATEGORY_HAS_LINKS_), categories, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject title_var = $$$Cyc_Navigator;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str81$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str82$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$16 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$17 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str87$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$button);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reload);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ($$$Refresh_Frames);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title_var);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_indent(TWO_INTEGER);
                            cb_back_button($SELF, $$$Back);
                            if (NIL != categories) {
                                html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(ZERO_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($$$left));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            if (NIL != $columnize_by_category$.getDynamicValue(thread)) {
                                                columnize_by_categories(categories);
                                            } else {
                                                columnize_by_links(categories);
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                                }
                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            } else {
                                html_br();
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str94$There_are_no_Cyc_Navigator_links_);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_newline(TWO_INTEGER);
                                cb_back_button($SELF, $$$Go_Back);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$17, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$16, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject format_navigator_preferences(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $$$_);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$right));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str98$Number_of_columns__);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$left));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_select_head$.getGlobalValue());
                    final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(NIL, thread);
                        html_markup(html_macros.$html_select_name$.getGlobalValue());
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str99$column_number);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            final SubLObject current = $navigator_columns$.getDynamicValue(thread);
                            SubLObject cdolist_list_var = $list70;
                            SubLObject i = NIL;
                            i = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                html_markup(html_macros.$html_option_head$.getGlobalValue());
                                final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(NIL, thread);
                                    if (i.equal(current)) {
                                        html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(i);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                                }
                                html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                cdolist_list_var = cdolist_list_var.rest();
                                i = cdolist_list_var.first();
                            } 
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                    }
                    html_markup(html_macros.$html_select_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $$$_);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$right));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str100$Width_between_columns__);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$left));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_text_input($str101$column_padding, $navigator_column_padding$.getDynamicValue(thread), THREE_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $$$_);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$right));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str102$Link_category_arrangement__);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$left));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_radio_input($str103$columnize_by_category, $$$yes, $columnize_by_category$.getDynamicValue(thread), UNPROVIDED);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $$$_one_column_per_category);
                    html_br();
                    html_radio_input($str103$columnize_by_category, $$$no, makeBoolean(NIL == $columnize_by_category$.getDynamicValue(thread)), UNPROVIDED);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $$$_multiple_columns_per_category);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $$$_);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$right));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str108$Line_spacing__);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$left));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_select_head$.getGlobalValue());
                    final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(NIL, thread);
                        html_markup(html_macros.$html_select_name$.getGlobalValue());
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str109$line_spacing);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            final SubLObject current = $navigator_line_spacing$.getDynamicValue(thread);
                            SubLObject cdolist_list_var = $list110;
                            SubLObject string = NIL;
                            string = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                html_markup(html_macros.$html_option_head$.getGlobalValue());
                                final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(NIL, thread);
                                    if (string.equalp(current)) {
                                        html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(string);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                                }
                                html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                cdolist_list_var = cdolist_list_var.rest();
                                string = cdolist_list_var.first();
                            } 
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                    }
                    html_markup(html_macros.$html_select_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject set_navigator_preferences(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Cyc_Navigator_Preferences;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str81$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str82$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$52 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$53 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str87$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$button);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reload);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ($$$Refresh_Frames);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title_var);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$post);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != html_macros.$html_self_target$.getGlobalValue()) {
                            html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_self_target$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str114$handle_navigator_preferences, T, UNPROVIDED);
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ZERO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($$$middle));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_reset_input($$$Current_Values);
                                        html_submit_input($$$Update, UNPROVIDED, UNPROVIDED);
                                        format_navigator_preferences(UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$53, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$52, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject handle_navigator_preferences(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLObject column_number = read_from_string_ignoring_errors(html_extract_input($str99$column_number, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject column_padding = html_extract_input($str101$column_padding, args);
        final SubLObject columnize_by_category = html_extract_input($str103$columnize_by_category, args);
        final SubLObject line_spacing = html_extract_input($str109$line_spacing, args);
        $navigator_columns$.setDynamicValue(column_number);
        if (NIL != string_utilities.non_empty_stringP(column_padding)) {
            column_padding = read_from_string_ignoring_errors(column_padding, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (((!column_padding.isInteger()) || (!column_padding.numGE(ZERO_INTEGER))) || (!column_padding.numLE($int$200))) {
            column_padding = FIVE_INTEGER;
        }
        $navigator_column_padding$.setDynamicValue(column_padding);
        $columnize_by_category$.setDynamicValue(equalp(columnize_by_category, $$$yes));
        if (NIL != find(line_spacing, $list110, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            $navigator_line_spacing$.setDynamicValue(line_spacing);
        } else {
            $navigator_line_spacing$.setDynamicValue($$$single);
        }
        return cyc_navigator(UNPROVIDED);
    }

    public static SubLObject guest_warn(SubLObject facility_name) {
        if (facility_name == UNPROVIDED) {
            facility_name = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (operation_communication.the_cyclist().equal($$Guest)) {
            final SubLObject title_var = $$$Please_Login_Now;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str81$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str82$_meta_http_equiv__X_UA_Compatible);
                }
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$60 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                    html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_head_shortcut_icon();
                    html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css($CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (NIL != title_var) {
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_princ(title_var);
                        html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    final SubLObject _prev_bind_0_$61 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str87$yui_skin_sam);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reloadFrameButton);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$button);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$reload);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_princ($$$Refresh_Frames);
                                html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                            }
                            html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (NIL != title_var) {
                                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                                html_princ(title_var);
                                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                            }
                            guest_warn_int(facility_name);
                            html_br();
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$61, thread);
                    }
                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                } finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$60, thread);
                }
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject guest_warn_int(SubLObject facility_name) {
        if (facility_name == UNPROVIDED) {
            facility_name = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (operation_communication.the_cyclist().equal($$Guest)) {
            format(html_macros.$html_stream$.getDynamicValue(thread), $str124$Sorry___a_cannot_be_used_by_peopl, NIL != string_utilities.non_empty_stringP(facility_name) ? facility_name : $$$this_facility);
            cb_form(operation_communication.the_cyclist(), UNPROVIDED, UNPROVIDED);
            html_princ($str126$___Failure_to_login_using_your_un);
            nav_link($CB_LOGIN, NIL, NIL, $$$login, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_princ($str129$_using_your_real_name_now_);
            html_br();
        }
        return NIL;
    }

    public static SubLObject guest_warn_string(SubLObject facility_name) {
        if (facility_name == UNPROVIDED) {
            facility_name = NIL;
        }
        if (operation_communication.the_cyclist().equal($$Guest)) {
            SubLObject result_str = NIL;
            SubLObject str = NIL;
            try {
                str = make_private_string_output_stream();
                format(str, $str130$Sorry___a_cannot_be_used_by_peopl, NIL != string_utilities.non_empty_stringP(facility_name) ? facility_name : $$$this_facility, operation_communication.the_cyclist());
                format(str, $str131$___Failure_to_login_using_your_un);
                result_str = get_output_stream_string(str);
            } finally {
                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    final SubLObject _values = getValuesAsVector();
                    close(str, UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
            return result_str;
        }
        return NIL;
    }

    public static SubLObject make_ok_cyclist_name(final SubLObject string) {
        return string_utilities.strcat(Mapping.mapcar(symbol_function(STRING_CAPITALIZE), string_utilities.break_words(string, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject cb_link_load_transcript(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Load_Transcript;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str135$cb_load_transcript);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject html_load_transcript(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return cb_load_transcript(args);
    }

    public static SubLObject cb_load_transcript(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == cyc_image_id()) {
            set_cyc_image_id();
        }
        if (NIL != ke.cyclist_is_guest()) {
            guest_warn($$$the_Load_Transcript_File_page);
        } else {
            final SubLObject title_var = $$$Load_Transcript_File;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str81$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str82$_meta_http_equiv__X_UA_Compatible);
                }
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$64 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                    html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_head_shortcut_icon();
                    html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css($CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (NIL != title_var) {
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_princ(title_var);
                        html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    final SubLObject _prev_bind_0_$65 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str87$yui_skin_sam);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reloadFrameButton);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$button);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$reload);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_princ($$$Refresh_Frames);
                                html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                            }
                            html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (NIL != title_var) {
                                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                                html_princ(title_var);
                                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                            }
                            html_markup(html_macros.$html_form_head$.getGlobalValue());
                            html_markup(html_macros.$html_form_action$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_form_method$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$post);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_self_target$.getGlobalValue()) {
                                html_markup(html_macros.$html_form_target$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_self_target$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_macros.$within_html_form$.bind(T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_hidden_input($str144$handle_load_transcript, T, UNPROVIDED);
                                html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(ZERO_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($$$center));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(ZERO_INTEGER);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_align($$$left));
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_princ($str146$Pathname_);
                                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        html_br();
                                                        html_filename_input($str147$load_file, $str65$, $int$40);
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $$$_);
                                                        html_reset_input($$$Clear);
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $$$_);
                                                        html_submit_input($$$Load, UNPROVIDED, UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$73, thread);
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$72, thread);
                                            }
                                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(ZERO_INTEGER);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$76 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_align($$$right));
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_princ($str151$Destination_queue__);
                                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$77, thread);
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_align($$$left));
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_radio_input($$$queue, $str153$_aux, NIL, UNPROVIDED);
                                                        html_princ($str154$__AUXILIARY);
                                                        html_br();
                                                        html_radio_input($$$queue, $str155$_local, T, UNPROVIDED);
                                                        html_princ($str156$__LOCAL);
                                                        html_br();
                                                        html_radio_input($$$queue, $str157$_none, NIL, UNPROVIDED);
                                                        html_princ($str158$__NONE);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$78, thread);
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$76, thread);
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$75, thread);
                                            }
                                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(ZERO_INTEGER);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_align($$$left));
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_checkbox_input($$$transcript, $$$yes, $use_transcriptP$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str160$_Transcript_unenqueued___NONE__op);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$81, thread);
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$80, thread);
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$79, thread);
                                            }
                                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                                }
                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_br();
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str161$READ_THIS_BEFORE_LOADING_A_TRANSC);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str162$The_possible_values_for_the_desti);
                                html_br();
                                html_br();
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str163$Loading_a_transcript_file_may_hav);
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            } finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
                            }
                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$65, thread);
                    }
                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                } finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$64, thread);
                }
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject generic_message_page(final SubLObject title, final SubLObject message) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str81$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str82$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$82 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$83 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str87$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$button);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reload);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ($$$Refresh_Frames);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$85, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_back_button($SELF, $$$Back);
                            html_princ(message);
                            html_newline(TWO_INTEGER);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$86, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$83, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$82, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject handle_load_transcript(final SubLObject args) {
        final SubLObject pathname = string_utilities.trim_whitespace(html_extract_input($str147$load_file, args));
        final SubLObject use_transcriptP = equalp($$$yes, html_extract_input($$$transcript, args));
        final SubLObject queue = read_from_string_ignoring_errors(html_extract_input($$$queue, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject file_exists = Filesys.probe_file(pathname);
        if (NIL != file_exists) {
            final SubLObject no_of_ops = operation_communication.load_transcript_file(pathname, use_transcriptP, queue, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (no_of_ops.isInteger()) {
                generic_message_page($$$Transcript_File_Loaded, format(NIL, $str166$The_file__s_containing__s_operati, new SubLObject[]{ pathname, no_of_ops, cyc_image_id() }));
            } else {
                generic_message_page($$$Transcript_File_Problem, format(NIL, $str168$The_file__s_exists__but_no_operat, pathname, cyc_image_id()));
            }
        } else {
            generic_message_page($$$File_Not_Available, format(NIL, $str170$The_file__s_cannot_be_accessed___, pathname));
        }
        return NIL;
    }

    public static SubLObject report_file_not_available(final SubLObject file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$File_Not_Available;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str81$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str82$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$87 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$88 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str87$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$90 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$button);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reload);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ($$$Refresh_Frames);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$90, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title_var);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        html_princ($$$The_file_);
                        html_princ(file);
                        html_princ($str173$_does_not_exist__or_cannot_be_acc);
                        html_br();
                        html_br();
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$89, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$88, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$87, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject maybe_use_english(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($CYCL == $cb_major_presentation_language$.getDynamicValue(thread)) {
            $cb_major_presentation_language$.setDynamicValue($NL, thread);
        } else {
            $cb_major_presentation_language$.setDynamicValue($CYCL, thread);
        }
        return cyc_navigator(UNPROVIDED);
    }

    public static SubLObject maybe_use_english_text() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $CYCL == $cb_major_presentation_language$.getDynamicValue(thread) ? $$$Show_Assertions_in_English : $$$Show_Assertions_in_CycL;
    }

    public static SubLObject clear_pg_caches(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        pph_main.clear_paraphrase_caches(UNPROVIDED, UNPROVIDED);
        return cyc_navigator(UNPROVIDED);
    }

    public static SubLObject cyc_nav_clear_el_formulas_cache(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        cb_clear_el_formulas_cache();
        return cyc_navigator(UNPROVIDED);
    }

    public static SubLObject cb_clear_el_formulas_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != dictionary.dictionary_p($cb_assertion_el_formula_cache$.getDynamicValue(thread))) {
            dictionary.clear_dictionary($cb_assertion_el_formula_cache$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static SubLObject html_start_agenda(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        agenda.start_agenda(TWO_INTEGER);
        return cb_system_tools.cb_agenda(UNPROVIDED);
    }

    public static SubLObject html_halt_agenda(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        agenda.halt_agenda(TWO_INTEGER);
        return cb_system_tools.cb_agenda(UNPROVIDED);
    }

    public static SubLObject html_restart_agenda(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        agenda.restart_agenda(TWO_INTEGER);
        return cb_system_tools.cb_agenda(UNPROVIDED);
    }

    public static SubLObject declare_cyc_navigator_internals_file() {
        declareFunction(me, "make_new_link_vector", "MAKE-NEW-LINK-VECTOR", 0, 1, false);
        declareFunction(me, "get_link_vector", "GET-LINK-VECTOR", 1, 0, false);
        declareFunction(me, "navigator_link", "NAVIGATOR-LINK", 1, 0, false);
        declareFunction(me, "navigator_links", "NAVIGATOR-LINKS", 0, 1, false);
        declareFunction(me, "navigator_link_categories", "NAVIGATOR-LINK-CATEGORIES", 0, 0, false);
        declareFunction(me, "navigator_link_categoryP", "NAVIGATOR-LINK-CATEGORY?", 1, 0, false);
        declareFunction(me, "get_link_value", "GET-LINK-VALUE", 2, 0, false);
        declareFunction(me, "set_link_value", "SET-LINK-VALUE", 3, 2, false);
        declareFunction(me, "return_link_definition", "RETURN-LINK-DEFINITION", 1, 0, false);
        declareFunction(me, "print_link_definition", "PRINT-LINK-DEFINITION", 1, 0, false);
        declareFunction(me, "def_navigator_link", "DEF-NAVIGATOR-LINK", 5, 8, false);
        declareFunction(me, "remove_navigator_link", "REMOVE-NAVIGATOR-LINK", 1, 0, false);
        declareFunction(me, "eval_link_sort_key", "EVAL-LINK-SORT-KEY", 1, 0, false);
        declareFunction(me, "link_sort_key", "LINK-SORT-KEY", 1, 0, false);
        declareFunction(me, "navigator_categories_sort_key", "NAVIGATOR-CATEGORIES-SORT-KEY", 1, 0, false);
        declareFunction(me, "sort_navigator_links", "SORT-NAVIGATOR-LINKS", 0, 0, false);
        declareFunction(me, "splice_in_cgi_program", "SPLICE-IN-CGI-PROGRAM", 0, 1, false);
        declareFunction(me, "string_is_relative_url", "STRING-IS-RELATIVE-URL", 0, 1, false);
        declareFunction(me, "href_is_base_string", "HREF-IS-BASE-STRING", 0, 1, false);
        declareFunction(me, "set_link_text", "SET-LINK-TEXT", 1, 0, false);
        declareFunction(me, "nav_link_for_text", "NAV-LINK-FOR-TEXT", 4, 0, false);
        declareFunction(me, "set_image_src", "SET-IMAGE-SRC", 1, 0, false);
        declareFunction(me, "set_image_alt_text", "SET-IMAGE-ALT-TEXT", 1, 0, false);
        declareFunction(me, "nav_link_for_image", "NAV-LINK-FOR-IMAGE", 8, 0, false);
        declareFunction(me, "nav_link_for_type", "NAV-LINK-FOR-TYPE", 10, 0, false);
        declareFunction(me, "nav_malformed_link", "NAV-MALFORMED-LINK", 1, 0, false);
        declareFunction(me, "set_navigator_href", "SET-NAVIGATOR-HREF", 6, 0, false);
        declareFunction(me, "set_href_base_string", "SET-HREF-BASE-STRING", 1, 0, false);
        declareFunction(me, "nav_link", "NAV-LINK", 1, 8, false);
        declareFunction(me, "valid_navigator_linkP", "VALID-NAVIGATOR-LINK?", 1, 0, false);
        declareFunction(me, "category_has_linksP", "CATEGORY-HAS-LINKS?", 1, 0, false);
        declareFunction(me, "fill_navigator_columns", "FILL-NAVIGATOR-COLUMNS", 1, 0, false);
        declareFunction(me, "arrange_navigator_links", "ARRANGE-NAVIGATOR-LINKS", 2, 0, false);
        declareFunction(me, "columnize_by_links", "COLUMNIZE-BY-LINKS", 1, 0, false);
        declareFunction(me, "columnize_by_categories", "COLUMNIZE-BY-CATEGORIES", 1, 0, false);
        declareFunction(me, "navigator_categories_for_display", "NAVIGATOR-CATEGORIES-FOR-DISPLAY", 0, 0, false);
        declareFunction(me, "cyc_navigator", "CYC-NAVIGATOR", 0, 1, false);
        declareFunction(me, "format_navigator_preferences", "FORMAT-NAVIGATOR-PREFERENCES", 0, 1, false);
        declareFunction(me, "set_navigator_preferences", "SET-NAVIGATOR-PREFERENCES", 0, 1, false);
        declareFunction(me, "handle_navigator_preferences", "HANDLE-NAVIGATOR-PREFERENCES", 0, 1, false);
        declareFunction(me, "guest_warn", "GUEST-WARN", 0, 1, false);
        declareFunction(me, "guest_warn_int", "GUEST-WARN-INT", 0, 1, false);
        declareFunction(me, "guest_warn_string", "GUEST-WARN-STRING", 0, 1, false);
        declareFunction(me, "make_ok_cyclist_name", "MAKE-OK-CYCLIST-NAME", 1, 0, false);
        declareFunction(me, "cb_link_load_transcript", "CB-LINK-LOAD-TRANSCRIPT", 0, 1, false);
        declareFunction(me, "html_load_transcript", "HTML-LOAD-TRANSCRIPT", 0, 1, false);
        declareFunction(me, "cb_load_transcript", "CB-LOAD-TRANSCRIPT", 0, 1, false);
        declareFunction(me, "generic_message_page", "GENERIC-MESSAGE-PAGE", 2, 0, false);
        declareFunction(me, "handle_load_transcript", "HANDLE-LOAD-TRANSCRIPT", 1, 0, false);
        declareFunction(me, "report_file_not_available", "REPORT-FILE-NOT-AVAILABLE", 1, 0, false);
        declareFunction(me, "maybe_use_english", "MAYBE-USE-ENGLISH", 0, 1, false);
        declareFunction(me, "maybe_use_english_text", "MAYBE-USE-ENGLISH-TEXT", 0, 0, false);
        declareFunction(me, "clear_pg_caches", "CLEAR-PG-CACHES", 0, 1, false);
        declareFunction(me, "cyc_nav_clear_el_formulas_cache", "CYC-NAV-CLEAR-EL-FORMULAS-CACHE", 0, 1, false);
        declareFunction(me, "cb_clear_el_formulas_cache", "CB-CLEAR-EL-FORMULAS-CACHE", 0, 0, false);
        declareFunction(me, "html_start_agenda", "HTML-START-AGENDA", 0, 1, false);
        declareFunction(me, "html_halt_agenda", "HTML-HALT-AGENDA", 0, 1, false);
        declareFunction(me, "html_restart_agenda", "HTML-RESTART-AGENDA", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_cyc_navigator_internals_file() {
        defparameter("*NAVIGATOR-LINKS-SORTED*", NIL);
        defparameter("*NAVIGATOR-COLUMNS*", THREE_INTEGER);
        defparameter("*NAVIGATOR-COLUMN-PADDING*", FIVE_INTEGER);
        defparameter("*COLUMNIZE-BY-CATEGORY*", T);
        defparameter("*NAVIGATOR-LINE-SPACING*", $$$single);
        defparameter("*NAVIGATOR-TABLE-BORDER*", ZERO_INTEGER);
        deflexical("*NAVIGATOR-VECTOR-LENGTH*", TWENTY_INTEGER);
        deflexical("*NAVIGATOR-LINK-DEFINITION-TABLE*", SubLSystemTrampolineFile.maybeDefault($navigator_link_definition_table$, $navigator_link_definition_table$, () -> make_hash_table($int$100, UNPROVIDED, UNPROVIDED)));
        deflexical("*NAVIGATOR-LINK-CATEGORY-TABLE*", SubLSystemTrampolineFile.maybeDefault($navigator_link_category_table$, $navigator_link_category_table$, () -> make_hash_table($int$50, UNPROVIDED, UNPROVIDED)));
        deflexical("*NAVIGATOR-LINK-TYPES*", $list10);
        deflexical("*NAVIGATOR-LINK-CATEGORIES*", $list11);
        defparameter("*NAVIGATOR-LINK-DEFINITION-KEYS*", $list12);
        defparameter("*NAV-LINK-METHOD-TABLE*", $list54);
        return NIL;
    }

    public static SubLObject setup_cyc_navigator_internals_file() {
        register_html_state_variable($navigator_columns$);
        register_html_state_variable($navigator_column_padding$);
        register_html_state_variable($columnize_by_category$);
        register_html_state_variable($navigator_line_spacing$);
        register_html_state_variable($navigator_table_border$);
        declare_defglobal($navigator_link_definition_table$);
        declare_defglobal($navigator_link_category_table$);
        html_macros.note_cgi_handler_function(NAV_MALFORMED_LINK, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(COLUMNIZE_BY_LINKS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(COLUMNIZE_BY_CATEGORIES, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CYC_NAVIGATOR, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(FORMAT_NAVIGATOR_PREFERENCES, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(SET_NAVIGATOR_PREFERENCES, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(HANDLE_NAVIGATOR_PREFERENCES, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(GUEST_WARN, $HTML_HANDLER);
        setup_cb_link_method($LOAD_TRANSCRIPT, CB_LINK_LOAD_TRANSCRIPT, ONE_INTEGER);
        declare_cb_tool($LOAD_TRANSCRIPT, $$$Transcript_Load, $$$TLoad, $$$Load_transcript_file);
        html_macros.note_cgi_handler_function(HTML_LOAD_TRANSCRIPT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_LOAD_TRANSCRIPT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(HANDLE_LOAD_TRANSCRIPT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(REPORT_FILE_NOT_AVAILABLE, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(MAYBE_USE_ENGLISH, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CLEAR_PG_CACHES, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CYC_NAV_CLEAR_EL_FORMULAS_CACHE, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(HTML_START_AGENDA, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(HTML_HALT_AGENDA, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(HTML_RESTART_AGENDA, $HTML_HANDLER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cyc_navigator_internals_file();
    }

    @Override
    public void initializeVariables() {
        init_cyc_navigator_internals_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cyc_navigator_internals_file();
    }

    
}

/**
 * Total time: 1525 ms
 */
