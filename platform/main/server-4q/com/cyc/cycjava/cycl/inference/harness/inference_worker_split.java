package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.graph_utilities;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_worker_split
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker_split";
  public static final String myFingerPrint = "4bbf87441d5606031ece8abd341f3f29aec9efdd89b69a497701ca79a13697f6";
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 5317L)
  private static SubLSymbol $split_module$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 9067L)
  public static SubLSymbol $split_tactic_default_preference_level$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 9449L)
  public static SubLSymbol $split_tactic_default_preference_level_justification$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 18961L)
  public static SubLSymbol $meta_split_tactics_enabledP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 19204L)
  private static SubLSymbol $determine_new_split_tactics_module$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 19330L)
  public static SubLSymbol $meta_split_tactic_default_preference_level$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 19407L)
  public static SubLSymbol $meta_split_tactic_default_preference_level_justification$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 22930L)
  private static SubLSymbol $meta_split_criteria$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 23080L)
  private static SubLSymbol $meta_split_tactics_do_single_literals_firstP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 23152L)
  private static SubLSymbol $meta_split_favors_problem_reuseP$;
  private static final SubLSymbol $kw0$SPLIT;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$SPLIT_LINK_VAR;
  private static final SubLSymbol $sym3$CLET;
  private static final SubLSymbol $sym4$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS_NUMBERED;
  private static final SubLSymbol $sym5$PWHEN;
  private static final SubLSymbol $sym6$PROBLEM_LINK_INDEX_OPEN_;
  private static final SubLString $str7$_s_is_not_a_supporting_mapped_pro;
  private static final SubLString $str8$couldn_t_find_any_split_tactics_f;
  private static final SubLSymbol $sym9$HL_VAR_;
  private static final SubLSymbol $kw10$SKIP;
  private static final SubLString $str11$Could_not_find_the_link_for__a;
  private static final SubLSymbol $sym12$SPLIT_TACTIC_P;
  private static final SubLString $str13$Generalized_tactic__a_did_not_ind;
  private static final SubLString $str14$Tried_to_make_a_split_link_with_l;
  private static final SubLSymbol $kw15$TACTICAL;
  private static final SubLSymbol $kw16$PREFERRED;
  private static final SubLString $str17$the_default_for_split_tactics;
  private static final SubLSymbol $kw18$PROVEN;
  private static final SubLSymbol $kw19$NEG;
  private static final SubLSymbol $kw20$POS;
  private static final SubLSymbol $sym21$HL_VARIABLE_P;
  private static final SubLSymbol $sym22$_DETERMINE_NEW_SPLIT_TACTICS_MODULE_;
  private static final SubLSymbol $kw23$DETERMINE_NEW_SPLIT_TACTICS;
  private static final SubLString $str24$the_default_for_meta_split_tactic;
  private static final SubLSymbol $kw25$META_STRUCTURAL;
  private static final SubLString $str26$unexpected_meta_structural_tactic;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLSymbol $kw30$ONE_NO_GOOD;
  private static final SubLSymbol $kw31$ALL_SINGLE_LITERAL;
  private static final SubLSymbol $kw32$ALL_PROBLEM_REUSE;
  private static final SubLSymbol $kw33$ONE_CLOSED;
  private static final SubLSymbol $kw34$ONE_CLOSED_PROBLEM_REUSE;
  private static final SubLSymbol $kw35$ALL_SINGLE_LITERAL_PROBLEM_REUSE;
  private static final SubLSymbol $kw36$ALL_THE_REST;
  private static final SubLString $str37$Unknown_meta_split_criterion__s;
  private static final SubLList $list38;

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 864L)
  public static SubLObject split_link_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_datastructures_problem_link.problem_link_p( v_object ) && $kw0$SPLIT == inference_datastructures_problem_link.problem_link_type( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 1216L)
  public static SubLObject maybe_new_split_link(final SubLObject supported_problem, final SubLObject dnf_clause)
  {
    SubLObject split_link = problem_first_split_argument_link( supported_problem );
    if( NIL == split_link )
    {
      final SubLObject store = inference_datastructures_problem.problem_store( supported_problem );
      final SubLObject supporting_mapped_problems = find_or_create_split_link_supporting_problems( store, dnf_clause, supported_problem );
      split_link = new_split_link( supported_problem, supporting_mapped_problems );
    }
    return split_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 1757L)
  public static SubLObject new_split_link(final SubLObject supported_problem, final SubLObject supporting_mapped_problems)
  {
    final SubLObject split_link = inference_datastructures_problem_link.new_problem_link( $kw0$SPLIT, supported_problem );
    SubLObject cdolist_list_var = supporting_mapped_problems;
    SubLObject supporting_mapped_problem = NIL;
    supporting_mapped_problem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link( supporting_mapped_problem, split_link );
      cdolist_list_var = cdolist_list_var.rest();
      supporting_mapped_problem = cdolist_list_var.first();
    }
    inference_worker.propagate_problem_link( split_link );
    return split_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 2252L)
  public static SubLObject destroy_split_link(final SubLObject split_link)
  {
    SubLObject cdolist_list_var = split_link_tactics_int( split_link );
    SubLObject tactic = NIL;
    tactic = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != inference_datastructures_tactic.valid_tactic_p( tactic ) )
      {
        inference_datastructures_tactic.destroy_problem_tactic_and_backpointers( tactic );
      }
      cdolist_list_var = cdolist_list_var.rest();
      tactic = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 2519L)
  public static SubLObject do_split_link_open_supporting_mapped_problems_numbered(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject supporting_mapped_problem_var = NIL;
    SubLObject index_var = NIL;
    SubLObject split_link = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    supporting_mapped_problem_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    index_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    split_link = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject split_link_var = $sym2$SPLIT_LINK_VAR;
      return ConsesLow.list( $sym3$CLET, ConsesLow.list( ConsesLow.list( split_link_var, split_link ) ), ConsesLow.list( $sym4$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS_NUMBERED, ConsesLow.list(
          supporting_mapped_problem_var, index_var, split_link_var ), ConsesLow.listS( $sym5$PWHEN, ConsesLow.list( $sym6$PROBLEM_LINK_INDEX_OPEN_, split_link_var, index_var ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list1 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 2961L)
  public static SubLObject split_link_tactic(final SubLObject split_link, final SubLObject supporting_mapped_problem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subl_promotions.memberP( supporting_mapped_problem, inference_datastructures_problem_link.problem_link_supporting_mapped_problems( split_link ),
        Symbols.symbol_function( EQ ), UNPROVIDED ) )
    {
      Errors.error( $str7$_s_is_not_a_supporting_mapped_pro, supporting_mapped_problem, split_link );
    }
    final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem( split_link );
    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics( supported_problem );
    SubLObject tactic = NIL;
    tactic = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match( tactic, $split_module$.getDynamicValue( thread ) ) )
      {
        final SubLObject candidate_mapped_problem = find_split_tactic_supporting_mapped_problem( tactic );
        if( candidate_mapped_problem.eql( supporting_mapped_problem ) )
        {
          return tactic;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      tactic = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 3631L)
  public static SubLObject split_link_tactics(final SubLObject split_link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject tactics = split_link_tactics_int( split_link );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == tactics )
    {
      Errors.error( $str8$couldn_t_find_any_split_tactics_f, split_link );
    }
    return tactics;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 3862L)
  public static SubLObject split_link_tactics_int(final SubLObject split_link)
  {
    SubLObject tactics = NIL;
    final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem( split_link );
    SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics( supported_problem );
    SubLObject tactic = NIL;
    tactic = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != generalized_split_tactic_p( tactic ) )
      {
        tactics = ConsesLow.cons( tactic, tactics );
      }
      cdolist_list_var = cdolist_list_var.rest();
      tactic = cdolist_list_var.first();
    }
    return Sequences.nreverse( tactics );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 4173L)
  public static SubLObject close_split_link(final SubLObject split_link)
  {
    SubLObject index = ZERO_INTEGER;
    SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems( split_link );
    SubLObject supporting_mapped_problem = NIL;
    supporting_mapped_problem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != inference_macros.do_problem_link_open_matchP( NIL, split_link, supporting_mapped_problem ) )
      {
        if( NIL != inference_datastructures_problem_link.problem_link_index_openP( split_link, index ) )
        {
          inference_datastructures_problem_link.problem_link_close_index( split_link, index );
          inference_worker.consider_that_mapped_problem_could_be_irrelevant( supporting_mapped_problem, split_link );
        }
        index = Numbers.add( index, ONE_INTEGER );
      }
      cdolist_list_var = cdolist_list_var.rest();
      supporting_mapped_problem = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 4599L)
  public static SubLObject find_or_create_split_link_supporting_problems(final SubLObject store, final SubLObject dnf_clause, final SubLObject supported_problem)
  {
    final SubLObject split_clauses = determine_shared_variable_islands( dnf_clause );
    final SubLObject supported_problem_free_hl_vars = inference_datastructures_problem.problem_free_hl_vars( supported_problem );
    SubLObject supporting_mapped_problems = NIL;
    SubLObject cdolist_list_var = split_clauses;
    SubLObject subquery = NIL;
    subquery = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject subquery_free_hl_vars = variables.sort_hl_variable_list_memoized( conses_high.intersection( cycl_utilities.expression_gather( subquery, $sym9$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED ), supported_problem_free_hl_vars, UNPROVIDED, UNPROVIDED ) );
      final SubLObject supporting_mapped_problem = inference_worker.find_or_create_problem( store, subquery, subquery_free_hl_vars, UNPROVIDED );
      supporting_mapped_problems = ConsesLow.cons( supporting_mapped_problem, supporting_mapped_problems );
      cdolist_list_var = cdolist_list_var.rest();
      subquery = cdolist_list_var.first();
    }
    return Sequences.nreverse( supporting_mapped_problems );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 5442L)
  public static SubLObject split_tactic_p(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != inference_datastructures_tactic.tactic_p( v_object ) && $split_module$.getDynamicValue( thread ).eql( inference_datastructures_tactic.tactic_hl_module( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 5582L)
  public static SubLObject new_split_tactic(final SubLObject supported_problem, final SubLObject index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject tactic = inference_datastructures_tactic.new_tactic( supported_problem, $split_module$.getDynamicValue( thread ), index );
    final SubLObject store = inference_datastructures_problem.problem_store( supported_problem );
    final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw10$SKIP ) )
    {
      final SubLObject idx_$1 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$1, $kw10$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$1 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject inference;
        SubLObject inference_var;
        SubLObject set_var;
        SubLObject set_contents_var;
        SubLObject basis_object;
        SubLObject state;
        SubLObject strategy;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          inference = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw10$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( inference ) )
            {
              inference = $kw10$SKIP;
            }
            if( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( supported_problem, inference ) )
            {
              inference_var = inference;
              set_var = inference_datastructures_inference.inference_strategy_set( inference_var );
              set_contents_var = set.do_set_internal( set_var );
              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
                  .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
              {
                strategy = set_contents.do_set_contents_next( basis_object, state );
                if( NIL != set_contents.do_set_contents_element_validP( state, strategy ) )
                {
                  inference_tactician.strategy_note_new_tactic( strategy, tactic );
                }
              }
            }
          }
        }
      }
      final SubLObject idx_$2 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$2 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$2 );
        SubLObject id2 = NIL;
        SubLObject inference2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            inference2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( supported_problem, inference2 ) )
            {
              final SubLObject inference_var2 = inference2;
              final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set( inference_var2 );
              final SubLObject set_contents_var2 = set.do_set_internal( set_var2 );
              SubLObject basis_object2;
              SubLObject state2;
              SubLObject strategy2;
              for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                  set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
              {
                strategy2 = set_contents.do_set_contents_next( basis_object2, state2 );
                if( NIL != set_contents.do_set_contents_element_validP( state2, strategy2 ) )
                {
                  inference_tactician.strategy_note_new_tactic( strategy2, tactic );
                }
              }
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return tactic;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 5863L)
  public static SubLObject split_tactic_supporting_mapped_problem_index(final SubLObject tactic)
  {
    return inference_datastructures_tactic.tactic_data( tactic );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 5976L)
  public static SubLObject split_tactic_link(final SubLObject split_tactic)
  {
    final SubLObject problem = inference_datastructures_tactic.tactic_problem( split_tactic );
    final SubLObject split_link = problem_sole_split_argument_link( problem );
    if( NIL != split_link )
    {
      return split_link;
    }
    return Errors.error( $str11$Could_not_find_the_link_for__a, split_tactic );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 6257L)
  public static SubLObject find_split_tactic_supporting_mapped_problem(final SubLObject tactic)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != split_tactic_p( tactic ) : tactic;
    final SubLObject index = split_tactic_supporting_mapped_problem_index( tactic );
    final SubLObject link = split_tactic_link( tactic );
    final SubLObject supporting_mapped_problem = inference_datastructures_problem_link.find_supporting_mapped_problem_by_index( link, index );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == supporting_mapped_problem )
    {
      Errors.error( $str13$Generalized_tactic__a_did_not_ind, tactic );
    }
    return Values.values( supporting_mapped_problem, link );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 6728L)
  public static SubLObject find_split_tactic_supporting_problem(final SubLObject tactic)
  {
    return inference_datastructures_problem_link.mapped_problem_problem( find_split_tactic_supporting_mapped_problem( tactic ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 6880L)
  public static SubLObject discard_all_other_possible_split_tactics(final SubLObject tactic)
  {
    if( NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP( inference_datastructures_tactic.tactic_store( tactic ) ) )
    {
      final SubLObject problem = inference_datastructures_tactic.tactic_problem( tactic );
      return inference_worker.discard_possible_tactics_int( problem, NIL, NIL, $kw0$SPLIT, tactic, NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 7232L)
  public static SubLObject determine_new_split_tactics(final SubLObject supported_problem, final SubLObject dnf_clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject split_link = maybe_new_split_link( supported_problem, dnf_clause );
    final SubLObject supporting_problem_count = inference_datastructures_problem_link.problem_link_supporting_mapped_problem_count( split_link );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !supporting_problem_count.numG( ONE_INTEGER ) )
    {
      Errors.error( $str14$Tried_to_make_a_split_link_with_l, split_link );
    }
    inference_worker.consider_that_problem_could_be_no_good( supported_problem, NIL, $kw15$TACTICAL, T );
    if( NIL == inference_worker.no_good_problem_p( supported_problem, $kw15$TACTICAL ) )
    {
      SubLObject index = ZERO_INTEGER;
      final SubLObject link_var = split_link;
      SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems( link_var );
      SubLObject supporting_mapped_problem = NIL;
      supporting_mapped_problem = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != inference_macros.do_problem_link_open_matchP( NIL, link_var, supporting_mapped_problem ) )
        {
          new_split_tactic( supported_problem, index );
          index = Numbers.add( index, ONE_INTEGER );
        }
        cdolist_list_var = cdolist_list_var.rest();
        supporting_mapped_problem = cdolist_list_var.first();
      }
    }
    return supported_problem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 7933L)
  public static SubLObject compute_strategic_properties_of_split_tactic(final SubLObject tactic, final SubLObject supporting_problem, final SubLObject strategy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject problem = inference_datastructures_tactic.tactic_problem( tactic );
    if( NIL == preference_modules.preference_level_p( inference_datastructures_tactic.tactic_preference_level( tactic ) ) )
    {
      thread.resetMultipleValues();
      final SubLObject preference_level = compute_split_tactic_preference_level( problem, supporting_problem, $kw15$TACTICAL );
      final SubLObject justification = thread.secondMultipleValue();
      thread.resetMultipleValues();
      inference_datastructures_tactic.set_tactic_preference_level( tactic, preference_level, justification );
    }
    thread.resetMultipleValues();
    final SubLObject strategic_preference_level = compute_split_tactic_preference_level( problem, supporting_problem, strategy );
    final SubLObject justification = thread.secondMultipleValue();
    thread.resetMultipleValues();
    inference_datastructures_strategy.set_tactic_strategic_preference_level( tactic, strategy, strategic_preference_level, justification );
    final SubLObject strategic_productivity = compute_split_tactic_productivity( problem, supporting_problem, strategy );
    inference_datastructures_strategy.set_tactic_strategic_productivity( tactic, strategy, strategic_productivity );
    return tactic;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 8858L)
  public static SubLObject compute_split_tactic_productivity(final SubLObject supported_problem, final SubLObject supporting_problem, final SubLObject strategy)
  {
    return inference_lookahead_productivity.memoized_problem_max_removal_productivity( supporting_problem, strategy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 9556L)
  public static SubLObject compute_split_tactic_preference_level(final SubLObject supported_problem, final SubLObject supporting_problem, final SubLObject strategic_context)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject supporting_preference_level = inference_tactician_utilities.memoized_problem_global_preference_level( supporting_problem, strategic_context, NIL );
    SubLObject justification = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == preference_modules.disallowed_or_doomed_preference_level_p( supporting_preference_level ) )
    {
      supporting_preference_level = $split_tactic_default_preference_level$.getGlobalValue();
      justification = $split_tactic_default_preference_level_justification$.getGlobalValue();
    }
    return Values.values( supporting_preference_level, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 10371L)
  public static SubLObject execute_split_tactic(final SubLObject tactic)
  {
    final SubLObject split_link = split_tactic_link( tactic );
    final SubLObject index = split_tactic_supporting_mapped_problem_index( tactic );
    inference_worker.problem_link_open_and_repropagate_index( split_link, index );
    return tactic;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 10710L)
  public static SubLObject problem_sole_split_argument_link(final SubLObject problem)
  {
    return inference_datastructures_problem.problem_sole_argument_link_of_type( problem, $kw0$SPLIT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 10962L)
  public static SubLObject problem_first_split_argument_link(final SubLObject problem)
  {
    return inference_datastructures_problem.problem_first_argument_link_of_type( problem, $kw0$SPLIT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 11117L)
  public static SubLObject problem_has_split_argument_linkP(final SubLObject problem)
  {
    return list_utilities.sublisp_boolean( problem_first_split_argument_link( problem ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 11242L)
  public static SubLObject split_tactic_lookahead_problem(final SubLObject split_tactic)
  {
    final SubLObject supporting_mapped_problem = find_split_tactic_supporting_mapped_problem( split_tactic );
    return inference_datastructures_problem_link.mapped_problem_problem( supporting_mapped_problem );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 11565L)
  public static SubLObject split_link_supporting_problems_with_variables(final SubLObject split_link)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems( split_link );
    SubLObject supporting_mapped_problem = NIL;
    supporting_mapped_problem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != inference_macros.do_problem_link_open_matchP( NIL, split_link, supporting_mapped_problem ) )
      {
        final SubLObject problem = inference_datastructures_problem_link.mapped_problem_problem( supporting_mapped_problem );
        final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map( supporting_mapped_problem );
        if( NIL != inference_datastructures_problem.open_problem_p( problem ) )
        {
          result = ConsesLow.cons( problem, result );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      supporting_mapped_problem = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 11862L)
  public static SubLObject new_split_proof(final SubLObject link, final SubLObject subproofs_with_sub_bindings)
  {
    return inference_worker_join_ordered.new_conjunctive_proof( link, subproofs_with_sub_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 12135L)
  public static SubLObject split_proof_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_datastructures_proof.proof_p( v_object ) && $kw0$SPLIT == inference_datastructures_proof.proof_type( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 12262L)
  public static SubLObject bubble_up_proof_to_split_link(final SubLObject supporting_proof, final SubLObject my_variable_map, final SubLObject split_link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject proofs = NIL;
    SubLObject supporting_mapped_proof_lists_by_supporting_problem = NIL;
    final SubLObject my_supporting_problem = inference_datastructures_proof.proof_supported_problem( supporting_proof );
    SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems( split_link );
    SubLObject supporting_mapped_problem = NIL;
    supporting_mapped_problem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != inference_macros.do_problem_link_open_matchP( NIL, split_link, supporting_mapped_problem ) )
      {
        final SubLObject supporting_problem = inference_datastructures_problem_link.mapped_problem_problem( supporting_mapped_problem );
        final SubLObject variable_map = inference_datastructures_problem_link.mapped_problem_variable_map( supporting_mapped_problem );
        if( supporting_problem.eql( my_supporting_problem ) && NIL != bindings.bindings_equalP( variable_map, my_variable_map ) )
        {
          final SubLObject proof_bindings = inference_datastructures_proof.proof_bindings( supporting_proof );
          final SubLObject sub_proof_bindings = bindings.transfer_variable_map_to_bindings( my_variable_map, proof_bindings );
          supporting_mapped_proof_lists_by_supporting_problem = ConsesLow.cons( ConsesLow.list( ConsesLow.cons( supporting_proof, sub_proof_bindings ) ), supporting_mapped_proof_lists_by_supporting_problem );
        }
        else
        {
          SubLObject proofs_with_bindings = NIL;
          final SubLObject status_var = $kw18$PROVEN;
          SubLObject iteration_state;
          for( iteration_state = dictionary_contents.do_dictionary_contents_state( inference_datastructures_problem.problem_proof_bindings_index( supporting_problem ) ); NIL == dictionary_contents
              .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
          {
            thread.resetMultipleValues();
            final SubLObject v_bindings = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
            final SubLObject proof_list = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var_$3 = proof_list;
            SubLObject proof = NIL;
            proof = cdolist_list_var_$3.first();
            while ( NIL != cdolist_list_var_$3)
            {
              if( NIL != inference_datastructures_problem.proof_has_statusP( proof, status_var ) )
              {
                final SubLObject sub_proof_bindings2 = bindings.transfer_variable_map_to_bindings( variable_map, inference_datastructures_proof.proof_bindings( proof ) );
                proofs_with_bindings = ConsesLow.cons( ConsesLow.cons( proof, sub_proof_bindings2 ), proofs_with_bindings );
              }
              cdolist_list_var_$3 = cdolist_list_var_$3.rest();
              proof = cdolist_list_var_$3.first();
            }
          }
          dictionary_contents.do_dictionary_contents_finalize( iteration_state );
          supporting_mapped_proof_lists_by_supporting_problem = ConsesLow.cons( proofs_with_bindings, supporting_mapped_proof_lists_by_supporting_problem );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      supporting_mapped_problem = cdolist_list_var.first();
    }
    supporting_mapped_proof_lists_by_supporting_problem = Sequences.nreverse( supporting_mapped_proof_lists_by_supporting_problem );
    final SubLObject mapped_subproof_lists = cdolist_list_var = list_utilities.cartesian_product( supporting_mapped_proof_lists_by_supporting_problem, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject mapped_subproof_list = NIL;
    mapped_subproof_list = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject proof2 = new_split_proof( split_link, mapped_subproof_list );
      final SubLObject newP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != newP )
      {
        proofs = ConsesLow.cons( proof2, proofs );
      }
      else
      {
        inference_worker.possibly_note_proof_processed( supporting_proof );
      }
      cdolist_list_var = cdolist_list_var.rest();
      mapped_subproof_list = cdolist_list_var.first();
    }
    SubLObject cdolist_list_var2;
    proofs = ( cdolist_list_var2 = Sequences.nreverse( proofs ) );
    SubLObject proof3 = NIL;
    proof3 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      inference_worker.bubble_up_proof( proof3 );
      cdolist_list_var2 = cdolist_list_var2.rest();
      proof3 = cdolist_list_var2.first();
    }
    return proofs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 14636L)
  public static SubLObject all_literals_connected_by_shared_varsP(final SubLObject dnf_clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = clauses.neg_lits( dnf_clause );
    SubLObject contextualized_asent = NIL;
    contextualized_asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != el_utilities.hl_ground_tree_p( contextualized_asent ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      contextualized_asent = cdolist_list_var.first();
    }
    cdolist_list_var = clauses.pos_lits( dnf_clause );
    contextualized_asent = NIL;
    contextualized_asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != el_utilities.hl_ground_tree_p( contextualized_asent ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      contextualized_asent = cdolist_list_var.first();
    }
    thread.resetMultipleValues();
    final SubLObject connected_groups = categorize_clause_variables_via_literals( dnf_clause );
    final SubLObject isolated_groups = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return makeBoolean( NIL == isolated_groups && NIL != list_utilities.singletonP( connected_groups ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 15489L)
  public static SubLObject determine_shared_variable_islands(final SubLObject dnf_clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject islands = NIL;
    if( NIL != el_utilities.hl_ground_tree_p( dnf_clause ) )
    {
      SubLObject index = ZERO_INTEGER;
      SubLObject cdolist_list_var = clauses.neg_lits( dnf_clause );
      SubLObject contextualized_asent = NIL;
      contextualized_asent = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject sense = $kw19$NEG;
        final SubLObject island = inference_datastructures_problem_query.new_problem_query_from_contextualized_asent_sense( contextualized_asent, sense );
        islands = ConsesLow.cons( island, islands );
        index = Numbers.add( index, ONE_INTEGER );
        cdolist_list_var = cdolist_list_var.rest();
        contextualized_asent = cdolist_list_var.first();
      }
      index = ZERO_INTEGER;
      cdolist_list_var = clauses.pos_lits( dnf_clause );
      contextualized_asent = NIL;
      contextualized_asent = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject sense = $kw20$POS;
        final SubLObject island = inference_datastructures_problem_query.new_problem_query_from_contextualized_asent_sense( contextualized_asent, sense );
        islands = ConsesLow.cons( island, islands );
        index = Numbers.add( index, ONE_INTEGER );
        cdolist_list_var = cdolist_list_var.rest();
        contextualized_asent = cdolist_list_var.first();
      }
    }
    else
    {
      final SubLObject sensified_clause = sensify_contextualized_clause( dnf_clause );
      thread.resetMultipleValues();
      final SubLObject connected_groups = categorize_sensified_clause_variables_via_literals( sensified_clause );
      final SubLObject isolated_groups = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject cdolist_list_var2 = connected_groups;
      SubLObject group = NIL;
      group = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        final SubLObject island2 = categorized_group_to_problem_query( group );
        islands = ConsesLow.cons( island2, islands );
        cdolist_list_var2 = cdolist_list_var2.rest();
        group = cdolist_list_var2.first();
      }
      cdolist_list_var2 = isolated_groups;
      group = NIL;
      group = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        final SubLObject island2 = categorized_group_to_problem_query( group );
        islands = ConsesLow.cons( island2, islands );
        cdolist_list_var2 = cdolist_list_var2.rest();
        group = cdolist_list_var2.first();
      }
    }
    return list_utilities.fast_delete_duplicates( islands, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 16663L)
  public static SubLObject categorize_clause_variables_via_literals(final SubLObject clause)
  {
    final SubLObject all_hl_vars = list_utilities.tree_gather( clause, $sym21$HL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject all_literals = clause_utilities.all_literals_as_asents( clause );
    return graph_utilities.categorize_nodes_via_links( all_hl_vars, all_literals, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 16944L)
  public static SubLObject categorize_sensified_clause_variables_via_literals(final SubLObject sensified_clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ground_groups = NIL;
    SubLObject cdolist_list_var = sensified_clause;
    SubLObject sensified_literal = NIL;
    sensified_literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != el_utilities.hl_ground_tree_p( sensified_literal ) )
      {
        final SubLObject group = ground_sensified_literal_to_categorized_group( sensified_literal );
        ground_groups = ConsesLow.cons( group, ground_groups );
      }
      cdolist_list_var = cdolist_list_var.rest();
      sensified_literal = cdolist_list_var.first();
    }
    final SubLObject all_hl_vars = list_utilities.tree_gather( sensified_clause, $sym21$HL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject connected_groups = graph_utilities.categorize_nodes_via_links( all_hl_vars, sensified_clause, UNPROVIDED );
    final SubLObject isolated_groups = thread.secondMultipleValue();
    final SubLObject naked_groups = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return Values.values( connected_groups, ConsesLow.nconc( ground_groups, isolated_groups ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 17648L)
  public static SubLObject sensify_contextualized_clause(final SubLObject clause)
  {
    SubLObject literals = NIL;
    SubLObject index = ZERO_INTEGER;
    SubLObject cdolist_list_var = clauses.neg_lits( clause );
    SubLObject contextualized_asent = NIL;
    contextualized_asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      literals = ConsesLow.cons( cycl_utilities.negate( contextualized_asent ), literals );
      index = Numbers.add( index, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      contextualized_asent = cdolist_list_var.first();
    }
    index = ZERO_INTEGER;
    cdolist_list_var = clauses.pos_lits( clause );
    contextualized_asent = NIL;
    contextualized_asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      literals = ConsesLow.cons( contextualized_asent, literals );
      index = Numbers.add( index, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      contextualized_asent = cdolist_list_var.first();
    }
    return Sequences.nreverse( literals );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 17983L)
  public static SubLObject unmake_sensified_literal(final SubLObject sensified_literal)
  {
    if( NIL != el_utilities.el_negation_p( sensified_literal ) )
    {
      return Values.values( el_utilities.literal_atomic_sentence( sensified_literal ), $kw19$NEG );
    }
    return Values.values( sensified_literal, $kw20$POS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 18243L)
  public static SubLObject ground_sensified_literal_to_categorized_group(final SubLObject sensified_literal)
  {
    return ConsesLow.list( NIL, ConsesLow.list( sensified_literal ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 18371L)
  public static SubLObject categorized_group_to_problem_query(final SubLObject group)
  {
    SubLObject neg_lits = NIL;
    SubLObject pos_lits = NIL;
    SubLObject cdolist_list_var;
    final SubLObject group_lits = cdolist_list_var = conses_high.second( group );
    SubLObject literal = NIL;
    literal = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != el_utilities.el_negation_p( literal ) )
      {
        neg_lits = ConsesLow.cons( el_utilities.literal_atomic_sentence( literal ), neg_lits );
      }
      else
      {
        pos_lits = ConsesLow.cons( literal, pos_lits );
      }
      cdolist_list_var = cdolist_list_var.rest();
      literal = cdolist_list_var.first();
    }
    neg_lits = Sequences.nreverse( neg_lits );
    pos_lits = Sequences.nreverse( pos_lits );
    return inference_datastructures_problem_query.new_problem_query_from_contextualized_clause( clauses.make_clause( neg_lits, pos_lits ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 19115L)
  public static SubLObject meta_split_tactics_enabledP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $meta_split_tactics_enabledP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 19523L)
  public static SubLObject meta_split_tactic_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_datastructures_tactic.tactic_p( v_object ) && $determine_new_split_tactics_module$.getGlobalValue().eql( inference_datastructures_tactic.tactic_hl_module( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 19676L)
  public static SubLObject generalized_split_tactic_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != split_tactic_p( v_object ) || NIL != meta_split_tactic_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 19801L)
  public static SubLObject meta_split_tactic_link(final SubLObject meta_split_tactic)
  {
    return split_tactic_link( meta_split_tactic );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 19908L)
  public static SubLObject meta_split_tactic_todo_indices(final SubLObject meta_split_tactic)
  {
    return inference_datastructures_tactic.tactic_data( meta_split_tactic );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 20017L)
  public static SubLObject meta_split_tactic_index_doneP(final SubLObject meta_split_tactic, final SubLObject index)
  {
    final SubLObject todo_indices = meta_split_tactic_todo_indices( meta_split_tactic );
    return makeBoolean( NIL == list_utilities.member_eqP( index, todo_indices ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 20217L)
  public static SubLObject meta_split_tactic_productivity(final SubLObject meta_split_tactic)
  {
    return inference_datastructures_enumerated_types.productivity_for_number_of_children( Sequences.length( meta_split_tactic_todo_indices( meta_split_tactic ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 20506L)
  public static SubLObject determine_new_meta_split_tactics(final SubLObject supported_problem, final SubLObject dnf_clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject split_link = maybe_new_split_link( supported_problem, dnf_clause );
    final SubLObject supporting_problem_count = inference_datastructures_problem_link.problem_link_supporting_mapped_problem_count( split_link );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !supporting_problem_count.numG( ONE_INTEGER ) )
    {
      Errors.error( $str14$Tried_to_make_a_split_link_with_l, split_link );
    }
    inference_worker.consider_that_problem_could_be_no_good( supported_problem, NIL, $kw15$TACTICAL, T );
    if( NIL == inference_worker.no_good_problem_p( supported_problem, $kw15$TACTICAL ) )
    {
      new_meta_split_tactic( supported_problem );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 21136L)
  public static SubLObject new_meta_split_tactic(final SubLObject problem)
  {
    final SubLObject split_link = problem_sole_split_argument_link( problem );
    final SubLObject supporting_problem_count = inference_datastructures_problem_link.problem_link_supporting_mapped_problem_count( split_link );
    final SubLObject todo_indices = conses_high.copy_list( list_utilities.num_list( supporting_problem_count, UNPROVIDED ) );
    final SubLObject tactic = inference_datastructures_tactic.new_tactic( problem, $determine_new_split_tactics_module$.getGlobalValue(), todo_indices );
    inference_datastructures_tactic.note_tactic_progress_iterator( tactic, new_meta_split_progress_iterator( tactic ) );
    final SubLObject store = inference_datastructures_problem.problem_store( problem );
    final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index( store );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw10$SKIP ) )
    {
      final SubLObject idx_$4 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$4, $kw10$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$4 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject inference;
        SubLObject inference_var;
        SubLObject set_var;
        SubLObject set_contents_var;
        SubLObject basis_object;
        SubLObject state;
        SubLObject strategy;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          inference = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw10$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( inference ) )
            {
              inference = $kw10$SKIP;
            }
            if( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( problem, inference ) )
            {
              inference_var = inference;
              set_var = inference_datastructures_inference.inference_strategy_set( inference_var );
              set_contents_var = set.do_set_internal( set_var );
              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
                  .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
              {
                strategy = set_contents.do_set_contents_next( basis_object, state );
                if( NIL != set_contents.do_set_contents_element_validP( state, strategy ) )
                {
                  inference_tactician.strategy_note_new_tactic( strategy, tactic );
                }
              }
            }
          }
        }
      }
      final SubLObject idx_$5 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$5 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$5 );
        SubLObject id2 = NIL;
        SubLObject inference2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            inference2 = Hashtables.getEntryValue( cdohash_entry );
            if( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( problem, inference2 ) )
            {
              final SubLObject inference_var2 = inference2;
              final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set( inference_var2 );
              final SubLObject set_contents_var2 = set.do_set_internal( set_var2 );
              SubLObject basis_object2;
              SubLObject state2;
              SubLObject strategy2;
              for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                  set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
              {
                strategy2 = set_contents.do_set_contents_next( basis_object2, state2 );
                if( NIL != set_contents.do_set_contents_element_validP( state2, strategy2 ) )
                {
                  inference_tactician.strategy_note_new_tactic( strategy2, tactic );
                }
              }
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    return tactic;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 21694L)
  public static SubLObject compute_strategic_properties_of_meta_split_tactic(final SubLObject tactic, final SubLObject strategy)
  {
    if( NIL == preference_modules.preference_level_p( inference_datastructures_tactic.tactic_preference_level( tactic ) ) )
    {
      inference_datastructures_tactic.set_tactic_preference_level( tactic, $meta_split_tactic_default_preference_level$.getGlobalValue(), $meta_split_tactic_default_preference_level_justification$.getGlobalValue() );
    }
    inference_datastructures_strategy.set_tactic_strategic_preference_level( tactic, strategy, $meta_split_tactic_default_preference_level$.getGlobalValue(), $meta_split_tactic_default_preference_level_justification$
        .getGlobalValue() );
    inference_datastructures_strategy.set_tactic_strategic_productivity( tactic, strategy, ZERO_INTEGER );
    return tactic;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 22279L)
  public static SubLObject new_meta_split_progress_iterator(final SubLObject tactic)
  {
    return inference_datastructures_tactic.new_tactic_progress_iterator( $kw25$META_STRUCTURAL, tactic, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 22428L)
  public static SubLObject meta_structural_progress_iterator_doneP(final SubLObject tactic)
  {
    if( NIL != meta_split_tactic_p( tactic ) )
    {
      return meta_split_progress_iterator_doneP( tactic );
    }
    return Errors.error( $str26$unexpected_meta_structural_tactic, tactic );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 22660L)
  public static SubLObject meta_split_progress_iterator_doneP(final SubLObject tactic)
  {
    final SubLObject supported_problem = inference_datastructures_tactic.tactic_problem( tactic );
    final SubLObject todo_indices = meta_split_tactic_todo_indices( tactic );
    return makeBoolean( NIL == todo_indices || NIL != inference_worker.no_good_problem_p( supported_problem, $kw15$TACTICAL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 23212L)
  public static SubLObject meta_split_criteria()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $meta_split_criteria$.getDynamicValue( thread ) )
    {
      return $meta_split_criteria$.getDynamicValue( thread );
    }
    if( NIL != $meta_split_tactics_do_single_literals_firstP$.getDynamicValue( thread ) )
    {
      return $list27;
    }
    if( NIL != $meta_split_favors_problem_reuseP$.getDynamicValue( thread ) )
    {
      return $list28;
    }
    return $list29;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 23635L)
  public static SubLObject execute_meta_split_tactic(final SubLObject tactic)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject supported_problem = inference_datastructures_tactic.tactic_problem( tactic );
    if( NIL == inference_datastructures_problem.tactically_no_good_problem_p( supported_problem ) )
    {
      final SubLObject split_link = meta_split_tactic_link( tactic );
      SubLObject problem_index_pairs = NIL;
      SubLObject doneP = NIL;
      if( NIL == doneP )
      {
        SubLObject csome_list_var = meta_split_criteria();
        SubLObject meta_split_criterion = NIL;
        meta_split_criterion = csome_list_var.first();
        while ( NIL == doneP && NIL != csome_list_var)
        {
          SubLObject index = ZERO_INTEGER;
          final SubLObject link_var = split_link;
          SubLObject rest;
          SubLObject supporting_mapped_problem;
          SubLObject supporting_problem;
          SubLObject applicableP;
          SubLObject stop_after_each_oneP;
          for( rest = NIL, rest = inference_datastructures_problem_link.problem_link_supporting_mapped_problems( link_var ); NIL == doneP && NIL != rest; rest = rest.rest() )
          {
            supporting_mapped_problem = rest.first();
            if( NIL != inference_macros.do_problem_link_open_matchP( NIL, link_var, supporting_mapped_problem ) )
            {
              if( NIL == meta_split_tactic_index_doneP( tactic, index ) )
              {
                supporting_problem = inference_datastructures_problem_link.mapped_problem_problem( supporting_mapped_problem );
                thread.resetMultipleValues();
                applicableP = meta_split_criterion_applicableP( meta_split_criterion, supporting_problem );
                stop_after_each_oneP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if( NIL != applicableP )
                {
                  problem_index_pairs = ConsesLow.cons( ConsesLow.list( index, supporting_problem ), problem_index_pairs );
                  if( NIL != stop_after_each_oneP )
                  {
                    doneP = T;
                  }
                }
              }
              index = Numbers.add( index, ONE_INTEGER );
            }
          }
          if( NIL != problem_index_pairs )
          {
            doneP = T;
          }
          csome_list_var = csome_list_var.rest();
          meta_split_criterion = csome_list_var.first();
        }
      }
      meta_split_tactic_create_and_activate_split_tactics( tactic, supported_problem, problem_index_pairs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 24746L)
  public static SubLObject meta_split_criterion_applicableP(final SubLObject meta_split_criterion, final SubLObject conjunct_problem)
  {
    if( meta_split_criterion.eql( $kw30$ONE_NO_GOOD ) )
    {
      return Values.values( inference_datastructures_problem.tactically_no_good_problem_p( conjunct_problem ), T );
    }
    if( meta_split_criterion.eql( $kw31$ALL_SINGLE_LITERAL ) )
    {
      return Values.values( inference_datastructures_problem.single_literal_problem_p( conjunct_problem ), NIL );
    }
    if( meta_split_criterion.eql( $kw32$ALL_PROBLEM_REUSE ) )
    {
      return Values.values( Numbers.numG( inference_datastructures_problem.problem_dependent_link_count( conjunct_problem ), ONE_INTEGER ), NIL );
    }
    if( meta_split_criterion.eql( $kw33$ONE_CLOSED ) )
    {
      return Values.values( inference_datastructures_problem.closed_problem_p( conjunct_problem ), T );
    }
    if( meta_split_criterion.eql( $kw34$ONE_CLOSED_PROBLEM_REUSE ) )
    {
      return Values.values( makeBoolean( NIL != inference_datastructures_problem.closed_problem_p( conjunct_problem ) && inference_datastructures_problem.problem_dependent_link_count( conjunct_problem ).numG(
          ONE_INTEGER ) ), T );
    }
    if( meta_split_criterion.eql( $kw35$ALL_SINGLE_LITERAL_PROBLEM_REUSE ) )
    {
      return Values.values( makeBoolean( NIL != inference_datastructures_problem.single_literal_problem_p( conjunct_problem ) && inference_datastructures_problem.problem_dependent_link_count( conjunct_problem ).numG(
          ONE_INTEGER ) ), NIL );
    }
    if( meta_split_criterion.eql( $kw36$ALL_THE_REST ) )
    {
      return Values.values( T, NIL );
    }
    return Errors.error( $str37$Unknown_meta_split_criterion__s, meta_split_criterion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 26173L)
  public static SubLObject meta_split_tactic_create_and_activate_split_tactics(final SubLObject meta_split_tactic, final SubLObject supported_problem, final SubLObject problem_index_pairs)
  {
    SubLObject split_tactics = NIL;
    SubLObject cdolist_list_var = problem_index_pairs;
    SubLObject pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = pair;
      SubLObject index = NIL;
      SubLObject supporting_problem = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
      index = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
      supporting_problem = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject split_tactic = meta_split_tactic_create_one_split_tactic( meta_split_tactic, supported_problem, index );
        split_tactics = ConsesLow.cons( split_tactic, split_tactics );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list38 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    note_split_tactics_strategically_possible( split_tactics );
    return split_tactics;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 26696L)
  public static SubLObject meta_split_tactic_create_one_split_tactic(final SubLObject meta_split_tactic, final SubLObject supported_problem, final SubLObject index)
  {
    meta_split_tactic_note_split_tactic_done( meta_split_tactic, index );
    return new_split_tactic( supported_problem, index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 26920L)
  public static SubLObject meta_split_tactic_note_split_tactic_done(final SubLObject tactic, final SubLObject index)
  {
    SubLObject todo_indices = meta_split_tactic_todo_indices( tactic );
    todo_indices = Sequences.delete( index, todo_indices, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    inference_datastructures_tactic.set_meta_split_tactic_data( tactic, todo_indices );
    return tactic;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-worker-split.lisp", position = 27181L)
  public static SubLObject note_split_tactics_strategically_possible(final SubLObject split_tactics)
  {
    if( NIL != split_tactics )
    {
      final SubLObject prob;
      final SubLObject supported_problem = prob = inference_datastructures_tactic.tactic_problem( split_tactics.first() );
      final SubLObject store = inference_datastructures_problem.problem_store( prob );
      final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index( store );
      if( NIL == id_index.id_index_objects_empty_p( idx, $kw10$SKIP ) )
      {
        final SubLObject idx_$6 = idx;
        if( NIL == id_index.id_index_dense_objects_empty_p( idx_$6, $kw10$SKIP ) )
        {
          final SubLObject vector_var = id_index.id_index_dense_objects( idx_$6 );
          final SubLObject backwardP_var = NIL;
          SubLObject length;
          SubLObject v_iteration;
          SubLObject id;
          SubLObject inference;
          SubLObject inference_var;
          SubLObject set_var;
          SubLObject set_contents_var;
          SubLObject basis_object;
          SubLObject state;
          SubLObject strategy;
          for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
          {
            id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
            inference = Vectors.aref( vector_var, id );
            if( NIL == id_index.id_index_tombstone_p( inference ) || NIL == id_index.id_index_skip_tombstones_p( $kw10$SKIP ) )
            {
              if( NIL != id_index.id_index_tombstone_p( inference ) )
              {
                inference = $kw10$SKIP;
              }
              if( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( prob, inference ) )
              {
                inference_var = inference;
                set_var = inference_datastructures_inference.inference_strategy_set( inference_var );
                set_contents_var = set.do_set_internal( set_var );
                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
                    .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                {
                  strategy = set_contents.do_set_contents_next( basis_object, state );
                  if( NIL != set_contents.do_set_contents_element_validP( state, strategy ) )
                  {
                    inference_tactician.strategy_note_split_tactics_strategically_possible( strategy, split_tactics );
                  }
                }
              }
            }
          }
        }
        final SubLObject idx_$7 = idx;
        if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$7 ) )
        {
          final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$7 );
          SubLObject id2 = NIL;
          SubLObject inference2 = NIL;
          final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
          try
          {
            while ( Hashtables.iteratorHasNext( cdohash_iterator ))
            {
              final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
              id2 = Hashtables.getEntryKey( cdohash_entry );
              inference2 = Hashtables.getEntryValue( cdohash_entry );
              if( NIL != inference_datastructures_problem.problem_relevant_to_inferenceP( prob, inference2 ) )
              {
                final SubLObject inference_var2 = inference2;
                final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set( inference_var2 );
                final SubLObject set_contents_var2 = set.do_set_internal( set_var2 );
                SubLObject basis_object2;
                SubLObject state2;
                SubLObject strategy2;
                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                    set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                {
                  strategy2 = set_contents.do_set_contents_next( basis_object2, state2 );
                  if( NIL != set_contents.do_set_contents_element_validP( state2, strategy2 ) )
                  {
                    inference_tactician.strategy_note_split_tactics_strategically_possible( strategy2, split_tactics );
                  }
                }
              }
            }
          }
          finally
          {
            Hashtables.releaseEntrySetIterator( cdohash_iterator );
          }
        }
      }
    }
    return NIL;
  }

  public static SubLObject declare_inference_worker_split_file()
  {
    SubLFiles.declareFunction( me, "split_link_p", "SPLIT-LINK-P", 1, 0, false );
    SubLFiles.declareFunction( me, "maybe_new_split_link", "MAYBE-NEW-SPLIT-LINK", 2, 0, false );
    SubLFiles.declareFunction( me, "new_split_link", "NEW-SPLIT-LINK", 2, 0, false );
    SubLFiles.declareFunction( me, "destroy_split_link", "DESTROY-SPLIT-LINK", 1, 0, false );
    SubLFiles.declareMacro( me, "do_split_link_open_supporting_mapped_problems_numbered", "DO-SPLIT-LINK-OPEN-SUPPORTING-MAPPED-PROBLEMS-NUMBERED" );
    SubLFiles.declareFunction( me, "split_link_tactic", "SPLIT-LINK-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "split_link_tactics", "SPLIT-LINK-TACTICS", 1, 0, false );
    SubLFiles.declareFunction( me, "split_link_tactics_int", "SPLIT-LINK-TACTICS-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "close_split_link", "CLOSE-SPLIT-LINK", 1, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_split_link_supporting_problems", "FIND-OR-CREATE-SPLIT-LINK-SUPPORTING-PROBLEMS", 3, 0, false );
    SubLFiles.declareFunction( me, "split_tactic_p", "SPLIT-TACTIC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_split_tactic", "NEW-SPLIT-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "split_tactic_supporting_mapped_problem_index", "SPLIT-TACTIC-SUPPORTING-MAPPED-PROBLEM-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "split_tactic_link", "SPLIT-TACTIC-LINK", 1, 0, false );
    SubLFiles.declareFunction( me, "find_split_tactic_supporting_mapped_problem", "FIND-SPLIT-TACTIC-SUPPORTING-MAPPED-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "find_split_tactic_supporting_problem", "FIND-SPLIT-TACTIC-SUPPORTING-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "discard_all_other_possible_split_tactics", "DISCARD-ALL-OTHER-POSSIBLE-SPLIT-TACTICS", 1, 0, false );
    SubLFiles.declareFunction( me, "determine_new_split_tactics", "DETERMINE-NEW-SPLIT-TACTICS", 2, 0, false );
    SubLFiles.declareFunction( me, "compute_strategic_properties_of_split_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-SPLIT-TACTIC", 3, 0, false );
    SubLFiles.declareFunction( me, "compute_split_tactic_productivity", "COMPUTE-SPLIT-TACTIC-PRODUCTIVITY", 3, 0, false );
    SubLFiles.declareFunction( me, "compute_split_tactic_preference_level", "COMPUTE-SPLIT-TACTIC-PREFERENCE-LEVEL", 3, 0, false );
    SubLFiles.declareFunction( me, "execute_split_tactic", "EXECUTE-SPLIT-TACTIC", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_sole_split_argument_link", "PROBLEM-SOLE-SPLIT-ARGUMENT-LINK", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_first_split_argument_link", "PROBLEM-FIRST-SPLIT-ARGUMENT-LINK", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_has_split_argument_linkP", "PROBLEM-HAS-SPLIT-ARGUMENT-LINK?", 1, 0, false );
    SubLFiles.declareFunction( me, "split_tactic_lookahead_problem", "SPLIT-TACTIC-LOOKAHEAD-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "split_link_supporting_problems_with_variables", "SPLIT-LINK-SUPPORTING-PROBLEMS-WITH-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "new_split_proof", "NEW-SPLIT-PROOF", 2, 0, false );
    SubLFiles.declareFunction( me, "split_proof_p", "SPLIT-PROOF-P", 1, 0, false );
    SubLFiles.declareFunction( me, "bubble_up_proof_to_split_link", "BUBBLE-UP-PROOF-TO-SPLIT-LINK", 3, 0, false );
    SubLFiles.declareFunction( me, "all_literals_connected_by_shared_varsP", "ALL-LITERALS-CONNECTED-BY-SHARED-VARS?", 1, 0, false );
    SubLFiles.declareFunction( me, "determine_shared_variable_islands", "DETERMINE-SHARED-VARIABLE-ISLANDS", 1, 0, false );
    SubLFiles.declareFunction( me, "categorize_clause_variables_via_literals", "CATEGORIZE-CLAUSE-VARIABLES-VIA-LITERALS", 1, 0, false );
    SubLFiles.declareFunction( me, "categorize_sensified_clause_variables_via_literals", "CATEGORIZE-SENSIFIED-CLAUSE-VARIABLES-VIA-LITERALS", 1, 0, false );
    SubLFiles.declareFunction( me, "sensify_contextualized_clause", "SENSIFY-CONTEXTUALIZED-CLAUSE", 1, 0, false );
    SubLFiles.declareFunction( me, "unmake_sensified_literal", "UNMAKE-SENSIFIED-LITERAL", 1, 0, false );
    SubLFiles.declareFunction( me, "ground_sensified_literal_to_categorized_group", "GROUND-SENSIFIED-LITERAL-TO-CATEGORIZED-GROUP", 1, 0, false );
    SubLFiles.declareFunction( me, "categorized_group_to_problem_query", "CATEGORIZED-GROUP-TO-PROBLEM-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "meta_split_tactics_enabledP", "META-SPLIT-TACTICS-ENABLED?", 0, 0, false );
    SubLFiles.declareFunction( me, "meta_split_tactic_p", "META-SPLIT-TACTIC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "generalized_split_tactic_p", "GENERALIZED-SPLIT-TACTIC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "meta_split_tactic_link", "META-SPLIT-TACTIC-LINK", 1, 0, false );
    SubLFiles.declareFunction( me, "meta_split_tactic_todo_indices", "META-SPLIT-TACTIC-TODO-INDICES", 1, 0, false );
    SubLFiles.declareFunction( me, "meta_split_tactic_index_doneP", "META-SPLIT-TACTIC-INDEX-DONE?", 2, 0, false );
    SubLFiles.declareFunction( me, "meta_split_tactic_productivity", "META-SPLIT-TACTIC-PRODUCTIVITY", 1, 0, false );
    SubLFiles.declareFunction( me, "determine_new_meta_split_tactics", "DETERMINE-NEW-META-SPLIT-TACTICS", 2, 0, false );
    SubLFiles.declareFunction( me, "new_meta_split_tactic", "NEW-META-SPLIT-TACTIC", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_strategic_properties_of_meta_split_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-META-SPLIT-TACTIC", 2, 0, false );
    SubLFiles.declareFunction( me, "new_meta_split_progress_iterator", "NEW-META-SPLIT-PROGRESS-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "meta_structural_progress_iterator_doneP", "META-STRUCTURAL-PROGRESS-ITERATOR-DONE?", 1, 0, false );
    SubLFiles.declareFunction( me, "meta_split_progress_iterator_doneP", "META-SPLIT-PROGRESS-ITERATOR-DONE?", 1, 0, false );
    SubLFiles.declareFunction( me, "meta_split_criteria", "META-SPLIT-CRITERIA", 0, 0, false );
    SubLFiles.declareFunction( me, "execute_meta_split_tactic", "EXECUTE-META-SPLIT-TACTIC", 1, 0, false );
    SubLFiles.declareFunction( me, "meta_split_criterion_applicableP", "META-SPLIT-CRITERION-APPLICABLE?", 2, 0, false );
    SubLFiles.declareFunction( me, "meta_split_tactic_create_and_activate_split_tactics", "META-SPLIT-TACTIC-CREATE-AND-ACTIVATE-SPLIT-TACTICS", 3, 0, false );
    SubLFiles.declareFunction( me, "meta_split_tactic_create_one_split_tactic", "META-SPLIT-TACTIC-CREATE-ONE-SPLIT-TACTIC", 3, 0, false );
    SubLFiles.declareFunction( me, "meta_split_tactic_note_split_tactic_done", "META-SPLIT-TACTIC-NOTE-SPLIT-TACTIC-DONE", 2, 0, false );
    SubLFiles.declareFunction( me, "note_split_tactics_strategically_possible", "NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_inference_worker_split_file()
  {
    $split_module$ = SubLFiles.defparameter( "*SPLIT-MODULE*", inference_modules.inference_structural_module( $kw0$SPLIT, UNPROVIDED ) );
    $split_tactic_default_preference_level$ = SubLFiles.deflexical( "*SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL*", $kw16$PREFERRED );
    $split_tactic_default_preference_level_justification$ = SubLFiles.deflexical( "*SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL-JUSTIFICATION*", $str17$the_default_for_split_tactics );
    $meta_split_tactics_enabledP$ = SubLFiles.defparameter( "*META-SPLIT-TACTICS-ENABLED?*", T );
    $determine_new_split_tactics_module$ = SubLFiles.deflexical( "*DETERMINE-NEW-SPLIT-TACTICS-MODULE*", maybeDefault( $sym22$_DETERMINE_NEW_SPLIT_TACTICS_MODULE_, $determine_new_split_tactics_module$,
        () -> ( inference_modules.inference_meta_structural_module( $kw23$DETERMINE_NEW_SPLIT_TACTICS, UNPROVIDED ) ) ) );
    $meta_split_tactic_default_preference_level$ = SubLFiles.deflexical( "*META-SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL*", $kw16$PREFERRED );
    $meta_split_tactic_default_preference_level_justification$ = SubLFiles.deflexical( "*META-SPLIT-TACTIC-DEFAULT-PREFERENCE-LEVEL-JUSTIFICATION*", $str24$the_default_for_meta_split_tactic );
    $meta_split_criteria$ = SubLFiles.defparameter( "*META-SPLIT-CRITERIA*", NIL );
    $meta_split_tactics_do_single_literals_firstP$ = SubLFiles.defparameter( "*META-SPLIT-TACTICS-DO-SINGLE-LITERALS-FIRST?*", T );
    $meta_split_favors_problem_reuseP$ = SubLFiles.defparameter( "*META-SPLIT-FAVORS-PROBLEM-REUSE?*", T );
    return NIL;
  }

  public static SubLObject setup_inference_worker_split_file()
  {
    subl_macro_promotions.declare_defglobal( $sym22$_DETERMINE_NEW_SPLIT_TACTICS_MODULE_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inference_worker_split_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inference_worker_split_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inference_worker_split_file();
  }
  static
  {
    me = new inference_worker_split();
    $split_module$ = null;
    $split_tactic_default_preference_level$ = null;
    $split_tactic_default_preference_level_justification$ = null;
    $meta_split_tactics_enabledP$ = null;
    $determine_new_split_tactics_module$ = null;
    $meta_split_tactic_default_preference_level$ = null;
    $meta_split_tactic_default_preference_level_justification$ = null;
    $meta_split_criteria$ = null;
    $meta_split_tactics_do_single_literals_firstP$ = null;
    $meta_split_favors_problem_reuseP$ = null;
    $kw0$SPLIT = makeKeyword( "SPLIT" );
    $list1 = ConsesLow.list( ConsesLow.list( makeSymbol( "SUPPORTING-MAPPED-PROBLEM-VAR" ), makeSymbol( "INDEX-VAR" ), makeSymbol( "SPLIT-LINK" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym2$SPLIT_LINK_VAR = makeUninternedSymbol( "SPLIT-LINK-VAR" );
    $sym3$CLET = makeSymbol( "CLET" );
    $sym4$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS_NUMBERED = makeSymbol( "DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS-NUMBERED" );
    $sym5$PWHEN = makeSymbol( "PWHEN" );
    $sym6$PROBLEM_LINK_INDEX_OPEN_ = makeSymbol( "PROBLEM-LINK-INDEX-OPEN?" );
    $str7$_s_is_not_a_supporting_mapped_pro = makeString( "~s is not a supporting mapped problem of ~s." );
    $str8$couldn_t_find_any_split_tactics_f = makeString( "couldn't find any split tactics for ~s" );
    $sym9$HL_VAR_ = makeSymbol( "HL-VAR?" );
    $kw10$SKIP = makeKeyword( "SKIP" );
    $str11$Could_not_find_the_link_for__a = makeString( "Could not find the link for ~a" );
    $sym12$SPLIT_TACTIC_P = makeSymbol( "SPLIT-TACTIC-P" );
    $str13$Generalized_tactic__a_did_not_ind = makeString( "Generalized tactic ~a did not indicate a valid supporting mapped problem" );
    $str14$Tried_to_make_a_split_link_with_l = makeString( "Tried to make a split link with less than two supporting problems: ~a" );
    $kw15$TACTICAL = makeKeyword( "TACTICAL" );
    $kw16$PREFERRED = makeKeyword( "PREFERRED" );
    $str17$the_default_for_split_tactics = makeString( "the default for split tactics" );
    $kw18$PROVEN = makeKeyword( "PROVEN" );
    $kw19$NEG = makeKeyword( "NEG" );
    $kw20$POS = makeKeyword( "POS" );
    $sym21$HL_VARIABLE_P = makeSymbol( "HL-VARIABLE-P" );
    $sym22$_DETERMINE_NEW_SPLIT_TACTICS_MODULE_ = makeSymbol( "*DETERMINE-NEW-SPLIT-TACTICS-MODULE*" );
    $kw23$DETERMINE_NEW_SPLIT_TACTICS = makeKeyword( "DETERMINE-NEW-SPLIT-TACTICS" );
    $str24$the_default_for_meta_split_tactic = makeString( "the default for meta-split tactics" );
    $kw25$META_STRUCTURAL = makeKeyword( "META-STRUCTURAL" );
    $str26$unexpected_meta_structural_tactic = makeString( "unexpected meta-structural tactic ~s" );
    $list27 = ConsesLow.list( makeKeyword( "ONE-NO-GOOD" ), makeKeyword( "ALL-SINGLE-LITERAL" ), makeKeyword( "ALL-THE-REST" ) );
    $list28 = ConsesLow.list( makeKeyword( "ONE-NO-GOOD" ), makeKeyword( "ONE-CLOSED-PROBLEM-REUSE" ), makeKeyword( "ALL-SINGLE-LITERAL-PROBLEM-REUSE" ), makeKeyword( "ONE-CLOSED" ), makeKeyword( "ALL-THE-REST" ) );
    $list29 = ConsesLow.list( makeKeyword( "ONE-NO-GOOD" ), makeKeyword( "ONE-CLOSED" ), makeKeyword( "ALL-THE-REST" ) );
    $kw30$ONE_NO_GOOD = makeKeyword( "ONE-NO-GOOD" );
    $kw31$ALL_SINGLE_LITERAL = makeKeyword( "ALL-SINGLE-LITERAL" );
    $kw32$ALL_PROBLEM_REUSE = makeKeyword( "ALL-PROBLEM-REUSE" );
    $kw33$ONE_CLOSED = makeKeyword( "ONE-CLOSED" );
    $kw34$ONE_CLOSED_PROBLEM_REUSE = makeKeyword( "ONE-CLOSED-PROBLEM-REUSE" );
    $kw35$ALL_SINGLE_LITERAL_PROBLEM_REUSE = makeKeyword( "ALL-SINGLE-LITERAL-PROBLEM-REUSE" );
    $kw36$ALL_THE_REST = makeKeyword( "ALL-THE-REST" );
    $str37$Unknown_meta_split_criterion__s = makeString( "Unknown meta-split criterion ~s" );
    $list38 = ConsesLow.list( makeSymbol( "INDEX" ), makeSymbol( "SUPPORTING-PROBLEM" ) );
  }
}
/*
 * 
 * Total time: 241 ms
 * 
 */