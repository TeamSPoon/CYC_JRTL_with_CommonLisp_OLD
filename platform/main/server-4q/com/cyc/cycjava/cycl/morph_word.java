package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class morph_word
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.morph_word";
  public static final String myFingerPrint = "db99f7c2fd882c393975937dd9b79235cf3d81ab2bcd0413df091044b1c4383a";
  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 21804L)
  private static SubLSymbol $mwp_base_pred_of_pos_caching_state$;
  private static final SubLSymbol $sym0$STRINGP;
  private static final SubLSymbol $kw1$STRING;
  private static final SubLSymbol $kw2$PARSES;
  private static final SubLSymbol $sym3$MORPH_WORD_P;
  private static final SubLSymbol $kw4$ADDED;
  private static final SubLSymbol $kw5$ALREADY_THERE;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLSymbol $kw8$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw9$TYPE;
  private static final SubLSymbol $kw10$COMPLEX_ONLY_;
  private static final SubLSymbol $sym11$DO_SET;
  private static final SubLSymbol $sym12$MORPH_WORD_PARSES;
  private static final SubLSymbol $sym13$PWHEN;
  private static final SubLSymbol $sym14$CAND;
  private static final SubLSymbol $sym15$MWP_PARSE_TYPE;
  private static final SubLSymbol $sym16$FIMPLIES;
  private static final SubLSymbol $sym17$MWP_PARSE_COMPLEX_P;
  private static final SubLSymbol $sym18$MORPH_WORD_DO_PARSES;
  private static final SubLSymbol $kw19$WORD_UNIT;
  private static final SubLString $str20$__Parses_for__S___;
  private static final SubLSymbol $kw21$DERIV;
  private static final SubLSymbol $sym22$MWP_TRIE_BASE_WORDS_BY_LOOKUP;
  private static final SubLSymbol $kw23$ANY;
  private static final SubLSymbol $kw24$DENOT;
  private static final SubLSymbol $kw25$WORD_DENOT;
  private static final SubLSymbol $kw26$BASE;
  private static final SubLSymbol $kw27$AFFIX;
  private static final SubLSymbol $kw28$AFFIX_TYPE;
  private static final SubLSymbol $kw29$SUFFIX;
  private static final SubLSymbol $kw30$AFFIX_UNIT;
  private static final SubLSymbol $kw31$RULE;
  private static final SubLString $str32$ence;
  private static final SubLString $str33$ent;
  private static final SubLString $str34$ily;
  private static final SubLString $str35$ey;
  private static final SubLString $str36$ic;
  private static final SubLString $str37$al;
  private static final SubLString $str38$y;
  private static final SubLString $str39$l;
  private static final SubLString $str40$e;
  private static final SubLString $str41$s;
  private static final SubLString $str42$is;
  private static final SubLString $str43$ion;
  private static final SubLString $str44$ide;
  private static final SubLString $str45$u;
  private static final SubLString $str46$i;
  private static final SubLString $str47$cept;
  private static final SubLString $str48$ive;
  private static final SubLSymbol $kw49$PREFIX;
  private static final SubLSymbol $sym50$MWP_PREFIX_LOOKUP;
  private static final SubLList $list51;
  private static final SubLList $list52;
  private static final SubLSymbol $kw53$NEW;
  private static final SubLSymbol $kw54$BASE_DENOT;
  private static final SubLSymbol $kw55$PRAGMATICS;
  private static final SubLSymbol $kw56$MT;
  private static final SubLSymbol $kw57$SEM_PRED;
  private static final SubLSymbol $kw58$BASE_POS_PRED;
  private static final SubLSymbol $kw59$DENOT_OF;
  private static final SubLSymbol $sym60$DERIVED_NL_TRIE_WORDS_INT;
  private static final SubLList $list61;
  private static final SubLList $list62;
  private static final SubLSymbol $kw63$WORD_POS_PRED;
  private static final SubLSymbol $sym64$MWP_SEMANTIC_CONSTRAINT_P;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$SET_P;
  private static final SubLSymbol $sym67$PROPER_LIST_P;
  private static final SubLSymbol $sym68$INTEGERP;
  private static final SubLList $list69;
  private static final SubLSymbol $kw70$GENL;
  private static final SubLSymbol $kw71$ISA;
  private static final SubLSymbol $kw72$PRED;
  private static final SubLSymbol $kw73$POS;
  private static final SubLSymbol $sym74$MWP_BASE_PRED_OF_POS;
  private static final SubLSymbol $sym75$_PRED;
  private static final SubLObject $const76$basicSpeechPartPred;
  private static final SubLList $list77;
  private static final SubLSymbol $sym78$_MWP_BASE_PRED_OF_POS_CACHING_STATE_;
  private static final SubLList $list79;
  private static final SubLList $list80;
  private static final SubLList $list81;
  private static final SubLSymbol $kw82$INFO;

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 1136L)
  public static SubLObject morph_word_p(final SubLObject obj)
  {
    return makeBoolean( NIL != document.word_p( obj ) && document.word_info( obj ).isList() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 1295L)
  public static SubLObject new_morph_word(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    final SubLObject word = document.new_word( ConsesLow.list( $kw1$STRING, string ) );
    morph_word_info_set( word, $kw2$PARSES, mwp_parse.new_mwp_parse_set() );
    return word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 1598L)
  public static SubLObject morph_word_string(final SubLObject v_morph_word)
  {
    assert NIL != morph_word_p( v_morph_word ) : v_morph_word;
    return document.word_string( v_morph_word );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 1788L)
  public static SubLObject morph_word_parses(final SubLObject v_morph_word)
  {
    assert NIL != morph_word_p( v_morph_word ) : v_morph_word;
    return morph_word_info_lookup( v_morph_word, $kw2$PARSES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 1959L)
  public static SubLObject morph_word_add_parse(final SubLObject v_morph_word, final SubLObject parse)
  {
    final SubLObject parses = morph_word_info_lookup( v_morph_word, $kw2$PARSES );
    final SubLObject new_elementP = mwp_parse.mwp_parse_set_add( parses, parse );
    return ( NIL != new_elementP ) ? $kw4$ADDED : $kw5$ALREADY_THERE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 2347L)
  public static SubLObject morph_word_parses_set(final SubLObject v_morph_word, final SubLObject parses)
  {
    return morph_word_info_set( v_morph_word, $kw2$PARSES, parses );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 2515L)
  public static SubLObject morph_word_do_parses(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject parse = NIL;
    SubLObject v_morph_word = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    parse = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    v_morph_word = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list6 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list6 );
      if( NIL == conses_high.member( current_$1, $list7, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw8$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list6 );
    }
    final SubLObject type_tail = cdestructuring_bind.property_list_member( $kw9$TYPE, current );
    final SubLObject type = ( NIL != type_tail ) ? conses_high.cadr( type_tail ) : NIL;
    final SubLObject complex_onlyP_tail = cdestructuring_bind.property_list_member( $kw10$COMPLEX_ONLY_, current );
    final SubLObject complex_onlyP = ( NIL != complex_onlyP_tail ) ? conses_high.cadr( complex_onlyP_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != type )
    {
      return ConsesLow.list( $sym11$DO_SET, ConsesLow.list( parse, ConsesLow.list( $sym12$MORPH_WORD_PARSES, v_morph_word ) ), ConsesLow.listS( $sym13$PWHEN, ConsesLow.list( $sym14$CAND, ConsesLow.list( EQL, ConsesLow
          .list( $sym15$MWP_PARSE_TYPE, parse ), type ), ConsesLow.list( $sym16$FIMPLIES, complex_onlyP, ConsesLow.list( $sym17$MWP_PARSE_COMPLEX_P, parse ) ) ), ConsesLow.append( body, NIL ) ) );
    }
    return ConsesLow.list( $sym11$DO_SET, ConsesLow.list( parse, ConsesLow.list( $sym12$MORPH_WORD_PARSES, v_morph_word ) ), ConsesLow.listS( $sym13$PWHEN, ConsesLow.list( $sym16$FIMPLIES, complex_onlyP, ConsesLow.list(
        $sym17$MWP_PARSE_COMPLEX_P, parse ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 3197L)
  public static SubLObject mwp_parse_complex_p(final SubLObject parse)
  {
    return word_complex_p( mwp_parse.mwp_parse_lookup( parse, $kw19$WORD_UNIT ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 3341L)
  public static SubLObject word_complex_p(final SubLObject word)
  {
    return makeBoolean( NIL == constant_handles.constant_p( word ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 3414L)
  public static SubLObject morph_word_print_parses(final SubLObject v_morph_word)
  {
    PrintLow.format( T, $str20$__Parses_for__S___, morph_word_string( v_morph_word ) );
    final SubLObject set_var = morph_word_parses( v_morph_word );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject parse;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      parse = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, parse ) )
      {
        morph_word_print_parse( parse );
      }
    }
    return v_morph_word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 3632L)
  public static SubLObject morph_word_print_parse(final SubLObject parse)
  {
    misc_utilities.print_n_per_line( parse.rest().rest(), TWO_INTEGER, Characters.CHAR_tab );
    streams_high.terpri( UNPROVIDED );
    return parse;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 3755L)
  public static SubLObject morph_word_parse_affixes(final SubLObject v_morph_word, SubLObject derivational_onlyP)
  {
    if( derivational_onlyP == UNPROVIDED )
    {
      derivational_onlyP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != morph_word_p( v_morph_word ) : v_morph_word;
    SubLObject parse_sets = NIL;
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        SubLObject cdolist_list_var = lexicon_vars.$nl_affix_types$.getGlobalValue();
        SubLObject affix_type = NIL;
        affix_type = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == derivational_onlyP || affix_type == $kw21$DERIV )
          {
            morph_word_parse_affixes_int( v_morph_word, affix_type );
            parse_sets = ConsesLow.cons( mwp_parse.mwp_parse_set_copy( morph_word_parses( v_morph_word ) ), parse_sets );
          }
          cdolist_list_var = cdolist_list_var.rest();
          affix_type = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    morph_word_parses_set( v_morph_word, mwp_parse.mwp_parse_set_union( parse_sets ) );
    return v_morph_word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 4687L)
  public static SubLObject morph_word_parse_affixes_int(final SubLObject v_morph_word, final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    morph_word_find_affixes( v_morph_word, type );
    morph_word_find_bases( v_morph_word, type );
    morph_word_apply_rules( v_morph_word, type );
    if( NIL != lexicon_vars.$mwp_reformulate_resultsP$.getDynamicValue( thread ) )
    {
      morph_word_reformulate_parses( v_morph_word );
    }
    if( NIL != lexicon_vars.$mwp_triefy_resultsP$.getDynamicValue( thread ) )
    {
      morph_word_triefy( v_morph_word );
    }
    return v_morph_word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 5113L)
  public static SubLObject mwp_trie_base_words_by_lookup_internal(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject words = NIL;
    final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_assume_standardized_stringsP$.currentBinding( thread );
    try
    {
      lexicon_macros.$nl_trie_assume_standardized_stringsP$.bind( T, thread );
      final SubLObject entries = nl_trie.nl_trie_search( string, UNPROVIDED, UNPROVIDED );
      if( entries.isList() )
      {
        SubLObject cdolist_list_var = entries;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != nl_trie_entry_ok_for_mwp_base_wordP( entry ) )
          {
            words = ConsesLow.cons( entry, words );
          }
          cdolist_list_var = cdolist_list_var.rest();
          entry = cdolist_list_var.first();
        }
      }
    }
    finally
    {
      lexicon_macros.$nl_trie_assume_standardized_stringsP$.rebind( _prev_bind_0, thread );
    }
    return words;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 5113L)
  public static SubLObject mwp_trie_base_words_by_lookup(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return mwp_trie_base_words_by_lookup_internal( string );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym22$MWP_TRIE_BASE_WORDS_BY_LOOKUP, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym22$MWP_TRIE_BASE_WORDS_BY_LOOKUP, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym22$MWP_TRIE_BASE_WORDS_BY_LOOKUP, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( mwp_trie_base_words_by_lookup_internal( string ) ) );
      memoization_state.caching_state_put( caching_state, string, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 5446L)
  public static SubLObject nl_trie_entry_ok_for_mwp_base_wordP(final SubLObject entry)
  {
    SubLObject okP = NIL;
    if( NIL != nl_trie.nl_trie_word_p( entry, UNPROVIDED ) )
    {
      final SubLObject denot_pred = nl_trie.nl_trie_entry_semantic_pred( entry, UNPROVIDED );
      if( NIL == conses_high.member( denot_pred, lexicon_accessors.determine_denotation_preds( $kw23$ANY ), UNPROVIDED, UNPROVIDED ) || NIL != conses_high.member( denot_pred, lexicon_accessors.determine_denotation_preds(
          $kw24$DENOT ), UNPROVIDED, UNPROVIDED ) )
      {
        okP = T;
      }
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 5785L)
  public static SubLObject morph_word_triefy(final SubLObject v_morph_word)
  {
    return v_morph_word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 6004L)
  public static SubLObject morph_word_reformulate_parses(final SubLObject v_morph_word)
  {
    final SubLObject set_var = morph_word_parses( v_morph_word );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject parse;
    SubLObject denot;
    SubLObject new_denot;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      parse = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, parse ) )
      {
        denot = mwp_parse.mwp_parse_lookup( parse, $kw25$WORD_DENOT );
        if( NIL != denot )
        {
          new_denot = nl_reformulator.nl_reformulate( denot, UNPROVIDED );
          parse = conses_high.putf( parse, $kw25$WORD_DENOT, new_denot );
        }
      }
    }
    return v_morph_word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 6622L)
  public static SubLObject morph_word_find_affixes(final SubLObject v_morph_word, final SubLObject type)
  {
    morph_word_find_suffixes( v_morph_word, type );
    morph_word_find_prefixes( v_morph_word, type );
    return v_morph_word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 6959L)
  public static SubLObject morph_word_find_suffixes(final SubLObject v_morph_word, final SubLObject type)
  {
    final SubLObject word_string = morph_word_string( v_morph_word );
    final SubLObject parses = morph_word_parses( v_morph_word );
    SubLObject cdolist_list_var = mwp_suffix_lookup( type, word_string );
    SubLObject result = NIL;
    result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject suffix_string = standard_tokenization.string_token_string( result );
      final SubLObject rules = standard_tokenization.string_token_value( result );
      SubLObject cdolist_list_var_$3 = mwp_bases_for_word_string_with_suffix( word_string, suffix_string );
      SubLObject base = NIL;
      base = cdolist_list_var_$3.first();
      while ( NIL != cdolist_list_var_$3)
      {
        SubLObject cdolist_list_var_$4 = rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var_$4.first();
        while ( NIL != cdolist_list_var_$4)
        {
          SubLObject new_parse = mwp_parse.new_mwp_parse();
          new_parse = conses_high.putf( new_parse, $kw9$TYPE, type );
          new_parse = conses_high.putf( new_parse, $kw26$BASE, base );
          new_parse = conses_high.putf( new_parse, $kw27$AFFIX, suffix_string );
          new_parse = conses_high.putf( new_parse, $kw28$AFFIX_TYPE, $kw29$SUFFIX );
          if( type == $kw21$DERIV )
          {
            new_parse = conses_high.putf( new_parse, $kw30$AFFIX_UNIT, rule );
          }
          new_parse = conses_high.putf( new_parse, $kw31$RULE, rule );
          mwp_parse.mwp_parse_set_add( parses, new_parse );
          cdolist_list_var_$4 = cdolist_list_var_$4.rest();
          rule = cdolist_list_var_$4.first();
        }
        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
        base = cdolist_list_var_$3.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      result = cdolist_list_var.first();
    }
    morph_word_parses_set( v_morph_word, parses );
    return v_morph_word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 8060L)
  public static SubLObject mwp_bases_for_word_string_with_suffix(final SubLObject word_string, final SubLObject suffix)
  {
    final SubLObject base = string_utilities.substring( word_string, ZERO_INTEGER, Numbers.subtract( Sequences.length( word_string ), Sequences.length( suffix ) ) );
    SubLObject bases = NIL;
    if( suffix.equalp( $str32$ence ) )
    {
      bases = ConsesLow.list( Sequences.cconcatenate( base, $str33$ent ) );
    }
    else if( suffix.equalp( $str34$ily ) && NIL != string_utilities.ends_with( base, $str35$ey, UNPROVIDED ) )
    {
      bases = ConsesLow.list( string_utilities.post_remove( base, $str35$ey, UNPROVIDED ) );
    }
    else if( NIL != string_utilities.ends_with( base, $str36$ic, UNPROVIDED ) && suffix.equalp( $str37$al ) )
    {
      bases = ConsesLow.list( Sequences.cconcatenate( string_utilities.post_remove( base, $str36$ic, UNPROVIDED ), $str38$y ) );
    }
    else if( NIL != string_utilities.ends_in_geminateP( base ) && NIL != morphology.ends_with_doublerP( base ) && NIL != string_utilities.non_empty_string_p( suffix ) )
    {
      SubLObject ans = ConsesLow.list( string_utilities.strip_final( base, UNPROVIDED ) );
      if( NIL != string_utilities.ends_with( base, $str39$l, UNPROVIDED ) )
      {
        ans = ConsesLow.cons( base, ans );
      }
      bases = ans;
    }
    else if( NIL != string_utilities.ends_with( base, $str40$e, UNPROVIDED ) && NIL != string_utilities.starts_with( suffix, $str41$s ) )
    {
      SubLObject ans = ConsesLow.list( base );
      final SubLObject stripped = string_utilities.strip_final( base, UNPROVIDED );
      if( NIL != morphology.ends_with_sibilantP( stripped ) )
      {
        ans = ConsesLow.cons( stripped, ans );
      }
      bases = ans;
    }
    else if( NIL != string_utilities.ends_with( base, $str42$is, Symbols.symbol_function( EQUALP ) ) && suffix.equalp( $str43$ion ) )
    {
      bases = ConsesLow.list( Sequences.cconcatenate( string_utilities.strip_final( base, TWO_INTEGER ), $str44$ide ) );
    }
    else if( NIL != string_utilities.ends_with( base, $str42$is, Symbols.symbol_function( EQUALP ) ) )
    {
      bases = ConsesLow.list( Sequences.cconcatenate( base, $str40$e ) );
    }
    else if( NIL != morphology.starts_with_vowelP( suffix ) && ( NIL != morphology.single_c_codaP( base ) || NIL != string_utilities.ends_with( base, $str45$u, UNPROVIDED ) ) )
    {
      bases = ConsesLow.list( Sequences.cconcatenate( base, $str40$e ), base );
    }
    else if( NIL != string_utilities.ends_with( base, $str46$i, Symbols.symbol_function( EQUALP ) ) )
    {
      if( !suffix.equalp( $str32$ence ) )
      {
        bases = ConsesLow.list( Sequences.cconcatenate( string_utilities.strip_final( base, UNPROVIDED ), $str38$y ) );
      }
    }
    else if( suffix.equalp( $str43$ion ) && NIL != string_utilities.ends_with( base, $str47$cept, Symbols.symbol_function( EQUALP ) ) )
    {
      bases = ConsesLow.list( Sequences.cconcatenate( string_utilities.strip_final( base, TWO_INTEGER ), $str48$ive ) );
    }
    else
    {
      bases = ConsesLow.list( base );
    }
    return filter_base_candidates_against_generation( bases, suffix, word_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 10504L)
  public static SubLObject filter_base_candidates_against_generation(final SubLObject bases, final SubLObject suffix, final SubLObject word_string)
  {
    SubLObject gen_bases = NIL;
    SubLObject cdolist_list_var = bases;
    SubLObject one_base = NIL;
    one_base = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( morphology.add_english_suffix( one_base, suffix ).equalp( word_string ) )
      {
        gen_bases = ConsesLow.cons( one_base, gen_bases );
      }
      cdolist_list_var = cdolist_list_var.rest();
      one_base = cdolist_list_var.first();
    }
    return gen_bases;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 10900L)
  public static SubLObject mwp_suffix_lookup(final SubLObject type, final SubLObject word_string)
  {
    final SubLObject suffix_matcher = mwp_affix_matcher.mwp_suffix_matcher( type );
    return mwp_affix_matcher.mwp_suffix_matcher_find_matches( suffix_matcher, word_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 11134L)
  public static SubLObject morph_word_find_prefixes(final SubLObject v_morph_word, final SubLObject type)
  {
    final SubLObject word_string = morph_word_string( v_morph_word );
    final SubLObject parses = morph_word_parses( v_morph_word );
    SubLObject cdolist_list_var = mwp_prefix_lookup( type, word_string );
    SubLObject result = NIL;
    result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject prefix_string = standard_tokenization.string_token_string( result );
      final SubLObject rules = standard_tokenization.string_token_value( result );
      SubLObject cdolist_list_var_$5 = mwp_bases_for_word_string_with_prefix( word_string, prefix_string );
      SubLObject base = NIL;
      base = cdolist_list_var_$5.first();
      while ( NIL != cdolist_list_var_$5)
      {
        SubLObject cdolist_list_var_$6 = rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var_$6.first();
        while ( NIL != cdolist_list_var_$6)
        {
          SubLObject new_parse = mwp_parse.new_mwp_parse();
          new_parse = conses_high.putf( new_parse, $kw9$TYPE, type );
          new_parse = conses_high.putf( new_parse, $kw26$BASE, base );
          new_parse = conses_high.putf( new_parse, $kw27$AFFIX, prefix_string );
          new_parse = conses_high.putf( new_parse, $kw28$AFFIX_TYPE, $kw49$PREFIX );
          if( type == $kw21$DERIV )
          {
            new_parse = conses_high.putf( new_parse, $kw30$AFFIX_UNIT, rule );
          }
          new_parse = conses_high.putf( new_parse, $kw31$RULE, rule );
          mwp_parse.mwp_parse_set_add( parses, new_parse );
          cdolist_list_var_$6 = cdolist_list_var_$6.rest();
          rule = cdolist_list_var_$6.first();
        }
        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
        base = cdolist_list_var_$5.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      result = cdolist_list_var.first();
    }
    morph_word_parses_set( v_morph_word, parses );
    return v_morph_word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 12234L)
  public static SubLObject mwp_bases_for_word_string_with_prefix(final SubLObject word_string, final SubLObject prefix)
  {
    final SubLObject base = string_utilities.substring( word_string, Sequences.length( prefix ), UNPROVIDED );
    return ConsesLow.list( base );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 12757L)
  public static SubLObject mwp_prefix_lookup_internal(final SubLObject type, final SubLObject word_string)
  {
    final SubLObject prefix_matcher = mwp_affix_matcher.mwp_prefix_matcher( type );
    return mwp_affix_matcher.mwp_prefix_matcher_find_matches( prefix_matcher, word_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 12757L)
  public static SubLObject mwp_prefix_lookup(final SubLObject type, final SubLObject word_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return mwp_prefix_lookup_internal( type, word_string );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym50$MWP_PREFIX_LOOKUP, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym50$MWP_PREFIX_LOOKUP, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym50$MWP_PREFIX_LOOKUP, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( type, word_string );
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
        if( type.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && word_string.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( mwp_prefix_lookup_internal( type, word_string ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( type, word_string ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 13018L)
  public static SubLObject morph_word_find_bases(final SubLObject v_morph_word, final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject word_string = morph_word_string( v_morph_word );
    final SubLObject new_parses = mwp_parse.new_mwp_parse_set();
    SubLObject base_word_table = NIL;
    final SubLObject set_var = morph_word_parses( v_morph_word );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject parse;
    SubLObject current;
    SubLObject datum;
    SubLObject allow_other_keys_p;
    SubLObject rest;
    SubLObject bad;
    SubLObject current_$7;
    SubLObject rule_tail;
    SubLObject rule;
    SubLObject base_tail;
    SubLObject base;
    SubLObject zero_affixP;
    SubLObject base_words;
    SubLObject cdolist_list_var;
    SubLObject trie_word;
    SubLObject cdolist_list_var_$8;
    SubLObject base_denot;
    SubLObject cdolist_list_var_$9;
    SubLObject base_pos_pred;
    SubLObject new_parse;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      parse = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, parse ) && mwp_parse.mwp_parse_type( parse ).eql( type ) )
      {
        datum = ( current = parse );
        allow_other_keys_p = NIL;
        rest = current;
        bad = NIL;
        current_$7 = NIL;
        while ( NIL != rest)
        {
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list51 );
          current_$7 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list51 );
          if( NIL == conses_high.member( current_$7, $list52, UNPROVIDED, UNPROVIDED ) )
          {
            bad = T;
          }
          if( current_$7 == $kw8$ALLOW_OTHER_KEYS )
          {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if( NIL != bad && NIL == allow_other_keys_p )
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list51 );
        }
        rule_tail = cdestructuring_bind.property_list_member( $kw31$RULE, current );
        rule = ( NIL != rule_tail ) ? conses_high.cadr( rule_tail ) : NIL;
        base_tail = cdestructuring_bind.property_list_member( $kw26$BASE, current );
        base = ( NIL != base_tail ) ? conses_high.cadr( base_tail ) : NIL;
        if( NIL != rule && NIL != base )
        {
          zero_affixP = Strings.stringE( base, word_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          base_words = list_utilities.alist_lookup_without_values( base_word_table, base, Symbols.symbol_function( EQUAL ), $kw53$NEW );
          if( base_words == $kw53$NEW )
          {
            base_words = mwp_trie_base_words_by_lookup( base );
            if( ( NIL == zero_affixP || type != $kw21$DERIV ) && NIL == lexicon_vars.$mwp_suppress_recursive_analysisP$.getDynamicValue( thread ) )
            {
              base_words = ConsesLow.append( base_words, derived_nl_trie_words_int( base, T ) );
            }
            base_word_table = list_utilities.alist_enter( base_word_table, base, base_words, Symbols.symbol_function( EQUAL ) );
          }
          cdolist_list_var = mwp_find_base_trie_words( rule, base, type, base_words );
          trie_word = NIL;
          trie_word = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            cdolist_list_var_$8 = mwp_nl_trie_word_denots( trie_word );
            base_denot = NIL;
            base_denot = cdolist_list_var_$8.first();
            while ( NIL != cdolist_list_var_$8)
            {
              cdolist_list_var_$9 = nl_trie.nl_trie_word_pos_preds( trie_word );
              base_pos_pred = NIL;
              base_pos_pred = cdolist_list_var_$9.first();
              while ( NIL != cdolist_list_var_$9)
              {
                new_parse = mwp_parse.mwp_parse_copy( parse );
                new_parse = conses_high.putf( new_parse, $kw54$BASE_DENOT, base_denot );
                new_parse = conses_high.putf( new_parse, $kw19$WORD_UNIT, nl_trie.nl_trie_word_word_unit( trie_word, UNPROVIDED ) );
                new_parse = conses_high.putf( new_parse, $kw55$PRAGMATICS, nl_trie.nl_trie_entry_pragmatics( trie_word ) );
                new_parse = conses_high.putf( new_parse, $kw56$MT, nl_trie.nl_trie_entry_mt( trie_word ) );
                new_parse = conses_high.putf( new_parse, $kw57$SEM_PRED, nl_trie.nl_trie_entry_semantic_pred( trie_word, UNPROVIDED ) );
                new_parse = conses_high.putf( new_parse, $kw58$BASE_POS_PRED, base_pos_pred );
                mwp_parse.mwp_parse_set_add( new_parses, new_parse );
                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                base_pos_pred = cdolist_list_var_$9.first();
              }
              cdolist_list_var_$8 = cdolist_list_var_$8.rest();
              base_denot = cdolist_list_var_$8.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            trie_word = cdolist_list_var.first();
          }
        }
      }
    }
    morph_word_parses_set( v_morph_word, new_parses );
    return v_morph_word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 14997L)
  public static SubLObject mwp_nl_trie_word_denots(final SubLObject trie_word)
  {
    final SubLObject entry_denots = nl_trie.nl_trie_entry_denots( trie_word );
    final SubLObject word_unit = nl_trie.nl_trie_word_word_unit( trie_word, UNPROVIDED );
    return ( NIL != word_unit ) ? ConsesLow.cons( ConsesLow.list( $kw59$DENOT_OF, word_unit ), entry_denots ) : entry_denots;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 15314L)
  public static SubLObject mwp_find_base_trie_words(final SubLObject rule, final SubLObject base, final SubLObject type, final SubLObject words_from_lookup)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject constraints = mwp_rule.mwp_rule_constraints( rule, type );
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = words_from_lookup;
    SubLObject trie_word = NIL;
    trie_word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject filtered_trie_word = mwp_filter_trie_word( trie_word, constraints );
      if( NIL != nl_trie.nl_trie_word_pos_preds( filtered_trie_word ) )
      {
        ans = ConsesLow.cons( filtered_trie_word, ans );
      }
      cdolist_list_var = cdolist_list_var.rest();
      trie_word = cdolist_list_var.first();
    }
    if( NIL == ans && NIL != lexicon_vars.$mwp_make_up_basesP$.getDynamicValue( thread ) )
    {
      ans = mwp_unknown_base_plist( rule, base, type );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 16046L)
  public static SubLObject derived_nl_trie_words_int_internal(final SubLObject word_string, final SubLObject derivational_onlyP)
  {
    assert NIL != Types.stringp( word_string ) : word_string;
    morphological_word_parser.mwp_check_initializations();
    final SubLObject word = new_morph_word( word_string );
    SubLObject ans = NIL;
    morph_word_parse_affixes( word, derivational_onlyP );
    final SubLObject set_var = morph_word_parses( word );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject parse;
    SubLObject current;
    SubLObject datum;
    SubLObject allow_other_keys_p;
    SubLObject rest;
    SubLObject bad;
    SubLObject current_$10;
    SubLObject word_denot_tail;
    SubLObject word_denot;
    SubLObject word_pos_pred_tail;
    SubLObject word_pos_pred;
    SubLObject word_unit_tail;
    SubLObject word_unit;
    SubLObject mt_tail;
    SubLObject mt;
    SubLObject syn_support_sentence;
    SubLObject syn_support;
    SubLObject sem_support;
    SubLObject new_word;
    SubLObject verify_pragmaticsP;
    SubLObject addedP;
    SubLObject csome_list_var;
    SubLObject existing_word;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      parse = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, parse ) )
      {
        datum = ( current = parse );
        allow_other_keys_p = NIL;
        rest = current;
        bad = NIL;
        current_$10 = NIL;
        while ( NIL != rest)
        {
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list61 );
          current_$10 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list61 );
          if( NIL == conses_high.member( current_$10, $list62, UNPROVIDED, UNPROVIDED ) )
          {
            bad = T;
          }
          if( current_$10 == $kw8$ALLOW_OTHER_KEYS )
          {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if( NIL != bad && NIL == allow_other_keys_p )
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list61 );
        }
        word_denot_tail = cdestructuring_bind.property_list_member( $kw25$WORD_DENOT, current );
        word_denot = ( NIL != word_denot_tail ) ? conses_high.cadr( word_denot_tail ) : NIL;
        word_pos_pred_tail = cdestructuring_bind.property_list_member( $kw63$WORD_POS_PRED, current );
        word_pos_pred = ( NIL != word_pos_pred_tail ) ? conses_high.cadr( word_pos_pred_tail ) : NIL;
        word_unit_tail = cdestructuring_bind.property_list_member( $kw19$WORD_UNIT, current );
        word_unit = ( NIL != word_unit_tail ) ? conses_high.cadr( word_unit_tail ) : NIL;
        mt_tail = cdestructuring_bind.property_list_member( $kw56$MT, current );
        mt = ( NIL != mt_tail ) ? conses_high.cadr( mt_tail ) : NIL;
        if( NIL != word_denot || NIL != word_pos_pred || NIL != word_unit )
        {
          syn_support_sentence = el_utilities.make_binary_formula( word_pos_pred, word_unit, word_string );
          syn_support = nl_trie.new_nl_trie_word_hl_syn_support( syn_support_sentence, mt );
          sem_support = nl_trie.new_nl_trie_word_hl_sem_support( set_utilities.new_singleton_set( word_denot, Symbols.symbol_function( EQUALP ) ), mt );
          new_word = nl_trie.new_nl_trie_word( set_utilities.new_singleton_set( syn_support, Symbols.symbol_function( EQUALP ) ), set_utilities.new_singleton_set( sem_support, Symbols.symbol_function( EQUALP ) ) );
          verify_pragmaticsP = T;
          addedP = NIL;
          if( NIL == addedP )
          {
            csome_list_var = ans;
            existing_word = NIL;
            existing_word = csome_list_var.first();
            while ( NIL == addedP && NIL != csome_list_var)
            {
              if( NIL != nl_trie.unifiable_word_entriesP( existing_word, new_word, verify_pragmaticsP ) )
              {
                nl_trie.nl_trie_augment_word( existing_word, new_word, T );
                addedP = T;
              }
              csome_list_var = csome_list_var.rest();
              existing_word = csome_list_var.first();
            }
          }
          if( NIL == addedP )
          {
            ans = ConsesLow.cons( new_word, ans );
          }
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 16046L)
  public static SubLObject derived_nl_trie_words_int(final SubLObject word_string, final SubLObject derivational_onlyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return derived_nl_trie_words_int_internal( word_string, derivational_onlyP );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym60$DERIVED_NL_TRIE_WORDS_INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym60$DERIVED_NL_TRIE_WORDS_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym60$DERIVED_NL_TRIE_WORDS_INT, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( word_string, derivational_onlyP );
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
        if( word_string.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && derivational_onlyP.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( derived_nl_trie_words_int_internal( word_string, derivational_onlyP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( word_string, derivational_onlyP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 17418L)
  public static SubLObject mwp_unknown_base_plist(final SubLObject rule, final SubLObject base, final SubLObject type)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 17807L)
  public static SubLObject mwp_filter_trie_word(SubLObject trie_word, final SubLObject constraints)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sem_supports = nl_trie.nl_trie_word_semantic_support_set( trie_word );
    final SubLObject syn_supports = nl_trie.nl_trie_word_syntactic_support_set( trie_word );
    final SubLObject sem_pred = nl_trie.nl_trie_word_sem_pred( trie_word, UNPROVIDED );
    final SubLObject denot_arg = ( NIL != kb_indexing_datastructures.indexed_term_p( sem_pred ) ) ? lexicon_utilities.denotatum_arg_of_pred_cached( sem_pred ) : NIL;
    thread.resetMultipleValues();
    final SubLObject sem_constraints = list_utilities.partition_list( constraints, Symbols.symbol_function( $sym64$MWP_SEMANTIC_CONSTRAINT_P ) );
    final SubLObject syn_constraints = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject filtered_sem_supports = ( NIL != sem_constraints && denot_arg.isInteger() ) ? mwp_filter_semantic_supports( sem_supports, sem_constraints, denot_arg ) : sem_supports;
    final SubLObject filtered_syn_supports = ( NIL != syn_constraints ) ? mwp_filter_syntactic_supports( syn_supports, syn_constraints ) : syn_supports;
    if( NIL == set_utilities.sets_coextensionalP( filtered_sem_supports, sem_supports ) || NIL == set_utilities.sets_coextensionalP( filtered_syn_supports, syn_supports ) )
    {
      trie_word = nl_trie.new_nl_trie_word( filtered_syn_supports, filtered_sem_supports );
    }
    return trie_word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 18965L)
  public static SubLObject mwp_semantic_support_passes_constraintP(final SubLObject sem_support, final SubLObject constraint, final SubLObject denot_arg)
  {
    final SubLObject denot = cycl_utilities.atomic_sentence_arg( nl_trie.nl_trie_word_support_sentence( sem_support ), denot_arg, UNPROVIDED );
    return mwp_denot_passes_constraintP( denot, constraint );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 19215L)
  public static SubLObject mwp_syntactic_support_passes_constraintP(final SubLObject syn_support, final SubLObject constraint)
  {
    SubLObject failP = nl_trie.nl_trie_word_syntactic_support_abbreviation_p( syn_support );
    if( NIL == failP )
    {
      SubLObject csome_list_var = nl_trie.nl_trie_word_syntactic_support_pos_preds( syn_support );
      SubLObject pos_pred = NIL;
      pos_pred = csome_list_var.first();
      while ( NIL == failP && NIL != csome_list_var)
      {
        if( NIL == mwp_pos_pred_passes_constraintP( pos_pred, constraint ) )
        {
          failP = T;
        }
        csome_list_var = csome_list_var.rest();
        pos_pred = csome_list_var.first();
      }
    }
    return makeBoolean( NIL == failP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 19572L)
  public static SubLObject mwp_semantic_constraint_p(final SubLObject constraint)
  {
    return subl_promotions.memberP( constraint.first(), $list65, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 19678L)
  public static SubLObject mwp_filter_semantic_supports(final SubLObject sem_supports, final SubLObject sem_constraints, final SubLObject denot_arg)
  {
    assert NIL != set.set_p( sem_supports ) : sem_supports;
    assert NIL != list_utilities.proper_list_p( sem_constraints ) : sem_constraints;
    assert NIL != Types.integerp( denot_arg ) : denot_arg;
    final SubLObject result = set.new_set( Symbols.symbol_function( EQUALP ), UNPROVIDED );
    final SubLObject set_contents_var = set.do_set_internal( sem_supports );
    SubLObject basis_object;
    SubLObject state;
    SubLObject sem_support;
    SubLObject rejectedP;
    SubLObject csome_list_var;
    SubLObject sem_constraint;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      sem_support = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, sem_support ) )
      {
        rejectedP = NIL;
        if( NIL == rejectedP )
        {
          csome_list_var = sem_constraints;
          sem_constraint = NIL;
          sem_constraint = csome_list_var.first();
          while ( NIL == rejectedP && NIL != csome_list_var)
          {
            if( NIL == mwp_semantic_support_passes_constraintP( sem_support, sem_constraint, denot_arg ) )
            {
              rejectedP = T;
            }
            csome_list_var = csome_list_var.rest();
            sem_constraint = csome_list_var.first();
          }
        }
        if( NIL == rejectedP )
        {
          set.set_add( sem_support, result );
        }
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 20308L)
  public static SubLObject mwp_filter_syntactic_supports(final SubLObject syn_supports, final SubLObject syn_constraints)
  {
    assert NIL != set.set_p( syn_supports ) : syn_supports;
    assert NIL != list_utilities.proper_list_p( syn_constraints ) : syn_constraints;
    final SubLObject result = set.new_set( Symbols.symbol_function( EQUALP ), UNPROVIDED );
    final SubLObject set_contents_var = set.do_set_internal( syn_supports );
    SubLObject basis_object;
    SubLObject state;
    SubLObject syn_support;
    SubLObject acceptedP;
    SubLObject csome_list_var;
    SubLObject syn_constraint;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      syn_support = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, syn_support ) )
      {
        acceptedP = NIL;
        if( NIL == acceptedP )
        {
          csome_list_var = syn_constraints;
          syn_constraint = NIL;
          syn_constraint = csome_list_var.first();
          while ( NIL == acceptedP && NIL != csome_list_var)
          {
            if( NIL != mwp_syntactic_support_passes_constraintP( syn_support, syn_constraint ) )
            {
              set.set_add( syn_support, result );
              acceptedP = T;
            }
            csome_list_var = csome_list_var.rest();
            syn_constraint = csome_list_var.first();
          }
        }
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 20874L)
  public static SubLObject mwp_denot_passes_constraintP(final SubLObject denot, final SubLObject constraint)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject type = NIL;
    SubLObject target = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( constraint, constraint, $list69 );
    type = constraint.first();
    SubLObject current = constraint.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, constraint, $list69 );
    target = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( constraint, $list69 );
      return NIL;
    }
    final SubLObject pcase_var = type;
    if( pcase_var.eql( $kw70$GENL ) )
    {
      return makeBoolean( NIL != term.el_fort_p( denot ) && NIL != genls.genlP( denot, target, lexicon_vars.$mwp_semantic_check_mt$.getDynamicValue( thread ), UNPROVIDED ) );
    }
    if( pcase_var.eql( $kw71$ISA ) )
    {
      return makeBoolean( NIL != term.el_fort_p( denot ) && NIL != isa.isaP( denot, target, lexicon_vars.$mwp_semantic_check_mt$.getDynamicValue( thread ), UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 21241L)
  public static SubLObject mwp_pos_pred_passes_constraintP(final SubLObject pos_pred, final SubLObject constraint)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject type = NIL;
    SubLObject target = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( constraint, constraint, $list69 );
    type = constraint.first();
    SubLObject current = constraint.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, constraint, $list69 );
    target = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( constraint, $list69 );
      return NIL;
    }
    final SubLObject pcase_var = type;
    if( pcase_var.eql( $kw72$PRED ) )
    {
      return lexicon_accessors.genl_pos_predP( pos_pred, target, lexicon_vars.$mwp_syntactic_check_mt$.getDynamicValue( thread ) );
    }
    if( pcase_var.eql( $kw73$POS ) )
    {
      return mwp_pred_meets_pos_constraintP( pos_pred, target );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 21574L)
  public static SubLObject mwp_pred_meets_pos_constraintP(final SubLObject pred, final SubLObject target)
  {
    return lexicon_accessors.genl_posP( lexicon_accessors.pos_of_pred( pred ), target, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 21804L)
  public static SubLObject clear_mwp_base_pred_of_pos()
  {
    final SubLObject cs = $mwp_base_pred_of_pos_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 21804L)
  public static SubLObject remove_mwp_base_pred_of_pos(final SubLObject pos, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$mwp_syntactic_check_mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $mwp_base_pred_of_pos_caching_state$.getGlobalValue(), ConsesLow.list( pos, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 21804L)
  public static SubLObject mwp_base_pred_of_pos_internal(final SubLObject pos, final SubLObject mt)
  {
    return ask_utilities.ask_variable( $sym75$_PRED, ConsesLow.listS( $const76$basicSpeechPartPred, pos, $list77 ), mt, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 21804L)
  public static SubLObject mwp_base_pred_of_pos(final SubLObject pos, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$mwp_syntactic_check_mt$.getDynamicValue();
    }
    SubLObject caching_state = $mwp_base_pred_of_pos_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym74$MWP_BASE_PRED_OF_POS, $sym78$_MWP_BASE_PRED_OF_POS_CACHING_STATE_, NIL, EQL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( pos, mt );
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
        if( pos.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( mwp_base_pred_of_pos_internal( pos, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pos, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 21984L)
  public static SubLObject morph_word_apply_rules(final SubLObject v_morph_word, final SubLObject type)
  {
    final SubLObject new_parses = mwp_parse.new_mwp_parse_set();
    final SubLObject set_var = morph_word_parses( v_morph_word );
    final SubLObject set_contents_var = set.do_set_internal( set_var );
    SubLObject basis_object;
    SubLObject state;
    SubLObject parse;
    SubLObject current;
    SubLObject datum;
    SubLObject allow_other_keys_p;
    SubLObject rest;
    SubLObject bad;
    SubLObject current_$11;
    SubLObject rule_tail;
    SubLObject rule;
    SubLObject base_denot_tail;
    SubLObject base_denot;
    SubLObject word_unit_tail;
    SubLObject word_unit;
    SubLObject base_pos_pred_tail;
    SubLObject base_pos_pred;
    SubLObject affix_type_tail;
    SubLObject affix_type;
    SubLObject base_dpw;
    SubLObject word_dpw;
    SubLObject current_$12;
    SubLObject datum_$12;
    SubLObject word_denot;
    SubLObject word_pos_pred;
    SubLObject derived_word_unit;
    SubLObject new_parse;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      parse = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, parse ) && mwp_parse.mwp_parse_type( parse ).eql( type ) )
      {
        datum = ( current = parse );
        allow_other_keys_p = NIL;
        rest = current;
        bad = NIL;
        current_$11 = NIL;
        while ( NIL != rest)
        {
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list79 );
          current_$11 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list79 );
          if( NIL == conses_high.member( current_$11, $list80, UNPROVIDED, UNPROVIDED ) )
          {
            bad = T;
          }
          if( current_$11 == $kw8$ALLOW_OTHER_KEYS )
          {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if( NIL != bad && NIL == allow_other_keys_p )
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list79 );
        }
        rule_tail = cdestructuring_bind.property_list_member( $kw31$RULE, current );
        rule = ( NIL != rule_tail ) ? conses_high.cadr( rule_tail ) : NIL;
        base_denot_tail = cdestructuring_bind.property_list_member( $kw54$BASE_DENOT, current );
        base_denot = ( NIL != base_denot_tail ) ? conses_high.cadr( base_denot_tail ) : NIL;
        word_unit_tail = cdestructuring_bind.property_list_member( $kw19$WORD_UNIT, current );
        word_unit = ( NIL != word_unit_tail ) ? conses_high.cadr( word_unit_tail ) : NIL;
        base_pos_pred_tail = cdestructuring_bind.property_list_member( $kw58$BASE_POS_PRED, current );
        base_pos_pred = ( NIL != base_pos_pred_tail ) ? conses_high.cadr( base_pos_pred_tail ) : NIL;
        affix_type_tail = cdestructuring_bind.property_list_member( $kw28$AFFIX_TYPE, current );
        affix_type = ( NIL != affix_type_tail ) ? conses_high.cadr( affix_type_tail ) : NIL;
        if( NIL != base_denot && NIL != base_pos_pred && NIL != word_unit && NIL != rule )
        {
          base_dpw = ConsesLow.list( base_denot, base_pos_pred, word_unit );
          word_dpw = mwp_rule.mwp_rule_apply( base_dpw, rule, type, affix_type );
          if( word_dpw.isList() )
          {
            datum_$12 = ( current_$12 = word_dpw );
            word_denot = NIL;
            word_pos_pred = NIL;
            derived_word_unit = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current_$12, datum_$12, $list81 );
            word_denot = current_$12.first();
            current_$12 = current_$12.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$12, datum_$12, $list81 );
            word_pos_pred = current_$12.first();
            current_$12 = current_$12.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$12, datum_$12, $list81 );
            derived_word_unit = current_$12.first();
            current_$12 = current_$12.rest();
            if( NIL == current_$12 )
            {
              new_parse = mwp_parse.mwp_parse_copy( parse );
              new_parse = conses_high.putf( new_parse, $kw25$WORD_DENOT, word_denot );
              new_parse = conses_high.putf( new_parse, $kw63$WORD_POS_PRED, word_pos_pred );
              new_parse = conses_high.putf( new_parse, $kw19$WORD_UNIT, derived_word_unit );
              mwp_parse.mwp_parse_set_add( new_parses, new_parse );
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum_$12, $list81 );
            }
          }
        }
      }
    }
    morph_word_parses_set( v_morph_word, new_parses );
    return v_morph_word;
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 23121L)
  public static SubLObject morph_word_info_lookup(final SubLObject v_morph_word, final SubLObject info_key)
  {
    final SubLObject info = document.word_info( v_morph_word );
    return list_utilities.alist_lookup( info, info_key, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/morph-word.lisp", position = 23307L)
  public static SubLObject morph_word_info_set(final SubLObject v_morph_word, final SubLObject info_key, final SubLObject value)
  {
    final SubLObject info = document.word_info( v_morph_word );
    final SubLObject new_info = list_utilities.alist_enter( info, info_key, value, UNPROVIDED );
    document.word_update( v_morph_word, ConsesLow.list( $kw82$INFO, new_info ) );
    return new_info;
  }

  public static SubLObject declare_morph_word_file()
  {
    SubLFiles.declareFunction( me, "morph_word_p", "MORPH-WORD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_morph_word", "NEW-MORPH-WORD", 1, 0, false );
    SubLFiles.declareFunction( me, "morph_word_string", "MORPH-WORD-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "morph_word_parses", "MORPH-WORD-PARSES", 1, 0, false );
    SubLFiles.declareFunction( me, "morph_word_add_parse", "MORPH-WORD-ADD-PARSE", 2, 0, false );
    SubLFiles.declareFunction( me, "morph_word_parses_set", "MORPH-WORD-PARSES-SET", 2, 0, false );
    SubLFiles.declareMacro( me, "morph_word_do_parses", "MORPH-WORD-DO-PARSES" );
    SubLFiles.declareFunction( me, "mwp_parse_complex_p", "MWP-PARSE-COMPLEX-P", 1, 0, false );
    SubLFiles.declareFunction( me, "word_complex_p", "WORD-COMPLEX-P", 1, 0, false );
    SubLFiles.declareFunction( me, "morph_word_print_parses", "MORPH-WORD-PRINT-PARSES", 1, 0, false );
    SubLFiles.declareFunction( me, "morph_word_print_parse", "MORPH-WORD-PRINT-PARSE", 1, 0, false );
    SubLFiles.declareFunction( me, "morph_word_parse_affixes", "MORPH-WORD-PARSE-AFFIXES", 1, 1, false );
    SubLFiles.declareFunction( me, "morph_word_parse_affixes_int", "MORPH-WORD-PARSE-AFFIXES-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "mwp_trie_base_words_by_lookup_internal", "MWP-TRIE-BASE-WORDS-BY-LOOKUP-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "mwp_trie_base_words_by_lookup", "MWP-TRIE-BASE-WORDS-BY-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_entry_ok_for_mwp_base_wordP", "NL-TRIE-ENTRY-OK-FOR-MWP-BASE-WORD?", 1, 0, false );
    SubLFiles.declareFunction( me, "morph_word_triefy", "MORPH-WORD-TRIEFY", 1, 0, false );
    SubLFiles.declareFunction( me, "morph_word_reformulate_parses", "MORPH-WORD-REFORMULATE-PARSES", 1, 0, false );
    SubLFiles.declareFunction( me, "morph_word_find_affixes", "MORPH-WORD-FIND-AFFIXES", 2, 0, false );
    SubLFiles.declareFunction( me, "morph_word_find_suffixes", "MORPH-WORD-FIND-SUFFIXES", 2, 0, false );
    SubLFiles.declareFunction( me, "mwp_bases_for_word_string_with_suffix", "MWP-BASES-FOR-WORD-STRING-WITH-SUFFIX", 2, 0, false );
    SubLFiles.declareFunction( me, "filter_base_candidates_against_generation", "FILTER-BASE-CANDIDATES-AGAINST-GENERATION", 3, 0, false );
    SubLFiles.declareFunction( me, "mwp_suffix_lookup", "MWP-SUFFIX-LOOKUP", 2, 0, false );
    SubLFiles.declareFunction( me, "morph_word_find_prefixes", "MORPH-WORD-FIND-PREFIXES", 2, 0, false );
    SubLFiles.declareFunction( me, "mwp_bases_for_word_string_with_prefix", "MWP-BASES-FOR-WORD-STRING-WITH-PREFIX", 2, 0, false );
    SubLFiles.declareFunction( me, "mwp_prefix_lookup_internal", "MWP-PREFIX-LOOKUP-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "mwp_prefix_lookup", "MWP-PREFIX-LOOKUP", 2, 0, false );
    SubLFiles.declareFunction( me, "morph_word_find_bases", "MORPH-WORD-FIND-BASES", 2, 0, false );
    SubLFiles.declareFunction( me, "mwp_nl_trie_word_denots", "MWP-NL-TRIE-WORD-DENOTS", 1, 0, false );
    SubLFiles.declareFunction( me, "mwp_find_base_trie_words", "MWP-FIND-BASE-TRIE-WORDS", 4, 0, false );
    SubLFiles.declareFunction( me, "derived_nl_trie_words_int_internal", "DERIVED-NL-TRIE-WORDS-INT-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "derived_nl_trie_words_int", "DERIVED-NL-TRIE-WORDS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "mwp_unknown_base_plist", "MWP-UNKNOWN-BASE-PLIST", 3, 0, false );
    SubLFiles.declareFunction( me, "mwp_filter_trie_word", "MWP-FILTER-TRIE-WORD", 2, 0, false );
    SubLFiles.declareFunction( me, "mwp_semantic_support_passes_constraintP", "MWP-SEMANTIC-SUPPORT-PASSES-CONSTRAINT?", 3, 0, false );
    SubLFiles.declareFunction( me, "mwp_syntactic_support_passes_constraintP", "MWP-SYNTACTIC-SUPPORT-PASSES-CONSTRAINT?", 2, 0, false );
    SubLFiles.declareFunction( me, "mwp_semantic_constraint_p", "MWP-SEMANTIC-CONSTRAINT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "mwp_filter_semantic_supports", "MWP-FILTER-SEMANTIC-SUPPORTS", 3, 0, false );
    SubLFiles.declareFunction( me, "mwp_filter_syntactic_supports", "MWP-FILTER-SYNTACTIC-SUPPORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "mwp_denot_passes_constraintP", "MWP-DENOT-PASSES-CONSTRAINT?", 2, 0, false );
    SubLFiles.declareFunction( me, "mwp_pos_pred_passes_constraintP", "MWP-POS-PRED-PASSES-CONSTRAINT?", 2, 0, false );
    SubLFiles.declareFunction( me, "mwp_pred_meets_pos_constraintP", "MWP-PRED-MEETS-POS-CONSTRAINT?", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_mwp_base_pred_of_pos", "CLEAR-MWP-BASE-PRED-OF-POS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_mwp_base_pred_of_pos", "REMOVE-MWP-BASE-PRED-OF-POS", 1, 1, false );
    SubLFiles.declareFunction( me, "mwp_base_pred_of_pos_internal", "MWP-BASE-PRED-OF-POS-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "mwp_base_pred_of_pos", "MWP-BASE-PRED-OF-POS", 1, 1, false );
    SubLFiles.declareFunction( me, "morph_word_apply_rules", "MORPH-WORD-APPLY-RULES", 2, 0, false );
    SubLFiles.declareFunction( me, "morph_word_info_lookup", "MORPH-WORD-INFO-LOOKUP", 2, 0, false );
    SubLFiles.declareFunction( me, "morph_word_info_set", "MORPH-WORD-INFO-SET", 3, 0, false );
    return NIL;
  }

  public static SubLObject init_morph_word_file()
  {
    $mwp_base_pred_of_pos_caching_state$ = SubLFiles.deflexical( "*MWP-BASE-PRED-OF-POS-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_morph_word_file()
  {
    access_macros.register_macro_helper( $sym17$MWP_PARSE_COMPLEX_P, $sym18$MORPH_WORD_DO_PARSES );
    memoization_state.note_memoized_function( $sym22$MWP_TRIE_BASE_WORDS_BY_LOOKUP );
    memoization_state.note_memoized_function( $sym50$MWP_PREFIX_LOOKUP );
    memoization_state.note_memoized_function( $sym60$DERIVED_NL_TRIE_WORDS_INT );
    memoization_state.note_globally_cached_function( $sym74$MWP_BASE_PRED_OF_POS );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_morph_word_file();
  }

  @Override
  public void initializeVariables()
  {
    init_morph_word_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_morph_word_file();
  }
  static
  {
    me = new morph_word();
    $mwp_base_pred_of_pos_caching_state$ = null;
    $sym0$STRINGP = makeSymbol( "STRINGP" );
    $kw1$STRING = makeKeyword( "STRING" );
    $kw2$PARSES = makeKeyword( "PARSES" );
    $sym3$MORPH_WORD_P = makeSymbol( "MORPH-WORD-P" );
    $kw4$ADDED = makeKeyword( "ADDED" );
    $kw5$ALREADY_THERE = makeKeyword( "ALREADY-THERE" );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "PARSE" ), makeSymbol( "MORPH-WORD" ), makeSymbol( "&KEY" ), makeSymbol( "TYPE" ), ConsesLow.list( makeSymbol( "COMPLEX-ONLY?" ), NIL ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $list7 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "COMPLEX-ONLY?" ) );
    $kw8$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw9$TYPE = makeKeyword( "TYPE" );
    $kw10$COMPLEX_ONLY_ = makeKeyword( "COMPLEX-ONLY?" );
    $sym11$DO_SET = makeSymbol( "DO-SET" );
    $sym12$MORPH_WORD_PARSES = makeSymbol( "MORPH-WORD-PARSES" );
    $sym13$PWHEN = makeSymbol( "PWHEN" );
    $sym14$CAND = makeSymbol( "CAND" );
    $sym15$MWP_PARSE_TYPE = makeSymbol( "MWP-PARSE-TYPE" );
    $sym16$FIMPLIES = makeSymbol( "FIMPLIES" );
    $sym17$MWP_PARSE_COMPLEX_P = makeSymbol( "MWP-PARSE-COMPLEX-P" );
    $sym18$MORPH_WORD_DO_PARSES = makeSymbol( "MORPH-WORD-DO-PARSES" );
    $kw19$WORD_UNIT = makeKeyword( "WORD-UNIT" );
    $str20$__Parses_for__S___ = makeString( "~&Parses for ~S:~%" );
    $kw21$DERIV = makeKeyword( "DERIV" );
    $sym22$MWP_TRIE_BASE_WORDS_BY_LOOKUP = makeSymbol( "MWP-TRIE-BASE-WORDS-BY-LOOKUP" );
    $kw23$ANY = makeKeyword( "ANY" );
    $kw24$DENOT = makeKeyword( "DENOT" );
    $kw25$WORD_DENOT = makeKeyword( "WORD-DENOT" );
    $kw26$BASE = makeKeyword( "BASE" );
    $kw27$AFFIX = makeKeyword( "AFFIX" );
    $kw28$AFFIX_TYPE = makeKeyword( "AFFIX-TYPE" );
    $kw29$SUFFIX = makeKeyword( "SUFFIX" );
    $kw30$AFFIX_UNIT = makeKeyword( "AFFIX-UNIT" );
    $kw31$RULE = makeKeyword( "RULE" );
    $str32$ence = makeString( "ence" );
    $str33$ent = makeString( "ent" );
    $str34$ily = makeString( "ily" );
    $str35$ey = makeString( "ey" );
    $str36$ic = makeString( "ic" );
    $str37$al = makeString( "al" );
    $str38$y = makeString( "y" );
    $str39$l = makeString( "l" );
    $str40$e = makeString( "e" );
    $str41$s = makeString( "s" );
    $str42$is = makeString( "is" );
    $str43$ion = makeString( "ion" );
    $str44$ide = makeString( "ide" );
    $str45$u = makeString( "u" );
    $str46$i = makeString( "i" );
    $str47$cept = makeString( "cept" );
    $str48$ive = makeString( "ive" );
    $kw49$PREFIX = makeKeyword( "PREFIX" );
    $sym50$MWP_PREFIX_LOOKUP = makeSymbol( "MWP-PREFIX-LOOKUP" );
    $list51 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "RULE" ), makeSymbol( "BASE" ) );
    $list52 = ConsesLow.list( makeKeyword( "RULE" ), makeKeyword( "BASE" ) );
    $kw53$NEW = makeKeyword( "NEW" );
    $kw54$BASE_DENOT = makeKeyword( "BASE-DENOT" );
    $kw55$PRAGMATICS = makeKeyword( "PRAGMATICS" );
    $kw56$MT = makeKeyword( "MT" );
    $kw57$SEM_PRED = makeKeyword( "SEM-PRED" );
    $kw58$BASE_POS_PRED = makeKeyword( "BASE-POS-PRED" );
    $kw59$DENOT_OF = makeKeyword( "DENOT-OF" );
    $sym60$DERIVED_NL_TRIE_WORDS_INT = makeSymbol( "DERIVED-NL-TRIE-WORDS-INT" );
    $list61 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "WORD-DENOT" ), makeSymbol( "WORD-POS-PRED" ), makeSymbol( "WORD-UNIT" ), makeSymbol( "MT" ) );
    $list62 = ConsesLow.list( makeKeyword( "WORD-DENOT" ), makeKeyword( "WORD-POS-PRED" ), makeKeyword( "WORD-UNIT" ), makeKeyword( "MT" ) );
    $kw63$WORD_POS_PRED = makeKeyword( "WORD-POS-PRED" );
    $sym64$MWP_SEMANTIC_CONSTRAINT_P = makeSymbol( "MWP-SEMANTIC-CONSTRAINT-P" );
    $list65 = ConsesLow.list( makeKeyword( "GENL" ), makeKeyword( "ISA" ) );
    $sym66$SET_P = makeSymbol( "SET-P" );
    $sym67$PROPER_LIST_P = makeSymbol( "PROPER-LIST-P" );
    $sym68$INTEGERP = makeSymbol( "INTEGERP" );
    $list69 = ConsesLow.list( makeSymbol( "TYPE" ), makeSymbol( "TARGET" ) );
    $kw70$GENL = makeKeyword( "GENL" );
    $kw71$ISA = makeKeyword( "ISA" );
    $kw72$PRED = makeKeyword( "PRED" );
    $kw73$POS = makeKeyword( "POS" );
    $sym74$MWP_BASE_PRED_OF_POS = makeSymbol( "MWP-BASE-PRED-OF-POS" );
    $sym75$_PRED = makeSymbol( "?PRED" );
    $const76$basicSpeechPartPred = constant_handles.reader_make_constant_shell( makeString( "basicSpeechPartPred" ) );
    $list77 = ConsesLow.list( makeSymbol( "?PRED" ) );
    $sym78$_MWP_BASE_PRED_OF_POS_CACHING_STATE_ = makeSymbol( "*MWP-BASE-PRED-OF-POS-CACHING-STATE*" );
    $list79 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "RULE" ), makeSymbol( "BASE-DENOT" ), makeSymbol( "WORD-UNIT" ), makeSymbol( "BASE-POS-PRED" ), makeSymbol( "AFFIX-TYPE" ) );
    $list80 = ConsesLow.list( makeKeyword( "RULE" ), makeKeyword( "BASE-DENOT" ), makeKeyword( "WORD-UNIT" ), makeKeyword( "BASE-POS-PRED" ), makeKeyword( "AFFIX-TYPE" ) );
    $list81 = ConsesLow.list( makeSymbol( "WORD-DENOT" ), makeSymbol( "WORD-POS-PRED" ), makeSymbol( "DERIVED-WORD-UNIT" ) );
    $kw82$INFO = makeKeyword( "INFO" );
  }
}
/*
 * 
 * Total time: 276 ms
 * 
 */