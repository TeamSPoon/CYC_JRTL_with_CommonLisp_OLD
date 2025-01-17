package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_term;
import static com.cyc.cycjava.cycl.cfasl.$terse_guid_serialization_enabled_for_cfasl_encode_externalizedP$;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constant;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.variable_subst;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input;
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
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_backslash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.zerop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write_to_string;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.caar;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.rassoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class document_annotation_widgets extends SubLTranslatedFile {
    public static final SubLFile me = new document_annotation_widgets();

    public static final String myName = "com.cyc.cycjava.cycl.document_annotation_widgets";

    public static final String myFingerPrint = "0791c8f1a8ac8ee4e11d4c48871a2a23877fb45f04c6f9d4a0d9eceada695430";

    // defparameter
    public static final SubLSymbol $text_index$ = makeSymbol("*TEXT-INDEX*");

    // defparameter
    public static final SubLSymbol $semantic_index$ = makeSymbol("*SEMANTIC-INDEX*");

    // defparameter
    private static final SubLSymbol $text_index_override$ = makeSymbol("*TEXT-INDEX-OVERRIDE*");

    // defparameter
    private static final SubLSymbol $semantic_index_override$ = makeSymbol("*SEMANTIC-INDEX-OVERRIDE*");





    // defparameter
    /**
     * a table mapping indexing predicates to their compact string representation
     * used in the index
     */
    public static final SubLSymbol $predicate_id_table$ = makeSymbol("*PREDICATE-ID-TABLE*");

    // defparameter
    // a table mapping predicates to their templates
    private static final SubLSymbol $predicate_template_table$ = makeSymbol("*PREDICATE-TEMPLATE-TABLE*");

    // defparameter
    private static final SubLSymbol $upwards_closure_justification_fbc$ = makeSymbol("*UPWARDS-CLOSURE-JUSTIFICATION-FBC*");

    // defparameter
    private static final SubLSymbol $upwards_closure_justification_fht_path$ = makeSymbol("*UPWARDS-CLOSURE-JUSTIFICATION-FHT-PATH*");

    // defparameter
    private static final SubLSymbol $doc_annotation_thcl_verboseP$ = makeSymbol("*DOC-ANNOTATION-THCL-VERBOSE?*");





    // defparameter
    private static final SubLSymbol $upwards_closure_query_mt$ = makeSymbol("*UPWARDS-CLOSURE-QUERY-MT*");



    // defparameter
    /**
     * BOOLEANP; When non-NIL, make some optimizations for case where we assume the
     * KB won't change and we'll be computing the upwards closure for multiple
     * terms.
     */
    private static final SubLSymbol $caching_upwards_closure_justificationsP$ = makeSymbol("*CACHING-UPWARDS-CLOSURE-JUSTIFICATIONS?*");















    // defparameter
    // The default location for storing xml documents that have been tagged
    private static final SubLSymbol $tagged_xml_doc_directory$ = makeSymbol("*TAGGED-XML-DOC-DIRECTORY*");

    // defconstant
    public static final SubLSymbol $tagged_doc_title_name$ = makeSymbol("*TAGGED-DOC-TITLE-NAME*");

    // defconstant
    public static final SubLSymbol $tagged_doc_title_token$ = makeSymbol("*TAGGED-DOC-TITLE-TOKEN*");

    // defconstant
    public static final SubLSymbol $tagged_doc_title_close_token$ = makeSymbol("*TAGGED-DOC-TITLE-CLOSE-TOKEN*");

    // defconstant
    public static final SubLSymbol $tagged_doc_text_name$ = makeSymbol("*TAGGED-DOC-TEXT-NAME*");

    // defconstant
    public static final SubLSymbol $tagged_doc_text_token$ = makeSymbol("*TAGGED-DOC-TEXT-TOKEN*");

    // defconstant
    public static final SubLSymbol $tagged_doc_text_close_token$ = makeSymbol("*TAGGED-DOC-TEXT-CLOSE-TOKEN*");

    // defconstant
    public static final SubLSymbol $tagged_doc_keystring_name$ = makeSymbol("*TAGGED-DOC-KEYSTRING-NAME*");

    // defconstant
    public static final SubLSymbol $tagged_doc_keystring_token$ = makeSymbol("*TAGGED-DOC-KEYSTRING-TOKEN*");

    // defconstant
    public static final SubLSymbol $tagged_doc_confirmed_concepts_keystring_token$ = makeSymbol("*TAGGED-DOC-CONFIRMED-CONCEPTS-KEYSTRING-TOKEN*");

    // defconstant
    public static final SubLSymbol $tagged_doc_confirmed_concepts_keystring_name$ = makeSymbol("*TAGGED-DOC-CONFIRMED-CONCEPTS-KEYSTRING-NAME*");

    // defconstant
    public static final SubLSymbol $tagged_doc_original_filename_name$ = makeSymbol("*TAGGED-DOC-ORIGINAL-FILENAME-NAME*");

    // defconstant
    public static final SubLSymbol $tagged_doc_original_filename_token$ = makeSymbol("*TAGGED-DOC-ORIGINAL-FILENAME-TOKEN*");

    // defconstant
    public static final SubLSymbol $tagged_doc_url_name$ = makeSymbol("*TAGGED-DOC-URL-NAME*");

    // defconstant
    public static final SubLSymbol $tagged_doc_url_token$ = makeSymbol("*TAGGED-DOC-URL-TOKEN*");

    // defconstant
    public static final SubLSymbol $tagged_doc_url_close_token$ = makeSymbol("*TAGGED-DOC-URL-CLOSE-TOKEN*");

    // defconstant
    public static final SubLSymbol $tagged_doc_parent_filename_name$ = makeSymbol("*TAGGED-DOC-PARENT-FILENAME-NAME*");

    // defconstant
    public static final SubLSymbol $tagged_doc_parent_filename_token$ = makeSymbol("*TAGGED-DOC-PARENT-FILENAME-TOKEN*");

    // defparameter
    private static final SubLSymbol $semantic_index_dir_name$ = makeSymbol("*SEMANTIC-INDEX-DIR-NAME*");

    // defparameter
    private static final SubLSymbol $text_index_dir_name$ = makeSymbol("*TEXT-INDEX-DIR-NAME*");

    // defparameter
    private static final SubLSymbol $annotated_document_format$ = makeSymbol("*ANNOTATED-DOCUMENT-FORMAT*");

    // defparameter
    /**
     * A temporary control parameter that gates whether or not the doc-ingester
     * should assume that each concept is listed individually in input/output, or if
     * multiple concepts can be munged together in an encoded list
     */
    public static final SubLSymbol $term_learner_keep_concepts_distinct$ = makeSymbol("*TERM-LEARNER-KEEP-CONCEPTS-DISTINCT*");

    // defparameter
    public static final SubLSymbol $default_medical_tagging_lexicon$ = makeSymbol("*DEFAULT-MEDICAL-TAGGING-LEXICON*");

    // defparameter
    private static final SubLSymbol $doc_annotation_use_hl_ids$ = makeSymbol("*DOC-ANNOTATION-USE-HL-IDS*");

    // defparameter
    private static final SubLSymbol $doc_annotator_term_id_fbc_path$ = makeSymbol("*DOC-ANNOTATOR-TERM-ID-FBC-PATH*");

    // defparameter
    private static final SubLSymbol $doc_annotator_id_term_fbc_path$ = makeSymbol("*DOC-ANNOTATOR-ID-TERM-FBC-PATH*");

    // defparameter
    private static final SubLSymbol $doc_annotator_term_id_fbc$ = makeSymbol("*DOC-ANNOTATOR-TERM-ID-FBC*");

    // defparameter
    private static final SubLSymbol $doc_annotator_id_term_fbc$ = makeSymbol("*DOC-ANNOTATOR-ID-TERM-FBC*");





    // defparameter
    public static final SubLSymbol $default_document_ingester_annotation_learning_lexicons$ = makeSymbol("*DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEARNING-LEXICONS*");



    // defparameter
    public static final SubLSymbol $default_document_annotation_learning_lexicon$ = makeSymbol("*DEFAULT-DOCUMENT-ANNOTATION-LEARNING-LEXICON*");

    // defparameter
    public static final SubLSymbol $default_document_annotation_lexicon$ = makeSymbol("*DEFAULT-DOCUMENT-ANNOTATION-LEXICON*");



    // defparameter
    public static final SubLSymbol $default_document_annotation_rule_disambiguator$ = makeSymbol("*DEFAULT-DOCUMENT-ANNOTATION-RULE-DISAMBIGUATOR*");

    // defparameter
    private static final SubLSymbol $remove_pictures_regexp$ = makeSymbol("*REMOVE-PICTURES-REGEXP*");

    // defparameter
    private static final SubLSymbol $remove_hyphens_regexp$ = makeSymbol("*REMOVE-HYPHENS-REGEXP*");

    // defparameter
    private static final SubLSymbol $remove_underscores_regexp$ = makeSymbol("*REMOVE-UNDERSCORES-REGEXP*");

    // defparameter
    private static final SubLSymbol $remove_equals_regexp$ = makeSymbol("*REMOVE-EQUALS-REGEXP*");

    // defparameter
    private static final SubLSymbol $remove_dots_regexp$ = makeSymbol("*REMOVE-DOTS-REGEXP*");

    // defparameter
    private static final SubLSymbol $remove_unicode_regexp$ = makeSymbol("*REMOVE-UNICODE-REGEXP*");

    // defparameter
    private static final SubLSymbol $cached_regexps$ = makeSymbol("*CACHED-REGEXPS*");



    // defparameter
    public static final SubLSymbol $document_interpretation_default_elmt$ = makeSymbol("*DOCUMENT-INTERPRETATION-DEFAULT-ELMT*");

    // defparameter
    private static final SubLSymbol $manual_document_annotation_instructions$ = makeSymbol("*MANUAL-DOCUMENT-ANNOTATION-INSTRUCTIONS*");

    // Internal Constants
    public static final SubLString $str0$_host_george_super_index_hezbolla = makeString("/host/george/super-index-hezbollah/text");

    public static final SubLString $str1$_host_george_super_index_hezbolla = makeString("/host/george/super-index-hezbollah/sem");

    public static final SubLString $str2$_cyc_projects_ccf_document_search = makeString("/cyc/projects/ccf/document-search/doc-corpus/currently-installed-at-ccf/super-index/text");

    public static final SubLString $str3$_cyc_projects_ccf_document_search = makeString("/cyc/projects/ccf/document-search/doc-corpus/currently-installed-at-ccf/super-index/sem");

    public static final SubLString $str4$_host_achernar_daves_ccf_lucene_t = makeString("/host/achernar/daves/ccf-lucene/text");

    public static final SubLString $str5$_host_achernar_daves_ccf_lucene_s = makeString("/host/achernar/daves/ccf-lucene/sem-20070720");

    public static final SubLString $str6$_cyc_projects_ccf_document_search = makeString("/cyc/projects/ccf/document-search/doc-corpus/20091021-133607/super-index/sem/");

    public static final SubLString $str7$_cyc_projects_ccf_document_search = makeString("/cyc/projects/ccf/document-search/doc-corpus/20091021-133607/super-index/text/");

    public static final SubLList $list8 = list(makeSymbol("LIST"));

    public static final SubLSymbol $sym9$OUT = makeUninternedSymbol("OUT");





    public static final SubLSymbol $trace_doc_search_interface$ = makeSymbol("*TRACE-DOC-SEARCH-INTERFACE*");



    public static final SubLSymbol $trace_output$ = makeSymbol("*TRACE-OUTPUT*");

    public static final SubLString $str15$___A__entering__S__ = makeString("~&~A: entering ~S~%");

    public static final SubLList $list16 = list(makeSymbol("TIMESTAMP-WITH-MILLISECONDS"));

    public static final SubLSymbol $doc_search_trace_log_file$ = makeSymbol("*DOC-SEARCH-TRACE-LOG-FILE*");



    public static final SubLList $list19 = list(makeSymbol("*DOC-SEARCH-TRACE-LOG-FILE*"), makeKeyword("APPEND"));

    public static final SubLList $list20 = list(makeSymbol("WARN"), makeString("writing to ~S"), makeSymbol("*DOC-SEARCH-TRACE-LOG-FILE*"));

    public static final SubLList $list21 = list(cons(reader_make_constant_shell(makeString("genls")), makeString("g")), cons(reader_make_constant_shell(makeString("isa")), makeString("i")), cons(reader_make_constant_shell(makeString("inRegion")), makeString("r")), cons(reader_make_constant_shell(makeString("hasLeaders")), makeString("l")), cons(reader_make_constant_shell(makeString("standardTreatmentTypeForConditionType")), makeString("c")), cons(reader_make_constant_shell(makeString("ailmentTypeAfflictsPartType")), makeString("a")), cons(reader_make_constant_shell(makeString("conditionsCommonlyCooccur")), makeString("o")));

    public static final SubLList $list22 = list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("isa")), makeKeyword("SPEC"), makeKeyword("GENL")), list(reader_make_constant_shell(makeString("genls")), reader_make_constant_shell(makeString("genls")), makeKeyword("SPEC"), makeKeyword("GENL")), list(reader_make_constant_shell(makeString("inRegion")), reader_make_constant_shell(makeString("inRegion")), makeKeyword("SPEC"), makeKeyword("GENL")), list(reader_make_constant_shell(makeString("hasLeaders")), reader_make_constant_shell(makeString("hasLeaders")), makeKeyword("GENL"), makeKeyword("SPEC")), list(reader_make_constant_shell(makeString("standardTreatmentTypeForConditionType")), reader_make_constant_shell(makeString("standardTreatmentTypeForConditionType")), makeKeyword("SPEC"), makeKeyword("GENL")), list(reader_make_constant_shell(makeString("ailmentTypeAfflictsPartType")), reader_make_constant_shell(makeString("ailmentTypeAfflictsPartType")), makeKeyword("SPEC"), makeKeyword("GENL")), list(reader_make_constant_shell(makeString("conditionsCommonlyCooccur")), reader_make_constant_shell(makeString("conditionsCommonlyCooccur")), makeKeyword("SPEC"), makeKeyword("GENL")));

    public static final SubLString $str23$data_doc_tagging_upwards_closure_ = makeString("data/doc-tagging/upwards-closure-justifications.fht");



    public static final SubLString $str25$_host_george_scratch_text_index = makeString("/host/george/scratch/text-index");

    public static final SubLString $str26$_host_george_scratch_sem_index = makeString("/host/george/scratch/sem-index");

    public static final SubLString $str27$_host_george_simple_tagged_index_ = makeString("/host/george/simple-tagged-index/textual");

    public static final SubLString $str28$_host_george_simple_tagged_index_ = makeString("/host/george/simple-tagged-index/semantic");

    public static final SubLString $str29$_host_george_disambiguated_index_ = makeString("/host/george/disambiguated-index/text");

    public static final SubLString $str30$_host_george_disambiguated_index_ = makeString("/host/george/disambiguated-index/sem");





    public static final SubLSymbol TERM_LEARNER_OBJECT_FROM_ID = makeSymbol("TERM-LEARNER-OBJECT-FROM-ID");

    public static final SubLSymbol $term_learner_object_from_id_caching_state$ = makeSymbol("*TERM-LEARNER-OBJECT-FROM-ID-CACHING-STATE*");





    private static final SubLSymbol TERM_LEARNER_ID = makeSymbol("TERM-LEARNER-ID");

    private static final SubLSymbol $term_learner_id_caching_state$ = makeSymbol("*TERM-LEARNER-ID-CACHING-STATE*");

    private static final SubLList $list39 = list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), reader_make_constant_shell(makeString("CCF-CAEQueryMt")));

    private static final SubLSymbol GET_UPWARDS_CLOSURE_JUSTIFICATIONS = makeSymbol("GET-UPWARDS-CLOSURE-JUSTIFICATIONS");

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLObject $const42$standardTreatmentTypeForCondition = reader_make_constant_shell(makeString("standardTreatmentTypeForConditionType"));

    private static final SubLObject $$ailmentTypeAfflictsPartType = reader_make_constant_shell(makeString("ailmentTypeAfflictsPartType"));

    private static final SubLObject $$conditionsCommonlyCooccur = reader_make_constant_shell(makeString("conditionsCommonlyCooccur"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$inRegion = reader_make_constant_shell(makeString("inRegion"));

    private static final SubLObject $$hasLeaders = reader_make_constant_shell(makeString("hasLeaders"));

    private static final SubLSymbol GET_UPWARDS_CLOSURE_JUSTIFICATIONS_CACHED = makeSymbol("GET-UPWARDS-CLOSURE-JUSTIFICATIONS-CACHED");



    private static final SubLSymbol $get_upwards_closure_justifications_cached_caching_state$ = makeSymbol("*GET-UPWARDS-CLOSURE-JUSTIFICATIONS-CACHED-CACHING-STATE*");

    private static final SubLString $str51$_cyc_top_data_doc_tagging_upwards = makeString("/cyc/top/data/doc-tagging/upwards-closure-justifications.fht");

    private static final SubLSymbol $IMAGE_INDEPENDENT_CFASL = makeKeyword("IMAGE-INDEPENDENT-CFASL");

    private static final SubLString $str53$Caching_upwards_closure_justifica = makeString("Caching upwards-closure justifications");

    private static final SubLObject $$MedicalDevice = reader_make_constant_shell(makeString("MedicalDevice"));

    private static final SubLObject $$MedicalTreatmentEvent = reader_make_constant_shell(makeString("MedicalTreatmentEvent"));

    private static final SubLObject $$AilmentCondition = reader_make_constant_shell(makeString("AilmentCondition"));

    private static final SubLObject $$IntelligentAgent = reader_make_constant_shell(makeString("IntelligentAgent"));

    private static final SubLSymbol GET_TREATED_CONDITION = makeSymbol("GET-TREATED-CONDITION");

    private static final SubLSymbol $sym59$_X = makeSymbol("?X");

    private static final SubLObject $$or = reader_make_constant_shell(makeString("or"));

    private static final SubLObject $$deviceTypeTreatsConditionType = reader_make_constant_shell(makeString("deviceTypeTreatsConditionType"));

    private static final SubLList $list62 = list(makeSymbol("?X"));

    private static final SubLList $list63 = list(makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("ALL"));

    private static final SubLSymbol $get_treated_condition_caching_state$ = makeSymbol("*GET-TREATED-CONDITION-CACHING-STATE*");

    private static final SubLSymbol CLEAR_GET_TREATED_CONDITION = makeSymbol("CLEAR-GET-TREATED-CONDITION");

    private static final SubLSymbol GET_TREATMENTS_FOR_CONDITION = makeSymbol("GET-TREATMENTS-FOR-CONDITION");

    private static final SubLSymbol $get_treatments_for_condition_caching_state$ = makeSymbol("*GET-TREATMENTS-FOR-CONDITION-CACHING-STATE*");

    private static final SubLSymbol CLEAR_GET_TREATMENTS_FOR_CONDITION = makeSymbol("CLEAR-GET-TREATMENTS-FOR-CONDITION");

    private static final SubLSymbol GET_AFFECTED_PARTS = makeSymbol("GET-AFFECTED-PARTS");

    private static final SubLSymbol $get_affected_parts_caching_state$ = makeSymbol("*GET-AFFECTED-PARTS-CACHING-STATE*");

    private static final SubLSymbol CLEAR_GET_AFFECTED_PARTS = makeSymbol("CLEAR-GET-AFFECTED-PARTS");

    private static final SubLSymbol GET_COOCCURRING_CONDITIONS = makeSymbol("GET-COOCCURRING-CONDITIONS");

    private static final SubLSymbol $get_cooccurring_conditions_caching_state$ = makeSymbol("*GET-COOCCURRING-CONDITIONS-CACHING-STATE*");

    private static final SubLSymbol CLEAR_GET_COOCCURRING_CONDITIONS = makeSymbol("CLEAR-GET-COOCCURRING-CONDITIONS");

    private static final SubLSymbol $sym75$_GROUP = makeSymbol("?GROUP");

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLSymbol LEADERS_TO_GROUPS = makeSymbol("LEADERS-TO-GROUPS");

    private static final SubLList $list78 = cons(makeSymbol("LEADER"), makeSymbol("GROUP"));

    private static final SubLList $list79 = cons(makeSymbol("?LEADER"), makeSymbol("?GROUP"));

    public static final SubLList $list80 = list(reader_make_constant_shell(makeString("hasLeaders")), makeSymbol("?GROUP"), makeSymbol("?LEADER"));

    private static final SubLSymbol $leaders_to_groups_caching_state$ = makeSymbol("*LEADERS-TO-GROUPS-CACHING-STATE*");

    private static final SubLSymbol CITIES_TO_COUNTRIES = makeSymbol("CITIES-TO-COUNTRIES");

    private static final SubLString $str83$Caching_countries_of_all_cities__ = makeString("Caching countries of all cities...");

    private static final SubLList $list84 = cons(makeSymbol("?CITY"), makeSymbol("?COUNTRY"));

    private static final SubLList $list85 = list(reader_make_constant_shell(makeString("countryOfCity")), makeSymbol("?COUNTRY"), makeSymbol("?CITY"));

    public static final SubLList $list86 = cons(makeSymbol("CITY"), makeSymbol("COUNTRY"));

    private static final SubLSymbol $cities_to_countries_caching_state$ = makeSymbol("*CITIES-TO-COUNTRIES-CACHING-STATE*");

    private static final SubLSymbol $sym88$_COUNTRY = makeSymbol("?COUNTRY");

    private static final SubLObject $$countryOfCity = reader_make_constant_shell(makeString("countryOfCity"));

    private static final SubLSymbol $sym90$_REGION = makeSymbol("?REGION");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLList $list92 = list(reader_make_constant_shell(makeString("isa")), makeSymbol("?COUNTRYTYPE"), reader_make_constant_shell(makeString("CountryTypeByGeneralRegion")));

    private static final SubLList $list93 = list(makeSymbol("?COUNTRYTYPE"));

    public static final SubLList $list94 = list(list(reader_make_constant_shell(makeString("regionOfCountryTypeByGeneralRegion")), makeSymbol("?COUNTRYTYPE"), makeSymbol("?REGION")));

    private static final SubLSymbol COUNTRIES_TO_REGIONS = makeSymbol("COUNTRIES-TO-REGIONS");

    public static final SubLList $list96 = cons(makeSymbol("COUNTRY"), makeSymbol("REGION"));

    private static final SubLList $list97 = cons(makeSymbol("?COUNTRY"), makeSymbol("?REGION"));

    public static final SubLList $list98 = list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?COUNTRYTYPE"), reader_make_constant_shell(makeString("CountryTypeByGeneralRegion"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?COUNTRY"), makeSymbol("?COUNTRYTYPE")), list(reader_make_constant_shell(makeString("regionOfCountryTypeByGeneralRegion")), makeSymbol("?COUNTRYTYPE"), makeSymbol("?REGION")));

    private static final SubLSymbol $countries_to_regions_caching_state$ = makeSymbol("*COUNTRIES-TO-REGIONS-CACHING-STATE*");

    public static final SubLList $list100 = list(list(makeSymbol("SEMANTIC-SESSION"), makeSymbol("KEYWORD-SESSION"), makeSymbol("HOST"), makeSymbol("PORT"), makeSymbol("TEXT-INDEX-FILE"), makeSymbol("SEM-INDEX-FILE"), makeSymbol("OVERWRITE?")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol NEW_LUCENE_SESSION = makeSymbol("NEW-LUCENE-SESSION");





    private static final SubLSymbol LUCENE_OPTIMIZE = makeSymbol("LUCENE-OPTIMIZE");

    private static final SubLSymbol LUCENE_FINALIZE = makeSymbol("LUCENE-FINALIZE");

    private static final SubLString $str107$_indexed_docs_txt = makeString("/indexed-docs.txt");



    private static final SubLString $$$Indexing_files = makeString("Indexing files");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLString $str111$ = makeString("");



    private static final SubLString $str113$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str114$_A__ = makeString("~A~%");

    private static final SubLString $str115$_host_george_scratch_tagged_xml_d = makeString("/host/george/scratch/tagged-xml-docs/");

    private static final SubLString $$$title = makeString("title");

    private static final SubLString $str117$_title_ = makeString("<title>");

    private static final SubLString $str118$__title_ = makeString("</title>");

    private static final SubLString $$$text = makeString("text");

    private static final SubLString $str120$_text_ = makeString("<text>");

    private static final SubLString $str121$__text_ = makeString("</text>");

    private static final SubLString $$$keystring = makeString("keystring");

    private static final SubLString $str123$_keystring_ = makeString("<keystring>");

    private static final SubLString $str124$_confirmed_concept_keystring_ = makeString("<confirmed_concept_keystring>");

    private static final SubLString $str125$original_filename = makeString("original_filename");

    private static final SubLString $str126$_original_filename_ = makeString("<original_filename>");

    private static final SubLString $$$url = makeString("url");

    private static final SubLString $str128$_url_ = makeString("<url>");

    private static final SubLString $str129$__url_ = makeString("</url>");

    private static final SubLString $str130$parent_filename = makeString("parent_filename");

    private static final SubLString $str131$_parent_filename_ = makeString("<parent_filename>");

    private static final SubLString $$$sem = makeString("sem");

    private static final SubLString $str133$_host_george_scratch_tagged_docs_ = makeString("/host/george/scratch/tagged-docs/");

    private static final SubLString $$$Tagging_files = makeString("Tagging files");





    private static final SubLList $list137 = list(makeSymbol("ORG-FILE"), makeSymbol("TEXT-FPATH"), makeSymbol("&OPTIONAL"), makeSymbol("THE-URL"), makeSymbol("THE-PARENT"));

    private static final SubLString $str138$_S_tagging__S__ = makeString("~S tagging ~S~%");

    private static final SubLString $str139$_txt = makeString(".txt");

    private static final SubLString $str140$_cyc_idx = makeString(".cyc-idx");

    private static final SubLList $list141 = list(makeSymbol("TITLE"), makeSymbol("DOC-TEXT"));

    private static final SubLString $str142$_ = makeString("#");

    public static final SubLString $str143$_ = makeString("^");



    private static final SubLString $$$Doc = makeString("Doc");

    private static final SubLString $str146$There_is_no_text_in_the_body_of_t = makeString("There is no text in the body of this doc.  Please remove it from the corpus.~%");

    private static final SubLString $str147$Couldn_t_find_source_file__S__Mov = makeString("Couldn't find source file ~S. Moving on to next file.");





    private static final SubLList $list150 = list(makeSymbol("IDX-FILE"), makeSymbol("TXT-FILE"));



    private static final SubLString $str152$problem_indexing__a_____moving_on = makeString("problem indexing ~a  ...moving on to next file: ~A");

    private static final SubLString $str153$http___doc_cyc_com_ = makeString("http://doc.cyc.com/");

    private static final SubLString $str154$_cyc_ = makeString("/cyc/");

    private static final SubLString $str155$title___S__ = makeString("title: ~S~%");

    private static final SubLString $str156$url___S__ = makeString("url: ~S~%");

    private static final SubLSymbol LUCENE_ADD_DOCUMENT = makeSymbol("LUCENE-ADD-DOCUMENT");



    private static final SubLString $$$_ = makeString(" ");

    private static final SubLSymbol POS_TAGGING_CONCEPT_TAGGER = makeSymbol("POS-TAGGING-CONCEPT-TAGGER");







    private static final SubLSymbol $sym164$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol FIND_CONCEPTS_FOR_DOCUMENT_SEGMENTS = makeSymbol("FIND-CONCEPTS-FOR-DOCUMENT-SEGMENTS");

    private static final SubLString $$$Mww = makeString("Mww");

    private static final SubLString $str167$writing_to__S = makeString("writing to ~S");

    private static final SubLSymbol TAG_DOCUMENT_NODES_FOR_DISPLAY = makeSymbol("TAG-DOCUMENT-NODES-FOR-DISPLAY");

    private static final SubLString $$$full = makeString("full");

    private static final SubLList $list170 = list(makeSymbol("NODE-ID"), makeSymbol("STRING"));

    private static final SubLString $str171$_ua0_ = makeString("&ua0;");

    private static final SubLSymbol $sym172$_ = makeSymbol("<");





    private static final SubLList $list175 = list(makeSymbol("NODE-ID"), makeSymbol("OFFSET"));

    private static final SubLObject $$InstanceNamedFn_Ternary = reader_make_constant_shell(makeString("InstanceNamedFn-Ternary"));

    public static final SubLList $list177 = list(reader_make_constant_shell(makeString("Person")), reader_make_constant_shell(makeString("Organization")), reader_make_constant_shell(makeString("Place")));

    private static final SubLSymbol FIND_INTERPS_FOR_DOCUMENT_SEGMENTS = makeSymbol("FIND-INTERPS-FOR-DOCUMENT-SEGMENTS");

    private static final SubLString $$$dogs_have_four_feet = makeString("dogs have four feet");

    private static final SubLList $list180 = list(reader_make_constant_shell(makeString("relationAllExistsCount")), reader_make_constant_shell(makeString("physicalParts")), reader_make_constant_shell(makeString("Foot-AnimalBodyPart")), reader_make_constant_shell(makeString("Dog")), FOUR_INTEGER);



    private static final SubLObject $$Verb = reader_make_constant_shell(makeString("Verb"));

    private static final SubLObject $$Adjective = reader_make_constant_shell(makeString("Adjective"));

    private static final SubLObject $$Adverb = reader_make_constant_shell(makeString("Adverb"));

    private static final SubLObject $$Gerundive = reader_make_constant_shell(makeString("Gerundive"));

    private static final SubLSymbol ADD_CONCEPT_FILTER_SPEC = makeSymbol("ADD-CONCEPT-FILTER-SPEC");

    private static final SubLList $list187 = list(reader_make_constant_shell(makeString("ConceptFilterSpecificationFn")), reader_make_constant_shell(makeString("CCFExplanationWorthyConceptFilter")), reader_make_constant_shell(makeString("ConceptAndInstancesFilterParameter")), reader_make_constant_shell(makeString("TriggerFromConceptOrInstance")));

    private static final SubLString $str188$_tagged_html = makeString("-tagged.html");

    private static final SubLString $str189$_span_property__cyc_termName__con = makeString("<span property='cyc:termName' content='");

    private static final SubLString $str190$___span_class__cycTerm__id__cycTe = makeString("'><span class='cycTerm' id='cycTerm");

    private static final SubLString $str191$__property__cyc_termId__content__ = makeString("' property='cyc:termId' content='");

    private static final SubLString $str192$__ = makeString("'>");

    private static final SubLString $str193$__span___span_ = makeString("</span></span>");

    private static final SubLList $list194 = list(makeSymbol("MAP-STRING-INDEX"), makeSymbol("MAP-STRING-END-INDEX"));

    private static final SubLString $str195$http___sw_cyc_com_concept_ = makeString("http://sw.cyc.com/concept/");

    private static final SubLList $list196 = list(makeString("script"), makeString("style"), makeString("iframe"), makeString("select"), makeString("noscript"), makeString("pre"), makeString("code"));

    private static final SubLString $$$s = makeString("s");

    private static final SubLString $$$t = makeString("t");

    private static final SubLString $str199$data_doc_tagging_term_id_fht = makeString("data/doc-tagging/term-id.fht");

    private static final SubLString $str200$data_doc_tagging_id_term_fht = makeString("data/doc-tagging/id-term.fht");

    private static final SubLString $str201$Meaning__ = makeString("Meaning: ");

    private static final SubLString $str202$_ = makeString("(");

    private static final SubLString $str203$__ = makeString(", ");

    private static final SubLString $str204$_ = makeString(")");

    private static final SubLSymbol GENERATE_RETRIEVAL_JUSTIFICATION_FROM_JUSTIFICATION_STRING = makeSymbol("GENERATE-RETRIEVAL-JUSTIFICATION-FROM-JUSTIFICATION-STRING");

    private static final SubLString $str206$Text_Match__ = makeString("Text Match: ");

    private static final SubLString $str207$Invalid_justification_string___S = makeString("Invalid justification string: ~S");

    private static final SubLSymbol GENERATE_TERM_EXPLANATION = makeSymbol("GENERATE-TERM-EXPLANATION");



    private static final SubLObject $$userDocComment = reader_make_constant_shell(makeString("userDocComment"));

    private static final SubLObject $$CCF_CAE_QueryMt = reader_make_constant_shell(makeString("CCF-CAE-QueryMt"));



    private static final SubLList $list213 = list(makeKeyword("PPH-AGREEMENT"), list(reader_make_constant_shell(makeString("nonPlural-Generic"))), makeKeyword("PPH-GENERATION-COUNT"), EIGHT_INTEGER);

    private static final SubLString $str214$_b_Synonyms__b___ = makeString("<b>Synonyms</b>: ");

    private static final SubLString $str215$_b_ = makeString("<b>");

    private static final SubLString $str216$__b___ = makeString("</b>: ");

    private static final SubLString $str217$_br_ = makeString("<br>");

    private static final SubLString $str218$_div_style__background_color__whi = makeString("<div style=\"background-color: white; margin-left: 3em; margin-right: 3em\">");

    private static final SubLString $str219$__div_ = makeString("</div>");

    private static final SubLObject $$SurgicalProcedure = reader_make_constant_shell(makeString("SurgicalProcedure"));

    private static final SubLObject $$Surgery = reader_make_constant_shell(makeString("Surgery"));

    private static final SubLSymbol $sym222$_DOC = makeSymbol("?DOC");

    private static final SubLObject $$expertAtSkill = reader_make_constant_shell(makeString("expertAtSkill"));

    private static final SubLObject $$CCFPersonnelDataMt = reader_make_constant_shell(makeString("CCFPersonnelDataMt"));

    private static final SubLString $str225$_b_Specialists____b_ = makeString("<b>Specialists: </b>");

    private static final SubLSymbol DOCUMENT_ANNOTATION_TERM_ID = makeSymbol("DOCUMENT-ANNOTATION-TERM-ID");

    private static final SubLSymbol $document_annotation_term_id_caching_state$ = makeSymbol("*DOCUMENT-ANNOTATION-TERM-ID-CACHING-STATE*");

    private static final SubLInteger $int$25000 = makeInteger(25000);

    private static final SubLSymbol DOCUMENT_ANNOTATION_TERM_FROM_ID = makeSymbol("DOCUMENT-ANNOTATION-TERM-FROM-ID");

    private static final SubLSymbol $document_annotation_term_from_id_caching_state$ = makeSymbol("*DOCUMENT-ANNOTATION-TERM-FROM-ID-CACHING-STATE*");

    private static final SubLInteger $int$5000 = makeInteger(5000);

    private static final SubLObject $$PredicateTaxonomy = reader_make_constant_shell(makeString("PredicateTaxonomy"));

    private static final SubLList $list233 = list(reader_make_constant_shell(makeString("ConceptFilterSpecificationFn")), reader_make_constant_shell(makeString("PredicateTaxonomy")), reader_make_constant_shell(makeString("ConceptOnlyFilterParameter")), reader_make_constant_shell(makeString("TriggerFromConcept")));

    private static final SubLString $$$vocabMarking = makeString("vocabMarking");





    private static final SubLSymbol GET_DEFAULT_DOCUMENT_INGESTER_ANNOTATION_LEXICON = makeSymbol("GET-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEXICON");







    private static final SubLObject $$countryCodeTrigraph = reader_make_constant_shell(makeString("countryCodeTrigraph"));

    private static final SubLObject $$countryCodeDigraph = reader_make_constant_shell(makeString("countryCodeDigraph"));

    private static final SubLSymbol ALLOW_POS = makeSymbol("ALLOW-POS");

    private static final SubLObject $$ClosedClassWord = reader_make_constant_shell(makeString("ClosedClassWord"));

    private static final SubLSymbol SCALAR_INTERVAL_LEARN = makeSymbol("SCALAR-INTERVAL-LEARN");

    private static final SubLSymbol DATE_LEARN = makeSymbol("DATE-LEARN");

    private static final SubLSymbol $get_default_document_ingester_annotation_lexicon_caching_state$ = makeSymbol("*GET-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEXICON-CACHING-STATE*");

    private static final SubLSymbol GET_DEFAULT_DOCUMENT_ANNOTATION_LEXICON = makeSymbol("GET-DEFAULT-DOCUMENT-ANNOTATION-LEXICON");

    private static final SubLSymbol $get_default_document_annotation_lexicon_caching_state$ = makeSymbol("*GET-DEFAULT-DOCUMENT-ANNOTATION-LEXICON-CACHING-STATE*");









    private static final SubLObject $$preferredNameString = reader_make_constant_shell(makeString("preferredNameString"));

    private static final SubLObject $$ksTermString = reader_make_constant_shell(makeString("ksTermString"));

    private static final SubLObject $$alias = reader_make_constant_shell(makeString("alias"));

    private static final SubLObject $$programStrings = reader_make_constant_shell(makeString("programStrings"));

    private static final SubLObject $$airportHasIATACode = reader_make_constant_shell(makeString("airportHasIATACode"));

    private static final SubLObject $$airportHasICAOCode = reader_make_constant_shell(makeString("airportHasICAOCode"));

    private static final SubLSymbol SET_BASE_MT = makeSymbol("SET-BASE-MT");



    private static final SubLObject $$TechnicalEnglishLexicalMt = reader_make_constant_shell(makeString("TechnicalEnglishLexicalMt"));

    private static final SubLObject $$MedicalLexicalMt = reader_make_constant_shell(makeString("MedicalLexicalMt"));

    private static final SubLString $$$CCFLexicalMt = makeString("CCFLexicalMt");

    private static final SubLObject $$CCFLexicalMt = reader_make_constant_shell(makeString("CCFLexicalMt"));

    private static final SubLList $list266 = list(reader_make_constant_shell(makeString("ConceptFilterSpecificationFn")), reader_make_constant_shell(makeString("TaxonomyOfEasilyUnderstandableConcepts")), reader_make_constant_shell(makeString("ConceptOnlyFilterParameter")), reader_make_constant_shell(makeString("TriggerFromConcept")));



    private static final SubLString $str268$rebuilding_term_id_FHT = makeString("rebuilding term-id FHT");



    private static final SubLString $str270$Rebuilding_id__term_map = makeString("Rebuilding id->term map");

    private static final SubLString $str271$Augmenting_term_id_FHT = makeString("Augmenting term-id FHT");





    private static final SubLList $list274 = list(makeKeyword("SEARCH-TYPE"), makeKeyword("TEXT"));





    private static final SubLSymbol LUCENE_DOUBLE_QUERY = makeSymbol("LUCENE-DOUBLE-QUERY");

    private static final SubLString $str278$0_0_t___ = makeString("0#0#t\\\\^");

    private static final SubLString $str279$0_0_s___ = makeString("0#0#s\\\\^");

    private static final SubLSymbol TERMS_FOR_CYC_SEMANTIC_QUERY = makeSymbol("TERMS-FOR-CYC-SEMANTIC-QUERY");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $str283$_cyc_projects_doc_annotation_quer = makeString("/cyc/projects/doc-annotation/query-logs/log.txt");

    private static final SubLString $str284$_A___S__ = makeString("~A: ~S~%");

    private static final SubLSymbol $sym285$STOPWORD_IN_SEM_QUERY_ = makeSymbol("STOPWORD-IN-SEM-QUERY?");

    private static final SubLSymbol REMOVE_CDAR = makeSymbol("REMOVE-CDAR");

    private static final SubLSymbol CADAR = makeSymbol("CADAR");

    private static final SubLString $str288$0_0_s = makeString("0#0#s");



    private static final SubLSymbol TERMS_FOR_FOCUSED_CYC_SEMANTIC_QUERY = makeSymbol("TERMS-FOR-FOCUSED-CYC-SEMANTIC-QUERY");

    private static final SubLList $list291 = list(makeSymbol("WORD"), makeSymbol("DETAILS"));

    private static final SubLString $str292$_____a_z0_9A_Z_________ = makeString("[\\[][a-z0-9A-Z._:]*[\\]]");

    private static final SubLString $str293$__ = makeString("--");

    private static final SubLString $str294$__ = makeString("__");

    private static final SubLString $str295$__ = makeString("==");

    private static final SubLString $str296$_____________ = makeString("[.][.][.][.]+");

    private static final SubLString $str297$__0_9a_fA_F___ = makeString("&[0-9a-fA-F]+;");





    private static final SubLList $list300 = list(list(makeSymbol("FORT"), makeSymbol("LEXICON")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym301$SEEN_ = makeUninternedSymbol("SEEN?");

    private static final SubLList $list302 = list(list(makeSymbol("MAKE-HASH-TABLE"), makeInteger(1024), list(makeSymbol("QUOTE"), EQUAL)));

    private static final SubLSymbol DO_LEXICON = makeSymbol("DO-LEXICON");





    private static final SubLList $list306 = list(makeSymbol("IGNORE"), makeSymbol("STRING"));



    private static final SubLList $list308 = list(list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("DENOT")));







    private static final SubLList $list312 = list(T);

    private static final SubLString $str313$_A___A__ = makeString("~A. ~A~%");

    private static final SubLString $str314$____A__ = makeString("   ~A: ");

    private static final SubLString $str315$_A_ = makeString("~A ");

    private static final SubLString $str316$__ = makeString("~%");

    private static final SubLSymbol REMOVE_PICTURES_REGEXP_TEST = makeSymbol("REMOVE-PICTURES-REGEXP-TEST");













    private static final SubLList $list324 = list(list(list(makeString("some text and [a_picture.png] followed by some other stuff")), list(makeString("[a_picture.png]"))));

    private static final SubLSymbol GET_DOC_STRING_FROM_NODE_IDS_AND_STRINGS_VALUES = makeSymbol("GET-DOC-STRING-FROM-NODE-IDS-AND-STRINGS-VALUES");

    private static final SubLList $list326 = list(list(list(list(list(ZERO_INTEGER, makeString("this")), list(ONE_INTEGER, makeString(" is ")), list(TWO_INTEGER, makeString("a ")), list(THREE_INTEGER, makeString("cat")))), list(makeString("this is a cat"), list(list(ZERO_INTEGER, ZERO_INTEGER), list(ONE_INTEGER, FOUR_INTEGER), list(TWO_INTEGER, EIGHT_INTEGER), list(THREE_INTEGER, TEN_INTEGER)))), list(list(list(list(ZERO_INTEGER, makeString("this")), list(ONE_INTEGER, makeString(" is ")), list(TWO_INTEGER, makeString("a cat")))), list(makeString("this is a cat"), list(list(ZERO_INTEGER, ZERO_INTEGER), list(ONE_INTEGER, FOUR_INTEGER), list(TWO_INTEGER, EIGHT_INTEGER)))));

    private static final SubLSymbol $document_interpretation_rules_by_mt$ = makeSymbol("*DOCUMENT-INTERPRETATION-RULES-BY-MT*");

    private static final SubLObject $$PiracyReportInterpretationMt = reader_make_constant_shell(makeString("PiracyReportInterpretationMt"));

    private static final SubLList $list329 = list(list(makeSymbol("RULE"), makeSymbol("RULE-SET")), makeSymbol("&BODY"), makeSymbol("BODY"));





    private static final SubLString $str332$Dont_know_yet_how_to_unify_a_sent = makeString("Dont know yet how to unify a sentence with the sentence bag.");

    private static final SubLString $str333$Dont_know_how_to_deal_with_test__ = makeString("Dont know how to deal with test ~A.");





    private static final SubLObject $$interpretationSuggestion = reader_make_constant_shell(makeString("interpretationSuggestion"));













    private static final SubLObject $$containsProposition_CW = reader_make_constant_shell(makeString("containsProposition-CW"));

    private static final SubLObject $$thingDescribed = reader_make_constant_shell(makeString("thingDescribed"));

    private static final SubLObject $$The = reader_make_constant_shell(makeString("The"));

    private static final SubLString $str346$Invalid_THE_expression__A___ = makeString("Invalid THE expression ~A.~%");

    private static final SubLString $str347$Dont_know_how_to_handle_precondit = makeString("Dont know how to handle precondition operator ~A in ~A.");

    private static final SubLString $str348$If_it_is_the_case_that__ = makeString("If it is the case that: ");

    private static final SubLString $str349$then_one_might_conclude_that__ = makeString("then one might conclude that: ");

    private static final SubLString $$$mt = makeString("mt");

    private static final SubLString $str351$Document_Interpretation_Suggestio = makeString("Document Interpretation Suggestions");

    private static final SubLString $str352$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str353$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");



    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");



    private static final SubLString $str357$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $str362$Enter_the_text_to_interpret_ = makeString("Enter the text to interpret.");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str364$cb_document_interpretation_sugges = makeString("cb-document-interpretation-suggestions");

    private static final SubLString $$$Submit = makeString("Submit");

    private static final SubLString $$$Clear = makeString("Clear");

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLString $str368$Rule_Mt__ = makeString("Rule Mt: ");

    private static final SubLInteger $int$40 = makeInteger(40);

    private static final SubLString $$$Complete = makeString("Complete");

    private static final SubLObject $$Microtheory = reader_make_constant_shell(makeString("Microtheory"));

    private static final SubLString $$$Identified_Concepts = makeString("Identified Concepts");

    private static final SubLString $$$Suggested_Concepts = makeString("Suggested Concepts");

    private static final SubLString $$$Suggested_Sentences = makeString("Suggested Sentences");

    private static final SubLString $$$Applied_Rules = makeString("Applied Rules");

    private static final SubLSymbol CB_DOCUMENT_INTERPRETATION_SUGGESTIONS = makeSymbol("CB-DOCUMENT-INTERPRETATION-SUGGESTIONS");



    private static final SubLString $str378$For_each_string____concept_mappin = makeString("For each string -> concept mapping, rate the mapping. <ul><li>\'Primary Meaning\' means that, acontextually, this is what one would think of when seeing the string.  Most words will only have one primary meaning.\n<li>\'Contextually Dependent\' means that this is a reasonable mapping, but would not be the primary mapping.  It would really only be used when there is something else in the context to license the meaning.\n<li>\'Rare\' means that, while the string could mean this, it\'s fairly hard to imagine contexts in which it would mean this, and we could effectively treat this as not being mapped.\n<li>\'Indecipherable\' means that this concept is not something that a user is ever likely to be able to understand, and should suppress the entire concept when interacting with end users.\n<li>\'Merge away\' should be used when the concept itself should not exist.   For example, when we have both  #$EducationalOrganization-Rutgers-University and #$RutgersUniversity, one of them should be merged away, and the other should be the primary meaning.\n<li>\'Invalid\' means that the mapping between the string and the concept is faulty, and should likely be eliminated.</ul>");

    private static final SubLString $str379$previous_input_file = makeString("previous-input-file");

    private static final SubLString $str380$input_file = makeString("input-file");

    private static final SubLString $str381$next_index = makeString("next-index");

    private static final SubLString $$$0 = makeString("0");

    private static final SubLInteger $int$30 = makeInteger(30);

    private static final SubLString $$$Manual_Concept_Annotation = makeString("Manual Concept Annotation");

    private static final SubLString $str385$cb_annotate_tagged_concepts = makeString("cb-annotate-tagged-concepts");

    private static final SubLString $str386$Tagging_File_Name__ = makeString("Tagging File Name: ");

    private static final SubLString $str387$tr__border_color__black__________ = makeString("tr {border-color: black}\n                                .first {border-top-width: 10}\n                                .first td {border-top-width: 5; border-top-color: gray}");

    private static final SubLList $list388 = list(makeSymbol("TEXT"), makeSymbol("&REST"), makeSymbol("STRINGS-AND-CONCEPTS"));

    private static final SubLString $$$first = makeString("first");

    private static final SubLString $$$other = makeString("other");

    private static final SubLString $str391$_S = makeString("~S");

    private static final SubLString $str392$frequency___S__ = makeString("frequency: ~S~%");

    private static final SubLString $str393$30_ = makeString("30%");

    private static final SubLString $str394$_CCFFCC = makeString("#CCFFCC");

    private static final SubLString $$$primary = makeString("primary");

    private static final SubLString $$$Primary_Meaning___ = makeString("Primary Meaning   ");

    private static final SubLString $str397$_CCFFFF = makeString("#CCFFFF");

    private static final SubLString $$$contextual = makeString("contextual");

    private static final SubLString $$$Contextually_Dependent___ = makeString("Contextually Dependent   ");

    private static final SubLString $str400$_FFCCFF = makeString("#FFCCFF");

    private static final SubLString $str401$very_rare = makeString("very-rare");

    private static final SubLString $$$Rare___ = makeString("Rare   ");

    private static final SubLString $str403$_FFCCCC = makeString("#FFCCCC");

    private static final SubLString $$$indecipherable = makeString("indecipherable");

    private static final SubLString $$$Indecipherable__ = makeString("Indecipherable  ");

    private static final SubLString $str406$_FFFFCC = makeString("#FFFFCC");

    private static final SubLString $str407$merge_candidate = makeString("merge-candidate");

    private static final SubLString $$$Merge_away = makeString("Merge away");

    private static final SubLString $str409$_CCCCFF = makeString("#CCCCFF");

    private static final SubLString $str410$kill_candidate = makeString("kill-candidate");

    private static final SubLString $$$Invalid = makeString("Invalid");

    private static final SubLSymbol CB_ANNOTATE_TAGGED_CONCEPTS = makeSymbol("CB-ANNOTATE-TAGGED-CONCEPTS");

    private static final SubLString $str413$_out = makeString(".out");

    private static final SubLString $str414$_A__A__A__ = makeString("~A ~A ~A~%");



    private static final SubLString $str416$_ = makeString(".");

    private static final SubLString $str417$_cyc_projects_sabre_data_july_200 = makeString("/cyc/projects/sabre/data/july-2007-questions-answers-profiles-activities/combined-sabre-local-for-manual-annotation.txt.out");

    public static final SubLList $list418 = list(CHAR_space);

    private static final SubLString $str419$_ = makeString("\"");

    private static final SubLList $list420 = list(makeSymbol("HL-ID"), makeSymbol("JUDGMENT"), makeSymbol("&REST"), makeSymbol("IGNORE"));

    private static final SubLString $str421$_cyc_projects_sabre_data_july_200 = makeString("/cyc/projects/sabre/data/july-2007-questions-answers-profiles-activities/combined-sabre-local-for-manual-annotation.txt");

    private static final SubLList $list422 = list(makeSymbol("TERM"), makeSymbol("JUDGMENT"));

    private static final SubLList $list423 = list(makeSymbol("INTERMED-TERM"), makeSymbol("INTERMED-JUDGMENT"));

    private static final SubLList $list424 = list(makeSymbol("TERM"), makeSymbol("JUDGMENT"), makeSymbol("STRING"));

    private static final SubLString $str425$f_____strengthOfLexicalMapping_ = makeString("f: (#$strengthOfLexicalMapping ");

    private static final SubLString $str426$___PrimaryLexicalMapping__ = makeString(" #$PrimaryLexicalMapping).");

    private static final SubLString $str427$___VanishinglyRareLexicalMapping_ = makeString(" #$VanishinglyRareLexicalMapping).");

    private static final SubLString $str428$___ContextuallyDependentLexicalMa = makeString(" #$ContextuallyDependentLexicalMapping).");

    private static final SubLString $str429$kill__ = makeString("kill: ");

    public static final SubLList $list430 = list(makeSymbol("ID"), makeSymbol("URL"), makeSymbol("FILEDIR"), makeSymbol("TIME-STAMP"));

    private static final SubLString $str431$input_file_line___S__ = makeString("input-file-line: ~S~%");

    private static final SubLList $list432 = list(list(reader_make_constant_shell(makeString("ConceptFilterSpecificationFn")), reader_make_constant_shell(makeString("TaxonomyOfEasilyUnderstandableConcepts")), reader_make_constant_shell(makeString("ConceptOnlyFilterParameter")), reader_make_constant_shell(makeString("TriggerFromConcept"))));

    private static final SubLString $str433$__S__S__S___ = makeString("(~S ~S ~S)~%");

    public static SubLObject trace_doc_search(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject list = NIL;
        destructuring_bind_must_consp(current, datum, $list8);
        list = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject out = $sym9$OUT;
            return list(PROGN, list(PWHEN, $trace_doc_search_interface$, list(FORMAT, $trace_output$, $str15$___A__entering__S__, $list16, list)), list(PWHEN, $doc_search_trace_log_file$, list(WITH_PRIVATE_TEXT_FILE, bq_cons(out, $list19), $list20, list(FORMAT, out, $str15$___A__entering__S__, $list16, list))));
        }
        cdestructuring_bind_error(datum, $list8);
        return NIL;
    }

    public static SubLObject get_text_index() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $text_index_override$.getDynamicValue(thread) ? $text_index_override$.getDynamicValue(thread) : $text_index$.getDynamicValue(thread);
    }

    public static SubLObject get_semantic_index() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $semantic_index_override$.getDynamicValue(thread) ? $semantic_index_override$.getDynamicValue(thread) : $semantic_index$.getDynamicValue(thread);
    }

    public static SubLObject semantic_index_initializedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $semantic_index$.getDynamicValue(thread) == $UNINITIALIZED ? NIL : T;
    }

    public static SubLObject use_daves_temp_indexes() {
        $text_index$.setDynamicValue($str25$_host_george_scratch_text_index);
        $semantic_index$.setDynamicValue($str26$_host_george_scratch_sem_index);
        return NIL;
    }

    public static SubLObject use_development_indexes() {
        $text_index$.setDynamicValue($str27$_host_george_simple_tagged_index_);
        $semantic_index$.setDynamicValue($str28$_host_george_simple_tagged_index_);
        return NIL;
    }

    public static SubLObject use_development_disambiguated_indexes() {
        $text_index$.setDynamicValue($str29$_host_george_disambiguated_index_);
        $semantic_index$.setDynamicValue($str30$_host_george_disambiguated_index_);
        return NIL;
    }

    public static SubLObject use_hezbollah_indexes() {
        $text_index$.setDynamicValue($str0$_host_george_super_index_hezbolla);
        $semantic_index$.setDynamicValue($str1$_host_george_super_index_hezbolla);
        return NIL;
    }

    public static SubLObject new_closure_justification(final SubLObject template, final SubLObject spec, final SubLObject genl) {
        return list(template, spec, genl);
    }

    public static SubLObject get_closure_justification_gaf(final SubLObject cj) {
        return cj.first();
    }

    public static SubLObject get_closure_justification_spec(final SubLObject cj) {
        return second(cj);
    }

    public static SubLObject get_closure_justification_genl(final SubLObject cj) {
        return third(cj);
    }

    public static SubLObject closure_justification_predicate(final SubLObject justification) {
        return cycl_utilities.formula_operator(get_closure_justification_gaf(justification));
    }

    public static SubLObject closure_justification_pred_id(final SubLObject justification) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return assoc(closure_justification_predicate(justification), $predicate_id_table$.getDynamicValue(thread), EQUAL, UNPROVIDED).rest();
    }

    public static SubLObject substitute_template(final SubLObject template, final SubLObject spec, final SubLObject genl) {
        SubLObject formula = variable_subst(spec, $SPEC, template);
        formula = variable_subst(genl, $GENL, formula);
        return formula;
    }

    public static SubLObject predicate_template(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return assoc(predicate, $predicate_template_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
    }

    public static SubLObject make_justifications(final SubLObject template, final SubLObject v_term, final SubLObject v_genls) {
        SubLObject justifications = NIL;
        SubLObject cdolist_list_var = v_genls;
        SubLObject genl = NIL;
        genl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == doc_annotation_irrelevant_term(genl)) {
                justifications = cons(new_closure_justification(template, v_term, genl), justifications);
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        } 
        return justifications;
    }

    public static SubLObject doc_annotation_irrelevant_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(NIL == thcl.thcl_fortP(v_term, $doc_annotation_thcl_verboseP$.getDynamicValue(thread)));
    }

    public static SubLObject clear_term_learner_object_from_id() {
        final SubLObject cs = $term_learner_object_from_id_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_term_learner_object_from_id(final SubLObject id_string) {
        return memoization_state.caching_state_remove_function_results_with_args($term_learner_object_from_id_caching_state$.getGlobalValue(), list(id_string), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject term_learner_object_from_id_internal(final SubLObject id_string) {
        if (NIL == id_string) {
            return NIL;
        }
        return kb_utilities.maybe_find_object_by_compact_hl_external_id_string(id_string);
    }

    public static SubLObject term_learner_object_from_id(final SubLObject id_string) {
        SubLObject caching_state = $term_learner_object_from_id_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(TERM_LEARNER_OBJECT_FROM_ID, $term_learner_object_from_id_caching_state$, $int$4096, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, id_string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(term_learner_object_from_id_internal(id_string)));
            memoization_state.caching_state_put(caching_state, id_string, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject maybe_term_learner_object_from_id(final SubLObject id_string) {
        final SubLObject v_object = term_learner_object_from_id(id_string);
        if (NIL != cycl_grammar.cycl_represented_term_p(v_object)) {
            return v_object;
        }
        return NIL;
    }

    public static SubLObject get_term_learner_id_for_cycl_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject cycl = read_from_string_ignoring_errors(string, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return error == $ERROR ? NIL : term_learner_id(cycl);
    }

    public static SubLObject clear_term_learner_id() {
        final SubLObject cs = $term_learner_id_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_term_learner_id(final SubLObject v_object) {
        return memoization_state.caching_state_remove_function_results_with_args($term_learner_id_caching_state$.getGlobalValue(), list(v_object), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject term_learner_id_internal(final SubLObject v_object) {
        return kb_utilities.compact_hl_external_id_string(v_object);
    }

    public static SubLObject term_learner_id(final SubLObject v_object) {
        SubLObject caching_state = $term_learner_id_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(TERM_LEARNER_ID, $term_learner_id_caching_state$, $int$4096, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(term_learner_id_internal(v_object)));
            memoization_state.caching_state_put(caching_state, v_object, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject get_upwards_closure_justifications_internal(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject fortified_term = narts_high.nart_substitute(v_term);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($upwards_closure_query_mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != fort_types_interface.collectionP(fortified_term)) {
                result = make_justifications(predicate_template($$genls), fortified_term, remove(fortified_term, genls.all_genls(fortified_term, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                if (NIL != treatment_for_somethingP(fortified_term)) {
                    result = cconcatenate(result, make_justifications(predicate_template($const42$standardTreatmentTypeForCondition), fortified_term, get_treated_condition(fortified_term)));
                }
                if (NIL != ailmentP(fortified_term)) {
                    result = cconcatenate(result, make_justifications(predicate_template($$ailmentTypeAfflictsPartType), fortified_term, get_affected_parts(fortified_term)));
                    result = cconcatenate(result, make_justifications(predicate_template($$conditionsCommonlyCooccur), fortified_term, get_cooccurring_conditions(fortified_term)));
                    SubLObject cdolist_list_var = get_treatments_for_condition(fortified_term);
                    SubLObject treatment = NIL;
                    treatment = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        result = cconcatenate(make_justifications(predicate_template($const42$standardTreatmentTypeForCondition), treatment, list(fortified_term)), result);
                        cdolist_list_var = cdolist_list_var.rest();
                        treatment = cdolist_list_var.first();
                    } 
                }
            } else
                if (NIL != kb_accessors.individualP(fortified_term)) {
                    result = make_justifications(predicate_template($$isa), fortified_term, isa.all_isa(fortified_term, UNPROVIDED, UNPROVIDED));
                    if (NIL != fort_types_interface.city_in_any_mtP(fortified_term)) {
                        result = append(result, make_justifications(predicate_template($$inRegion), fortified_term, get_city_regions(fortified_term)));
                    } else
                        if (NIL != fort_types_interface.country_in_any_mtP(fortified_term)) {
                            result = append(result, make_justifications(predicate_template($$inRegion), fortified_term, get_country_regions(fortified_term)));
                        } else
                            if (NIL != agentP(fortified_term)) {
                                result = append(result, make_justifications(predicate_template($$hasLeaders), fortified_term, get_groups(fortified_term)));
                            }


                }

        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject get_upwards_closure_justifications(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return get_upwards_closure_justifications_internal(v_term);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GET_UPWARDS_CLOSURE_JUSTIFICATIONS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GET_UPWARDS_CLOSURE_JUSTIFICATIONS, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, GET_UPWARDS_CLOSURE_JUSTIFICATIONS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(get_upwards_closure_justifications_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject get_upwards_closure(final SubLObject v_term) {
        SubLObject closure = NIL;
        SubLObject cdolist_list_var = get_upwards_closure_justifications_cached(v_term);
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            closure = cons(get_closure_justification_genl(justification), closure);
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        } 
        return closure;
    }

    public static SubLObject clear_get_upwards_closure_justifications_cached() {
        final SubLObject cs = $get_upwards_closure_justifications_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_upwards_closure_justifications_cached(final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($get_upwards_closure_justifications_cached_caching_state$.getGlobalValue(), list(v_term), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_upwards_closure_justifications_cached_internal(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == file_backed_cache.file_backed_cache_p($upwards_closure_justification_fbc$.getDynamicValue(thread))) {
            $upwards_closure_justification_fbc$.setDynamicValue(file_backed_cache.file_backed_cache_create($upwards_closure_justification_fht_path$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        }
        SubLObject result = NIL;
        result = file_backed_cache.file_backed_cache_lookup(v_term, $upwards_closure_justification_fbc$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        if (result == $NOT_FOUND) {
            result = get_upwards_closure_justifications(v_term);
        }
        return result;
    }

    public static SubLObject get_upwards_closure_justifications_cached(final SubLObject v_term) {
        SubLObject caching_state = $get_upwards_closure_justifications_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_UPWARDS_CLOSURE_JUSTIFICATIONS_CACHED, $get_upwards_closure_justifications_cached_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(get_upwards_closure_justifications_cached_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject caching_upwards_closure_justificationsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $caching_upwards_closure_justificationsP$.getDynamicValue(thread);
    }

    public static SubLObject cache_upwards_closure_justifications(SubLObject cache_file) {
        if (cache_file == UNPROVIDED) {
            cache_file = $str51$_cyc_top_data_doc_tagging_upwards;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
            final SubLObject _prev_bind_0_$1 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject v_cache = file_hash_table.create_file_hash_table(cache_file, forts.fort_count(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject _prev_bind_0_$2 = $caching_upwards_closure_justificationsP$.currentBinding(thread);
                    try {
                        $caching_upwards_closure_justificationsP$.bind(T, thread);
                        final SubLObject table_var;
                        final SubLObject term_fht = table_var = file_hash_table.open_file_hash_table($doc_annotator_term_id_fbc_path$.getDynamicValue(thread), file_hash_table.$default_fht_test_function$.getGlobalValue(), $IMAGE_INDEPENDENT_CFASL);
                        $progress_note$.setDynamicValue($str53$Caching_upwards_closure_justifica, thread);
                        $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                        $progress_total$.setDynamicValue(file_hash_table.file_hash_table_count(table_var), thread);
                        $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                        final SubLObject _prev_bind_0_$3 = $last_percent_progress_index$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$4 = $last_percent_progress_prediction$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$5 = $within_noting_percent_progress$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            try {
                                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                SubLObject continuation = NIL;
                                SubLObject next;
                                for (SubLObject completeP = NIL; NIL == completeP; completeP = sublisp_null(next)) {
                                    thread.resetMultipleValues();
                                    final SubLObject the_key = file_hash_table.get_file_hash_table_any(table_var, continuation, NIL);
                                    final SubLObject the_value = thread.secondMultipleValue();
                                    next = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != next) {
                                        final SubLObject fort = the_key;
                                        final SubLObject id = the_value;
                                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        final SubLObject value = get_upwards_closure_justifications(fort);
                                        file_hash_table.put_file_hash_table(fort, v_cache, value);
                                    }
                                    continuation = next;
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    noting_percent_progress_postamble();
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_2_$5, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_1_$4, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_0_$3, thread);
                        }
                        file_hash_table.finalize_file_hash_table(v_cache);
                        file_hash_table.finalize_file_hash_table(term_fht);
                    } finally {
                        $caching_upwards_closure_justificationsP$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return cache_file;
    }

    public static SubLObject cache_upwards_closure_justification(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fht = NIL;
        try {
            fht = file_hash_table.open_file_hash_table($upwards_closure_justification_fht_path$.getDynamicValue(thread), file_hash_table.$default_fht_test_function$.getGlobalValue(), $IMAGE_INDEPENDENT_CFASL);
            final SubLObject _prev_bind_0 = $caching_upwards_closure_justificationsP$.currentBinding(thread);
            try {
                $caching_upwards_closure_justificationsP$.bind(T, thread);
                final SubLObject value = get_upwards_closure_justifications(v_term);
                file_hash_table.put_file_hash_table(v_term, fht, value);
            } finally {
                $caching_upwards_closure_justificationsP$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != file_hash_table.file_hash_table_p(fht)) {
                    file_hash_table.finalize_file_hash_table(fht);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return v_term;
    }

    public static SubLObject treatment_for_somethingP(final SubLObject v_term) {
        return makeBoolean((NIL != genls.genl_in_any_mtP(v_term, $$MedicalDevice)) || (NIL != genls.genl_in_any_mtP(v_term, $$MedicalTreatmentEvent)));
    }

    public static SubLObject ailmentP(final SubLObject v_term) {
        return genls.genl_in_any_mtP(v_term, $$AilmentCondition);
    }

    public static SubLObject agentP(final SubLObject v_term) {
        return isa.isa_in_any_mtP(v_term, $$IntelligentAgent);
    }

    public static SubLObject clear_get_treated_condition() {
        final SubLObject cs = $get_treated_condition_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_treated_condition(final SubLObject device_or_treatment) {
        return memoization_state.caching_state_remove_function_results_with_args($get_treated_condition_caching_state$.getGlobalValue(), list(device_or_treatment), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_treated_condition_internal(final SubLObject device_or_treatment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return ask_utilities.query_variable($sym59$_X, list($$or, listS($$deviceTypeTreatsConditionType, device_or_treatment, $list62), listS($const42$standardTreatmentTypeForCondition, device_or_treatment, $list62)), mt_relevance_macros.$mt$.getDynamicValue(thread), $list63);
    }

    public static SubLObject get_treated_condition(final SubLObject device_or_treatment) {
        SubLObject caching_state = $get_treated_condition_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_TREATED_CONDITION, $get_treated_condition_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_GET_TREATED_CONDITION);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, device_or_treatment, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(get_treated_condition_internal(device_or_treatment)));
            memoization_state.caching_state_put(caching_state, device_or_treatment, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_get_treatments_for_condition() {
        final SubLObject cs = $get_treatments_for_condition_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_treatments_for_condition(final SubLObject ailment) {
        return memoization_state.caching_state_remove_function_results_with_args($get_treatments_for_condition_caching_state$.getGlobalValue(), list(ailment), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_treatments_for_condition_internal(final SubLObject ailment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return ask_utilities.query_variable($sym59$_X, list($$or, list($$deviceTypeTreatsConditionType, $sym59$_X, ailment), list($const42$standardTreatmentTypeForCondition, $sym59$_X, ailment)), mt_relevance_macros.$mt$.getDynamicValue(thread), $list63);
    }

    public static SubLObject get_treatments_for_condition(final SubLObject ailment) {
        SubLObject caching_state = $get_treatments_for_condition_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_TREATMENTS_FOR_CONDITION, $get_treatments_for_condition_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_GET_TREATMENTS_FOR_CONDITION);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, ailment, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(get_treatments_for_condition_internal(ailment)));
            memoization_state.caching_state_put(caching_state, ailment, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_get_affected_parts() {
        final SubLObject cs = $get_affected_parts_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_affected_parts(final SubLObject ailment) {
        return memoization_state.caching_state_remove_function_results_with_args($get_affected_parts_caching_state$.getGlobalValue(), list(ailment), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_affected_parts_internal(final SubLObject ailment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return ask_utilities.query_variable($sym59$_X, listS($$ailmentTypeAfflictsPartType, ailment, $list62), mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
    }

    public static SubLObject get_affected_parts(final SubLObject ailment) {
        SubLObject caching_state = $get_affected_parts_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_AFFECTED_PARTS, $get_affected_parts_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_GET_AFFECTED_PARTS);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, ailment, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(get_affected_parts_internal(ailment)));
            memoization_state.caching_state_put(caching_state, ailment, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_get_cooccurring_conditions() {
        final SubLObject cs = $get_cooccurring_conditions_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_cooccurring_conditions(final SubLObject ailment) {
        return memoization_state.caching_state_remove_function_results_with_args($get_cooccurring_conditions_caching_state$.getGlobalValue(), list(ailment), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_cooccurring_conditions_internal(final SubLObject ailment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return ask_utilities.query_variable($sym59$_X, listS($$conditionsCommonlyCooccur, ailment, $list62), mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
    }

    public static SubLObject get_cooccurring_conditions(final SubLObject ailment) {
        SubLObject caching_state = $get_cooccurring_conditions_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_COOCCURRING_CONDITIONS, $get_cooccurring_conditions_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_GET_COOCCURRING_CONDITIONS);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, ailment, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(get_cooccurring_conditions_internal(ailment)));
            memoization_state.caching_state_put(caching_state, ailment, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject get_groups(final SubLObject agent) {
        if (NIL != caching_upwards_closure_justificationsP()) {
            return list_utilities.alist_lookup_without_values(leaders_to_groups(), agent, UNPROVIDED, UNPROVIDED);
        }
        return get_groups_non_cached(agent);
    }

    public static SubLObject get_groups_non_cached(final SubLObject agent) {
        if (NIL == forts.fort_p(narts_high.nart_substitute(agent))) {
            return NIL;
        }
        return ask_utilities.query_template($sym75$_GROUP, list($$hasLeaders, $sym75$_GROUP, agent), $$InferencePSC, UNPROVIDED);
    }

    public static SubLObject clear_leaders_to_groups() {
        final SubLObject cs = $leaders_to_groups_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_leaders_to_groups() {
        return memoization_state.caching_state_remove_function_results_with_args($leaders_to_groups_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject leaders_to_groups_internal() {
        SubLObject alist = NIL;
        SubLObject cdolist_list_var = ask_utilities.query_template($list79, $list80, $$InferencePSC, UNPROVIDED);
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject leader = NIL;
            SubLObject group = NIL;
            destructuring_bind_must_consp(current, datum, $list78);
            leader = current.first();
            current = group = current.rest();
            alist = list_utilities.alist_pushnew(alist, leader, group, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return alist;
    }

    public static SubLObject leaders_to_groups() {
        SubLObject caching_state = $leaders_to_groups_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(LEADERS_TO_GROUPS, $leaders_to_groups_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(leaders_to_groups_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject get_city_regions(final SubLObject city) {
        SubLObject regions = NIL;
        SubLObject cdolist_list_var = get_city_countries(city);
        SubLObject country = NIL;
        country = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            regions = cons(country, regions);
            regions = append(get_country_regions(country), regions);
            cdolist_list_var = cdolist_list_var.rest();
            country = cdolist_list_var.first();
        } 
        return regions;
    }

    public static SubLObject get_city_countries(final SubLObject city) {
        if (NIL != caching_upwards_closure_justificationsP()) {
            return list_utilities.alist_lookup_without_values(cities_to_countries(), city, UNPROVIDED, UNPROVIDED);
        }
        return get_city_countries_non_cached(city);
    }

    public static SubLObject clear_cities_to_countries() {
        final SubLObject cs = $cities_to_countries_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cities_to_countries() {
        return memoization_state.caching_state_remove_function_results_with_args($cities_to_countries_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cities_to_countries_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject alist = NIL;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($str83$Caching_countries_of_all_cities__);
                final SubLObject template = $list84;
                final SubLObject sentence = $list85;
                SubLObject cdolist_list_var;
                final SubLObject pairs = cdolist_list_var = ask_utilities.query_template(template, sentence, $$InferencePSC, UNPROVIDED);
                SubLObject pair = NIL;
                pair = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = pair;
                    SubLObject city = NIL;
                    SubLObject country = NIL;
                    destructuring_bind_must_consp(current, datum, $list86);
                    city = current.first();
                    current = country = current.rest();
                    alist = list_utilities.alist_pushnew(alist, city, country, UNPROVIDED, UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    pair = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return alist;
    }

    public static SubLObject cities_to_countries() {
        SubLObject caching_state = $cities_to_countries_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CITIES_TO_COUNTRIES, $cities_to_countries_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cities_to_countries_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject get_city_countries_non_cached(final SubLObject city) {
        if (NIL != forts.fort_p(narts_high.nart_substitute(city))) {
            return ask_utilities.query_template($sym88$_COUNTRY, list($$countryOfCity, $sym88$_COUNTRY, city), $$InferencePSC, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject get_country_regions(final SubLObject country) {
        if (NIL != caching_upwards_closure_justificationsP()) {
            return list_utilities.alist_lookup_without_values(countries_to_regions(), country, UNPROVIDED, UNPROVIDED);
        }
        return get_country_regions_non_cached(country);
    }

    public static SubLObject get_country_regions_non_cached(final SubLObject country) {
        if (NIL != forts.fort_p(narts_high.nart_substitute(country))) {
            return ask_utilities.query_template($sym90$_REGION, listS($$and, $list92, listS($$isa, country, $list93), $list94), $$InferencePSC, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject clear_countries_to_regions() {
        final SubLObject cs = $countries_to_regions_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_countries_to_regions() {
        return memoization_state.caching_state_remove_function_results_with_args($countries_to_regions_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject countries_to_regions_internal() {
        SubLObject alist = NIL;
        SubLObject cdolist_list_var = ask_utilities.query_template($list97, $list98, $$InferencePSC, UNPROVIDED);
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject country = NIL;
            SubLObject region = NIL;
            destructuring_bind_must_consp(current, datum, $list96);
            country = current.first();
            current = region = current.rest();
            alist = list_utilities.alist_pushnew(alist, country, region, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return alist;
    }

    public static SubLObject countries_to_regions() {
        SubLObject caching_state = $countries_to_regions_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(COUNTRIES_TO_REGIONS, $countries_to_regions_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(countries_to_regions_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject with_dual_lucene_sessions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list100);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject semantic_session = NIL;
        SubLObject keyword_session = NIL;
        SubLObject host = NIL;
        SubLObject port = NIL;
        SubLObject text_index_file = NIL;
        SubLObject sem_index_file = NIL;
        SubLObject overwriteP = NIL;
        destructuring_bind_must_consp(current, datum, $list100);
        semantic_session = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list100);
        keyword_session = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list100);
        host = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list100);
        port = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list100);
        text_index_file = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list100);
        sem_index_file = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list100);
        overwriteP = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list(keyword_session, list(NEW_LUCENE_SESSION, host, port, text_index_file, $TEXT, overwriteP)), list(semantic_session, list(NEW_LUCENE_SESSION, host, port, sem_index_file, $CYC, overwriteP))), append(body, list(list(LUCENE_OPTIMIZE, keyword_session), list(LUCENE_OPTIMIZE, semantic_session), list(LUCENE_FINALIZE, keyword_session), list(LUCENE_FINALIZE, semantic_session))));
        }
        cdestructuring_bind_error(datum, $list100);
        return NIL;
    }

    public static SubLObject add_fully_indexed_documents_from_dir(final SubLObject directory, final SubLObject host, final SubLObject port, final SubLObject text_index_file, final SubLObject sem_index_file, final SubLObject overwriteP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            final SubLObject keyword_session = lucene_session.new_lucene_session(host, port, text_index_file, $TEXT, overwriteP);
            final SubLObject semantic_session = lucene_session.new_lucene_session(host, port, sem_index_file, $CYC, overwriteP);
            if (NIL != overwriteP) {
                file_utilities.delete_file_if_exists(cconcatenate(lucene_session.lucene_index(semantic_session), $str107$_indexed_docs_txt));
                file_utilities.delete_file_if_exists(cconcatenate(lucene_session.lucene_index(keyword_session), $str107$_indexed_docs_txt));
            }
            assert NIL != Filesys.directory_p(directory) : "Filesys.directory_p(directory) " + "CommonSymbols.NIL != Filesys.directory_p(directory) " + directory;
            SubLObject directory_contents_var = Filesys.directory(directory, T);
            final SubLObject progress_message_var = $$$Indexing_files;
            final SubLObject _prev_bind_0_$9 = $silent_progressP$.currentBinding(thread);
            try {
                $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                if (NIL.isFunctionSpec()) {
                    directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
                }
                final SubLObject list_var = directory_contents_var;
                final SubLObject _prev_bind_0_$10 = $progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_1_$11 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_2_$12 = $progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_total$.bind(length(list_var), thread);
                    $progress_sofar$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject file = NIL;
                        file = csome_list_var.first();
                        while (NIL != csome_list_var) {
                            if (NIL == Filesys.directory_p(file)) {
                                final SubLObject local_state;
                                final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
                                final SubLObject _prev_bind_0_$11 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                    try {
                                        final SubLObject doc_string = string_utilities.read_string_from_file(file, UNPROVIDED, UNPROVIDED);
                                        add_fully_indexed_document(doc_string, file, $str111$, semantic_session, keyword_session);
                                        SubLObject cdolist_list_var = list(keyword_session, semantic_session);
                                        SubLObject session = NIL;
                                        session = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            SubLObject stream = NIL;
                                            try {
                                                stream = compatibility.open_text(cconcatenate(lucene_session.lucene_index(session), $str107$_indexed_docs_txt), $APPEND);
                                                if (!stream.isStream()) {
                                                    Errors.error($str113$Unable_to_open__S, cconcatenate(lucene_session.lucene_index(session), $str107$_indexed_docs_txt));
                                                }
                                                final SubLObject s = stream;
                                                format(s, $str114$_A__, file);
                                            } finally {
                                                final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    if (stream.isStream()) {
                                                        close(stream, UNPROVIDED);
                                                    }
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                                }
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            session = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$11, thread);
                                }
                            }
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            file = csome_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    $progress_sofar$.rebind(_prev_bind_4, thread);
                    $progress_total$.rebind(_prev_bind_2_$12, thread);
                    $progress_start_time$.rebind(_prev_bind_1_$11, thread);
                    $progress_note$.rebind(_prev_bind_0_$10, thread);
                }
            } finally {
                $silent_progressP$.rebind(_prev_bind_0_$9, thread);
            }
            lucene_session.lucene_optimize(keyword_session);
            lucene_session.lucene_optimize(semantic_session);
            lucene_session.lucene_finalize(keyword_session);
            lucene_session.lucene_finalize(semantic_session);
        } finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return T;
    }

    public static SubLObject add_fully_indexed_documents(final SubLObject doc_strings, final SubLObject host, final SubLObject port, final SubLObject text_index_file, final SubLObject sem_index_file, final SubLObject overwriteP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject keyword_session = lucene_session.new_lucene_session(host, port, text_index_file, $TEXT, overwriteP);
        final SubLObject semantic_session = lucene_session.new_lucene_session(host, port, sem_index_file, $CYC, overwriteP);
        SubLObject cdolist_list_var = doc_strings;
        SubLObject doc_string = NIL;
        doc_string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
            final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    add_fully_indexed_document(doc_string, $str111$, $str111$, semantic_session, keyword_session);
                } finally {
                    final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            doc_string = cdolist_list_var.first();
        } 
        lucene_session.lucene_optimize(keyword_session);
        lucene_session.lucene_optimize(semantic_session);
        lucene_session.lucene_finalize(keyword_session);
        lucene_session.lucene_finalize(semantic_session);
        return T;
    }

    public static SubLObject tag_xml_documents_with_urls(final SubLObject filespecs, SubLObject overwriteP, SubLObject out_directory) {
        if (overwriteP == UNPROVIDED) {
            overwriteP = NIL;
        }
        if (out_directory == UNPROVIDED) {
            out_directory = $str133$_host_george_scratch_tagged_docs_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$18 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    final SubLObject disambiguator = rule_disambiguation.new_rule_disambiguator(UNPROVIDED, UNPROVIDED);
                    final SubLObject _prev_bind_0_$19 = $progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$20 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$21 = $progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $progress_note$.bind($$$Tagging_files, thread);
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_total$.bind(length(filespecs), thread);
                        $progress_sofar$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = filespecs;
                            SubLObject filespec = NIL;
                            filespec = csome_list_var.first();
                            while (NIL != csome_list_var) {
                                tag_xml_document_filespec(filespec, overwriteP, out_directory, disambiguator);
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                filespec = csome_list_var.first();
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        $progress_sofar$.rebind(_prev_bind_4, thread);
                        $progress_total$.rebind(_prev_bind_2_$21, thread);
                        $progress_start_time$.rebind(_prev_bind_1_$20, thread);
                        $progress_note$.rebind(_prev_bind_0_$19, thread);
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$18, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return $DONE;
    }

    public static SubLObject tag_xml_document_filespec(final SubLObject filespec, final SubLObject overwriteP, final SubLObject out_directory, SubLObject disambiguator) {
        if (disambiguator == UNPROVIDED) {
            disambiguator = $NEW;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_disambiguator = eq(disambiguator, $NEW);
        SubLObject original_file = NIL;
        SubLObject text_file_path = NIL;
        SubLObject url = NIL;
        SubLObject parent_file = NIL;
        if (NIL != new_disambiguator) {
            disambiguator = rule_disambiguation.new_rule_disambiguator(UNPROVIDED, UNPROVIDED);
        }
        if (filespec.isString()) {
            original_file = filespec;
            text_file_path = filespec;
        }
        if (filespec.isList()) {
            SubLObject org_file = NIL;
            SubLObject text_fpath = NIL;
            destructuring_bind_must_consp(filespec, filespec, $list137);
            org_file = filespec.first();
            SubLObject current = filespec.rest();
            destructuring_bind_must_consp(current, filespec, $list137);
            text_fpath = current.first();
            current = current.rest();
            final SubLObject the_url = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, filespec, $list137);
            current = current.rest();
            final SubLObject the_parent = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, filespec, $list137);
            current = current.rest();
            if (NIL == current) {
                original_file = org_file;
                text_file_path = text_fpath;
                url = the_url;
                parent_file = the_parent;
            } else {
                cdestructuring_bind_error(filespec, $list137);
            }
        }
        Errors.warn($str138$_S_tagging__S__, numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED), text_file_path);
        thread.resetMultipleValues();
        final SubLObject path = file_utilities.deconstruct_path(text_file_path);
        final SubLObject filename = thread.secondMultipleValue();
        final SubLObject type = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != Filesys.probe_file(text_file_path)) {
            final SubLObject out_file = cconcatenate(out_directory, new SubLObject[]{ string_utilities.post_remove(filename, $str139$_txt, UNPROVIDED), $str140$_cyc_idx });
            if ((NIL == string_utilities.ends_with(original_file, $str140$_cyc_idx, UNPROVIDED)) && ((NIL != overwriteP) || (NIL == Filesys.probe_file(out_file)))) {
                final SubLObject local_state;
                final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
                final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        SubLObject current2;
                        final SubLObject datum = current2 = read_original_doc(text_file_path);
                        SubLObject title = NIL;
                        SubLObject doc_text = NIL;
                        destructuring_bind_must_consp(current2, datum, $list141);
                        title = current2.first();
                        current2 = current2.rest();
                        destructuring_bind_must_consp(current2, datum, $list141);
                        doc_text = current2.first();
                        current2 = current2.rest();
                        if (NIL == current2) {
                            if (NIL != doc_text) {
                                if ((NIL != search($str142$_, doc_text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != search($str143$_, doc_text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    doc_text = string_utilities.remove_substring(string_utilities.remove_substring(doc_text, $str142$_), $str143$_);
                                }
                                SubLObject stream = NIL;
                                try {
                                    stream = compatibility.open_text(text_file_path, $OUTPUT);
                                    if (!stream.isStream()) {
                                        Errors.error($str113$Unable_to_open__S, text_file_path);
                                    }
                                    final SubLObject s = stream;
                                    final SubLObject _prev_bind_0_$24 = xml_vars.$xml_stream$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_stream$.bind(s, thread);
                                        final SubLObject name_var = $$$Doc;
                                        xml_utilities.xml_start_tag_internal(name_var, NIL, NIL, UNPROVIDED, UNPROVIDED);
                                        final SubLObject name_var_$25 = $tagged_doc_title_name$.getGlobalValue();
                                        xml_utilities.xml_start_tag_internal(name_var_$25, NIL, NIL, UNPROVIDED, UNPROVIDED);
                                        xml_utilities.xml_markup(title);
                                        xml_utilities.xml_end_tag_internal(name_var_$25);
                                        final SubLObject name_var_$26 = $tagged_doc_text_name$.getGlobalValue();
                                        xml_utilities.xml_start_tag_internal(name_var_$26, NIL, NIL, UNPROVIDED, UNPROVIDED);
                                        xml_utilities.xml_markup(doc_text);
                                        xml_utilities.xml_end_tag_internal(name_var_$26);
                                        if (parent_file.isString()) {
                                            final SubLObject name_var_$27 = $tagged_doc_parent_filename_name$.getGlobalValue();
                                            xml_utilities.xml_start_tag_internal(name_var_$27, NIL, NIL, UNPROVIDED, UNPROVIDED);
                                            xml_utilities.xml_markup(parent_file);
                                            xml_utilities.xml_end_tag_internal(name_var_$27);
                                        }
                                        xml_utilities.xml_end_tag_internal(name_var);
                                    } finally {
                                        xml_vars.$xml_stream$.rebind(_prev_bind_0_$24, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (stream.isStream()) {
                                            close(stream, UNPROVIDED);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                                    }
                                }
                                stream = NIL;
                                try {
                                    stream = compatibility.open_text(out_file, $OUTPUT);
                                    if (!stream.isStream()) {
                                        Errors.error($str113$Unable_to_open__S, out_file);
                                    }
                                    final SubLObject out = stream;
                                    final SubLObject _prev_bind_0_$26 = xml_vars.$xml_stream$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_stream$.bind(out, thread);
                                        SubLObject tagged_doc_text = tag_document_for_indexing_with_offsets(doc_text, disambiguator, UNPROVIDED, UNPROVIDED);
                                        if (NIL == tagged_doc_text) {
                                            Errors.warn($str146$There_is_no_text_in_the_body_of_t);
                                            tagged_doc_text = $str111$;
                                        }
                                        final SubLObject name_var2 = $$$Doc;
                                        xml_utilities.xml_start_tag_internal(name_var2, NIL, NIL, UNPROVIDED, UNPROVIDED);
                                        final SubLObject name_var_$28 = $tagged_doc_title_name$.getGlobalValue();
                                        xml_utilities.xml_start_tag_internal(name_var_$28, NIL, NIL, UNPROVIDED, UNPROVIDED);
                                        xml_utilities.xml_markup(title);
                                        xml_utilities.xml_end_tag_internal(name_var_$28);
                                        final SubLObject name_var_$29 = $tagged_doc_original_filename_name$.getGlobalValue();
                                        xml_utilities.xml_start_tag_internal(name_var_$29, NIL, NIL, UNPROVIDED, UNPROVIDED);
                                        xml_utilities.xml_markup(original_file);
                                        xml_utilities.xml_end_tag_internal(name_var_$29);
                                        if (NIL != url) {
                                            final SubLObject name_var_$30 = $tagged_doc_url_name$.getGlobalValue();
                                            xml_utilities.xml_start_tag_internal(name_var_$30, NIL, NIL, UNPROVIDED, UNPROVIDED);
                                            xml_utilities.xml_markup(url);
                                            xml_utilities.xml_end_tag_internal(name_var_$30);
                                        }
                                        xml_utilities.xml_terpri();
                                        if (parent_file.isString()) {
                                            final SubLObject name_var_$31 = $tagged_doc_parent_filename_name$.getGlobalValue();
                                            xml_utilities.xml_start_tag_internal(name_var_$31, NIL, NIL, UNPROVIDED, UNPROVIDED);
                                            xml_utilities.xml_markup(parent_file);
                                            xml_utilities.xml_end_tag_internal(name_var_$31);
                                            xml_utilities.xml_terpri();
                                        }
                                        final SubLObject name_var_$32 = $tagged_doc_keystring_name$.getGlobalValue();
                                        xml_utilities.xml_start_tag_internal(name_var_$32, NIL, NIL, UNPROVIDED, UNPROVIDED);
                                        xml_utilities.xml_write_string(tagged_doc_text, UNPROVIDED, UNPROVIDED);
                                        xml_utilities.xml_end_tag_internal(name_var_$32);
                                        xml_utilities.xml_end_tag_internal(name_var2);
                                    } finally {
                                        xml_vars.$xml_stream$.rebind(_prev_bind_0_$26, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (stream.isStream()) {
                                            close(stream, UNPROVIDED);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list141);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                        }
                    }
                } finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                }
            }
        } else {
            Errors.warn($str147$Couldn_t_find_source_file__S__Mov, text_file_path);
        }
        if (NIL != new_disambiguator) {
            rule_disambiguation.finalize_rule_disambiguator(disambiguator);
        }
        return T;
    }

    public static SubLObject read_original_doc(final SubLObject path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doc_string = $str111$;
        SubLObject title = $str111$;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(path, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str113$Unable_to_open__S, path);
            }
            final SubLObject s = stream;
            SubLObject tokens = xml_parsing_utilities.xml_tokenize(s, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            while (NIL != tokens) {
                final SubLObject token_head = tokens.first();
                if (NIL != xml_parsing_utilities.xml_token_matches(token_head, $tagged_doc_title_token$.getGlobalValue())) {
                    if (NIL != xml_parsing_utilities.xml_token_matches(second(tokens), $tagged_doc_title_close_token$.getGlobalValue())) {
                        tokens = xml_parsing_utilities.advance_xml_tokens(tokens, TWO_INTEGER);
                    } else {
                        title = second(tokens);
                        tokens = xml_parsing_utilities.advance_xml_tokens(tokens, THREE_INTEGER);
                    }
                } else
                    if (NIL != xml_parsing_utilities.xml_token_matches(token_head, $tagged_doc_text_token$.getGlobalValue())) {
                        final SubLObject close_tag_location = xml_parsing_utilities.next_xml_token_position(tokens, $tagged_doc_text_close_token$.getGlobalValue(), UNPROVIDED);
                        final SubLObject text_tokens = subseq(tokens, ONE_INTEGER, close_tag_location);
                        final SubLObject text = doc_string = apply(CCONCATENATE, text_tokens);
                        tokens = xml_parsing_utilities.advance_xml_tokens(tokens, close_tag_location);
                    } else {
                        tokens = xml_parsing_utilities.advance_xml_tokens(tokens, UNPROVIDED);
                    }

            } 
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return list(title, doc_string);
    }

    public static SubLObject tag_xml_doc_set_with_urls(final SubLObject filename, SubLObject overwriteP, SubLObject out_directory) {
        if (overwriteP == UNPROVIDED) {
            overwriteP = NIL;
        }
        if (out_directory == UNPROVIDED) {
            out_directory = $tagged_xml_doc_directory$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject file_list = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str113$Unable_to_open__S, filename);
            }
            final SubLObject infile = stream;
            if (infile.isStream()) {
                SubLObject in_file;
                SubLObject line;
                for (in_file = NIL, in_file = file_utilities.cdolines_get_next_line(infile); NIL != in_file; in_file = file_utilities.cdolines_get_next_line(infile)) {
                    line = read_from_string_ignoring_errors(in_file, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (line.isList()) {
                        file_list = cons(line, file_list);
                    }
                }
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return tag_xml_documents_with_urls(file_list, overwriteP, out_directory);
    }

    public static SubLObject index_xml_doc_set_from_map_file(final SubLObject filename, final SubLObject out_dir, SubLObject overwriteP, SubLObject port, SubLObject tagged_doc_directory, SubLObject lucene_host) {
        if (overwriteP == UNPROVIDED) {
            overwriteP = T;
        }
        if (port == UNPROVIDED) {
            port = lucene_session.get_lucene_port();
        }
        if (tagged_doc_directory == UNPROVIDED) {
            tagged_doc_directory = $tagged_xml_doc_directory$.getDynamicValue();
        }
        if (lucene_host == UNPROVIDED) {
            lucene_host = lucene_session.get_lucene_host();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject text_index_file = cconcatenate(out_dir, $text_index_dir_name$.getDynamicValue(thread));
        final SubLObject sem_index_file = cconcatenate(out_dir, $semantic_index_dir_name$.getDynamicValue(thread));
        SubLObject file_list = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str113$Unable_to_open__S, filename);
            }
            final SubLObject infile = stream;
            if (infile.isStream()) {
                SubLObject line;
                SubLObject file_line_as_list;
                SubLObject txt_file;
                SubLObject path;
                SubLObject simple_filename;
                SubLObject type;
                for (line = NIL, line = file_utilities.cdolines_get_next_line(infile); NIL != line; line = file_utilities.cdolines_get_next_line(infile)) {
                    file_line_as_list = read_from_string_ignoring_errors(line, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (file_line_as_list.isList()) {
                        txt_file = second(file_line_as_list);
                        thread.resetMultipleValues();
                        path = file_utilities.deconstruct_path(txt_file);
                        simple_filename = thread.secondMultipleValue();
                        type = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        file_list = cons(list(cconcatenate(tagged_doc_directory, new SubLObject[]{ string_utilities.post_remove(simple_filename, $str139$_txt, UNPROVIDED), $str140$_cyc_idx }), txt_file), file_list);
                    }
                }
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return index_pre_tagged_xml_docs(file_list, lucene_host, port, text_index_file, sem_index_file, overwriteP);
    }

    public static SubLObject index_pre_tagged_xml_docs(final SubLObject filenames, final SubLObject host, final SubLObject port, final SubLObject text_index_file, final SubLObject sem_index_file, final SubLObject overwriteP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject keyword_session = lucene_session.new_lucene_session(host, port, text_index_file, $TEXT, overwriteP);
        final SubLObject semantic_session = lucene_session.new_lucene_session(host, port, sem_index_file, $CYC, overwriteP);
        if (NIL != overwriteP) {
            file_utilities.delete_file_if_exists(cconcatenate(lucene_session.lucene_index(semantic_session), $str107$_indexed_docs_txt));
            file_utilities.delete_file_if_exists(cconcatenate(lucene_session.lucene_index(keyword_session), $str107$_indexed_docs_txt));
        }
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$Indexing_files, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(filenames), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = filenames;
                SubLObject file = NIL;
                file = csome_list_var.first();
                while (NIL != csome_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = file;
                    SubLObject idx_file = NIL;
                    SubLObject txt_file = NIL;
                    destructuring_bind_must_consp(current, datum, $list150);
                    idx_file = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list150);
                    txt_file = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if ((NIL == Filesys.directory_p(idx_file)) && (NIL != string_utilities.ends_with(idx_file, $str140$_cyc_idx, UNPROVIDED))) {
                            SubLObject error_message = NIL;
                            try {
                                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_0_$37 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        index_pre_tagged_xml_doc(idx_file, txt_file, keyword_session, semantic_session);
                                    } catch (final Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0_$37, thread);
                                }
                            } catch (final Throwable ccatch_env_var) {
                                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                            } finally {
                                thread.throwStack.pop();
                            }
                            if (NIL != error_message) {
                                Errors.warn($str152$problem_indexing__a_____moving_on, file, error_message);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list150);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    file = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$38 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        lucene_session.lucene_optimize(keyword_session);
        lucene_session.lucene_optimize(semantic_session);
        lucene_session.lucene_finalize(keyword_session);
        lucene_session.lucene_finalize(semantic_session);
        return T;
    }

    public static SubLObject index_pre_tagged_xml_doc(final SubLObject idx_doc_name, final SubLObject txt_xml_doc_name, final SubLObject keyword_session, final SubLObject semantic_session) {
        SubLObject original_filename = $str111$;
        SubLObject key_string = $str111$;
        SubLObject confirmed_concepts_key_string = $str111$;
        SubLObject title = $str111$;
        final SubLObject text_xml = string_utilities.read_string_from_file(txt_xml_doc_name, UNPROVIDED, UNPROVIDED);
        SubLObject tokens = xml_parsing_utilities.xml_string_tokenize(text_xml, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject url = $str111$;
        SubLObject parent_file = NIL;
        SubLObject text = NIL;
        while (NIL != tokens) {
            final SubLObject token_head = tokens.first();
            if (NIL != xml_parsing_utilities.xml_token_matches(token_head, $tagged_doc_original_filename_token$.getGlobalValue())) {
                original_filename = second(tokens);
                tokens = xml_parsing_utilities.advance_xml_tokens(tokens, THREE_INTEGER);
            } else
                if (NIL != xml_parsing_utilities.xml_token_matches(token_head, $tagged_doc_parent_filename_token$.getGlobalValue())) {
                    parent_file = second(tokens);
                    tokens = xml_parsing_utilities.advance_xml_tokens(tokens, THREE_INTEGER);
                } else
                    if (NIL != xml_parsing_utilities.xml_token_matches(token_head, $tagged_doc_keystring_token$.getGlobalValue())) {
                        key_string = second(tokens);
                        tokens = xml_parsing_utilities.advance_xml_tokens(tokens, THREE_INTEGER);
                    } else
                        if (NIL != xml_parsing_utilities.xml_token_matches(token_head, $tagged_doc_url_token$.getGlobalValue())) {
                            url = second(tokens);
                            tokens = xml_parsing_utilities.advance_xml_tokens(tokens, THREE_INTEGER);
                        } else
                            if (NIL != xml_parsing_utilities.xml_token_matches(token_head, $tagged_doc_title_token$.getGlobalValue())) {
                                if (NIL != xml_parsing_utilities.xml_token_matches(second(tokens), $tagged_doc_title_close_token$.getGlobalValue())) {
                                    tokens = xml_parsing_utilities.advance_xml_tokens(tokens, TWO_INTEGER);
                                } else {
                                    title = second(tokens);
                                    tokens = xml_parsing_utilities.advance_xml_tokens(tokens, THREE_INTEGER);
                                }
                            } else
                                if (NIL != xml_parsing_utilities.xml_token_matches(token_head, $tagged_doc_text_token$.getGlobalValue())) {
                                    text = second(tokens);
                                    tokens = xml_parsing_utilities.advance_xml_tokens(tokens, THREE_INTEGER);
                                } else {
                                    tokens = xml_parsing_utilities.advance_xml_tokens(tokens, UNPROVIDED);
                                }





        } 
        final SubLObject idx_xml = string_utilities.read_string_from_file(idx_doc_name, UNPROVIDED, UNPROVIDED);
        SubLObject tokens_$39 = xml_parsing_utilities.xml_string_tokenize(idx_xml, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        while (NIL != tokens_$39) {
            final SubLObject token_head2 = tokens_$39.first();
            if (NIL != xml_parsing_utilities.xml_token_matches(token_head2, $tagged_doc_original_filename_token$.getGlobalValue())) {
                original_filename = second(tokens_$39);
                tokens_$39 = xml_parsing_utilities.advance_xml_tokens(tokens_$39, THREE_INTEGER);
            } else
                if (NIL != xml_parsing_utilities.xml_token_matches(token_head2, $tagged_doc_keystring_token$.getGlobalValue())) {
                    key_string = second(tokens_$39);
                    tokens_$39 = xml_parsing_utilities.advance_xml_tokens(tokens_$39, THREE_INTEGER);
                } else
                    if (NIL != xml_parsing_utilities.xml_token_matches(token_head2, $tagged_doc_confirmed_concepts_keystring_token$.getGlobalValue())) {
                        confirmed_concepts_key_string = second(tokens_$39);
                        tokens_$39 = xml_parsing_utilities.advance_xml_tokens(tokens_$39, THREE_INTEGER);
                    } else
                        if (NIL != xml_parsing_utilities.xml_token_matches(token_head2, $tagged_doc_title_token$.getGlobalValue())) {
                            if (NIL != xml_parsing_utilities.xml_token_matches(second(tokens_$39), $tagged_doc_title_close_token$.getGlobalValue())) {
                                tokens_$39 = xml_parsing_utilities.advance_xml_tokens(tokens_$39, TWO_INTEGER);
                            } else {
                                title = second(tokens_$39);
                                tokens_$39 = xml_parsing_utilities.advance_xml_tokens(tokens_$39, THREE_INTEGER);
                            }
                        } else
                            if (NIL != xml_parsing_utilities.xml_token_matches(token_head2, $tagged_doc_text_token$.getGlobalValue())) {
                                text = second(tokens_$39);
                                tokens_$39 = xml_parsing_utilities.advance_xml_tokens(tokens_$39, THREE_INTEGER);
                            } else
                                if (NIL != xml_parsing_utilities.xml_token_matches(token_head2, $tagged_doc_url_token$.getGlobalValue())) {
                                    url = second(tokens_$39);
                                    tokens_$39 = xml_parsing_utilities.advance_xml_tokens(tokens_$39, THREE_INTEGER);
                                } else {
                                    tokens_$39 = xml_parsing_utilities.advance_xml_tokens(tokens_$39, UNPROVIDED);
                                }





        } 
        if (NIL != string_utilities.empty_string_p(url)) {
            url = cconcatenate($str153$http___doc_cyc_com_, format_nil.format_nil_a_no_copy(string_utilities.pre_remove(original_filename, $str154$_cyc_, UNPROVIDED)));
        }
        Errors.warn($str155$title___S__, title);
        Errors.warn($str156$url___S__, url);
        SubLObject semantics = list(semantic_session, text, key_string, confirmed_concepts_key_string, url, title, lucene_session.default_lucene_confirmed_terms_boost());
        if (parent_file.isString()) {
            semantics = append(semantics, list(parent_file));
        }
        apply(LUCENE_ADD_DOCUMENT, semantics);
        lucene_session.lucene_add_document(keyword_session, text, text, $str111$, url, title, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = list(keyword_session, semantic_session);
        SubLObject session = NIL;
        session = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(cconcatenate(lucene_session.lucene_index(session), $str107$_indexed_docs_txt), $APPEND);
                if (!stream.isStream()) {
                    Errors.error($str113$Unable_to_open__S, cconcatenate(lucene_session.lucene_index(session), $str107$_indexed_docs_txt));
                }
                final SubLObject s = stream;
                format(s, $str114$_A__, idx_doc_name);
            } finally {
                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            session = cdolist_list_var.first();
        } 
        return $DONE;
    }

    public static SubLObject lucene_add_document_semantic(final SubLObject session, final SubLObject text, final SubLObject keystring, final SubLObject confirmed_term_keystring, final SubLObject url, final SubLObject title) {
        return lucene_session.lucene_add_document(session, text, keystring, confirmed_term_keystring, url, title, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject lucene_add_document_keyword(final SubLObject session, final SubLObject text, final SubLObject url, final SubLObject title) {
        return lucene_session.lucene_add_document(session, text, text, $str111$, url, title, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject add_fully_indexed_document(final SubLObject doc_string, final SubLObject url, final SubLObject title, final SubLObject sem_session, final SubLObject keyword_session) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject keystring = tag_document_for_indexing_with_offsets(doc_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject confirmed_term_keystring = thread.secondMultipleValue();
        thread.resetMultipleValues();
        lucene_add_document_semantic(sem_session, doc_string, keystring, confirmed_term_keystring, url, title);
        lucene_add_document_keyword(keyword_session, doc_string, url, title);
        return T;
    }

    public static SubLObject print_offset_info(final SubLObject stream, final SubLObject offset, final SubLObject end) {
        princ(offset, stream);
        princ($str142$_, stream);
        princ(end, stream);
        princ($str142$_, stream);
        return NIL;
    }

    public static SubLObject print_term_and_reln(final SubLObject stream, final SubLObject v_term, final SubLObject reln) {
        princ(reln, stream);
        princ($str143$_, stream);
        princ(v_term, stream);
        princ($str142$_, stream);
        return NIL;
    }

    public static SubLObject print_token(final SubLObject stream, final SubLObject offset, final SubLObject end, final SubLObject term_reln_pairs) {
        print_offset_info(stream, offset, end);
        SubLObject cdolist_list_var = term_reln_pairs;
        SubLObject term_reln_pair = NIL;
        term_reln_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            print_term_and_reln(stream, term_reln_pair.first(), second(term_reln_pair));
            cdolist_list_var = cdolist_list_var.rest();
            term_reln_pair = cdolist_list_var.first();
        } 
        princ($$$_, stream);
        return NIL;
    }

    public static SubLObject new_tagged_document(final SubLObject doc_string, SubLObject lexicon, SubLObject disambiguateP, SubLObject tagger, SubLObject sentencifyP) {
        if (lexicon == UNPROVIDED) {
            lexicon = get_default_document_annotation_lexicon(UNPROVIDED);
        }
        if (disambiguateP == UNPROVIDED) {
            disambiguateP = NIL;
        }
        if (tagger == UNPROVIDED) {
            tagger = POS_TAGGING_CONCEPT_TAGGER;
        }
        if (sentencifyP == UNPROVIDED) {
            sentencifyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(doc_string) : "Types.stringp(doc_string) " + "CommonSymbols.NIL != Types.stringp(doc_string) " + doc_string;
        final SubLObject _prev_bind_0 = document.$perform_dot_analysis_on_docs$.currentBinding(thread);
        try {
            document.$perform_dot_analysis_on_docs$.bind(T, thread);
            final SubLObject doc = document.new_document(doc_string, sentencifyP, UNPROVIDED);
            final SubLObject si = concept_tagger.tag_concepts(doc, list($LEXICON, lexicon, $SENSE_TAGGER, tagger));
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject sentence = iteration.iteration_next(si);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                }
            }
            if (NIL != disambiguateP) {
                final SubLObject rdis = rule_disambiguation.new_rule_disambiguator(UNPROVIDED, UNPROVIDED);
                rule_disambiguation.rdis_disambiguate(rdis, doc, UNPROVIDED);
                rule_disambiguation.finalize_rule_disambiguator(rdis);
            }
            return doc;
        } finally {
            document.$perform_dot_analysis_on_docs$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject find_concepts_for_document_segments(final SubLObject node_ids_and_strings, SubLObject app_type, SubLObject filter_spec_id, SubLObject user) {
        if (app_type == UNPROVIDED) {
            app_type = NIL;
        }
        if (filter_spec_id == UNPROVIDED) {
            filter_spec_id = $$$Mww;
        }
        if (user == UNPROVIDED) {
            user = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == filter_spec_id) {
            filter_spec_id = $$$Mww;
        }
        if (NIL != $trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(FIND_CONCEPTS_FOR_DOCUMENT_SEGMENTS, node_ids_and_strings, app_type, filter_spec_id, user));
        }
        if (NIL != $doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text($doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str113$Unable_to_open__S, $doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str167$writing_to__S, $doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(FIND_CONCEPTS_FOR_DOCUMENT_SEGMENTS, node_ids_and_strings, app_type, filter_spec_id, user));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return tag_document_nodes_for_display(node_ids_and_strings, app_type, term_learner_object_from_id(filter_spec_id), NIL, user);
    }

    public static SubLObject tag_document_nodes_for_display(final SubLObject node_ids_and_strings, SubLObject app_type, SubLObject filter_spec, SubLObject lexicon, SubLObject user) {
        if (app_type == UNPROVIDED) {
            app_type = $$$full;
        }
        if (filter_spec == UNPROVIDED) {
            filter_spec = NIL;
        }
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        if (user == UNPROVIDED) {
            user = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == lexicon) {
            final SubLObject task = (NIL != user) ? cure_api.default_task_for_user(user) : NIL;
            final SubLObject nl_mt = (NIL != task) ? cure_api.parsing_mt_for_task(task) : NIL;
            lexicon = get_default_document_ingester_annotation_learning_lexicon(app_type, filter_spec, nl_mt);
        }
        thread.resetMultipleValues();
        final SubLObject doc_string = get_doc_string_from_node_ids_and_strings(node_ids_and_strings);
        final SubLObject offset_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject doc = new_tagged_document(doc_string, lexicon, T, UNPROVIDED, UNPROVIDED);
        SubLObject output = NIL;
        final SubLObject vector_var = document.document_paragraphs(doc);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$40;
        SubLObject backwardP_var_$41;
        SubLObject length_$42;
        SubLObject v_iteration_$43;
        SubLObject element_num_$44;
        SubLObject sentence;
        SubLObject cdolist_list_var;
        SubLObject word;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            vector_var_$40 = document.paragraph_sentences(paragraph);
            backwardP_var_$41 = NIL;
            for (length_$42 = length(vector_var_$40), v_iteration_$43 = NIL, v_iteration_$43 = ZERO_INTEGER; v_iteration_$43.numL(length_$42); v_iteration_$43 = add(v_iteration_$43, ONE_INTEGER)) {
                element_num_$44 = (NIL != backwardP_var_$41) ? subtract(length_$42, v_iteration_$43, ONE_INTEGER) : v_iteration_$43;
                sentence = aref(vector_var_$40, element_num_$44);
                cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                word = NIL;
                word = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != document.word_cycls(word)) {
                        output = cconcatenate(get_output_lists_for_word(word, offset_list, UNPROVIDED), output);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                } 
            }
        }
        return nreverse(output);
    }

    public static SubLObject get_doc_string_from_node_ids_and_strings(final SubLObject node_ids_and_strings) {
        SubLObject doc_string = NIL;
        SubLObject offset_list = NIL;
        SubLObject current_offset = ZERO_INTEGER;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            SubLObject cdolist_list_var = Sort.sort(node_ids_and_strings, $sym172$_, FIRST);
            SubLObject node_id_and_string = NIL;
            node_id_and_string = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = node_id_and_string;
                SubLObject node_id = NIL;
                SubLObject string = NIL;
                destructuring_bind_must_consp(current, datum, $list170);
                node_id = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list170);
                string = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != unicode_nauts.unicode_naut_p(string, UNPROVIDED)) {
                        string = cycl_utilities.formula_arg1(string, UNPROVIDED);
                    }
                    string = string_utilities.string_substitute($$$_, $str171$_ua0_, string, symbol_function(EQUALP));
                    final SubLObject ascii_string = unicode_strings.display_to_subl_string(string, UNPROVIDED, UNPROVIDED);
                    princ(ascii_string, s);
                    offset_list = cons(list(node_id, current_offset), offset_list);
                    current_offset = add(current_offset, length(ascii_string));
                } else {
                    cdestructuring_bind_error(datum, $list170);
                }
                cdolist_list_var = cdolist_list_var.rest();
                node_id_and_string = cdolist_list_var.first();
            } 
            doc_string = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return values(doc_string, nreverse(offset_list));
    }

    public static SubLObject get_output_lists_for_word(final SubLObject word, final SubLObject offset_list, SubLObject return_individual_idsP) {
        if (return_individual_idsP == UNPROVIDED) {
            return_individual_idsP = $term_learner_keep_concepts_distinct$.getDynamicValue();
        }
        final SubLObject cycls_id = (NIL != return_individual_idsP) ? Mapping.mapcar(TERM_LEARNER_ID, Mapping.mapcar(CANONICALIZE_TERM, document.word_cycls(word))) : list(term_learner_id(Mapping.mapcar(CANONICALIZE_TERM, document.word_cycls(word))));
        final SubLObject length = document.word_length(word);
        final SubLObject node_num_and_node_offset = node_and_node_offset(document.word_offset(word), offset_list);
        final SubLObject node_num = node_num_and_node_offset.first();
        final SubLObject offset = second(node_num_and_node_offset);
        final SubLObject existing_conceptP = makeBoolean(NIL == new_named_entity_wordP(word));
        SubLObject result = NIL;
        SubLObject cdolist_list_var = cycls_id;
        SubLObject cycl_id = NIL;
        cycl_id = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(list(node_num, offset, length, cycl_id, existing_conceptP), result);
            cdolist_list_var = cdolist_list_var.rest();
            cycl_id = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject node_and_node_offset(final SubLObject global_offset, final SubLObject offset_list) {
        SubLObject previous_node_id = ZERO_INTEGER;
        SubLObject previous_node_start = ZERO_INTEGER;
        SubLObject cdolist_list_var = offset_list;
        SubLObject node_and_offset = NIL;
        node_and_offset = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = node_and_offset;
            SubLObject node_id = NIL;
            SubLObject offset = NIL;
            destructuring_bind_must_consp(current, datum, $list175);
            node_id = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list175);
            offset = current.first();
            current = current.rest();
            if (NIL == current) {
                if (offset.numG(global_offset)) {
                    return list(previous_node_id, subtract(global_offset, previous_node_start));
                }
                previous_node_id = node_id;
                previous_node_start = offset;
            } else {
                cdestructuring_bind_error(datum, $list175);
            }
            cdolist_list_var = cdolist_list_var.rest();
            node_and_offset = cdolist_list_var.first();
        } 
        return list(previous_node_id, subtract(global_offset, previous_node_start));
    }

    public static SubLObject new_named_entity_wordP(final SubLObject word) {
        final SubLObject cycls = document.word_cycls(word);
        if (NIL != list_utilities.lengthG(cycls, ONE_INTEGER, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != constant_p(cycls.first())) {
            return NIL;
        }
        if ((((NIL != cycl_grammar.cycl_nat_p(cycls.first())) && cycl_utilities.nat_functor(cycls.first()).eql($$InstanceNamedFn_Ternary)) && (NIL != subl_promotions.memberP(cycl_utilities.nat_arg2(cycls.first(), UNPROVIDED), $list177, UNPROVIDED, UNPROVIDED))) && ((NIL == narts_high.find_nart(cycls.first())) || (NIL != nart_has_non_derived_assertionsP(cycls.first())))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject nart_has_non_derived_assertionsP(final SubLObject cycl) {
        return makeBoolean(NIL == narts_high.useless_nartP(czer_main.canonicalize_term(cycl, UNPROVIDED)));
    }

    public static SubLObject find_interps_for_document_segments(final SubLObject node_ids_and_strings, SubLObject app_type, SubLObject filter_spec_id, SubLObject user) {
        if (app_type == UNPROVIDED) {
            app_type = $$$full;
        }
        if (filter_spec_id == UNPROVIDED) {
            filter_spec_id = $$$Mww;
        }
        if (user == UNPROVIDED) {
            user = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == filter_spec_id) {
            filter_spec_id = $$$Mww;
        }
        if (NIL != $trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(FIND_INTERPS_FOR_DOCUMENT_SEGMENTS, node_ids_and_strings, app_type, filter_spec_id, user));
        }
        if (NIL != $doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text($doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str113$Unable_to_open__S, $doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str167$writing_to__S, $doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(FIND_INTERPS_FOR_DOCUMENT_SEGMENTS, node_ids_and_strings, app_type, filter_spec_id, user));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        final SubLObject filter_spec = term_learner_object_from_id(filter_spec_id);
        final SubLObject task = (NIL != user) ? cure_api.default_task_for_user(user) : NIL;
        final SubLObject nl_mt = (NIL != task) ? cure_api.parsing_mt_for_task(task) : NIL;
        final SubLObject lexicon = get_default_document_ingester_annotation_learning_lexicon(app_type, filter_spec, nl_mt);
        thread.resetMultipleValues();
        final SubLObject doc_string = get_doc_string_from_node_ids_and_strings(node_ids_and_strings);
        final SubLObject offset_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject dogs_have_four_feet = $$$dogs_have_four_feet;
        final SubLObject location = search(dogs_have_four_feet, doc_string, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject length = length(dogs_have_four_feet);
        final SubLObject cycl = $list180;
        final SubLObject node_and_offset = node_and_node_offset(location, offset_list);
        final SubLObject node_num = node_and_offset.first();
        final SubLObject node_offset = second(node_and_offset);
        if (NIL != location) {
            return list(list(node_num, node_offset, length, term_learner_id(cycl), dogs_have_four_feet));
        }
        return NIL;
    }

    public static SubLObject get_default_medical_tagging_lexicon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == abstract_lexicon.abstract_lexicon_p($default_medical_tagging_lexicon$.getDynamicValue(thread))) {
            $default_medical_tagging_lexicon$.setDynamicValue(make_default_document_annotation_lexicon(UNPROVIDED), thread);
            methods.funcall_instance_method_with_1_args($default_medical_tagging_lexicon$.getDynamicValue(thread), EXCLUDE_POS, $$Verb);
            methods.funcall_instance_method_with_1_args($default_medical_tagging_lexicon$.getDynamicValue(thread), EXCLUDE_POS, $$Adjective);
            methods.funcall_instance_method_with_1_args($default_medical_tagging_lexicon$.getDynamicValue(thread), EXCLUDE_POS, $$Adverb);
            methods.funcall_instance_method_with_1_args($default_medical_tagging_lexicon$.getDynamicValue(thread), EXCLUDE_POS, $$Gerundive);
            methods.funcall_instance_method_with_1_args($default_medical_tagging_lexicon$.getDynamicValue(thread), ADD_CONCEPT_FILTER_SPEC, $list187);
        }
        return $default_medical_tagging_lexicon$.getDynamicValue(thread);
    }

    public static SubLObject clear_default_medical_tagging_lexicon() {
        $default_medical_tagging_lexicon$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject augment_medical_html_file_with_cyc_terms(final SubLObject filepath, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = get_default_medical_tagging_lexicon();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject in_string = file_utilities.slurp_file(filepath);
        final SubLObject out_path = cconcatenate(filepath, $str188$_tagged_html);
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(out_path, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str113$Unable_to_open__S, out_path);
            }
            final SubLObject s = stream;
            princ(augment_html_document_with_cyc_terms(in_string, lexicon), s);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return out_path;
    }

    public static SubLObject augment_html_document_with_cyc_terms(final SubLObject html_string, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = get_default_document_ingester_annotation_lexicon(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject html_tokens = xml_parsing_utilities.xml_string_tokenize(html_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject id_num = ZERO_INTEGER;
        SubLObject output_string = NIL;
        thread.resetMultipleValues();
        final SubLObject text_string = get_text_string_from_tokens(html_tokens, UNPROVIDED);
        SubLObject tokens_to_text_string_mappings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject tag_locations = NIL;
        final SubLObject vector_var = document.document_paragraphs(new_tagged_document(text_string, lexicon, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$45;
        SubLObject backwardP_var_$46;
        SubLObject length_$47;
        SubLObject v_iteration_$48;
        SubLObject element_num_$49;
        SubLObject sentence;
        SubLObject cdolist_list_var;
        SubLObject word;
        SubLObject cycls;
        SubLObject word_start;
        SubLObject word_end;
        SubLObject start_tag;
        SubLObject end_tag;
        SubLObject cdolist_list_var_$50;
        SubLObject cycl;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            vector_var_$45 = document.paragraph_sentences(paragraph);
            backwardP_var_$46 = NIL;
            for (length_$47 = length(vector_var_$45), v_iteration_$48 = NIL, v_iteration_$48 = ZERO_INTEGER; v_iteration_$48.numL(length_$47); v_iteration_$48 = add(v_iteration_$48, ONE_INTEGER)) {
                element_num_$49 = (NIL != backwardP_var_$46) ? subtract(length_$47, v_iteration_$48, ONE_INTEGER) : v_iteration_$48;
                sentence = aref(vector_var_$45, element_num_$49);
                cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                word = NIL;
                word = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    cycls = document.word_cycls(word);
                    word_start = document.word_offset(word);
                    word_end = add(word_start, document.word_length(word));
                    if (NIL != cycls) {
                        start_tag = $str111$;
                        end_tag = $str111$;
                        cdolist_list_var_$50 = cycls;
                        cycl = NIL;
                        cycl = cdolist_list_var_$50.first();
                        while (NIL != cdolist_list_var_$50) {
                            if (NIL != forts.fort_p(cycl)) {
                                start_tag = cconcatenate(start_tag, cconcatenate($str189$_span_property__cyc_termName__con, new SubLObject[]{ format_nil.format_nil_a_no_copy(doc_tagger_rdf_name(cycl)), $str190$___span_class__cycTerm__id__cycTe, format_nil.format_nil_a_no_copy(id_num), $str191$__property__cyc_termId__content__, format_nil.format_nil_a_no_copy(doc_tagger_rdf_id(cycl)), $str192$__ }));
                                end_tag = cconcatenate(end_tag, $str193$__span___span_);
                                id_num = add(id_num, ONE_INTEGER);
                            }
                            cdolist_list_var_$50 = cdolist_list_var_$50.rest();
                            cycl = cdolist_list_var_$50.first();
                        } 
                        tag_locations = cons(list(word_start, start_tag), tag_locations);
                        tag_locations = cons(list(word_end, end_tag), tag_locations);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                } 
            }
        }
        tag_locations = nreverse(tag_locations);
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            SubLObject current_location = ZERO_INTEGER;
            SubLObject tag_index = NIL;
            SubLObject tag = NIL;
            if (NIL != tag_locations) {
                final SubLObject datum_evaluated_var = tag_locations.first();
                tag_index = datum_evaluated_var.first();
                tag = cadr(datum_evaluated_var);
            }
            SubLObject current;
            final SubLObject datum = current = mapping_first_elt_info(tokens_to_text_string_mappings);
            SubLObject map_string_index = NIL;
            SubLObject map_string_end_index = NIL;
            destructuring_bind_must_consp(current, datum, $list194);
            map_string_index = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list194);
            map_string_end_index = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject list_var = NIL;
                SubLObject token = NIL;
                SubLObject token_index = NIL;
                list_var = html_tokens;
                token = list_var.first();
                for (token_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , token = list_var.first() , token_index = add(ONE_INTEGER, token_index)) {
                    if ((NIL == tag_locations) || (NIL != xml_parsing_utilities.xml_tagP(token))) {
                        princ(token, s);
                    } else
                        if (map_string_end_index.numLE(tag_index)) {
                            princ(token, s);
                            tokens_to_text_string_mappings = tokens_to_text_string_mappings.rest();
                            current_location = map_string_end_index;
                            if (NIL != tokens_to_text_string_mappings) {
                                final SubLObject datum_evaluated_var2 = mapping_first_elt_info(tokens_to_text_string_mappings);
                                map_string_index = datum_evaluated_var2.first();
                                map_string_end_index = cadr(datum_evaluated_var2);
                            }
                        } else {
                            SubLObject current_location_in_token = ZERO_INTEGER;
                            SubLObject tag_offset_into_current_token = subtract(tag_index, map_string_index);
                            while (current_location_in_token.numL(length(token))) {
                                SubLObject next_tag_not_in_this_token = NIL;
                                if (tag_offset_into_current_token.numG(length(token))) {
                                    next_tag_not_in_this_token = T;
                                }
                                SubLObject next_string_to_print = subseq(token, current_location_in_token, NIL != next_tag_not_in_this_token ? NIL : tag_offset_into_current_token);
                                princ(next_string_to_print, s);
                                current_location_in_token = add(current_location_in_token, length(next_string_to_print));
                                current_location = add(current_location, length(next_string_to_print));
                                if (current_location.numGE(map_string_end_index)) {
                                    tokens_to_text_string_mappings = tokens_to_text_string_mappings.rest();
                                    if (NIL != tokens_to_text_string_mappings) {
                                        final SubLObject datum_evaluated_var3 = mapping_first_elt_info(tokens_to_text_string_mappings);
                                        map_string_index = datum_evaluated_var3.first();
                                        map_string_end_index = cadr(datum_evaluated_var3);
                                    }
                                }
                                if (NIL == next_tag_not_in_this_token) {
                                    princ(tag, s);
                                    tag_locations = tag_locations.rest();
                                }
                                if (NIL == tag_locations) {
                                    next_string_to_print = subseq(token, current_location_in_token, UNPROVIDED);
                                    princ(next_string_to_print, s);
                                    current_location = add(current_location, length(next_string_to_print));
                                    current_location_in_token = add(current_location_in_token, length(next_string_to_print));
                                    if (current_location.numGE(map_string_end_index)) {
                                        tokens_to_text_string_mappings = tokens_to_text_string_mappings.rest();
                                        if (NIL != tokens_to_text_string_mappings) {
                                            final SubLObject datum_evaluated_var4 = mapping_first_elt_info(tokens_to_text_string_mappings);
                                            map_string_index = datum_evaluated_var4.first();
                                            map_string_end_index = cadr(datum_evaluated_var4);
                                        }
                                    }
                                    tag_index = NIL;
                                } else {
                                    tag_index = tag_locations.first().first();
                                    tag = second(tag_locations.first());
                                    tag_offset_into_current_token = subtract(tag_index, map_string_index);
                                }
                            } 
                        }

                }
            } else {
                cdestructuring_bind_error(datum, $list194);
            }
            output_string = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return output_string;
    }

    public static SubLObject doc_tagger_rdf_name(final SubLObject cycl) {
        if (NIL != forts.fort_p(cycl)) {
            return web_utilities.html_url_encode(string_utilities.fort_print_name(cycl), UNPROVIDED);
        }
        return web_utilities.html_url_encode(string_utilities.stringify_terms(cycl, UNPROVIDED, UNPROVIDED), UNPROVIDED);
    }

    public static SubLObject doc_tagger_rdf_id(final SubLObject cycl) {
        return cconcatenate($str195$http___sw_cyc_com_concept_, kb_utilities.compact_hl_external_id_string(cycl));
    }

    public static SubLObject mapping_first_elt_info(final SubLObject tokens_to_text_string_mappings) {
        if (NIL == tokens_to_text_string_mappings) {
            return list(ZERO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject mapping = tokens_to_text_string_mappings.first();
        final SubLObject mapping_string_index = second(mapping);
        final SubLObject mapping_string_length = third(mapping);
        return list(mapping_string_index, add(mapping_string_index, mapping_string_length));
    }

    public static SubLObject get_text_string_from_tokens(final SubLObject html_tokens, SubLObject tokens_to_ignore) {
        if (tokens_to_ignore == UNPROVIDED) {
            tokens_to_ignore = $list196;
        }
        SubLObject tokens_to_text_string_mappings = NIL;
        SubLObject text_string = NIL;
        SubLObject ignore_stack = NIL;
        SubLObject text_string_length = ZERO_INTEGER;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            SubLObject list_var = NIL;
            SubLObject token = NIL;
            SubLObject token_index = NIL;
            list_var = html_tokens;
            token = list_var.first();
            for (token_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , token = list_var.first() , token_index = add(ONE_INTEGER, token_index)) {
                if (((NIL != xml_parsing_utilities.xml_opening_tag_p(token)) && (NIL == xml_parsing_utilities.xml_closing_tag_p(token))) && (NIL != string_utilities.starts_with_one_of(subseq(token, ONE_INTEGER, UNPROVIDED), tokens_to_ignore))) {
                    ignore_stack = cons(xml_parsing_utilities.parse_html_token(token).first(), ignore_stack);
                } else
                    if ((NIL != xml_parsing_utilities.xml_closing_tag_p(token)) && xml_parsing_utilities.parse_html_token(token).first().equal(tokens_to_ignore.first())) {
                        ignore_stack = ignore_stack.rest();
                    } else
                        if (NIL == xml_parsing_utilities.xml_tagP(token)) {
                            if (NIL == xml_parsing_utilities.xml_comment_p(token)) {
                                if (NIL == ignore_stack) {
                                    princ(token, s);
                                    tokens_to_text_string_mappings = cons(list(token_index, text_string_length, length(token)), tokens_to_text_string_mappings);
                                    text_string_length = add(text_string_length, length(token));
                                }
                            }
                        }


            }
            text_string = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return values(text_string, nreverse(tokens_to_text_string_mappings));
    }

    public static SubLObject tag_document_for_indexing_with_offsets(final SubLObject original_doc_string, SubLObject disambiguator, SubLObject lexicon, SubLObject include_stringsP) {
        if (disambiguator == UNPROVIDED) {
            disambiguator = $NEW;
        }
        if (lexicon == UNPROVIDED) {
            lexicon = get_default_document_annotation_lexicon(UNPROVIDED);
        }
        if (include_stringsP == UNPROVIDED) {
            include_stringsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_disambiguator = eq(disambiguator, $NEW);
        final SubLObject v_document = new_tagged_document(original_doc_string, lexicon, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject concepts_string = $str111$;
        if (NIL != new_disambiguator) {
            disambiguator = rule_disambiguation.new_rule_disambiguator(UNPROVIDED, UNPROVIDED);
        }
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_assumed_validP$.currentBinding(thread);
            try {
                lexicon_macros.$nl_trie_assumed_validP$.bind(T, thread);
                final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$51 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    final SubLObject local_state;
                    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
                    final SubLObject _prev_bind_0_$52 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                        try {
                            rule_disambiguation.rdis_disambiguate(disambiguator, v_document, UNPROVIDED);
                            final SubLObject vector_var = document.document_paragraphs(v_document);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject element_num;
                            SubLObject paragraph;
                            SubLObject vector_var_$53;
                            SubLObject backwardP_var_$54;
                            SubLObject length_$55;
                            SubLObject v_iteration_$56;
                            SubLObject element_num_$57;
                            SubLObject sentence;
                            SubLObject cdolist_list_var;
                            SubLObject word;
                            SubLObject word_string;
                            SubLObject word_start;
                            SubLObject word_end;
                            SubLObject string_words;
                            SubLObject term_reln_pairs;
                            SubLObject list_var;
                            SubLObject interp;
                            SubLObject interp_num;
                            SubLObject v_term;
                            SubLObject term_id;
                            SubLObject item_var;
                            SubLObject cdolist_list_var_$58;
                            SubLObject justifications;
                            SubLObject justification;
                            SubLObject genl;
                            SubLObject genl_id;
                            SubLObject item_var2;
                            SubLObject prev_partial_words_length;
                            SubLObject cdolist_list_var_$59;
                            SubLObject partial_word_string;
                            SubLObject partial_word_start;
                            SubLObject partial_word_length;
                            SubLObject partial_word_end;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                paragraph = aref(vector_var, element_num);
                                vector_var_$53 = document.paragraph_sentences(paragraph);
                                backwardP_var_$54 = NIL;
                                for (length_$55 = length(vector_var_$53), v_iteration_$56 = NIL, v_iteration_$56 = ZERO_INTEGER; v_iteration_$56.numL(length_$55); v_iteration_$56 = add(v_iteration_$56, ONE_INTEGER)) {
                                    element_num_$57 = (NIL != backwardP_var_$54) ? subtract(length_$55, v_iteration_$56, ONE_INTEGER) : v_iteration_$56;
                                    sentence = aref(vector_var_$53, element_num_$57);
                                    cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                                    word = NIL;
                                    word = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        word_string = document.word_string(word);
                                        word_start = document.word_offset(word);
                                        word_end = add(word_start, document.word_length(word));
                                        string_words = string_utilities.split_string(word_string, UNPROVIDED);
                                        term_reln_pairs = NIL;
                                        if ((NIL != include_stringsP) && (NIL == list_utilities.lengthG(string_words, ONE_INTEGER, UNPROVIDED))) {
                                            term_reln_pairs = cons(list(word_string, $$$s), term_reln_pairs);
                                        }
                                        list_var = NIL;
                                        interp = NIL;
                                        interp_num = NIL;
                                        list_var = document.word_interps(word);
                                        interp = list_var.first();
                                        for (interp_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , interp = list_var.first() , interp_num = add(ONE_INTEGER, interp_num)) {
                                            v_term = nl_api_datastructures.get_nl_interp_cycl(interp);
                                            term_id = document_annotation_term_id(v_term, UNPROVIDED);
                                            if (term_id.isString()) {
                                                item_var = list(term_id, $$$t);
                                                if (NIL == member(item_var, term_reln_pairs, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                    term_reln_pairs = cons(item_var, term_reln_pairs);
                                                }
                                                justifications = cdolist_list_var_$58 = get_upwards_closure_justifications_cached(v_term);
                                                justification = NIL;
                                                justification = cdolist_list_var_$58.first();
                                                while (NIL != cdolist_list_var_$58) {
                                                    genl = get_closure_justification_genl(justification);
                                                    genl_id = document_annotation_term_id(genl, UNPROVIDED);
                                                    if (genl_id.isString()) {
                                                        item_var2 = list(genl_id, closure_justification_pred_id(justification));
                                                        if (NIL == member(item_var2, term_reln_pairs, EQUAL, symbol_function(IDENTITY))) {
                                                            term_reln_pairs = cons(item_var2, term_reln_pairs);
                                                        }
                                                    }
                                                    cdolist_list_var_$58 = cdolist_list_var_$58.rest();
                                                    justification = cdolist_list_var_$58.first();
                                                } 
                                            }
                                        }
                                        if (NIL != term_reln_pairs) {
                                            print_token(s, word_start, word_end, nreverse(term_reln_pairs));
                                        }
                                        if ((NIL != include_stringsP) && (NIL != search($$$_, word_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                            prev_partial_words_length = ZERO_INTEGER;
                                            cdolist_list_var_$59 = string_words;
                                            partial_word_string = NIL;
                                            partial_word_string = cdolist_list_var_$59.first();
                                            while (NIL != cdolist_list_var_$59) {
                                                if (NIL == string_utilities.empty_string_p(partial_word_string)) {
                                                    partial_word_start = add(word_start, prev_partial_words_length);
                                                    partial_word_length = length(partial_word_string);
                                                    partial_word_end = add(partial_word_start, partial_word_length);
                                                    print_token(s, partial_word_start, partial_word_end, list(list(partial_word_string, $$$s)));
                                                    prev_partial_words_length = add(prev_partial_words_length, partial_word_length, ONE_INTEGER);
                                                }
                                                cdolist_list_var_$59 = cdolist_list_var_$59.rest();
                                                partial_word_string = cdolist_list_var_$59.first();
                                            } 
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        word = cdolist_list_var.first();
                                    } 
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$53 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$53, thread);
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$52, thread);
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$51, thread);
                }
            } finally {
                lexicon_macros.$nl_trie_assumed_validP$.rebind(_prev_bind_0, thread);
            }
            concepts_string = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        if (NIL != new_disambiguator) {
            rule_disambiguation.finalize_rule_disambiguator(disambiguator);
        }
        return values(string_utilities.strip_final(concepts_string, UNPROVIDED), $str111$);
    }

    public static SubLObject document_annotation_relation_from_id(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return rassoc(id, $predicate_id_table$.getDynamicValue(thread), EQUAL, UNPROVIDED).first();
    }

    public static SubLObject generate_retrieval_justification(final SubLObject spec_id, final SubLObject relation_id, final SubLObject genl_id) {
        final SubLObject spec_term = document_annotation_term_from_id(spec_id);
        final SubLObject genl_term = document_annotation_term_from_id(genl_id);
        final SubLObject relation = document_annotation_relation_from_id(relation_id);
        if (relation_id.equal($$$t)) {
            return cconcatenate($str201$Meaning__, format_nil.format_nil_a_no_copy(pph_main.generate_phrase(spec_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        if ((spec_term.isKeyword() || genl_term.isKeyword()) || (NIL == relation)) {
            return cconcatenate($str202$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(NIL != relation ? relation : relation_id), $$$_, format_nil.format_nil_a_no_copy(NIL != spec_term ? spec_term : spec_id), $str203$__, format_nil.format_nil_a_no_copy(NIL != genl_term ? genl_term : genl_id), $str204$_ });
        }
        return pph_main.generate_phrase(substitute_template(predicate_template(relation), spec_term, genl_term), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject generate_retrieval_justification_from_justification_string(final SubLObject justification_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(GENERATE_RETRIEVAL_JUSTIFICATION_FROM_JUSTIFICATION_STRING, justification_string));
        }
        if (NIL != $doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text($doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str113$Unable_to_open__S, $doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str167$writing_to__S, $doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(GENERATE_RETRIEVAL_JUSTIFICATION_FROM_JUSTIFICATION_STRING, justification_string));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        assert NIL != stringp(justification_string) : "Types.stringp(justification_string) " + "CommonSymbols.NIL != Types.stringp(justification_string) " + justification_string;
        final SubLObject justification_ids = string_utilities.split_string(justification_string, UNPROVIDED);
        if (NIL != list_utilities.lengthGE(justification_ids, THREE_INTEGER, UNPROVIDED)) {
            final SubLObject justification_args = get_best_justifications_from_arg_list(justification_ids);
            return generate_retrieval_justification(justification_args.first(), second(justification_args), third(justification_args));
        }
        if ((NIL != list_utilities.lengthE(justification_ids, TWO_INTEGER, UNPROVIDED)) && (NIL != Strings.string_equal(justification_ids.first(), $$$s, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return cconcatenate($str206$Text_Match__, format_nil.format_nil_a_no_copy(second(justification_ids)));
        }
        Errors.warn($str207$Invalid_justification_string___S, justification_string);
        return NIL;
    }

    public static SubLObject get_best_justifications_from_arg_list(final SubLObject justification_id_list) {
        if (NIL != list_utilities.lengthE(justification_id_list, THREE_INTEGER, UNPROVIDED)) {
            return justification_id_list;
        }
        SubLObject best_pred = second(justification_id_list);
        SubLObject best_arg = third(justification_id_list);
        SubLObject pred = NIL;
        SubLObject pred_$61 = NIL;
        SubLObject arg = NIL;
        SubLObject arg_$62 = NIL;
        pred = list_utilities.every_nth(TWO_INTEGER, justification_id_list.rest());
        pred_$61 = pred.first();
        arg = list_utilities.every_nth(TWO_INTEGER, cddr(justification_id_list));
        arg_$62 = arg.first();
        while ((NIL != arg) || (NIL != pred)) {
            if (NIL != better_justification_pred(document_annotation_relation_from_id(pred_$61), document_annotation_relation_from_id(best_pred))) {
                best_pred = pred_$61;
                best_arg = arg_$62;
            }
            pred = pred.rest();
            pred_$61 = pred.first();
            arg = arg.rest();
            arg_$62 = arg.first();
        } 
        return list(justification_id_list.first(), best_pred, best_arg);
    }

    public static SubLObject better_justification_pred(final SubLObject pred1, final SubLObject pred2) {
        if (pred1.eql($$conditionsCommonlyCooccur)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject generate_term_explanation(final SubLObject term_id_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(GENERATE_TERM_EXPLANATION, term_id_string));
        }
        if (NIL != $doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text($doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str113$Unable_to_open__S, $doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str167$writing_to__S, $doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(GENERATE_TERM_EXPLANATION, term_id_string));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        assert NIL != stringp(term_id_string) : "Types.stringp(term_id_string) " + "CommonSymbols.NIL != Types.stringp(term_id_string) " + term_id_string;
        final SubLObject v_term = document_annotation_term_from_id(term_id_string);
        final SubLObject canonical_phrase = nl_generation_api.cycl_term_to_nl_string_internal(v_term, $DEFAULT).first();
        final SubLObject userdoccomment = backward.removal_ask_variable($sym59$_X, listS($$userDocComment, v_term, $list62), $$CCF_CAE_QueryMt, UNPROVIDED, UNPROVIDED).first();
        final SubLObject pph_params = nl_generation_api.new_pph_parameters(listS($DEMERIT_CUTOFF, pph_vars.$pph_suggested_demerit_cutoff$.getGlobalValue(), $list213));
        final SubLObject other_strings = get_other_explanatory_strings_for_term(v_term);
        final SubLObject synonyms = nl_generation_api.cycl_term_to_nl_string_internal(v_term, pph_params).rest();
        final SubLObject synonym_string = (NIL != synonyms) ? cconcatenate($str214$_b_Synonyms__b___, string_utilities.join_strings(synonyms, UNPROVIDED)) : $str111$;
        final SubLObject result_string = cconcatenate($str215$_b_, new SubLObject[]{ canonical_phrase, $str216$__b___, NIL != userdoccomment ? userdoccomment : $str111$, $str217$_br_, other_strings, synonym_string });
        return cconcatenate($str218$_div_style__background_color__whi, new SubLObject[]{ result_string, $str219$__div_ });
    }

    public static SubLObject get_other_explanatory_strings_for_term(final SubLObject v_term) {
        SubLObject output_string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            if ((NIL != genls.genlsP(v_term, $$SurgicalProcedure, $$InferencePSC, UNPROVIDED)) || (NIL != genls.genlsP(v_term, $$Surgery, $$InferencePSC, UNPROVIDED))) {
                final SubLObject experts = backward.removal_ask_variable($sym222$_DOC, list($$expertAtSkill, $sym222$_DOC, v_term), $$CCFPersonnelDataMt, UNPROVIDED, UNPROVIDED);
                SubLObject sentences = NIL;
                SubLObject cdolist_list_var = experts;
                SubLObject expert = NIL;
                expert = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    sentences = cons(list($$expertAtSkill, expert, v_term), sentences);
                    cdolist_list_var = cdolist_list_var.rest();
                    expert = cdolist_list_var.first();
                } 
                if (NIL != sentences) {
                    princ($str225$_b_Specialists____b_, stream);
                    princ(pph_document.pph_summarize_term(v_term, sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), stream);
                    princ($str217$_br_, stream);
                    terpri(stream);
                }
            }
            output_string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return output_string;
    }

    public static SubLObject clear_document_annotation_term_id() {
        final SubLObject cs = $document_annotation_term_id_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_document_annotation_term_id(final SubLObject v_term, SubLObject hl_idsP) {
        if (hl_idsP == UNPROVIDED) {
            hl_idsP = $doc_annotation_use_hl_ids$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($document_annotation_term_id_caching_state$.getGlobalValue(), list(v_term, hl_idsP), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject document_annotation_term_id_internal(final SubLObject v_term, final SubLObject hl_idsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ret_value = NIL;
        final SubLObject _prev_bind_0 = $terse_guid_serialization_enabled_for_cfasl_encode_externalizedP$.currentBinding(thread);
        try {
            $terse_guid_serialization_enabled_for_cfasl_encode_externalizedP$.bind(NIL, thread);
            if (NIL != hl_idsP) {
                ret_value = kb_utilities.hl_external_id_string(cycl_utilities.hl_to_el(v_term));
            } else
                if ((NIL != nart_handles.nart_p(v_term)) && (get_cached_term_id(v_term) != $NOT_FOUND)) {
                    ret_value = get_cached_term_id(v_term);
                } else {
                    final SubLObject el_term = cycl_utilities.hl_to_el(v_term);
                    final SubLObject el_id = get_cached_term_id(el_term);
                    if ((el_id == $NOT_FOUND) && v_term.isNumber()) {
                        ret_value = v_term;
                    } else
                        if (el_id == $NOT_FOUND) {
                            ret_value = kb_utilities.hl_external_id_string(el_term);
                        } else {
                            ret_value = el_id;
                        }

                }

        } finally {
            $terse_guid_serialization_enabled_for_cfasl_encode_externalizedP$.rebind(_prev_bind_0, thread);
        }
        return ret_value;
    }

    public static SubLObject document_annotation_term_id(final SubLObject v_term, SubLObject hl_idsP) {
        if (hl_idsP == UNPROVIDED) {
            hl_idsP = $doc_annotation_use_hl_ids$.getDynamicValue();
        }
        SubLObject caching_state = $document_annotation_term_id_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(DOCUMENT_ANNOTATION_TERM_ID, $document_annotation_term_id_caching_state$, $int$25000, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, hl_idsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && hl_idsP.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(document_annotation_term_id_internal(v_term, hl_idsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, hl_idsP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject clear_document_annotation_term_from_id() {
        final SubLObject cs = $document_annotation_term_from_id_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_document_annotation_term_from_id(final SubLObject id) {
        return memoization_state.caching_state_remove_function_results_with_args($document_annotation_term_from_id_caching_state$.getGlobalValue(), list(id), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject document_annotation_term_from_id_internal(final SubLObject id) {
        return get_term_from_cached_id(id);
    }

    public static SubLObject document_annotation_term_from_id(final SubLObject id) {
        SubLObject caching_state = $document_annotation_term_from_id_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(DOCUMENT_ANNOTATION_TERM_FROM_ID, $document_annotation_term_from_id_caching_state$, $int$5000, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, id, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(document_annotation_term_from_id_internal(id)));
            memoization_state.caching_state_put(caching_state, id, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject get_cached_term_id(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        maybe_initialize_doc_annotator_term_id_fbc(UNPROVIDED);
        final SubLObject cached_id = file_backed_cache.file_backed_cache_lookup(v_term, $doc_annotator_term_id_fbc$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        if (cached_id.isNumber()) {
            return write_to_string(cached_id, EMPTY_SUBL_OBJECT_ARRAY);
        }
        return cached_id;
    }

    public static SubLObject get_term_from_cached_id(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        maybe_initialize_doc_annotator_id_term_fbc(UNPROVIDED);
        SubLObject v_term = file_backed_cache.file_backed_cache_lookup(NIL != number_utilities.number_string_p(id) ? read_from_string(id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : id, $doc_annotator_id_term_fbc$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        if (v_term == $NOT_FOUND) {
            v_term = kb_utilities.maybe_find_object_by_compact_hl_external_id_string(id);
        }
        return NIL != v_term ? v_term : $NOT_FOUND;
    }

    public static SubLObject get_default_document_ingester_annotation_learning_lexicon(SubLObject app_type, SubLObject filter_spec, SubLObject nl_mt) {
        if (app_type == UNPROVIDED) {
            app_type = NIL;
        }
        if (filter_spec == UNPROVIDED) {
            filter_spec = NIL;
        }
        if (nl_mt == UNPROVIDED) {
            nl_mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == abstract_lexicon.abstract_lexicon_p(dictionary.dictionary_lookup($default_document_ingester_annotation_learning_lexicons$.getDynamicValue(thread), list(app_type, filter_spec, nl_mt), UNPROVIDED))) {
            final SubLObject lex = make_default_document_annotation_lexicon(nl_mt);
            methods.funcall_instance_method_with_1_args(lex, EXCLUDE_POS, $$Verb);
            methods.funcall_instance_method_with_1_args(lex, EXCLUDE_POS, $$Adjective);
            methods.funcall_instance_method_with_1_args(lex, EXCLUDE_POS, $$Adverb);
            methods.funcall_instance_method_with_1_args(lex, EXCLUDE_POS, $$Gerundive);
            if (NIL != valid_constant($$PredicateTaxonomy, UNPROVIDED)) {
                methods.funcall_instance_method_with_1_args(lex, ADD_CONCEPT_FILTER_SPEC, $list233);
            }
            if (NIL != filter_spec) {
                methods.funcall_instance_method_with_1_args(lex, ADD_CONCEPT_FILTER_SPEC, filter_spec);
            }
            if ((NIL != named_entity_recognizer.stanford_ner_ping(UNPROVIDED, UNPROVIDED)) && (!app_type.equal($$$vocabMarking))) {
                methods.funcall_instance_method_with_1_args(lex, ADD_LEARNER, STANFORD_NER_LEARN);
            }
            dictionary.dictionary_enter($default_document_ingester_annotation_learning_lexicons$.getDynamicValue(thread), list(app_type, filter_spec), lex);
        }
        return dictionary.dictionary_lookup($default_document_ingester_annotation_learning_lexicons$.getDynamicValue(thread), list(app_type, filter_spec), UNPROVIDED);
    }

    public static SubLObject clear_default_document_ingester_annotation_learning_lexicon(SubLObject app_type) {
        if (app_type == UNPROVIDED) {
            app_type = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == app_type) {
            dictionary.clear_dictionary($default_document_ingester_annotation_learning_lexicons$.getDynamicValue(thread));
        } else {
            dictionary.dictionary_enter($default_document_ingester_annotation_learning_lexicons$.getDynamicValue(thread), app_type, NIL);
        }
        return NIL;
    }

    public static SubLObject clear_get_default_document_ingester_annotation_lexicon() {
        final SubLObject cs = $get_default_document_ingester_annotation_lexicon_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_default_document_ingester_annotation_lexicon(SubLObject nl_mt) {
        if (nl_mt == UNPROVIDED) {
            nl_mt = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($get_default_document_ingester_annotation_lexicon_caching_state$.getGlobalValue(), list(nl_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_default_document_ingester_annotation_lexicon_internal(final SubLObject nl_mt) {
        final SubLObject lex = make_default_document_annotation_lexicon(nl_mt);
        methods.funcall_instance_method_with_1_args(lex, SET_CASE_SENSITIVITY, $OFF);
        methods.funcall_instance_method_with_1_args(lex, EXCLUDE_POS, $$Adjective);
        methods.funcall_instance_method_with_1_args(lex, EXCLUDE_POS, $$Adverb);
        methods.funcall_instance_method_with_1_args(lex, EXCLUDE_POS, $$Gerundive);
        methods.funcall_instance_method_with_1_args(lex, EXCLUDE_PREDICATE, $$countryCodeTrigraph);
        methods.funcall_instance_method_with_1_args(lex, EXCLUDE_PREDICATE, $$countryCodeDigraph);
        methods.funcall_instance_method_with_1_args(lex, ALLOW_POS, $$ClosedClassWord);
        methods.funcall_instance_method_with_1_args(lex, ADD_LEARNER, SCALAR_INTERVAL_LEARN);
        methods.funcall_instance_method_with_1_args(lex, ADD_LEARNER, DATE_LEARN);
        if (NIL == lex) {
            methods.funcall_instance_method_with_1_args(lex, EXCLUDE_POS, $$Verb);
            if (NIL != valid_constant($$PredicateTaxonomy, UNPROVIDED)) {
                methods.funcall_instance_method_with_1_args(lex, ADD_CONCEPT_FILTER_SPEC, $list233);
            }
        }
        return lex;
    }

    public static SubLObject get_default_document_ingester_annotation_lexicon(SubLObject nl_mt) {
        if (nl_mt == UNPROVIDED) {
            nl_mt = NIL;
        }
        SubLObject caching_state = $get_default_document_ingester_annotation_lexicon_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_DEFAULT_DOCUMENT_INGESTER_ANNOTATION_LEXICON, $get_default_document_ingester_annotation_lexicon_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, nl_mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(get_default_document_ingester_annotation_lexicon_internal(nl_mt)));
            memoization_state.caching_state_put(caching_state, nl_mt, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_default_document_ingester_annotation_lexicon_for_mt(final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($get_default_document_ingester_annotation_lexicon_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_default_document_annotation_learning_lexicon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == abstract_lexicon.abstract_lexicon_p($default_document_annotation_learning_lexicon$.getDynamicValue(thread))) {
            $default_document_annotation_learning_lexicon$.setDynamicValue(make_default_document_annotation_lexicon(UNPROVIDED), thread);
            if (NIL != named_entity_recognizer.stanford_ner_ping(UNPROVIDED, UNPROVIDED)) {
                methods.funcall_instance_method_with_1_args($default_document_annotation_learning_lexicon$.getDynamicValue(thread), ADD_LEARNER, STANFORD_NER_LEARN);
            }
        }
        return $default_document_annotation_learning_lexicon$.getDynamicValue(thread);
    }

    public static SubLObject clear_default_document_annotation_learning_lexicon() {
        $default_document_annotation_learning_lexicon$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject clear_default_document_annotation_lexicon() {
        $default_document_annotation_lexicon$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject clear_get_default_document_annotation_lexicon() {
        final SubLObject cs = $get_default_document_annotation_lexicon_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_default_document_annotation_lexicon(SubLObject nl_mt) {
        if (nl_mt == UNPROVIDED) {
            nl_mt = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($get_default_document_annotation_lexicon_caching_state$.getGlobalValue(), list(nl_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_default_document_annotation_lexicon_internal(final SubLObject nl_mt) {
        return make_default_document_annotation_lexicon(nl_mt);
    }

    public static SubLObject get_default_document_annotation_lexicon(SubLObject nl_mt) {
        if (nl_mt == UNPROVIDED) {
            nl_mt = NIL;
        }
        SubLObject caching_state = $get_default_document_annotation_lexicon_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_DEFAULT_DOCUMENT_ANNOTATION_LEXICON, $get_default_document_annotation_lexicon_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, nl_mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(get_default_document_annotation_lexicon_internal(nl_mt)));
            memoization_state.caching_state_put(caching_state, nl_mt, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject make_default_document_annotation_lexicon(SubLObject base_mt) {
        if (base_mt == UNPROVIDED) {
            base_mt = NIL;
        }
        final SubLObject lexicon = object.new_class_instance(TERM_LEXICON);
        methods.funcall_instance_method_with_0_args(lexicon, IGNORE_CACHE);
        methods.funcall_instance_method_with_1_args(lexicon, SET_CASE_SENSITIVITY, $PREFERRED);
        methods.funcall_instance_method_with_1_args(lexicon, ALLOW_PREDICATE, $$preferredNameString);
        methods.funcall_instance_method_with_1_args(lexicon, EXCLUDE_PREDICATE, $$ksTermString);
        methods.funcall_instance_method_with_1_args(lexicon, EXCLUDE_PREDICATE, $$alias);
        methods.funcall_instance_method_with_1_args(lexicon, EXCLUDE_PREDICATE, $$programStrings);
        methods.funcall_instance_method_with_1_args(lexicon, EXCLUDE_PREDICATE, $$airportHasIATACode);
        methods.funcall_instance_method_with_1_args(lexicon, EXCLUDE_PREDICATE, $$airportHasICAOCode);
        methods.funcall_instance_method_with_1_args(lexicon, EXCLUDE_POS, $$ClosedClassWord);
        if (NIL != base_mt) {
            methods.funcall_instance_method_with_1_args(lexicon, SET_BASE_MT, base_mt);
        } else {
            methods.funcall_instance_method_with_1_args(lexicon, ALLOW_MT, $$TechnicalEnglishLexicalMt);
            methods.funcall_instance_method_with_1_args(lexicon, ALLOW_MT, $$MedicalLexicalMt);
            if (NIL != valid_constant(constants_high.find_constant($$$CCFLexicalMt), UNPROVIDED)) {
                methods.funcall_instance_method_with_1_args(lexicon, ALLOW_MT, $$CCFLexicalMt);
            }
        }
        methods.funcall_instance_method_with_1_args(lexicon, ADD_CONCEPT_FILTER_SPEC, $list266);
        return lexicon;
    }

    public static SubLObject get_default_document_annotation_rule_disambiguator() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == rule_disambiguation.rule_disambiguator_p($default_document_annotation_rule_disambiguator$.getDynamicValue(thread))) {
            $default_document_annotation_rule_disambiguator$.setDynamicValue(rule_disambiguation.new_rule_disambiguator(UNPROVIDED, UNPROVIDED), thread);
        }
        return $default_document_annotation_rule_disambiguator$.getDynamicValue(thread);
    }

    public static SubLObject maybe_initialize_doc_annotator_term_id_fbc(SubLObject file_path) {
        if (file_path == UNPROVIDED) {
            file_path = $doc_annotator_term_id_fbc_path$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == file_backed_cache.file_backed_cache_p($doc_annotator_term_id_fbc$.getDynamicValue(thread))) {
            $doc_annotator_term_id_fbc$.setDynamicValue(file_backed_cache.file_backed_cache_create(file_path, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        }
        return $doc_annotator_term_id_fbc$.getDynamicValue(thread);
    }

    public static SubLObject maybe_initialize_doc_annotator_id_term_fbc(SubLObject file_path) {
        if (file_path == UNPROVIDED) {
            file_path = $doc_annotator_id_term_fbc_path$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == file_backed_cache.file_backed_cache_p($doc_annotator_id_term_fbc$.getDynamicValue(thread))) {
            $doc_annotator_id_term_fbc$.setDynamicValue(file_backed_cache.file_backed_cache_create(file_path, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        }
        return $doc_annotator_id_term_fbc$.getDynamicValue(thread);
    }

    public static SubLObject rebuild_doc_annotator_term_id_fbc(SubLObject overwrite, SubLObject path) {
        if (overwrite == UNPROVIDED) {
            overwrite = NIL;
        }
        if (path == UNPROVIDED) {
            path = $doc_annotator_term_id_fbc_path$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == overwrite) {
            return $NOTHING_DONE;
        }
        final SubLObject fht = file_hash_table.create_file_hash_table(path, forts.fort_count(), TEN_INTEGER, EQUAL, $IMAGE_INDEPENDENT_CFASL);
        SubLObject id = ZERO_INTEGER;
        final SubLObject message = $str268$rebuilding_term_id_FHT;
        final SubLObject total = forts.fort_count();
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(message);
                SubLObject cdolist_list_var = forts.do_forts_tables();
                SubLObject table_var = NIL;
                table_var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject idx = table_var;
                    if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                        final SubLObject idx_$63 = idx;
                        if (NIL == id_index_dense_objects_empty_p(idx_$63, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$63);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id_$64;
                            SubLObject fort;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id_$64 = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                fort = aref(vector_var, id_$64);
                                if ((NIL == id_index_tombstone_p(fort)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(fort)) {
                                        fort = $SKIP;
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                    file_hash_table.put_file_hash_table(cycl_utilities.hl_to_el(fort), fht, id);
                                    id = add(id, ONE_INTEGER);
                                }
                            }
                        }
                        final SubLObject idx_$64 = idx;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$64)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$64);
                            SubLObject id_$65 = id_index_sparse_id_threshold(idx_$64);
                            final SubLObject end_id = id_index_next_id(idx_$64);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id_$65.numL(end_id)) {
                                final SubLObject fort2 = gethash_without_values(id_$65, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(fort2))) {
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                    file_hash_table.put_file_hash_table(cycl_utilities.hl_to_el(fort2), fht, id);
                                    id = add(id, ONE_INTEGER);
                                }
                                id_$65 = add(id_$65, ONE_INTEGER);
                            } 
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    table_var = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$67 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$67, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        file_hash_table.finalize_file_hash_table(fht);
        return path;
    }

    public static SubLObject build_id_to_term_fbc(SubLObject path, SubLObject term_to_id_path) {
        if (path == UNPROVIDED) {
            path = $doc_annotator_id_term_fbc_path$.getDynamicValue();
        }
        if (term_to_id_path == UNPROVIDED) {
            term_to_id_path = $doc_annotator_term_id_fbc_path$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fht = file_hash_table.create_file_hash_table(path, TEN_INTEGER, TEN_INTEGER, EQUAL, $IMAGE_INDEPENDENT_CFASL);
        final SubLObject table_var;
        final SubLObject term_id_fht = table_var = file_hash_table.open_file_hash_table(term_to_id_path, UNPROVIDED, UNPROVIDED);
        $progress_note$.setDynamicValue($str270$Rebuilding_id__term_map, thread);
        $progress_start_time$.setDynamicValue(get_universal_time(), thread);
        $progress_total$.setDynamicValue(file_hash_table.file_hash_table_count(table_var), thread);
        $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject continuation = NIL;
                SubLObject next;
                for (SubLObject completeP = NIL; NIL == completeP; completeP = sublisp_null(next)) {
                    thread.resetMultipleValues();
                    final SubLObject the_key = file_hash_table.get_file_hash_table_any(table_var, continuation, NIL);
                    final SubLObject the_value = thread.secondMultipleValue();
                    next = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != next) {
                        final SubLObject v_term = the_key;
                        final SubLObject id = the_value;
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        file_hash_table.put_file_hash_table(id, fht, v_term);
                    }
                    continuation = next;
                }
            } finally {
                final SubLObject _prev_bind_0_$68 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return $DONE;
    }

    public static SubLObject augment_doc_annotator_term_fht(SubLObject path) {
        if (path == UNPROVIDED) {
            path = $doc_annotator_term_id_fbc_path$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fht = file_hash_table.open_file_hash_table(path, EQUAL, UNPROVIDED);
        SubLObject biggest_id = ZERO_INTEGER;
        SubLObject new_terms = NIL;
        final SubLObject message = $str271$Augmenting_term_id_FHT;
        final SubLObject total = forts.fort_count();
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(message);
                SubLObject cdolist_list_var = forts.do_forts_tables();
                SubLObject table_var = NIL;
                table_var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject idx = table_var;
                    if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                        final SubLObject idx_$69 = idx;
                        if (NIL == id_index_dense_objects_empty_p(idx_$69, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$69);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject fort;
                            SubLObject id_$70;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                fort = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(fort)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(fort)) {
                                        fort = $SKIP;
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                    id_$70 = file_hash_table.get_file_hash_table(fort, fht, $NO_ID);
                                    if (id_$70.isNumber() && id_$70.numG(biggest_id)) {
                                        biggest_id = id_$70;
                                    } else
                                        if (id_$70 == $NO_ID) {
                                            new_terms = cons(fort, new_terms);
                                        }

                                }
                            }
                        }
                        final SubLObject idx_$70 = idx;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$70)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$70);
                            SubLObject id2 = id_index_sparse_id_threshold(idx_$70);
                            final SubLObject end_id = id_index_next_id(idx_$70);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id2.numL(end_id)) {
                                final SubLObject fort2 = gethash_without_values(id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(fort2))) {
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                    final SubLObject id_$71 = file_hash_table.get_file_hash_table(fort2, fht, $NO_ID);
                                    if (id_$71.isNumber() && id_$71.numG(biggest_id)) {
                                        biggest_id = id_$71;
                                    } else
                                        if (id_$71 == $NO_ID) {
                                            new_terms = cons(fort2, new_terms);
                                        }

                                }
                                id2 = add(id2, ONE_INTEGER);
                            } 
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    table_var = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$73 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$73, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var2 = new_terms;
        SubLObject new_fort = NIL;
        new_fort = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            biggest_id = add(biggest_id, ONE_INTEGER);
            file_hash_table.put_file_hash_table(new_fort, fht, biggest_id);
            cdolist_list_var2 = cdolist_list_var2.rest();
            new_fort = cdolist_list_var2.first();
        } 
        file_hash_table.finalize_file_hash_table(fht);
        return biggest_id;
    }

    public static SubLObject document_query(final SubLObject text_query) {
        SubLObject ids = NIL;
        SubLObject cdolist_list_var = terms_for_cyc_semantic_query(text_query);
        SubLObject record = NIL;
        record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$74 = record.rest();
            SubLObject interps = NIL;
            interps = cdolist_list_var_$74.first();
            while (NIL != cdolist_list_var_$74) {
                ids = cons(getf(interps, $INTERP_ID, UNPROVIDED), ids);
                cdolist_list_var_$74 = cdolist_list_var_$74.rest();
                interps = cdolist_list_var_$74.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            record = cdolist_list_var.first();
        } 
        return lucene_double_query(text_query, string_utilities.bunge(nreverse(ids), UNPROVIDED), UNPROVIDED);
    }

    public static SubLObject lucene_text_query(final SubLObject text_query, SubLObject max_ans_count) {
        if (max_ans_count == UNPROVIDED) {
            max_ans_count = TEN_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hits = NIL;
        SubLObject text_session = NIL;
        try {
            text_session = lucene_session.new_lucene_session(lucene_session.get_lucene_host(), lucene_session.get_lucene_port(), get_text_index(), $TEXT, UNPROVIDED);
            SubLObject cdolist_list_var;
            final SubLObject text_hits = cdolist_list_var = lucene_session.lucene_query(text_session, text_query, max_ans_count);
            SubLObject hit = NIL;
            hit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($annotated_document_format$.getDynamicValue(thread) == $SIMPLE) {
                    hits = cons(append(hit, $list274), hits);
                } else {
                    hits = cons(list($DOC_TEXT, hit, $SEARCH_TYPE, $TEXT), hits);
                }
                cdolist_list_var = cdolist_list_var.rest();
                hit = cdolist_list_var.first();
            } 
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != lucene_session.lucene_session_p(text_session)) {
                    lucene_session.lucene_finalize(text_session);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return nreverse(hits);
    }

    public static SubLObject lucene_sem_query_with_sem_search_string(final SubLObject sem_query, SubLObject max_ans_count) {
        if (max_ans_count == UNPROVIDED) {
            max_ans_count = TEN_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject hits = NIL;
        SubLObject sem_session = NIL;
        try {
            sem_session = lucene_session.new_lucene_session(lucene_session.get_lucene_host(), lucene_session.get_lucene_port(), get_semantic_index(), $CYC, UNPROVIDED);
            SubLObject cdolist_list_var = lucene_session.lucene_query(sem_session, sem_query, max_ans_count);
            SubLObject hit = NIL;
            hit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($annotated_document_format$.getDynamicValue(thread) == $SIMPLE) {
                    hits = cons(putf(hit, $SEARCH_TYPE, $CYC), hits);
                } else {
                    hits = cons(list($DOC_TEXT, hit, $SEARCH_TYPE, $CYC), hits);
                }
                cdolist_list_var = cdolist_list_var.rest();
                hit = cdolist_list_var.first();
            } 
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != lucene_session.lucene_session_p(sem_session)) {
                    lucene_session.lucene_finalize(sem_session);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        hits = clean_semantic_search_hits(hits);
        return nreverse(hits);
    }

    public static SubLObject lucene_sem_query(final SubLObject text_query, SubLObject max_ans_count) {
        if (max_ans_count == UNPROVIDED) {
            max_ans_count = TEN_INTEGER;
        }
        SubLObject ids = NIL;
        SubLObject cdolist_list_var = terms_for_cyc_semantic_query(text_query);
        SubLObject record = NIL;
        record = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$75 = record.rest();
            SubLObject interps = NIL;
            interps = cdolist_list_var_$75.first();
            while (NIL != cdolist_list_var_$75) {
                ids = cons(getf(interps, $INTERP_ID, UNPROVIDED), ids);
                cdolist_list_var_$75 = cdolist_list_var_$75.rest();
                interps = cdolist_list_var_$75.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            record = cdolist_list_var.first();
        } 
        return lucene_sem_query_with_sem_search_string(string_utilities.bunge(nreverse(ids), UNPROVIDED), max_ans_count);
    }

    public static SubLObject lucene_double_query(final SubLObject text_query, final SubLObject sem_query, SubLObject max_answer_count) {
        if (max_answer_count == UNPROVIDED) {
            max_answer_count = TEN_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(LUCENE_DOUBLE_QUERY, text_query, sem_query, max_answer_count));
        }
        if (NIL != $doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text($doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str113$Unable_to_open__S, $doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str167$writing_to__S, $doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(LUCENE_DOUBLE_QUERY, text_query, sem_query, max_answer_count));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return append(lucene_text_query(text_query, max_answer_count), lucene_sem_query_with_sem_search_string(sem_query, max_answer_count));
    }

    public static SubLObject cyc_semantic_search_token(final SubLObject token, final SubLObject interp) {
        if ((NIL != cycl_grammar.cycl_nat_p(interp)) || (NIL != forts.fort_p(interp))) {
            return cconcatenate($str278$0_0_t___, new SubLObject[]{ format_nil.format_nil_a_no_copy(document_annotation_term_id(interp, UNPROVIDED)), $str142$_ });
        }
        return cconcatenate($str279$0_0_s___, new SubLObject[]{ format_nil.format_nil_a_no_copy(token), $str142$_ });
    }

    public static SubLObject terms_for_cyc_semantic_query(final SubLObject query_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $trace_doc_search_interface$.getDynamicValue(thread)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERMS_FOR_CYC_SEMANTIC_QUERY, query_string));
        }
        if (NIL != $doc_search_trace_log_file$.getDynamicValue(thread)) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text($doc_search_trace_log_file$.getDynamicValue(thread), $APPEND);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str113$Unable_to_open__S, $doc_search_trace_log_file$.getDynamicValue(thread));
                }
                final SubLObject out = stream;
                Errors.warn($str167$writing_to__S, $doc_search_trace_log_file$.getDynamicValue(thread));
                format(out, $str15$___A__entering__S__, numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), list(TERMS_FOR_CYC_SEMANTIC_QUERY, query_string));
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject stream2 = NIL;
                    try {
                        stream2 = compatibility.open_text($str283$_cyc_projects_doc_annotation_quer, $APPEND);
                        if (!stream2.isStream()) {
                            Errors.error($str113$Unable_to_open__S, $str283$_cyc_projects_doc_annotation_quer);
                        }
                        final SubLObject log = stream2;
                        format(log, $str284$_A___S__, numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED), query_string);
                    } finally {
                        final SubLObject _prev_bind_0_$76 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            if (stream2.isStream()) {
                                close(stream2, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$76, thread);
                        }
                    }
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
        SubLObject word_interp_map = NIL;
        final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_assumed_validP$.currentBinding(thread);
        try {
            lexicon_macros.$nl_trie_assumed_validP$.bind(T, thread);
            final SubLObject tokenizations = qua_query.get_tokenizations_for_aq_string(query_string, UNPROVIDED);
            SubLObject remove_stopwordsP = NIL;
            SubLObject cdolist_list_var = tokenizations;
            SubLObject tokenization = NIL;
            tokenization = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject list_var = NIL;
                SubLObject token = NIL;
                SubLObject token_num = NIL;
                list_var = tokenization;
                token = list_var.first();
                for (token_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , token = list_var.first() , token_num = add(ONE_INTEGER, token_num)) {
                    final SubLObject string = qua_query.aq_term_original_string(token);
                    SubLObject interps = qua_query.aq_term_raw_meanings(token);
                    if (length(interps).numG(ONE_INTEGER)) {
                        interps = remove_if(STRINGP, interps, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    SubLObject cdolist_list_var_$77 = interps;
                    SubLObject interp_cycl = NIL;
                    interp_cycl = cdolist_list_var_$77.first();
                    while (NIL != cdolist_list_var_$77) {
                        if (NIL == list_utilities.every_in_list(STRINGP, interps, UNPROVIDED)) {
                            remove_stopwordsP = T;
                        }
                        final SubLObject word = encode_word_for_semantic_query(string, interp_cycl);
                        word_interp_map = list_utilities.alist_push(word_interp_map, list(string, token_num), word, EQUAL);
                        cdolist_list_var_$77 = cdolist_list_var_$77.rest();
                        interp_cycl = cdolist_list_var_$77.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                tokenization = cdolist_list_var.first();
            } 
            if (NIL != remove_stopwordsP) {
                word_interp_map = remove_if($sym285$STOPWORD_IN_SEM_QUERY_, word_interp_map, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            lexicon_macros.$nl_trie_assumed_validP$.rebind(_prev_bind_0, thread);
        }
        return Mapping.mapcar(REMOVE_CDAR, Sort.sort(word_interp_map, $sym172$_, CADAR));
    }

    public static SubLObject remove_cdar(final SubLObject item) {
        return cons(caar(item), item.rest());
    }

    public static SubLObject stopword_in_sem_queryP(final SubLObject encoded_word) {
        return makeBoolean((NIL != lexicon_utilities.denots_of_string_stop_word(caar(encoded_word))) && (NIL != string_utilities.starts_with(getf(second(encoded_word), $INTERP_ID, UNPROVIDED), $str288$0_0_s)));
    }

    public static SubLObject encode_word_for_semantic_query(final SubLObject string, final SubLObject interp_cycl) {
        return list($INTERP, interp_cycl, $INTERP_ID, cyc_semantic_search_token(string, interp_cycl));
    }

    public static SubLObject terms_for_focused_cyc_semantic_query(final SubLObject query_string, final SubLObject term_id) {
        final SubLObject interp_cycl = kb_utilities.maybe_find_object_by_compact_hl_external_id_string(term_id);
        if ((NIL != forts.fort_p(interp_cycl)) || (NIL != cycl_grammar.cycl_nat_p(interp_cycl))) {
            final SubLObject interpretations = terms_for_cyc_semantic_query(query_string);
            SubLObject results = NIL;
            SubLObject cdolist_list_var = interpretations;
            SubLObject interpretation = NIL;
            interpretation = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = interpretation;
                SubLObject word = NIL;
                SubLObject details = NIL;
                destructuring_bind_must_consp(current, datum, $list291);
                word = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list291);
                details = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject cycl_interpretation = getf(details, $INTERP, NIL);
                    if (cycl_interpretation.equal(interp_cycl)) {
                        results = cons(interpretation, results);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list291);
                }
                cdolist_list_var = cdolist_list_var.rest();
                interpretation = cdolist_list_var.first();
            } 
            if (NIL == results) {
                results = cons(list(query_string, encode_word_for_semantic_query(query_string, interp_cycl)), results);
            }
            return results;
        }
        return NIL;
    }

    public static SubLObject simple_terms_for_cyc_semantic_query(final SubLObject query_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject word_interp_map = dictionary.new_dictionary(symbol_function(EQUALP), TWENTY_INTEGER);
        final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_assumed_validP$.currentBinding(thread);
        try {
            lexicon_macros.$nl_trie_assumed_validP$.bind(T, thread);
            SubLObject cdolist_list_var;
            final SubLObject tokenizations = cdolist_list_var = qua_query.get_tokenizations_for_aq_string(query_string, UNPROVIDED);
            SubLObject tokenization = NIL;
            tokenization = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$78 = tokenization;
                SubLObject token = NIL;
                token = cdolist_list_var_$78.first();
                while (NIL != cdolist_list_var_$78) {
                    final SubLObject string = qua_query.aq_term_original_string(token);
                    SubLObject cdolist_list_var_$79 = qua_query.aq_term_raw_meanings(token);
                    SubLObject interp_cycl = NIL;
                    interp_cycl = cdolist_list_var_$79.first();
                    while (NIL != cdolist_list_var_$79) {
                        if (!interp_cycl.isString()) {
                            final SubLObject word = interp_cycl;
                            dictionary_utilities.dictionary_push(word_interp_map, string, word);
                        }
                        cdolist_list_var_$79 = cdolist_list_var_$79.rest();
                        interp_cycl = cdolist_list_var_$79.first();
                    } 
                    cdolist_list_var_$78 = cdolist_list_var_$78.rest();
                    token = cdolist_list_var_$78.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                tokenization = cdolist_list_var.first();
            } 
        } finally {
            lexicon_macros.$nl_trie_assumed_validP$.rebind(_prev_bind_0, thread);
        }
        return dictionary_utilities.dictionary_to_alist(word_interp_map);
    }

    public static SubLObject get_compiled_regexp(final SubLObject regexp) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cached_version = list_utilities.alist_lookup($cached_regexps$.getDynamicValue(thread), regexp, EQUAL, UNPROVIDED);
        if (NIL != regular_expressions.regular_expression_p(cached_version)) {
            return cached_version;
        }
        $cached_regexps$.setDynamicValue(list_utilities.alist_enter($cached_regexps$.getDynamicValue(thread), regexp, regular_expressions.compile_regular_expression(regexp, UNPROVIDED), UNPROVIDED), thread);
        return list_utilities.alist_lookup($cached_regexps$.getDynamicValue(thread), regexp, EQUAL, UNPROVIDED);
    }

    public static SubLObject clean_semantic_search_hits(final SubLObject hit_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject output = NIL;
        SubLObject cdolist_list_var = hit_list;
        SubLObject hit = NIL;
        hit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject snippet = getf(hit, $SNIPPET, UNPROVIDED);
            SubLObject title = getf(hit, $TITLE, UNPROVIDED);
            SubLObject cdolist_list_var_$80 = list($remove_pictures_regexp$.getDynamicValue(thread), $remove_hyphens_regexp$.getDynamicValue(thread), $remove_underscores_regexp$.getDynamicValue(thread), $remove_dots_regexp$.getDynamicValue(thread), $remove_equals_regexp$.getDynamicValue(thread), $remove_unicode_regexp$.getDynamicValue(thread));
            SubLObject regexp = NIL;
            regexp = cdolist_list_var_$80.first();
            while (NIL != cdolist_list_var_$80) {
                if (title.isString()) {
                    title = regular_expression_utilities.regex_subst(get_compiled_regexp(regexp), $str111$, title, UNPROVIDED);
                }
                if (snippet.isString()) {
                    snippet = regular_expression_utilities.regex_subst(get_compiled_regexp(regexp), $str111$, snippet, UNPROVIDED);
                }
                cdolist_list_var_$80 = cdolist_list_var_$80.rest();
                regexp = cdolist_list_var_$80.first();
            } 
            hit = putf(hit, $TITLE, title);
            hit = putf(hit, $SNIPPET, snippet);
            output = cons(hit, output);
            cdolist_list_var = cdolist_list_var.rest();
            hit = cdolist_list_var.first();
        } 
        return nreverse(output);
    }

    public static SubLObject do_lexified_forts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list300);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fort = NIL;
        SubLObject lexicon = NIL;
        destructuring_bind_must_consp(current, datum, $list300);
        fort = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list300);
        lexicon = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject seenP = $sym301$SEEN_;
            return list(CLET, list(fort, bq_cons(seenP, $list302)), list(DO_LEXICON, list(STRING, LEX, lexicon), $list306, listS(CSETQ, fort, $list308), listS(PUNLESS, list(GETHASH_WITHOUT_VALUES, fort, seenP), append(body, list(listS(SETHASH, fort, seenP, $list312))))));
        }
        cdestructuring_bind_error(datum, $list300);
        return NIL;
    }

    public static SubLObject simple_document_tagging_results(final SubLObject doc_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_document = new_tagged_document(doc_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject disambiguator = rule_disambiguation.new_rule_disambiguator(UNPROVIDED, UNPROVIDED);
        SubLObject result = NIL;
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
            final SubLObject _prev_bind_0_$81 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    rule_disambiguation.rdis_disambiguate(disambiguator, v_document, UNPROVIDED);
                    final SubLObject vector_var = document.document_paragraphs(v_document);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject paragraph;
                    SubLObject vector_var_$82;
                    SubLObject backwardP_var_$83;
                    SubLObject length_$84;
                    SubLObject v_iteration_$85;
                    SubLObject element_num_$86;
                    SubLObject sentence;
                    SubLObject cdolist_list_var;
                    SubLObject word;
                    SubLObject word_string;
                    SubLObject word_result;
                    SubLObject interps;
                    SubLObject list_var;
                    SubLObject interp;
                    SubLObject interp_num;
                    SubLObject v_term;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        paragraph = aref(vector_var, element_num);
                        vector_var_$82 = document.paragraph_sentences(paragraph);
                        backwardP_var_$83 = NIL;
                        for (length_$84 = length(vector_var_$82), v_iteration_$85 = NIL, v_iteration_$85 = ZERO_INTEGER; v_iteration_$85.numL(length_$84); v_iteration_$85 = add(v_iteration_$85, ONE_INTEGER)) {
                            element_num_$86 = (NIL != backwardP_var_$83) ? subtract(length_$84, v_iteration_$85, ONE_INTEGER) : v_iteration_$85;
                            sentence = aref(vector_var_$82, element_num_$86);
                            cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                            word = NIL;
                            word = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                word_string = document.word_string(word);
                                word_result = list(word_string);
                                interps = document.word_interps(word);
                                list_var = NIL;
                                interp = NIL;
                                interp_num = NIL;
                                list_var = interps;
                                interp = list_var.first();
                                for (interp_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , interp = list_var.first() , interp_num = add(ONE_INTEGER, interp_num)) {
                                    v_term = nl_api_datastructures.get_nl_interp_cycl(interp);
                                    word_result = cons(v_term, word_result);
                                }
                                if (NIL != interps) {
                                    result = cons(nreverse(word_result), result);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                word = cdolist_list_var.first();
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$82 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$82, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$81, thread);
            }
        } finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject show_document_tagging_results(final SubLObject doc_string, SubLObject strings_per_concept) {
        if (strings_per_concept == UNPROVIDED) {
            strings_per_concept = ONE_INTEGER;
        }
        SubLObject result = NIL;
        final SubLObject doc_tagging_result = simple_document_tagging_results(doc_string);
        final SubLObject params;
        final SubLObject generation_params = params = nl_generation_api.new_pph_parameters(UNPROVIDED);
        pph_parameter_declarations.set_pph_generation_count_internal(params, strings_per_concept);
        SubLObject cdolist_list_var = doc_tagging_result;
        SubLObject word_result = NIL;
        word_result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject concepts = word_result.rest();
            SubLObject new_word_result = list(word_result.first());
            SubLObject cdolist_list_var_$88 = concepts;
            SubLObject concept = NIL;
            concept = cdolist_list_var_$88.first();
            while (NIL != cdolist_list_var_$88) {
                SubLObject cdolist_list_var_$89 = nl_generation_api.cycl_term_to_nl_internal(concept, generation_params);
                SubLObject map = NIL;
                map = cdolist_list_var_$89.first();
                while (NIL != cdolist_list_var_$89) {
                    new_word_result = cons(nl_generation_api.pph_output_map_to_text_internal(map, NIL, ZERO_INTEGER, NIL, NIL), new_word_result);
                    cdolist_list_var_$89 = cdolist_list_var_$89.rest();
                    map = cdolist_list_var_$89.first();
                } 
                cdolist_list_var_$88 = cdolist_list_var_$88.rest();
                concept = cdolist_list_var_$88.first();
            } 
            result = cons(nreverse(new_word_result), result);
            cdolist_list_var = cdolist_list_var.rest();
            word_result = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject document_tagging_results_for_human_review(final SubLObject doc_string, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_document = new_tagged_document(doc_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject disambiguator = rule_disambiguation.new_rule_disambiguator(UNPROVIDED, UNPROVIDED);
        SubLObject sentence_count = ZERO_INTEGER;
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
            final SubLObject _prev_bind_0_$90 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    rule_disambiguation.rdis_disambiguate(disambiguator, v_document, UNPROVIDED);
                    final SubLObject vector_var = document.document_paragraphs(v_document);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject paragraph;
                    SubLObject vector_var_$91;
                    SubLObject backwardP_var_$92;
                    SubLObject length_$93;
                    SubLObject v_iteration_$94;
                    SubLObject element_num_$95;
                    SubLObject sentence;
                    SubLObject cdolist_list_var;
                    SubLObject word;
                    SubLObject word_string;
                    SubLObject interps;
                    SubLObject cdolist_list_var_$96;
                    SubLObject interp;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        paragraph = aref(vector_var, element_num);
                        vector_var_$91 = document.paragraph_sentences(paragraph);
                        backwardP_var_$92 = NIL;
                        for (length_$93 = length(vector_var_$91), v_iteration_$94 = NIL, v_iteration_$94 = ZERO_INTEGER; v_iteration_$94.numL(length_$93); v_iteration_$94 = add(v_iteration_$94, ONE_INTEGER)) {
                            element_num_$95 = (NIL != backwardP_var_$92) ? subtract(length_$93, v_iteration_$94, ONE_INTEGER) : v_iteration_$94;
                            sentence = aref(vector_var_$91, element_num_$95);
                            sentence_count = add(sentence_count, ONE_INTEGER);
                            format(stream, $str313$_A___A__, sentence_count, document.sentence_string(sentence));
                            cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                            word = NIL;
                            word = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                word_string = document.word_string(word);
                                interps = document.word_cycls(word);
                                format(stream, $str314$____A__, word_string);
                                cdolist_list_var_$96 = interps;
                                interp = NIL;
                                interp = cdolist_list_var_$96.first();
                                while (NIL != cdolist_list_var_$96) {
                                    format(stream, $str315$_A_, interp);
                                    cdolist_list_var_$96 = cdolist_list_var_$96.rest();
                                    interp = cdolist_list_var_$96.first();
                                } 
                                format(stream, $str316$__);
                                cdolist_list_var = cdolist_list_var.rest();
                                word = cdolist_list_var.first();
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$91 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$91, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$90, thread);
            }
        } finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return $DONE;
    }

    public static SubLObject remove_pictures_regexp_test(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return regular_expression_utilities.find_all_matches_for_regular_expression($remove_pictures_regexp$.getDynamicValue(thread), string, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_doc_string_from_node_ids_and_strings_values(final SubLObject arg) {
        return arg2(resetMultipleValues(), multiple_value_list(get_doc_string_from_node_ids_and_strings(arg)));
    }

    public static SubLObject get_interpretation_rules_for_mt(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $document_interpretation_default_elmt$.getDynamicValue();
        }
        SubLObject known_rules = dictionary.dictionary_lookup($document_interpretation_rules_by_mt$.getGlobalValue(), mt, UNPROVIDED);
        if (NIL != known_rules) {
            return known_rules;
        }
        known_rules = initialize_interpretation_rules(mt);
        return known_rules;
    }

    public static SubLObject tag_document_for_interpretation(final SubLObject document_as_string, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = get_default_document_annotation_lexicon(UNPROVIDED);
        }
        final SubLObject v_document = new_tagged_document(document_as_string, lexicon, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return v_document;
    }

    public static SubLObject get_concept_bag_from_document(final SubLObject v_document) {
        final SubLObject concept_bag = bag.new_bag(UNPROVIDED, UNPROVIDED);
        final SubLObject vector_var = document.document_paragraphs(v_document);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$98;
        SubLObject backwardP_var_$99;
        SubLObject length_$100;
        SubLObject v_iteration_$101;
        SubLObject element_num_$102;
        SubLObject sentence;
        SubLObject cdolist_list_var;
        SubLObject word;
        SubLObject cdolist_list_var_$103;
        SubLObject interpretation;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            paragraph = aref(vector_var, element_num);
            vector_var_$98 = document.paragraph_sentences(paragraph);
            backwardP_var_$99 = NIL;
            for (length_$100 = length(vector_var_$98), v_iteration_$101 = NIL, v_iteration_$101 = ZERO_INTEGER; v_iteration_$101.numL(length_$100); v_iteration_$101 = add(v_iteration_$101, ONE_INTEGER)) {
                element_num_$102 = (NIL != backwardP_var_$99) ? subtract(length_$100, v_iteration_$101, ONE_INTEGER) : v_iteration_$101;
                sentence = aref(vector_var_$98, element_num_$102);
                cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                word = NIL;
                word = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    cdolist_list_var_$103 = document.word_cycls(word);
                    interpretation = NIL;
                    interpretation = cdolist_list_var_$103.first();
                    while (NIL != cdolist_list_var_$103) {
                        bag.bag_add(czer_main.canonicalize_term(interpretation, UNPROVIDED), concept_bag);
                        cdolist_list_var_$103 = cdolist_list_var_$103.rest();
                        interpretation = cdolist_list_var_$103.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                } 
            }
        }
        return concept_bag;
    }

    public static SubLObject do_interpretation_rules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list329);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rule = NIL;
        SubLObject rule_set = NIL;
        destructuring_bind_must_consp(current, datum, $list329);
        rule = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list329);
        rule_set = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_SET, list(rule, rule_set), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list329);
        return NIL;
    }

    public static SubLObject interpret_document_via_suggestions(final SubLObject document_as_string) {
        final SubLObject v_document = tag_document_for_interpretation(document_as_string, UNPROVIDED);
        final SubLObject raw_concept_bag = get_concept_bag_from_document(v_document);
        return suggest_interpretations(raw_concept_bag, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject suggest_interpretations(final SubLObject original_concept_bag, SubLObject rule_set, SubLObject elmt) {
        if (rule_set == UNPROVIDED) {
            rule_set = get_interpretation_rules_for_mt(UNPROVIDED);
        }
        if (elmt == UNPROVIDED) {
            elmt = $document_interpretation_default_elmt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject concept_bag = bag.copy_bag(original_concept_bag);
        final SubLObject sentence_bag = bag.new_bag(symbol_function(EQUAL), UNPROVIDED);
        SubLObject justifications = NIL;
        SubLObject changes;
        for (SubLObject quiescentP = NIL; NIL == quiescentP; quiescentP = zerop(changes)) {
            changes = ZERO_INTEGER;
            final SubLObject set_contents_var = set.do_set_internal(rule_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject rule;
            SubLObject _prev_bind_0;
            SubLObject _prev_bind_2;
            SubLObject applies_p;
            SubLObject v_bindings;
            SubLObject insights;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                rule = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, rule)) {
                    _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(elmt, thread);
                        thread.resetMultipleValues();
                        applies_p = interpretation_rule_appliesP(rule, concept_bag, sentence_bag);
                        v_bindings = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != applies_p) {
                            insights = update_interpretation_with_rule(rule, concept_bag, sentence_bag, v_bindings);
                            if (!insights.isZero()) {
                                justifications = cons(rule, justifications);
                                changes = add(changes, ONE_INTEGER);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
        return values(concept_bag, sentence_bag, nreverse(justifications));
    }

    public static SubLObject interpretation_rule_appliesP(final SubLObject rule, final SubLObject concept_bag, final SubLObject sentence_bag) {
        final SubLObject preconditions = interpretation_rule_description_preconditions(rule);
        final SubLObject logical_operator = cycl_utilities.formula_arg0(preconditions);
        final SubLObject tests = cycl_utilities.formula_args(preconditions, UNPROVIDED);
        SubLObject v_bindings = NIL;
        SubLObject concepts = NIL;
        SubLObject cdolist_list_var = tests;
        SubLObject test = NIL;
        test = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject test_result = NIL;
            if (NIL != forts.fort_p(test)) {
                if (NIL == concepts) {
                    concepts = bag.bag_unique_element_list(concept_bag);
                }
                final SubLObject candidates = genls.all_specs_among(test, concepts, UNPROVIDED, UNPROVIDED);
                test_result = list_utilities.sublisp_boolean(candidates);
                if (NIL != test_result) {
                    v_bindings = cons(cons(test, candidates), v_bindings);
                }
            } else
                if (NIL != el_formula_p(test)) {
                    Errors.error($str332$Dont_know_yet_how_to_unify_a_sent);
                } else {
                    Errors.error($str333$Dont_know_how_to_deal_with_test__, test);
                }

            if ((NIL != test_result) && logical_operator.eql($$or)) {
                return values(T, v_bindings);
            }
            if ((NIL == test_result) && logical_operator.eql($$and)) {
                return values(NIL, NIL);
            }
            cdolist_list_var = cdolist_list_var.rest();
            test = cdolist_list_var.first();
        } 
        return values(logical_operator.eql($$or) ? NIL : logical_operator.eql($$and) ? T : NIL, v_bindings);
    }

    public static SubLObject update_interpretation_with_rule(final SubLObject rule, final SubLObject concept_bag, final SubLObject sentence_bag, final SubLObject v_bindings) {
        final SubLObject suggestions = interpretation_rule_description_suggestions(rule);
        SubLObject changes = ZERO_INTEGER;
        SubLObject cdolist_list_var = suggestions;
        SubLObject suggestion = NIL;
        suggestion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($ADD_CONCEPT == cycl_utilities.formula_arg0(suggestion)) {
                final SubLObject concept = cycl_utilities.formula_arg1(suggestion, UNPROVIDED);
                if (NIL == bag.bag_memberP(concept, concept_bag)) {
                    changes = add(changes, ONE_INTEGER);
                    bag.bag_add(concept, concept_bag);
                }
            } else
                if ($ADD_SENTENCE == cycl_utilities.formula_arg0(suggestion)) {
                    final SubLObject sentence_template = cycl_utilities.formula_arg1(suggestion, UNPROVIDED);
                    SubLObject cdolist_list_var_$104 = v_bindings;
                    SubLObject binding = NIL;
                    binding = cdolist_list_var_$104.first();
                    while (NIL != cdolist_list_var_$104) {
                        final SubLObject concept2 = binding.first();
                        final SubLObject mentioned_concepts = binding.rest();
                        if (NIL != list_utilities.tree_find(concept2, sentence_template, UNPROVIDED, UNPROVIDED)) {
                            SubLObject cdolist_list_var_$105 = mentioned_concepts;
                            SubLObject mentioned_concept = NIL;
                            mentioned_concept = cdolist_list_var_$105.first();
                            while (NIL != cdolist_list_var_$105) {
                                final SubLObject sentence = list_utilities.tree_substitute(copy_tree(sentence_template), concept2, mentioned_concept);
                                if (NIL == bag.bag_memberP(sentence, sentence_bag)) {
                                    changes = add(changes, ONE_INTEGER);
                                    bag.bag_add(sentence, sentence_bag);
                                }
                                cdolist_list_var_$105 = cdolist_list_var_$105.rest();
                                mentioned_concept = cdolist_list_var_$105.first();
                            } 
                        }
                        cdolist_list_var_$104 = cdolist_list_var_$104.rest();
                        binding = cdolist_list_var_$104.first();
                    } 
                }

            cdolist_list_var = cdolist_list_var.rest();
            suggestion = cdolist_list_var.first();
        } 
        return changes;
    }

    public static SubLObject initialize_interpretation_rules(SubLObject elmt) {
        if (elmt == UNPROVIDED) {
            elmt = $document_interpretation_default_elmt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject interp_rules = set.new_set(EQUAL, UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(elmt, thread);
            final SubLObject pred_var = $$interpretationSuggestion;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$106 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$107 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                try {
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    $progress_notification_count$.bind(ZERO_INTEGER, thread);
                    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                    $progress_count$.bind(ZERO_INTEGER, thread);
                    $is_noting_progressP$.bind(T, thread);
                    $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                    noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$108 = NIL;
                                final SubLObject token_var_$109 = NIL;
                                while (NIL == done_var_$108) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$109);
                                    final SubLObject valid_$110 = makeBoolean(!token_var_$109.eql(assertion));
                                    if (NIL != valid_$110) {
                                        add_interpretation_rule(assertion, interp_rules);
                                    }
                                    done_var_$108 = makeBoolean(NIL == valid_$110);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$107 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$107, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$107, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$106, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        dictionary.dictionary_enter($document_interpretation_rules_by_mt$.getGlobalValue(), elmt, interp_rules);
        return elmt;
    }

    public static SubLObject add_interpretation_rule(final SubLObject assertion, final SubLObject rule_set) {
        final SubLObject antecedent = assertions_high.gaf_arg1(assertion);
        final SubLObject consequent = assertions_high.gaf_arg2(assertion);
        add_interpretation_rule_clauses(rule_set, antecedent, consequent);
        return assertion;
    }

    public static SubLObject add_interpretation_rule_clauses(final SubLObject rule_set, final SubLObject antecedent, final SubLObject consequent) {
        final SubLObject preconditions = extract_interpretation_rule_preconditions(antecedent);
        final SubLObject suggestions = extract_interpretation_rule_suggestions(consequent);
        final SubLObject rule = make_interpretation_rule_description(antecedent, consequent, preconditions, suggestions);
        store_interpretation_rule(rule_set, rule);
        return interpretation_rules_count(rule_set);
    }

    public static SubLObject interpretation_rules_count(final SubLObject rule_set) {
        return set.set_size(rule_set);
    }

    public static SubLObject clear_interpretation_rules() {
        return set.clear_set(get_interpretation_rules_for_mt(UNPROVIDED));
    }

    public static SubLObject store_interpretation_rule(final SubLObject rule_set, final SubLObject rule) {
        return set.set_add(rule, rule_set);
    }

    public static SubLObject make_interpretation_rule_description(final SubLObject antecedent, final SubLObject consequent, final SubLObject preconditions, final SubLObject suggestions) {
        return list($ANTECEDENT, antecedent, $CONSEQUENT, consequent, $PRECONDITIONS, preconditions, $SUGGESTIONS, suggestions);
    }

    public static SubLObject interpretation_rule_description_antecedent(final SubLObject description) {
        return getf(description, $ANTECEDENT, UNPROVIDED);
    }

    public static SubLObject interpretation_rule_description_consequent(final SubLObject description) {
        return getf(description, $CONSEQUENT, UNPROVIDED);
    }

    public static SubLObject interpretation_rule_description_preconditions(final SubLObject description) {
        return getf(description, $PRECONDITIONS, UNPROVIDED);
    }

    public static SubLObject interpretation_rule_description_suggestions(final SubLObject description) {
        return getf(description, $SUGGESTIONS, UNPROVIDED);
    }

    public static SubLObject extract_interpretation_rule_preconditions(final SubLObject antecedent) {
        if ($$and.eql(cycl_utilities.formula_arg0(antecedent))) {
            SubLObject precondition = NIL;
            final SubLObject operator = cycl_utilities.formula_arg0(antecedent);
            SubLObject cdolist_list_var;
            final SubLObject v_clauses = cdolist_list_var = cycl_utilities.formula_args(antecedent, UNPROVIDED);
            SubLObject clause = NIL;
            clause = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                precondition = cons(extract_interpretation_rule_precondition(clause), precondition);
                cdolist_list_var = cdolist_list_var.rest();
                clause = cdolist_list_var.first();
            } 
            precondition = cons(operator, precondition);
            return precondition;
        }
        if ($$or.eql(cycl_utilities.formula_arg0(antecedent))) {
            SubLObject precondition = NIL;
            final SubLObject operator = cycl_utilities.formula_arg0(antecedent);
            SubLObject cdolist_list_var;
            final SubLObject v_clauses = cdolist_list_var = cycl_utilities.formula_args(antecedent, UNPROVIDED);
            SubLObject clause = NIL;
            clause = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                precondition = cons(extract_interpretation_rule_precondition(clause), precondition);
                cdolist_list_var = cdolist_list_var.rest();
                clause = cdolist_list_var.first();
            } 
            precondition = cons(operator, precondition);
            return precondition;
        }
        final SubLObject precondition2 = extract_interpretation_rule_precondition(antecedent);
        return list($$and, precondition2);
    }

    public static SubLObject extract_interpretation_rule_suggestions(final SubLObject consequent) {
        if ($$and.eql(cycl_utilities.formula_arg0(consequent))) {
            SubLObject suggestions = NIL;
            SubLObject cdolist_list_var;
            final SubLObject v_clauses = cdolist_list_var = cycl_utilities.formula_args(consequent, UNPROVIDED);
            SubLObject clause = NIL;
            clause = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                suggestions = cons(extract_interpretation_rule_suggestion(clause), suggestions);
                cdolist_list_var = cdolist_list_var.rest();
                clause = cdolist_list_var.first();
            } 
            suggestions = nreverse(suggestions);
            return suggestions;
        }
        if ($$or.eql(cycl_utilities.formula_arg0(consequent))) {
            SubLObject suggestions = NIL;
            SubLObject cdolist_list_var;
            final SubLObject v_clauses = cdolist_list_var = cycl_utilities.formula_args(consequent, UNPROVIDED);
            SubLObject clause = NIL;
            clause = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                suggestions = cons(extract_interpretation_rule_suggestion(clause), suggestions);
                cdolist_list_var = cdolist_list_var.rest();
                clause = cdolist_list_var.first();
            } 
            suggestions = nreverse(suggestions);
            return suggestions;
        }
        if ($$containsProposition_CW.eql(cycl_utilities.formula_arg0(consequent))) {
            final SubLObject sub_consequent = cycl_utilities.formula_arg2(consequent, UNPROVIDED);
            return extract_interpretation_rule_suggestions(sub_consequent);
        }
        final SubLObject suggestion = extract_interpretation_rule_suggestion(consequent);
        return list(suggestion);
    }

    public static SubLObject extract_interpretation_rule_precondition(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject operator = cycl_utilities.formula_arg0(clause);
        if ($$thingDescribed.eql(operator)) {
            final SubLObject the_expression = cycl_utilities.formula_arg2(clause, UNPROVIDED);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!cycl_utilities.formula_arg0(the_expression).eql($$The))) {
                Errors.error($str346$Invalid_THE_expression__A___, the_expression);
            }
            return cycl_utilities.formula_arg1(the_expression, UNPROVIDED);
        }
        Errors.error($str347$Dont_know_how_to_handle_precondit, operator, clause);
        return clause;
    }

    public static SubLObject extract_interpretation_rule_suggestion(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject operator = cycl_utilities.formula_arg0(clause);
        if ($$thingDescribed.eql(operator)) {
            final SubLObject the_expression = cycl_utilities.formula_arg2(clause, UNPROVIDED);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!cycl_utilities.formula_arg0(the_expression).eql($$The))) {
                Errors.error($str346$Invalid_THE_expression__A___, the_expression);
            }
            final SubLObject concept = cycl_utilities.formula_arg1(the_expression, UNPROVIDED);
            return list($ADD_CONCEPT, concept);
        }
        return list($ADD_SENTENCE, clause);
    }

    public static SubLObject cb_document_interpretation_show_concept(final SubLObject concept, SubLObject count) {
        if (count == UNPROVIDED) {
            count = ONE_INTEGER;
        }
        cb_form(concept, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        if (ONE_INTEGER.numG(count)) {
            html_princ($str202$_);
            html_princ(count);
            html_princ($str204$_);
            html_indent(UNPROVIDED);
        }
        return concept;
    }

    public static SubLObject cb_document_interpretation_show_sentence(final SubLObject sentence, SubLObject count) {
        if (count == UNPROVIDED) {
            count = ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_list_item_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            cb_form(sentence, UNPROVIDED, UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
        return sentence;
    }

    public static SubLObject cb_document_interpretation_show_rule(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_list_item_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            final SubLObject antecedent = interpretation_rule_description_antecedent(rule);
            final SubLObject consequent = interpretation_rule_description_consequent(rule);
            html_princ($str348$If_it_is_the_case_that__);
            html_newline(UNPROVIDED);
            cb_form(antecedent, ZERO_INTEGER, T);
            html_newline(UNPROVIDED);
            html_princ($str349$then_one_might_conclude_that__);
            html_newline(UNPROVIDED);
            cb_form(consequent, ZERO_INTEGER, T);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
        return rule;
    }

    public static SubLObject cb_document_interpretation_suggestions(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject text = html_extract_input($$$text, args);
        final SubLObject mt_string = (NIL != html_extract_input($$$mt, args)) ? html_extract_input($$$mt, args) : string_utilities.string_remove_constant_reader_prefixes(format_cycl_expression.format_cycl_expression_to_string($document_interpretation_default_elmt$.getDynamicValue(thread), UNPROVIDED));
        final SubLObject mt = cb_guess_term(mt_string, UNPROVIDED);
        final SubLObject title_var = $str351$Document_Interpretation_Suggestio;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str352$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str353$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$112 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$113 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str357$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$114 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$115, thread);
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
                        html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                        html_princ($str362$Enter_the_text_to_interpret_);
                        html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                        final SubLObject frame_name_var = cb_frame_name(NIL);
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$post);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(frame_name_var);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str364$cb_document_interpretation_sugges, T, UNPROVIDED);
                            html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                            html_indent(TWO_INTEGER);
                            html_reset_input($$$Clear);
                            html_newline(TWO_INTEGER);
                            final SubLObject current_text = (text.isString()) ? text : $str111$;
                            html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                            html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$text);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($int$80);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(FIFTEEN_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ(current_text);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$117, thread);
                            }
                            html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_princ($str368$Rule_Mt__);
                            html_text_input($$$mt, mt_string, $int$40);
                            html_complete.html_complete_button(mt_string, $$$Complete, $$Microtheory, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$116, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        if (NIL != text) {
                            final SubLObject v_document = tag_document_for_interpretation(text, UNPROVIDED);
                            final SubLObject raw_concept_bag = get_concept_bag_from_document(v_document);
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(THREE_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ($$$Identified_Concepts);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(THREE_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                            SubLObject iteration_state;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(bag.do_bag_repeat_internal(raw_concept_bag)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                final SubLObject concept = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                final SubLObject count = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                cb_document_interpretation_show_concept(concept, count);
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            final SubLObject count2 = ONE_INTEGER;
                            final SubLObject set_contents_var = bag.do_bag_unique_internal(raw_concept_bag);
                            SubLObject basis_object;
                            SubLObject state;
                            SubLObject concept2;
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                concept2 = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, concept2)) {
                                    cb_document_interpretation_show_concept(concept2, count2);
                                }
                            }
                            html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                            thread.resetMultipleValues();
                            final SubLObject concept_bag = suggest_interpretations(raw_concept_bag, get_interpretation_rules_for_mt(mt), mt);
                            final SubLObject sentence_bag = thread.secondMultipleValue();
                            final SubLObject justifications = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (!bag.bag_size(concept_bag).numE(bag.bag_size(raw_concept_bag))) {
                                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_markup(THREE_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                                html_princ($$$Suggested_Concepts);
                                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_markup(THREE_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                                SubLObject iteration_state2;
                                for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(bag.do_bag_repeat_internal(concept_bag)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                    thread.resetMultipleValues();
                                    final SubLObject concept3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                    final SubLObject count3 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL == bag.bag_memberP(concept3, raw_concept_bag)) {
                                        cb_document_interpretation_show_concept(concept3, count3);
                                    }
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                final SubLObject count4 = ONE_INTEGER;
                                final SubLObject set_contents_var2 = bag.do_bag_unique_internal(concept_bag);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject concept4;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    concept4 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, concept4)) && (NIL == bag.bag_memberP(concept4, raw_concept_bag))) {
                                        cb_document_interpretation_show_concept(concept4, count4);
                                    }
                                }
                            }
                            if (NIL == bag.bag_emptyP(sentence_bag)) {
                                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_markup(THREE_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                                html_princ($$$Suggested_Sentences);
                                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_markup(THREE_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                                html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$118 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    SubLObject iteration_state3;
                                    for (iteration_state3 = dictionary_contents.do_dictionary_contents_state(bag.do_bag_repeat_internal(sentence_bag)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state3); iteration_state3 = dictionary_contents.do_dictionary_contents_next(iteration_state3)) {
                                        thread.resetMultipleValues();
                                        final SubLObject sentence = dictionary_contents.do_dictionary_contents_key_value(iteration_state3);
                                        final SubLObject count5 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        cb_document_interpretation_show_sentence(sentence, count5);
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state3);
                                    final SubLObject count3 = ONE_INTEGER;
                                    final SubLObject set_contents_var3 = bag.do_bag_unique_internal(sentence_bag);
                                    SubLObject basis_object3;
                                    SubLObject state3;
                                    SubLObject sentence2;
                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                        sentence2 = set_contents.do_set_contents_next(basis_object3, state3);
                                        if (NIL != set_contents.do_set_contents_element_validP(state3, sentence2)) {
                                            cb_document_interpretation_show_sentence(sentence2, count3);
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$118, thread);
                                }
                                html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                            }
                            if (NIL != justifications) {
                                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_markup(THREE_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                                html_princ($$$Applied_Rules);
                                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_markup(THREE_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                                html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$119 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    SubLObject cdolist_list_var = justifications;
                                    SubLObject rule = NIL;
                                    rule = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        cb_document_interpretation_show_rule(rule);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        rule = cdolist_list_var.first();
                                    } 
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$119, thread);
                                }
                                html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                            }
                        }
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$114, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$113, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$112, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return $DONE;
    }

    public static SubLObject cb_annotate_tagged_concepts(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject previous_input_file = html_extract_input($str379$previous_input_file, args);
        final SubLObject filename = (NIL != html_extract_input($str380$input_file, args)) ? html_extract_input($str380$input_file, args) : $str111$;
        final SubLObject next_index_from_page = read_from_string(NIL != html_extract_input($str381$next_index, args) ? html_extract_input($str381$next_index, args) : $$$0, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject next_index = (filename.equal(previous_input_file)) ? next_index_from_page : ZERO_INTEGER;
        final SubLObject count = $int$30;
        final SubLObject data = annotation_data_from_file(filename, next_index, count);
        handle_submitted_manual_annotation_data(args);
        final SubLObject title_var = $$$Manual_Concept_Annotation;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str352$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str353$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$120 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$121 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str357$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$122 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$123 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$123, thread);
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
                        html_script_utilities.cb_hoverover_page_init();
                        final SubLObject frame_name_var = cb_frame_name(NIL);
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$post);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(frame_name_var);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$124 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str385$cb_annotate_tagged_concepts, T, UNPROVIDED);
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_style_head$.getGlobalValue());
                            html_princ(concept_tagger.$doc_tagger_default_style$.getDynamicValue(thread));
                            html_markup(html_macros.$html_style_tail$.getGlobalValue());
                            html_hidden_input($str379$previous_input_file, filename, UNPROVIDED);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str386$Tagging_File_Name__);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$text);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str380$input_file);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != filename) {
                                html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_princ(filename);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_markup(html_macros.$html_input_size$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($int$40);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_style_head$.getGlobalValue());
                            html_princ($str387$tr__border_color__black__________);
                            html_markup(html_macros.$html_style_tail$.getGlobalValue());
                            if (NIL != data) {
                                SubLObject current;
                                final SubLObject datum = current = data;
                                SubLObject text = NIL;
                                destructuring_bind_must_consp(current, datum, $list388);
                                text = current.first();
                                final SubLObject strings_and_concepts;
                                current = strings_and_concepts = current.rest();
                                next_index = add(next_index, length(strings_and_concepts));
                                html_hidden_input($str381$next_index, next_index, UNPROVIDED);
                                html_markup($manual_document_annotation_instructions$.getDynamicValue(thread));
                                html_newline(UNPROVIDED);
                                html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(ONE_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$125 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    SubLObject cdolist_list_var = strings_and_concepts;
                                    SubLObject string_and_concepts = NIL;
                                    string_and_concepts = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        final SubLObject string_frequency = string_and_concepts.first();
                                        final SubLObject string = second(string_and_concepts);
                                        final SubLObject concepts = string_and_concepts.rest().rest();
                                        final SubLObject concept_count = length(concepts);
                                        SubLObject list_var = NIL;
                                        SubLObject concept = NIL;
                                        SubLObject concept_number = NIL;
                                        list_var = concepts;
                                        concept = list_var.first();
                                        for (concept_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , concept = list_var.first() , concept_number = add(ONE_INTEGER, concept_number)) {
                                            final SubLObject v_class = (concept_number.eql(ZERO_INTEGER)) ? $$$first : $$$other;
                                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            if (NIL != v_class) {
                                                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(v_class);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$126 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if (concept_number.eql(ZERO_INTEGER)) {
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    if (NIL != concept_count) {
                                                        html_markup(html_macros.$html_table_data_rowspan$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(concept_count);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$127 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str391$_S, string);
                                                        html_newline(UNPROVIDED);
                                                        html_markup(html_macros.$html_small_head$.getGlobalValue());
                                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str392$frequency___S__, string_frequency);
                                                        html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$127, thread);
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                }
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup($str393$30_);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$128 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    cb_form(concept, UNPROVIDED, UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$128, thread);
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup($str394$_CCFFCC);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$129 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_radio_input(kb_utilities.compact_hl_internal_id_string(concept), $$$primary, NIL, UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $$$Primary_Meaning___);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$129, thread);
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup($str397$_CCFFFF);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$130 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_radio_input(kb_utilities.compact_hl_internal_id_string(concept), $$$contextual, NIL, UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $$$Contextually_Dependent___);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$130, thread);
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup($str400$_FFCCFF);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$131 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_radio_input(kb_utilities.compact_hl_internal_id_string(concept), $str401$very_rare, NIL, UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $$$Rare___);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$131, thread);
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup($str403$_FFCCCC);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$132 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_radio_input(kb_utilities.compact_hl_internal_id_string(concept), $$$indecipherable, NIL, UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $$$Indecipherable__);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$132, thread);
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup($str406$_FFFFCC);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$133 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_radio_input(kb_utilities.compact_hl_internal_id_string(concept), $str407$merge_candidate, NIL, UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $$$Merge_away);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$133, thread);
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup($str409$_CCCCFF);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$134 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_radio_input(kb_utilities.compact_hl_internal_id_string(concept), $str410$kill_candidate, NIL, UNPROVIDED);
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $$$Invalid);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$134, thread);
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$126, thread);
                                            }
                                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        string_and_concepts = cdolist_list_var.first();
                                    } 
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$125, thread);
                                }
                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            }
                            html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$124, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$122, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$121, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$120, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject handle_submitted_manual_annotation_data(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject input_file = html_extract_input($str380$input_file, args);
        final SubLObject output_file_name = cconcatenate(NIL != input_file ? input_file : $str111$, $str413$_out);
        if (NIL == input_file) {
            return NIL;
        }
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(output_file_name, $APPEND);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str113$Unable_to_open__S, output_file_name);
            }
            final SubLObject s = stream;
            SubLObject cdolist_list_var = args;
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((arg.isList() && (NIL != kb_utilities.compact_hl_external_id_string_p(arg.first()))) && (NIL != list_utilities.lengthE(arg, TWO_INTEGER, UNPROVIDED))) {
                    final SubLObject v_term = kb_utilities.maybe_find_object_by_compact_hl_internal_id_string(arg.first());
                    if (NIL != v_term) {
                        format(s, $str414$_A__A__A__, new SubLObject[]{ kb_utilities.compact_hl_external_id_string(v_term), second(arg), v_term });
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return NIL;
    }

    public static SubLObject annotation_data_from_file(final SubLObject filename, final SubLObject next_index, final SubLObject desired_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == string_utilities.non_empty_string_p(filename)) || (NIL == Filesys.probe_file(filename))) {
            return NIL;
        }
        SubLObject result = NIL;
        SubLObject read_result = NIL;
        SubLObject count = ZERO_INTEGER;
        SubLObject doneP = NIL;
        final SubLObject final_index = subtract(add(next_index, desired_count), ONE_INTEGER);
        final SubLObject file_string = file_utilities.slurp_file(filename);
        for (SubLObject error = NIL; ((NIL == error) && (!read_result.equal($EOF))) && (NIL == doneP); doneP = T) {
            thread.resetMultipleValues();
            final SubLObject read_result_$135 = read_from_string(file_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject error_$136 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            read_result = read_result_$135;
            error = error_$136;
            format(T, $str416$_);
            final SubLObject context_string = read_result.first();
            final SubLObject concept_pairs = read_result.rest();
            if (count.numGE(next_index)) {
                result = cons(context_string, result);
            }
            if (NIL == doneP) {
                SubLObject csome_list_var = concept_pairs;
                SubLObject concept_pair = NIL;
                concept_pair = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    if (count.numG(final_index)) {
                        doneP = T;
                    } else
                        if (count.numGE(next_index)) {
                            result = cons(concept_pair, result);
                        }

                    count = add(count, ONE_INTEGER);
                    csome_list_var = csome_list_var.rest();
                    concept_pair = csome_list_var.first();
                } 
            }
            if (count.numG(next_index)) {
            }
        }
        return nreverse(result);
    }

    public static SubLObject get_manual_annotations(SubLObject filename) {
        if (filename == UNPROVIDED) {
            filename = $str417$_cyc_projects_sabre_data_july_200;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject file_var = filename;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(file_var, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str113$Unable_to_open__S, file_var);
            }
            final SubLObject stream_var = stream;
            if (stream_var.isStream()) {
                final SubLObject stream_var_$137 = stream_var;
                SubLObject line_number_var = NIL;
                SubLObject line = NIL;
                line_number_var = ZERO_INTEGER;
                for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$137); NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$137)) {
                    final SubLObject line_$138 = string_utilities.string_tokenize(line, $list418, list(list($str419$_, $str419$_)), NIL, NIL, list(CHAR_backslash), UNPROVIDED);
                    SubLObject current;
                    final SubLObject datum = current = line_$138;
                    SubLObject hl_id = NIL;
                    SubLObject judgment = NIL;
                    destructuring_bind_must_consp(current, datum, $list420);
                    hl_id = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list420);
                    judgment = current.first();
                    final SubLObject ignore;
                    current = ignore = current.rest();
                    final SubLObject v_term = kb_utilities.maybe_find_object_by_compact_hl_internal_id_string(hl_id);
                    result = cons(list(v_term, judgment), result);
                    line_number_var = number_utilities.f_1X(line_number_var);
                }
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return result;
    }

    public static SubLObject get_manual_annotations_with_strings(SubLObject filename) {
        if (filename == UNPROVIDED) {
            filename = $str421$_cyc_projects_sabre_data_july_200;
        }
        SubLObject result = NIL;
        SubLObject intermed_result = NIL;
        SubLObject previous_strings = NIL;
        final SubLObject concept_to_strings_map = get_concept_to_strings_map_from_input_data(filename);
        final SubLObject annotated_filename = cconcatenate(filename, $str413$_out);
        SubLObject cdolist_list_var = get_manual_annotations(annotated_filename);
        SubLObject annotation = NIL;
        annotation = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = annotation;
            SubLObject v_term = NIL;
            SubLObject judgment = NIL;
            destructuring_bind_must_consp(current, datum, $list422);
            v_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list422);
            judgment = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != intersection(previous_strings, dictionary.dictionary_lookup(concept_to_strings_map, v_term, UNPROVIDED), EQUAL, UNPROVIDED)) {
                    previous_strings = intersection(previous_strings, dictionary.dictionary_lookup(concept_to_strings_map, v_term, UNPROVIDED), EQUAL, UNPROVIDED);
                    intermed_result = cons(annotation, intermed_result);
                } else
                    if (NIL == previous_strings) {
                        previous_strings = dictionary.dictionary_lookup(concept_to_strings_map, v_term, UNPROVIDED);
                        intermed_result = list(annotation);
                    } else {
                        SubLObject cdolist_list_var_$139 = intermed_result;
                        SubLObject intermed_annotation = NIL;
                        intermed_annotation = cdolist_list_var_$139.first();
                        while (NIL != cdolist_list_var_$139) {
                            SubLObject current_$141;
                            final SubLObject datum_$140 = current_$141 = intermed_annotation;
                            SubLObject intermed_term = NIL;
                            SubLObject intermed_judgment = NIL;
                            destructuring_bind_must_consp(current_$141, datum_$140, $list423);
                            intermed_term = current_$141.first();
                            current_$141 = current_$141.rest();
                            destructuring_bind_must_consp(current_$141, datum_$140, $list423);
                            intermed_judgment = current_$141.first();
                            current_$141 = current_$141.rest();
                            if (NIL == current_$141) {
                                SubLObject cdolist_list_var_$140 = previous_strings;
                                SubLObject string = NIL;
                                string = cdolist_list_var_$140.first();
                                while (NIL != cdolist_list_var_$140) {
                                    result = cons(list(intermed_term, intermed_judgment, string), result);
                                    cdolist_list_var_$140 = cdolist_list_var_$140.rest();
                                    string = cdolist_list_var_$140.first();
                                } 
                            } else {
                                cdestructuring_bind_error(datum_$140, $list423);
                            }
                            cdolist_list_var_$139 = cdolist_list_var_$139.rest();
                            intermed_annotation = cdolist_list_var_$139.first();
                        } 
                        previous_strings = dictionary.dictionary_lookup(concept_to_strings_map, v_term, UNPROVIDED);
                        intermed_result = list(annotation);
                    }

            } else {
                cdestructuring_bind_error(datum, $list422);
            }
            cdolist_list_var = cdolist_list_var.rest();
            annotation = cdolist_list_var.first();
        } 
        cdolist_list_var = intermed_result;
        SubLObject intermed_annotation2 = NIL;
        intermed_annotation2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = intermed_annotation2;
            SubLObject v_term = NIL;
            SubLObject judgment = NIL;
            destructuring_bind_must_consp(current, datum, $list422);
            v_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list422);
            judgment = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var_$141 = previous_strings;
                SubLObject string2 = NIL;
                string2 = cdolist_list_var_$141.first();
                while (NIL != cdolist_list_var_$141) {
                    result = cons(list(v_term, judgment, string2), result);
                    cdolist_list_var_$141 = cdolist_list_var_$141.rest();
                    string2 = cdolist_list_var_$141.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list422);
            }
            cdolist_list_var = cdolist_list_var.rest();
            intermed_annotation2 = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject get_concept_to_strings_map_from_input_data(SubLObject filename) {
        if (filename == UNPROVIDED) {
            filename = $str421$_cyc_projects_sabre_data_july_200;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file_string = file_utilities.slurp_file(filename);
        final SubLObject string_to_concepts_map = dictionary.new_dictionary(EQUAL, UNPROVIDED);
        SubLObject read_result = NIL;
        SubLObject error = NIL;
        while ((NIL == error) && (!read_result.equal($EOF))) {
            thread.resetMultipleValues();
            final SubLObject read_result_$144 = read_from_string_ignoring_errors(file_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject error_$145 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            read_result = read_result_$144;
            error = error_$145;
            SubLObject cdolist_list_var;
            final SubLObject weight_string_concepts_tuples = cdolist_list_var = read_result.rest();
            SubLObject concept_pair = NIL;
            concept_pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject string = second(concept_pair);
                SubLObject cdolist_list_var_$146;
                final SubLObject concepts = cdolist_list_var_$146 = cddr(concept_pair);
                SubLObject concept = NIL;
                concept = cdolist_list_var_$146.first();
                while (NIL != cdolist_list_var_$146) {
                    dictionary_utilities.dictionary_push(string_to_concepts_map, concept, string);
                    cdolist_list_var_$146 = cdolist_list_var_$146.rest();
                    concept = cdolist_list_var_$146.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                concept_pair = cdolist_list_var.first();
            } 
        } 
        return string_to_concepts_map;
    }

    public static SubLObject get_assertions_for_concept_and_string(final SubLObject concept, final SubLObject string) {
        SubLObject assertions = NIL;
        SubLObject cdolist_list_var = nl_trie.nl_trie_search(string, UNPROVIDED, UNPROVIDED);
        SubLObject trie_entry = NIL;
        trie_entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != subl_promotions.memberP(concept, nl_trie.nl_trie_entry_denots(trie_entry), UNPROVIDED, UNPROVIDED)) {
                SubLObject cdolist_list_var_$147 = nl_trie.nl_trie_entry_semantic_support_list(trie_entry);
                SubLObject v_assert = NIL;
                v_assert = cdolist_list_var_$147.first();
                while (NIL != cdolist_list_var_$147) {
                    if ((NIL != assertion_handles.assertion_p(v_assert)) && lexicon_accessors.assertion_denotation(v_assert).equal(concept)) {
                        final SubLObject item_var = v_assert;
                        if (NIL == member(item_var, assertions, symbol_function(EQL), symbol_function(IDENTITY))) {
                            assertions = cons(item_var, assertions);
                        }
                    }
                    cdolist_list_var_$147 = cdolist_list_var_$147.rest();
                    v_assert = cdolist_list_var_$147.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            trie_entry = cdolist_list_var.first();
        } 
        return assertions;
    }

    public static SubLObject ke_text_from_manual_annotations(SubLObject filename) {
        if (filename == UNPROVIDED) {
            filename = $str421$_cyc_projects_sabre_data_july_200;
        }
        final SubLObject annotations = get_manual_annotations_with_strings(filename);
        SubLObject result_items = NIL;
        SubLObject cdolist_list_var = annotations;
        SubLObject annotation = NIL;
        annotation = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = annotation;
            SubLObject v_term = NIL;
            SubLObject judgment = NIL;
            SubLObject string = NIL;
            destructuring_bind_must_consp(current, datum, $list424);
            v_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list424);
            judgment = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list424);
            string = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var_$148 = get_assertions_for_concept_and_string(v_term, string);
                SubLObject v_assert = NIL;
                v_assert = cdolist_list_var_$148.first();
                while (NIL != cdolist_list_var_$148) {
                    final SubLObject assert_formula = assertions_high.assertion_ist_formula(v_assert);
                    if (judgment.equal($$$primary)) {
                        final SubLObject item_var = cconcatenate($str425$f_____strengthOfLexicalMapping_, new SubLObject[]{ format_nil.format_nil_s_no_copy(assert_formula), $str426$___PrimaryLexicalMapping__ });
                        if (NIL == member(item_var, result_items, EQUAL, symbol_function(IDENTITY))) {
                            result_items = cons(item_var, result_items);
                        }
                    } else
                        if (judgment.equal($str401$very_rare)) {
                            final SubLObject item_var = cconcatenate($str425$f_____strengthOfLexicalMapping_, new SubLObject[]{ format_nil.format_nil_s_no_copy(assert_formula), $str427$___VanishinglyRareLexicalMapping_ });
                            if (NIL == member(item_var, result_items, EQUAL, symbol_function(IDENTITY))) {
                                result_items = cons(item_var, result_items);
                            }
                        } else
                            if (judgment.equal($$$contextual)) {
                                final SubLObject item_var = cconcatenate($str425$f_____strengthOfLexicalMapping_, new SubLObject[]{ format_nil.format_nil_s_no_copy(assert_formula), $str428$___ContextuallyDependentLexicalMa });
                                if (NIL == member(item_var, result_items, EQUAL, symbol_function(IDENTITY))) {
                                    result_items = cons(item_var, result_items);
                                }
                            } else
                                if (judgment.equal($str410$kill_candidate)) {
                                    final SubLObject item_var = cconcatenate($str429$kill__, new SubLObject[]{ format_nil.format_nil_s_no_copy(v_term), $str416$_ });
                                    if (NIL == member(item_var, result_items, EQUAL, symbol_function(IDENTITY))) {
                                        result_items = cons(item_var, result_items);
                                    }
                                }



                    cdolist_list_var_$148 = cdolist_list_var_$148.rest();
                    v_assert = cdolist_list_var_$148.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list424);
            }
            cdolist_list_var = cdolist_list_var.rest();
            annotation = cdolist_list_var.first();
        } 
        cdolist_list_var = result_items;
        SubLObject result_item = NIL;
        result_item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            princ(result_item, T);
            terpri(UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            result_item = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject output_webgame_qs(final SubLObject doc_index_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject output_files = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(doc_index_file, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str113$Unable_to_open__S, doc_index_file);
            }
            final SubLObject stream_var = stream;
            if (stream_var.isStream()) {
                final SubLObject stream_var_$149 = stream_var;
                SubLObject line_number_var = NIL;
                SubLObject line = NIL;
                line_number_var = ZERO_INTEGER;
                for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$149); NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$149)) {
                    final SubLObject line_elts = string_utilities.string_tokenize(line, $list418, list(list($str419$_, $str419$_)), NIL, NIL, list(CHAR_backslash), UNPROVIDED);
                    SubLObject current;
                    final SubLObject datum = current = line_elts;
                    SubLObject id = NIL;
                    SubLObject url = NIL;
                    SubLObject filedir = NIL;
                    SubLObject time_stamp = NIL;
                    destructuring_bind_must_consp(current, datum, $list430);
                    id = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list430);
                    url = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list430);
                    filedir = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list430);
                    time_stamp = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        Errors.warn($str431$input_file_line___S__, line_elts);
                        final SubLObject filename = cconcatenate(filedir, time_stamp);
                        final SubLObject output_file = cconcatenate(filename, $str413$_out);
                        final SubLObject file_string = file_utilities.slurp_file(filename);
                        final SubLObject plain_doc = new_tagged_document(file_string, concept_tagger.get_browser_tagging_lexicon(NIL, $list432, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        final SubLObject disambiguated_doc = rule_disambiguation.rdis_disambiguate(rule_disambiguation.new_rule_disambiguator(UNPROVIDED, UNPROVIDED), plain_doc, UNPROVIDED);
                        SubLObject stream_$150 = NIL;
                        try {
                            final SubLObject _prev_bind_2 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                stream_$150 = compatibility.open_text(output_file, $OUTPUT);
                            } finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_2, thread);
                            }
                            if (!stream_$150.isStream()) {
                                Errors.error($str113$Unable_to_open__S, output_file);
                            }
                            final SubLObject s = stream_$150;
                            final SubLObject vector_var = document.document_paragraphs(disambiguated_doc);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject element_num;
                            SubLObject paragraph;
                            SubLObject vector_var_$151;
                            SubLObject backwardP_var_$152;
                            SubLObject length_$153;
                            SubLObject v_iteration_$154;
                            SubLObject element_num_$155;
                            SubLObject sent;
                            SubLObject cdolist_list_var;
                            SubLObject word;
                            SubLObject cdolist_list_var_$156;
                            SubLObject cycl;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                paragraph = aref(vector_var, element_num);
                                vector_var_$151 = document.paragraph_sentences(paragraph);
                                backwardP_var_$152 = NIL;
                                for (length_$153 = length(vector_var_$151), v_iteration_$154 = NIL, v_iteration_$154 = ZERO_INTEGER; v_iteration_$154.numL(length_$153); v_iteration_$154 = add(v_iteration_$154, ONE_INTEGER)) {
                                    element_num_$155 = (NIL != backwardP_var_$152) ? subtract(length_$153, v_iteration_$154, ONE_INTEGER) : v_iteration_$154;
                                    sent = aref(vector_var_$151, element_num_$155);
                                    cdolist_list_var = document.sentence_yield_exhaustive(sent);
                                    word = NIL;
                                    word = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        cdolist_list_var_$156 = document.word_cycls(word);
                                        cycl = NIL;
                                        cycl = cdolist_list_var_$156.first();
                                        while (NIL != cdolist_list_var_$156) {
                                            format(s, $str433$__S__S__S___, new SubLObject[]{ document.word_string(word), cycl, document.sentence_string(sent) });
                                            cdolist_list_var_$156 = cdolist_list_var_$156.rest();
                                            cycl = cdolist_list_var_$156.first();
                                        } 
                                        cdolist_list_var = cdolist_list_var.rest();
                                        word = cdolist_list_var.first();
                                    } 
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (stream_$150.isStream()) {
                                    close(stream_$150, UNPROVIDED);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                            }
                        }
                        output_files = cons(output_file, output_files);
                    } else {
                        cdestructuring_bind_error(datum, $list430);
                    }
                    line_number_var = number_utilities.f_1X(line_number_var);
                }
            }
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return output_files;
    }

    public static SubLObject declare_document_annotation_widgets_file() {
        declareMacro(me, "trace_doc_search", "TRACE-DOC-SEARCH");
        declareFunction(me, "get_text_index", "GET-TEXT-INDEX", 0, 0, false);
        declareFunction(me, "get_semantic_index", "GET-SEMANTIC-INDEX", 0, 0, false);
        declareFunction(me, "semantic_index_initializedP", "SEMANTIC-INDEX-INITIALIZED?", 0, 0, false);
        declareFunction(me, "use_daves_temp_indexes", "USE-DAVES-TEMP-INDEXES", 0, 0, false);
        declareFunction(me, "use_development_indexes", "USE-DEVELOPMENT-INDEXES", 0, 0, false);
        declareFunction(me, "use_development_disambiguated_indexes", "USE-DEVELOPMENT-DISAMBIGUATED-INDEXES", 0, 0, false);
        declareFunction(me, "use_hezbollah_indexes", "USE-HEZBOLLAH-INDEXES", 0, 0, false);
        declareFunction(me, "new_closure_justification", "NEW-CLOSURE-JUSTIFICATION", 3, 0, false);
        declareFunction(me, "get_closure_justification_gaf", "GET-CLOSURE-JUSTIFICATION-GAF", 1, 0, false);
        declareFunction(me, "get_closure_justification_spec", "GET-CLOSURE-JUSTIFICATION-SPEC", 1, 0, false);
        declareFunction(me, "get_closure_justification_genl", "GET-CLOSURE-JUSTIFICATION-GENL", 1, 0, false);
        declareFunction(me, "closure_justification_predicate", "CLOSURE-JUSTIFICATION-PREDICATE", 1, 0, false);
        declareFunction(me, "closure_justification_pred_id", "CLOSURE-JUSTIFICATION-PRED-ID", 1, 0, false);
        declareFunction(me, "substitute_template", "SUBSTITUTE-TEMPLATE", 3, 0, false);
        declareFunction(me, "predicate_template", "PREDICATE-TEMPLATE", 1, 0, false);
        declareFunction(me, "make_justifications", "MAKE-JUSTIFICATIONS", 3, 0, false);
        declareFunction(me, "doc_annotation_irrelevant_term", "DOC-ANNOTATION-IRRELEVANT-TERM", 1, 0, false);
        declareFunction(me, "clear_term_learner_object_from_id", "CLEAR-TERM-LEARNER-OBJECT-FROM-ID", 0, 0, false);
        declareFunction(me, "remove_term_learner_object_from_id", "REMOVE-TERM-LEARNER-OBJECT-FROM-ID", 1, 0, false);
        declareFunction(me, "term_learner_object_from_id_internal", "TERM-LEARNER-OBJECT-FROM-ID-INTERNAL", 1, 0, false);
        declareFunction(me, "term_learner_object_from_id", "TERM-LEARNER-OBJECT-FROM-ID", 1, 0, false);
        declareFunction(me, "maybe_term_learner_object_from_id", "MAYBE-TERM-LEARNER-OBJECT-FROM-ID", 1, 0, false);
        declareFunction(me, "get_term_learner_id_for_cycl_string", "GET-TERM-LEARNER-ID-FOR-CYCL-STRING", 1, 0, false);
        declareFunction(me, "clear_term_learner_id", "CLEAR-TERM-LEARNER-ID", 0, 0, false);
        declareFunction(me, "remove_term_learner_id", "REMOVE-TERM-LEARNER-ID", 1, 0, false);
        declareFunction(me, "term_learner_id_internal", "TERM-LEARNER-ID-INTERNAL", 1, 0, false);
        declareFunction(me, "term_learner_id", "TERM-LEARNER-ID", 1, 0, false);
        declareFunction(me, "get_upwards_closure_justifications_internal", "GET-UPWARDS-CLOSURE-JUSTIFICATIONS-INTERNAL", 1, 0, false);
        declareFunction(me, "get_upwards_closure_justifications", "GET-UPWARDS-CLOSURE-JUSTIFICATIONS", 1, 0, false);
        declareFunction(me, "get_upwards_closure", "GET-UPWARDS-CLOSURE", 1, 0, false);
        declareFunction(me, "clear_get_upwards_closure_justifications_cached", "CLEAR-GET-UPWARDS-CLOSURE-JUSTIFICATIONS-CACHED", 0, 0, false);
        declareFunction(me, "remove_get_upwards_closure_justifications_cached", "REMOVE-GET-UPWARDS-CLOSURE-JUSTIFICATIONS-CACHED", 1, 0, false);
        declareFunction(me, "get_upwards_closure_justifications_cached_internal", "GET-UPWARDS-CLOSURE-JUSTIFICATIONS-CACHED-INTERNAL", 1, 0, false);
        declareFunction(me, "get_upwards_closure_justifications_cached", "GET-UPWARDS-CLOSURE-JUSTIFICATIONS-CACHED", 1, 0, false);
        declareFunction(me, "caching_upwards_closure_justificationsP", "CACHING-UPWARDS-CLOSURE-JUSTIFICATIONS?", 0, 0, false);
        declareFunction(me, "cache_upwards_closure_justifications", "CACHE-UPWARDS-CLOSURE-JUSTIFICATIONS", 0, 1, false);
        declareFunction(me, "cache_upwards_closure_justification", "CACHE-UPWARDS-CLOSURE-JUSTIFICATION", 1, 0, false);
        declareFunction(me, "treatment_for_somethingP", "TREATMENT-FOR-SOMETHING?", 1, 0, false);
        declareFunction(me, "ailmentP", "AILMENT?", 1, 0, false);
        declareFunction(me, "agentP", "AGENT?", 1, 0, false);
        declareFunction(me, "clear_get_treated_condition", "CLEAR-GET-TREATED-CONDITION", 0, 0, false);
        new document_annotation_widgets.$clear_get_treated_condition$ZeroArityFunction();
        declareFunction(me, "remove_get_treated_condition", "REMOVE-GET-TREATED-CONDITION", 1, 0, false);
        declareFunction(me, "get_treated_condition_internal", "GET-TREATED-CONDITION-INTERNAL", 1, 0, false);
        declareFunction(me, "get_treated_condition", "GET-TREATED-CONDITION", 1, 0, false);
        declareFunction(me, "clear_get_treatments_for_condition", "CLEAR-GET-TREATMENTS-FOR-CONDITION", 0, 0, false);
        new document_annotation_widgets.$clear_get_treatments_for_condition$ZeroArityFunction();
        declareFunction(me, "remove_get_treatments_for_condition", "REMOVE-GET-TREATMENTS-FOR-CONDITION", 1, 0, false);
        declareFunction(me, "get_treatments_for_condition_internal", "GET-TREATMENTS-FOR-CONDITION-INTERNAL", 1, 0, false);
        declareFunction(me, "get_treatments_for_condition", "GET-TREATMENTS-FOR-CONDITION", 1, 0, false);
        declareFunction(me, "clear_get_affected_parts", "CLEAR-GET-AFFECTED-PARTS", 0, 0, false);
        new document_annotation_widgets.$clear_get_affected_parts$ZeroArityFunction();
        declareFunction(me, "remove_get_affected_parts", "REMOVE-GET-AFFECTED-PARTS", 1, 0, false);
        declareFunction(me, "get_affected_parts_internal", "GET-AFFECTED-PARTS-INTERNAL", 1, 0, false);
        declareFunction(me, "get_affected_parts", "GET-AFFECTED-PARTS", 1, 0, false);
        declareFunction(me, "clear_get_cooccurring_conditions", "CLEAR-GET-COOCCURRING-CONDITIONS", 0, 0, false);
        new document_annotation_widgets.$clear_get_cooccurring_conditions$ZeroArityFunction();
        declareFunction(me, "remove_get_cooccurring_conditions", "REMOVE-GET-COOCCURRING-CONDITIONS", 1, 0, false);
        declareFunction(me, "get_cooccurring_conditions_internal", "GET-COOCCURRING-CONDITIONS-INTERNAL", 1, 0, false);
        declareFunction(me, "get_cooccurring_conditions", "GET-COOCCURRING-CONDITIONS", 1, 0, false);
        declareFunction(me, "get_groups", "GET-GROUPS", 1, 0, false);
        declareFunction(me, "get_groups_non_cached", "GET-GROUPS-NON-CACHED", 1, 0, false);
        declareFunction(me, "clear_leaders_to_groups", "CLEAR-LEADERS-TO-GROUPS", 0, 0, false);
        declareFunction(me, "remove_leaders_to_groups", "REMOVE-LEADERS-TO-GROUPS", 0, 0, false);
        declareFunction(me, "leaders_to_groups_internal", "LEADERS-TO-GROUPS-INTERNAL", 0, 0, false);
        declareFunction(me, "leaders_to_groups", "LEADERS-TO-GROUPS", 0, 0, false);
        declareFunction(me, "get_city_regions", "GET-CITY-REGIONS", 1, 0, false);
        declareFunction(me, "get_city_countries", "GET-CITY-COUNTRIES", 1, 0, false);
        declareFunction(me, "clear_cities_to_countries", "CLEAR-CITIES-TO-COUNTRIES", 0, 0, false);
        declareFunction(me, "remove_cities_to_countries", "REMOVE-CITIES-TO-COUNTRIES", 0, 0, false);
        declareFunction(me, "cities_to_countries_internal", "CITIES-TO-COUNTRIES-INTERNAL", 0, 0, false);
        declareFunction(me, "cities_to_countries", "CITIES-TO-COUNTRIES", 0, 0, false);
        declareFunction(me, "get_city_countries_non_cached", "GET-CITY-COUNTRIES-NON-CACHED", 1, 0, false);
        declareFunction(me, "get_country_regions", "GET-COUNTRY-REGIONS", 1, 0, false);
        declareFunction(me, "get_country_regions_non_cached", "GET-COUNTRY-REGIONS-NON-CACHED", 1, 0, false);
        declareFunction(me, "clear_countries_to_regions", "CLEAR-COUNTRIES-TO-REGIONS", 0, 0, false);
        declareFunction(me, "remove_countries_to_regions", "REMOVE-COUNTRIES-TO-REGIONS", 0, 0, false);
        declareFunction(me, "countries_to_regions_internal", "COUNTRIES-TO-REGIONS-INTERNAL", 0, 0, false);
        declareFunction(me, "countries_to_regions", "COUNTRIES-TO-REGIONS", 0, 0, false);
        declareMacro(me, "with_dual_lucene_sessions", "WITH-DUAL-LUCENE-SESSIONS");
        declareFunction(me, "add_fully_indexed_documents_from_dir", "ADD-FULLY-INDEXED-DOCUMENTS-FROM-DIR", 6, 0, false);
        declareFunction(me, "add_fully_indexed_documents", "ADD-FULLY-INDEXED-DOCUMENTS", 6, 0, false);
        declareFunction(me, "tag_xml_documents_with_urls", "TAG-XML-DOCUMENTS-WITH-URLS", 1, 2, false);
        declareFunction(me, "tag_xml_document_filespec", "TAG-XML-DOCUMENT-FILESPEC", 3, 1, false);
        declareFunction(me, "read_original_doc", "READ-ORIGINAL-DOC", 1, 0, false);
        declareFunction(me, "tag_xml_doc_set_with_urls", "TAG-XML-DOC-SET-WITH-URLS", 1, 2, false);
        declareFunction(me, "index_xml_doc_set_from_map_file", "INDEX-XML-DOC-SET-FROM-MAP-FILE", 2, 4, false);
        declareFunction(me, "index_pre_tagged_xml_docs", "INDEX-PRE-TAGGED-XML-DOCS", 6, 0, false);
        declareFunction(me, "index_pre_tagged_xml_doc", "INDEX-PRE-TAGGED-XML-DOC", 4, 0, false);
        declareFunction(me, "lucene_add_document_semantic", "LUCENE-ADD-DOCUMENT-SEMANTIC", 6, 0, false);
        declareFunction(me, "lucene_add_document_keyword", "LUCENE-ADD-DOCUMENT-KEYWORD", 4, 0, false);
        declareFunction(me, "add_fully_indexed_document", "ADD-FULLY-INDEXED-DOCUMENT", 5, 0, false);
        declareFunction(me, "print_offset_info", "PRINT-OFFSET-INFO", 3, 0, false);
        declareFunction(me, "print_term_and_reln", "PRINT-TERM-AND-RELN", 3, 0, false);
        declareFunction(me, "print_token", "PRINT-TOKEN", 4, 0, false);
        declareFunction(me, "new_tagged_document", "NEW-TAGGED-DOCUMENT", 1, 4, false);
        declareFunction(me, "find_concepts_for_document_segments", "FIND-CONCEPTS-FOR-DOCUMENT-SEGMENTS", 1, 3, false);
        declareFunction(me, "tag_document_nodes_for_display", "TAG-DOCUMENT-NODES-FOR-DISPLAY", 1, 4, false);
        declareFunction(me, "get_doc_string_from_node_ids_and_strings", "GET-DOC-STRING-FROM-NODE-IDS-AND-STRINGS", 1, 0, false);
        declareFunction(me, "get_output_lists_for_word", "GET-OUTPUT-LISTS-FOR-WORD", 2, 1, false);
        declareFunction(me, "node_and_node_offset", "NODE-AND-NODE-OFFSET", 2, 0, false);
        declareFunction(me, "new_named_entity_wordP", "NEW-NAMED-ENTITY-WORD?", 1, 0, false);
        declareFunction(me, "nart_has_non_derived_assertionsP", "NART-HAS-NON-DERIVED-ASSERTIONS?", 1, 0, false);
        declareFunction(me, "find_interps_for_document_segments", "FIND-INTERPS-FOR-DOCUMENT-SEGMENTS", 1, 3, false);
        declareFunction(me, "get_default_medical_tagging_lexicon", "GET-DEFAULT-MEDICAL-TAGGING-LEXICON", 0, 0, false);
        declareFunction(me, "clear_default_medical_tagging_lexicon", "CLEAR-DEFAULT-MEDICAL-TAGGING-LEXICON", 0, 0, false);
        declareFunction(me, "augment_medical_html_file_with_cyc_terms", "AUGMENT-MEDICAL-HTML-FILE-WITH-CYC-TERMS", 1, 1, false);
        declareFunction(me, "augment_html_document_with_cyc_terms", "AUGMENT-HTML-DOCUMENT-WITH-CYC-TERMS", 1, 1, false);
        declareFunction(me, "doc_tagger_rdf_name", "DOC-TAGGER-RDF-NAME", 1, 0, false);
        declareFunction(me, "doc_tagger_rdf_id", "DOC-TAGGER-RDF-ID", 1, 0, false);
        declareFunction(me, "mapping_first_elt_info", "MAPPING-FIRST-ELT-INFO", 1, 0, false);
        declareFunction(me, "get_text_string_from_tokens", "GET-TEXT-STRING-FROM-TOKENS", 1, 1, false);
        declareFunction(me, "tag_document_for_indexing_with_offsets", "TAG-DOCUMENT-FOR-INDEXING-WITH-OFFSETS", 1, 3, false);
        declareFunction(me, "document_annotation_relation_from_id", "DOCUMENT-ANNOTATION-RELATION-FROM-ID", 1, 0, false);
        declareFunction(me, "generate_retrieval_justification", "GENERATE-RETRIEVAL-JUSTIFICATION", 3, 0, false);
        declareFunction(me, "generate_retrieval_justification_from_justification_string", "GENERATE-RETRIEVAL-JUSTIFICATION-FROM-JUSTIFICATION-STRING", 1, 0, false);
        declareFunction(me, "get_best_justifications_from_arg_list", "GET-BEST-JUSTIFICATIONS-FROM-ARG-LIST", 1, 0, false);
        declareFunction(me, "better_justification_pred", "BETTER-JUSTIFICATION-PRED", 2, 0, false);
        declareFunction(me, "generate_term_explanation", "GENERATE-TERM-EXPLANATION", 1, 0, false);
        declareFunction(me, "get_other_explanatory_strings_for_term", "GET-OTHER-EXPLANATORY-STRINGS-FOR-TERM", 1, 0, false);
        declareFunction(me, "clear_document_annotation_term_id", "CLEAR-DOCUMENT-ANNOTATION-TERM-ID", 0, 0, false);
        declareFunction(me, "remove_document_annotation_term_id", "REMOVE-DOCUMENT-ANNOTATION-TERM-ID", 1, 1, false);
        declareFunction(me, "document_annotation_term_id_internal", "DOCUMENT-ANNOTATION-TERM-ID-INTERNAL", 2, 0, false);
        declareFunction(me, "document_annotation_term_id", "DOCUMENT-ANNOTATION-TERM-ID", 1, 1, false);
        declareFunction(me, "clear_document_annotation_term_from_id", "CLEAR-DOCUMENT-ANNOTATION-TERM-FROM-ID", 0, 0, false);
        declareFunction(me, "remove_document_annotation_term_from_id", "REMOVE-DOCUMENT-ANNOTATION-TERM-FROM-ID", 1, 0, false);
        declareFunction(me, "document_annotation_term_from_id_internal", "DOCUMENT-ANNOTATION-TERM-FROM-ID-INTERNAL", 1, 0, false);
        declareFunction(me, "document_annotation_term_from_id", "DOCUMENT-ANNOTATION-TERM-FROM-ID", 1, 0, false);
        declareFunction(me, "get_cached_term_id", "GET-CACHED-TERM-ID", 1, 0, false);
        declareFunction(me, "get_term_from_cached_id", "GET-TERM-FROM-CACHED-ID", 1, 0, false);
        declareFunction(me, "get_default_document_ingester_annotation_learning_lexicon", "GET-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEARNING-LEXICON", 0, 3, false);
        declareFunction(me, "clear_default_document_ingester_annotation_learning_lexicon", "CLEAR-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEARNING-LEXICON", 0, 1, false);
        declareFunction(me, "clear_get_default_document_ingester_annotation_lexicon", "CLEAR-GET-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEXICON", 0, 0, false);
        declareFunction(me, "remove_get_default_document_ingester_annotation_lexicon", "REMOVE-GET-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEXICON", 0, 1, false);
        declareFunction(me, "get_default_document_ingester_annotation_lexicon_internal", "GET-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEXICON-INTERNAL", 1, 0, false);
        declareFunction(me, "get_default_document_ingester_annotation_lexicon", "GET-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEXICON", 0, 1, false);
        declareFunction(me, "clear_default_document_ingester_annotation_lexicon_for_mt", "CLEAR-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEXICON-FOR-MT", 1, 0, false);
        declareFunction(me, "get_default_document_annotation_learning_lexicon", "GET-DEFAULT-DOCUMENT-ANNOTATION-LEARNING-LEXICON", 0, 0, false);
        declareFunction(me, "clear_default_document_annotation_learning_lexicon", "CLEAR-DEFAULT-DOCUMENT-ANNOTATION-LEARNING-LEXICON", 0, 0, false);
        declareFunction(me, "clear_default_document_annotation_lexicon", "CLEAR-DEFAULT-DOCUMENT-ANNOTATION-LEXICON", 0, 0, false);
        declareFunction(me, "clear_get_default_document_annotation_lexicon", "CLEAR-GET-DEFAULT-DOCUMENT-ANNOTATION-LEXICON", 0, 0, false);
        declareFunction(me, "remove_get_default_document_annotation_lexicon", "REMOVE-GET-DEFAULT-DOCUMENT-ANNOTATION-LEXICON", 0, 1, false);
        declareFunction(me, "get_default_document_annotation_lexicon_internal", "GET-DEFAULT-DOCUMENT-ANNOTATION-LEXICON-INTERNAL", 1, 0, false);
        declareFunction(me, "get_default_document_annotation_lexicon", "GET-DEFAULT-DOCUMENT-ANNOTATION-LEXICON", 0, 1, false);
        declareFunction(me, "make_default_document_annotation_lexicon", "MAKE-DEFAULT-DOCUMENT-ANNOTATION-LEXICON", 0, 1, false);
        declareFunction(me, "get_default_document_annotation_rule_disambiguator", "GET-DEFAULT-DOCUMENT-ANNOTATION-RULE-DISAMBIGUATOR", 0, 0, false);
        declareFunction(me, "maybe_initialize_doc_annotator_term_id_fbc", "MAYBE-INITIALIZE-DOC-ANNOTATOR-TERM-ID-FBC", 0, 1, false);
        declareFunction(me, "maybe_initialize_doc_annotator_id_term_fbc", "MAYBE-INITIALIZE-DOC-ANNOTATOR-ID-TERM-FBC", 0, 1, false);
        declareFunction(me, "rebuild_doc_annotator_term_id_fbc", "REBUILD-DOC-ANNOTATOR-TERM-ID-FBC", 0, 2, false);
        declareFunction(me, "build_id_to_term_fbc", "BUILD-ID-TO-TERM-FBC", 0, 2, false);
        declareFunction(me, "augment_doc_annotator_term_fht", "AUGMENT-DOC-ANNOTATOR-TERM-FHT", 0, 1, false);
        declareFunction(me, "document_query", "DOCUMENT-QUERY", 1, 0, false);
        declareFunction(me, "lucene_text_query", "LUCENE-TEXT-QUERY", 1, 1, false);
        declareFunction(me, "lucene_sem_query_with_sem_search_string", "LUCENE-SEM-QUERY-WITH-SEM-SEARCH-STRING", 1, 1, false);
        declareFunction(me, "lucene_sem_query", "LUCENE-SEM-QUERY", 1, 1, false);
        declareFunction(me, "lucene_double_query", "LUCENE-DOUBLE-QUERY", 2, 1, false);
        declareFunction(me, "cyc_semantic_search_token", "CYC-SEMANTIC-SEARCH-TOKEN", 2, 0, false);
        declareFunction(me, "terms_for_cyc_semantic_query", "TERMS-FOR-CYC-SEMANTIC-QUERY", 1, 0, false);
        declareFunction(me, "remove_cdar", "REMOVE-CDAR", 1, 0, false);
        declareFunction(me, "stopword_in_sem_queryP", "STOPWORD-IN-SEM-QUERY?", 1, 0, false);
        declareFunction(me, "encode_word_for_semantic_query", "ENCODE-WORD-FOR-SEMANTIC-QUERY", 2, 0, false);
        declareFunction(me, "terms_for_focused_cyc_semantic_query", "TERMS-FOR-FOCUSED-CYC-SEMANTIC-QUERY", 2, 0, false);
        declareFunction(me, "simple_terms_for_cyc_semantic_query", "SIMPLE-TERMS-FOR-CYC-SEMANTIC-QUERY", 1, 0, false);
        declareFunction(me, "get_compiled_regexp", "GET-COMPILED-REGEXP", 1, 0, false);
        declareFunction(me, "clean_semantic_search_hits", "CLEAN-SEMANTIC-SEARCH-HITS", 1, 0, false);
        declareMacro(me, "do_lexified_forts", "DO-LEXIFIED-FORTS");
        declareFunction(me, "simple_document_tagging_results", "SIMPLE-DOCUMENT-TAGGING-RESULTS", 1, 0, false);
        declareFunction(me, "show_document_tagging_results", "SHOW-DOCUMENT-TAGGING-RESULTS", 1, 1, false);
        declareFunction(me, "document_tagging_results_for_human_review", "DOCUMENT-TAGGING-RESULTS-FOR-HUMAN-REVIEW", 1, 1, false);
        declareFunction(me, "remove_pictures_regexp_test", "REMOVE-PICTURES-REGEXP-TEST", 1, 0, false);
        declareFunction(me, "get_doc_string_from_node_ids_and_strings_values", "GET-DOC-STRING-FROM-NODE-IDS-AND-STRINGS-VALUES", 1, 0, false);
        declareFunction(me, "get_interpretation_rules_for_mt", "GET-INTERPRETATION-RULES-FOR-MT", 0, 1, false);
        declareFunction(me, "tag_document_for_interpretation", "TAG-DOCUMENT-FOR-INTERPRETATION", 1, 1, false);
        declareFunction(me, "get_concept_bag_from_document", "GET-CONCEPT-BAG-FROM-DOCUMENT", 1, 0, false);
        declareMacro(me, "do_interpretation_rules", "DO-INTERPRETATION-RULES");
        declareFunction(me, "interpret_document_via_suggestions", "INTERPRET-DOCUMENT-VIA-SUGGESTIONS", 1, 0, false);
        declareFunction(me, "suggest_interpretations", "SUGGEST-INTERPRETATIONS", 1, 2, false);
        declareFunction(me, "interpretation_rule_appliesP", "INTERPRETATION-RULE-APPLIES?", 3, 0, false);
        declareFunction(me, "update_interpretation_with_rule", "UPDATE-INTERPRETATION-WITH-RULE", 4, 0, false);
        declareFunction(me, "initialize_interpretation_rules", "INITIALIZE-INTERPRETATION-RULES", 0, 1, false);
        declareFunction(me, "add_interpretation_rule", "ADD-INTERPRETATION-RULE", 2, 0, false);
        declareFunction(me, "add_interpretation_rule_clauses", "ADD-INTERPRETATION-RULE-CLAUSES", 3, 0, false);
        declareFunction(me, "interpretation_rules_count", "INTERPRETATION-RULES-COUNT", 1, 0, false);
        declareFunction(me, "clear_interpretation_rules", "CLEAR-INTERPRETATION-RULES", 0, 0, false);
        declareFunction(me, "store_interpretation_rule", "STORE-INTERPRETATION-RULE", 2, 0, false);
        declareFunction(me, "make_interpretation_rule_description", "MAKE-INTERPRETATION-RULE-DESCRIPTION", 4, 0, false);
        declareFunction(me, "interpretation_rule_description_antecedent", "INTERPRETATION-RULE-DESCRIPTION-ANTECEDENT", 1, 0, false);
        declareFunction(me, "interpretation_rule_description_consequent", "INTERPRETATION-RULE-DESCRIPTION-CONSEQUENT", 1, 0, false);
        declareFunction(me, "interpretation_rule_description_preconditions", "INTERPRETATION-RULE-DESCRIPTION-PRECONDITIONS", 1, 0, false);
        declareFunction(me, "interpretation_rule_description_suggestions", "INTERPRETATION-RULE-DESCRIPTION-SUGGESTIONS", 1, 0, false);
        declareFunction(me, "extract_interpretation_rule_preconditions", "EXTRACT-INTERPRETATION-RULE-PRECONDITIONS", 1, 0, false);
        declareFunction(me, "extract_interpretation_rule_suggestions", "EXTRACT-INTERPRETATION-RULE-SUGGESTIONS", 1, 0, false);
        declareFunction(me, "extract_interpretation_rule_precondition", "EXTRACT-INTERPRETATION-RULE-PRECONDITION", 1, 0, false);
        declareFunction(me, "extract_interpretation_rule_suggestion", "EXTRACT-INTERPRETATION-RULE-SUGGESTION", 1, 0, false);
        declareFunction(me, "cb_document_interpretation_show_concept", "CB-DOCUMENT-INTERPRETATION-SHOW-CONCEPT", 1, 1, false);
        declareFunction(me, "cb_document_interpretation_show_sentence", "CB-DOCUMENT-INTERPRETATION-SHOW-SENTENCE", 1, 1, false);
        declareFunction(me, "cb_document_interpretation_show_rule", "CB-DOCUMENT-INTERPRETATION-SHOW-RULE", 1, 0, false);
        declareFunction(me, "cb_document_interpretation_suggestions", "CB-DOCUMENT-INTERPRETATION-SUGGESTIONS", 1, 0, false);
        declareFunction(me, "cb_annotate_tagged_concepts", "CB-ANNOTATE-TAGGED-CONCEPTS", 1, 0, false);
        declareFunction(me, "handle_submitted_manual_annotation_data", "HANDLE-SUBMITTED-MANUAL-ANNOTATION-DATA", 1, 0, false);
        declareFunction(me, "annotation_data_from_file", "ANNOTATION-DATA-FROM-FILE", 3, 0, false);
        declareFunction(me, "get_manual_annotations", "GET-MANUAL-ANNOTATIONS", 0, 1, false);
        declareFunction(me, "get_manual_annotations_with_strings", "GET-MANUAL-ANNOTATIONS-WITH-STRINGS", 0, 1, false);
        declareFunction(me, "get_concept_to_strings_map_from_input_data", "GET-CONCEPT-TO-STRINGS-MAP-FROM-INPUT-DATA", 0, 1, false);
        declareFunction(me, "get_assertions_for_concept_and_string", "GET-ASSERTIONS-FOR-CONCEPT-AND-STRING", 2, 0, false);
        declareFunction(me, "ke_text_from_manual_annotations", "KE-TEXT-FROM-MANUAL-ANNOTATIONS", 0, 1, false);
        declareFunction(me, "output_webgame_qs", "OUTPUT-WEBGAME-QS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_document_annotation_widgets_file() {
        defparameter("*TEXT-INDEX*", $str0$_host_george_super_index_hezbolla);
        defparameter("*SEMANTIC-INDEX*", $str1$_host_george_super_index_hezbolla);
        defparameter("*TEXT-INDEX-OVERRIDE*", NIL);
        defparameter("*SEMANTIC-INDEX-OVERRIDE*", NIL);
        defparameter("*TRACE-DOC-SEARCH-INTERFACE*", NIL);
        defparameter("*DOC-SEARCH-TRACE-LOG-FILE*", NIL);
        defparameter("*PREDICATE-ID-TABLE*", $list21);
        defparameter("*PREDICATE-TEMPLATE-TABLE*", $list22);
        defparameter("*UPWARDS-CLOSURE-JUSTIFICATION-FBC*", NIL);
        defparameter("*UPWARDS-CLOSURE-JUSTIFICATION-FHT-PATH*", $str23$data_doc_tagging_upwards_closure_);
        defparameter("*DOC-ANNOTATION-THCL-VERBOSE?*", NIL);
        deflexical("*TERM-LEARNER-OBJECT-FROM-ID-CACHING-STATE*", NIL);
        deflexical("*TERM-LEARNER-ID-CACHING-STATE*", NIL);
        defparameter("*UPWARDS-CLOSURE-QUERY-MT*", $list39);
        deflexical("*GET-UPWARDS-CLOSURE-JUSTIFICATIONS-CACHED-CACHING-STATE*", NIL);
        defparameter("*CACHING-UPWARDS-CLOSURE-JUSTIFICATIONS?*", NIL);
        deflexical("*GET-TREATED-CONDITION-CACHING-STATE*", NIL);
        deflexical("*GET-TREATMENTS-FOR-CONDITION-CACHING-STATE*", NIL);
        deflexical("*GET-AFFECTED-PARTS-CACHING-STATE*", NIL);
        deflexical("*GET-COOCCURRING-CONDITIONS-CACHING-STATE*", NIL);
        deflexical("*LEADERS-TO-GROUPS-CACHING-STATE*", NIL);
        deflexical("*CITIES-TO-COUNTRIES-CACHING-STATE*", NIL);
        deflexical("*COUNTRIES-TO-REGIONS-CACHING-STATE*", NIL);
        defparameter("*TAGGED-XML-DOC-DIRECTORY*", $str115$_host_george_scratch_tagged_xml_d);
        defconstant("*TAGGED-DOC-TITLE-NAME*", $$$title);
        defconstant("*TAGGED-DOC-TITLE-TOKEN*", $str117$_title_);
        defconstant("*TAGGED-DOC-TITLE-CLOSE-TOKEN*", $str118$__title_);
        defconstant("*TAGGED-DOC-TEXT-NAME*", $$$text);
        defconstant("*TAGGED-DOC-TEXT-TOKEN*", $str120$_text_);
        defconstant("*TAGGED-DOC-TEXT-CLOSE-TOKEN*", $str121$__text_);
        defconstant("*TAGGED-DOC-KEYSTRING-NAME*", $$$keystring);
        defconstant("*TAGGED-DOC-KEYSTRING-TOKEN*", $str123$_keystring_);
        defconstant("*TAGGED-DOC-CONFIRMED-CONCEPTS-KEYSTRING-TOKEN*", $str124$_confirmed_concept_keystring_);
        defconstant("*TAGGED-DOC-CONFIRMED-CONCEPTS-KEYSTRING-NAME*", $str124$_confirmed_concept_keystring_);
        defconstant("*TAGGED-DOC-ORIGINAL-FILENAME-NAME*", $str125$original_filename);
        defconstant("*TAGGED-DOC-ORIGINAL-FILENAME-TOKEN*", $str126$_original_filename_);
        defconstant("*TAGGED-DOC-URL-NAME*", $$$url);
        defconstant("*TAGGED-DOC-URL-TOKEN*", $str128$_url_);
        defconstant("*TAGGED-DOC-URL-CLOSE-TOKEN*", $str129$__url_);
        defconstant("*TAGGED-DOC-PARENT-FILENAME-NAME*", $str130$parent_filename);
        defconstant("*TAGGED-DOC-PARENT-FILENAME-TOKEN*", $str131$_parent_filename_);
        defparameter("*SEMANTIC-INDEX-DIR-NAME*", $$$sem);
        defparameter("*TEXT-INDEX-DIR-NAME*", $$$text);
        defparameter("*ANNOTATED-DOCUMENT-FORMAT*", $SIMPLE);
        defparameter("*TERM-LEARNER-KEEP-CONCEPTS-DISTINCT*", T);
        defparameter("*DEFAULT-MEDICAL-TAGGING-LEXICON*", NIL);
        defparameter("*DOC-ANNOTATION-USE-HL-IDS*", NIL);
        defparameter("*DOC-ANNOTATOR-TERM-ID-FBC-PATH*", $str199$data_doc_tagging_term_id_fht);
        defparameter("*DOC-ANNOTATOR-ID-TERM-FBC-PATH*", $str200$data_doc_tagging_id_term_fht);
        defparameter("*DOC-ANNOTATOR-TERM-ID-FBC*", NIL);
        defparameter("*DOC-ANNOTATOR-ID-TERM-FBC*", NIL);
        deflexical("*DOCUMENT-ANNOTATION-TERM-ID-CACHING-STATE*", NIL);
        deflexical("*DOCUMENT-ANNOTATION-TERM-FROM-ID-CACHING-STATE*", NIL);
        defparameter("*DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEARNING-LEXICONS*", dictionary.new_dictionary(EQUAL, UNPROVIDED));
        deflexical("*GET-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEXICON-CACHING-STATE*", NIL);
        defparameter("*DEFAULT-DOCUMENT-ANNOTATION-LEARNING-LEXICON*", NIL);
        defparameter("*DEFAULT-DOCUMENT-ANNOTATION-LEXICON*", NIL);
        deflexical("*GET-DEFAULT-DOCUMENT-ANNOTATION-LEXICON-CACHING-STATE*", NIL);
        defparameter("*DEFAULT-DOCUMENT-ANNOTATION-RULE-DISAMBIGUATOR*", NIL);
        defparameter("*REMOVE-PICTURES-REGEXP*", $str292$_____a_z0_9A_Z_________);
        defparameter("*REMOVE-HYPHENS-REGEXP*", $str293$__);
        defparameter("*REMOVE-UNDERSCORES-REGEXP*", $str294$__);
        defparameter("*REMOVE-EQUALS-REGEXP*", $str295$__);
        defparameter("*REMOVE-DOTS-REGEXP*", $str296$_____________);
        defparameter("*REMOVE-UNICODE-REGEXP*", $str297$__0_9a_fA_F___);
        defparameter("*CACHED-REGEXPS*", NIL);
        deflexical("*DOCUMENT-INTERPRETATION-RULES-BY-MT*", SubLSystemTrampolineFile.maybeDefault($document_interpretation_rules_by_mt$, $document_interpretation_rules_by_mt$, () -> dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED)));
        defparameter("*DOCUMENT-INTERPRETATION-DEFAULT-ELMT*", $$PiracyReportInterpretationMt);
        defparameter("*MANUAL-DOCUMENT-ANNOTATION-INSTRUCTIONS*", $str378$For_each_string____concept_mappin);
        return NIL;
    }

    public static SubLObject setup_document_annotation_widgets_file() {
        $text_index_override$.setDynamicValue($str2$_cyc_projects_ccf_document_search);
        $semantic_index_override$.setDynamicValue($str3$_cyc_projects_ccf_document_search);
        $text_index_override$.setDynamicValue($str4$_host_achernar_daves_ccf_lucene_t);
        $semantic_index_override$.setDynamicValue($str5$_host_achernar_daves_ccf_lucene_s);
        $semantic_index_override$.setDynamicValue($str6$_cyc_projects_ccf_document_search);
        $text_index_override$.setDynamicValue($str7$_cyc_projects_ccf_document_search);
        memoization_state.note_globally_cached_function(TERM_LEARNER_OBJECT_FROM_ID);
        memoization_state.note_globally_cached_function(TERM_LEARNER_ID);
        memoization_state.note_memoized_function(GET_UPWARDS_CLOSURE_JUSTIFICATIONS);
        memoization_state.note_globally_cached_function(GET_UPWARDS_CLOSURE_JUSTIFICATIONS_CACHED);
        memoization_state.note_globally_cached_function(GET_TREATED_CONDITION);
        memoization_state.note_globally_cached_function(GET_TREATMENTS_FOR_CONDITION);
        memoization_state.note_globally_cached_function(GET_AFFECTED_PARTS);
        memoization_state.note_globally_cached_function(GET_COOCCURRING_CONDITIONS);
        memoization_state.note_globally_cached_function(LEADERS_TO_GROUPS);
        memoization_state.note_globally_cached_function(CITIES_TO_COUNTRIES);
        memoization_state.note_globally_cached_function(COUNTRIES_TO_REGIONS);
        register_external_symbol(FIND_CONCEPTS_FOR_DOCUMENT_SEGMENTS);
        register_external_symbol(TAG_DOCUMENT_NODES_FOR_DISPLAY);
        register_external_symbol(FIND_INTERPS_FOR_DOCUMENT_SEGMENTS);
        register_external_symbol(GENERATE_RETRIEVAL_JUSTIFICATION_FROM_JUSTIFICATION_STRING);
        register_external_symbol(GENERATE_TERM_EXPLANATION);
        memoization_state.note_globally_cached_function(DOCUMENT_ANNOTATION_TERM_ID);
        memoization_state.note_globally_cached_function(DOCUMENT_ANNOTATION_TERM_FROM_ID);
        memoization_state.note_globally_cached_function(GET_DEFAULT_DOCUMENT_INGESTER_ANNOTATION_LEXICON);
        memoization_state.note_globally_cached_function(GET_DEFAULT_DOCUMENT_ANNOTATION_LEXICON);
        register_external_symbol(TERMS_FOR_FOCUSED_CYC_SEMANTIC_QUERY);
        define_test_case_table_int(REMOVE_PICTURES_REGEXP_TEST, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list324);
        define_test_case_table_int(GET_DOC_STRING_FROM_NODE_IDS_AND_STRINGS_VALUES, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list326);
        declare_defglobal($document_interpretation_rules_by_mt$);
        html_macros.note_cgi_handler_function(CB_DOCUMENT_INTERPRETATION_SUGGESTIONS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_ANNOTATE_TAGGED_CONCEPTS, $HTML_HANDLER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_document_annotation_widgets_file();
    }

    @Override
    public void initializeVariables() {
        init_document_annotation_widgets_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_document_annotation_widgets_file();
    }

    

    public static final class $clear_get_treated_condition$ZeroArityFunction extends ZeroArityFunction {
        public $clear_get_treated_condition$ZeroArityFunction() {
            super(extractFunctionNamed("CLEAR-GET-TREATED-CONDITION"));
        }

        @Override
        public SubLObject processItem() {
            return clear_get_treated_condition();
        }
    }

    public static final class $clear_get_treatments_for_condition$ZeroArityFunction extends ZeroArityFunction {
        public $clear_get_treatments_for_condition$ZeroArityFunction() {
            super(extractFunctionNamed("CLEAR-GET-TREATMENTS-FOR-CONDITION"));
        }

        @Override
        public SubLObject processItem() {
            return clear_get_treatments_for_condition();
        }
    }

    public static final class $clear_get_affected_parts$ZeroArityFunction extends ZeroArityFunction {
        public $clear_get_affected_parts$ZeroArityFunction() {
            super(extractFunctionNamed("CLEAR-GET-AFFECTED-PARTS"));
        }

        @Override
        public SubLObject processItem() {
            return clear_get_affected_parts();
        }
    }

    public static final class $clear_get_cooccurring_conditions$ZeroArityFunction extends ZeroArityFunction {
        public $clear_get_cooccurring_conditions$ZeroArityFunction() {
            super(extractFunctionNamed("CLEAR-GET-COOCCURRING-CONDITIONS"));
        }

        @Override
        public SubLObject processItem() {
            return clear_get_cooccurring_conditions();
        }
    }
}

/**
 * Total time: 3665 ms
 */
