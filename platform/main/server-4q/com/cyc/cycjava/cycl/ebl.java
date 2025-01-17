package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.control_vars.$ebl_trace$;
import static com.cyc.cycjava.cycl.control_vars.$justification_compilations$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class ebl extends SubLTranslatedFile {
    public static final SubLFile me = new ebl();

    public static final String myName = "com.cyc.cycjava.cycl.ebl";

    public static final String myFingerPrint = "e82d432d8f6f2c1e711c7057cd764a3a7ba7dea0bc9b1ce5d99c8a86bcb157e5";

    // defparameter
    public static final SubLSymbol $ebl_justs$ = makeSymbol("*EBL-JUSTS*");

    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("RULE-1"), makeSymbol("RULE-2"), makeSymbol("&REST"), makeSymbol("MORE-RULES"));

    public static final SubLList $list1 = list(makeSymbol("MT-1"), makeSymbol("CNF-1"));

    public static final SubLList $list2 = list(makeSymbol("MT-2"), makeSymbol("CNF-2"));

    public static final SubLSymbol EBL_RULE = makeSymbol("EBL-RULE");



    public static final SubLList $list5 = list(makeSymbol("BINDINGS"), makeSymbol("NEG-JUSTS"), makeSymbol("POS-JUSTS"));

    public static final SubLList $list6 = list(makeSymbol("LIT"), makeSymbol("SUPPORT"), makeSymbol("SUB-LITS"));



    public static final SubLSymbol SUB_JUSTS = makeSymbol("SUB-JUSTS");

    public static final SubLList $list9 = list(makeSymbol("LITERAL"), makeSymbol("SUPPORT"), makeSymbol("SUB-LITS"), makeSymbol("&REST"), makeSymbol("MORE-SUPPORTS"));

    public static final SubLString $str10$sub_justs____s = makeString("sub-justs = ~s");

    public static final SubLString $str11$ebl_rule___mts_____s____s = makeString("ebl rule & mts: ~%~s ~%~s");

    public static final SubLString $str12$____ebl_rule___mts_____s____s = makeString("~%~%ebl rule & mts: ~%~s ~%~s");



    public static final SubLList $list14 = list(makeSymbol("SUPPORT-1"), makeSymbol("SUPPORT-2"));

    public static final SubLList $list15 = list(makeSymbol("ASSERTION-1"), makeSymbol("SENSE-1"), makeSymbol("PSN-1"));

    public static final SubLList $list16 = list(makeSymbol("ASSERTION-2"), makeSymbol("SENSE-2"), makeSymbol("PSN-2"));





    public static final SubLList $list19 = listS(makeSymbol("CNF-1"), makeSymbol("VNAMES-1"), makeSymbol("SENSE-1"), makeSymbol("PSN-1"));

    public static final SubLList $list20 = listS(makeSymbol("CNF-2"), makeSymbol("VNAMES-2"), makeSymbol("SENSE-2"), makeSymbol("PSN-2"));

    public static final SubLString $str21$___cnf_1____s = makeString("~% cnf-1 : ~s");

    public static final SubLString $str22$___cnf_2____s = makeString("~% cnf-2 : ~s");

    public static final SubLString $str23$___lit_1____s = makeString("~% lit-1 : ~s");

    public static final SubLString $str24$___lit_2____s = makeString("~% lit-2 : ~s");

    public static final SubLString $str25$___blist____s = makeString("~% blist : ~s");

    public static final SubLString $str26$___pos_lits_1____s = makeString("~% pos-lits-1 : ~s");

    public static final SubLString $str27$___new_neg_lits_1____s = makeString("~% new-neg-lits-1 : ~s");

    public static final SubLString $str28$___neg_lits_2____s = makeString("~% neg-lits-2 : ~s");

    public static final SubLString $str29$_____parent_to_unify_bindings____ = makeString("~%~% parent-to-unify-bindings : ~s");

    public static final SubLString $str30$___unify_to_child_bindings____s = makeString("~% unify-to-child-bindings : ~s");

    public static final SubLString $str31$___parent_to_child_bindings____s = makeString("~% parent-to-child-bindings : ~s");

    public static final SubLString $str32$___new_cnf____s = makeString("~% new-cnf : ~s");

    public static final SubLString $str33$___vnames_1____s = makeString("~% vnames-1 : ~s");

    public static final SubLString $str34$___vnames_2____s = makeString("~% vnames-2 : ~s");

    public static final SubLString $str35$___new_names____s = makeString("~% new names : ~s");

    public static final SubLString $str36$___new_rule____s = makeString("~% new rule : ~s");

    public static final SubLString $$$stop = makeString("stop");

    public static final SubLList $list38 = cons(makeSymbol("V1"), makeSymbol("V2"));

    public static final SubLSymbol PROOF_TREE_COMPILATIONS = makeSymbol("PROOF-TREE-COMPILATIONS");

    public static final SubLList $list40 = list(makeSymbol("POS-LIT-GAF.TRUTH"), makeSymbol("ASSERTION"), makeSymbol("SUB-TREES"));

    public static final SubLList $list41 = cons(makeSymbol("POS-LIT-GAF"), makeSymbol("TRUTH"));



    public static final SubLList $list43 = list(makeSymbol("LITERAL.TRUTH"), makeSymbol("SUPPORT"), makeSymbol("SUB-LITS"), makeSymbol("&REST"), makeSymbol("MORE-SUPPORTS"));

    public static final SubLList $list44 = cons(makeSymbol("LITERAL"), makeSymbol("TRUTH"));

    public static final SubLString $str45$cnf_not_fully_bound__s = makeString("cnf not fully bound ~s");

    public static SubLObject compile_assertion_list(final SubLObject assertions) {
        return compile_rule_list(ebl_rules(assertions));
    }

    public static SubLObject compile_rule_list(final SubLObject rules) {
        if (NIL == rules) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(rules)) {
            return rules.first();
        }
        SubLObject rule_1 = NIL;
        SubLObject rule_2 = NIL;
        destructuring_bind_must_consp(rules, rules, $list0);
        rule_1 = rules.first();
        SubLObject current = rules.rest();
        destructuring_bind_must_consp(current, rules, $list0);
        rule_2 = current.first();
        final SubLObject more_rules;
        current = more_rules = current.rest();
        final SubLObject mega_rule = compile_rule_pair(rule_1, rule_2);
        return compile_rule_list(cons(mega_rule, more_rules));
    }

    public static SubLObject compile_rule_pair(final SubLObject rule_1, final SubLObject rule_2) {
        SubLObject mt_1 = NIL;
        SubLObject cnf_1 = NIL;
        destructuring_bind_must_consp(rule_1, rule_1, $list1);
        mt_1 = rule_1.first();
        SubLObject current = rule_1.rest();
        destructuring_bind_must_consp(current, rule_1, $list1);
        cnf_1 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject mt_2 = NIL;
            SubLObject cnf_2 = NIL;
            destructuring_bind_must_consp(rule_2, rule_2, $list2);
            mt_2 = rule_2.first();
            SubLObject current_$2 = rule_2.rest();
            destructuring_bind_must_consp(current_$2, rule_2, $list2);
            cnf_2 = current_$2.first();
            current_$2 = current_$2.rest();
            if (NIL == current_$2) {
                final SubLObject new_cnf = unify_cnf(cnf_1, cnf_2);
                final SubLObject new_mt = genl_mts.max_floor_mts(list(mt_1, mt_2), UNPROVIDED, UNPROVIDED).first();
                if ((NIL != new_cnf) && (NIL != new_mt)) {
                    return list(new_mt, new_cnf);
                }
            } else {
                cdestructuring_bind_error(rule_2, $list2);
            }
        } else {
            cdestructuring_bind_error(rule_1, $list1);
        }
        return NIL;
    }

    public static SubLObject unify_cnf(final SubLObject cnf_1, final SubLObject cnf_2) {
        final SubLObject neg_lits_1 = clauses.neg_lits(cnf_1);
        final SubLObject pos_lits_1 = clauses.pos_lits(cnf_1);
        final SubLObject neg_lits_2 = clauses.neg_lits(cnf_2);
        final SubLObject pos_lits_2 = clauses.pos_lits(cnf_2);
        final SubLObject v_bindings = unification.unify(neg_lits_1, pos_lits_2, UNPROVIDED, UNPROVIDED);
        unification_utilities.parent_to_child_bindings(unification_utilities.parent_to_unify_bindings(cnf_1, v_bindings), unification_utilities.unify_to_child_bindings(cnf_2));
        if (NIL != v_bindings) {
            return clauses.make_cnf(neg_lits_2, bindings.subst_bindings(v_bindings, pos_lits_1));
        }
        return NIL;
    }

    public static SubLObject ebl_rules(final SubLObject assertions) {
        return Mapping.mapcar(symbol_function(EBL_RULE), assertions);
    }

    public static SubLObject ebl_rule(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        return list(assertions_high.assertion_mt(assertion), assertions_high.assertion_cnf(assertion));
    }

    public static SubLObject construct_one_inference_result_tree(final SubLObject result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_bindings = NIL;
        SubLObject neg_justs = NIL;
        SubLObject pos_justs = NIL;
        destructuring_bind_must_consp(result, result, $list5);
        v_bindings = result.first();
        SubLObject current = result.rest();
        destructuring_bind_must_consp(current, result, $list5);
        neg_justs = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, result, $list5);
        pos_justs = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject tree = NIL;
            final SubLObject justs = reverse(pos_justs);
            final SubLObject root = justs.first();
            final SubLObject _prev_bind_0 = $ebl_justs$.currentBinding(thread);
            try {
                $ebl_justs$.bind(justs.rest(), thread);
                SubLObject current_$4;
                final SubLObject datum_$3 = current_$4 = root;
                SubLObject lit = NIL;
                SubLObject support = NIL;
                SubLObject sub_lits = NIL;
                destructuring_bind_must_consp(current_$4, datum_$3, $list6);
                lit = current_$4.first();
                current_$4 = current_$4.rest();
                destructuring_bind_must_consp(current_$4, datum_$3, $list6);
                support = current_$4.first();
                current_$4 = current_$4.rest();
                destructuring_bind_must_consp(current_$4, datum_$3, $list6);
                sub_lits = current_$4.first();
                current_$4 = current_$4.rest();
                if (NIL == current_$4) {
                    tree = list(cons(lit, $POS), support, Mapping.mapcar(symbol_function(SUB_JUSTS), sub_lits));
                } else {
                    cdestructuring_bind_error(datum_$3, $list6);
                }
            } finally {
                $ebl_justs$.rebind(_prev_bind_0, thread);
            }
            return tree;
        }
        cdestructuring_bind_error(result, $list5);
        return NIL;
    }

    public static SubLObject sub_justs(final SubLObject lit, SubLObject justs) {
        if (justs == UNPROVIDED) {
            justs = $ebl_justs$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tree = NIL;
        final SubLObject just = assoc(lit.first(), justs, symbol_function(EQUAL), UNPROVIDED);
        final SubLObject _prev_bind_0 = $ebl_justs$.currentBinding(thread);
        try {
            $ebl_justs$.bind(remove(just, justs, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            if (NIL != just) {
                SubLObject current;
                final SubLObject datum = current = just;
                SubLObject literal = NIL;
                SubLObject support = NIL;
                SubLObject sub_lits = NIL;
                destructuring_bind_must_consp(current, datum, $list9);
                literal = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list9);
                support = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list9);
                sub_lits = current.first();
                final SubLObject more_supports;
                current = more_supports = current.rest();
                tree = list(lit, support, Mapping.mapcar(symbol_function(SUB_JUSTS), sub_lits));
            }
        } finally {
            $ebl_justs$.rebind(_prev_bind_0, thread);
        }
        if (NIL != tree) {
            return tree;
        }
        if ($ebl_trace$.getDynamicValue(thread).numGE(FOUR_INTEGER)) {
            Errors.sublisp_break($str10$sub_justs____s, new SubLObject[]{ tree });
        } else
            if ($ebl_trace$.getDynamicValue(thread).numGE(THREE_INTEGER)) {
                Errors.warn($str10$sub_justs____s, tree);
            }

        return NIL;
    }

    public static SubLObject collect_justification_compilations(final SubLObject results) {
        SubLObject cdolist_list_var = results;
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            collect_justification_compilation(result);
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject collect_justification_compilation(final SubLObject result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject proof_tree = construct_one_inference_result_tree(result);
        final SubLObject var = compile_proof_tree(proof_tree);
        if (NIL != var) {
            $justification_compilations$.setDynamicValue(cons(var, $justification_compilations$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }

    public static SubLObject compile_proof_tree(final SubLObject proof_tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject compilations = nreverse(proof_tree_compilations(proof_tree));
        if (NIL != compilations) {
            thread.resetMultipleValues();
            final SubLObject rule = perform_ebl_compilations(compilations);
            final SubLObject mts = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ($ebl_trace$.getDynamicValue(thread).numGE(FOUR_INTEGER)) {
                Errors.sublisp_break($str11$ebl_rule___mts_____s____s, new SubLObject[]{ rule, mts });
            } else
                if ($ebl_trace$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                    format(T, $str12$____ebl_rule___mts_____s____s, rule, mts);
                }

            return list(rule, mts);
        }
        return NIL;
    }

    public static SubLObject perform_ebl_compilations(final SubLObject compilations) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mts = ebl_mts(Mapping.mapcar(symbol_function(ASSERTION_MT), list_utilities.cons_tree_gather(compilations, symbol_function(ASSERTION_P), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        SubLObject rule = NIL;
        SubLObject cnf = NIL;
        SubLObject vnames = NIL;
        SubLObject prior = NIL;
        if (NIL != mts) {
            SubLObject cdolist_list_var = compilations;
            SubLObject compilation = NIL;
            compilation = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = compilation;
                SubLObject support_1 = NIL;
                SubLObject support_2 = NIL;
                destructuring_bind_must_consp(current, datum, $list14);
                support_1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list14);
                support_2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject current_$6;
                    final SubLObject datum_$5 = current_$6 = support_1;
                    SubLObject assertion_1 = NIL;
                    SubLObject sense_1 = NIL;
                    SubLObject psn_1 = NIL;
                    destructuring_bind_must_consp(current_$6, datum_$5, $list15);
                    assertion_1 = current_$6.first();
                    current_$6 = current_$6.rest();
                    destructuring_bind_must_consp(current_$6, datum_$5, $list15);
                    sense_1 = current_$6.first();
                    current_$6 = current_$6.rest();
                    destructuring_bind_must_consp(current_$6, datum_$5, $list15);
                    psn_1 = current_$6.first();
                    current_$6 = current_$6.rest();
                    if (NIL == current_$6) {
                        SubLObject current_$7;
                        final SubLObject datum_$6 = current_$7 = support_2;
                        SubLObject assertion_2 = NIL;
                        SubLObject sense_2 = NIL;
                        SubLObject psn_2 = NIL;
                        destructuring_bind_must_consp(current_$7, datum_$6, $list16);
                        assertion_2 = current_$7.first();
                        current_$7 = current_$7.rest();
                        destructuring_bind_must_consp(current_$7, datum_$6, $list16);
                        sense_2 = current_$7.first();
                        current_$7 = current_$7.rest();
                        destructuring_bind_must_consp(current_$7, datum_$6, $list16);
                        psn_2 = current_$7.first();
                        current_$7 = current_$7.rest();
                        if (NIL == current_$7) {
                            if ((sense_1.eql($NEG) && sense_2.eql($POS)) && ((NIL == prior) || prior.eql(assertion_2))) {
                                prior = assertion_1;
                                final SubLObject cnf_1 = copy_tree(assertions_high.assertion_cnf(assertion_1));
                                final SubLObject cnf_2 = (NIL != cnf) ? cnf : copy_tree(assertions_high.assertion_cnf(assertion_2));
                                final SubLObject vnames_1 = copy_list(assertions_high.assertion_variable_names(assertion_1));
                                final SubLObject vnames_2 = (NIL != vnames) ? vnames : copy_list(assertions_high.assertion_variable_names(assertion_2));
                                thread.resetMultipleValues();
                                final SubLObject new_cnf = generalize_support(listS(cnf_1, vnames_1, sense_1, psn_1), listS(cnf_2, vnames_2, sense_2, psn_2));
                                final SubLObject new_vnames = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                cnf = new_cnf;
                                vnames = new_vnames;
                            }
                        } else {
                            cdestructuring_bind_error(datum_$6, $list16);
                        }
                    } else {
                        cdestructuring_bind_error(datum_$5, $list15);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list14);
                }
                cdolist_list_var = cdolist_list_var.rest();
                compilation = cdolist_list_var.first();
            } 
        }
        if (NIL != cnf) {
            rule = fi.perform_fi_substitutions(clauses.cnf_formula(cnf, UNPROVIDED), Mapping.mapcar(symbol_function(INTERN), vnames));
        }
        return values(rule, mts);
    }

    public static SubLObject generalize_support(final SubLObject cnf_vnames_senseXpsn_1, final SubLObject cnf_vnames_senseXpsn_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cnf_1 = NIL;
        SubLObject vnames_1 = NIL;
        SubLObject sense_1 = NIL;
        SubLObject psn_1 = NIL;
        destructuring_bind_must_consp(cnf_vnames_senseXpsn_1, cnf_vnames_senseXpsn_1, $list19);
        cnf_1 = cnf_vnames_senseXpsn_1.first();
        SubLObject current = cnf_vnames_senseXpsn_1.rest();
        destructuring_bind_must_consp(current, cnf_vnames_senseXpsn_1, $list19);
        vnames_1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, cnf_vnames_senseXpsn_1, $list19);
        sense_1 = current.first();
        current = psn_1 = current.rest();
        SubLObject cnf_2 = NIL;
        SubLObject vnames_2 = NIL;
        SubLObject sense_2 = NIL;
        SubLObject psn_2 = NIL;
        destructuring_bind_must_consp(cnf_vnames_senseXpsn_2, cnf_vnames_senseXpsn_2, $list20);
        cnf_2 = cnf_vnames_senseXpsn_2.first();
        SubLObject current_$10 = cnf_vnames_senseXpsn_2.rest();
        destructuring_bind_must_consp(current_$10, cnf_vnames_senseXpsn_2, $list20);
        vnames_2 = current_$10.first();
        current_$10 = current_$10.rest();
        destructuring_bind_must_consp(current_$10, cnf_vnames_senseXpsn_2, $list20);
        sense_2 = current_$10.first();
        current_$10 = psn_2 = current_$10.rest();
        final SubLObject pos_lits_1 = clauses.pos_lits(cnf_1);
        final SubLObject neg_lits_1 = clauses.neg_lits(cnf_1);
        final SubLObject pos_lits_2 = clauses.pos_lits(cnf_2);
        final SubLObject neg_lits_2 = clauses.neg_lits(cnf_2);
        final SubLObject lit_1 = cnf_literal(cnf_1, sense_1, psn_1);
        final SubLObject lit_2 = cnf_literal(cnf_2, sense_2, psn_2);
        final SubLObject blist = unification.unify(lit_1, lit_2, UNPROVIDED, UNPROVIDED);
        final SubLObject parent_to_unify_bindings = unification_utilities.parent_to_unify_bindings(cnf_1, blist);
        final SubLObject new_neg_lits_1 = sublis(parent_to_unify_bindings, remove(lit_1, neg_lits_1, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        final SubLObject new_pos_lits = sublis(parent_to_unify_bindings, pos_lits_1, UNPROVIDED, UNPROVIDED);
        final SubLObject new_cnf = clauses.make_cnf(union(new_neg_lits_1, neg_lits_2, symbol_function(EQUAL), UNPROVIDED), new_pos_lits);
        final SubLObject unify_to_child_bindings = unification_utilities.unify_to_child_bindings(new_cnf);
        final SubLObject parent_to_child_bindings = unification_utilities.parent_to_child_bindings(parent_to_unify_bindings, unify_to_child_bindings);
        final SubLObject cnf = sublis(unify_to_child_bindings, new_cnf, UNPROVIDED, UNPROVIDED);
        final SubLObject vnames = ebl_merge_vnames(vnames_1, vnames_2, parent_to_child_bindings);
        if ($ebl_trace$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
            format(T, $str21$___cnf_1____s, cnf_1);
        }
        if ($ebl_trace$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
            format(T, $str22$___cnf_2____s, cnf_2);
        }
        if ($ebl_trace$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
            format(T, $str23$___lit_1____s, lit_1);
        }
        if ($ebl_trace$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
            format(T, $str24$___lit_2____s, lit_2);
        }
        if ($ebl_trace$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
            format(T, $str25$___blist____s, blist);
        }
        if ($ebl_trace$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
            format(T, $str26$___pos_lits_1____s, pos_lits_1);
        }
        if ($ebl_trace$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
            format(T, $str27$___new_neg_lits_1____s, new_neg_lits_1);
        }
        if ($ebl_trace$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
            format(T, $str28$___neg_lits_2____s, neg_lits_2);
        }
        if ($ebl_trace$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
            format(T, $str29$_____parent_to_unify_bindings____, parent_to_unify_bindings);
        }
        if ($ebl_trace$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
            format(T, $str30$___unify_to_child_bindings____s, unify_to_child_bindings);
        }
        if ($ebl_trace$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
            format(T, $str31$___parent_to_child_bindings____s, parent_to_child_bindings);
        }
        if ($ebl_trace$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
            format(T, $str32$___new_cnf____s, cnf);
        }
        if ($ebl_trace$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
            format(T, $str33$___vnames_1____s, vnames_1);
        }
        if ($ebl_trace$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
            format(T, $str34$___vnames_2____s, vnames_2);
        }
        if ($ebl_trace$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
            format(T, $str35$___new_names____s, vnames);
        }
        if ($ebl_trace$.getDynamicValue(thread).numGE(THREE_INTEGER)) {
            format(T, $str36$___new_rule____s, fi.perform_fi_substitutions(clauses.cnf_formula(copy_tree(cnf), UNPROVIDED), vnames));
        }
        if ($ebl_trace$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
            Errors.sublisp_break($$$stop, EMPTY_SUBL_OBJECT_ARRAY);
        }
        return values(cnf, vnames);
    }

    public static SubLObject ebl_merge_vnames(final SubLObject vnames_1, final SubLObject vnames_2, final SubLObject v_bindings) {
        SubLObject names = NIL;
        final SubLObject n = length(vnames_2);
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject v1 = NIL;
            SubLObject v2 = NIL;
            destructuring_bind_must_consp(current, datum, $list38);
            v1 = current.first();
            current = v2 = current.rest();
            if (variables.variable_id(v2).numGE(n)) {
                names = cons(nth(variables.variable_id(v1), vnames_1), names);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return nconc(vnames_2, nreverse(names));
    }

    public static SubLObject ebl_mts(final SubLObject mts) {
        return genl_mts.max_floor_mts(mts, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cnf_literal(final SubLObject cnf, final SubLObject pos_neg, final SubLObject psn) {
        if (pos_neg.eql($POS)) {
            return nth(psn, clauses.pos_lits(cnf));
        }
        if (pos_neg.eql($NEG)) {
            return nth(psn, clauses.neg_lits(cnf));
        }
        return NIL;
    }

    public static SubLObject proof_trees_compilations(final SubLObject proof_trees) {
        return remove(NIL, Mapping.mapcar(symbol_function(PROOF_TREE_COMPILATIONS), proof_trees), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject proof_tree_compilations(final SubLObject proof_tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject compilations = NIL;
        if (THREE_INTEGER.numE(length(proof_tree))) {
            SubLObject pos_lit_gafXtruth = NIL;
            SubLObject assertion = NIL;
            SubLObject sub_trees = NIL;
            destructuring_bind_must_consp(proof_tree, proof_tree, $list40);
            pos_lit_gafXtruth = proof_tree.first();
            SubLObject current = proof_tree.rest();
            destructuring_bind_must_consp(current, proof_tree, $list40);
            assertion = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, proof_tree, $list40);
            sub_trees = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject current_$12;
                final SubLObject datum_$11 = current_$12 = pos_lit_gafXtruth;
                SubLObject pos_lit_gaf = NIL;
                SubLObject truth = NIL;
                destructuring_bind_must_consp(current_$12, datum_$11, $list41);
                pos_lit_gaf = current_$12.first();
                current_$12 = truth = current_$12.rest();
                if (NIL != assertion_handles.assertion_p(assertion)) {
                    thread.resetMultipleValues();
                    final SubLObject pos_gafs = supporting_gafs(Mapping.mapcar(symbol_function(CAR), sub_trees));
                    final SubLObject neg_gafs = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject cnf = assertions_high.assertion_cnf(assertion);
                    final SubLObject ground_cnf = bind_cnf_with_gafs(cnf, pos_lit_gaf, pos_gafs, neg_gafs);
                    final SubLObject ground_pos_lits = clauses.pos_lits(ground_cnf);
                    final SubLObject ground_neg_lits = clauses.neg_lits(ground_cnf);
                    SubLObject cdolist_list_var = sub_trees;
                    SubLObject sub_tree = NIL;
                    sub_tree = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (length(sub_tree).numGE(THREE_INTEGER)) {
                            SubLObject current_$13;
                            final SubLObject datum_$12 = current_$13 = sub_tree;
                            SubLObject literalXtruth = NIL;
                            SubLObject support = NIL;
                            SubLObject sub_lits = NIL;
                            destructuring_bind_must_consp(current_$13, datum_$12, $list43);
                            literalXtruth = current_$13.first();
                            current_$13 = current_$13.rest();
                            destructuring_bind_must_consp(current_$13, datum_$12, $list43);
                            support = current_$13.first();
                            current_$13 = current_$13.rest();
                            destructuring_bind_must_consp(current_$13, datum_$12, $list43);
                            sub_lits = current_$13.first();
                            final SubLObject more_supports;
                            current_$13 = more_supports = current_$13.rest();
                            if ((NIL != assertion_handles.assertion_p(support)) && (NIL == assertions_high.gaf_assertionP(support))) {
                                SubLObject current_$14;
                                final SubLObject datum_$13 = current_$14 = literalXtruth;
                                SubLObject literal = NIL;
                                SubLObject truth_$17 = NIL;
                                destructuring_bind_must_consp(current_$14, datum_$13, $list44);
                                literal = current_$14.first();
                                current_$14 = truth_$17 = current_$14.rest();
                                SubLObject psn = NIL;
                                SubLObject tv = NIL;
                                final SubLObject pcase_var = truth_$17;
                                if (pcase_var.eql($POS)) {
                                    tv = $NEG;
                                    psn = position(literal, ground_neg_lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($NEG)) {
                                        tv = $POS;
                                        psn = position(literal, ground_pos_lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }

                                compilations = cons(list(list(assertion, tv, psn), list(support, $POS, ZERO_INTEGER)), compilations);
                                compilations = append(compilations, proof_tree_compilations(sub_tree));
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        sub_tree = cdolist_list_var.first();
                    } 
                }
            } else {
                cdestructuring_bind_error(proof_tree, $list40);
            }
        }
        return compilations;
    }

    public static SubLObject supporting_gafs(final SubLObject supports) {
        SubLObject pos_gafs = NIL;
        SubLObject neg_gafs = NIL;
        SubLObject cdolist_list_var = supports;
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pcase_var = support.rest();
            if (pcase_var.eql($POS)) {
                pos_gafs = cons(support.first(), pos_gafs);
            } else
                if (pcase_var.eql($NEG)) {
                    neg_gafs = cons(support.first(), neg_gafs);
                }

            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return values(nreverse(pos_gafs), nreverse(neg_gafs));
    }

    public static SubLObject bind_cnf_with_gafs(final SubLObject cnf, final SubLObject gaf_pos_lit, final SubLObject pos_support_gafs, SubLObject neg_support_gafs) {
        if (neg_support_gafs == UNPROVIDED) {
            neg_support_gafs = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos_lits = clauses.pos_lits(cnf);
        final SubLObject blist = unification.unify(pos_lits, cons(gaf_pos_lit, neg_support_gafs), T, UNPROVIDED);
        final SubLObject neg_lits = bindings.subst_bindings(blist, clauses.neg_lits(cnf));
        final SubLObject blist_2 = unification.unify(neg_lits, pos_support_gafs, T, UNPROVIDED);
        final SubLObject bound_cnf = bindings.subst_bindings(blist_2, bindings.subst_bindings(blist, cnf));
        if ((NIL != bound_cnf) && (NIL != variables.fully_bound_p(bound_cnf))) {
            return bound_cnf;
        }
        if ($ebl_trace$.getDynamicValue(thread).numGE(FOUR_INTEGER)) {
            Errors.sublisp_break($str45$cnf_not_fully_bound__s, new SubLObject[]{ bound_cnf });
        } else
            if ($ebl_trace$.getDynamicValue(thread).numGE(THREE_INTEGER)) {
                Errors.warn($str45$cnf_not_fully_bound__s, bound_cnf);
            }

        return NIL;
    }

    public static SubLObject declare_ebl_file() {
        declareFunction(me, "compile_assertion_list", "COMPILE-ASSERTION-LIST", 1, 0, false);
        declareFunction(me, "compile_rule_list", "COMPILE-RULE-LIST", 1, 0, false);
        declareFunction(me, "compile_rule_pair", "COMPILE-RULE-PAIR", 2, 0, false);
        declareFunction(me, "unify_cnf", "UNIFY-CNF", 2, 0, false);
        declareFunction(me, "ebl_rules", "EBL-RULES", 1, 0, false);
        declareFunction(me, "ebl_rule", "EBL-RULE", 1, 0, false);
        declareFunction(me, "construct_one_inference_result_tree", "CONSTRUCT-ONE-INFERENCE-RESULT-TREE", 1, 0, false);
        declareFunction(me, "sub_justs", "SUB-JUSTS", 1, 1, false);
        declareFunction(me, "collect_justification_compilations", "COLLECT-JUSTIFICATION-COMPILATIONS", 1, 0, false);
        declareFunction(me, "collect_justification_compilation", "COLLECT-JUSTIFICATION-COMPILATION", 1, 0, false);
        declareFunction(me, "compile_proof_tree", "COMPILE-PROOF-TREE", 1, 0, false);
        declareFunction(me, "perform_ebl_compilations", "PERFORM-EBL-COMPILATIONS", 1, 0, false);
        declareFunction(me, "generalize_support", "GENERALIZE-SUPPORT", 2, 0, false);
        declareFunction(me, "ebl_merge_vnames", "EBL-MERGE-VNAMES", 3, 0, false);
        declareFunction(me, "ebl_mts", "EBL-MTS", 1, 0, false);
        declareFunction(me, "cnf_literal", "CNF-LITERAL", 3, 0, false);
        declareFunction(me, "proof_trees_compilations", "PROOF-TREES-COMPILATIONS", 1, 0, false);
        declareFunction(me, "proof_tree_compilations", "PROOF-TREE-COMPILATIONS", 1, 0, false);
        declareFunction(me, "supporting_gafs", "SUPPORTING-GAFS", 1, 0, false);
        declareFunction(me, "bind_cnf_with_gafs", "BIND-CNF-WITH-GAFS", 3, 1, false);
        return NIL;
    }

    public static SubLObject init_ebl_file() {
        defparameter("*EBL-JUSTS*", NIL);
        return NIL;
    }

    public static SubLObject setup_ebl_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_ebl_file();
    }

    @Override
    public void initializeVariables() {
        init_ebl_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_ebl_file();
    }

    
}

/**
 * Total time: 191 ms
 */
