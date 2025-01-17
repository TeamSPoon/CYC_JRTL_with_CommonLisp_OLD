package com.cyc.cycjava.cycl.sksi.sks_indexing;


import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sksi_sks_gaf_arg_indexing extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_sks_gaf_arg_indexing();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing";

    public static final String myFingerPrint = "0a8811e220eb851d500a38f9c5cb93873413d726ca68c66ea71ee1268191009b";

    // defconstant
    public static final SubLSymbol $dtp_sksi_supported_gaf_argument_cache_entry$ = makeSymbol("*DTP-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY*");



    // deflexical
    private static final SubLSymbol $sksi_default_count_for_term_argnum_pred$ = makeSymbol("*SKSI-DEFAULT-COUNT-FOR-TERM-ARGNUM-PRED*");

    // Internal Constants
    public static final SubLSymbol SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY = makeSymbol("SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY");

    public static final SubLSymbol SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_P = makeSymbol("SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-P");

    public static final SubLList $list2 = list(makeSymbol("ARGUMENT-POSITION"), makeSymbol("QUERY-FORM"), makeSymbol("PREDICATE"), makeSymbol("MT"), makeSymbol("COUNT"), makeSymbol("MODULES"));

    public static final SubLList $list3 = list(makeKeyword("ARGUMENT-POSITION"), makeKeyword("QUERY-FORM"), makeKeyword("PREDICATE"), makeKeyword("MT"), makeKeyword("COUNT"), makeKeyword("MODULES"));

    public static final SubLList $list4 = list(makeSymbol("SKSI-GAF-ARG-ENTRY-ARGUMENT-POSITION"), makeSymbol("SKSI-GAF-ARG-ENTRY-QUERY-FORM"), makeSymbol("SKSI-GAF-ARG-ENTRY-PREDICATE"), makeSymbol("SKSI-GAF-ARG-ENTRY-MT"), makeSymbol("SKSI-GAF-ARG-ENTRY-COUNT"), makeSymbol("SKSI-GAF-ARG-ENTRY-MODULES"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-SKSI-GAF-ARG-ENTRY-ARGUMENT-POSITION"), makeSymbol("_CSETF-SKSI-GAF-ARG-ENTRY-QUERY-FORM"), makeSymbol("_CSETF-SKSI-GAF-ARG-ENTRY-PREDICATE"), makeSymbol("_CSETF-SKSI-GAF-ARG-ENTRY-MT"), makeSymbol("_CSETF-SKSI-GAF-ARG-ENTRY-COUNT"), makeSymbol("_CSETF-SKSI-GAF-ARG-ENTRY-MODULES"));

    public static final SubLSymbol PRINT_SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY = makeSymbol("PRINT-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY");

    public static final SubLSymbol SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-P"));

    private static final SubLSymbol SKSI_GAF_ARG_ENTRY_ARGUMENT_POSITION = makeSymbol("SKSI-GAF-ARG-ENTRY-ARGUMENT-POSITION");

    private static final SubLSymbol _CSETF_SKSI_GAF_ARG_ENTRY_ARGUMENT_POSITION = makeSymbol("_CSETF-SKSI-GAF-ARG-ENTRY-ARGUMENT-POSITION");

    private static final SubLSymbol SKSI_GAF_ARG_ENTRY_QUERY_FORM = makeSymbol("SKSI-GAF-ARG-ENTRY-QUERY-FORM");

    private static final SubLSymbol _CSETF_SKSI_GAF_ARG_ENTRY_QUERY_FORM = makeSymbol("_CSETF-SKSI-GAF-ARG-ENTRY-QUERY-FORM");

    private static final SubLSymbol SKSI_GAF_ARG_ENTRY_PREDICATE = makeSymbol("SKSI-GAF-ARG-ENTRY-PREDICATE");

    private static final SubLSymbol _CSETF_SKSI_GAF_ARG_ENTRY_PREDICATE = makeSymbol("_CSETF-SKSI-GAF-ARG-ENTRY-PREDICATE");

    private static final SubLSymbol SKSI_GAF_ARG_ENTRY_MT = makeSymbol("SKSI-GAF-ARG-ENTRY-MT");

    private static final SubLSymbol _CSETF_SKSI_GAF_ARG_ENTRY_MT = makeSymbol("_CSETF-SKSI-GAF-ARG-ENTRY-MT");

    private static final SubLSymbol SKSI_GAF_ARG_ENTRY_COUNT = makeSymbol("SKSI-GAF-ARG-ENTRY-COUNT");

    private static final SubLSymbol _CSETF_SKSI_GAF_ARG_ENTRY_COUNT = makeSymbol("_CSETF-SKSI-GAF-ARG-ENTRY-COUNT");

    private static final SubLSymbol SKSI_GAF_ARG_ENTRY_MODULES = makeSymbol("SKSI-GAF-ARG-ENTRY-MODULES");

    private static final SubLSymbol _CSETF_SKSI_GAF_ARG_ENTRY_MODULES = makeSymbol("_CSETF-SKSI-GAF-ARG-ENTRY-MODULES");













    private static final SubLString $str27$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY = makeSymbol("MAKE-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY");





    private static final SubLSymbol $sym32$VISIT_DEFSTRUCT_OBJECT_SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_ME = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-METHOD");

    private static final SubLSymbol SXHASH_SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_METHOD = makeSymbol("SXHASH-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-METHOD");

    private static final SubLString $str34$__GACE__s__s__s__s__s__s_ = makeString("#<GACE:~s:~s:~s:~s:~s:~s>");

    private static final SubLSymbol $sksi_supported_gaf_argument_cache$ = makeSymbol("*SKSI-SUPPORTED-GAF-ARGUMENT-CACHE*");

    private static final SubLSymbol SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_PREDICATE = makeSymbol("SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-PREDICATE");

    private static final SubLSymbol SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_MT = makeSymbol("SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-MT");



    private static final SubLList $list39 = list(makeSymbol("ARG-POS"), makeSymbol("TERMS"));

    public static SubLObject sksi_supported_gaf_argument_cache_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sksi_supported_gaf_argument_cache_entry(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sksi_supported_gaf_argument_cache_entry_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$sksi_supported_gaf_argument_cache_entry_native.class ? T : NIL;
    }

    public static SubLObject sksi_gaf_arg_entry_argument_position(final SubLObject v_object) {
        assert NIL != sksi_supported_gaf_argument_cache_entry_p(v_object) : "sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_cache_entry_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sksi_gaf_arg_entry_query_form(final SubLObject v_object) {
        assert NIL != sksi_supported_gaf_argument_cache_entry_p(v_object) : "sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_cache_entry_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sksi_gaf_arg_entry_predicate(final SubLObject v_object) {
        assert NIL != sksi_supported_gaf_argument_cache_entry_p(v_object) : "sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_cache_entry_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject sksi_gaf_arg_entry_mt(final SubLObject v_object) {
        assert NIL != sksi_supported_gaf_argument_cache_entry_p(v_object) : "sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_cache_entry_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject sksi_gaf_arg_entry_count(final SubLObject v_object) {
        assert NIL != sksi_supported_gaf_argument_cache_entry_p(v_object) : "sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_cache_entry_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject sksi_gaf_arg_entry_modules(final SubLObject v_object) {
        assert NIL != sksi_supported_gaf_argument_cache_entry_p(v_object) : "sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_cache_entry_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject _csetf_sksi_gaf_arg_entry_argument_position(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_supported_gaf_argument_cache_entry_p(v_object) : "sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_cache_entry_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sksi_gaf_arg_entry_query_form(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_supported_gaf_argument_cache_entry_p(v_object) : "sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_cache_entry_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sksi_gaf_arg_entry_predicate(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_supported_gaf_argument_cache_entry_p(v_object) : "sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_cache_entry_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sksi_gaf_arg_entry_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_supported_gaf_argument_cache_entry_p(v_object) : "sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_cache_entry_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sksi_gaf_arg_entry_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_supported_gaf_argument_cache_entry_p(v_object) : "sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_cache_entry_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_sksi_gaf_arg_entry_modules(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_supported_gaf_argument_cache_entry_p(v_object) : "sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_cache_entry_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject make_sksi_supported_gaf_argument_cache_entry(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $sksi_supported_gaf_argument_cache_entry_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ARGUMENT_POSITION)) {
                _csetf_sksi_gaf_arg_entry_argument_position(v_new, current_value);
            } else
                if (pcase_var.eql($QUERY_FORM)) {
                    _csetf_sksi_gaf_arg_entry_query_form(v_new, current_value);
                } else
                    if (pcase_var.eql($PREDICATE)) {
                        _csetf_sksi_gaf_arg_entry_predicate(v_new, current_value);
                    } else
                        if (pcase_var.eql($MT)) {
                            _csetf_sksi_gaf_arg_entry_mt(v_new, current_value);
                        } else
                            if (pcase_var.eql($COUNT)) {
                                _csetf_sksi_gaf_arg_entry_count(v_new, current_value);
                            } else
                                if (pcase_var.eql($MODULES)) {
                                    _csetf_sksi_gaf_arg_entry_modules(v_new, current_value);
                                } else {
                                    Errors.error($str27$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sksi_supported_gaf_argument_cache_entry(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ARGUMENT_POSITION, sksi_gaf_arg_entry_argument_position(obj));
        funcall(visitor_fn, obj, $SLOT, $QUERY_FORM, sksi_gaf_arg_entry_query_form(obj));
        funcall(visitor_fn, obj, $SLOT, $PREDICATE, sksi_gaf_arg_entry_predicate(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, sksi_gaf_arg_entry_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $COUNT, sksi_gaf_arg_entry_count(obj));
        funcall(visitor_fn, obj, $SLOT, $MODULES, sksi_gaf_arg_entry_modules(obj));
        funcall(visitor_fn, obj, $END, MAKE_SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sksi_supported_gaf_argument_cache_entry_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sksi_supported_gaf_argument_cache_entry(obj, visitor_fn);
    }

    public static SubLObject sxhash_sksi_supported_gaf_argument_cache_entry_method(final SubLObject v_object) {
        return Sxhash.sxhash(sksi_gaf_arg_entry_predicate(v_object));
    }

    public static SubLObject new_sksi_supported_gaf_argument_cache_entry(final SubLObject argument_position, final SubLObject query_form, final SubLObject predicate, final SubLObject mt, final SubLObject count, final SubLObject module) {
        final SubLObject entry = make_sksi_supported_gaf_argument_cache_entry(UNPROVIDED);
        _csetf_sksi_gaf_arg_entry_argument_position(entry, argument_position);
        _csetf_sksi_gaf_arg_entry_query_form(entry, query_form);
        _csetf_sksi_gaf_arg_entry_predicate(entry, predicate);
        _csetf_sksi_gaf_arg_entry_mt(entry, mt);
        _csetf_sksi_gaf_arg_entry_count(entry, count);
        _csetf_sksi_gaf_arg_entry_modules(entry, list(module));
        return entry;
    }

    public static SubLObject sksi_supported_gaf_argument_cache_entry_argument_position(final SubLObject entry) {
        return sksi_gaf_arg_entry_argument_position(entry);
    }

    public static SubLObject sksi_supported_gaf_argument_cache_entry_query_form(final SubLObject entry) {
        return sksi_gaf_arg_entry_query_form(entry);
    }

    public static SubLObject sksi_supported_gaf_argument_cache_entry_predicate(final SubLObject entry) {
        return sksi_gaf_arg_entry_predicate(entry);
    }

    public static SubLObject sksi_supported_gaf_argument_cache_entry_mt(final SubLObject entry) {
        return sksi_gaf_arg_entry_mt(entry);
    }

    public static SubLObject sksi_supported_gaf_argument_cache_entry_count(final SubLObject entry) {
        return sksi_gaf_arg_entry_count(entry);
    }

    public static SubLObject sksi_supported_gaf_argument_cache_entry_modules(final SubLObject entry) {
        return sksi_gaf_arg_entry_modules(entry);
    }

    public static SubLObject print_sksi_supported_gaf_argument_cache_entry(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str34$__GACE__s__s__s__s__s__s_, new SubLObject[]{ sksi_supported_gaf_argument_cache_entry_argument_position(v_object), sksi_supported_gaf_argument_cache_entry_query_form(v_object), sksi_supported_gaf_argument_cache_entry_predicate(v_object), sksi_supported_gaf_argument_cache_entry_mt(v_object), sksi_supported_gaf_argument_cache_entry_count(v_object), sksi_supported_gaf_argument_cache_entry_modules(v_object) });
        return NIL;
    }

    public static SubLObject clear_sksi_supported_gaf_argument_cache() {
        return dictionary.clear_dictionary($sksi_supported_gaf_argument_cache$.getGlobalValue());
    }

    public static SubLObject sksi_supported_gaf_argument_cache_lookup(final SubLObject v_term) {
        return dictionary.dictionary_lookup_without_values($sksi_supported_gaf_argument_cache$.getGlobalValue(), v_term, NIL);
    }

    public static SubLObject sksi_supported_gaf_argument_browsing_registeredP() {
        return makeBoolean(NIL == dictionary.dictionary_empty_p($sksi_supported_gaf_argument_cache$.getGlobalValue()));
    }

    public static SubLObject new_sksi_supported_gaf_argument_arg_position_cache() {
        return set.new_set(symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject sksi_supported_gaf_argument_cache_enter(final SubLObject v_term, final SubLObject entry, SubLObject v_cache) {
        if (v_cache == UNPROVIDED) {
            v_cache = $sksi_supported_gaf_argument_cache$.getGlobalValue();
        }
        final SubLObject current_entries = sksi_supported_gaf_argument_cache_entries_for_term_argument_position_predicate_mt(v_term, sksi_supported_gaf_argument_cache_entry_argument_position(entry), sksi_supported_gaf_argument_cache_entry_predicate(entry), sksi_supported_gaf_argument_cache_entry_mt(entry));
        if (NIL == sksi_merge_gaf_argument_cache_entry_if_possible(entry, current_entries)) {
            SubLObject cache_for_term = dictionary.dictionary_lookup(v_cache, v_term, UNPROVIDED);
            final SubLObject arg_position = sksi_supported_gaf_argument_cache_entry_argument_position(entry);
            SubLObject cache_for_arg_position = NIL;
            if (NIL == cache_for_term) {
                cache_for_term = dictionary.new_dictionary(EQUAL, UNPROVIDED);
                dictionary.dictionary_enter(v_cache, v_term, cache_for_term);
            }
            cache_for_arg_position = dictionary.dictionary_lookup(cache_for_term, arg_position, UNPROVIDED);
            if (NIL == cache_for_arg_position) {
                cache_for_arg_position = new_sksi_supported_gaf_argument_arg_position_cache();
                dictionary.dictionary_enter(cache_for_term, arg_position, cache_for_arg_position);
            }
            set.set_add(entry, cache_for_arg_position);
        }
        return NIL;
    }

    public static SubLObject sksi_merge_gaf_argument_cache_entry_if_possible(final SubLObject entry, final SubLObject current_entries) {
        final SubLObject new_query_form = sksi_supported_gaf_argument_cache_entry_query_form(entry);
        final SubLObject new_modules = sksi_supported_gaf_argument_cache_entry_modules(entry);
        final SubLObject new_count = sksi_supported_gaf_argument_cache_entry_count(entry);
        SubLObject mergedP = NIL;
        if (NIL == mergedP) {
            SubLObject csome_list_var = current_entries;
            SubLObject current_entry = NIL;
            current_entry = csome_list_var.first();
            while ((NIL == mergedP) && (NIL != csome_list_var)) {
                final SubLObject current_query_form = sksi_supported_gaf_argument_cache_entry_query_form(current_entry);
                final SubLObject current_modules = sksi_supported_gaf_argument_cache_entry_modules(current_entry);
                if (NIL != sksi_sks_indexing_utilities.sksi_query_forms_unifyP(new_query_form, current_query_form)) {
                    _csetf_sksi_gaf_arg_entry_modules(current_entry, append(current_modules, new_modules));
                    _csetf_sksi_gaf_arg_entry_count(current_entry, sksi_external_browser_utilities.sksi_compute_count_for_external_browser_cache_entry_merge(sksi_gaf_arg_entry_count(current_entry), new_count));
                    mergedP = T;
                }
                csome_list_var = csome_list_var.rest();
                current_entry = csome_list_var.first();
            } 
        }
        return mergedP;
    }

    public static SubLObject sksi_supported_gaf_argument_remove(final SubLObject v_term, final SubLObject entry, final SubLObject module, final SubLObject count, SubLObject v_cache) {
        if (v_cache == UNPROVIDED) {
            v_cache = $sksi_supported_gaf_argument_cache$.getGlobalValue();
        }
        final SubLObject entry_modules = sksi_supported_gaf_argument_cache_entry_modules(entry);
        SubLObject removedP = NIL;
        if (NIL != subl_promotions.memberP(module, entry_modules, UNPROVIDED, UNPROVIDED)) {
            if (NIL != list_utilities.singletonP(entry_modules)) {
                final SubLObject arg_position = sksi_supported_gaf_argument_cache_entry_argument_position(entry);
                final SubLObject cache_for_term = dictionary.dictionary_lookup(v_cache, v_term, UNPROVIDED);
                SubLObject cache_for_arg_position = NIL;
                if (NIL != dictionary.dictionary_p(cache_for_term)) {
                    cache_for_arg_position = dictionary.dictionary_lookup(cache_for_term, arg_position, UNPROVIDED);
                }
                if (NIL != set.set_p(cache_for_arg_position)) {
                    set.set_remove(entry, cache_for_arg_position);
                }
            } else {
                _csetf_sksi_gaf_arg_entry_modules(entry, remove(module, entry_modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                _csetf_sksi_gaf_arg_entry_count(entry, sksi_external_browser_utilities.sksi_compute_count_for_external_browser_cache_entry_demerge(sksi_gaf_arg_entry_count(entry), count));
            }
            removedP = T;
        }
        return removedP;
    }

    public static SubLObject sksi_supported_gaf_argument_cache_entries_for_term(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term_entries_by_arg_position = sksi_supported_gaf_argument_cache_lookup(v_term);
        SubLObject return_entries = NIL;
        if (NIL != dictionary.dictionary_p(term_entries_by_arg_position)) {
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(term_entries_by_arg_position)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject entry_set = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject set_contents_var = set.do_set_internal(entry_set);
                SubLObject basis_object;
                SubLObject state;
                SubLObject entry;
                SubLObject cache_entry_mt;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    entry = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, entry)) {
                        if (NIL != hlmt.hlmt_p(mt)) {
                            cache_entry_mt = sksi_supported_gaf_argument_cache_entry_mt(entry);
                            if ((NIL != sksi_sks_mt_indexing.content_mt_of_activated_external_sourceP(cache_entry_mt)) && (NIL != genl_mts.genl_mtP(mt, cache_entry_mt, UNPROVIDED, UNPROVIDED))) {
                                return_entries = cons(entry, return_entries);
                            }
                        } else {
                            return_entries = cons(entry, return_entries);
                        }
                    }
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return nreverse(return_entries);
    }

    public static SubLObject sksi_supported_gaf_argument_positions_for_term(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject cache_entries_for_term = sksi_supported_gaf_argument_cache_entries_for_term(v_term, mt);
        SubLObject v_answer = NIL;
        SubLObject cdolist_list_var = cache_entries_for_term;
        SubLObject cache_entry = NIL;
        cache_entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            v_answer = cons(sksi_supported_gaf_argument_cache_entry_argument_position(cache_entry), v_answer);
            cdolist_list_var = cdolist_list_var.rest();
            cache_entry = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(v_answer, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sksi_supported_gaf_argument_predicates_for_term_argument_position(final SubLObject v_term, final SubLObject argument_position, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject cache_entries_for_term_and_arg = sksi_supported_gaf_argument_cache_entries_for_term_argument_position(v_term, argument_position, mt);
        return list_utilities.fast_delete_duplicates(Mapping.mapcar(SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_PREDICATE, cache_entries_for_term_and_arg), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sksi_supported_gaf_argument_cache_entries_for_term_argument_position(final SubLObject v_term, final SubLObject argument_position, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject cache_entries_for_term = sksi_supported_gaf_argument_cache_entries_for_term(v_term, mt);
        SubLObject v_answer = NIL;
        SubLObject cdolist_list_var = cache_entries_for_term;
        SubLObject cache_entry = NIL;
        cache_entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (argument_position.eql(sksi_supported_gaf_argument_cache_entry_argument_position(cache_entry))) {
                v_answer = cons(cache_entry, v_answer);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cache_entry = cdolist_list_var.first();
        } 
        return v_answer;
    }

    public static SubLObject sksi_supported_gaf_argument_mts_for_term_argument_position_predicate(final SubLObject v_term, final SubLObject argument_position, final SubLObject pred, SubLObject visible_mt) {
        if (visible_mt == UNPROVIDED) {
            visible_mt = NIL;
        }
        final SubLObject cache_entries_for_term_and_arg_pred = sksi_supported_gaf_argument_cache_entries_for_term_argument_position_predicate(v_term, argument_position, pred, visible_mt);
        return list_utilities.fast_delete_duplicates(Mapping.mapcar(SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_MT, cache_entries_for_term_and_arg_pred), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sksi_supported_gaf_argument_mt_count_pairs_for_term_argument_position_predicate(final SubLObject v_term, final SubLObject argument_position, final SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject cache_entries = sksi_supported_gaf_argument_cache_entries_for_term(v_term, mt);
        SubLObject mt_count_pairs = NIL;
        SubLObject cdolist_list_var = cache_entries;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pred = sksi_supported_gaf_argument_cache_entry_predicate(entry);
            final SubLObject arg = sksi_supported_gaf_argument_cache_entry_argument_position(entry);
            final SubLObject mt_$1 = sksi_supported_gaf_argument_cache_entry_mt(entry);
            if (pred.eql(predicate) && arg.eql(argument_position)) {
                SubLObject count = sksi_supported_gaf_argument_cache_entry_count(entry);
                final SubLObject last_entry = mt_count_pairs.first();
                final SubLObject last_entry_mt = last_entry.first();
                final SubLObject last_entry_count = second(last_entry);
                if (mt_$1.eql(last_entry_mt)) {
                    if (last_entry_count.isInteger()) {
                        if (count.isInteger()) {
                            count = add(count, last_entry_count);
                        } else {
                            count = last_entry_count;
                        }
                    }
                    mt_count_pairs = rplaca(mt_count_pairs, list(mt_$1, count));
                } else {
                    mt_count_pairs = cons(list(mt_$1, count), mt_count_pairs);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return nreverse(mt_count_pairs);
    }

    public static SubLObject sksi_supported_gaf_argument_cache_entries_for_term_argument_position_predicate(final SubLObject v_term, final SubLObject argument_position, final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject cache_entries_for_term_and_arg = sksi_supported_gaf_argument_cache_entries_for_term_argument_position(v_term, argument_position, mt);
        return list_utilities.find_all(pred, cache_entries_for_term_and_arg, symbol_function(EQ), SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_PREDICATE);
    }

    public static SubLObject sksi_supported_gaf_argument_cache_entries_for_term_argument_position_predicate_mt(final SubLObject v_term, final SubLObject argument_position, final SubLObject pred, final SubLObject mt) {
        if (NIL == sksi_sks_mt_indexing.content_mt_of_activated_external_sourceP(mt)) {
            return NIL;
        }
        final SubLObject cache_entries_for_term_and_arg_pred = sksi_supported_gaf_argument_cache_entries_for_term_argument_position_predicate(v_term, argument_position, pred, UNPROVIDED);
        return list_utilities.find_all(mt, cache_entries_for_term_and_arg_pred, HLMT_EQUAL, SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_MT);
    }

    public static SubLObject gather_query_form_module_list_pairs_from_sksi_supported_gaf_argument_cache_entries_for_term_argument_position_predicate_mt(final SubLObject index_hook, final SubLObject arg, final SubLObject predicate, final SubLObject mt) {
        if (NIL == sksi_sks_mt_indexing.content_mt_of_activated_external_sourceP(mt)) {
            return NIL;
        }
        final SubLObject cache_entries_for_term = sksi_supported_gaf_argument_cache_entries_for_term(index_hook, UNPROVIDED);
        SubLObject query_form_module_list_pairs = NIL;
        SubLObject cdolist_list_var = cache_entries_for_term;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((arg.eql(sksi_supported_gaf_argument_cache_entry_argument_position(entry)) && predicate.eql(sksi_supported_gaf_argument_cache_entry_predicate(entry))) && (NIL != hlmt.hlmt_equal(mt, sksi_supported_gaf_argument_cache_entry_mt(entry)))) {
                query_form_module_list_pairs = cons(list(sksi_supported_gaf_argument_cache_entry_query_form(entry), sksi_supported_gaf_argument_cache_entry_modules(entry)), query_form_module_list_pairs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return nreverse(query_form_module_list_pairs);
    }

    public static SubLObject gather_relevant_query_form_mt_module_list_tuples_from_sksi_supported_gaf_argument_cache_for_term_argument_position_predicate(final SubLObject index_hook, final SubLObject arg, final SubLObject predicate) {
        final SubLObject cache_entries_for_term = sksi_supported_gaf_argument_cache_entries_for_term(index_hook, UNPROVIDED);
        SubLObject query_form_module_list_pairs = NIL;
        SubLObject cdolist_list_var = cache_entries_for_term;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((arg.eql(sksi_supported_gaf_argument_cache_entry_argument_position(entry)) && predicate.eql(sksi_supported_gaf_argument_cache_entry_predicate(entry))) && (NIL != mt_relevance_macros.relevant_mtP(sksi_supported_gaf_argument_cache_entry_mt(entry)))) {
                query_form_module_list_pairs = cons(list(sksi_supported_gaf_argument_cache_entry_query_form(entry), sksi_supported_gaf_argument_cache_entry_mt(entry), sksi_supported_gaf_argument_cache_entry_modules(entry)), query_form_module_list_pairs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return nreverse(query_form_module_list_pairs);
    }

    public static SubLObject gather_relevant_query_form_mt_module_list_tuples_from_sksi_supported_gaf_argument_cache_for_term_argument_position(final SubLObject index_hook, final SubLObject arg) {
        final SubLObject cache_entries_for_term = sksi_supported_gaf_argument_cache_entries_for_term(index_hook, UNPROVIDED);
        SubLObject query_form_module_list_pairs = NIL;
        SubLObject cdolist_list_var = cache_entries_for_term;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((arg.eql(sksi_supported_gaf_argument_cache_entry_argument_position(entry)) && (NIL != sksi_tva_utilities.sksi_gt_relevant_predP(sksi_supported_gaf_argument_cache_entry_predicate(entry)))) && (NIL != mt_relevance_macros.relevant_mtP(sksi_supported_gaf_argument_cache_entry_mt(entry)))) {
                query_form_module_list_pairs = cons(list(sksi_supported_gaf_argument_cache_entry_query_form(entry), sksi_supported_gaf_argument_cache_entry_mt(entry), sksi_supported_gaf_argument_cache_entry_modules(entry)), query_form_module_list_pairs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return nreverse(query_form_module_list_pairs);
    }

    public static SubLObject gather_sum_of_relevant_counts_for_term_argnum_pred(final SubLObject v_term, final SubLObject argnum, final SubLObject predicate) {
        final SubLObject cache_entries_for_term = sksi_supported_gaf_argument_cache_entries_for_term(v_term, UNPROVIDED);
        SubLObject count_sum = ZERO_INTEGER;
        if ((NIL == cache_entries_for_term) && (NIL != sksi_sks_predicate_indexing.sksi_supported_predicateP(predicate))) {
            return $sksi_default_count_for_term_argnum_pred$.getGlobalValue();
        }
        SubLObject cdolist_list_var = cache_entries_for_term;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((argnum.eql(sksi_supported_gaf_argument_cache_entry_argument_position(entry)) && predicate.eql(sksi_supported_gaf_argument_cache_entry_predicate(entry))) && (NIL != mt_relevance_macros.relevant_mtP(sksi_supported_gaf_argument_cache_entry_mt(entry)))) {
                count_sum = add(count_sum, sksi_supported_gaf_argument_cache_entry_count(entry).isNumber() ? sksi_supported_gaf_argument_cache_entry_count(entry) : $sksi_default_count_for_term_argnum_pred$.getGlobalValue());
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return count_sum;
    }

    public static SubLObject sksi_supported_gaf_argumentP(final SubLObject v_term) {
        if ((NIL != sksi_supported_gaf_argument_browsing_registeredP()) && (NIL == sksi_kb_accessors.isa_logical_schemaP(v_term))) {
            return makeBoolean((NIL != dictionary.dictionary_p(sksi_supported_gaf_argument_cache_lookup(v_term))) && (NIL == dictionary.dictionary_empty_p(sksi_supported_gaf_argument_cache_lookup(v_term))));
        }
        return NIL;
    }

    public static SubLObject register_sksi_supported_gaf_arguments(final SubLObject term_arguments, final SubLObject code_mapping_terms, final SubLObject required_pattern, final SubLObject predicate_list, final SubLObject content_mt, final SubLObject count, final SubLObject module) {
        final SubLObject query_form = sksi_external_browser_utilities.sksi_create_query_form_from_required_pattern(required_pattern);
        if (NIL != query_form) {
            SubLObject cdolist_list_var = predicate_list;
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != sksi_infrastructure_utilities.sksi_supported_predicate_type_p(pred, UNPROVIDED)) {
                    register_sksi_supported_gaf_arguments_int(term_arguments, code_mapping_terms, query_form, pred, content_mt, count, module);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject register_sksi_supported_gaf_arguments_int(final SubLObject term_arguments, final SubLObject code_mapping_terms, final SubLObject query_form, final SubLObject predicate, final SubLObject content_mt, final SubLObject count, final SubLObject module) {
        final SubLObject cache_entry_query_form = make_el_formula(predicate, cycl_utilities.formula_args(query_form, UNPROVIDED), UNPROVIDED);
        final SubLObject v_cache = $sksi_supported_gaf_argument_cache$.getGlobalValue();
        SubLObject cdolist_list_var = term_arguments;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2;
            final SubLObject argument_positions = cdolist_list_var_$2 = cycl_utilities.formula_arg_positions(cache_entry_query_form, v_term, UNPROVIDED);
            SubLObject arg_pos = NIL;
            arg_pos = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                final SubLObject entry = new_sksi_supported_gaf_argument_cache_entry(arg_pos, cache_entry_query_form, predicate, content_mt, count, module);
                sksi_supported_gaf_argument_cache_enter(v_term, entry, v_cache);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                arg_pos = cdolist_list_var_$2.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        cdolist_list_var = code_mapping_terms;
        SubLObject arg_pos_terms_pair = NIL;
        arg_pos_terms_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = arg_pos_terms_pair;
            SubLObject arg_pos = NIL;
            SubLObject terms = NIL;
            destructuring_bind_must_consp(current, datum, $list39);
            arg_pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list39);
            terms = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var_$3 = terms;
                SubLObject v_term2 = NIL;
                v_term2 = cdolist_list_var_$3.first();
                while (NIL != cdolist_list_var_$3) {
                    final SubLObject term_cache_entry_query_form = replace_formula_arg(arg_pos, v_term2, cache_entry_query_form);
                    final SubLObject entry2 = new_sksi_supported_gaf_argument_cache_entry(arg_pos, term_cache_entry_query_form, predicate, content_mt, count, module);
                    sksi_supported_gaf_argument_cache_enter(v_term2, entry2, v_cache);
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    v_term2 = cdolist_list_var_$3.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list39);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_pos_terms_pair = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject deregister_sksi_supported_gaf_arguments(final SubLObject term_arguments, final SubLObject code_mapping_terms, final SubLObject required_pattern, final SubLObject predicate, final SubLObject content_mt, final SubLObject module, final SubLObject count) {
        final SubLObject v_cache = $sksi_supported_gaf_argument_cache$.getGlobalValue();
        SubLObject cdolist_list_var = term_arguments;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$4;
            final SubLObject argument_positions = cdolist_list_var_$4 = cycl_utilities.formula_arg_positions(required_pattern, v_term, UNPROVIDED);
            SubLObject position = NIL;
            position = cdolist_list_var_$4.first();
            while (NIL != cdolist_list_var_$4) {
                SubLObject cdolist_list_var_$5;
                final SubLObject cache_entries = cdolist_list_var_$5 = sksi_supported_gaf_argument_cache_entries_for_term_argument_position_predicate_mt(v_term, position, predicate, content_mt);
                SubLObject entry = NIL;
                entry = cdolist_list_var_$5.first();
                while (NIL != cdolist_list_var_$5) {
                    sksi_supported_gaf_argument_remove(v_term, entry, module, count, v_cache);
                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                    entry = cdolist_list_var_$5.first();
                } 
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                position = cdolist_list_var_$4.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        deregister_code_mapping_terms_entries_from_gaf_arguments_cache(content_mt, predicate, code_mapping_terms, module, count);
        return NIL;
    }

    public static SubLObject deregister_code_mapping_terms_entries_from_gaf_arguments_cache(final SubLObject content_mt, final SubLObject predicate, final SubLObject code_mapping_terms, final SubLObject module, final SubLObject count) {
        final SubLObject v_cache = $sksi_supported_gaf_argument_cache$.getGlobalValue();
        SubLObject cdolist_list_var = code_mapping_terms;
        SubLObject arg_pos_terms_pair = NIL;
        arg_pos_terms_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = arg_pos_terms_pair;
            SubLObject arg_pos = NIL;
            SubLObject terms = NIL;
            destructuring_bind_must_consp(current, datum, $list39);
            arg_pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list39);
            terms = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var_$6 = terms;
                SubLObject v_term = NIL;
                v_term = cdolist_list_var_$6.first();
                while (NIL != cdolist_list_var_$6) {
                    SubLObject cdolist_list_var_$7;
                    final SubLObject cache_entries = cdolist_list_var_$7 = sksi_supported_gaf_argument_cache_entries_for_term_argument_position_predicate_mt(v_term, arg_pos, predicate, content_mt);
                    SubLObject entry = NIL;
                    entry = cdolist_list_var_$7.first();
                    while (NIL != cdolist_list_var_$7) {
                        sksi_supported_gaf_argument_remove(v_term, entry, module, count, v_cache);
                        cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                        entry = cdolist_list_var_$7.first();
                    } 
                    cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                    v_term = cdolist_list_var_$6.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list39);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_pos_terms_pair = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject declare_sksi_sks_gaf_arg_indexing_file() {
        declareFunction(me, "sksi_supported_gaf_argument_cache_entry_print_function_trampoline", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sksi_supported_gaf_argument_cache_entry_p", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-P", 1, 0, false);
        new sksi_sks_gaf_arg_indexing.$sksi_supported_gaf_argument_cache_entry_p$UnaryFunction();
        declareFunction(me, "sksi_gaf_arg_entry_argument_position", "SKSI-GAF-ARG-ENTRY-ARGUMENT-POSITION", 1, 0, false);
        declareFunction(me, "sksi_gaf_arg_entry_query_form", "SKSI-GAF-ARG-ENTRY-QUERY-FORM", 1, 0, false);
        declareFunction(me, "sksi_gaf_arg_entry_predicate", "SKSI-GAF-ARG-ENTRY-PREDICATE", 1, 0, false);
        declareFunction(me, "sksi_gaf_arg_entry_mt", "SKSI-GAF-ARG-ENTRY-MT", 1, 0, false);
        declareFunction(me, "sksi_gaf_arg_entry_count", "SKSI-GAF-ARG-ENTRY-COUNT", 1, 0, false);
        declareFunction(me, "sksi_gaf_arg_entry_modules", "SKSI-GAF-ARG-ENTRY-MODULES", 1, 0, false);
        declareFunction(me, "_csetf_sksi_gaf_arg_entry_argument_position", "_CSETF-SKSI-GAF-ARG-ENTRY-ARGUMENT-POSITION", 2, 0, false);
        declareFunction(me, "_csetf_sksi_gaf_arg_entry_query_form", "_CSETF-SKSI-GAF-ARG-ENTRY-QUERY-FORM", 2, 0, false);
        declareFunction(me, "_csetf_sksi_gaf_arg_entry_predicate", "_CSETF-SKSI-GAF-ARG-ENTRY-PREDICATE", 2, 0, false);
        declareFunction(me, "_csetf_sksi_gaf_arg_entry_mt", "_CSETF-SKSI-GAF-ARG-ENTRY-MT", 2, 0, false);
        declareFunction(me, "_csetf_sksi_gaf_arg_entry_count", "_CSETF-SKSI-GAF-ARG-ENTRY-COUNT", 2, 0, false);
        declareFunction(me, "_csetf_sksi_gaf_arg_entry_modules", "_CSETF-SKSI-GAF-ARG-ENTRY-MODULES", 2, 0, false);
        declareFunction(me, "make_sksi_supported_gaf_argument_cache_entry", "MAKE-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY", 0, 1, false);
        declareFunction(me, "visit_defstruct_sksi_supported_gaf_argument_cache_entry", "VISIT-DEFSTRUCT-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sksi_supported_gaf_argument_cache_entry_method", "VISIT-DEFSTRUCT-OBJECT-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-METHOD", 2, 0, false);
        declareFunction(me, "sxhash_sksi_supported_gaf_argument_cache_entry_method", "SXHASH-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-METHOD", 1, 0, false);
        declareFunction(me, "new_sksi_supported_gaf_argument_cache_entry", "NEW-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY", 6, 0, false);
        declareFunction(me, "sksi_supported_gaf_argument_cache_entry_argument_position", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-ARGUMENT-POSITION", 1, 0, false);
        new sksi_sks_gaf_arg_indexing.$sksi_supported_gaf_argument_cache_entry_argument_position$UnaryFunction();
        declareFunction(me, "sksi_supported_gaf_argument_cache_entry_query_form", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-QUERY-FORM", 1, 0, false);
        declareFunction(me, "sksi_supported_gaf_argument_cache_entry_predicate", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-PREDICATE", 1, 0, false);
        declareFunction(me, "sksi_supported_gaf_argument_cache_entry_mt", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-MT", 1, 0, false);
        declareFunction(me, "sksi_supported_gaf_argument_cache_entry_count", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-COUNT", 1, 0, false);
        declareFunction(me, "sksi_supported_gaf_argument_cache_entry_modules", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-MODULES", 1, 0, false);
        declareFunction(me, "print_sksi_supported_gaf_argument_cache_entry", "PRINT-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY", 3, 0, false);
        declareFunction(me, "clear_sksi_supported_gaf_argument_cache", "CLEAR-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE", 0, 0, false);
        declareFunction(me, "sksi_supported_gaf_argument_cache_lookup", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-LOOKUP", 1, 0, false);
        declareFunction(me, "sksi_supported_gaf_argument_browsing_registeredP", "SKSI-SUPPORTED-GAF-ARGUMENT-BROWSING-REGISTERED?", 0, 0, false);
        declareFunction(me, "new_sksi_supported_gaf_argument_arg_position_cache", "NEW-SKSI-SUPPORTED-GAF-ARGUMENT-ARG-POSITION-CACHE", 0, 0, false);
        declareFunction(me, "sksi_supported_gaf_argument_cache_enter", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTER", 2, 1, false);
        declareFunction(me, "sksi_merge_gaf_argument_cache_entry_if_possible", "SKSI-MERGE-GAF-ARGUMENT-CACHE-ENTRY-IF-POSSIBLE", 2, 0, false);
        declareFunction(me, "sksi_supported_gaf_argument_remove", "SKSI-SUPPORTED-GAF-ARGUMENT-REMOVE", 4, 1, false);
        declareFunction(me, "sksi_supported_gaf_argument_cache_entries_for_term", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRIES-FOR-TERM", 1, 1, false);
        declareFunction(me, "sksi_supported_gaf_argument_positions_for_term", "SKSI-SUPPORTED-GAF-ARGUMENT-POSITIONS-FOR-TERM", 1, 1, false);
        declareFunction(me, "sksi_supported_gaf_argument_predicates_for_term_argument_position", "SKSI-SUPPORTED-GAF-ARGUMENT-PREDICATES-FOR-TERM-ARGUMENT-POSITION", 2, 1, false);
        declareFunction(me, "sksi_supported_gaf_argument_cache_entries_for_term_argument_position", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRIES-FOR-TERM-ARGUMENT-POSITION", 2, 1, false);
        declareFunction(me, "sksi_supported_gaf_argument_mts_for_term_argument_position_predicate", "SKSI-SUPPORTED-GAF-ARGUMENT-MTS-FOR-TERM-ARGUMENT-POSITION-PREDICATE", 3, 1, false);
        declareFunction(me, "sksi_supported_gaf_argument_mt_count_pairs_for_term_argument_position_predicate", "SKSI-SUPPORTED-GAF-ARGUMENT-MT-COUNT-PAIRS-FOR-TERM-ARGUMENT-POSITION-PREDICATE", 3, 1, false);
        declareFunction(me, "sksi_supported_gaf_argument_cache_entries_for_term_argument_position_predicate", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRIES-FOR-TERM-ARGUMENT-POSITION-PREDICATE", 3, 1, false);
        declareFunction(me, "sksi_supported_gaf_argument_cache_entries_for_term_argument_position_predicate_mt", "SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRIES-FOR-TERM-ARGUMENT-POSITION-PREDICATE-MT", 4, 0, false);
        declareFunction(me, "gather_query_form_module_list_pairs_from_sksi_supported_gaf_argument_cache_entries_for_term_argument_position_predicate_mt", "GATHER-QUERY-FORM-MODULE-LIST-PAIRS-FROM-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRIES-FOR-TERM-ARGUMENT-POSITION-PREDICATE-MT", 4, 0, false);
        declareFunction(me, "gather_relevant_query_form_mt_module_list_tuples_from_sksi_supported_gaf_argument_cache_for_term_argument_position_predicate", "GATHER-RELEVANT-QUERY-FORM-MT-MODULE-LIST-TUPLES-FROM-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-FOR-TERM-ARGUMENT-POSITION-PREDICATE", 3, 0, false);
        declareFunction(me, "gather_relevant_query_form_mt_module_list_tuples_from_sksi_supported_gaf_argument_cache_for_term_argument_position", "GATHER-RELEVANT-QUERY-FORM-MT-MODULE-LIST-TUPLES-FROM-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-FOR-TERM-ARGUMENT-POSITION", 2, 0, false);
        declareFunction(me, "gather_sum_of_relevant_counts_for_term_argnum_pred", "GATHER-SUM-OF-RELEVANT-COUNTS-FOR-TERM-ARGNUM-PRED", 3, 0, false);
        declareFunction(me, "sksi_supported_gaf_argumentP", "SKSI-SUPPORTED-GAF-ARGUMENT?", 1, 0, false);
        declareFunction(me, "register_sksi_supported_gaf_arguments", "REGISTER-SKSI-SUPPORTED-GAF-ARGUMENTS", 7, 0, false);
        declareFunction(me, "register_sksi_supported_gaf_arguments_int", "REGISTER-SKSI-SUPPORTED-GAF-ARGUMENTS-INT", 7, 0, false);
        declareFunction(me, "deregister_sksi_supported_gaf_arguments", "DEREGISTER-SKSI-SUPPORTED-GAF-ARGUMENTS", 7, 0, false);
        declareFunction(me, "deregister_code_mapping_terms_entries_from_gaf_arguments_cache", "DEREGISTER-CODE-MAPPING-TERMS-ENTRIES-FROM-GAF-ARGUMENTS-CACHE", 5, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_sks_gaf_arg_indexing_file() {
        defconstant("*DTP-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY*", SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY);
        deflexical("*SKSI-SUPPORTED-GAF-ARGUMENT-CACHE*", SubLSystemTrampolineFile.maybeDefault($sksi_supported_gaf_argument_cache$, $sksi_supported_gaf_argument_cache$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
        deflexical("*SKSI-DEFAULT-COUNT-FOR-TERM-ARGNUM-PRED*", SEVENTEEN_INTEGER);
        return NIL;
    }

    public static SubLObject setup_sksi_sks_gaf_arg_indexing_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sksi_supported_gaf_argument_cache_entry$.getGlobalValue(), symbol_function(SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(SKSI_GAF_ARG_ENTRY_ARGUMENT_POSITION, _CSETF_SKSI_GAF_ARG_ENTRY_ARGUMENT_POSITION);
        def_csetf(SKSI_GAF_ARG_ENTRY_QUERY_FORM, _CSETF_SKSI_GAF_ARG_ENTRY_QUERY_FORM);
        def_csetf(SKSI_GAF_ARG_ENTRY_PREDICATE, _CSETF_SKSI_GAF_ARG_ENTRY_PREDICATE);
        def_csetf(SKSI_GAF_ARG_ENTRY_MT, _CSETF_SKSI_GAF_ARG_ENTRY_MT);
        def_csetf(SKSI_GAF_ARG_ENTRY_COUNT, _CSETF_SKSI_GAF_ARG_ENTRY_COUNT);
        def_csetf(SKSI_GAF_ARG_ENTRY_MODULES, _CSETF_SKSI_GAF_ARG_ENTRY_MODULES);
        identity(SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sksi_supported_gaf_argument_cache_entry$.getGlobalValue(), symbol_function($sym32$VISIT_DEFSTRUCT_OBJECT_SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_ME));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_sksi_supported_gaf_argument_cache_entry$.getGlobalValue(), symbol_function(SXHASH_SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_METHOD));
        declare_defglobal($sksi_supported_gaf_argument_cache$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_sks_gaf_arg_indexing_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_sks_gaf_arg_indexing_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_sks_gaf_arg_indexing_file();
    }

    

    public static final class $sksi_supported_gaf_argument_cache_entry_native extends SubLStructNative {
        public SubLObject $argument_position;

        public SubLObject $query_form;

        public SubLObject $predicate;

        public SubLObject $mt;

        public SubLObject $count;

        public SubLObject $modules;

        private static final SubLStructDeclNative structDecl;

        private $sksi_supported_gaf_argument_cache_entry_native() {
            this.$argument_position = Lisp.NIL;
            this.$query_form = Lisp.NIL;
            this.$predicate = Lisp.NIL;
            this.$mt = Lisp.NIL;
            this.$count = Lisp.NIL;
            this.$modules = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$argument_position;
        }

        @Override
        public SubLObject getField3() {
            return this.$query_form;
        }

        @Override
        public SubLObject getField4() {
            return this.$predicate;
        }

        @Override
        public SubLObject getField5() {
            return this.$mt;
        }

        @Override
        public SubLObject getField6() {
            return this.$count;
        }

        @Override
        public SubLObject getField7() {
            return this.$modules;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$argument_position = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$query_form = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$predicate = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$mt = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$count = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$modules = value;
        }

        static {
            structDecl = makeStructDeclNative($sksi_supported_gaf_argument_cache_entry_native.class, SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY, SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY_P, $list2, $list3, new String[]{ "$argument_position", "$query_form", "$predicate", "$mt", "$count", "$modules" }, $list4, $list5, PRINT_SKSI_SUPPORTED_GAF_ARGUMENT_CACHE_ENTRY);
        }
    }

    public static final class $sksi_supported_gaf_argument_cache_entry_p$UnaryFunction extends UnaryFunction {
        public $sksi_supported_gaf_argument_cache_entry_p$UnaryFunction() {
            super(extractFunctionNamed("SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sksi_supported_gaf_argument_cache_entry_p(arg1);
        }
    }

    public static final class $sksi_supported_gaf_argument_cache_entry_argument_position$UnaryFunction extends UnaryFunction {
        public $sksi_supported_gaf_argument_cache_entry_argument_position$UnaryFunction() {
            super(extractFunctionNamed("SKSI-SUPPORTED-GAF-ARGUMENT-CACHE-ENTRY-ARGUMENT-POSITION"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sksi_supported_gaf_argument_cache_entry_argument_position(arg1);
        }
    }
}

/**
 * Total time: 152 ms
 */
