package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.control_vars.$generated_phrases_browsableP$;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.el_utilities.make_formula;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.consp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class pph_vars extends SubLTranslatedFile {
    public static final SubLFile me = new pph_vars();

    public static final String myName = "com.cyc.cycjava.cycl.pph_vars";

    public static final String myFingerPrint = "36761239c690e1826b8b4187d1756f8a9b78e4ee2667d23ff45b5829c3bbfab7";

    // defparameter
    // Definitions
    public static final SubLSymbol $use_parenthetical_disambiguationsP$ = makeSymbol("*USE-PARENTHETICAL-DISAMBIGUATIONS?*");

    // defparameter
    public static final SubLSymbol $pph_ambiguous_strings$ = makeSymbol("*PPH-AMBIGUOUS-STRINGS*");

    // defparameter
    public static final SubLSymbol $pph_use_bulleted_listsP$ = makeSymbol("*PPH-USE-BULLETED-LISTS?*");

    // defparameter
    public static final SubLSymbol $pph_use_bulleted_lists_min_level$ = makeSymbol("*PPH-USE-BULLETED-LISTS-MIN-LEVEL*");

    // defparameter
    public static final SubLSymbol $pph_replace_bulleted_list_tagsP$ = makeSymbol("*PPH-REPLACE-BULLETED-LIST-TAGS?*");

    // defparameter
    // BOOLEAN: Should we use italics to render variables when in html mode?
    public static final SubLSymbol $pph_italicize_variables_in_html_modeP$ = makeSymbol("*PPH-ITALICIZE-VARIABLES-IN-HTML-MODE?*");

    // defparameter
    // BOOLEAN: Should we use italics to render skolems when in html mode?
    public static final SubLSymbol $pph_italicize_skolems_in_html_modeP$ = makeSymbol("*PPH-ITALICIZE-SKOLEMS-IN-HTML-MODE?*");

    // defparameter
    // keywordp; :SUPERSCRIPTS or :SQUARE-BRACKETS
    public static final SubLSymbol $pph_citation_format$ = makeSymbol("*PPH-CITATION-FORMAT*");

    // deflexical
    /**
     * The list of html-tags that are added by the PPH code. If the PPH code adds
     * more, they should be added to this list
     */
    public static final SubLSymbol $pph_html_tags_added_by_system$ = makeSymbol("*PPH-HTML-TAGS-ADDED-BY-SYSTEM*");

    // defparameter
    // BOOLEAN; Should we use 'yesterday', etc. for dates that we can identify?
    public static final SubLSymbol $pph_use_indexical_datesP$ = makeSymbol("*PPH-USE-INDEXICAL-DATES?*");

    // defparameter
    // LISTP of function symbols from *SELECT-STRING-METHODS* to not use.
    public static final SubLSymbol $select_string_methods_to_omit$ = makeSymbol("*SELECT-STRING-METHODS-TO-OMIT*");

    // defparameter
    public static final SubLSymbol $pph_guess_names_for_unlexified_termsP$ = makeSymbol("*PPH-GUESS-NAMES-FOR-UNLEXIFIED-TERMS?*");

    // defparameter
    public static final SubLSymbol $pph_coerce_definite_descriptions_for_unlexified_termsP$ = makeSymbol("*PPH-COERCE-DEFINITE-DESCRIPTIONS-FOR-UNLEXIFIED-TERMS?*");

    // defparameter
    public static final SubLSymbol $pph_introduce_anaphorsP$ = makeSymbol("*PPH-INTRODUCE-ANAPHORS?*");

    // defparameter
    // BOOLEAN; Should we use blanks when paraphrasing vars in questions?
    public static final SubLSymbol $pph_blanks_for_varsP$ = makeSymbol("*PPH-BLANKS-FOR-VARS?*");

    // defparameter
    /**
     * KEYWORDP; :NONE = Don't generate alternatives for phrases, bug stop after the
     * first one. :LEXICAL-ONLY = Only generate alternatives that use different
     * names or words. :TOP-LEVEL-ONLY = Only generate alternatives for the
     * relation, or the term itself if atomic. :ALL = Also include morphological
     * variants of words (can be expensive).
     */
    public static final SubLSymbol $pph_alternative_phrase_generation_level$ = makeSymbol("*PPH-ALTERNATIVE-PHRASE-GENERATION-LEVEL*");

    // defparameter
    public static final SubLSymbol $pph_sentence$ = makeSymbol("*PPH-SENTENCE*");

    // defparameter
    /**
     * Should we allow use of lexifications from external data sources, accessed via
     * RDF?
     */
    public static final SubLSymbol $pph_use_rdfP$ = makeSymbol("*PPH-USE-RDF?*");

    // defparameter
    /**
     * Stores the currently desired level of precision vs. terseness. In general,
     * should be bound using a dedicated macro, not directly. NIL = Don't try to be
     * precise T = Be precise whenever possible listp of arg-position-p = Be precise
     * for the specified arguments.
     */
    public static final SubLSymbol $paraphrase_precision$ = makeSymbol("*PARAPHRASE-PRECISION*");

    // defparameter
    // BOOLEAN; Should we prefer terse paraphrases?
    public static final SubLSymbol $pph_terse_modeP$ = makeSymbol("*PPH-TERSE-MODE?*");

    // defparameter
    /**
     * BOOLEAN; Should we prefer terse pph-mt-scope paraphrases; currently
     * suppresses non-temporal aspects when t
     */
    public static final SubLSymbol $pph_terse_mt_scopeP$ = makeSymbol("*PPH-TERSE-MT-SCOPE?*");

    // defparameter
    /**
     * BOOLEAN; Should we explicitly paraphrase the implicit temporal qualification
     * for sentences/assertions in mts with no explicit time index?
     */
    public static final SubLSymbol $pph_use_explicit_temporal_qualification_for_defaultP$ = makeSymbol("*PPH-USE-EXPLICIT-TEMPORAL-QUALIFICATION-FOR-DEFAULT?*");

    // defparameter
    /**
     * BOOLEAN; Should we give the period during which something is true if it is
     * currently true?
     */
    public static final SubLSymbol $pph_explicit_temporal_qualification_for_current_factsP$ = makeSymbol("*PPH-EXPLICIT-TEMPORAL-QUALIFICATION-FOR-CURRENT-FACTS?*");

    // defparameter
    public static final SubLSymbol $definite_description_licensed_terms$ = makeSymbol("*DEFINITE-DESCRIPTION-LICENSED-TERMS*");

    // defparameter
    // Supported options are :html and :text
    public static final SubLSymbol $paraphrase_mode$ = makeSymbol("*PARAPHRASE-MODE*");

    // defvar
    // Which MT do we look up language information from?
    public static final SubLSymbol $pph_language_mt$ = makeSymbol("*PPH-LANGUAGE-MT*");

    // defparameter
    public static final SubLSymbol $allow_pph_language_mt_broadeningP$ = makeSymbol("*ALLOW-PPH-LANGUAGE-MT-BROADENING?*");

    // defvar
    // Which MT do we look up domain information from?
    public static final SubLSymbol $pph_domain_mt$ = makeSymbol("*PPH-DOMAIN-MT*");

    // defparameter
    /**
     * An association list of <term => string> mappings. For any term in this map,
     * always use the corresponding string to paraphrase it.
     */
    public static final SubLSymbol $pph_term_paraphrase_map$ = makeSymbol("*PPH-TERM-PARAPHRASE-MAP*");

    // defparameter
    /**
     * An association list of <term => string*> mappings. For any term in this map,
     * never use any of the corresponding strings to paraphrase it.
     */
    public static final SubLSymbol $pph_term_paraphrase_blacklist$ = makeSymbol("*PPH-TERM-PARAPHRASE-BLACKLIST*");

    // defparameter
    // LISTP of lexical assertions that should not be used in paraphrase
    public static final SubLSymbol $pph_lexical_assertion_blacklist$ = makeSymbol("*PPH-LEXICAL-ASSERTION-BLACKLIST*");

    // defparameter
    /**
     * LISTP of grammatically encoded domain restriction types; should be equivalent
     * to: (all-instances #$GrammaticallyEncodedDomainRestrictionType
     * pph-language-mt*)
     */
    public static final SubLSymbol $pph_basic_var_types$ = makeSymbol("*PPH-BASIC-VAR-TYPES*");

    // defparameter
    public static final SubLSymbol $pph_use_basic_var_typesP$ = makeSymbol("*PPH-USE-BASIC-VAR-TYPES?*");

    // defparameter
    /**
     * BOOLEAN; shall we try to put the correct determiner before variables, too?
     */
    public static final SubLSymbol $determiners_before_variables$ = makeSymbol("*DETERMINERS-BEFORE-VARIABLES*");

    // defparameter
    // LISTP of  punctuation strings to *never* add to a paraphrase
    public static final SubLSymbol $pph_suppressed_final_punctuation_strings$ = makeSymbol("*PPH-SUPPRESSED-FINAL-PUNCTUATION-STRINGS*");

    // defparameter
    // BOOLEAN; When trying to be precise, should we expand expandable formulas?
    public static final SubLSymbol $pph_use_expansions_for_precisionP$ = makeSymbol("*PPH-USE-EXPANSIONS-FOR-PRECISION?*");

    // defparameter
    // BOOLEAN; Should we try to simplify conjunctions into fewer clauses?
    public static final SubLSymbol $pph_reduce_conjunctionsP$ = makeSymbol("*PPH-REDUCE-CONJUNCTIONS?*");

    // defparameter
    /**
     * BOOLEAN; When paraphrasing an implication as a query formula, should we
     * consider the antecedent to be hypothesized, or part of the query?
     */
    public static final SubLSymbol $pph_query_antecedents_are_hypothesizedP$ = makeSymbol("*PPH-QUERY-ANTECEDENTS-ARE-HYPOTHESIZED?*");

    // defparameter
    /**
     * BOOLEAN; When paraphrasing do special handling of hypotheticals, paraphrasing
     * them as the original variable from the hypothetical query.
     */
    public static final SubLSymbol $pph_handle_hypotheticalsP$ = makeSymbol("*PPH-HANDLE-HYPOTHETICALS?*");

    // defparameter
    // BOOLEAN; Should we capitalize the output like a book, etc., title?
    public static final SubLSymbol $pph_use_title_capitalizationP$ = makeSymbol("*PPH-USE-TITLE-CAPITALIZATION?*");

    // defparameter
    // Should we try to print 6 x 10^4 instead of 6E4?
    public static final SubLSymbol $pph_expand_e_notation_for_floatsP$ = makeSymbol("*PPH-EXPAND-E-NOTATION-FOR-FLOATS?*");

    // defparameter
    /**
     * BOOLEAN; Should the paraphrase code 'intelligently' add quantification for
     * variables that look like they need it?
     */
    public static final SubLSymbol $pph_quantify_varsP$ = makeSymbol("*PPH-QUANTIFY-VARS?*");

    // defparameter
    // BOOLEANP; Should we skip the 'For every X, Y, and Z'?
    public static final SubLSymbol $pph_hide_explicit_universalsP$ = makeSymbol("*PPH-HIDE-EXPLICIT-UNIVERSALS?*");

    // defparameter
    // BINDING-LIST-P of (EL-VAR -> Hypothetical constant) mappings
    public static final SubLSymbol $pph_hypothetical_vars$ = makeSymbol("*PPH-HYPOTHETICAL-VARS*");

    // defparameter
    /**
     * BOOLEAN; Should the paraphrase code 'intelligently' use NL phrases for
     * variables that look like they need it?
     */
    public static final SubLSymbol $pph_use_smart_variable_replacementP$ = makeSymbol("*PPH-USE-SMART-VARIABLE-REPLACEMENT?*");

    // defparameter
    /**
     * When traversing the genl-preds hierarchy looking for alternative preds with
     * which to paraphrase the input, stop looking after you've looked this many
     * times -- then meaning starts getting lost.
     */
    public static final SubLSymbol $pph_search_limit$ = makeSymbol("*PPH-SEARCH-LIMIT*");

    // defparameter
    public static final SubLSymbol $register_vars_by_arg_constraintsP$ = makeSymbol("*REGISTER-VARS-BY-ARG-CONSTRAINTS?*");

    // defparameter
    // Recursively descend into formulas, registering exception vars
    public static final SubLSymbol $pph_register_exception_vars_recursivelyP$ = makeSymbol("*PPH-REGISTER-EXCEPTION-VARS-RECURSIVELY?*");

    // defparameter
    /**
     * :UNKNOWN or cycl-denotational-term-p; Stores the identity of the addressee of
     * NL produced by the PPH system.
     */
    public static final SubLSymbol $pph_addressee$ = makeSymbol("*PPH-ADDRESSEE*");

    // defparameter
    /**
     * :UNKNOWN or cycl-denotational-term-p; Stores the identity of the speaker of
     * NL produced by the PPH system.
     */
    public static final SubLSymbol $pph_speaker$ = makeSymbol("*PPH-SPEAKER*");

    // defparameter
    // boolean; Should we check string frequencies during paraphrase?
    public static final SubLSymbol $pph_use_online_string_frequenciesP$ = makeSymbol("*PPH-USE-ONLINE-STRING-FREQUENCIES?*");

    // defparameter
    /**
     * When we have no principled basis for a choice, do we choose arbitrarily, or
     * randomly? Possible values: :ARBITRARY, :RANDOM
     */
    public static final SubLSymbol $pph_ceteris_paribus_choice_method$ = makeSymbol("*PPH-CETERIS-PARIBUS-CHOICE-METHOD*");

    // defparameter
    public static final SubLSymbol $pph_top_level_demerits$ = makeSymbol("*PPH-TOP-LEVEL-DEMERITS*");

    // defparameter
    /**
     * NON-NEGATIVE-POTENTIALLY-INFINITE-NUMBER-P; What is the worst paraphase
     * quality we should tolerate before returning NIL instead of a string. Default
     * is to consider any string better than nothing. See @xref
     * PPH-SUGGESTED-DEMERIT-CUTOFF* for a middle-of-the-road value.
     */
    public static final SubLSymbol $pph_demerit_cutoff$ = makeSymbol("*PPH-DEMERIT-CUTOFF*");

    // defconstant
    // A suggested value for filtering the paraphrase chaff from the wheat
    public static final SubLSymbol $pph_suggested_demerit_cutoff$ = makeSymbol("*PPH-SUGGESTED-DEMERIT-CUTOFF*");

    // defparameter
    // Do we allow coercion of word forms, such as mass from count?
    public static final SubLSymbol $pph_allow_word_form_coercionP$ = makeSymbol("*PPH-ALLOW-WORD-FORM-COERCION?*");

    // defparameter
    /**
     * positive-potentially-infinite-integer-p; max number of digits a number can
     * have and still generate with no commas. (POSITIVE-INFINITY) means don't put
     * in any commas
     */
    public static final SubLSymbol $pph_max_no_comma_length$ = makeSymbol("*PPH-MAX-NO-COMMA-LENGTH*");

    // defparameter
    /**
     * How many significant digits of numbers should we display? (POSITIVE-INFINITY)
     * = show them all.
     */
    public static final SubLSymbol $pph_significant_digits_cutoff$ = makeSymbol("*PPH-SIGNIFICANT-DIGITS-CUTOFF*");

    // defparameter
    // Should we try to point out type-level violations via paraphrase?
    public static final SubLSymbol $pph_show_type_level_violationsP$ = makeSymbol("*PPH-SHOW-TYPE-LEVEL-VIOLATIONS?*");

    // defparameter
    public static final SubLSymbol $pph_type_level_violations$ = makeSymbol("*PPH-TYPE-LEVEL-VIOLATIONS*");

    // defparameter
    public static final SubLSymbol $pph_name_string_preds$ = makeSymbol("*PPH-NAME-STRING-PREDS*");

    // defparameter
    // Should the PPH code warn when it finds something irrelevant?
    public static final SubLSymbol $pph_irrelevant_warnP$ = makeSymbol("*PPH-IRRELEVANT-WARN?*");

    // defparameter
    /**
     * The inference answer for which we're currently paraphrasing bindings,
     * justifications, etc.
     */
    public static final SubLSymbol $pph_inference_answer$ = makeSymbol("*PPH-INFERENCE-ANSWER*");

    // defparameter
    public static final SubLSymbol $pph_paraphrase_to_justify$ = makeSymbol("*PPH-PARAPHRASE-TO-JUSTIFY*");



    // defparameter
    /**
     * Whether to allow UTF8 when paraphrasing in :text node. This is particularly
     * useful for paraphrasing CycL that uses UnicodeStringFn.
     */
    public static final SubLSymbol $allow_utf8_in_pph_text_mode$ = makeSymbol("*ALLOW-UTF8-IN-PPH-TEXT-MODE*");

    // defparameter
    // Should we use #$salientURL information for links?
    public static final SubLSymbol $pph_use_salient_urlP$ = makeSymbol("*PPH-USE-SALIENT-URL?*");





    // defparameter
    /**
     * Should we deprecate source citations that don't use the new system?
     *
     * @see PPH-HTML-CITATION-STRING-INT
     */
    public static final SubLSymbol $pph_deprecate_old_source_citation_formatP$ = makeSymbol("*PPH-DEPRECATE-OLD-SOURCE-CITATION-FORMAT?*");

    // defparameter
    /**
     * Should hyperlinks be added to text that is a paraphrase of the arg0 of a
     * formula?
     */
    public static final SubLSymbol $pph_link_arg0P$ = makeSymbol("*PPH-LINK-ARG0?*");

    // defparameter
    // Should unlinked phrases be linked to the matrix arg0?
    public static final SubLSymbol $pph_link_unlinked_phrases_to_matrix_arg0P$ = makeSymbol("*PPH-LINK-UNLINKED-PHRASES-TO-MATRIX-ARG0?*");

    // defparameter
    /**
     * Should we link as much of the input CycL to output strings as we can? The
     * tradeoff for this is typically terseness and readability.
     */
    public static final SubLSymbol $pph_maximize_linksP$ = makeSymbol("*PPH-MAXIMIZE-LINKS?*");

    // defparameter
    public static final SubLSymbol $pph_consolidate_output_list_for_natP$ = makeSymbol("*PPH-CONSOLIDATE-OUTPUT-LIST-FOR-NAT?*");

    // defparameter
    /**
     * When we paraphrase a term, will neighboring words that belong to the same
     * element in the CycL be returned as a single consolidated item, or will each
     * word be a separate item in the javalist
     */
    public static final SubLSymbol $pph_consolidate_javalistsP$ = makeSymbol("*PPH-CONSOLIDATE-JAVALISTS?*");

    // defparameter
    public static final SubLSymbol $pph_use_showXhideP$ = makeSymbol("*PPH-USE-SHOW/HIDE?*");

    // defparameter
    // When non-nil, CycL is used for unlexified terms.
    public static final SubLSymbol $rkf_use_cycl_for_unlexified_termsP$ = makeSymbol("*RKF-USE-CYCL-FOR-UNLEXIFIED-TERMS?*");

    // defparameter
    // When non-nil, use CB-UIA display methods for paraphrase output
    public static final SubLSymbol $pph_use_cb_uia_display_methodsP$ = makeSymbol("*PPH-USE-CB-UIA-DISPLAY-METHODS?*");

    // defparameter
    // When non-nil, noun generation is used to generate terms.
    public static final SubLSymbol $rkf_prefer_nouns_for_termsP$ = makeSymbol("*RKF-PREFER-NOUNS-FOR-TERMS?*");

    // defparameter
    // When non-nil, paraphrase templates for genl-preds can be used.
    public static final SubLSymbol $rkf_use_genl_preds_for_paraphraseP$ = makeSymbol("*RKF-USE-GENL-PREDS-FOR-PARAPHRASE?*");

    // deflexical
    // LISTP of parameters that affect paraphrase code behavior
    private static final SubLSymbol $pph_control_parameters$ = makeSymbol("*PPH-CONTROL-PARAMETERS*");

    // defconstant
    // How many records do we keep around?
    private static final SubLSymbol $pph_max_param_records$ = makeSymbol("*PPH-MAX-PARAM-RECORDS*");

    // defparameter
    /**
     * A list of records of the latest (thread-specific) snapshot of parameter
     * values.
     */
    public static final SubLSymbol $pph_latest_parameters$ = makeSymbol("*PPH-LATEST-PARAMETERS*");

    // defconstant
    private static final SubLSymbol $pph_quantifiers$ = makeSymbol("*PPH-QUANTIFIERS*");



    // defconstant
    public static final SubLSymbol $pph_blank_string$ = makeSymbol("*PPH-BLANK-STRING*");

    // deflexical
    public static final SubLSymbol $gen_template_store_lock$ = makeSymbol("*GEN-TEMPLATE-STORE-LOCK*");

    // defparameter
    // PPH-PHRASE-P or nil, the last full sentence to have been parsed.
    public static final SubLSymbol $last_pph_sentence$ = makeSymbol("*LAST-PPH-SENTENCE*");

    // defparameter
    // dictionary: fn -> mts
    public static final SubLSymbol $pph_phrase_fns$ = makeSymbol("*PPH-PHRASE-FNS*");



    // defparameter
    /**
     * nested list of all cycl expressions we're parphrasing. The most local one is
     * first, most global last.
     */
    public static final SubLSymbol $pph_cycls$ = makeSymbol("*PPH-CYCLS*");

    // defparameter
    public static final SubLSymbol $pph_root_phrase$ = makeSymbol("*PPH-ROOT-PHRASE*");

    // defparameter
    public static final SubLSymbol $bypass_pph_phrase_destroyerP$ = makeSymbol("*BYPASS-PPH-PHRASE-DESTROYER?*");

    // defparameter
    /**
     * PPH-DRS-P (or NIL) containing reference markers (PPH-RMs) for cycl already
     * paraphrased in the current discourse context.
     */
    public static final SubLSymbol $pph_discourse_context$ = makeSymbol("*PPH-DISCOURSE-CONTEXT*");

    // defparameter
    /**
     * BOOLEAN; Should we keep track of which entities have been referred to? This
     * enables generation of anaphors in some cases.
     */
    public static final SubLSymbol $pph_track_discourse_referentsP$ = makeSymbol("*PPH-TRACK-DISCOURSE-REFERENTS?*");

    // defparameter
    // Mapping of EL-VAR? keys to PPH-VAR-ENTRY-P values.
    public static final SubLSymbol $pph_var_types$ = makeSymbol("*PPH-VAR-TYPES*");

    // defparameter
    /**
     * A record of type information for variables, not necessarily used to
     * paraphrase them.
     */
    public static final SubLSymbol $pph_noted_var_types$ = makeSymbol("*PPH-NOTED-VAR-TYPES*");

    // defparameter
    public static final SubLSymbol $pph_possibly_binding_variables_counter$ = makeSymbol("*PPH-POSSIBLY-BINDING-VARIABLES-COUNTER*");

    // defparameter
    // Are we in a mode in which query vars get WH paraphrase?
    public static final SubLSymbol $pph_use_wh_for_query_varsP$ = makeSymbol("*PPH-USE-WH-FOR-QUERY-VARS?*");

    // defparameter
    /**
     * What unexpressed negations are floating around? A list of positions in the
     * top level cycl.
     */
    public static final SubLSymbol $pph_unexpressed_negations$ = makeSymbol("*PPH-UNEXPRESSED-NEGATIONS*");

    // defparameter
    // BOOLEAN; Should we allow contractions such as 'isn't'?
    public static final SubLSymbol $pph_allow_contractionsP$ = makeSymbol("*PPH-ALLOW-CONTRACTIONS?*");

    // defparameter
    // BOOLEAN; Should we use 'whom' where we think it is appropriate?
    public static final SubLSymbol $pph_use_whomP$ = makeSymbol("*PPH-USE-WHOM?*");

    // defparameter
    /**
     * Should we capitalize FALSE in 'Is it false that...' to make it more obvious?
     */
    public static final SubLSymbol $pph_capitalize_false_stringP$ = makeSymbol("*PPH-CAPITALIZE-FALSE-STRING?*");

    // defparameter
    // Do we keep generic args as-is, or try to replace them?
    public static final SubLSymbol $pph_keep_generic_argsP$ = makeSymbol("*PPH-KEEP-GENERIC-ARGS?*");

    // defparameter
    public static final SubLSymbol $pph_resolve_bindings_phrasesP$ = makeSymbol("*PPH-RESOLVE-BINDINGS-PHRASES?*");

    // defparameter
    public static final SubLSymbol $verbose_print_pph_phrasesP$ = makeSymbol("*VERBOSE-PRINT-PPH-PHRASES?*");

    // defparameter
    public static final SubLSymbol $pph_formula_for_generic_arg_replacement$ = makeSymbol("*PPH-FORMULA-FOR-GENERIC-ARG-REPLACEMENT*");

    // defparameter
    /**
     * The value is the level of recursive calls to the function
     * PPH-PHRASE-GENERATE. 0 means no calls, 1 is a top-level call, integers
     * greater than one indicate that level of recursion.
     */
    public static final SubLSymbol $generation_level$ = makeSymbol("*GENERATION-LEVEL*");

    // defparameter
    /**
     * Phrases that should be linked to an arg0 use this to determine its identity.
     */
    public static final SubLSymbol $pph_current_arg0_position$ = makeSymbol("*PPH-CURRENT-ARG0-POSITION*");

    // defparameter
    /**
     * Phrases that should be linked to an arg0 use this to determine its identity.
     */
    public static final SubLSymbol $pph_current_arg0$ = makeSymbol("*PPH-CURRENT-ARG0*");

    // defparameter
    // Possible values - :OFF, :QUIET, :DEBUG
    public static final SubLSymbol $pph_problem_reporting_mode$ = makeSymbol("*PPH-PROBLEM-REPORTING-MODE*");

    // defparameter
    /**
     * Bound to DICTIONARY-P of reporter -> (list of PPH-PROBLEM-P) when we want to
     * gather problem reports.
     */
    public static final SubLSymbol $pph_problem_reports$ = makeSymbol("*PPH-PROBLEM-REPORTS*");

    // defparameter
    /**
     * BOOLEANP; When copying PPH phrases, should we use the original relative agr
     * targets, as opposed to constructing new copies of them? Cf. bug 9900.
     */
    public static final SubLSymbol $pph_retain_original_relative_targetsP$ = makeSymbol("*PPH-RETAIN-ORIGINAL-RELATIVE-TARGETS?*");

    // defparameter
    public static final SubLSymbol $meter_pph_queriesP$ = makeSymbol("*METER-PPH-QUERIES?*");

    // defparameter
    public static final SubLSymbol $meter_pph_gaf_paraphraseP$ = makeSymbol("*METER-PPH-GAF-PARAPHRASE?*");

    // defparameter
    public static final SubLSymbol $retain_pph_queriesP$ = makeSymbol("*RETAIN-PPH-QUERIES?*");



    // defparameter
    /**
     * BOOLEANP; If we try to apply a template to something to which is does not
     * apply, should we throw an error?
     */
    public static final SubLSymbol $pph_error_on_bad_templatesP$ = makeSymbol("*PPH-ERROR-ON-BAD-TEMPLATES?*");

    // defconstant
    /**
     * We use this when *PPH-ERROR-ON-BAD-TEMPLATES?* is NIL, applying the 'bad'
     * template to it and then substituting in the real formula.
     */
    public static final SubLSymbol $pph_bad_template_dummy$ = makeSymbol("*PPH-BAD-TEMPLATE-DUMMY*");

    // defparameter
    // LISTP of proofs that are non-explanatory, and should not be displayed.
    public static final SubLSymbol $pph_non_explanatory_proofs$ = makeSymbol("*PPH-NON-EXPLANATORY-PROOFS*");

    // defparameter
    public static final SubLSymbol $pph_show_meta_supports_with_supportsP$ = makeSymbol("*PPH-SHOW-META-SUPPORTS-WITH-SUPPORTS?*");

    // defparameter
    public static final SubLSymbol $pph_show_assert_info_with_assertionsP$ = makeSymbol("*PPH-SHOW-ASSERT-INFO-WITH-ASSERTIONS?*");

    // defparameter
    // BOOLEANP; Should we display the 'Facts Used' section of the summary?
    public static final SubLSymbol $pph_proof_show_facts_usedP$ = makeSymbol("*PPH-PROOF-SHOW-FACTS-USED?*");

    // defparameter
    /**
     * INTEGERP or NIL; How many levels down the proof tree below the top level do
     * we want to go looking?
     */
    public static final SubLSymbol $pph_proof_show_facts_depth_cutoff$ = makeSymbol("*PPH-PROOF-SHOW-FACTS-DEPTH-CUTOFF*");

    // defparameter
    public static final SubLSymbol $pph_proof_include_phrase_linksP$ = makeSymbol("*PPH-PROOF-INCLUDE-PHRASE-LINKS?*");

    // defparameter
    /**
     * Should we display trivial proofs (marked as such), as opposed to omitting
     * them altogether?
     */
    public static final SubLSymbol $pph_show_trivial_proofsP$ = makeSymbol("*PPH-SHOW-TRIVIAL-PROOFS?*");

    // defparameter
    /**
     * LISTP of proofs that are displayed in a different place from their actual
     * place in the proof tree.
     */
    public static final SubLSymbol $pph_repositioned_proofs$ = makeSymbol("*PPH-REPOSITIONED-PROOFS*");

    // defparameter
    /**
     * STACK-P (when bound) of proofs that have been displayed, so we can avoiding
     * displaying them more than once.
     */
    public static final SubLSymbol $pph_displayed_proofs$ = makeSymbol("*PPH-DISPLAYED-PROOFS*");

    // defparameter
    /**
     * SET-P (when bound) of proofs that have been justified, so we can avoiding
     * justifying them more than once.
     */
    public static final SubLSymbol $pph_justified_proofs$ = makeSymbol("*PPH-JUSTIFIED-PROOFS*");

    // defparameter
    /**
     * LISTP of supports that have been displayed, so we can avoiding displaying
     * them more than once.
     */
    public static final SubLSymbol $pph_displayed_supports$ = makeSymbol("*PPH-DISPLAYED-SUPPORTS*");

    // deflexical
    // Record of forward rules used in justifications
    public static final SubLSymbol $rules_used_in_quasi_transformation_proofs$ = makeSymbol("*RULES-USED-IN-QUASI-TRANSFORMATION-PROOFS*");

    // defparameter
    public static final SubLSymbol $pph_proof_depth$ = makeSymbol("*PPH-PROOF-DEPTH*");

    // defconstant
    // The proof depth at the top level of a proof justification
    public static final SubLSymbol $pph_top_level_proof_depth$ = makeSymbol("*PPH-TOP-LEVEL-PROOF-DEPTH*");

    // defparameter
    public static final SubLSymbol $validate_proof_supportsP$ = makeSymbol("*VALIDATE-PROOF-SUPPORTS?*");

    // defparameter
    public static final SubLSymbol $pph_phrase_methods$ = makeSymbol("*PPH-PHRASE-METHODS*");





    public static final SubLString $str2$_a_ = makeString("<a>");

    public static final SubLString $str3$_a_ = makeString("<a ");



    private static final SubLSymbol $TOP_LEVEL_ONLY = makeKeyword("TOP-LEVEL-ONLY");



    public static final SubLSymbol $sym7$_PPH_TERSE_MODE__ = makeSymbol("*PPH-TERSE-MODE?*");



    private static final SubLObject $$ParaphraseLanguageMt = reader_make_constant_shell(makeString("ParaphraseLanguageMt"));

    private static final SubLSymbol PPH_LANGUAGE_MT = makeSymbol("PPH-LANGUAGE-MT");

    private static final SubLObject $$ParaphraseDomainMt = reader_make_constant_shell(makeString("ParaphraseDomainMt"));

    private static final SubLSymbol PPH_DOMAIN_MT = makeSymbol("PPH-DOMAIN-MT");

    private static final SubLList $list13 = list(reader_make_constant_shell(makeString("Agent-Generic")), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("Place")), reader_make_constant_shell(makeString("TimeInterval")), reader_make_constant_shell(makeString("Time-Quantity")), reader_make_constant_shell(makeString("Event")), reader_make_constant_shell(makeString("ScalarInterval")));





    private static final SubLString $str16$Too_many_demerits___S = makeString("Too many demerits: ~S");

    private static final SubLSymbol CB_CF = makeSymbol("CB-CF");

    public static final SubLSymbol $constant_link_function$ = makeSymbol("*CONSTANT-LINK-FUNCTION*");

    private static final SubLSymbol $sym19$_ALLOW_UTF8_IN_PPH_TEXT_MODE_ = makeSymbol("*ALLOW-UTF8-IN-PPH-TEXT-MODE*");

    private static final SubLSymbol $sym20$_PPH_USE_SALIENT_URL__ = makeSymbol("*PPH-USE-SALIENT-URL?*");

    private static final SubLString $str21$_self = makeString("_self");

    public static final SubLSymbol $html_generation_target$ = makeSymbol("*HTML-GENERATION-TARGET*");

    private static final SubLSymbol GET_TERM_ID = makeSymbol("GET-TERM-ID");

    public static final SubLSymbol $html_generation_term_id_function$ = makeSymbol("*HTML-GENERATION-TERM-ID-FUNCTION*");

    private static final SubLSymbol $sym25$_PPH_DEPRECATE_OLD_SOURCE_CITATION_FORMAT__ = makeSymbol("*PPH-DEPRECATE-OLD-SOURCE-CITATION-FORMAT?*");

    public static final SubLList $list26 = list(new SubLObject[]{ makeSymbol("*USE-PARENTHETICAL-DISAMBIGUATIONS?*"), makeSymbol("*PPH-USE-BULLETED-LISTS?*"), makeSymbol("*PPH-USE-INDEXICAL-DATES?*"), makeSymbol("*SELECT-STRING-METHODS-TO-OMIT*"), makeSymbol("*PPH-GUESS-NAMES-FOR-UNLEXIFIED-TERMS?*"), makeSymbol("*PPH-INTRODUCE-ANAPHORS?*"), makeSymbol("*PPH-BLANKS-FOR-VARS?*"), makeSymbol("*PPH-SUPPRESSED-FINAL-PUNCTUATION-STRINGS*"), makeSymbol("*PPH-QUERY-ANTECEDENTS-ARE-HYPOTHESIZED?*"), makeSymbol("*THE-CYCLIST*"), makeSymbol("*PPH-USE-TITLE-CAPITALIZATION?*"), makeSymbol("*PARAPHRASE-PRECISION*"), makeSymbol("*PPH-TERSE-MODE?*"), makeSymbol("*PPH-USE-EXPANSIONS-FOR-PRECISION?*"), makeSymbol("*PARAPHRASE-MODE*"), makeSymbol("*PPH-LANGUAGE-MT*"), makeSymbol("*PPH-DOMAIN-MT*"), makeSymbol("*PPH-TERM-PARAPHRASE-MAP*"), makeSymbol("*DETERMINERS-BEFORE-VARIABLES*"), makeSymbol("*PPH-QUANTIFY-VARS?*"), makeSymbol("*PPH-HIDE-EXPLICIT-UNIVERSALS?*"), makeSymbol("*PPH-EXPAND-E-NOTATION-FOR-FLOATS?*"), makeSymbol("*PPH-CURRENT-ARG0*"), makeSymbol("*PPH-CURRENT-ARG0-POSITION*"), makeSymbol("*PPH-HYPOTHETICAL-VARS*"), makeSymbol("*PPH-USE-SMART-VARIABLE-REPLACEMENT?*"), makeSymbol("*PPH-SEARCH-LIMIT*"), makeSymbol("*REGISTER-VARS-BY-ARG-CONSTRAINTS?*"), makeSymbol("*PPH-ADDRESSEE*"), makeSymbol("*PPH-SPEAKER*"), makeSymbol("*PPH-USE-ONLINE-STRING-FREQUENCIES?*"), makeSymbol("*PPH-DEMERIT-CUTOFF*"), makeSymbol("*PPH-ALLOW-WORD-FORM-COERCION?*"), makeSymbol("*PPH-MAX-NO-COMMA-LENGTH*"), makeSymbol("*PPH-SIGNIFICANT-DIGITS-CUTOFF*"), makeSymbol("*PPH-SHOW-TYPE-LEVEL-VIOLATIONS?*"), makeSymbol("*CONSTANT-LINK-FUNCTION*"), makeSymbol("*HTML-GENERATION-TARGET*"), makeSymbol("*HTML-GENERATION-TERM-ID-FUNCTION*"), makeSymbol("*PPH-LINK-ARG0?*"), makeSymbol("*PPH-MAXIMIZE-LINKS?*"), makeSymbol("*PPH-USE-SHOW/HIDE?*"), makeSymbol("*RKF-USE-CYCL-FOR-UNLEXIFIED-TERMS?*"), makeSymbol("*RKF-PREFER-NOUNS-FOR-TERMS?*"), makeSymbol("*RKF-USE-GENL-PREDS-FOR-PARAPHRASE?*"), makeSymbol("*PPH-INFERENCE-ANSWER*") });



    private static final SubLList $list28 = list(makeSymbol("PARAM"), makeSymbol("LATEST-VALUE"));

    public static final SubLList $list29 = list(makeKeyword("UNIVERSAL"), makeKeyword("EXISTENTIAL"), makeKeyword("NO"), makeKeyword("SCOPED"), makeKeyword("QUERY"));

    private static final SubLList $list30 = list(makeSymbol("SCOPE-TYPE"), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol PPH_CHECK_TYPE = makeSymbol("PPH-CHECK-TYPE");

    public static final SubLList $list33 = list(makeSymbol("PPH-QUANTIFIER-KEYWORD-P"));



    public static final SubLSymbol $pph_operator_scope_context$ = makeSymbol("*PPH-OPERATOR-SCOPE-CONTEXT*");



    private static final SubLList $list37 = list(makeSymbol("*PPH-OPERATOR-SCOPE-CONTEXT*"));



    private static final SubLString $str39$Inside_operator_scope__S = makeString("Inside operator scope ~S");

    private static final SubLString $str40$Leaving_operator_scope__S = makeString("Leaving operator scope ~S");





    private static final SubLString $str43$______ = makeString("______");

    private static final SubLString $str44$Gen_Template_Store_Lock = makeString("Gen-Template Store Lock");

    public static final SubLSymbol $pph_data_structures_code_revision$ = makeSymbol("*PPH-DATA-STRUCTURES-CODE-REVISION*");



    private static final SubLString $str47$Noting_unexpressed_negation_from_ = makeString("Noting unexpressed negation from ~S");

    private static final SubLString $str48$Assuming_we_just_expressed_the_ne = makeString("Assuming we just expressed the negation of ~S");

    private static final SubLString $str49$Supposedly_expressed_negation_of_ = makeString("Supposedly expressed negation of ~S,~% but didn't realize that it was unexpressed.");



    private static final SubLList $list51 = list(ZERO_INTEGER);





    private static final SubLSymbol WARN_ABOUT_PPH_QUERY_RETENTION = makeSymbol("WARN-ABOUT-PPH-QUERY-RETENTION");

    private static final SubLString $str55$Retain_PPH_queries_is__S_for__S = makeString("Retain PPH queries is ~S for ~S");

    private static final SubLSymbol $warn_about_pph_query_retention_caching_state$ = makeSymbol("*WARN-ABOUT-PPH-QUERY-RETENTION-CACHING-STATE*");

    private static final SubLSymbol $PPH_BAD_TEMPLATE_DUMMY = makeKeyword("PPH-BAD-TEMPLATE-DUMMY");





    private static final SubLString $str60$_PPH_error_level_ = makeString("(PPH error level ");

    private static final SubLString $str61$__ = makeString(") ");

    private static final SubLString $str62$No_KB_loaded__Couldn_t_initialize = makeString("No KB loaded. Couldn't initialize paraphrase vars.");

    private static final SubLSymbol $NO_KB_LOADED = makeKeyword("NO-KB-LOADED");

    private static final SubLList $list64 = list(makeString("CyclishParaphraseMt"), makeString("EnglishParaphraseMt"), makeString("BaseKB"));

    private static final SubLObject $$MtUnionFn = reader_make_constant_shell(makeString("MtUnionFn"));

    private static final SubLObject $$MtSpace = reader_make_constant_shell(makeString("MtSpace"));

    private static final SubLList $list67 = list(list(reader_make_constant_shell(makeString("MtTimeDimFn")), reader_make_constant_shell(makeString("Now"))));

    public static SubLObject pph_generate_alternative_phrasesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(($NONE != $pph_alternative_phrase_generation_level$.getDynamicValue(thread)) && (($TOP_LEVEL_ONLY != $pph_alternative_phrase_generation_level$.getDynamicValue(thread)) || (NIL != pph_at_top_levelP())));
    }

    public static SubLObject pph_at_top_levelP() {
        return numLE(current_generation_level(), ONE_INTEGER);
    }

    public static SubLObject pph_generate_morphological_alternativesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eq($ALL, $pph_alternative_phrase_generation_level$.getDynamicValue(thread));
    }

    public static SubLObject pph_generate_nested_alternativesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(($NONE != $pph_alternative_phrase_generation_level$.getDynamicValue(thread)) && ($TOP_LEVEL_ONLY != $pph_alternative_phrase_generation_level$.getDynamicValue(thread)));
    }

    public static SubLObject definite_description_licensed_for_termP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(v_term, $definite_description_licensed_terms$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject pph_language_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $pph_language_mt$.getDynamicValue(thread);
    }

    public static SubLObject pph_domain_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $pph_domain_mt$.getDynamicValue(thread);
    }

    public static SubLObject pph_blacklist_active_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return consp($pph_term_paraphrase_blacklist$.getDynamicValue(thread));
    }

    public static SubLObject pph_forbidden_string_for_termP(final SubLObject v_term, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != list_utilities.alist_p($pph_term_paraphrase_blacklist$.getDynamicValue(thread))) && (NIL != pph_phrase.pph_known_cycl_p(v_term))) && (NIL != member(string, list_utilities.alist_lookup($pph_term_paraphrase_blacklist$.getDynamicValue(thread), v_term, symbol_function(EQUAL), NIL), symbol_function(EQUALP), UNPROVIDED)));
    }

    public static SubLObject pph_forbidden_lexical_assertionP(final SubLObject lexical_assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != list_utilities.member_eqP(lexical_assertion, $pph_lexical_assertion_blacklist$.getDynamicValue(thread))) || (NIL != lexicon_accessors.inappropriate_lexical_assertionP(lexical_assertion)));
    }

    public static SubLObject pph_failure_is_an_option_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return number_utilities.potentially_infinite_number_L($pph_demerit_cutoff$.getDynamicValue(thread), number_utilities.positive_infinity());
    }

    public static SubLObject pph_too_many_demerits_p(final SubLObject demerits, SubLObject cutoff) {
        if (cutoff == UNPROVIDED) {
            cutoff = $pph_demerit_cutoff$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject too_manyP = number_utilities.potentially_infinite_number_G(demerits, cutoff);
        if (((NIL != too_manyP) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
            Errors.warn($str16$Too_many_demerits___S, demerits);
            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return too_manyP;
    }

    public static SubLObject pph_link_unlinked_phrases_to_matrix_arg0P() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean($pph_link_unlinked_phrases_to_matrix_arg0P$.getDynamicValue(thread));
    }

    public static SubLObject pph_maximize_linksP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean($pph_maximize_linksP$.getDynamicValue(thread));
    }

    public static SubLObject pph_current_parameters(SubLObject check_latestP) {
        if (check_latestP == UNPROVIDED) {
            check_latestP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != check_latestP) {
            SubLObject cdolist_list_var = $pph_latest_parameters$.getDynamicValue(thread);
            SubLObject record = NIL;
            record = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != pph_params_currentP(record)) {
                    $pph_latest_parameters$.setDynamicValue(list_utilities.nmove_to_front(record, $pph_latest_parameters$.getDynamicValue(thread), symbol_function(EQUAL)), thread);
                    return record;
                }
                cdolist_list_var = cdolist_list_var.rest();
                record = cdolist_list_var.first();
            } 
        }
        return pph_new_parameter_snapshot();
    }

    public static SubLObject pph_new_parameter_snapshot() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject params = list_utilities.remove_if_not(symbol_function(BOUNDP), $pph_control_parameters$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = params;
        SubLObject param = NIL;
        param = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject value = pph_param_value(param);
            ans = cons(list(param, value), ans);
            cdolist_list_var = cdolist_list_var.rest();
            param = cdolist_list_var.first();
        } 
        if (NIL == subl_promotions.memberP(ans, $pph_latest_parameters$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED)) {
            $pph_latest_parameters$.setDynamicValue(cons(ans, $pph_latest_parameters$.getDynamicValue(thread)), thread);
            if (NIL != list_utilities.lengthG($pph_latest_parameters$.getDynamicValue(thread), $pph_max_param_records$.getGlobalValue(), UNPROVIDED)) {
                $pph_latest_parameters$.setDynamicValue(list_utilities.first_n($pph_max_param_records$.getGlobalValue(), $pph_latest_parameters$.getDynamicValue(thread)), thread);
            }
        }
        return ans;
    }

    public static SubLObject pph_params_currentP(final SubLObject record) {
        SubLObject mismatchP = NIL;
        if (NIL == mismatchP) {
            SubLObject csome_list_var = record;
            SubLObject pair = NIL;
            pair = csome_list_var.first();
            while ((NIL == mismatchP) && (NIL != csome_list_var)) {
                SubLObject current;
                final SubLObject datum = current = pair;
                SubLObject param = NIL;
                SubLObject latest_value = NIL;
                destructuring_bind_must_consp(current, datum, $list28);
                param = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list28);
                latest_value = current.first();
                current = current.rest();
                if (NIL == current) {
                    final SubLObject current_value = pph_param_value(param);
                    if (!latest_value.equal(current_value)) {
                        mismatchP = T;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list28);
                }
                csome_list_var = csome_list_var.rest();
                pair = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == mismatchP);
    }

    public static SubLObject pph_param_value(final SubLObject param) {
        return symbol_value(param);
    }

    public static SubLObject pph_quantifier_keyword_p(final SubLObject obj) {
        return subl_promotions.memberP(obj, $pph_quantifiers$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_quantifier_keywords() {
        return $pph_quantifiers$.getGlobalValue();
    }

    public static SubLObject with_pph_operator_scope(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject scope_type = NIL;
        destructuring_bind_must_consp(current, datum, $list30);
        scope_type = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(PPH_CHECK_TYPE, scope_type, $list33), listS(CLET, list(list($pph_operator_scope_context$, listS(CONS, scope_type, $list37))), list(PPH_NOTE, ONE_INTEGER, $str39$Inside_operator_scope__S, scope_type), append(body, list(list(PPH_NOTE, ONE_INTEGER, $str40$Leaving_operator_scope__S, scope_type)))));
    }

    public static SubLObject pph_inside_negation_scope_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP($NO, $pph_operator_scope_context$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_inside_downward_entailing_environmentP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != subl_promotions.memberP($NO, $pph_operator_scope_context$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) || (NIL != subl_promotions.memberP($IMPLIES, $pph_operator_scope_context$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject pph_top_level_cycl() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.last_one($pph_cycls$.getDynamicValue(thread));
    }

    public static SubLObject pph_current_cycl() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $pph_cycls$.getDynamicValue(thread).first();
    }

    public static SubLObject pph_tracking_var_types_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return misc_utilities.initialized_p($pph_var_types$.getDynamicValue(thread));
    }

    public static SubLObject note_unexpressed_negation(final SubLObject arg_position, SubLObject source) {
        if (source == UNPROVIDED) {
            source = $UNKNOWN_SOURCE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str47$Noting_unexpressed_negation_from_, source, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return set.set_add(arg_position, $pph_unexpressed_negations$.getDynamicValue(thread));
    }

    public static SubLObject note_unexpressed_negation_expressed(SubLObject arg_position, SubLObject source) {
        if (source == UNPROVIDED) {
            source = $UNKNOWN_SOURCE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != pph_utilities.pph_unknown_arg_position_p(arg_position)) && ONE_INTEGER.eql(set.set_size($pph_unexpressed_negations$.getDynamicValue(thread)))) {
            final SubLObject only_option = set_utilities.set_arbitrary_element_without_values($pph_unexpressed_negations$.getDynamicValue(thread), UNPROVIDED);
            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($str48$Assuming_we_just_expressed_the_ne, only_option);
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            arg_position = only_option;
        }
        final SubLObject found_itP = set.set_remove(arg_position, $pph_unexpressed_negations$.getDynamicValue(thread));
        if (((NIL == found_itP) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
            Errors.warn($str49$Supposedly_expressed_negation_of_, arg_position);
            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return found_itP;
    }

    public static SubLObject unexpressed_negationP(final SubLObject arg_position) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return set.set_memberP(arg_position, $pph_unexpressed_negations$.getDynamicValue(thread));
    }

    public static SubLObject pph_allow_contractionsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean($pph_allow_contractionsP$.getDynamicValue(thread));
    }

    public static SubLObject verbose_print_pph_phrasesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean($verbose_print_pph_phrasesP$.getDynamicValue(thread));
    }

    public static SubLObject current_generation_level() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $generation_level$.getDynamicValue(thread);
    }

    public static SubLObject pph_problem_reporting_on_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean($pph_problem_reporting_mode$.getDynamicValue(thread) != $OFF);
    }

    public static SubLObject retain_pph_queriesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject value = makeBoolean((NIL != $retain_pph_queriesP$.getDynamicValue(thread)) || ((NIL != pph_phrase.http_processP(UNPROVIDED)) && (NIL != $generated_phrases_browsableP$.getDynamicValue(thread))));
        warn_about_pph_query_retention(value, UNPROVIDED);
        return value;
    }

    public static SubLObject clear_warn_about_pph_query_retention() {
        final SubLObject cs = $warn_about_pph_query_retention_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_warn_about_pph_query_retention(final SubLObject value, SubLObject process) {
        if (process == UNPROVIDED) {
            process = current_process();
        }
        return memoization_state.caching_state_remove_function_results_with_args($warn_about_pph_query_retention_caching_state$.getGlobalValue(), list(value, process), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject warn_about_pph_query_retention_internal(final SubLObject value, final SubLObject process) {
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str55$Retain_PPH_queries_is__S_for__S, value, process, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return value;
    }

    public static SubLObject warn_about_pph_query_retention(final SubLObject value, SubLObject process) {
        if (process == UNPROVIDED) {
            process = current_process();
        }
        SubLObject caching_state = $warn_about_pph_query_retention_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(WARN_ABOUT_PPH_QUERY_RETENTION, $warn_about_pph_query_retention_caching_state$, NIL, EQL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(value, process);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (value.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && process.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(warn_about_pph_query_retention_internal(value, process)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(value, process));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject initialize_pph_vars() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != kb_loaded()) {
            $pph_language_mt$.setDynamicValue(default_pph_language_mt(UNPROVIDED), thread);
            $pph_domain_mt$.setDynamicValue($pph_language_mt$.getDynamicValue(thread), thread);
            pph_utilities.initialize_pph_nbar_nart();
            return $INITIALIZED;
        }
        final SubLObject new_format_string = cconcatenate($str60$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str61$__, format_nil.format_nil_a_no_copy($str62$No_KB_loaded__Couldn_t_initialize) });
        pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
        return $NO_KB_LOADED;
    }

    public static SubLObject default_pph_language_mt(SubLObject union_mts) {
        if (union_mts == UNPROVIDED) {
            union_mts = NIL;
        }
        SubLObject language_mt = NIL;
        if (NIL == language_mt) {
            SubLObject csome_list_var = $list64;
            SubLObject mt_name = NIL;
            mt_name = csome_list_var.first();
            while ((NIL == language_mt) && (NIL != csome_list_var)) {
                final SubLObject mt = constants_high.find_constant(mt_name);
                if (NIL != valid_constantP(mt, UNPROVIDED)) {
                    language_mt = mt;
                }
                csome_list_var = csome_list_var.rest();
                mt_name = csome_list_var.first();
            } 
        }
        if (NIL != union_mts) {
            language_mt = make_formula($$MtUnionFn, cons(language_mt, union_mts), UNPROVIDED);
        }
        return maybe_temporally_qualify_pph_language_mt(language_mt);
    }

    public static SubLObject maybe_temporally_qualify_pph_language_mt(SubLObject language_mt) {
        if (NIL != hlmt.hlmts_supportedP()) {
            language_mt = hlmt_czer.canonicalize_hlmt(listS($$MtSpace, language_mt, $list67));
        }
        return language_mt;
    }

    public static SubLObject declare_pph_vars_file() {
        declareFunction(me, "pph_generate_alternative_phrasesP", "PPH-GENERATE-ALTERNATIVE-PHRASES?", 0, 0, false);
        declareFunction(me, "pph_at_top_levelP", "PPH-AT-TOP-LEVEL?", 0, 0, false);
        declareFunction(me, "pph_generate_morphological_alternativesP", "PPH-GENERATE-MORPHOLOGICAL-ALTERNATIVES?", 0, 0, false);
        declareFunction(me, "pph_generate_nested_alternativesP", "PPH-GENERATE-NESTED-ALTERNATIVES?", 0, 0, false);
        declareFunction(me, "definite_description_licensed_for_termP", "DEFINITE-DESCRIPTION-LICENSED-FOR-TERM?", 1, 0, false);
        declareFunction(me, "pph_language_mt", "PPH-LANGUAGE-MT", 0, 0, false);
        declareFunction(me, "pph_domain_mt", "PPH-DOMAIN-MT", 0, 0, false);
        declareFunction(me, "pph_blacklist_active_p", "PPH-BLACKLIST-ACTIVE-P", 0, 0, false);
        declareFunction(me, "pph_forbidden_string_for_termP", "PPH-FORBIDDEN-STRING-FOR-TERM?", 2, 0, false);
        declareFunction(me, "pph_forbidden_lexical_assertionP", "PPH-FORBIDDEN-LEXICAL-ASSERTION?", 1, 0, false);
        declareFunction(me, "pph_failure_is_an_option_p", "PPH-FAILURE-IS-AN-OPTION-P", 0, 0, false);
        declareFunction(me, "pph_too_many_demerits_p", "PPH-TOO-MANY-DEMERITS-P", 1, 1, false);
        declareFunction(me, "pph_link_unlinked_phrases_to_matrix_arg0P", "PPH-LINK-UNLINKED-PHRASES-TO-MATRIX-ARG0?", 0, 0, false);
        declareFunction(me, "pph_maximize_linksP", "PPH-MAXIMIZE-LINKS?", 0, 0, false);
        declareFunction(me, "pph_current_parameters", "PPH-CURRENT-PARAMETERS", 0, 1, false);
        declareFunction(me, "pph_new_parameter_snapshot", "PPH-NEW-PARAMETER-SNAPSHOT", 0, 0, false);
        declareFunction(me, "pph_params_currentP", "PPH-PARAMS-CURRENT?", 1, 0, false);
        declareFunction(me, "pph_param_value", "PPH-PARAM-VALUE", 1, 0, false);
        declareFunction(me, "pph_quantifier_keyword_p", "PPH-QUANTIFIER-KEYWORD-P", 1, 0, false);
        declareFunction(me, "pph_quantifier_keywords", "PPH-QUANTIFIER-KEYWORDS", 0, 0, false);
        declareMacro(me, "with_pph_operator_scope", "WITH-PPH-OPERATOR-SCOPE");
        declareFunction(me, "pph_inside_negation_scope_p", "PPH-INSIDE-NEGATION-SCOPE-P", 0, 0, false);
        declareFunction(me, "pph_inside_downward_entailing_environmentP", "PPH-INSIDE-DOWNWARD-ENTAILING-ENVIRONMENT?", 0, 0, false);
        declareFunction(me, "pph_top_level_cycl", "PPH-TOP-LEVEL-CYCL", 0, 0, false);
        declareFunction(me, "pph_current_cycl", "PPH-CURRENT-CYCL", 0, 0, false);
        declareFunction(me, "pph_tracking_var_types_p", "PPH-TRACKING-VAR-TYPES-P", 0, 0, false);
        declareFunction(me, "note_unexpressed_negation", "NOTE-UNEXPRESSED-NEGATION", 1, 1, false);
        declareFunction(me, "note_unexpressed_negation_expressed", "NOTE-UNEXPRESSED-NEGATION-EXPRESSED", 1, 1, false);
        declareFunction(me, "unexpressed_negationP", "UNEXPRESSED-NEGATION?", 1, 0, false);
        declareFunction(me, "pph_allow_contractionsP", "PPH-ALLOW-CONTRACTIONS?", 0, 0, false);
        declareFunction(me, "verbose_print_pph_phrasesP", "VERBOSE-PRINT-PPH-PHRASES?", 0, 0, false);
        declareFunction(me, "current_generation_level", "CURRENT-GENERATION-LEVEL", 0, 0, false);
        declareFunction(me, "pph_problem_reporting_on_p", "PPH-PROBLEM-REPORTING-ON-P", 0, 0, false);
        declareFunction(me, "retain_pph_queriesP", "RETAIN-PPH-QUERIES?", 0, 0, false);
        declareFunction(me, "clear_warn_about_pph_query_retention", "CLEAR-WARN-ABOUT-PPH-QUERY-RETENTION", 0, 0, false);
        declareFunction(me, "remove_warn_about_pph_query_retention", "REMOVE-WARN-ABOUT-PPH-QUERY-RETENTION", 1, 1, false);
        declareFunction(me, "warn_about_pph_query_retention_internal", "WARN-ABOUT-PPH-QUERY-RETENTION-INTERNAL", 2, 0, false);
        declareFunction(me, "warn_about_pph_query_retention", "WARN-ABOUT-PPH-QUERY-RETENTION", 1, 1, false);
        declareFunction(me, "initialize_pph_vars", "INITIALIZE-PPH-VARS", 0, 0, false);
        declareFunction(me, "default_pph_language_mt", "DEFAULT-PPH-LANGUAGE-MT", 0, 1, false);
        declareFunction(me, "maybe_temporally_qualify_pph_language_mt", "MAYBE-TEMPORALLY-QUALIFY-PPH-LANGUAGE-MT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_pph_vars_file() {
        defparameter("*USE-PARENTHETICAL-DISAMBIGUATIONS?*", $WHEN_NECESSARY);
        defparameter("*PPH-AMBIGUOUS-STRINGS*", NIL);
        defparameter("*PPH-USE-BULLETED-LISTS?*", NIL);
        defparameter("*PPH-USE-BULLETED-LISTS-MIN-LEVEL*", ONE_INTEGER);
        defparameter("*PPH-REPLACE-BULLETED-LIST-TAGS?*", NIL);
        defparameter("*PPH-ITALICIZE-VARIABLES-IN-HTML-MODE?*", T);
        defparameter("*PPH-ITALICIZE-SKOLEMS-IN-HTML-MODE?*", T);
        defparameter("*PPH-CITATION-FORMAT*", $SUPERSCRIPTS);
        deflexical("*PPH-HTML-TAGS-ADDED-BY-SYSTEM*", list(new SubLObject[]{ html_macros.$html_italic_head$.getGlobalValue(), html_macros.$html_italic_tail$.getGlobalValue(), html_macros.$html_unordered_list_head$.getGlobalValue(), html_macros.$html_unordered_list_tail$.getGlobalValue(), html_macros.$html_list_item_head$.getGlobalValue(), html_macros.$html_list_item_tail$.getGlobalValue(), $str2$_a_, $str3$_a_, html_macros.$html_anchor_tail$.getGlobalValue(), html_macros.$html_subscript_head$.getGlobalValue(), html_macros.$html_subscript_tail$.getGlobalValue(), html_macros.$html_superscript_head$.getGlobalValue(), html_macros.$html_superscript_tail$.getGlobalValue() }));
        defparameter("*PPH-USE-INDEXICAL-DATES?*", T);
        defparameter("*SELECT-STRING-METHODS-TO-OMIT*", NIL);
        defparameter("*PPH-GUESS-NAMES-FOR-UNLEXIFIED-TERMS?*", T);
        defparameter("*PPH-COERCE-DEFINITE-DESCRIPTIONS-FOR-UNLEXIFIED-TERMS?*", NIL);
        defparameter("*PPH-INTRODUCE-ANAPHORS?*", T);
        defparameter("*PPH-BLANKS-FOR-VARS?*", NIL);
        defparameter("*PPH-ALTERNATIVE-PHRASE-GENERATION-LEVEL*", $NONE);
        defparameter("*PPH-SENTENCE*", misc_utilities.uninitialized());
        defparameter("*PPH-USE-RDF?*", NIL);
        defparameter("*PARAPHRASE-PRECISION*", NIL);
        defparameter("*PPH-TERSE-MODE?*", T);
        defparameter("*PPH-TERSE-MT-SCOPE?*", NIL);
        defparameter("*PPH-USE-EXPLICIT-TEMPORAL-QUALIFICATION-FOR-DEFAULT?*", NIL);
        defparameter("*PPH-EXPLICIT-TEMPORAL-QUALIFICATION-FOR-CURRENT-FACTS?*", T);
        defparameter("*DEFINITE-DESCRIPTION-LICENSED-TERMS*", NIL);
        defparameter("*PARAPHRASE-MODE*", $HTML);
        defvar("*PPH-LANGUAGE-MT*", NIL);
        defparameter("*ALLOW-PPH-LANGUAGE-MT-BROADENING?*", T);
        defvar("*PPH-DOMAIN-MT*", NIL);
        defparameter("*PPH-TERM-PARAPHRASE-MAP*", NIL);
        defparameter("*PPH-TERM-PARAPHRASE-BLACKLIST*", NIL);
        defparameter("*PPH-LEXICAL-ASSERTION-BLACKLIST*", NIL);
        defparameter("*PPH-BASIC-VAR-TYPES*", $list13);
        defparameter("*PPH-USE-BASIC-VAR-TYPES?*", NIL);
        defparameter("*DETERMINERS-BEFORE-VARIABLES*", NIL);
        defparameter("*PPH-SUPPRESSED-FINAL-PUNCTUATION-STRINGS*", NIL);
        defparameter("*PPH-USE-EXPANSIONS-FOR-PRECISION?*", T);
        defparameter("*PPH-REDUCE-CONJUNCTIONS?*", T);
        defparameter("*PPH-QUERY-ANTECEDENTS-ARE-HYPOTHESIZED?*", T);
        defparameter("*PPH-HANDLE-HYPOTHETICALS?*", NIL);
        defparameter("*PPH-USE-TITLE-CAPITALIZATION?*", NIL);
        defparameter("*PPH-EXPAND-E-NOTATION-FOR-FLOATS?*", T);
        defparameter("*PPH-QUANTIFY-VARS?*", T);
        defparameter("*PPH-HIDE-EXPLICIT-UNIVERSALS?*", T);
        defparameter("*PPH-HYPOTHETICAL-VARS*", NIL);
        defparameter("*PPH-USE-SMART-VARIABLE-REPLACEMENT?*", misc_utilities.uninitialized());
        defparameter("*PPH-SEARCH-LIMIT*", TWO_INTEGER);
        defparameter("*REGISTER-VARS-BY-ARG-CONSTRAINTS?*", T);
        defparameter("*PPH-REGISTER-EXCEPTION-VARS-RECURSIVELY?*", NIL);
        defparameter("*PPH-ADDRESSEE*", $UNKNOWN);
        defparameter("*PPH-SPEAKER*", $UNKNOWN);
        defparameter("*PPH-USE-ONLINE-STRING-FREQUENCIES?*", NIL);
        defparameter("*PPH-CETERIS-PARIBUS-CHOICE-METHOD*", $ARBITRARY);
        defparameter("*PPH-TOP-LEVEL-DEMERITS*", misc_utilities.uninitialized());
        defparameter("*PPH-DEMERIT-CUTOFF*", number_utilities.positive_infinity());
        defconstant("*PPH-SUGGESTED-DEMERIT-CUTOFF*", TWO_INTEGER);
        defparameter("*PPH-ALLOW-WORD-FORM-COERCION?*", T);
        defparameter("*PPH-MAX-NO-COMMA-LENGTH*", FOUR_INTEGER);
        defparameter("*PPH-SIGNIFICANT-DIGITS-CUTOFF*", number_utilities.positive_infinity());
        defparameter("*PPH-SHOW-TYPE-LEVEL-VIOLATIONS?*", NIL);
        defparameter("*PPH-TYPE-LEVEL-VIOLATIONS*", NIL);
        defparameter("*PPH-NAME-STRING-PREDS*", NIL);
        defparameter("*PPH-IRRELEVANT-WARN?*", NIL);
        defparameter("*PPH-INFERENCE-ANSWER*", NIL);
        defparameter("*PPH-PARAPHRASE-TO-JUSTIFY*", misc_utilities.uninitialized());
        defparameter("*CONSTANT-LINK-FUNCTION*", CB_CF);
        defparameter("*ALLOW-UTF8-IN-PPH-TEXT-MODE*", NIL);
        defparameter("*PPH-USE-SALIENT-URL?*", NIL);
        defparameter("*HTML-GENERATION-TARGET*", $str21$_self);
        defparameter("*HTML-GENERATION-TERM-ID-FUNCTION*", GET_TERM_ID);
        defparameter("*PPH-DEPRECATE-OLD-SOURCE-CITATION-FORMAT?*", T);
        defparameter("*PPH-LINK-ARG0?*", NIL);
        defparameter("*PPH-LINK-UNLINKED-PHRASES-TO-MATRIX-ARG0?*", T);
        defparameter("*PPH-MAXIMIZE-LINKS?*", NIL);
        defparameter("*PPH-CONSOLIDATE-OUTPUT-LIST-FOR-NAT?*", T);
        defparameter("*PPH-CONSOLIDATE-JAVALISTS?*", NIL);
        defparameter("*PPH-USE-SHOW/HIDE?*", T);
        defparameter("*RKF-USE-CYCL-FOR-UNLEXIFIED-TERMS?*", T);
        defparameter("*PPH-USE-CB-UIA-DISPLAY-METHODS?*", NIL);
        defparameter("*RKF-PREFER-NOUNS-FOR-TERMS?*", T);
        defparameter("*RKF-USE-GENL-PREDS-FOR-PARAPHRASE?*", NIL);
        deflexical("*PPH-CONTROL-PARAMETERS*", $list26);
        defconstant("*PPH-MAX-PARAM-RECORDS*", TEN_INTEGER);
        defparameter("*PPH-LATEST-PARAMETERS*", NIL);
        defconstant("*PPH-QUANTIFIERS*", $list29);
        defparameter("*PPH-OPERATOR-SCOPE-CONTEXT*", NIL);
        defconstant("*PPH-BLANK-STRING*", $str43$______);
        deflexical("*GEN-TEMPLATE-STORE-LOCK*", make_lock($str44$Gen_Template_Store_Lock));
        defparameter("*LAST-PPH-SENTENCE*", NIL);
        defparameter("*PPH-PHRASE-FNS*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*PPH-DATA-STRUCTURES-CODE-REVISION*", SubLSystemTrampolineFile.maybeDefault($pph_data_structures_code_revision$, $pph_data_structures_code_revision$, NIL));
        defparameter("*PPH-CYCLS*", NIL);
        defparameter("*PPH-ROOT-PHRASE*", misc_utilities.uninitialized());
        defparameter("*BYPASS-PPH-PHRASE-DESTROYER?*", T);
        defparameter("*PPH-DISCOURSE-CONTEXT*", NIL);
        defparameter("*PPH-TRACK-DISCOURSE-REFERENTS?*", T);
        defparameter("*PPH-VAR-TYPES*", misc_utilities.uninitialized());
        defparameter("*PPH-NOTED-VAR-TYPES*", NIL);
        defparameter("*PPH-POSSIBLY-BINDING-VARIABLES-COUNTER*", ZERO_INTEGER);
        defparameter("*PPH-USE-WH-FOR-QUERY-VARS?*", T);
        defparameter("*PPH-UNEXPRESSED-NEGATIONS*", misc_utilities.uninitialized());
        defparameter("*PPH-ALLOW-CONTRACTIONS?*", NIL);
        defparameter("*PPH-USE-WHOM?*", T);
        defparameter("*PPH-CAPITALIZE-FALSE-STRING?*", NIL);
        defparameter("*PPH-KEEP-GENERIC-ARGS?*", NIL);
        defparameter("*PPH-RESOLVE-BINDINGS-PHRASES?*", T);
        defparameter("*VERBOSE-PRINT-PPH-PHRASES?*", NIL);
        defparameter("*PPH-FORMULA-FOR-GENERIC-ARG-REPLACEMENT*", $UNSPECIFIED);
        defparameter("*GENERATION-LEVEL*", ZERO_INTEGER);
        defparameter("*PPH-CURRENT-ARG0-POSITION*", $list51);
        defparameter("*PPH-CURRENT-ARG0*", $UNSPECIFIED);
        defparameter("*PPH-PROBLEM-REPORTING-MODE*", $OFF);
        defparameter("*PPH-PROBLEM-REPORTS*", $NOT_GATHERING);
        defparameter("*PPH-RETAIN-ORIGINAL-RELATIVE-TARGETS?*", NIL);
        defparameter("*METER-PPH-QUERIES?*", NIL);
        defparameter("*METER-PPH-GAF-PARAPHRASE?*", NIL);
        defparameter("*RETAIN-PPH-QUERIES?*", NIL);
        deflexical("*WARN-ABOUT-PPH-QUERY-RETENTION-CACHING-STATE*", NIL);
        defparameter("*PPH-ERROR-ON-BAD-TEMPLATES?*", NIL);
        defconstant("*PPH-BAD-TEMPLATE-DUMMY*", $PPH_BAD_TEMPLATE_DUMMY);
        defparameter("*PPH-NON-EXPLANATORY-PROOFS*", $UNINITIALIZED);
        defparameter("*PPH-SHOW-META-SUPPORTS-WITH-SUPPORTS?*", T);
        defparameter("*PPH-SHOW-ASSERT-INFO-WITH-ASSERTIONS?*", T);
        defparameter("*PPH-PROOF-SHOW-FACTS-USED?*", T);
        defparameter("*PPH-PROOF-SHOW-FACTS-DEPTH-CUTOFF*", ONE_INTEGER);
        defparameter("*PPH-PROOF-INCLUDE-PHRASE-LINKS?*", NIL);
        defparameter("*PPH-SHOW-TRIVIAL-PROOFS?*", NIL);
        defparameter("*PPH-REPOSITIONED-PROOFS*", NIL);
        defparameter("*PPH-DISPLAYED-PROOFS*", NIL);
        defparameter("*PPH-JUSTIFIED-PROOFS*", NIL);
        defparameter("*PPH-DISPLAYED-SUPPORTS*", $UNINITIALIZED);
        deflexical("*RULES-USED-IN-QUASI-TRANSFORMATION-PROOFS*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        defparameter("*PPH-PROOF-DEPTH*", ZERO_INTEGER);
        defconstant("*PPH-TOP-LEVEL-PROOF-DEPTH*", ONE_INTEGER);
        defparameter("*VALIDATE-PROOF-SUPPORTS?*", T);
        defparameter("*PPH-PHRASE-METHODS*", misc_utilities.uninitialized());
        return NIL;
    }

    public static SubLObject setup_pph_vars_file() {
        register_external_symbol($sym7$_PPH_TERSE_MODE__);
        removal_modules_indexical_referent.register_indexical_referent_expansion($$ParaphraseLanguageMt, PPH_LANGUAGE_MT);
        removal_modules_indexical_referent.register_indexical_referent_expansion($$ParaphraseDomainMt, PPH_DOMAIN_MT);
        register_html_state_variable($constant_link_function$);
        register_html_state_variable($sym19$_ALLOW_UTF8_IN_PPH_TEXT_MODE_);
        register_html_state_variable($sym20$_PPH_USE_SALIENT_URL__);
        register_html_state_variable($html_generation_target$);
        register_html_state_variable($html_generation_term_id_function$);
        register_html_state_variable($sym25$_PPH_DEPRECATE_OLD_SOURCE_CITATION_FORMAT__);
        declare_defglobal($pph_data_structures_code_revision$);
        memoization_state.note_globally_cached_function(WARN_ABOUT_PPH_QUERY_RETENTION);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_pph_vars_file();
    }

    @Override
    public void initializeVariables() {
        init_pph_vars_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pph_vars_file();
    }

    
}

/**
 * Total time: 216 ms
 */
