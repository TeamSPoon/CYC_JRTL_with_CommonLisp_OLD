package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class variable_unification
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.variable_unification";
  public static final String myFingerPrint = "9d0e66c6f2e88020263f45ab848a43d619390aeeac2988efb1d0d4cf9a2f283c";
  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 15483L)
  private static SubLSymbol $variable_similarity_default_fudge_factor$;
  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 27423L)
  private static SubLSymbol $literal_set_G_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 30898L)
  private static SubLSymbol $literal_free_variables_cached_caching_state$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$IGNORE;
  private static final SubLSymbol $sym3$APPLY_DEMORGANS;
  private static final SubLList $list4;
  private static final SubLObject $const5$unknownSentence;
  private static final SubLSymbol $sym6$CONVERT_TO_DNF_INT;
  private static final SubLObject $const7$and;
  private static final SubLObject $const8$or;
  private static final SubLSymbol $sym9$COLLAPSE_GROUPS;
  private static final SubLSymbol $sym10$GATHER_DNF_ARG_CONSTRAINTS_INT;
  private static final SubLSymbol $sym11$NULL;
  private static final SubLObject $const12$True;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$VAR2;
  private static final SubLSymbol $sym15$VAR1;
  private static final SubLSymbol $sym16$GET_VAR_MAP_FOR_FORMULA;
  private static final SubLObject $const17$isa;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$COL;
  private static final SubLObject $const20$genls;
  private static final SubLFloat $float21$0_0;
  private static final SubLFloat $float22$1_0;
  private static final SubLSymbol $sym23$VARIABLE_SIMILARITY;
  private static final SubLFloat $float24$1_1;
  private static final SubLSymbol $sym25$VARIABLE_SIMILARITY_ABOUT_THE_SAME_;
  private static final SubLSymbol $sym26$CYC_VAR_;
  private static final SubLSymbol $sym27$FUNCTION_SPEC_P;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$CDR;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$CAR_CDR_EQUAL_;
  private static final SubLSymbol $sym33$FIND_REDUNDANT_LITERALS;
  private static final SubLList $list34;
  private static final SubLObject $const35$not;
  private static final SubLObject $const36$assertedSentence;
  private static final SubLSymbol $sym37$EL_CONJUNCTION_P;
  private static final SubLSymbol $sym38$LITERAL_SET__;
  private static final SubLSymbol $sym39$SET_ELEMENT_LIST;
  private static final SubLSymbol $sym40$STRING_;
  private static final SubLSymbol $sym41$EL_VAR_NAME;
  private static final SubLSymbol $sym42$LITERAL_FREE_VARIABLES_CACHED;
  private static final SubLSymbol $sym43$_LITERAL_FREE_VARIABLES_CACHED_CACHING_STATE_;
  private static final SubLInteger $int44$32;
  private static final SubLSymbol $sym45$FIND_UNCONNECTED_LITERALS;
  private static final SubLSymbol $sym46$FIND_INCONSISTENT_LITERALS;
  private static final SubLSymbol $sym47$ARG_POSITIONS_EQ;
  private static final SubLSymbol $kw48$TEST;
  private static final SubLSymbol $kw49$OWNER;
  private static final SubLSymbol $kw50$CLASSES;
  private static final SubLList $list51;
  private static final SubLSymbol $kw52$KB;
  private static final SubLSymbol $kw53$TINY;
  private static final SubLSymbol $kw54$WORKING_;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$SETS_EQUAL_;
  private static final SubLSymbol $sym57$GET_INCOMPATIBLE_VARIABLES_IN_COMPLEX_SENTENCE_AS_ALIST;
  private static final SubLSymbol $sym58$INCOMPATIBLE_VAR_MAP_ALISTS_EQUAL_;
  private static final SubLSymbol $kw59$FULL;
  private static final SubLObject $list60;
  private static final SubLList $list61;
  private static final SubLList $list62;

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 896L)
  public static SubLObject apply_demorgans(final SubLObject formula)
  {
    if( NIL == el_utilities.el_formula_p( formula ) )
    {
      return formula;
    }
    if( NIL != el_negation_or_unknown_sentence_p( formula ) )
    {
      SubLObject current;
      final SubLObject datum = current = cycl_utilities.formula_terms( formula, UNPROVIDED );
      SubLObject negation_operator = NIL;
      SubLObject negated_sentence = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
      negation_operator = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
      negated_sentence = current.first();
      current = current.rest();
      if( NIL != current )
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
        return NIL;
      }
      if( NIL != el_utilities.el_conjunction_p( negated_sentence ) )
      {
        SubLObject ans = $list1;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( negated_sentence, $kw2$IGNORE );
        SubLObject child = NIL;
        child = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != el_negation_or_unknown_sentence_p( child ) )
          {
            ans = ConsesLow.append( ans, Mapping.mapcar( Symbols.symbol_function( $sym3$APPLY_DEMORGANS ), cycl_utilities.formula_args( child, UNPROVIDED ) ) );
          }
          else
          {
            ans = ConsesLow.append( ans, ConsesLow.list( apply_demorgans( el_utilities.make_unary_formula( negation_operator, child ) ) ) );
          }
          cdolist_list_var = cdolist_list_var.rest();
          child = cdolist_list_var.first();
        }
        return ans;
      }
      if( NIL != el_utilities.el_disjunction_p( negated_sentence ) )
      {
        SubLObject ans = $list4;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( negated_sentence, $kw2$IGNORE );
        SubLObject child = NIL;
        child = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != el_negation_or_unknown_sentence_p( child ) )
          {
            ans = ConsesLow.append( ans, Mapping.mapcar( Symbols.symbol_function( $sym3$APPLY_DEMORGANS ), cycl_utilities.formula_args( child, UNPROVIDED ) ) );
          }
          else
          {
            ans = ConsesLow.append( ans, ConsesLow.list( apply_demorgans( el_utilities.make_unary_formula( negation_operator, child ) ) ) );
          }
          cdolist_list_var = cdolist_list_var.rest();
          child = cdolist_list_var.first();
        }
        return ans;
      }
      if( NIL != el_utilities.el_existential_p( negated_sentence ) )
      {
        return el_utilities.make_universal( el_utilities.quantified_var( negated_sentence ), apply_demorgans( ConsesLow.list( negation_operator, el_utilities.quantified_sub_sentence( negated_sentence ) ) ) );
      }
      if( NIL != el_utilities.el_universal_p( negated_sentence ) )
      {
        return el_utilities.make_existential( el_utilities.quantified_var( negated_sentence ), apply_demorgans( ConsesLow.list( negation_operator, el_utilities.quantified_sub_sentence( negated_sentence ) ) ) );
      }
      return formula;
    }
    else
    {
      if( NIL != el_utilities.el_conjunction_p( formula ) )
      {
        return el_utilities.map_formula_terms( Symbols.symbol_function( $sym3$APPLY_DEMORGANS ), formula, UNPROVIDED );
      }
      if( NIL != el_utilities.el_disjunction_p( formula ) )
      {
        return el_utilities.map_formula_terms( Symbols.symbol_function( $sym3$APPLY_DEMORGANS ), formula, UNPROVIDED );
      }
      return formula;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 2782L)
  public static SubLObject el_negation_or_unknown_sentence_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_utilities.el_negation_p( v_object ) || NIL != el_utilities.el_formula_with_operator_p( v_object, $const5$unknownSentence ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 2936L)
  public static SubLObject separate_bindings_from_sentence(final SubLObject formula)
  {
    return separate_bindings_recursive( formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 3269L)
  public static SubLObject separate_bindings_recursive(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject new_term = v_term;
    SubLObject quantifiers = NIL;
    if( NIL != el_utilities.el_formula_p( v_term ) )
    {
      if( NIL == el_utilities.literalP( v_term ) )
      {
        if( NIL != el_utilities.el_existential_p( v_term ) || NIL != el_utilities.el_universal_p( v_term ) )
        {
          new_term = el_utilities.quantified_sub_sentence( v_term );
          quantifiers = ConsesLow.list( list_utilities.first_n( TWO_INTEGER, v_term ) );
        }
        else
        {
          SubLObject argnum = ZERO_INTEGER;
          SubLObject cdolist_list_var;
          final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( v_term, $kw2$IGNORE );
          SubLObject child = NIL;
          child = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            argnum = Numbers.add( argnum, ONE_INTEGER );
            thread.resetMultipleValues();
            final SubLObject new_arg = separate_bindings_recursive( child );
            final SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            new_term = el_utilities.nreplace_formula_arg( argnum, new_arg, new_term );
            quantifiers = ConsesLow.append( quantifiers, v_bindings );
            cdolist_list_var = cdolist_list_var.rest();
            child = cdolist_list_var.first();
          }
        }
      }
    }
    return Values.values( new_term, quantifiers );
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 3937L)
  public static SubLObject collapse_groups(final SubLObject formula)
  {
    if( NIL == el_utilities.el_formula_p( formula ) || NIL != narts_high.naut_p( formula ) )
    {
      return formula;
    }
    if( NIL == el_utilities.el_conjunction_p( formula ) && NIL == el_utilities.el_disjunction_p( formula ) )
    {
      return formula;
    }
    final SubLObject children = cycl_utilities.formula_args( formula, UNPROVIDED );
    SubLObject new_children = NIL;
    SubLObject cdolist_list_var = children;
    SubLObject child = NIL;
    child = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      child = collapse_groups( child );
      if( child.isList() && child.first().eql( formula.first() ) )
      {
        new_children = ConsesLow.append( new_children, child.rest() );
      }
      else
      {
        new_children = ConsesLow.append( new_children, ConsesLow.list( child ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      child = cdolist_list_var.first();
    }
    if( NIL != list_utilities.lengthE( new_children, ONE_INTEGER, UNPROVIDED ) )
    {
      return new_children.first();
    }
    return el_utilities.make_el_formula( formula.first(), new_children, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 5065L)
  public static SubLObject convert_to_dnf_int(final SubLObject formula)
  {
    if( NIL == el_utilities.el_conjunction_p( formula ) && NIL == el_utilities.el_disjunction_p( formula ) )
    {
      return formula;
    }
    final SubLObject old_operator = formula.first();
    final SubLObject old_children = formula.rest();
    SubLObject new_children = Mapping.mapcar( Symbols.symbol_function( $sym6$CONVERT_TO_DNF_INT ), old_children );
    final SubLObject new_formula = collapse_groups( ConsesLow.cons( old_operator, new_children ) );
    new_children = new_formula.rest();
    if( !new_formula.isList() || !new_formula.first().eql( $const7$and ) )
    {
      return new_formula;
    }
    SubLObject or_child = NIL;
    SubLObject cdolist_list_var = new_children;
    SubLObject child = NIL;
    child = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( child.isList() && child.first().eql( $const8$or ) )
      {
        or_child = child;
      }
      cdolist_list_var = cdolist_list_var.rest();
      child = cdolist_list_var.first();
    }
    if( NIL == or_child )
    {
      return new_formula;
    }
    new_children = Sequences.remove( or_child, new_children, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject or_formula = $list1;
    SubLObject cdolist_list_var2;
    final SubLObject or_children = cdolist_list_var2 = or_child.rest();
    SubLObject child2 = NIL;
    child2 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      child2 = collapse_groups( ConsesLow.append( ConsesLow.cons( $const7$and, new_children ), ConsesLow.list( child2 ) ) );
      or_formula = ConsesLow.cons( child2, or_formula );
      cdolist_list_var2 = cdolist_list_var2.rest();
      child2 = cdolist_list_var2.first();
    }
    or_formula = Sequences.reverse( or_formula );
    return collapse_groups( ConsesLow.cons( or_formula.first(), Mapping.mapcar( Symbols.symbol_function( $sym9$COLLAPSE_GROUPS ), Mapping.mapcar( Symbols.symbol_function( $sym6$CONVERT_TO_DNF_INT ), or_formula
        .rest() ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 6791L)
  public static SubLObject convert_to_dnf(final SubLObject formula, SubLObject apply_demorgansP)
  {
    if( apply_demorgansP == UNPROVIDED )
    {
      apply_demorgansP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject new_formula = separate_bindings_from_sentence( ( NIL != apply_demorgansP ) ? apply_demorgans( formula ) : conses_high.copy_list( formula ) );
    final SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    new_formula = collapse_groups( new_formula );
    new_formula = convert_to_dnf_int( new_formula );
    SubLObject cdolist_list_var = v_bindings;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      new_formula = ConsesLow.append( binding, ConsesLow.list( new_formula ) );
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return new_formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 7409L)
  public static SubLObject gather_dnf_arg_constraints_int(final SubLObject formula, final SubLObject mt)
  {
    if( NIL == el_utilities.el_formula_p( formula ) )
    {
      return NIL;
    }
    final SubLObject args = cycl_utilities.formula_args( formula, UNPROVIDED );
    final SubLObject mt_list = ConsesLow.make_list( Sequences.length( args ), mt );
    SubLObject ans = ( NIL != el_utilities.el_conjunction_p( formula ) ) ? simplifier.conjoin( Mapping.mapcar( Symbols.symbol_function( $sym10$GATHER_DNF_ARG_CONSTRAINTS_INT ), args, new SubLObject[] { mt_list
    } ), UNPROVIDED ) : ( ( NIL != el_utilities.el_disjunction_p( formula ) ) ? simplifier.disjoin( Mapping.mapcar( Symbols.symbol_function( $sym10$GATHER_DNF_ARG_CONSTRAINTS_INT ), args, new SubLObject[] { mt_list
    } ), UNPROVIDED )
        : ( ( NIL != el_utilities.el_existential_p( formula ) ) ? el_utilities.replace_formula_arg( TWO_INTEGER, gather_dnf_arg_constraints_int( cycl_utilities.formula_arg2( formula, UNPROVIDED ), mt ), formula )
            : ( ( NIL != el_utilities.el_universal_p( formula ) ) ? el_utilities.replace_formula_arg( TWO_INTEGER, gather_dnf_arg_constraints_int( cycl_utilities.formula_arg2( formula, UNPROVIDED ), mt ), formula )
                : ( ( NIL != el_negation_or_unknown_sentence_p( formula ) ) ? gather_dnf_arg_constraints_int( cycl_utilities.formula_arg1( formula, UNPROVIDED ), mt )
                    : at_var_types.formula_variables_arg_constraints( formula, mt, UNPROVIDED ) ) ) ) );
    ans = list_utilities.tree_remove_all_if( Symbols.symbol_function( $sym11$NULL ), ans, UNPROVIDED );
    ans = collapse_groups( ans );
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 8493L)
  public static SubLObject gather_dnf_arg_constraints(final SubLObject formula, final SubLObject mt)
  {
    final SubLObject dnf = convert_to_dnf( formula, UNPROVIDED );
    final SubLObject constraints = gather_dnf_arg_constraints_int( dnf, mt );
    return convert_to_dnf( constraints, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 8818L)
  public static SubLObject can_unifyP(final SubLObject formula, final SubLObject var1, final SubLObject var2, final SubLObject mt)
  {
    return makeBoolean( NIL == Sequences.find( var2, dictionary.dictionary_lookup( get_incompatible_variables_in_complex_sentence( formula, mt ), var1, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 9193L)
  public static SubLObject get_incompatible_variables_in_complex_sentence(final SubLObject formula, final SubLObject mt)
  {
    final SubLObject constraint_disjunction = gather_dnf_arg_constraints( formula, mt );
    final SubLObject constraints = ( NIL != el_utilities.el_disjunction_p( constraint_disjunction ) ) ? cycl_utilities.formula_args( constraint_disjunction, UNPROVIDED )
        : ( ( NIL != constraint_disjunction ) ? ConsesLow.list( constraint_disjunction ) : NIL );
    final SubLObject incompatibles = find_irreflexive_incompatibles( formula, mt );
    if( NIL != list_utilities.non_empty_list_p( constraints ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject vars = cdolist_list_var = el_utilities.sentence_variables( formula, UNPROVIDED, UNPROVIDED );
      SubLObject var1 = NIL;
      var1 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$1 = vars;
        SubLObject var2 = NIL;
        var2 = cdolist_list_var_$1.first();
        while ( NIL != cdolist_list_var_$1)
        {
          if( NIL == known_incompatible_varsP( incompatibles, var1, var2 ) )
          {
            SubLObject candidateP = NIL;
            SubLObject compatibleP = NIL;
            SubLObject cdolist_list_var_$2 = constraints;
            SubLObject possibility = NIL;
            possibility = cdolist_list_var_$2.first();
            while ( NIL != cdolist_list_var_$2)
            {
              if( NIL != list_utilities.tree_find( var1, possibility, UNPROVIDED, UNPROVIDED ) && NIL != list_utilities.tree_find( var2, possibility, UNPROVIDED, UNPROVIDED ) )
              {
                candidateP = T;
                final SubLObject varmap = get_var_map_for_formula( possibility, mt );
                add_incompatibles( value_tables.variable_mapping_table_incompatibles( varmap ), incompatibles );
                if( NIL == known_incompatible_varsP( incompatibles, var1, var2 ) )
                {
                  compatibleP = T;
                }
              }
              cdolist_list_var_$2 = cdolist_list_var_$2.rest();
              possibility = cdolist_list_var_$2.first();
            }
            if( NIL != candidateP && NIL == compatibleP )
            {
              dictionary_utilities.dictionary_pushnew( incompatibles, var1, var2, UNPROVIDED, UNPROVIDED );
              dictionary_utilities.dictionary_pushnew( incompatibles, var2, var1, UNPROVIDED, UNPROVIDED );
            }
          }
          cdolist_list_var_$1 = cdolist_list_var_$1.rest();
          var2 = cdolist_list_var_$1.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        var1 = cdolist_list_var.first();
      }
      return incompatibles;
    }
    final SubLObject varmap2 = get_var_map_for_formula( constraints, mt );
    add_incompatibles( value_tables.variable_mapping_table_incompatibles( varmap2 ), incompatibles );
    return incompatibles;
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 10792L)
  public static SubLObject find_irreflexive_incompatibles(final SubLObject formula, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject incompatibles = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    final SubLObject clausal_form = clausifier.cnf_clausal_form( formula, mt );
    if( !$const12$True.eql( clausal_form ) )
    {
      SubLObject cdolist_list_var = clausal_form;
      SubLObject disjunction = NIL;
      disjunction = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$3 = disjunction;
        SubLObject lits = NIL;
        lits = cdolist_list_var_$3.first();
        while ( NIL != cdolist_list_var_$3)
        {
          SubLObject cdolist_list_var_$4 = lits;
          SubLObject lit = NIL;
          lit = cdolist_list_var_$4.first();
          while ( NIL != cdolist_list_var_$4)
          {
            thread.resetMultipleValues();
            final SubLObject success = formula_pattern_match.formula_matches_pattern( lit, $list13 );
            final SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != success )
            {
              final SubLObject var2 = list_utilities.alist_lookup_without_values( v_bindings, $sym14$VAR2, UNPROVIDED, UNPROVIDED );
              final SubLObject var3 = list_utilities.alist_lookup_without_values( v_bindings, $sym15$VAR1, UNPROVIDED, UNPROVIDED );
              dictionary_utilities.dictionary_pushnew( incompatibles, var3, var2, UNPROVIDED, UNPROVIDED );
              dictionary_utilities.dictionary_pushnew( incompatibles, var2, var3, UNPROVIDED, UNPROVIDED );
            }
            cdolist_list_var_$4 = cdolist_list_var_$4.rest();
            lit = cdolist_list_var_$4.first();
          }
          cdolist_list_var_$3 = cdolist_list_var_$3.rest();
          lits = cdolist_list_var_$3.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        disjunction = cdolist_list_var.first();
      }
    }
    return incompatibles;
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 11565L)
  public static SubLObject add_incompatibles(SubLObject source, final SubLObject target)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( source ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject var = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject incompatible_vars = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject cdolist_list_var = incompatible_vars;
      SubLObject incompatible_var = NIL;
      incompatible_var = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        dictionary_utilities.dictionary_pushnew( target, var, incompatible_var, UNPROVIDED, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        incompatible_var = cdolist_list_var.first();
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return target;
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 11787L)
  public static SubLObject known_incompatible_varsP(final SubLObject incompatibles, final SubLObject var1, final SubLObject var2)
  {
    return Sequences.find( var2, dictionary.dictionary_lookup_without_values( incompatibles, var1, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 11930L)
  public static SubLObject get_var_map_for_formula_internal(final SubLObject formula, final SubLObject mt)
  {
    return value_tables.get_variable_mapping_table_for_formulas( formula, formula, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 11930L)
  public static SubLObject get_var_map_for_formula(final SubLObject formula, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return get_var_map_for_formula_internal( formula, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym16$GET_VAR_MAP_FOR_FORMULA, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym16$GET_VAR_MAP_FOR_FORMULA, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym16$GET_VAR_MAP_FOR_FORMULA, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( formula, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( formula.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( get_var_map_for_formula_internal( formula, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( formula, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 12090L)
  public static SubLObject get_incompatible_variables_in_complex_sentence_as_alist(final SubLObject formula, final SubLObject mt)
  {
    final SubLObject v_dictionary = get_incompatible_variables_in_complex_sentence( formula, mt );
    return dictionary_utilities.dictionary_to_alist( v_dictionary );
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 12452L)
  public static SubLObject gather_constraining_types_for_variable_in_constraint_conjunction(final SubLObject formula, final SubLObject var, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.el_universal_p( formula ) || NIL != el_utilities.el_general_existential_p( formula ) )
    {
      return gather_constraining_types_for_variable_in_constraint_conjunction( el_utilities.quantified_sub_sentence( formula ), var, mt );
    }
    final SubLObject literals = ( NIL != el_utilities.el_conjunction_p( formula ) ) ? cycl_utilities.formula_args( formula, UNPROVIDED ) : ConsesLow.list( formula );
    final SubLObject isa_types = set.new_set( UNPROVIDED, UNPROVIDED );
    final SubLObject genls_types = set.new_set( UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = literals;
    SubLObject literal = NIL;
    literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != el_negation_or_unknown_sentence_p( literal ) )
      {
        literal = cycl_utilities.formula_arg1( literal, UNPROVIDED );
        thread.resetMultipleValues();
        SubLObject success = formula_pattern_match.formula_matches_pattern( literal, ConsesLow.listS( $const17$isa, var, $list18 ) );
        SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != success )
        {
          final SubLObject col = list_utilities.alist_lookup_without_values( v_bindings, $sym19$COL, UNPROVIDED, UNPROVIDED );
          set_utilities.set_remove_all( genls.all_specs( col, mt, UNPROVIDED ), isa_types );
        }
        thread.resetMultipleValues();
        success = formula_pattern_match.formula_matches_pattern( literal, ConsesLow.listS( $const20$genls, var, $list18 ) );
        v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != success )
        {
          final SubLObject col = list_utilities.alist_lookup_without_values( v_bindings, $sym19$COL, UNPROVIDED, UNPROVIDED );
          set_utilities.set_remove_all( genls.all_specs( col, mt, UNPROVIDED ), genls_types );
        }
      }
      else
      {
        thread.resetMultipleValues();
        SubLObject success = formula_pattern_match.formula_matches_pattern( literal, ConsesLow.listS( $const17$isa, var, $list18 ) );
        SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != success )
        {
          final SubLObject col = list_utilities.alist_lookup_without_values( v_bindings, $sym19$COL, UNPROVIDED, UNPROVIDED );
          set_utilities.set_add_all( genls.all_genls( col, mt, UNPROVIDED ), isa_types );
        }
        thread.resetMultipleValues();
        success = formula_pattern_match.formula_matches_pattern( literal, ConsesLow.listS( $const20$genls, var, $list18 ) );
        v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != success )
        {
          final SubLObject col = list_utilities.alist_lookup_without_values( v_bindings, $sym19$COL, UNPROVIDED, UNPROVIDED );
          set_utilities.set_add_all( genls.all_genls( col, mt, UNPROVIDED ), genls_types );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      literal = cdolist_list_var.first();
    }
    return Values.values( isa_types, genls_types );
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 13675L)
  public static SubLObject variable_similarity_given_constraint_conjunction(final SubLObject formula, final SubLObject var1, final SubLObject var2, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject isa_types1 = gather_constraining_types_for_variable_in_constraint_conjunction( formula, var1, mt );
    final SubLObject genls_types1 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject isa_types2 = gather_constraining_types_for_variable_in_constraint_conjunction( formula, var2, mt );
    final SubLObject genls_types2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( ( set.set_size( isa_types1 ).numG( ZERO_INTEGER ) && set.set_size( isa_types2 ).numG( ZERO_INTEGER ) ) || ( set.set_size( genls_types1 ).numG( ZERO_INTEGER ) && set.set_size( genls_types2 ).numG(
        ZERO_INTEGER ) ) )
    {
      final SubLObject isa_types3 = set_utilities.set_intersection( ConsesLow.list( isa_types1, isa_types2 ), UNPROVIDED );
      final SubLObject genls_types3 = set_utilities.set_intersection( ConsesLow.list( genls_types1, genls_types2 ), UNPROVIDED );
      SubLObject score = $float21$0_0;
      SubLObject set_contents_var = set.do_set_internal( isa_types3 );
      SubLObject basis_object;
      SubLObject state;
      SubLObject type;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        type = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, type ) )
        {
          score = Numbers.add( score, Numbers.divide( $float22$1_0, Numbers.add( ONE_INTEGER, cardinality_estimates.generality_estimate( type ) ) ) );
        }
      }
      set_contents_var = set.do_set_internal( genls_types3 );
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        type = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, type ) )
        {
          score = Numbers.add( score, Numbers.divide( $float22$1_0, Numbers.add( ONE_INTEGER, cardinality_estimates.generality_estimate( type ) ) ) );
        }
      }
      return score;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 14718L)
  public static SubLObject variable_similarity_internal(final SubLObject formula, final SubLObject var1, final SubLObject var2, final SubLObject mt)
  {
    SubLObject total = $float21$0_0;
    SubLObject count = ZERO_INTEGER;
    final SubLObject constraints = gather_dnf_arg_constraints( formula, mt );
    SubLObject cdolist_list_var;
    final SubLObject constraint_conjunctions = cdolist_list_var = ( constraints.isList() && constraints.first().eql( $const8$or ) ) ? constraints.rest() : ConsesLow.list( constraints );
    SubLObject constraint_conjunction = NIL;
    constraint_conjunction = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject v_similarity = variable_similarity_given_constraint_conjunction( constraint_conjunction, var1, var2, mt );
      if( NIL != v_similarity )
      {
        total = Numbers.add( v_similarity, total );
        count = Numbers.add( count, ONE_INTEGER );
      }
      cdolist_list_var = cdolist_list_var.rest();
      constraint_conjunction = cdolist_list_var.first();
    }
    if( count.numG( ZERO_INTEGER ) )
    {
      return Numbers.divide( total, count );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 14718L)
  public static SubLObject variable_similarity(final SubLObject formula, final SubLObject var1, final SubLObject var2, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return variable_similarity_internal( formula, var1, var2, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym23$VARIABLE_SIMILARITY, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym23$VARIABLE_SIMILARITY, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym23$VARIABLE_SIMILARITY, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( formula, var1, var2, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( formula.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( var1.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( var2.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
              {
                return memoization_state.caching_results( results2 );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( variable_similarity_internal( formula, var1, var2, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( formula, var1, var2, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 15552L)
  public static SubLObject variable_similarity_about_the_sameP(final SubLObject sim1, final SubLObject sim2, SubLObject fudge_factor)
  {
    if( fudge_factor == UNPROVIDED )
    {
      fudge_factor = $variable_similarity_default_fudge_factor$.getGlobalValue();
    }
    if( sim1.numE( sim2 ) )
    {
      return T;
    }
    if( fudge_factor.numG( ZERO_INTEGER ) && Numbers.multiply( fudge_factor, sim1 ).numG( sim2 ) && Numbers.multiply( fudge_factor, sim2 ).numG( sim1 ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 15863L)
  public static SubLObject attempt_to_combine_variables_in_complex_combination(final SubLObject formula, final SubLObject source_formula, final SubLObject target_formula, final SubLObject elmt,
      SubLObject allow_duplicate_literalsP, SubLObject free_variables_onlyP, SubLObject varP)
  {
    if( allow_duplicate_literalsP == UNPROVIDED )
    {
      allow_duplicate_literalsP = NIL;
    }
    if( free_variables_onlyP == UNPROVIDED )
    {
      free_variables_onlyP = T;
    }
    if( varP == UNPROVIDED )
    {
      varP = $sym26$CYC_VAR_;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.function_spec_p( varP ) : varP;
    SubLObject result = NIL;
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        final SubLObject incompatibles = get_incompatible_variables_in_complex_sentence( formula, elmt );
        final SubLObject source_vars = ( NIL != free_variables_onlyP ) ? el_utilities.sentence_free_variables( source_formula, NIL, varP, UNPROVIDED )
            : list_utilities.tree_gather( source_formula, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        final SubLObject target_vars = ( NIL != free_variables_onlyP ) ? el_utilities.sentence_free_variables( target_formula, NIL, varP, UNPROVIDED )
            : list_utilities.tree_gather( target_formula, varP, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        final SubLObject hit_count = dictionary.new_dictionary( Symbols.symbol_function( EQL ), TEN_INTEGER );
        SubLObject matches = NIL;
        SubLObject cdolist_list_var = source_vars;
        SubLObject source_var_i = NIL;
        source_var_i = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject cdolist_list_var_$5 = target_vars;
          SubLObject target_var_j = NIL;
          target_var_j = cdolist_list_var_$5.first();
          while ( NIL != cdolist_list_var_$5)
          {
            final SubLObject incomp = dictionary.dictionary_lookup( incompatibles, source_var_i, UNPROVIDED );
            final SubLObject redundant = new_redundant_literals( formula, elmt, source_var_i, target_var_j );
            if( NIL != Functions.funcall( varP, source_var_i ) && NIL != Functions.funcall( varP, target_var_j ) )
            {
              SubLObject possibleP = makeBoolean( NIL != allow_duplicate_literalsP || NIL == redundant );
              if( NIL != incomp && NIL != possibleP && NIL != subl_promotions.memberP( target_var_j, incomp, UNPROVIDED, UNPROVIDED ) )
              {
                possibleP = NIL;
              }
              if( NIL != possibleP && !source_var_i.eql( target_var_j ) )
              {
                matches = list_utilities.alist_push( matches, source_var_i, target_var_j, UNPROVIDED );
                dictionary_utilities.dictionary_increment( hit_count, source_var_i, UNPROVIDED );
                dictionary_utilities.dictionary_increment( hit_count, target_var_j, UNPROVIDED );
              }
            }
            cdolist_list_var_$5 = cdolist_list_var_$5.rest();
            target_var_j = cdolist_list_var_$5.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          source_var_i = cdolist_list_var.first();
        }
        cdolist_list_var = matches;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = cons;
          SubLObject var1 = NIL;
          SubLObject vars = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
          var1 = current.first();
          current = ( vars = current.rest() );
          if( NIL != list_utilities.singletonP( vars ) )
          {
            final SubLObject var2 = list_utilities.only_one( vars );
            final SubLObject var1_count = dictionary.dictionary_lookup_without_values( hit_count, var1, UNPROVIDED );
            final SubLObject var2_count = dictionary.dictionary_lookup_without_values( hit_count, var2, UNPROVIDED );
            if( var1_count.eql( ONE_INTEGER ) && var2_count.eql( ONE_INTEGER ) )
            {
              result = list_utilities.alist_enter( result, var1, var2, UNPROVIDED );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          cons = cdolist_list_var.first();
        }
        if( NIL == result && NIL == list_utilities.empty_list_p( matches ) )
        {
          result = pick_variable_to_combine( matches, formula, elmt, allow_duplicate_literalsP );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 18933L)
  public static SubLObject pick_variable_to_combine(final SubLObject matches, final SubLObject formula, final SubLObject elmt, final SubLObject allow_duplicate_literalsP)
  {
    SubLObject scored = NIL;
    SubLObject cdolist_list_var = matches;
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject source_var = NIL;
      SubLObject target_vars = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
      source_var = current.first();
      current = current.rest();
      SubLObject cdolist_list_var_$7;
      target_vars = ( cdolist_list_var_$7 = current );
      SubLObject target_var = NIL;
      target_var = cdolist_list_var_$7.first();
      while ( NIL != cdolist_list_var_$7)
      {
        if( NIL != allow_duplicate_literalsP || NIL == new_redundant_literals( formula, elmt, source_var, target_var ) )
        {
          final SubLObject score = variable_similarity( formula, source_var, target_var, elmt );
          if( NIL != score )
          {
            scored = list_utilities.alist_enter( scored, ConsesLow.cons( source_var, target_var ), score, UNPROVIDED );
          }
        }
        cdolist_list_var_$7 = cdolist_list_var_$7.rest();
        target_var = cdolist_list_var_$7.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    final SubLObject duplicates = list_utilities.duplicates( scored, $sym25$VARIABLE_SIMILARITY_ABOUT_THE_SAME_, $sym30$CDR );
    SubLObject non_duplicates = conses_high.copy_list( scored );
    SubLObject cdolist_list_var2 = duplicates;
    SubLObject duplicate = NIL;
    duplicate = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      non_duplicates = Sequences.delete( duplicate.rest(), non_duplicates, $sym25$VARIABLE_SIMILARITY_ABOUT_THE_SAME_, $sym30$CDR, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      cdolist_list_var2 = cdolist_list_var2.rest();
      duplicate = cdolist_list_var2.first();
    }
    if( NIL != list_utilities.non_empty_list_p( non_duplicates ) )
    {
      final SubLObject best = number_utilities.maximum( non_duplicates, $sym30$CDR ).first();
      return ConsesLow.list( best );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 19982L)
  public static SubLObject literals_redundantP(final SubLObject literal1, final SubLObject literal2, final SubLObject mt, SubLObject var1, SubLObject var2)
  {
    if( var1 == UNPROVIDED )
    {
      var1 = NIL;
    }
    if( var2 == UNPROVIDED )
    {
      var2 = NIL;
    }
    if( !Sequences.length( literal1 ).numE( Sequences.length( literal2 ) ) )
    {
      return NIL;
    }
    SubLObject argpos = ZERO_INTEGER;
    SubLObject arg1 = NIL;
    SubLObject arg1_$8 = NIL;
    SubLObject arg2 = NIL;
    SubLObject arg2_$9 = NIL;
    arg1 = literal1;
    arg1_$8 = arg1.first();
    arg2 = literal2;
    arg2_$9 = arg2.first();
    while ( NIL != arg2 || NIL != arg1)
    {
      if( ( NIL != var1 && NIL != var2 && ( ( NIL == Sequences.find( var1, literal1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL == Sequences.find( var2, literal1, UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED ) ) || ( NIL == Sequences.find( var1, literal2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL == Sequences.find( var2, literal2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ) )
          || ( ( !argpos.numE( ZERO_INTEGER ) || ( NIL == genl_predicates.genl_predP( arg1_$8, arg2_$9, mt, UNPROVIDED ) && NIL == genl_predicates.genl_predP( arg2_$9, arg1_$8, mt, UNPROVIDED ) ) )
              && ( NIL == cycl_variables.cyc_varP( arg1_$8 ) || !arg1_$8.equal( arg2_$9 ) ) && ( NIL == var1 || NIL == var2 || ( ( !arg1_$8.equal( var1 ) || !arg2_$9.equal( var2 ) ) && ( !arg1_$8.equal( var2 )
                  || !arg2_$9.equal( var1 ) ) ) ) && ( NIL != cycl_variables.cyc_varP( arg1_$8 ) || NIL != cycl_variables.cyc_varP( arg2_$9 ) || ( NIL == genls.genlsP( arg1_$8, arg2_$9, mt, UNPROVIDED ) && NIL == genls
                      .genlsP( arg2_$9, arg1_$8, mt, UNPROVIDED ) ) ) ) )
      {
        return NIL;
      }
      argpos = Numbers.add( argpos, ONE_INTEGER );
      arg1 = arg1.rest();
      arg1_$8 = arg1.first();
      arg2 = arg2.rest();
      arg2_$9 = arg2.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 21297L)
  public static SubLObject redundant_literals_in_conjunctionP(final SubLObject formula, final SubLObject mt, SubLObject var1, SubLObject var2)
  {
    if( var1 == UNPROVIDED )
    {
      var1 = NIL;
    }
    if( var2 == UNPROVIDED )
    {
      var2 = NIL;
    }
    SubLObject redundant_pairs = NIL;
    if( NIL != formula_pattern_match.formula_matches_pattern( formula, $list31 ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject literals = cdolist_list_var = cycl_utilities.formula_args( formula, UNPROVIDED );
      SubLObject literal1 = NIL;
      literal1 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$10 = literals;
        SubLObject literal2 = NIL;
        literal2 = cdolist_list_var_$10.first();
        while ( NIL != cdolist_list_var_$10)
        {
          if( !literal1.eql( literal2 ) && NIL != literals_redundantP( literal1, literal2, mt, var1, var2 ) )
          {
            redundant_pairs = ConsesLow.cons( ConsesLow.cons( literal1, literal2 ), redundant_pairs );
          }
          cdolist_list_var_$10 = cdolist_list_var_$10.rest();
          literal2 = cdolist_list_var_$10.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        literal1 = cdolist_list_var.first();
      }
    }
    return redundant_pairs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 22124L)
  public static SubLObject new_redundant_literals(final SubLObject formula, final SubLObject mt, final SubLObject var1, final SubLObject var2)
  {
    return Sequences.remove_if( $sym32$CAR_CDR_EQUAL_, find_redundant_literals_int( formula, mt, var1, var2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 22524L)
  public static SubLObject car_cdr_equalP(final SubLObject pair)
  {
    return Equality.equal( pair.first(), pair.rest() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 22602L)
  public static SubLObject find_redundant_literals(final SubLObject formula, final SubLObject mt)
  {
    return find_redundant_literals_int( formula, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 22841L)
  public static SubLObject find_redundant_literals_int(SubLObject formula, final SubLObject mt, SubLObject var1, SubLObject var2)
  {
    if( var1 == UNPROVIDED )
    {
      var1 = NIL;
    }
    if( var2 == UNPROVIDED )
    {
      var2 = NIL;
    }
    formula = convert_to_dnf( formula, UNPROVIDED );
    formula = separate_bindings_from_sentence( formula );
    if( NIL != formula_pattern_match.formula_matches_pattern( formula, $list34 ) )
    {
      SubLObject redundant_pairs = NIL;
      SubLObject cdolist_list_var;
      final SubLObject conjunctions = cdolist_list_var = cycl_utilities.formula_args( formula, UNPROVIDED );
      SubLObject conjunction = NIL;
      conjunction = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        redundant_pairs = ConsesLow.append( redundant_pairs, redundant_literals_in_conjunctionP( conjunction, mt, var1, var2 ) );
        cdolist_list_var = cdolist_list_var.rest();
        conjunction = cdolist_list_var.first();
      }
      return redundant_pairs;
    }
    return redundant_literals_in_conjunctionP( formula, mt, var1, var2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 23733L)
  public static SubLObject shortest_paths_between_variables_in_conjunction(final SubLObject formula)
  {
    final SubLObject v_variables = el_utilities.sentence_variables( formula, UNPROVIDED, UNPROVIDED );
    final SubLObject variable_count = Sequences.length( v_variables );
    final SubLObject literals = ( formula.isList() && formula.first().eql( $const7$and ) ) ? formula.rest() : ConsesLow.list( formula );
    final SubLObject shortest_paths = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    SubLObject cdolist_list_var = literals;
    SubLObject literal = NIL;
    literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$11;
      final SubLObject literal_variables = cdolist_list_var_$11 = el_utilities.sentence_variables( literal, UNPROVIDED, UNPROVIDED );
      SubLObject var1 = NIL;
      var1 = cdolist_list_var_$11.first();
      while ( NIL != cdolist_list_var_$11)
      {
        SubLObject cdolist_list_var_$12 = literal_variables;
        SubLObject var2 = NIL;
        var2 = cdolist_list_var_$12.first();
        while ( NIL != cdolist_list_var_$12)
        {
          if( var1.eql( var2 ) )
          {
            dictionary.dictionary_enter( shortest_paths, ConsesLow.list( var1, var2 ), ZERO_INTEGER );
          }
          else
          {
            dictionary.dictionary_enter( shortest_paths, ConsesLow.list( var1, var2 ), ONE_INTEGER );
          }
          cdolist_list_var_$12 = cdolist_list_var_$12.rest();
          var2 = cdolist_list_var_$12.first();
        }
        cdolist_list_var_$11 = cdolist_list_var_$11.rest();
        var1 = cdolist_list_var_$11.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      literal = cdolist_list_var.first();
    }
    SubLObject i;
    SubLObject cdolist_list_var2;
    SubLObject var3;
    SubLObject cdolist_list_var_$13;
    SubLObject var4;
    SubLObject shortest_path;
    SubLObject cdolist_list_var_$14;
    SubLObject var1_2;
    SubLObject d1;
    SubLObject d2;
    SubLObject path_length;
    for( i = NIL, i = ZERO_INTEGER; i.numL( variable_count ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      cdolist_list_var2 = v_variables;
      var3 = NIL;
      var3 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        cdolist_list_var_$13 = v_variables;
        var4 = NIL;
        var4 = cdolist_list_var_$13.first();
        while ( NIL != cdolist_list_var_$13)
        {
          if( NIL == dictionary_utilities.dictionary_has_keyP( shortest_paths, ConsesLow.list( var3, var4 ) ) )
          {
            shortest_path = NIL;
            cdolist_list_var_$14 = v_variables;
            var1_2 = NIL;
            var1_2 = cdolist_list_var_$14.first();
            while ( NIL != cdolist_list_var_$14)
            {
              d1 = dictionary.dictionary_lookup( shortest_paths, ConsesLow.list( var3, var1_2 ), UNPROVIDED );
              d2 = dictionary.dictionary_lookup( shortest_paths, ConsesLow.list( var1_2, var4 ), UNPROVIDED );
              path_length = ( NIL != d1 && NIL != d2 ) ? Numbers.add( d1, d2 ) : NIL;
              if( NIL != path_length && ( NIL == shortest_path || path_length.numL( shortest_path ) ) )
              {
                dictionary.dictionary_enter( shortest_paths, ConsesLow.list( var3, var4 ), path_length );
              }
              cdolist_list_var_$14 = cdolist_list_var_$14.rest();
              var1_2 = cdolist_list_var_$14.first();
            }
          }
          cdolist_list_var_$13 = cdolist_list_var_$13.rest();
          var4 = cdolist_list_var_$13.first();
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        var3 = cdolist_list_var2.first();
      }
    }
    return dictionary_utilities.dictionary_to_alist( shortest_paths );
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 25579L)
  public static SubLObject find_fully_connected_subsets_in_conjunction(final SubLObject formula)
  {
    SubLObject sets = NIL;
    final SubLObject v_variables = el_utilities.sentence_variables( formula, UNPROVIDED, UNPROVIDED );
    final SubLObject literals = ( NIL != el_utilities.el_conjunction_p( formula ) ) ? cycl_utilities.formula_args( formula, UNPROVIDED ) : ConsesLow.list( formula );
    SubLObject cdolist_list_var = v_variables;
    SubLObject variable = NIL;
    variable = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject v_set = set.new_set( Symbols.symbol_function( EQL ), UNPROVIDED );
      set.set_add( variable, v_set );
      sets = ConsesLow.cons( v_set, sets );
      cdolist_list_var = cdolist_list_var.rest();
      variable = cdolist_list_var.first();
    }
    cdolist_list_var = literals;
    SubLObject literal = NIL;
    literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$15;
      final SubLObject literal_variables = cdolist_list_var_$15 = el_utilities.sentence_variables( literal, UNPROVIDED, UNPROVIDED );
      SubLObject var1 = NIL;
      var1 = cdolist_list_var_$15.first();
      while ( NIL != cdolist_list_var_$15)
      {
        SubLObject cdolist_list_var_$16 = literal_variables;
        SubLObject var2 = NIL;
        var2 = cdolist_list_var_$16.first();
        while ( NIL != cdolist_list_var_$16)
        {
          if( !var1.eql( var2 ) )
          {
            SubLObject var1_set = NIL;
            SubLObject var2_set = NIL;
            SubLObject cdolist_list_var_$17 = sets;
            SubLObject v_set2 = NIL;
            v_set2 = cdolist_list_var_$17.first();
            while ( NIL != cdolist_list_var_$17)
            {
              if( NIL != set.set_memberP( var1, v_set2 ) )
              {
                var1_set = v_set2;
              }
              if( NIL != set.set_memberP( var2, v_set2 ) )
              {
                var2_set = v_set2;
              }
              cdolist_list_var_$17 = cdolist_list_var_$17.rest();
              v_set2 = cdolist_list_var_$17.first();
            }
            if( !var1_set.eql( var2_set ) )
            {
              sets = Sequences.remove( var1_set, sets, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              sets = Sequences.remove( var2_set, sets, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              sets = ConsesLow.cons( set_utilities.set_union( ConsesLow.list( var1_set, var2_set ), UNPROVIDED ), sets );
            }
          }
          cdolist_list_var_$16 = cdolist_list_var_$16.rest();
          var2 = cdolist_list_var_$16.first();
        }
        cdolist_list_var_$15 = cdolist_list_var_$15.rest();
        var1 = cdolist_list_var_$15.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      literal = cdolist_list_var.first();
    }
    cdolist_list_var = literals;
    literal = NIL;
    literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( cycl_utilities.atomic_sentence_predicate( literal ).eql( $const35$not ) || cycl_utilities.atomic_sentence_predicate( literal ).eql( $const5$unknownSentence ) || cycl_utilities.atomic_sentence_predicate(
          literal ).eql( $const36$assertedSentence ) )
      {
        literal = cycl_utilities.formula_arg1( literal, UNPROVIDED );
      }
      final SubLObject literal_variables = el_utilities.sentence_variables( literal, UNPROVIDED, UNPROVIDED );
      if( NIL != list_utilities.empty_list_p( literal_variables ) )
      {
        sets = ConsesLow.cons( set_utilities.new_singleton_set( literal, Symbols.symbol_function( EQ ) ), sets );
      }
      else
      {
        SubLObject cdolist_list_var_$18 = sets;
        SubLObject v_set3 = NIL;
        v_set3 = cdolist_list_var_$18.first();
        while ( NIL != cdolist_list_var_$18)
        {
          if( NIL == literal_variables || NIL != set.set_memberP( literal_variables.first(), v_set3 ) )
          {
            set.set_add( literal, v_set3 );
          }
          cdolist_list_var_$18 = cdolist_list_var_$18.rest();
          v_set3 = cdolist_list_var_$18.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      literal = cdolist_list_var.first();
    }
    SubLObject ans = NIL;
    SubLObject cdolist_list_var2 = sets;
    SubLObject v_set = NIL;
    v_set = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      final SubLObject set_as_list = set.set_element_list( v_set );
      ans = ConsesLow.cons( Sequences.remove_if( Symbols.symbol_function( $sym26$CYC_VAR_ ), set_as_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), ans );
      cdolist_list_var2 = cdolist_list_var2.rest();
      v_set = cdolist_list_var2.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 27513L)
  public static SubLObject literal_set_G(final SubLObject set1, final SubLObject set2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject variables1 = Sequences.remove_duplicates( list_utilities.tree_gather( set.set_element_list( set1 ), Symbols.symbol_function( $sym26$CYC_VAR_ ), UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject variables2 = Sequences.remove_duplicates( list_utilities.tree_gather( set.set_element_list( set2 ), Symbols.symbol_function( $sym26$CYC_VAR_ ), UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject consistent1 = makeBoolean( NIL == $literal_set_G_mt$.getDynamicValue( thread ) || !ONE_INTEGER.numE( set.set_size( set1 ) ) || NIL != sentence_internally_consistentP( set.set_element_list( set1 )
        .first(), $literal_set_G_mt$.getDynamicValue( thread ) ) );
    final SubLObject consistent2 = makeBoolean( NIL == $literal_set_G_mt$.getDynamicValue( thread ) || !ONE_INTEGER.numE( set.set_size( set2 ) ) || NIL != sentence_internally_consistentP( set.set_element_list( set2 )
        .first(), $literal_set_G_mt$.getDynamicValue( thread ) ) );
    if( NIL != consistent1 && NIL == consistent2 )
    {
      return T;
    }
    if( NIL != consistent2 && NIL == consistent1 )
    {
      return NIL;
    }
    if( set.set_size( set1 ).numG( set.set_size( set2 ) ) )
    {
      return T;
    }
    if( set.set_size( set1 ).numL( set.set_size( set2 ) ) )
    {
      return NIL;
    }
    if( Sequences.length( variables1 ).numG( Sequences.length( variables2 ) ) )
    {
      return T;
    }
    if( Sequences.length( variables1 ).numL( Sequences.length( variables2 ) ) )
    {
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 28490L)
  public static SubLObject find_fully_connected_subsets(final SubLObject formula)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject dnf_formula = convert_to_dnf( formula, NIL );
    thread.resetMultipleValues();
    final SubLObject bare_dnf_formula = separate_bindings_from_sentence( dnf_formula );
    final SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject conjunctions = ( NIL != el_utilities.el_disjunction_p( bare_dnf_formula ) ) ? cycl_utilities.el_formula_args( bare_dnf_formula, UNPROVIDED ) : ConsesLow.list( bare_dnf_formula );
    final SubLObject simple_disjunctionP = Types.sublisp_null( Sequences.find_if( $sym37$EL_CONJUNCTION_P, conjunctions, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    SubLObject sets_of_connected_literals = NIL;
    final SubLObject all_literals = set.new_set( UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = conjunctions;
    SubLObject conjunction = NIL;
    conjunction = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$19;
      final SubLObject sets_of_connected_literals_in_conjunction = cdolist_list_var_$19 = find_fully_connected_subsets_in_conjunction( conjunction );
      SubLObject set_of_connected_literals_in_conjunction = NIL;
      set_of_connected_literals_in_conjunction = cdolist_list_var_$19.first();
      while ( NIL != cdolist_list_var_$19)
      {
        set_utilities.set_add_all( set_of_connected_literals_in_conjunction, all_literals );
        final SubLObject reused_set = ( NIL != simple_disjunctionP ) ? find_literal_set_with_vars( set_of_connected_literals_in_conjunction, sets_of_connected_literals ) : NIL;
        final SubLObject v_set = ( NIL != reused_set ) ? reused_set : set.new_set( Symbols.symbol_function( EQ ), UNPROVIDED );
        set_utilities.set_add_all( set_of_connected_literals_in_conjunction, v_set );
        sets_of_connected_literals = ConsesLow.cons( v_set, sets_of_connected_literals );
        cdolist_list_var_$19 = cdolist_list_var_$19.rest();
        set_of_connected_literals_in_conjunction = cdolist_list_var_$19.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      conjunction = cdolist_list_var.first();
    }
    final SubLObject set_contents_var = set.do_set_internal( all_literals );
    SubLObject basis_object;
    SubLObject state;
    SubLObject literal;
    SubLObject containing_sets;
    SubLObject cdolist_list_var2;
    SubLObject set_of_connected_literals;
    SubLObject containing_set;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      literal = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, literal ) )
      {
        containing_sets = NIL;
        cdolist_list_var2 = sets_of_connected_literals;
        set_of_connected_literals = NIL;
        set_of_connected_literals = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          if( NIL != set.set_memberP( literal, set_of_connected_literals ) )
          {
            containing_sets = ConsesLow.cons( set_of_connected_literals, containing_sets );
          }
          cdolist_list_var2 = cdolist_list_var2.rest();
          set_of_connected_literals = cdolist_list_var2.first();
        }
        if( NIL != list_utilities.lengthG( containing_sets, ONE_INTEGER, UNPROVIDED ) )
        {
          cdolist_list_var2 = containing_sets;
          containing_set = NIL;
          containing_set = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            sets_of_connected_literals = Sequences.remove( containing_set, sets_of_connected_literals, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            cdolist_list_var2 = cdolist_list_var2.rest();
            containing_set = cdolist_list_var2.first();
          }
          sets_of_connected_literals = ConsesLow.cons( set_utilities.set_union( containing_sets, UNPROVIDED ), sets_of_connected_literals );
        }
      }
    }
    sets_of_connected_literals = Sort.sort( sets_of_connected_literals, Symbols.symbol_function( $sym38$LITERAL_SET__ ), UNPROVIDED );
    return Mapping.mapcar( Symbols.symbol_function( $sym39$SET_ELEMENT_LIST ), sets_of_connected_literals );
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 30320L)
  public static SubLObject find_literal_set_with_vars(final SubLObject literals, final SubLObject sets)
  {
    SubLObject match = NIL;
    SubLObject vars = NIL;
    SubLObject cdolist_list_var = literals;
    SubLObject literal = NIL;
    literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$20 = literal_free_variables_cached( literal );
      SubLObject var = NIL;
      var = cdolist_list_var_$20.first();
      while ( NIL != cdolist_list_var_$20)
      {
        final SubLObject item_var = var;
        if( NIL == conses_high.member( item_var, vars, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          vars = ConsesLow.cons( item_var, vars );
        }
        cdolist_list_var_$20 = cdolist_list_var_$20.rest();
        var = cdolist_list_var_$20.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      literal = cdolist_list_var.first();
    }
    vars = Sort.sort( vars, Symbols.symbol_function( $sym40$STRING_ ), Symbols.symbol_function( $sym41$EL_VAR_NAME ) );
    if( NIL != vars && NIL == match )
    {
      SubLObject csome_list_var = sets;
      SubLObject v_set = NIL;
      v_set = csome_list_var.first();
      while ( NIL == match && NIL != csome_list_var)
      {
        SubLObject set_vars = NIL;
        final SubLObject set_contents_var = set.do_set_internal( v_set );
        SubLObject basis_object;
        SubLObject state;
        SubLObject literal2;
        SubLObject cdolist_list_var2;
        SubLObject var2;
        SubLObject item_var2;
        for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
            .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
        {
          literal2 = set_contents.do_set_contents_next( basis_object, state );
          if( NIL != set_contents.do_set_contents_element_validP( state, literal2 ) )
          {
            cdolist_list_var2 = literal_free_variables_cached( literal2 );
            var2 = NIL;
            var2 = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              item_var2 = var2;
              if( NIL == conses_high.member( item_var2, set_vars, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                set_vars = ConsesLow.cons( item_var2, set_vars );
              }
              cdolist_list_var2 = cdolist_list_var2.rest();
              var2 = cdolist_list_var2.first();
            }
          }
        }
        if( Sort.sort( Sequences.remove_duplicates( set_vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( $sym40$STRING_ ), Symbols.symbol_function( $sym41$EL_VAR_NAME ) ).equal( vars ) )
        {
          match = v_set;
        }
        csome_list_var = csome_list_var.rest();
        v_set = csome_list_var.first();
      }
    }
    return match;
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 30898L)
  public static SubLObject clear_literal_free_variables_cached()
  {
    final SubLObject cs = $literal_free_variables_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 30898L)
  public static SubLObject remove_literal_free_variables_cached(final SubLObject literal)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $literal_free_variables_cached_caching_state$.getGlobalValue(), ConsesLow.list( literal ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 30898L)
  public static SubLObject literal_free_variables_cached_internal(final SubLObject literal)
  {
    return el_utilities.literal_free_variables( literal, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 30898L)
  public static SubLObject literal_free_variables_cached(final SubLObject literal)
  {
    SubLObject caching_state = $literal_free_variables_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym42$LITERAL_FREE_VARIABLES_CACHED, $sym43$_LITERAL_FREE_VARIABLES_CACHED_CACHING_STATE_, $int44$32, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, literal, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( literal_free_variables_cached_internal( literal ) ) );
      memoization_state.caching_state_put( caching_state, literal, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 31048L)
  public static SubLObject find_unconnected_literals(final SubLObject formula)
  {
    final SubLObject literals = find_fully_connected_subsets( formula );
    SubLObject done_oneP = NIL;
    SubLObject arg_positions = NIL;
    SubLObject cdolist_list_var = literals;
    SubLObject set_o_literals = NIL;
    set_o_literals = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != list_utilities.tree_find_if( $sym26$CYC_VAR_, set_o_literals, UNPROVIDED ) )
      {
        if( NIL == done_oneP )
        {
          done_oneP = T;
        }
        else
        {
          SubLObject cdolist_list_var_$21 = set_o_literals;
          SubLObject literal = NIL;
          literal = cdolist_list_var_$21.first();
          while ( NIL != cdolist_list_var_$21)
          {
            arg_positions = ConsesLow.append( arg_positions, arg_positions_eq( literal, formula ) );
            cdolist_list_var_$21 = cdolist_list_var_$21.rest();
            literal = cdolist_list_var_$21.first();
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      set_o_literals = cdolist_list_var.first();
    }
    return arg_positions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 31711L)
  public static SubLObject sentences_consistentP(final SubLObject sentence1, final SubLObject sentence2, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sentence3 = ConsesLow.list( $const7$and, sentence1, sentence2 );
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = parsing_vars.$storing_cyclifier_wff_results$.currentBinding( thread );
    try
    {
      parsing_vars.$storing_cyclifier_wff_results$.bind( NIL, thread );
      ans = cyclifier.cyclifier_wffP( sentence3, mt );
    }
    finally
    {
      parsing_vars.$storing_cyclifier_wff_results$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 32136L)
  public static SubLObject sentence_internally_consistentP(final SubLObject sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = parsing_vars.$storing_cyclifier_wff_results$.currentBinding( thread );
    try
    {
      parsing_vars.$storing_cyclifier_wff_results$.bind( NIL, thread );
      final SubLObject wffP = ans = cyclifier.cyclifier_wffP( sentence, mt );
    }
    finally
    {
      parsing_vars.$storing_cyclifier_wff_results$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 32430L)
  public static SubLObject find_inconsistent_literals_in_conjunction(final SubLObject formula, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject inconsistent_pairs = NIL;
    final SubLObject literals = ( formula.isList() && formula.first().eql( $const7$and ) ) ? formula.rest() : ConsesLow.list( formula );
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        SubLObject cdolist_list_var = literals;
        SubLObject literal_1 = NIL;
        literal_1 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject cdolist_list_var_$22 = literals;
          SubLObject literal_2 = NIL;
          literal_2 = cdolist_list_var_$22.first();
          while ( NIL != cdolist_list_var_$22)
          {
            if( !literal_1.eql( literal_2 ) && NIL == sentences_consistentP( literal_1, literal_2, mt ) )
            {
              inconsistent_pairs = ConsesLow.cons( ConsesLow.list( literal_1, literal_2 ), inconsistent_pairs );
            }
            cdolist_list_var_$22 = cdolist_list_var_$22.rest();
            literal_2 = cdolist_list_var_$22.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          literal_1 = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$23, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return inconsistent_pairs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 32966L)
  public static SubLObject find_consistent_subsets(final SubLObject formula, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject dnf_formula = convert_to_dnf( formula, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject bare_dnf_formula = separate_bindings_from_sentence( dnf_formula );
    final SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject conjunctions = ( bare_dnf_formula.isList() && bare_dnf_formula.first().eql( $const8$or ) ) ? bare_dnf_formula.rest() : ConsesLow.list( bare_dnf_formula );
    SubLObject inconsistent_pairs = NIL;
    SubLObject sets_of_consistent_literals = NIL;
    final SubLObject all_literals = set.new_set( Symbols.symbol_function( EQ ), UNPROVIDED );
    SubLObject cdolist_list_var = conjunctions;
    SubLObject conjunction = NIL;
    conjunction = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject conjunction_literals = ( conjunction.isList() && conjunction.first().eql( $const7$and ) ) ? conjunction.rest() : ConsesLow.list( conjunction );
      inconsistent_pairs = ConsesLow.append( inconsistent_pairs, find_inconsistent_literals_in_conjunction( conjunction, mt ) );
      set_utilities.set_add_all( conjunction_literals, all_literals );
      cdolist_list_var = cdolist_list_var.rest();
      conjunction = cdolist_list_var.first();
    }
    final SubLObject set_contents_var = set.do_set_internal( all_literals );
    SubLObject basis_object;
    SubLObject state;
    SubLObject literal;
    SubLObject consistent_set;
    SubLObject cdolist_list_var2;
    SubLObject v_set;
    SubLObject consistentP;
    SubLObject set_contents_var_$24;
    SubLObject basis_object_$25;
    SubLObject state_$26;
    SubLObject other_literal;
    SubLObject cdolist_list_var_$27;
    SubLObject inconsistent_pair;
    SubLObject v_set2;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      literal = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, literal ) )
      {
        consistent_set = NIL;
        cdolist_list_var2 = sets_of_consistent_literals;
        v_set = NIL;
        v_set = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          consistentP = T;
          set_contents_var_$24 = set.do_set_internal( v_set );
          for( basis_object_$25 = set_contents.do_set_contents_basis_object( set_contents_var_$24 ), state_$26 = NIL, state_$26 = set_contents.do_set_contents_initial_state( basis_object_$25,
              set_contents_var_$24 ); NIL == set_contents.do_set_contents_doneP( basis_object_$25, state_$26 ); state_$26 = set_contents.do_set_contents_update_state( state_$26 ) )
          {
            other_literal = set_contents.do_set_contents_next( basis_object_$25, state_$26 );
            if( NIL != set_contents.do_set_contents_element_validP( state_$26, other_literal ) )
            {
              cdolist_list_var_$27 = inconsistent_pairs;
              inconsistent_pair = NIL;
              inconsistent_pair = cdolist_list_var_$27.first();
              while ( NIL != cdolist_list_var_$27)
              {
                if( inconsistent_pair.first().eql( literal ) && conses_high.second( inconsistent_pair ).eql( other_literal ) )
                {
                  consistentP = NIL;
                }
                cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                inconsistent_pair = cdolist_list_var_$27.first();
              }
            }
          }
          if( NIL != consistentP )
          {
            consistent_set = v_set;
          }
          cdolist_list_var2 = cdolist_list_var2.rest();
          v_set = cdolist_list_var2.first();
        }
        if( NIL == consistent_set )
        {
          v_set2 = set.new_set( Symbols.symbol_function( EQ ), UNPROVIDED );
          sets_of_consistent_literals = ConsesLow.cons( v_set2, sets_of_consistent_literals );
          consistent_set = v_set2;
        }
        set.set_add( literal, consistent_set );
      }
    }
    final SubLObject _prev_bind_0 = $literal_set_G_mt$.currentBinding( thread );
    try
    {
      $literal_set_G_mt$.bind( mt, thread );
      sets_of_consistent_literals = Sort.sort( sets_of_consistent_literals, Symbols.symbol_function( $sym38$LITERAL_SET__ ), UNPROVIDED );
    }
    finally
    {
      $literal_set_G_mt$.rebind( _prev_bind_0, thread );
    }
    return Mapping.mapcar( Symbols.symbol_function( $sym39$SET_ELEMENT_LIST ), sets_of_consistent_literals );
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 34636L)
  public static SubLObject arg_positions_eq(final SubLObject item, final SubLObject formula)
  {
    SubLObject arg_positions = cycl_utilities.arg_positions_dfs( item, formula, Symbols.symbol_function( EQUAL ) );
    SubLObject arg_positions_not_eq = NIL;
    SubLObject cdolist_list_var = arg_positions;
    SubLObject arg_pos = NIL;
    arg_pos = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !item.eql( cycl_utilities.formula_arg_position( formula, arg_pos, UNPROVIDED ) ) )
      {
        arg_positions_not_eq = ConsesLow.cons( arg_pos, arg_positions_not_eq );
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg_pos = cdolist_list_var.first();
    }
    cdolist_list_var = arg_positions_not_eq;
    arg_pos = NIL;
    arg_pos = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      arg_positions = Sequences.remove( arg_pos, arg_positions, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      arg_pos = cdolist_list_var.first();
    }
    return arg_positions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 35090L)
  public static SubLObject arg_positions_eql(final SubLObject item, final SubLObject formula)
  {
    SubLObject arg_positions = cycl_utilities.arg_positions_dfs( item, formula, Symbols.symbol_function( EQUAL ) );
    SubLObject arg_positions_not_eql = NIL;
    SubLObject cdolist_list_var = arg_positions;
    SubLObject arg_pos = NIL;
    arg_pos = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !item.eql( cycl_utilities.formula_arg_position( formula, arg_pos, UNPROVIDED ) ) )
      {
        arg_positions_not_eql = ConsesLow.cons( arg_pos, arg_positions_not_eql );
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg_pos = cdolist_list_var.first();
    }
    cdolist_list_var = arg_positions_not_eql;
    arg_pos = NIL;
    arg_pos = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      arg_positions = Sequences.remove( arg_pos, arg_positions, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      arg_pos = cdolist_list_var.first();
    }
    return arg_positions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 35550L)
  public static SubLObject find_inconsistent_literals(final SubLObject formula, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject arg_positions = NIL;
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        SubLObject literal_subsets = find_consistent_subsets( formula, mt );
        if( NIL == list_utilities.lengthE( literal_subsets.first(), ONE_INTEGER, UNPROVIDED ) || NIL != sentence_internally_consistentP( literal_subsets.first().first(), mt ) )
        {
          literal_subsets = literal_subsets.rest();
        }
        final SubLObject inconsistent_literals = Mapping.mapcan( Symbols.symbol_function( IDENTITY ), literal_subsets, EMPTY_SUBL_OBJECT_ARRAY );
        arg_positions = Mapping.mapcan( Symbols.symbol_function( $sym47$ARG_POSITIONS_EQ ), inconsistent_literals, new SubLObject[] { ConsesLow.make_list( Sequences.length( inconsistent_literals ), formula )
        } );
      }
      finally
      {
        final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$28, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return arg_positions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/variable-unification.lisp", position = 36692L)
  public static SubLObject incompatible_var_map_alists_equalP(final SubLObject map1, final SubLObject map2)
  {
    return list_utilities.alist_E( map1, map2, Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym56$SETS_EQUAL_ ) );
  }

  public static SubLObject declare_variable_unification_file()
  {
    SubLFiles.declareFunction( me, "apply_demorgans", "APPLY-DEMORGANS", 1, 0, false );
    SubLFiles.declareFunction( me, "el_negation_or_unknown_sentence_p", "EL-NEGATION-OR-UNKNOWN-SENTENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "separate_bindings_from_sentence", "SEPARATE-BINDINGS-FROM-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "separate_bindings_recursive", "SEPARATE-BINDINGS-RECURSIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "collapse_groups", "COLLAPSE-GROUPS", 1, 0, false );
    SubLFiles.declareFunction( me, "convert_to_dnf_int", "CONVERT-TO-DNF-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "convert_to_dnf", "CONVERT-TO-DNF", 1, 1, false );
    SubLFiles.declareFunction( me, "gather_dnf_arg_constraints_int", "GATHER-DNF-ARG-CONSTRAINTS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "gather_dnf_arg_constraints", "GATHER-DNF-ARG-CONSTRAINTS", 2, 0, false );
    SubLFiles.declareFunction( me, "can_unifyP", "CAN-UNIFY?", 4, 0, false );
    SubLFiles.declareFunction( me, "get_incompatible_variables_in_complex_sentence", "GET-INCOMPATIBLE-VARIABLES-IN-COMPLEX-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "find_irreflexive_incompatibles", "FIND-IRREFLEXIVE-INCOMPATIBLES", 2, 0, false );
    SubLFiles.declareFunction( me, "add_incompatibles", "ADD-INCOMPATIBLES", 2, 0, false );
    SubLFiles.declareFunction( me, "known_incompatible_varsP", "KNOWN-INCOMPATIBLE-VARS?", 3, 0, false );
    SubLFiles.declareFunction( me, "get_var_map_for_formula_internal", "GET-VAR-MAP-FOR-FORMULA-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "get_var_map_for_formula", "GET-VAR-MAP-FOR-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "get_incompatible_variables_in_complex_sentence_as_alist", "GET-INCOMPATIBLE-VARIABLES-IN-COMPLEX-SENTENCE-AS-ALIST", 2, 0, false );
    SubLFiles.declareFunction( me, "gather_constraining_types_for_variable_in_constraint_conjunction", "GATHER-CONSTRAINING-TYPES-FOR-VARIABLE-IN-CONSTRAINT-CONJUNCTION", 3, 0, false );
    SubLFiles.declareFunction( me, "variable_similarity_given_constraint_conjunction", "VARIABLE-SIMILARITY-GIVEN-CONSTRAINT-CONJUNCTION", 4, 0, false );
    SubLFiles.declareFunction( me, "variable_similarity_internal", "VARIABLE-SIMILARITY-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "variable_similarity", "VARIABLE-SIMILARITY", 4, 0, false );
    SubLFiles.declareFunction( me, "variable_similarity_about_the_sameP", "VARIABLE-SIMILARITY-ABOUT-THE-SAME?", 2, 1, false );
    SubLFiles.declareFunction( me, "attempt_to_combine_variables_in_complex_combination", "ATTEMPT-TO-COMBINE-VARIABLES-IN-COMPLEX-COMBINATION", 4, 3, false );
    SubLFiles.declareFunction( me, "pick_variable_to_combine", "PICK-VARIABLE-TO-COMBINE", 4, 0, false );
    SubLFiles.declareFunction( me, "literals_redundantP", "LITERALS-REDUNDANT?", 3, 2, false );
    SubLFiles.declareFunction( me, "redundant_literals_in_conjunctionP", "REDUNDANT-LITERALS-IN-CONJUNCTION?", 2, 2, false );
    SubLFiles.declareFunction( me, "new_redundant_literals", "NEW-REDUNDANT-LITERALS", 4, 0, false );
    SubLFiles.declareFunction( me, "car_cdr_equalP", "CAR-CDR-EQUAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "find_redundant_literals", "FIND-REDUNDANT-LITERALS", 2, 0, false );
    SubLFiles.declareFunction( me, "find_redundant_literals_int", "FIND-REDUNDANT-LITERALS-INT", 2, 2, false );
    SubLFiles.declareFunction( me, "shortest_paths_between_variables_in_conjunction", "SHORTEST-PATHS-BETWEEN-VARIABLES-IN-CONJUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "find_fully_connected_subsets_in_conjunction", "FIND-FULLY-CONNECTED-SUBSETS-IN-CONJUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "literal_set_G", "LITERAL-SET->", 2, 0, false );
    SubLFiles.declareFunction( me, "find_fully_connected_subsets", "FIND-FULLY-CONNECTED-SUBSETS", 1, 0, false );
    SubLFiles.declareFunction( me, "find_literal_set_with_vars", "FIND-LITERAL-SET-WITH-VARS", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_literal_free_variables_cached", "CLEAR-LITERAL-FREE-VARIABLES-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_literal_free_variables_cached", "REMOVE-LITERAL-FREE-VARIABLES-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "literal_free_variables_cached_internal", "LITERAL-FREE-VARIABLES-CACHED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "literal_free_variables_cached", "LITERAL-FREE-VARIABLES-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "find_unconnected_literals", "FIND-UNCONNECTED-LITERALS", 1, 0, false );
    SubLFiles.declareFunction( me, "sentences_consistentP", "SENTENCES-CONSISTENT?", 3, 0, false );
    SubLFiles.declareFunction( me, "sentence_internally_consistentP", "SENTENCE-INTERNALLY-CONSISTENT?", 2, 0, false );
    SubLFiles.declareFunction( me, "find_inconsistent_literals_in_conjunction", "FIND-INCONSISTENT-LITERALS-IN-CONJUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "find_consistent_subsets", "FIND-CONSISTENT-SUBSETS", 2, 0, false );
    SubLFiles.declareFunction( me, "arg_positions_eq", "ARG-POSITIONS-EQ", 2, 0, false );
    SubLFiles.declareFunction( me, "arg_positions_eql", "ARG-POSITIONS-EQL", 2, 0, false );
    SubLFiles.declareFunction( me, "find_inconsistent_literals", "FIND-INCONSISTENT-LITERALS", 2, 0, false );
    SubLFiles.declareFunction( me, "incompatible_var_map_alists_equalP", "INCOMPATIBLE-VAR-MAP-ALISTS-EQUAL?", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_variable_unification_file()
  {
    $variable_similarity_default_fudge_factor$ = SubLFiles.deflexical( "*VARIABLE-SIMILARITY-DEFAULT-FUDGE-FACTOR*", $float24$1_1 );
    $literal_set_G_mt$ = SubLFiles.defparameter( "*LITERAL-SET->-MT*", NIL );
    $literal_free_variables_cached_caching_state$ = SubLFiles.deflexical( "*LITERAL-FREE-VARIABLES-CACHED-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_variable_unification_file()
  {
    memoization_state.note_memoized_function( $sym16$GET_VAR_MAP_FOR_FORMULA );
    memoization_state.note_memoized_function( $sym23$VARIABLE_SIMILARITY );
    utilities_macros.note_funcall_helper_function( $sym25$VARIABLE_SIMILARITY_ABOUT_THE_SAME_ );
    access_macros.register_external_symbol( $sym33$FIND_REDUNDANT_LITERALS );
    memoization_state.note_globally_cached_function( $sym42$LITERAL_FREE_VARIABLES_CACHED );
    access_macros.register_external_symbol( $sym45$FIND_UNCONNECTED_LITERALS );
    access_macros.register_external_symbol( $sym46$FIND_INCONSISTENT_LITERALS );
    generic_testing.define_test_case_table_int( $sym3$APPLY_DEMORGANS, ConsesLow.list( new SubLObject[] { $kw48$TEST, Symbols.symbol_function( EQUAL ), $kw49$OWNER, NIL, $kw50$CLASSES, $list51, $kw52$KB, $kw53$TINY,
      $kw54$WORKING_, T
    } ), $list55 );
    generic_testing.define_test_case_table_int( $sym57$GET_INCOMPATIBLE_VARIABLES_IN_COMPLEX_SENTENCE_AS_ALIST, ConsesLow.list( new SubLObject[] { $kw48$TEST, Symbols.symbol_function(
        $sym58$INCOMPATIBLE_VAR_MAP_ALISTS_EQUAL_ ), $kw49$OWNER, NIL, $kw50$CLASSES, $list51, $kw52$KB, $kw59$FULL, $kw54$WORKING_, T
    } ), $list60 );
    generic_testing.define_test_case_table_int( $sym45$FIND_UNCONNECTED_LITERALS, ConsesLow.list( new SubLObject[] { $kw48$TEST, Symbols.symbol_function( EQUAL ), $kw49$OWNER, NIL, $kw50$CLASSES, $list51, $kw52$KB,
      $kw59$FULL, $kw54$WORKING_, T
    } ), $list61 );
    generic_testing.define_test_case_table_int( $sym46$FIND_INCONSISTENT_LITERALS, ConsesLow.list( new SubLObject[] { $kw48$TEST, Symbols.symbol_function( EQUAL ), $kw49$OWNER, NIL, $kw50$CLASSES, $list51, $kw52$KB,
      $kw59$FULL, $kw54$WORKING_, T
    } ), $list62 );
    return NIL;
  }

  private static SubLObject _constant_60_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?THING" ), constant_handles.reader_make_constant_shell( makeString( "PericardialWindow-SurgicalProcedure" ) ) ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "cCF-contains" ) ), makeSymbol( "?X" ), makeSymbol( "?Y" ) ) ), constant_handles.reader_make_constant_shell( makeString(
                "MedicalResearchRecommendedWFFCheckingMt" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "?X" ), makeSymbol( "?Y" ) ), ConsesLow.list( makeSymbol( "?Y" ), makeSymbol( "?X" ) ) ) ), ConsesLow.list(
                    ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol(
                        "?THING" ), constant_handles.reader_make_constant_shell( makeString( "HeartAttack" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "patientTreated" ) ), makeSymbol(
                            "?THING" ), makeSymbol( "?Y" ) ) ), constant_handles.reader_make_constant_shell( makeString( "MedicalResearchRecommendedWFFCheckingMt" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                "?Y" ), makeSymbol( "?THING" ) ), ConsesLow.list( makeSymbol( "?THING" ), makeSymbol( "?Y" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                    .reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cCFCardiacCathComplication" ) ), makeSymbol(
                                        "?CCF-EVENT" ), constant_handles.reader_make_constant_shell( makeString( "HeartAttack" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                            "patientTreated" ) ), makeSymbol( "?CCF-EVENT" ), makeSymbol( "?Y" ) ) ), constant_handles.reader_make_constant_shell( makeString(
                                                "MedicalResearchRecommendedWFFCheckingMt" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "?Y" ), makeSymbol( "?CCF-EVENT" ) ), ConsesLow.list( makeSymbol(
                                                    "?CCF-EVENT" ), makeSymbol( "?Y" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow
                                                        .list( constant_handles.reader_make_constant_shell( makeString( "cCFHospitalAdmitReason" ) ), makeSymbol( "?HOSPITAL-CARE" ), constant_handles
                                                            .reader_make_constant_shell( makeString( "HeartAttack" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "patientTreated" ) ),
                                                                makeSymbol( "?HOSPITAL-CARE" ), makeSymbol( "?Y" ) ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                    "MedicalResearchRecommendedWFFCheckingMt" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "?HOSPITAL-CARE" ), makeSymbol( "?Y" ), makeSymbol(
                                                                        "?HOSPITAL-CARE" ) ), ConsesLow.list( makeSymbol( "?Y" ), makeSymbol( "?HOSPITAL-CARE" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                            constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                "causeOfDeathEvent" ) ), makeSymbol( "?DEATH" ), constant_handles.reader_make_constant_shell( makeString( "HeartAttack" ) ) ), ConsesLow
                                                                                    .list( constant_handles.reader_make_constant_shell( makeString( "patientTreated" ) ), makeSymbol( "?DEATH" ), makeSymbol( "?Y" ) ) ),
                                                                            constant_handles.reader_make_constant_shell( makeString( "MedicalResearchRecommendedWFFCheckingMt" ) ) ), ConsesLow.list( ConsesLow.list(
                                                                                makeSymbol( "?Y" ), makeSymbol( "?DEATH" ) ), ConsesLow.list( makeSymbol( "?DEATH" ), makeSymbol( "?Y" ) ) ) ), ConsesLow.list( ConsesLow
                                                                                    .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
                                                                                        .reader_make_constant_shell( makeString( "causeOfDeathEvent" ) ), makeSymbol( "?DEATH" ), makeSymbol( "?TYPE-OF-SITUATION" ) ),
                                                                                        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "patientTreated" ) ), makeSymbol( "?DEATH" ), makeSymbol(
                                                                                            "?Y" ) ) ), constant_handles.reader_make_constant_shell( makeString( "MedicalResearchRecommendedWFFCheckingMt" ) ) ), ConsesLow
                                                                                                .list( ConsesLow.list( makeSymbol( "?Y" ), makeSymbol( "?DEATH" ), makeSymbol( "?TYPE-OF-SITUATION" ) ), ConsesLow.list(
                                                                                                    makeSymbol( "?TYPE-OF-SITUATION" ), makeSymbol( "?DEATH" ), makeSymbol( "?Y" ) ), ConsesLow.list( makeSymbol(
                                                                                                        "?DEATH" ), makeSymbol( "?TYPE-OF-SITUATION" ), makeSymbol( "?Y" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow
                                                                                                            .list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
                                                                                                                .reader_make_constant_shell( makeString( "cCFCardiacCathComplication" ) ), makeSymbol( "?CCF-EVENT" ),
                                                                                                                makeSymbol( "?CARDIAC-CATH-COMPLICATION" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                    makeString( "patientTreated" ) ), makeSymbol( "?CCF-EVENT" ), makeSymbol( "?Y" ) ) ), constant_handles
                                                                                                                        .reader_make_constant_shell( makeString( "MedicalResearchRecommendedWFFCheckingMt" ) ) ), ConsesLow
                                                                                                                            .list( ConsesLow.list( makeSymbol( "?Y" ), makeSymbol( "?CCF-EVENT" ), makeSymbol(
                                                                                                                                "?CARDIAC-CATH-COMPLICATION" ) ), ConsesLow.list( makeSymbol(
                                                                                                                                    "?CARDIAC-CATH-COMPLICATION" ), makeSymbol( "?CCF-EVENT" ), makeSymbol( "?Y" ) ),
                                                                                                                                ConsesLow.list( makeSymbol( "?CCF-EVENT" ), makeSymbol( "?CARDIAC-CATH-COMPLICATION" ),
                                                                                                                                    makeSymbol( "?Y" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                                                                        constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list(
                                                                                                                                            constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                "cCFHospitalAdmitReason" ) ), makeSymbol( "?HOSPITAL-CARE" ), makeSymbol(
                                                                                                                                                    "?HOSPITAL-ADMIT-REASON" ) ), ConsesLow.list( constant_handles
                                                                                                                                                        .reader_make_constant_shell( makeString( "patientTreated" ) ),
                                                                                                                                                        makeSymbol( "?HOSPITAL-CARE" ), makeSymbol( "?Y" ) ) ),
                                                                                                                                        constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                            "MedicalResearchRecommendedWFFCheckingMt" ) ) ), ConsesLow.list( ConsesLow.list(
                                                                                                                                                makeSymbol( "?HOSPITAL-CARE" ), makeSymbol( "?Y" ), makeSymbol(
                                                                                                                                                    "?HOSPITAL-ADMIT-REASON" ), makeSymbol( "?HOSPITAL-CARE" ) ), ConsesLow
                                                                                                                                                        .list( makeSymbol( "?HOSPITAL-ADMIT-REASON" ), makeSymbol( "?Y" ),
                                                                                                                                                            makeSymbol( "?HOSPITAL-CARE" ) ), ConsesLow.list( makeSymbol(
                                                                                                                                                                "?Y" ), makeSymbol( "?HOSPITAL-ADMIT-REASON" ), makeSymbol(
                                                                                                                                                                    "?HOSPITAL-CARE" ) ) ) ), ConsesLow.list( ConsesLow
                                                                                                                                                                        .list( ConsesLow.list( constant_handles
                                                                                                                                                                            .reader_make_constant_shell( makeString(
                                                                                                                                                                                "and" ) ), ConsesLow.list( constant_handles
                                                                                                                                                                                    .reader_make_constant_shell( makeString(
                                                                                                                                                                                        "eventHasDiagnosis" ) ), makeSymbol(
                                                                                                                                                                                            "?MEDICALLY-RELATED-EVENT" ),
                                                                                                                                                                                    constant_handles
                                                                                                                                                                                        .reader_make_constant_shell(
                                                                                                                                                                                            makeString(
                                                                                                                                                                                                "HeartCondition" ) ) ),
                                                                                                                                                                            ConsesLow.list( constant_handles
                                                                                                                                                                                .reader_make_constant_shell( makeString(
                                                                                                                                                                                    "patientTreated" ) ), makeSymbol(
                                                                                                                                                                                        "?MEDICALLY-RELATED-EVENT" ),
                                                                                                                                                                                makeSymbol( "?Y" ) ) ), constant_handles
                                                                                                                                                                                    .reader_make_constant_shell( makeString(
                                                                                                                                                                                        "MedicalResearchRecommendedWFFCheckingMt" ) ) ),
                                                                                                                                                                        ConsesLow.list( ConsesLow.list( makeSymbol( "?Y" ),
                                                                                                                                                                            makeSymbol( "?MEDICALLY-RELATED-EVENT" ) ),
                                                                                                                                                                            ConsesLow.list( makeSymbol(
                                                                                                                                                                                "?MEDICALLY-RELATED-EVENT" ), makeSymbol(
                                                                                                                                                                                    "?Y" ) ) ) ), ConsesLow.list( ConsesLow
                                                                                                                                                                                        .list( ConsesLow.list(
                                                                                                                                                                                            constant_handles
                                                                                                                                                                                                .reader_make_constant_shell(
                                                                                                                                                                                                    makeString( "and" ) ),
                                                                                                                                                                                            ConsesLow.list( constant_handles
                                                                                                                                                                                                .reader_make_constant_shell(
                                                                                                                                                                                                    makeString(
                                                                                                                                                                                                        "causeOfDeathEvent" ) ),
                                                                                                                                                                                                makeSymbol( "?DEATH" ),
                                                                                                                                                                                                constant_handles
                                                                                                                                                                                                    .reader_make_constant_shell(
                                                                                                                                                                                                        makeString(
                                                                                                                                                                                                            "HeartCondition" ) ) ),
                                                                                                                                                                                            ConsesLow.list( constant_handles
                                                                                                                                                                                                .reader_make_constant_shell(
                                                                                                                                                                                                    makeString(
                                                                                                                                                                                                        "patientTreated" ) ),
                                                                                                                                                                                                makeSymbol( "?DEATH" ),
                                                                                                                                                                                                makeSymbol( "?Y" ) ) ),
                                                                                                                                                                                            constant_handles
                                                                                                                                                                                                .reader_make_constant_shell(
                                                                                                                                                                                                    makeString(
                                                                                                                                                                                                        "MedicalResearchRecommendedWFFCheckingMt" ) ) ),
                                                                                                                                                                                        ConsesLow.list( ConsesLow.list(
                                                                                                                                                                                            makeSymbol( "?Y" ), makeSymbol(
                                                                                                                                                                                                "?DEATH" ) ), ConsesLow
                                                                                                                                                                                                    .list( makeSymbol(
                                                                                                                                                                                                        "?DEATH" ),
                                                                                                                                                                                                        makeSymbol(
                                                                                                                                                                                                            "?Y" ) ) ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "eventHasDiagnosis" ) ),
          makeSymbol( "?MEDICALLY-RELATED-EVENT" ), makeSymbol( "?CCF-DIAGNOSIS-OR-DISORDER-TYPE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "patientTreated" ) ), makeSymbol(
              "?MEDICALLY-RELATED-EVENT" ), makeSymbol( "?Y" ) ) ), constant_handles.reader_make_constant_shell( makeString( "MedicalResearchRecommendedWFFCheckingMt" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol(
                  "?Y" ), makeSymbol( "?MEDICALLY-RELATED-EVENT" ), makeSymbol( "?CCF-DIAGNOSIS-OR-DISORDER-TYPE" ) ), ConsesLow.list( makeSymbol( "?CCF-DIAGNOSIS-OR-DISORDER-TYPE" ), makeSymbol(
                      "?MEDICALLY-RELATED-EVENT" ), makeSymbol( "?Y" ) ), ConsesLow.list( makeSymbol( "?MEDICALLY-RELATED-EVENT" ), makeSymbol( "?CCF-DIAGNOSIS-OR-DISORDER-TYPE" ), makeSymbol( "?Y" ) ) ) ), ConsesLow
                          .list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                              "cCFLeftVentricleEjectionFraction" ) ), makeSymbol( "?X" ), makeSymbol( "?Y" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "patientTreated" ) ), makeSymbol(
                                  "?X" ), makeSymbol( "?W" ) ) ), constant_handles.reader_make_constant_shell( makeString( "MedicalResearchRecommendedWFFCheckingMt" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                      "?W" ), makeSymbol( "?X" ), makeSymbol( "?Y" ) ), ConsesLow.list( makeSymbol( "?Y" ), makeSymbol( "?X" ), makeSymbol( "?W" ) ), ConsesLow.list( makeSymbol( "?X" ), makeSymbol(
                                          "?Y" ), makeSymbol( "?W" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list(
                                              constant_handles.reader_make_constant_shell( makeString( "cCFSymptomType" ) ), makeSymbol( "?SYMPTOM" ), constant_handles.reader_make_constant_shell( makeString(
                                                  "Angina" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "eventHasDiagnosisOrFinding" ) ), makeSymbol( "?EVENT" ), makeSymbol(
                                                      "?SYMPTOM" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "patientTreated" ) ), makeSymbol( "?EVENT" ), makeSymbol( "?Y" ) ) ),
                                              constant_handles.reader_make_constant_shell( makeString( "MedicalResearchRecommendedWFFCheckingMt" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "?SYMPTOM" ),
                                                  makeSymbol( "?Y" ), makeSymbol( "?EVENT" ) ), ConsesLow.list( makeSymbol( "?EVENT" ), makeSymbol( "?Y" ), makeSymbol( "?SYMPTOM" ) ), ConsesLow.list( makeSymbol( "?Y" ),
                                                      makeSymbol( "?EVENT" ), makeSymbol( "?SYMPTOM" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                          "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cCFSymptomType" ) ), makeSymbol( "?SYMPTOM" ), makeSymbol(
                                                              "?SYMPTOM-TYPE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "eventHasDiagnosisOrFinding" ) ), makeSymbol( "?EVENT" ),
                                                                  makeSymbol( "?SYMPTOM" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "patientTreated" ) ), makeSymbol( "?EVENT" ),
                                                                      makeSymbol( "?Y" ) ) ), constant_handles.reader_make_constant_shell( makeString( "MedicalResearchRecommendedWFFCheckingMt" ) ) ), ConsesLow.list(
                                                                          ConsesLow.list( makeSymbol( "?SYMPTOM" ), makeSymbol( "?Y" ), makeSymbol( "?EVENT" ), makeSymbol( "?SYMPTOM-TYPE" ) ), ConsesLow.list( makeSymbol(
                                                                              "?SYMPTOM-TYPE" ), makeSymbol( "?Y" ), makeSymbol( "?EVENT" ), makeSymbol( "?SYMPTOM" ) ), ConsesLow.list( makeSymbol( "?EVENT" ), makeSymbol(
                                                                                  "?Y" ), makeSymbol( "?SYMPTOM-TYPE" ), makeSymbol( "?SYMPTOM" ) ), ConsesLow.list( makeSymbol( "?Y" ), makeSymbol( "?EVENT" ), makeSymbol(
                                                                                      "?SYMPTOM-TYPE" ), makeSymbol( "?SYMPTOM" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                                          .reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                              "eventHasDiagnosisOrFinding" ) ), makeSymbol( "?CCF-EVENT" ), makeSymbol( "?MEDICAL-DIAGNOSIS-OR-FINDING" ) ), ConsesLow.list(
                                                                                                  constant_handles.reader_make_constant_shell( makeString( "cCFAnginaRestPain" ) ), makeSymbol(
                                                                                                      "?MEDICAL-DIAGNOSIS-OR-FINDING" ), makeSymbol( "?ANGINA-REST-PAIN" ) ), ConsesLow.list( constant_handles
                                                                                                          .reader_make_constant_shell( makeString( "patientTreated" ) ), makeSymbol( "?CCF-EVENT" ), makeSymbol(
                                                                                                              "?ANIMAL" ) ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                  "MedicalResearchRecommendedWFFCheckingMt" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                                                                                                      "?CCF-EVENT" ), makeSymbol( "?ANIMAL" ), makeSymbol( "?ANGINA-REST-PAIN" ), makeSymbol(
                                                                                                                          "?MEDICAL-DIAGNOSIS-OR-FINDING" ) ), ConsesLow.list( makeSymbol(
                                                                                                                              "?MEDICAL-DIAGNOSIS-OR-FINDING" ), makeSymbol( "?ANIMAL" ), makeSymbol( "?ANGINA-REST-PAIN" ),
                                                                                                                              makeSymbol( "?CCF-EVENT" ) ), ConsesLow.list( makeSymbol( "?ANGINA-REST-PAIN" ), makeSymbol(
                                                                                                                                  "?ANIMAL" ), makeSymbol( "?MEDICAL-DIAGNOSIS-OR-FINDING" ), makeSymbol( "?CCF-EVENT" ) ),
                                                                                                                      ConsesLow.list( makeSymbol( "?ANIMAL" ), makeSymbol( "?ANGINA-REST-PAIN" ), makeSymbol(
                                                                                                                          "?MEDICAL-DIAGNOSIS-OR-FINDING" ), makeSymbol( "?CCF-EVENT" ) ) ) ), ConsesLow.list( ConsesLow
                                                                                                                              .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ),
                                                                                                                                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                      "cCFHematocritTestValue" ) ), makeSymbol( "?BLOOD-TEST" ), makeSymbol(
                                                                                                                                          "?SCALAR-VALUE" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                              makeString( "patientTreated" ) ), makeSymbol( "?BLOOD-TEST" ), makeSymbol(
                                                                                                                                                  "?Y" ) ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                      "MedicalResearchRecommendedWFFCheckingMt" ) ) ), ConsesLow.list(
                                                                                                                                                          ConsesLow.list( makeSymbol( "?Y" ), makeSymbol( "?BLOOD-TEST" ),
                                                                                                                                                              makeSymbol( "?SCALAR-VALUE" ) ), ConsesLow.list( makeSymbol(
                                                                                                                                                                  "?SCALAR-VALUE" ), makeSymbol( "?BLOOD-TEST" ),
                                                                                                                                                                  makeSymbol( "?Y" ) ), ConsesLow.list( makeSymbol(
                                                                                                                                                                      "?BLOOD-TEST" ), makeSymbol( "?SCALAR-VALUE" ),
                                                                                                                                                                      makeSymbol( "?Y" ) ) ) ), ConsesLow.list( ConsesLow
                                                                                                                                                                          .list( ConsesLow.list( constant_handles
                                                                                                                                                                              .reader_make_constant_shell( makeString(
                                                                                                                                                                                  "and" ) ), ConsesLow.list(
                                                                                                                                                                                      constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "isa" ) ),
                                                                                                                                                                                      makeSymbol( "?THING" ),
                                                                                                                                                                                      constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString(
                                                                                                                                                                                                  "ElectrophysiologyStudy-CCFManagement" ) ) ),
                                                                                                                                                                              ConsesLow.list( constant_handles
                                                                                                                                                                                  .reader_make_constant_shell( makeString(
                                                                                                                                                                                      "patientTreated" ) ), makeSymbol(
                                                                                                                                                                                          "?THING" ), makeSymbol(
                                                                                                                                                                                              "?Y" ) ) ), constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "MedicalResearchRecommendedWFFCheckingMt" ) ) ),
                                                                                                                                                                          ConsesLow.list( ConsesLow.list( makeSymbol(
                                                                                                                                                                              "?Y" ), makeSymbol( "?THING" ) ), ConsesLow
                                                                                                                                                                                  .list( makeSymbol( "?THING" ), makeSymbol(
                                                                                                                                                                                      "?Y" ) ) ) ), ConsesLow.list(
                                                                                                                                                                                          ConsesLow.list( ConsesLow.list(
                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString( "and" ) ),
                                                                                                                                                                                              ConsesLow.list(
                                                                                                                                                                                                  constant_handles
                                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "isa" ) ),
                                                                                                                                                                                                  makeSymbol( "?THING" ),
                                                                                                                                                                                                  constant_handles
                                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "SurgicalProcedure_eps" ) ) ),
                                                                                                                                                                                              ConsesLow.list(
                                                                                                                                                                                                  constant_handles
                                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "patientTreated" ) ),
                                                                                                                                                                                                  makeSymbol( "?THING" ),
                                                                                                                                                                                                  makeSymbol( "?Y" ) ) ),
                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "MedicalResearchRecommendedWFFCheckingMt" ) ) ),
                                                                                                                                                                                          ConsesLow.list( ConsesLow.list(
                                                                                                                                                                                              makeSymbol( "?Y" ),
                                                                                                                                                                                              makeSymbol( "?THING" ) ),
                                                                                                                                                                                              ConsesLow.list( makeSymbol(
                                                                                                                                                                                                  "?THING" ), makeSymbol(
                                                                                                                                                                                                      "?Y" ) ) ) )
    } );
  }

  @Override
  public void declareFunctions()
  {
    declare_variable_unification_file();
  }

  @Override
  public void initializeVariables()
  {
    init_variable_unification_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_variable_unification_file();
  }
  static
  {
    me = new variable_unification();
    $variable_similarity_default_fudge_factor$ = null;
    $literal_set_G_mt$ = null;
    $literal_free_variables_cached_caching_state$ = null;
    $list0 = ConsesLow.list( makeSymbol( "NEGATION-OPERATOR" ), makeSymbol( "NEGATED-SENTENCE" ) );
    $list1 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "or" ) ) );
    $kw2$IGNORE = makeKeyword( "IGNORE" );
    $sym3$APPLY_DEMORGANS = makeSymbol( "APPLY-DEMORGANS" );
    $list4 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ) );
    $const5$unknownSentence = constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) );
    $sym6$CONVERT_TO_DNF_INT = makeSymbol( "CONVERT-TO-DNF-INT" );
    $const7$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const8$or = constant_handles.reader_make_constant_shell( makeString( "or" ) );
    $sym9$COLLAPSE_GROUPS = makeSymbol( "COLLAPSE-GROUPS" );
    $sym10$GATHER_DNF_ARG_CONSTRAINTS_INT = makeSymbol( "GATHER-DNF-ARG-CONSTRAINTS-INT" );
    $sym11$NULL = makeSymbol( "NULL" );
    $const12$True = constant_handles.reader_make_constant_shell( makeString( "True" ) );
    $list13 = ConsesLow.list( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "IRREFLEXIVE-PREDICATE?" ) ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EL-VAR?" ) ),
        ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "VAR1" ) ) ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "EL-VAR?" ) ), ConsesLow.list( makeKeyword( "BIND" ),
            makeSymbol( "VAR2" ) ) ) );
    $sym14$VAR2 = makeSymbol( "VAR2" );
    $sym15$VAR1 = makeSymbol( "VAR1" );
    $sym16$GET_VAR_MAP_FOR_FORMULA = makeSymbol( "GET-VAR-MAP-FOR-FORMULA" );
    $const17$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list18 = ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "COL" ) ) );
    $sym19$COL = makeSymbol( "COL" );
    $const20$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $float21$0_0 = makeDouble( 0.0 );
    $float22$1_0 = makeDouble( 1.0 );
    $sym23$VARIABLE_SIMILARITY = makeSymbol( "VARIABLE-SIMILARITY" );
    $float24$1_1 = makeDouble( 1.1 );
    $sym25$VARIABLE_SIMILARITY_ABOUT_THE_SAME_ = makeSymbol( "VARIABLE-SIMILARITY-ABOUT-THE-SAME?" );
    $sym26$CYC_VAR_ = makeSymbol( "CYC-VAR?" );
    $sym27$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $list28 = ConsesLow.cons( makeSymbol( "VAR1" ), makeSymbol( "VARS" ) );
    $list29 = ConsesLow.cons( makeSymbol( "SOURCE-VAR" ), makeSymbol( "TARGET-VARS" ) );
    $sym30$CDR = makeSymbol( "CDR" );
    $list31 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "and" ) ), makeKeyword( "ANYTHING" ) );
    $sym32$CAR_CDR_EQUAL_ = makeSymbol( "CAR-CDR-EQUAL?" );
    $sym33$FIND_REDUNDANT_LITERALS = makeSymbol( "FIND-REDUNDANT-LITERALS" );
    $list34 = ConsesLow.cons( constant_handles.reader_make_constant_shell( makeString( "or" ) ), makeKeyword( "ANYTHING" ) );
    $const35$not = constant_handles.reader_make_constant_shell( makeString( "not" ) );
    $const36$assertedSentence = constant_handles.reader_make_constant_shell( makeString( "assertedSentence" ) );
    $sym37$EL_CONJUNCTION_P = makeSymbol( "EL-CONJUNCTION-P" );
    $sym38$LITERAL_SET__ = makeSymbol( "LITERAL-SET->" );
    $sym39$SET_ELEMENT_LIST = makeSymbol( "SET-ELEMENT-LIST" );
    $sym40$STRING_ = makeSymbol( "STRING<" );
    $sym41$EL_VAR_NAME = makeSymbol( "EL-VAR-NAME" );
    $sym42$LITERAL_FREE_VARIABLES_CACHED = makeSymbol( "LITERAL-FREE-VARIABLES-CACHED" );
    $sym43$_LITERAL_FREE_VARIABLES_CACHED_CACHING_STATE_ = makeSymbol( "*LITERAL-FREE-VARIABLES-CACHED-CACHING-STATE*" );
    $int44$32 = makeInteger( 32 );
    $sym45$FIND_UNCONNECTED_LITERALS = makeSymbol( "FIND-UNCONNECTED-LITERALS" );
    $sym46$FIND_INCONSISTENT_LITERALS = makeSymbol( "FIND-INCONSISTENT-LITERALS" );
    $sym47$ARG_POSITIONS_EQ = makeSymbol( "ARG-POSITIONS-EQ" );
    $kw48$TEST = makeKeyword( "TEST" );
    $kw49$OWNER = makeKeyword( "OWNER" );
    $kw50$CLASSES = makeKeyword( "CLASSES" );
    $list51 = ConsesLow.list( makeSymbol( "CAE-TEST-CASE-TABLES" ), makeSymbol( "VARIABLE-UNIFICATION-TEST-CASE-TABLES" ) );
    $kw52$KB = makeKeyword( "KB" );
    $kw53$TINY = makeKeyword( "TINY" );
    $kw54$WORKING_ = makeKeyword( "WORKING?" );
    $list55 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ) ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ),
                constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "not" ) ),
                    ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles
                        .reader_make_constant_shell( makeString( "Thing" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ) ) ), ConsesLow.list( constant_handles
                            .reader_make_constant_shell( makeString( "or" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ), constant_handles.reader_make_constant_shell( makeString(
                                    "Collection" ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list( constant_handles
                                        .reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell(
                                            makeString( "Thing" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) ) ) ),
                                        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "or" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "not" ) ), ConsesLow
                                            .list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ), constant_handles
                                                .reader_make_constant_shell( makeString( "Collection" ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list(
                                                    constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ), constant_handles
                                                        .reader_make_constant_shell( makeString( "Thing" ) ) ) ) ) ) );
    $sym56$SETS_EQUAL_ = makeSymbol( "SETS-EQUAL?" );
    $sym57$GET_INCOMPATIBLE_VARIABLES_IN_COMPLEX_SENTENCE_AS_ALIST = makeSymbol( "GET-INCOMPATIBLE-VARIABLES-IN-COMPLEX-SENTENCE-AS-ALIST" );
    $sym58$INCOMPATIBLE_VAR_MAP_ALISTS_EQUAL_ = makeSymbol( "INCOMPATIBLE-VAR-MAP-ALISTS-EQUAL?" );
    $kw59$FULL = makeKeyword( "FULL" );
    $list60 = _constant_60_initializer();
    $list61 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), makeSymbol( "?Y" ) ) ), NIL ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol(
          "?X" ), makeSymbol( "?Y" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?Y" ), makeSymbol( "?Z" ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow
              .list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell(
                  makeString( "Thing" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "Collection" ) ), makeSymbol( "?Z" ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                          "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "Collection" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell(
                                  makeString( "Collection" ) ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                      .reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), makeSymbol( "?Y" ) ),
                                      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?Y" ), makeSymbol( "?Z" ) ), ConsesLow.list( constant_handles
                                          .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?W" ), makeSymbol( "?V" ) ) ) ), ConsesLow.list( ConsesLow.list( THREE_INTEGER ) ) ), ConsesLow.list( ConsesLow
                                              .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "or" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                                                  makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Individual" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                      "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                          constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "or" ) ), ConsesLow
                                                              .list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString(
                                                                  "Individual" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles
                                                                      .reader_make_constant_shell( makeString( "Collection" ) ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                          .reader_make_constant_shell( makeString( "or" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol(
                                                                              "?X" ), constant_handles.reader_make_constant_shell( makeString( "Individual" ) ) ), ConsesLow.list( constant_handles
                                                                                  .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?Y" ), constant_handles.reader_make_constant_shell( makeString(
                                                                                      "Collection" ) ) ) ) ), ConsesLow.list( ConsesLow.list( ONE_INTEGER ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                          constant_handles.reader_make_constant_shell( makeString( "genls" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                              "Individual" ) ), constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) ) ), NIL ), ConsesLow.list(
                                                                                                  ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list(
                                                                                                      constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), makeSymbol( "?Y" ) ),
                                                                                                      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?Y" ), makeSymbol(
                                                                                                          "?Z" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genls" ) ), constant_handles
                                                                                                              .reader_make_constant_shell( makeString( "Individual" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                  makeString( "Collection" ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                                                      constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
                                                                                                                          .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), makeSymbol( "?Y" ) ),
                                                                                                                      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol(
                                                                                                                          "?W" ), makeSymbol( "?Z" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                              makeString( "genls" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                  "Individual" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                      "Collection" ) ) ) ) ), ConsesLow.list( ConsesLow.list( ONE_INTEGER ) ) ), ConsesLow
                                                                                                                                          .list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                                              .reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list(
                                                                                                                                                  constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                                                                                                                                                  makeSymbol( "?X" ), makeSymbol( "?Y" ) ), ConsesLow.list( constant_handles
                                                                                                                                                      .reader_make_constant_shell( makeString( "genls" ) ), constant_handles
                                                                                                                                                          .reader_make_constant_shell( makeString( "Individual" ) ),
                                                                                                                                                      constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                          "Collection" ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list(
                                                                                                                                                              ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                                                  makeString( "and" ) ), ConsesLow.list( constant_handles
                                                                                                                                                                      .reader_make_constant_shell( makeString( "isa" ) ),
                                                                                                                                                                      constant_handles.reader_make_constant_shell(
                                                                                                                                                                          makeString( "Thing" ) ), makeSymbol( "?Y" ) ),
                                                                                                                                                                  ConsesLow.list( constant_handles
                                                                                                                                                                      .reader_make_constant_shell( makeString( "genls" ) ),
                                                                                                                                                                      makeSymbol( "?X" ), constant_handles
                                                                                                                                                                          .reader_make_constant_shell( makeString(
                                                                                                                                                                              "Thing" ) ) ) ) ), ConsesLow.list( ConsesLow
                                                                                                                                                                                  .list( TWO_INTEGER ) ) ), ConsesLow.list(
                                                                                                                                                                                      ConsesLow.list( ConsesLow.list(
                                                                                                                                                                                          constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString( "and" ) ),
                                                                                                                                                                                          ConsesLow.list( constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString( "isa" ) ),
                                                                                                                                                                                              makeSymbol( "?X" ),
                                                                                                                                                                                              makeSymbol( "?Y" ) ),
                                                                                                                                                                                          ConsesLow.list( constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString( "isa" ) ),
                                                                                                                                                                                              makeSymbol( "?Y" ),
                                                                                                                                                                                              makeSymbol( "?Z" ) ),
                                                                                                                                                                                          ConsesLow.list( constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString( "not" ) ),
                                                                                                                                                                                              ConsesLow.list(
                                                                                                                                                                                                  constant_handles
                                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "isa" ) ),
                                                                                                                                                                                                  makeSymbol( "?V" ),
                                                                                                                                                                                                  makeSymbol(
                                                                                                                                                                                                      "?W" ) ) ) ) ),
                                                                                                                                                                                      ConsesLow.list( ConsesLow.list(
                                                                                                                                                                                          THREE_INTEGER, ONE_INTEGER ) ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol(
          "?X" ), makeSymbol( "?Y" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?Y" ), makeSymbol( "?Z" ) ), ConsesLow.list( constant_handles
              .reader_make_constant_shell( makeString( "unknownSentence" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?V" ), makeSymbol( "?W" ) ) ) ) ), ConsesLow
                  .list( ConsesLow.list( THREE_INTEGER, ONE_INTEGER ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list(
                      constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), makeSymbol( "?Y" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "or" ) ),
                          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ),
                              makeSymbol( "?Z" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?Z" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                  makeString( "isa" ) ), makeSymbol( "?Z" ) ) ) ) ), ConsesLow.list( ConsesLow.list( TWO_INTEGER, TWO_INTEGER ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                      .reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "patientTreated" ) ), makeSymbol( "?MAIN-PROC" ),
                                          makeSymbol( "?PAT" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "not" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                              makeString( "thereExists" ) ), makeSymbol( "?SURG-PROC" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list(
                                                  constant_handles.reader_make_constant_shell( makeString( "concomitantProcedures" ) ), makeSymbol( "?MAIN-PROC" ), makeSymbol( "?SURG-PROC" ) ), ConsesLow.list(
                                                      constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?SURG-PROC" ), constant_handles.reader_make_constant_shell( makeString(
                                                          "Thing" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "patientTreated" ) ), makeSymbol( "?SURG-PROC" ), makeSymbol(
                                                              "?PAT" ) ) ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow
                                                                  .list( constant_handles.reader_make_constant_shell( makeString( "patientTreated" ) ), makeSymbol( "?MAIN-PROC" ), makeSymbol( "?PAT" ) ), ConsesLow.list(
                                                                      constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeSymbol( "?SURG-PROC" ), ConsesLow.list( constant_handles
                                                                          .reader_make_constant_shell( makeString( "or" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                              "concomitantProcedures" ) ), makeSymbol( "?MAIN-PROC" ), makeSymbol( "?SURG-PROC" ) ), ConsesLow.list( constant_handles
                                                                                  .reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?SURG-PROC" ), constant_handles.reader_make_constant_shell( makeString(
                                                                                      "Thing" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "patientTreated" ) ), makeSymbol(
                                                                                          "?SURG-PROC" ), makeSymbol( "?PAT" ) ) ) ) ) ), ConsesLow.list( ConsesLow.list( TWO_INTEGER, TWO_INTEGER, TWO_INTEGER ) ) )
    } );
    $list62 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Event" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ),
            constant_handles.reader_make_constant_shell( makeString( "Person" ) ) ) ), constant_handles.reader_make_constant_shell( makeString( "TerrorismRecommendedWffCheckingMt" ) ) ), ConsesLow.list( ConsesLow.list(
                TWO_INTEGER ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                    makeString( "eventOccursAt" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Pi-Number" ) ) ) ), constant_handles.reader_make_constant_shell( makeString(
                        "TerrorismRecommendedWffCheckingMt" ) ) ), ConsesLow.list( ConsesLow.list( ONE_INTEGER ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                            makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "eventOccursAt" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell(
                                makeString( "Pi-Number" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell(
                                    makeString( "Event" ) ) ) ), constant_handles.reader_make_constant_shell( makeString( "TerrorismRecommendedWffCheckingMt" ) ) ), ConsesLow.list( ConsesLow.list( ONE_INTEGER ) ) ),
        ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol(
            "?X" ), constant_handles.reader_make_constant_shell( makeString( "Event" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "eventOccursAt" ) ), makeSymbol( "?X" ),
                constant_handles.reader_make_constant_shell( makeString( "Pi-Number" ) ) ) ), constant_handles.reader_make_constant_shell( makeString( "TerrorismRecommendedWffCheckingMt" ) ) ), ConsesLow.list( ConsesLow
                    .list( TWO_INTEGER ) ) ) );
  }
}
/*
 * 
 * Total time: 682 ms
 * 
 */