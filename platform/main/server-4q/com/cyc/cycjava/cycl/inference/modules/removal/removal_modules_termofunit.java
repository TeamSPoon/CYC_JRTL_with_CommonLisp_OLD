package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$allow_forward_skolemization$;
import static com.cyc.cycjava.cycl.control_vars.$prefer_forward_skolemization$;
import static com.cyc.cycjava.cycl.el_utilities.tou_asentP;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.equals;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_termofunit extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_termofunit();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_termofunit";

    public static final String myFingerPrint = "76db5996ec780c682d0895a71fe1a86e4129442138a6e3b89e8056b7e07bc38b";

    // defparameter
    private static final SubLSymbol $default_skolemize_cost$ = makeSymbol("*DEFAULT-SKOLEMIZE-COST*");

    // defparameter
    private static final SubLSymbol $default_nat_unify_cost$ = makeSymbol("*DEFAULT-NAT-UNIFY-COST*");

    private static final SubLObject $$termOfUnit = reader_make_constant_shell(makeString("termOfUnit"));

    private static final SubLSymbol $META_REMOVAL_COMPLETELY_ENUMERABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");

    private static final SubLSymbol $META_REMOVAL_COMPLETELY_DECIDABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-DECIDABLE-POS");

    private static final SubLSymbol $NAT_LOOKUP_POS = makeKeyword("NAT-LOOKUP-POS");

    public static final SubLList $list4 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termOfUnit")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("termOfUnit")), makeKeyword("NOT-FULLY-BOUND"), cons(list(makeKeyword("AND"), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("SKOLEMIZATION-ALLOWED"))), makeKeyword("NOT-FULLY-BOUND"))), makeKeyword("PREFERENCE"), makeSymbol("NAT-LOOKUP-POS-PREFERENCE"));





    public static final SubLSymbol NAT_LOOKUP_POS_PREFERENCE = makeSymbol("NAT-LOOKUP-POS-PREFERENCE");





    private static final SubLSymbol $REMOVAL_NAT_FORMULA = makeKeyword("REMOVAL-NAT-FORMULA");

    public static final SubLList $list11 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termOfUnit")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("termOfUnit")), makeKeyword("NART"), makeKeyword("ANYTHING")), makeKeyword("COST"), makeSymbol("REMOVAL-NAT-FORMULA-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-FORMULA-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$termOfUnit <reified NAT> <whatever>)\n    using the GAF indexing on <reified NAT>"), makeKeyword("EXAMPLE"), makeString("(#$termOfUnit (#$JuvenileFn #$Dog) (#$JuvenileFn ?WHAT))") });

    private static final SubLSymbol $REMOVAL_TERM_OF_UNIT_FAIL = makeKeyword("REMOVAL-TERM-OF-UNIT-FAIL");

    public static final SubLList $list13 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termOfUnit")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(makeKeyword("NOT"), list(makeKeyword("TEST"), makeSymbol("REMOVAL-ABDUCTION-ALLOWED?"))), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("termOfUnit")), list(makeKeyword("AND"), list(makeKeyword("TEST"), makeSymbol("ATOM")), list(makeKeyword("NOT"), makeKeyword("NART")), list(makeKeyword("NOT"), makeKeyword("VARIABLE"))), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("REMOVAL-TERM-OF-UNIT-UNIFY-IMPOSSIBLE?")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termOfUnit <atom> <whatever>)\n    in all cases where <atom> is not a reified NAT or variable, should immediately fail.\n\n    (#$termOfUnit <arg1> <arg2>)\n    in all cases where ARG1 and ARG2 could not possibly unify, should immediately fail."), makeKeyword("EXAMPLE"), makeString("(#$termOfUnit #$Dog (#$JuvenileFn ?WHAT))\n    (#$termOfUnit 1 ?WHAT)\n    (#$termOfUnit (#$IdentityFn #$Dog) (#$JuvenileFn ?WHAT))") });

    private static final SubLSymbol $REMOVAL_SKOLEMIZE_CREATE = makeKeyword("REMOVAL-SKOLEMIZE-CREATE");

    public static final SubLList $list15 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termOfUnit")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("termOfUnit")), makeKeyword("NOT-FULLY-BOUND"), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND"))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-SKOLEMIZE-CREATE-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-SKOLEMIZE-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SKOLEMIZE-CREATE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$termOfUnit <variable> (<fort> . <fully bound>))"), makeKeyword("EXAMPLE"), makeString("(#$termOfUnit ?NAT (#$JuvenileFn #$Cougar))") });













    private static final SubLSymbol $REMOVAL_NAT_LOOKUP = makeKeyword("REMOVAL-NAT-LOOKUP");

    public static final SubLList $list23 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termOfUnit")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("termOfUnit")), makeKeyword("NOT-FULLY-BOUND"), cons(makeKeyword("FORT"), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-NAT-LOOKUP-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NAT-LOOKUP-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-LOOKUP-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$termOfUnit <not fully-bound> (<fort> . <whatever>)) \n    using the function-argument indexing on <fort>"), makeKeyword("EXAMPLE"), makeString("(#$termOfUnit ?NAT (#$JuvenileFn ?COL))") });

    private static final SubLSymbol $REMOVAL_NAT_UNIFY = makeKeyword("REMOVAL-NAT-UNIFY");

    public static final SubLList $list25 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termOfUnit")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("termOfUnit")), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), cons(makeKeyword("ANYTHING"), makeKeyword("ANYTHING"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NAT-UNIFY-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$termOfUnit (<fully bound> . <fully bound>) (<whatever . <whatever>))\n    via unification"), makeKeyword("EXAMPLE"), makeString("(#$termOfUnit (#$JuvenileFn #$Dog) (#$JuvenileFn ?WHAT))") });

    public static SubLObject nat_lookup_pos_preference(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $prefer_forward_skolemization$.getDynamicValue(thread)) {
            return $DISALLOWED;
        }
        final SubLObject naut = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject naut_vars = cdolist_list_var = variables.gather_hl_variables(naut);
        SubLObject naut_var = NIL;
        naut_var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != subl_promotions.memberP(naut_var, bindable_vars, UNPROVIDED, UNPROVIDED)) {
                return $DISALLOWED;
            }
            cdolist_list_var = cdolist_list_var.rest();
            naut_var = cdolist_list_var.first();
        } 
        return $PREFERRED;
    }

    public static SubLObject make_term_of_unit_support(final SubLObject nat, final SubLObject naut) {
        final SubLObject formula = list($$termOfUnit, nat, naut);
        return arguments.make_hl_support($EQUALITY, formula, mt_vars.$tou_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static SubLObject tou_analog_asentsP(final SubLObject asent1, final SubLObject asent2) {
        return makeBoolean(((NIL != tou_asentP(asent1)) && (NIL != tou_asentP(asent2))) && cycl_utilities.atomic_sentence_arg1(asent1, UNPROVIDED).equal(cycl_utilities.atomic_sentence_arg1(asent2, UNPROVIDED)));
    }

    public static SubLObject tou_sibling_asentsP(final SubLObject asent1, final SubLObject asent2) {
        return makeBoolean((!asent1.equal(asent2)) && (NIL != tou_analog_asentsP(asent1, asent2)));
    }

    public static SubLObject removal_nat_formula_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return kb_indexing.num_gaf_arg_index(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED), ONE_INTEGER, $$termOfUnit, mt_vars.$tou_mt$.getGlobalValue());
    }

    public static SubLObject removal_nat_formula_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject nart = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject assertion = function_terms.term_of_unit_assertion(nart);
        if (NIL != assertion) {
            final SubLObject nart_hl_formula = assertions_high.gaf_arg(assertion, TWO_INTEGER);
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg2, nart_hl_formula, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                backward.removal_add_node(assertion, v_bindings, unify_justification);
            }
        }
        return NIL;
    }

    public static SubLObject removal_term_of_unit_unify_impossibleP(final SubLObject asent) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return unification.unify_impossible(arg1, arg2);
    }

    public static SubLObject removal_skolemize_create_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject naut = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject function = cycl_utilities.nat_function(naut);
        if (NIL != skolemization_allowed(function)) {
            final SubLObject rewritten_naut = equals.possibly_subst_preferred_rewrite_terms(naut, UNPROVIDED);
            final SubLObject nart = narts_high.find_nart(rewritten_naut);
            if ((NIL == nart) && (NIL != function_terms.within_term_functional_complexity_cutoffP(rewritten_naut))) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject removal_skolemize_create_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject naut = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(arg1, naut, T, T);
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            final SubLObject hl_support = make_term_of_unit_support(naut, naut);
            backward.removal_add_node(hl_support, v_bindings, unify_justification);
        }
        return NIL;
    }

    public static SubLObject skolemization_allowed(final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != removal_module_utilities.current_query_allows_new_termsP()) && (NIL != (NIL != kb_control_vars.within_forward_inferenceP() ? makeBoolean(((NIL != $prefer_forward_skolemization$.getDynamicValue(thread)) || (NIL != $allow_forward_skolemization$.getDynamicValue(thread))) || (NIL != czer_main.forward_inference_reifiable_functionP(function, UNPROVIDED))) : makeBoolean(NIL == kb_control_vars.$within_assertion_forward_propagationP$.getDynamicValue(thread)))));
    }

    public static SubLObject removal_nat_lookup_completeness(final SubLObject asent) {
        final SubLObject nart_hl_formula = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject function = cycl_utilities.nat_function(nart_hl_formula);
        if (NIL == fort_types_interface.reifiable_function_p(function)) {
            return $COMPLETE;
        }
        if (NIL == skolemization_allowed(function)) {
            return $COMPLETE;
        }
        if ((NIL != variables.fully_bound_p(nart_hl_formula)) && (NIL != narts_high.find_nart(nart_hl_formula))) {
            return $COMPLETE;
        }
        return $GROSSLY_INCOMPLETE;
    }

    public static SubLObject removal_nat_lookup_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject nart_hl_formula = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject function = cycl_utilities.nat_function(nart_hl_formula);
        if (NIL == fort_types_interface.reifiable_function_p(function)) {
            return ZERO_INTEGER;
        }
        if (NIL != variables.fully_bound_p(nart_hl_formula)) {
            return NIL != narts_high.find_nart(nart_hl_formula) ? ONE_INTEGER : ZERO_INTEGER;
        }
        return kb_indexing.num_best_nat_lookup_index(nart_hl_formula, UNPROVIDED);
    }

    public static SubLObject removal_nat_lookup_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject nart_hl_formula = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject function = cycl_utilities.nat_function(nart_hl_formula);
        if (NIL != fort_types_interface.reifiable_function_p(function)) {
            final SubLObject l_index = kb_indexing.best_nat_lookup_index(nart_hl_formula, NIL);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_nli_extract_method(l_index);
            if (pcase_var.eql($NART_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term = kb_mapping_macros.do_nli_vna_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject functor = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != argnum) {
                    if (NIL != functor) {
                        if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, argnum, functor)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, argnum, functor);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$1 = NIL;
                                        final SubLObject token_var_$2 = NIL;
                                        while (NIL == done_var_$1) {
                                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                            final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(ass));
                                            if (NIL != valid_$3) {
                                                removal_modules_lookup.removal_lookup_expand_internal(ass, asent);
                                            }
                                            done_var_$1 = makeBoolean(NIL == valid_$3);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    } else
                        if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, argnum, NIL)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, argnum, NIL);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$2 = NIL;
                                        final SubLObject token_var_$3 = NIL;
                                        while (NIL == done_var_$2) {
                                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                            final SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(ass));
                                            if (NIL != valid_$4) {
                                                removal_modules_lookup.removal_lookup_expand_internal(ass, asent);
                                            }
                                            done_var_$2 = makeBoolean(NIL == valid_$4);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }

                } else
                    if (NIL != functor) {
                        if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, NIL, functor)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, NIL, functor);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$3 = NIL;
                                        final SubLObject token_var_$4 = NIL;
                                        while (NIL == done_var_$3) {
                                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                            final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(ass));
                                            if (NIL != valid_$5) {
                                                removal_modules_lookup.removal_lookup_expand_internal(ass, asent);
                                            }
                                            done_var_$3 = makeBoolean(NIL == valid_$5);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values3 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values3);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    } else
                        if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, NIL, NIL)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, NIL, NIL);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$4 = NIL;
                                        final SubLObject token_var_$5 = NIL;
                                        while (NIL == done_var_$4) {
                                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                            final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(ass));
                                            if (NIL != valid_$6) {
                                                removal_modules_lookup.removal_lookup_expand_internal(ass, asent);
                                            }
                                            done_var_$4 = makeBoolean(NIL == valid_$6);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values4 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values4);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }


            } else
                if (pcase_var.eql($FUNCTION_EXTENT)) {
                    if (NIL != kb_mapping_macros.do_function_extent_index_key_validator(kb_mapping_macros.do_nli_vfe_extract_key(l_index))) {
                        final SubLObject final_index_spec2 = kb_mapping_macros.function_extent_final_index_spec(kb_mapping_macros.do_nli_vfe_extract_key(l_index));
                        SubLObject final_index_iterator2 = NIL;
                        try {
                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
                            SubLObject done_var2 = NIL;
                            final SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                final SubLObject ass2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var2);
                                final SubLObject valid2 = makeBoolean(!token_var2.eql(ass2));
                                if (NIL != valid2) {
                                    removal_modules_lookup.removal_lookup_expand_internal(ass2, asent);
                                }
                                done_var2 = makeBoolean(NIL == valid2);
                            } 
                        } finally {
                            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values5 = getValuesAsVector();
                                if (NIL != final_index_iterator2) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                }
                                restoreValuesFromVector(_values5);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
                            }
                        }
                    }
                } else
                    if (pcase_var.eql($OVERLAP)) {
                        SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_nli_vo_extract_key(l_index), UNPROVIDED);
                        SubLObject ass3 = NIL;
                        ass3 = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            removal_modules_lookup.removal_lookup_expand_internal(ass3, asent);
                            cdolist_list_var = cdolist_list_var.rest();
                            ass3 = cdolist_list_var.first();
                        } 
                    } else {
                        kb_mapping_macros.do_nli_method_error(l_index, method);
                    }


        }
        return NIL;
    }

    public static SubLObject removal_nat_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(arg1, arg2, T, T);
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            final SubLObject subst_arg1 = bindings.subst_bindings(v_bindings, arg1);
            final SubLObject subst_arg2 = bindings.subst_bindings(v_bindings, arg2);
            final SubLObject hl_support = make_term_of_unit_support(subst_arg1, subst_arg2);
            backward.removal_add_node(hl_support, v_bindings, unify_justification);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_termofunit_file() {
        declareFunction(me, "nat_lookup_pos_preference", "NAT-LOOKUP-POS-PREFERENCE", 3, 0, false);
        declareFunction(me, "make_term_of_unit_support", "MAKE-TERM-OF-UNIT-SUPPORT", 2, 0, false);
        declareFunction(me, "tou_analog_asentsP", "TOU-ANALOG-ASENTS?", 2, 0, false);
        declareFunction(me, "tou_sibling_asentsP", "TOU-SIBLING-ASENTS?", 2, 0, false);
        declareFunction(me, "removal_nat_formula_cost", "REMOVAL-NAT-FORMULA-COST", 1, 1, false);
        declareFunction(me, "removal_nat_formula_expand", "REMOVAL-NAT-FORMULA-EXPAND", 1, 1, false);
        declareFunction(me, "removal_term_of_unit_unify_impossibleP", "REMOVAL-TERM-OF-UNIT-UNIFY-IMPOSSIBLE?", 1, 0, false);
        new removal_modules_termofunit.$removal_term_of_unit_unify_impossibleP$UnaryFunction();
        declareFunction(me, "removal_skolemize_create_required", "REMOVAL-SKOLEMIZE-CREATE-REQUIRED", 1, 1, false);
        declareFunction(me, "removal_skolemize_create_expand", "REMOVAL-SKOLEMIZE-CREATE-EXPAND", 1, 1, false);
        declareFunction(me, "skolemization_allowed", "SKOLEMIZATION-ALLOWED", 1, 0, false);
        declareFunction(me, "removal_nat_lookup_completeness", "REMOVAL-NAT-LOOKUP-COMPLETENESS", 1, 0, false);
        declareFunction(me, "removal_nat_lookup_cost", "REMOVAL-NAT-LOOKUP-COST", 1, 1, false);
        declareFunction(me, "removal_nat_lookup_expand", "REMOVAL-NAT-LOOKUP-EXPAND", 1, 1, false);
        declareFunction(me, "removal_nat_unify_expand", "REMOVAL-NAT-UNIFY-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_termofunit_file() {
        defparameter("*DEFAULT-SKOLEMIZE-COST*", ONE_INTEGER);
        defparameter("*DEFAULT-NAT-UNIFY-COST*", ONE_INTEGER);
        return NIL;
    }

    public static SubLObject setup_removal_modules_termofunit_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$termOfUnit);
        inference_modules.inference_removal_module_use_meta_removal($$termOfUnit, $META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
        inference_modules.inference_removal_module_use_meta_removal($$termOfUnit, $META_REMOVAL_COMPLETELY_DECIDABLE_POS);
        preference_modules.inference_preference_module($NAT_LOOKUP_POS, $list4);
        note_funcall_helper_function(NAT_LOOKUP_POS_PREFERENCE);
        inference_modules.inference_removal_module($REMOVAL_NAT_FORMULA, $list11);
        inference_modules.inference_removal_module($REMOVAL_TERM_OF_UNIT_FAIL, $list13);
        inference_modules.inference_removal_module($REMOVAL_SKOLEMIZE_CREATE, $list15);
        inference_modules.inference_removal_module($REMOVAL_NAT_LOOKUP, $list23);
        inference_modules.inference_removal_module($REMOVAL_NAT_UNIFY, $list25);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_termofunit_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_termofunit_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_termofunit_file();
    }

    

    public static final class $removal_term_of_unit_unify_impossibleP$UnaryFunction extends UnaryFunction {
        public $removal_term_of_unit_unify_impossibleP$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-TERM-OF-UNIT-UNIFY-IMPOSSIBLE?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_term_of_unit_unify_impossibleP(arg1);
        }
    }
}

/**
 * Total time: 227 ms
 */
