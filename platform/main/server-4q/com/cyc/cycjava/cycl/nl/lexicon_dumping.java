package com.cyc.cycjava.cycl.nl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.nl_generation_api;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.owl.owl_cycl_to_xml;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.cycjava.cycl.os_process_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.xml_utilities;
import com.cyc.cycjava.cycl.xml_vars;
import com.cyc.cycjava.cycl.nl_generation_fort_cache;
import com.cyc.cycjava.cycl.semtrans_lexicon;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.term_lexicon;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.abstract_lexicon;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class lexicon_dumping
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.nl.lexicon_dumping";
  public static final String myFingerPrint = "6df948792f495b96201f54a64bd8a804c926b92ae0e4e67153e2de90d6dd4159";
  @SubLTranslatedFile.SubL(source = "cycl/nl/lexicon-dumping.lisp", position = 954L)
  public static SubLSymbol $lexicon_dumping_copy_filesP$;
  @SubLTranslatedFile.SubL(source = "cycl/nl/lexicon-dumping.lisp", position = 1153L)
  private static SubLSymbol $lexicon_dump_excluded_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/nl/lexicon-dumping.lisp", position = 1563L)
  private static SubLSymbol $dumping_lexicon$;
  @SubLTranslatedFile.SubL(source = "cycl/nl/lexicon-dumping.lisp", position = 2144L)
  private static SubLSymbol $dumping_semtrans_lexicon$;
  @SubLTranslatedFile.SubL(source = "cycl/nl/lexicon-dumping.lisp", position = 2242L)
  private static SubLSymbol $semtrans_lexicon_dump_excluded_pos_list$;
  @SubLTranslatedFile.SubL(source = "cycl/nl/lexicon-dumping.lisp", position = 18749L)
  private static SubLSymbol $lexicon_file_record_separator$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$TERM_LEXICON;
  private static final SubLSymbol $sym2$EXCLUDE_PREDICATE;
  private static final SubLObject $const3$EnglishDocumentTaggingLexicalMt;
  private static final SubLSymbol $sym4$DEFAULT_BASE_MT;
  private static final SubLObject $const5$AllGeneralEnglishValidatedLexical;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$SEMTRANS_LEXICON;
  private static final SubLSymbol $sym8$EXCLUDE_POS;
  private static final SubLString $str9$_cyc_projects_opencyc_tagging_lex;
  private static final SubLSymbol $sym10$FORT_HAS_EXPORTED_OWL_OPENCYC_CONTENT_;
  private static final SubLString $str11$_cyc_projects_concept_search_;
  private static final SubLSymbol $sym12$FORT_SHOULD_BE_IN_LEXICON_;
  private static final SubLString $str13$strings_to_short_ids;
  private static final SubLString $str14$_;
  private static final SubLString $str15$_xml;
  private static final SubLString $str16$short_ids_to_concepts_;
  private static final SubLString $str17$_tsv;
  private static final SubLString $str18$_cyc_projects_concept_search_stri;
  private static final SubLString $str19$_cyc_projects_concept_search_shor;
  private static final SubLSymbol $sym20$TRUE;
  private static final SubLString $str21$strings_to_short_ids_tsv;
  private static final SubLString $str22$short_ids_to_concepts_tsv;
  private static final SubLString $str23$Exceeded_desired_lexicon_size;
  private static final SubLSymbol $sym24$RELEVANT_MT_IS_GENL_MT;
  private static final SubLObject $const25$stopWordString;
  private static final SubLSymbol $kw26$GAF;
  private static final SubLSymbol $sym27$ADD_STOP_WORD;
  private static final SubLSymbol $sym28$GET;
  private static final SubLSymbol $kw29$STRING;
  private static final SubLSymbol $sym30$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str31$found__a_____a_in_the_lexicon;
  private static final SubLInteger $int32$100;
  private static final SubLString $str33$_;
  private static final SubLString $str34$error_when_writing_out_lexicon_fo;
  private static final SubLSymbol $sym35$GET_STOP_WORDS;
  private static final SubLSymbol $kw36$CYCL;
  private static final SubLSymbol $kw37$ENTRY_TYPE;
  private static final SubLSymbol $kw38$DENOT;
  private static final SubLSymbol $kw39$CASE_SENSITIVE;
  private static final SubLSymbol $kw40$OUTPUT;
  private static final SubLString $str41$Copying_files_from_temporary_loca;
  private static final SubLSymbol $kw42$ENTRY_STRENGTH;
  private static final SubLSymbol $kw43$CONTEXTDEPENDENT;
  private static final SubLSymbol $kw44$PRIMARY;
  private static final SubLSymbol $kw45$VANISHINGLY_RARE;
  private static final SubLString $str46$February;
  private static final SubLString $str47$adding__S___S;
  private static final SubLString $str48$_;
  private static final SubLString $str49$No_entries_added_for__S__;
  private static final SubLSymbol $kw50$APPEND;
  private static final SubLString $str51$Unable_to_open__S;
  private static final SubLString $str52$writing_strings_to_ids;
  private static final SubLString $str53$;
  private static final SubLString $str54$writing_ids_to_concepts;
  private static final SubLSymbol $kw55$SEMTRANS;
  private static final SubLString $str56$lexicon;
  private static final SubLSymbol $kw57$UNINITIALIZED;
  private static final SubLString $str58$Lexicon_Dump_XML_Clipper;
  private static final SubLString $str59$perl;
  private static final SubLString $str60$_p;
  private static final SubLString $str61$_i;
  private static final SubLString $str62$_e;
  private static final SubLString $str63$_s____;
  private static final SubLString $str64$____;
  private static final SubLString $str65$done_dumping___S__S__S;
  private static final SubLString $str66$mapping;
  private static final SubLString $str67$nlString;
  private static final SubLString $str68$caseSensitive;
  private static final SubLString $str69$t;
  private static final SubLString $str70$f;
  private static final SubLString $str71$entryType;
  private static final SubLString $str72$mappingStrength;
  private static final SubLString $str73$entry;
  private static final SubLList $list74;
  private static final SubLObject $const75$ContextuallyDependentLexicalMappi;
  private static final SubLSymbol $kw76$PRAGMATICS;
  private static final SubLSymbol $sym77$FIRST;
  private static final SubLObject $const78$VanishinglyRareLexicalMapping;
  private static final SubLObject $const79$PrimaryLexicalMapping;
  private static final SubLList $list80;
  private static final SubLString $str81$uri;
  private static final SubLString $str82$nat;
  private static final SubLString $str83$concept;
  private static final SubLSymbol $kw84$EXTERNAL_ID;
  private static final SubLString $str85$externalId;
  private static final SubLString $str86$id;
  private static final SubLSymbol $kw87$PREFERRED_NL;
  private static final SubLString $str88$preferredNl;
  private static final SubLList $list89;
  private static final SubLSymbol $kw90$PPH_LEXICAL_CONTEXT;
  private static final SubLObject $const91$TextPrismParaphraseMt;
  private static final SubLString $str92$cycl;
  private static final SubLList $list93;
  private static final SubLObject $const94$ThingDescribableAsFn;
  private static final SubLString $str95$_cyc_projects_concept_search_shor;
  private static final SubLString $str96$_cyc_projects_concept_search_shor;
  private static final SubLString $str97$reading_the_file___;
  private static final SubLSymbol $kw98$INPUT;
  private static final SubLList $list99;
  private static final SubLObject $const100$EverythingPSC;
  private static final SubLString $str101$g_;
  private static final SubLString $str102$i_;

  @SubLTranslatedFile.SubL(source = "cycl/nl/lexicon-dumping.lisp", position = 1609L)
  public static SubLObject get_dumping_lexicon()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == abstract_lexicon.abstract_lexicon_p( $dumping_lexicon$.getDynamicValue( thread ) ) )
    {
      $dumping_lexicon$.setDynamicValue( object.new_class_instance( $sym1$TERM_LEXICON ), thread );
      SubLObject cdolist_list_var = $lexicon_dump_excluded_predicates$.getDynamicValue( thread );
      SubLObject pred = NIL;
      pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        methods.funcall_instance_method_with_1_args( $dumping_lexicon$.getDynamicValue( thread ), $sym2$EXCLUDE_PREDICATE, pred );
        cdolist_list_var = cdolist_list_var.rest();
        pred = cdolist_list_var.first();
      }
      if( NIL != constant_handles.valid_constantP( $const3$EnglishDocumentTaggingLexicalMt, UNPROVIDED ) )
      {
        instances.set_slot( $dumping_lexicon$.getDynamicValue( thread ), $sym4$DEFAULT_BASE_MT, $const3$EnglishDocumentTaggingLexicalMt );
      }
      else
      {
        instances.set_slot( $dumping_lexicon$.getDynamicValue( thread ), $sym4$DEFAULT_BASE_MT, $const5$AllGeneralEnglishValidatedLexical );
      }
    }
    return $dumping_lexicon$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/lexicon-dumping.lisp", position = 2362L)
  public static SubLObject get_dumping_semtrans_lexicon()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == abstract_lexicon.abstract_lexicon_p( $dumping_semtrans_lexicon$.getDynamicValue( thread ) ) )
    {
      $dumping_semtrans_lexicon$.setDynamicValue( object.new_class_instance( $sym7$SEMTRANS_LEXICON ), thread );
      SubLObject cdolist_list_var = $lexicon_dump_excluded_predicates$.getDynamicValue( thread );
      SubLObject pred = NIL;
      pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        methods.funcall_instance_method_with_1_args( $dumping_semtrans_lexicon$.getDynamicValue( thread ), $sym2$EXCLUDE_PREDICATE, pred );
        cdolist_list_var = cdolist_list_var.rest();
        pred = cdolist_list_var.first();
      }
      cdolist_list_var = $semtrans_lexicon_dump_excluded_pos_list$.getDynamicValue( thread );
      SubLObject pos = NIL;
      pos = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        methods.funcall_instance_method_with_1_args( $dumping_semtrans_lexicon$.getDynamicValue( thread ), $sym8$EXCLUDE_POS, pos );
        cdolist_list_var = cdolist_list_var.rest();
        pos = cdolist_list_var.first();
      }
      if( NIL != constant_handles.valid_constantP( $const3$EnglishDocumentTaggingLexicalMt, UNPROVIDED ) )
      {
        instances.set_slot( $dumping_semtrans_lexicon$.getDynamicValue( thread ), $sym4$DEFAULT_BASE_MT, $const3$EnglishDocumentTaggingLexicalMt );
      }
      else
      {
        instances.set_slot( $dumping_semtrans_lexicon$.getDynamicValue( thread ), $sym4$DEFAULT_BASE_MT, $const5$AllGeneralEnglishValidatedLexical );
      }
    }
    return $dumping_lexicon$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/lexicon-dumping.lisp", position = 3073L)
  public static SubLObject dump_opencyc_lexicon(SubLObject output_path)
  {
    if( output_path == UNPROVIDED )
    {
      output_path = $str9$_cyc_projects_opencyc_tagging_lex;
    }
    return dump_and_link_lexicon( output_path, $sym10$FORT_HAS_EXPORTED_OWL_OPENCYC_CONTENT_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/lexicon-dumping.lisp", position = 6743L)
  public static SubLObject dump_full_lexicon(SubLObject output_path)
  {
    if( output_path == UNPROVIDED )
    {
      output_path = $str11$_cyc_projects_concept_search_;
    }
    return dump_and_link_lexicon( output_path, $sym12$FORT_SHOULD_BE_IN_LEXICON_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/lexicon-dumping.lisp", position = 6908L)
  public static SubLObject dump_and_link_lexicon(final SubLObject output_path, final SubLObject test_func)
  {
    final SubLObject timestamp_string = numeric_date_utilities.timestamp( UNPROVIDED, UNPROVIDED );
    final SubLObject prefix = Sequences.cconcatenate( output_path, $str13$strings_to_short_ids );
    final SubLObject strings_to_ids = Sequences.cconcatenate( prefix, new SubLObject[] { $str14$_, timestamp_string, $str15$_xml
    } );
    final SubLObject strings_to_ids_link = Sequences.cconcatenate( prefix, $str15$_xml );
    final SubLObject ids_to_concepts = Sequences.cconcatenate( output_path, new SubLObject[] { $str16$short_ids_to_concepts_, timestamp_string, $str17$_tsv
    } );
    final SubLObject output_files = dump_xml_lexicon( strings_to_ids, ids_to_concepts, test_func, NIL );
    file_utilities.delete_file_via_os( strings_to_ids_link );
    file_utilities.create_symbolic_link( strings_to_ids_link, strings_to_ids );
    return output_files;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/lexicon-dumping.lisp", position = 7508L)
  public static SubLObject fort_should_be_in_lexiconP(final SubLObject fort)
  {
    return makeBoolean( NIL == hlmt.hlmtP( fort ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/lexicon-dumping.lisp", position = 7588L)
  public static SubLObject dump_xml_lexicon(SubLObject strings_to_ids, SubLObject ids_to_concepts, SubLObject test_func, SubLObject include_stop_wordsP)
  {
    if( strings_to_ids == UNPROVIDED )
    {
      strings_to_ids = $str18$_cyc_projects_concept_search_stri;
    }
    if( ids_to_concepts == UNPROVIDED )
    {
      ids_to_concepts = $str19$_cyc_projects_concept_search_shor;
    }
    if( test_func == UNPROVIDED )
    {
      test_func = $sym20$TRUE;
    }
    if( include_stop_wordsP == UNPROVIDED )
    {
      include_stop_wordsP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject tmp_strings_to_ids = Sequences.cconcatenate( file_utilities.temp_directory(), $str21$strings_to_short_ids_tsv );
    final SubLObject tmp_ids_to_concepts = Sequences.cconcatenate( file_utilities.temp_directory(), $str22$short_ids_to_concepts_tsv );
    final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding( thread );
    try
    {
      print_high.$print_pretty$.bind( NIL, thread );
      final SubLObject denot_lex = get_dumping_lexicon();
      SubLObject count = ZERO_INTEGER;
      final SubLObject limit = Numbers.$most_positive_fixnum$.getGlobalValue();
      final SubLObject string_to_concepts = dictionary.new_dictionary( EQUAL, UNPROVIDED );
      final SubLObject over_limit_msg = $str23$Exceeded_desired_lexicon_size;
      SubLObject msg = NIL;
      final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym24$RELEVANT_MT_IS_GENL_MT, thread );
        mt_relevance_macros.$mt$.bind( $const3$EnglishDocumentTaggingLexicalMt, thread );
        final SubLObject pred_var = $const25$stopWordString;
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
        {
          final SubLObject str = NIL;
          final SubLObject _prev_bind_0_$2 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_1_$3 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
          final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
          final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
          final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
          final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
          final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
          try
          {
            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
            utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$is_noting_progressP$.bind( T, thread );
            utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
            utilities_macros.noting_progress_preamble( str );
            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                utilities_macros.note_progress();
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw26$GAF, NIL, NIL );
                  SubLObject done_var_$4 = NIL;
                  final SubLObject token_var_$5 = NIL;
                  while ( NIL == done_var_$4)
                  {
                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$5 );
                    final SubLObject valid_$6 = makeBoolean( !token_var_$5.eql( ass ) );
                    if( NIL != valid_$6 )
                    {
                      methods.funcall_instance_method_with_1_args( denot_lex, $sym27$ADD_STOP_WORD, cycl_utilities.formula_arg1( ass, UNPROVIDED ) );
                    }
                    done_var_$4 = makeBoolean( NIL == valid_$6 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
            utilities_macros.noting_progress_postamble();
          }
          finally
          {
            utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
            utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
            utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
            utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$3, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$2, thread );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$1, thread );
      }
      SubLObject cdolist_list_var = ConsesLow.list( denot_lex );
      SubLObject lex = NIL;
      lex = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject iterator = abstract_lexicon.new_lexicon_iterator( lex );
        while ( NIL == iteration.iteration_done( iterator ))
        {
          final SubLObject entry = iteration.iteration_next( iterator );
          final SubLObject string = methods.funcall_instance_method_with_1_args( entry, $sym28$GET, $kw29$STRING );
          try
          {
            thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
            final SubLObject _prev_bind_0_$4 = Errors.$error_handler$.currentBinding( thread );
            try
            {
              Errors.$error_handler$.bind( $sym30$CATCH_ERROR_MESSAGE_HANDLER, thread );
              try
              {
                if( string.isString() )
                {
                  count = Numbers.add( count, add_entry_to_dictionary( entry, lex, string_to_concepts, test_func ) );
                }
                else
                {
                  Errors.warn( $str31$found__a_____a_in_the_lexicon, string, entry );
                }
                if( count.numGE( limit ) )
                {
                  Errors.error( over_limit_msg );
                }
                if( ZERO_INTEGER.numE( Numbers.mod( count, $int32$100 ) ) )
                {
                  print_high.princ( $str33$_, T );
                  streams_high.force_output( UNPROVIDED );
                }
              }
              catch( final Throwable catch_var )
              {
                Errors.handleThrowable( catch_var, NIL );
              }
            }
            finally
            {
              Errors.$error_handler$.rebind( _prev_bind_0_$4, thread );
            }
          }
          catch( final Throwable ccatch_env_var )
          {
            msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          }
          finally
          {
            thread.throwStack.pop();
          }
          if( NIL != msg && !msg.equal( over_limit_msg ) )
          {
            Errors.warn( $str34$error_when_writing_out_lexicon_fo, string, msg );
            msg = NIL;
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        lex = cdolist_list_var.first();
      }
      if( NIL != include_stop_wordsP )
      {
        final SubLObject set_var = methods.funcall_instance_method_with_0_args( denot_lex, $sym35$GET_STOP_WORDS );
        final SubLObject set_contents_var = set.do_set_internal( set_var );
        SubLObject basis_object;
        SubLObject state;
        SubLObject stop_word;
        for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
            .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
        {
          stop_word = set_contents.do_set_contents_next( basis_object, state );
          if( NIL != set_contents.do_set_contents_element_validP( state, stop_word ) )
          {
            dictionary_utilities.dictionary_pushnew( string_to_concepts, stop_word, ConsesLow.list( $kw36$CYCL, $const25$stopWordString, $kw37$ENTRY_TYPE, $kw38$DENOT, $kw39$CASE_SENSITIVE, NIL ), EQUAL, UNPROVIDED );
          }
        }
      }
      dump_xml_string_to_concepts_dict( string_to_concepts, tmp_strings_to_ids, tmp_ids_to_concepts, $kw40$OUTPUT, UNPROVIDED );
      PrintLow.format( T, $str41$Copying_files_from_temporary_loca );
      if( NIL != Filesys.probe_file( strings_to_ids ) )
      {
        Filesys.copy_file( strings_to_ids, Sequences.cconcatenate( strings_to_ids, numeric_date_utilities.universal_timestring( Filesys.file_write_date( strings_to_ids ) ) ) );
      }
      if( NIL != Filesys.probe_file( ids_to_concepts ) )
      {
        Filesys.copy_file( ids_to_concepts, Sequences.cconcatenate( ids_to_concepts, numeric_date_utilities.universal_timestring( Filesys.file_write_date( ids_to_concepts ) ) ) );
      }
      Filesys.copy_file( tmp_strings_to_ids, strings_to_ids );
      Filesys.copy_file( tmp_ids_to_concepts, ids_to_concepts );
    }
    finally
    {
      print_high.$print_pretty$.rebind( _prev_bind_0, thread );
    }
    return ConsesLow.list( strings_to_ids, ids_to_concepts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/lexicon-dumping.lisp", position = 9972L)
  public static SubLObject add_entry_to_dictionary(final SubLObject entry, final SubLObject lexicon, final SubLObject string_to_concepts, final SubLObject test_func)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject entry_count = ZERO_INTEGER;
    final SubLObject string = methods.funcall_instance_method_with_1_args( entry, $sym28$GET, $kw29$STRING );
    if( NIL == lexicon_accessors.closed_lexical_class_stringP( methods.funcall_instance_method_with_1_args( entry, $sym28$GET, $kw29$STRING ), UNPROVIDED ) && NIL == thing_describable_as_lex_p( entry ) )
    {
      final SubLObject case_sensitiveP = lexicon_accessors.closed_lexical_class_stringP( string, UNPROVIDED );
      thread.resetMultipleValues();
      final SubLObject cycl = get_dumping_entry_cycl( entry, lexicon );
      final SubLObject entry_type = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != Functions.funcall( test_func, cycl ) )
      {
        SubLObject entry_info = ConsesLow.list( $kw36$CYCL, cycl, $kw37$ENTRY_TYPE, entry_type, $kw39$CASE_SENSITIVE, case_sensitiveP );
        if( NIL != contextually_dependent_entryP( entry ) )
        {
          entry_info = conses_high.putf( entry_info, $kw42$ENTRY_STRENGTH, $kw43$CONTEXTDEPENDENT );
        }
        else if( NIL != primary_entryP( entry ) )
        {
          entry_info = conses_high.putf( entry_info, $kw42$ENTRY_STRENGTH, $kw44$PRIMARY );
        }
        else if( NIL != vanishingly_rare_entryP( entry ) )
        {
          entry_info = conses_high.putf( entry_info, $kw42$ENTRY_STRENGTH, $kw45$VANISHINGLY_RARE );
        }
        if( string.equalp( $str46$February ) )
        {
          PrintLow.format( T, $str47$adding__S___S, string, entry_info );
        }
        dictionary_utilities.dictionary_pushnew( string_to_concepts, string, entry_info, EQUAL, UNPROVIDED );
        entry_count = Numbers.add( entry_count, ONE_INTEGER );
        if( NIL != list_utilities.lengthG( string_utilities.search_all( $str48$_, string, UNPROVIDED, UNPROVIDED ), ONE_INTEGER, UNPROVIDED ) )
        {
          final SubLObject capitalized = string_utilities.capitalize_smart( string );
          if( NIL == methods.funcall_instance_method_with_1_args( lexicon, $sym28$GET, capitalized ) )
          {
            dictionary_utilities.dictionary_pushnew( string_to_concepts, string_utilities.capitalize_smart( string ), entry_info, EQUAL, UNPROVIDED );
            entry_count = Numbers.add( entry_count, ONE_INTEGER );
          }
        }
      }
    }
    if( entry_count.numE( ZERO_INTEGER ) )
    {
      PrintLow.format( T, $str49$No_entries_added_for__S__, string );
    }
    return entry_count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/lexicon-dumping.lisp", position = 11487L)
  public static SubLObject dump_string_to_concepts_dict(final SubLObject string_to_concepts, final SubLObject file, final SubLObject id_file, SubLObject direction, SubLObject concepts_to_ids)
  {
    if( direction == UNPROVIDED )
    {
      direction = $kw50$APPEND;
    }
    if( concepts_to_ids == UNPROVIDED )
    {
      concepts_to_ids = dictionary.new_dictionary( EQUAL, UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject newline_string = Strings.make_string( ONE_INTEGER, Characters.CHAR_newline );
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( file, direction );
      if( !stream.isStream() )
      {
        Errors.error( $str51$Unable_to_open__S, file );
      }
      final SubLObject s = stream;
      SubLObject so_far = ZERO_INTEGER;
      final SubLObject total = dictionary.dictionary_length( string_to_concepts );
      final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( $str52$writing_strings_to_ids );
          SubLObject iteration_state;
          for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( string_to_concepts ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
              iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
          {
            thread.resetMultipleValues();
            final SubLObject string = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
            final SubLObject concepts = thread.secondMultipleValue();
            thread.resetMultipleValues();
            print_high.princ( string_utilities.string_subst( $str53$, newline_string, string, UNPROVIDED ), s );
            print_high.princ( Characters.CHAR_tab, s );
            final SubLObject require_case_sensitivityP = lexicon_accessors.closed_lexical_class_stringP( string, UNPROVIDED );
            print_high.princ( require_case_sensitivityP, s );
            SubLObject cdolist_list_var = concepts;
            SubLObject concept = NIL;
            concept = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              SubLObject hl_id = dictionary.dictionary_lookup( concepts_to_ids, concept, UNPROVIDED );
              if( NIL == hl_id )
              {
                hl_id = kb_utilities.compact_hl_external_id_string( concept );
                dictionary.dictionary_enter( concepts_to_ids, concept, kb_utilities.compact_hl_external_id_string( concept ) );
              }
              print_high.princ( Characters.CHAR_tab, s );
              print_high.princ( dictionary.dictionary_lookup( concepts_to_ids, concept, UNPROVIDED ), s );
              cdolist_list_var = cdolist_list_var.rest();
              concept = cdolist_list_var.first();
            }
            streams_high.terpri( s );
            so_far = Numbers.add( so_far, ONE_INTEGER );
            utilities_macros.note_percent_progress( so_far, total );
          }
          dictionary_contents.do_dictionary_contents_finalize( iteration_state );
        }
        finally
        {
          final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$9, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_5, thread );
      }
    }
    SubLObject stream_$10 = NIL;
    try
    {
      stream_$10 = compatibility.open_text( id_file, direction );
      if( !stream_$10.isStream() )
      {
        Errors.error( $str51$Unable_to_open__S, id_file );
      }
      final SubLObject s2 = stream_$10;
      SubLObject so_far2 = ZERO_INTEGER;
      final SubLObject total2 = dictionary.dictionary_length( concepts_to_ids );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_9 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( $str54$writing_ids_to_concepts );
          SubLObject iteration_state2;
          for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( concepts_to_ids ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
              iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
          {
            thread.resetMultipleValues();
            final SubLObject concept2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
            final SubLObject id = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL == forts.fort_p( concept2 ) )
            {
              print_high.princ( id, s2 );
              print_high.princ( Characters.CHAR_tab, s2 );
              print_high.princ( string_utilities.to_string( concept2 ), s2 );
              streams_high.terpri( s2 );
            }
            so_far2 = Numbers.add( so_far2, ONE_INTEGER );
            utilities_macros.note_percent_progress( so_far2, total2 );
          }
          dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
        }
        finally
        {
          final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values3 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values3 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_9, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_8, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_6, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values4 = Values.getValuesAsVector();
        if( stream_$10.isStream() )
        {
          streams_high.close( stream_$10, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values4 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_10, thread );
      }
    }
    return Values.values( file, id_file );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/lexicon-dumping.lisp", position = 12668L)
  public static SubLObject get_dumping_entry_cycl(final SubLObject entry, final SubLObject lexicon)
  {
    if( NIL != term_lexicon.term_lexicon_p( lexicon ) )
    {
      return Values.values( narts_high.nart_substitute( methods.funcall_instance_method_with_1_args( entry, $sym28$GET, $kw38$DENOT ) ), $kw38$DENOT );
    }
    if( NIL != semtrans_lexicon.semtrans_lexicon_p( lexicon ) )
    {
      return Values.values( narts_high.nart_substitute( methods.funcall_instance_method_with_1_args( entry, $sym28$GET, $kw55$SEMTRANS ) ), $kw55$SEMTRANS );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/lexicon-dumping.lisp", position = 12977L)
  public static SubLObject dump_xml_string_to_concepts_dict(final SubLObject string_to_concepts, final SubLObject file, final SubLObject id_file, SubLObject direction, SubLObject concepts_to_ids)
  {
    if( direction == UNPROVIDED )
    {
      direction = $kw50$APPEND;
    }
    if( concepts_to_ids == UNPROVIDED )
    {
      concepts_to_ids = dictionary.new_dictionary( EQUAL, UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject lexicon_tag = $str56$lexicon;
    final SubLObject already_memory_mapped = nl_generation_fort_cache.nl_generation_cache_memory_mappedP();
    try
    {
      nl_generation_fort_cache.enable_nl_generation_cache_memory_mapping();
      if( direction == $kw40$OUTPUT )
      {
        SubLObject stream = NIL;
        try
        {
          stream = compatibility.open_text( file, direction );
          if( !stream.isStream() )
          {
            Errors.error( $str51$Unable_to_open__S, file );
          }
          SubLObject s = stream;
          s = file_utilities.change_file_stream_buffer_size( s, file_utilities.$default_big_stream_buffer_size$.getDynamicValue( thread ) );
          final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
          try
          {
            xml_vars.$xml_stream$.bind( s, thread );
            try
            {
              final SubLObject _prev_bind_0_$12 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( lexicon_tag, NIL, NIL, NIL, $kw57$UNINITIALIZED );
                final SubLObject _prev_bind_0_$13 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw57$UNINITIALIZED, thread );
                  SubLObject so_far = ZERO_INTEGER;
                  final SubLObject total = dictionary.dictionary_length( string_to_concepts );
                  final SubLObject _prev_bind_0_$14 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$15 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
                  final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
                  final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
                  try
                  {
                    utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
                    utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
                    utilities_macros.$within_noting_percent_progress$.bind( T, thread );
                    utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
                    try
                    {
                      utilities_macros.noting_percent_progress_preamble( $str52$writing_strings_to_ids );
                      SubLObject iteration_state;
                      for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( string_to_concepts ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                          iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                      {
                        thread.resetMultipleValues();
                        final SubLObject string = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                        final SubLObject concepts = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        xml_dump_lexicon_string_row( string, concepts, xml_vars.$xml_stream$.getDynamicValue( thread ), concepts_to_ids );
                        so_far = Numbers.add( so_far, ONE_INTEGER );
                        utilities_macros.note_percent_progress( so_far, total );
                      }
                      dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector( _values );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$15, thread );
                      }
                    }
                  }
                  finally
                  {
                    utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
                    utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
                    utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$15, thread );
                    utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$14, thread );
                  }
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$13, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$12, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( lexicon_tag );
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$16, thread );
              }
            }
            streams_high.force_output( s );
          }
          finally
          {
            xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values3 = Values.getValuesAsVector();
            if( stream.isStream() )
            {
              streams_high.close( stream, UNPROVIDED );
            }
            Values.restoreValuesFromVector( _values3 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_5, thread );
          }
        }
      }
      else
      {
        os_process_utilities.wait_until_os_process_finished( os_process_utilities.make_os_process( $str58$Lexicon_Dump_XML_Clipper, $str59$perl, ConsesLow.list( $str60$_p, $str61$_i, $str62$_e, Sequences.cconcatenate(
            $str63$_s____, new SubLObject[]
            { format_nil.format_nil_a_no_copy( lexicon_tag ), $str64$____
            } ), file ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        SubLObject stream = NIL;
        try
        {
          final SubLObject _prev_bind_6 = stream_macros.$stream_requires_locking$.currentBinding( thread );
          try
          {
            stream_macros.$stream_requires_locking$.bind( NIL, thread );
            stream = compatibility.open_text( file, direction );
          }
          finally
          {
            stream_macros.$stream_requires_locking$.rebind( _prev_bind_6, thread );
          }
          if( !stream.isStream() )
          {
            Errors.error( $str51$Unable_to_open__S, file );
          }
          final SubLObject s = stream;
          final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
          try
          {
            xml_vars.$xml_stream$.bind( s, thread );
            SubLObject so_far2 = ZERO_INTEGER;
            final SubLObject total2 = dictionary.dictionary_length( string_to_concepts );
            final SubLObject _prev_bind_0_$17 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
            final SubLObject _prev_bind_7 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
            final SubLObject _prev_bind_8 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
            final SubLObject _prev_bind_9 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
            try
            {
              utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
              utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
              utilities_macros.$within_noting_percent_progress$.bind( T, thread );
              utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
              try
              {
                utilities_macros.noting_percent_progress_preamble( $str52$writing_strings_to_ids );
                SubLObject iteration_state2;
                for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( string_to_concepts ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                    iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                {
                  thread.resetMultipleValues();
                  final SubLObject string2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                  final SubLObject concepts2 = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  xml_dump_lexicon_string_row( string2, concepts2, xml_vars.$xml_stream$.getDynamicValue( thread ), concepts_to_ids );
                  so_far2 = Numbers.add( so_far2, ONE_INTEGER );
                  utilities_macros.note_percent_progress( so_far2, total2 );
                }
                dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
              }
              finally
              {
                final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values4 = Values.getValuesAsVector();
                  utilities_macros.noting_percent_progress_postamble();
                  Values.restoreValuesFromVector( _values4 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$18, thread );
                }
              }
            }
            finally
            {
              utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_9, thread );
              utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_8, thread );
              utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_7, thread );
              utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$17, thread );
            }
            xml_utilities.xml_end_tag_internal( $str56$lexicon );
            streams_high.force_output( s );
          }
          finally
          {
            xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values5 = Values.getValuesAsVector();
            if( stream.isStream() )
            {
              streams_high.close( stream, UNPROVIDED );
            }
            Values.restoreValuesFromVector( _values5 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_10, thread );
          }
        }
      }
      SubLObject stream = NIL;
      try
      {
        stream = compatibility.open_text( id_file, direction );
        if( !stream.isStream() )
        {
          Errors.error( $str51$Unable_to_open__S, id_file );
        }
        SubLObject s = stream;
        s = file_utilities.change_file_stream_buffer_size( s, file_utilities.$default_big_stream_buffer_size$.getDynamicValue( thread ) );
        SubLObject so_far3 = ZERO_INTEGER;
        final SubLObject total3 = dictionary.dictionary_length( concepts_to_ids );
        final SubLObject _prev_bind_11 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
        final SubLObject _prev_bind_12 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
        final SubLObject _prev_bind_13 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
        final SubLObject _prev_bind_14 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
        try
        {
          utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
          utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
          utilities_macros.$within_noting_percent_progress$.bind( T, thread );
          utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
          try
          {
            utilities_macros.noting_percent_progress_preamble( $str54$writing_ids_to_concepts );
            SubLObject iteration_state3;
            for( iteration_state3 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( concepts_to_ids ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                iteration_state3 ); iteration_state3 = dictionary_contents.do_dictionary_contents_next( iteration_state3 ) )
            {
              thread.resetMultipleValues();
              final SubLObject concept = dictionary_contents.do_dictionary_contents_key_value( iteration_state3 );
              final SubLObject id = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if( NIL != forts.fort_p( concept ) )
              {
                print_high.princ( id, s );
                print_high.princ( Characters.CHAR_tab, s );
                print_high.princ( string_utilities.to_string( concept ), s );
                streams_high.terpri( s );
              }
              so_far3 = Numbers.add( so_far3, ONE_INTEGER );
              utilities_macros.note_percent_progress( so_far3, total3 );
            }
            dictionary_contents.do_dictionary_contents_finalize( iteration_state3 );
          }
          finally
          {
            final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values6 = Values.getValuesAsVector();
              utilities_macros.noting_percent_progress_postamble();
              Values.restoreValuesFromVector( _values6 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$19, thread );
            }
          }
        }
        finally
        {
          utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_14, thread );
          utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_13, thread );
          utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_12, thread );
          utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_11, thread );
        }
        streams_high.force_output( s );
      }
      finally
      {
        final SubLObject _prev_bind_15 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values7 = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values7 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_15, thread );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_16 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values8 = Values.getValuesAsVector();
        if( NIL == already_memory_mapped )
        {
          nl_generation_fort_cache.disable_nl_generation_cache_memory_mapping();
        }
        Values.restoreValuesFromVector( _values8 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_16, thread );
      }
    }
    Errors.warn( $str65$done_dumping___S__S__S, string_to_concepts, file, id_file );
    return Values.values( file, id_file );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/lexicon-dumping.lisp", position = 14711L)
  public static SubLObject dump_lexicon_string_row(final SubLObject string, final SubLObject concepts, final SubLObject stream, SubLObject concepts_to_ids_dict)
  {
    if( concepts_to_ids_dict == UNPROVIDED )
    {
      concepts_to_ids_dict = NIL;
    }
    print_high.princ( string_utilities.string_subst( $str53$, Strings.make_string( ONE_INTEGER, Characters.CHAR_newline ), string, UNPROVIDED ), stream );
    print_high.princ( Characters.CHAR_tab, stream );
    final SubLObject require_case_sensitivityP = lexicon_accessors.closed_lexical_class_stringP( string, UNPROVIDED );
    print_high.princ( require_case_sensitivityP, stream );
    SubLObject cdolist_list_var = concepts;
    SubLObject concept = NIL;
    concept = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject hl_id = dictionary.dictionary_lookup( concepts_to_ids_dict, concept, UNPROVIDED );
      if( NIL == hl_id && NIL != dictionary.dictionary_p( concepts_to_ids_dict ) )
      {
        hl_id = kb_utilities.compact_hl_external_id_string( concept );
        dictionary.dictionary_enter( concepts_to_ids_dict, concept, kb_utilities.compact_hl_external_id_string( concept ) );
      }
      print_high.princ( Characters.CHAR_tab, stream );
      print_high.princ( dictionary.dictionary_lookup( concepts_to_ids_dict, concept, UNPROVIDED ), stream );
      cdolist_list_var = cdolist_list_var.rest();
      concept = cdolist_list_var.first();
    }
    streams_high.terpri( stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/lexicon-dumping.lisp", position = 15473L)
  public static SubLObject xml_dump_lexicon_string_row(final SubLObject string, final SubLObject concepts, final SubLObject stream, SubLObject concepts_to_ids_dict)
  {
    if( concepts_to_ids_dict == UNPROVIDED )
    {
      concepts_to_ids_dict = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str66$mapping, NIL, NIL, NIL, $kw57$UNINITIALIZED );
        final SubLObject _prev_bind_0_$21 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( $kw57$UNINITIALIZED, thread );
          try
          {
            final SubLObject _prev_bind_0_$22 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$23 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str67$nlString, NIL, NIL, NIL, $kw57$UNINITIALIZED );
              final SubLObject _prev_bind_0_$23 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw57$UNINITIALIZED, thread );
                xml_utilities.xml_cdata( string );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$23, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$23, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$22, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              xml_utilities.xml_end_tag_internal( $str67$nlString );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$24, thread );
            }
          }
          final SubLObject require_case_sensitivityP = lexicon_accessors.closed_lexical_class_stringP( string, UNPROVIDED );
          SubLObject cdolist_list_var = concepts;
          SubLObject concept = NIL;
          concept = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            SubLObject attr_list = ConsesLow.list( $str68$caseSensitive, ( NIL != require_case_sensitivityP ) ? $str69$t : $str70$f, $str71$entryType, Strings.string_downcase( print_high.princ_to_string( conses_high
                .getf( concept, $kw37$ENTRY_TYPE, UNPROVIDED ) ), UNPROVIDED, UNPROVIDED ) );
            if( NIL != conses_high.getf( concept, $kw42$ENTRY_STRENGTH, UNPROVIDED ) )
            {
              SubLObject new_cons = ConsesLow.cons( $str72$mappingStrength, NIL );
              SubLObject list = attr_list;
              if( NIL != list )
              {
                subl_macros.rplacd_last( list, new_cons );
              }
              else
              {
                attr_list = new_cons;
              }
              new_cons = ConsesLow.cons( Strings.string_downcase( print_high.princ_to_string( conses_high.getf( concept, $kw42$ENTRY_STRENGTH, UNPROVIDED ) ), UNPROVIDED, UNPROVIDED ), NIL );
              list = attr_list;
              if( NIL != list )
              {
                subl_macros.rplacd_last( list, new_cons );
              }
              else
              {
                attr_list = new_cons;
              }
            }
            try
            {
              final SubLObject _prev_bind_0_$25 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$24 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str73$entry, attr_list, NIL, NIL, $kw57$UNINITIALIZED );
                final SubLObject _prev_bind_0_$26 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw57$UNINITIALIZED, thread );
                  xml_utilities.xml_terpri();
                  xml_output_concept( conses_high.getf( concept, $kw36$CYCL, UNPROVIDED ), $list74 );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$26, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$24, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$25, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str73$entry );
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$27, thread );
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            concept = cdolist_list_var.first();
          }
        }
        finally
        {
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$21, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values3 = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str66$mapping );
        Values.restoreValuesFromVector( _values3 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    xml_utilities.xml_terpri();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/lexicon-dumping.lisp", position = 16455L)
  public static SubLObject contextually_dependent_entryP(final SubLObject entry)
  {
    return list_utilities.sublisp_boolean( Sequences.find( $const75$ContextuallyDependentLexicalMappi, methods.funcall_instance_method_with_1_args( entry, $sym28$GET, $kw76$PRAGMATICS ), EQ, $sym77$FIRST, UNPROVIDED,
        UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/lexicon-dumping.lisp", position = 16615L)
  public static SubLObject vanishingly_rare_entryP(final SubLObject entry)
  {
    return list_utilities.sublisp_boolean( Sequences.find( $const78$VanishinglyRareLexicalMapping, methods.funcall_instance_method_with_1_args( entry, $sym28$GET, $kw76$PRAGMATICS ), EQ, $sym77$FIRST, UNPROVIDED,
        UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/lexicon-dumping.lisp", position = 16762L)
  public static SubLObject primary_entryP(final SubLObject entry)
  {
    return list_utilities.sublisp_boolean( Sequences.find( $const79$PrimaryLexicalMapping, methods.funcall_instance_method_with_1_args( entry, $sym28$GET, $kw76$PRAGMATICS ), EQ, $sym77$FIRST, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/lexicon-dumping.lisp", position = 16892L)
  public static SubLObject xml_output_concept(final SubLObject concept, SubLObject optional_elts)
  {
    if( optional_elts == UNPROVIDED )
    {
      optional_elts = $list80;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject props = ConsesLow.list( $str81$uri, ( NIL != forts.fort_p( concept ) ) ? owl_cycl_to_xml.owl_opencyc_latest_uri_for_fort( concept ) : $str82$nat );
    final SubLObject hl_id = kb_utilities.compact_hl_external_id_string( concept );
    try
    {
      final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
      final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
      try
      {
        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
        xml_utilities.xml_start_tag_internal( $str83$concept, props, NIL, NIL, $kw57$UNINITIALIZED );
        final SubLObject _prev_bind_0_$30 = xml_vars.$xml_default_namespace$.currentBinding( thread );
        try
        {
          xml_vars.$xml_default_namespace$.bind( $kw57$UNINITIALIZED, thread );
          if( NIL != subl_promotions.memberP( $kw84$EXTERNAL_ID, optional_elts, UNPROVIDED, UNPROVIDED ) )
          {
            xml_utilities.xml_terpri();
            final SubLObject _prev_bind_0_$31 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_1_$32 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str85$externalId, ConsesLow.list( $str86$id, hl_id ), T, NIL, $kw57$UNINITIALIZED );
              final SubLObject _prev_bind_0_$32 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw57$UNINITIALIZED, thread );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$32, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$32, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$31, thread );
            }
          }
          if( NIL != subl_promotions.memberP( $kw87$PREFERRED_NL, optional_elts, UNPROVIDED, UNPROVIDED ) )
          {
            xml_utilities.xml_terpri();
            try
            {
              final SubLObject _prev_bind_0_$33 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$33 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str88$preferredNl, $list89, NIL, NIL, $kw57$UNINITIALIZED );
                final SubLObject _prev_bind_0_$34 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw57$UNINITIALIZED, thread );
                  final SubLObject params = nl_generation_api.new_pph_parameters( ConsesLow.list( $kw90$PPH_LEXICAL_CONTEXT, $const91$TextPrismParaphraseMt ) );
                  xml_utilities.xml_cdata( nl_generation_api.cycl_term_to_nl_string_internal( concept, params ).first() );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$34, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$33, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$33, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                xml_utilities.xml_end_tag_internal( $str88$preferredNl );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$35, thread );
              }
            }
          }
          if( NIL != subl_promotions.memberP( $kw36$CYCL, optional_elts, UNPROVIDED, UNPROVIDED ) )
          {
            xml_utilities.xml_terpri();
            try
            {
              final SubLObject _prev_bind_0_$36 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$34 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str92$cycl, $list93, NIL, NIL, $kw57$UNINITIALIZED );
                final SubLObject _prev_bind_0_$37 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw57$UNINITIALIZED, thread );
                  xml_utilities.xml_print( cycl_utilities.denotational_term_name( concept ), UNPROVIDED );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$37, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$34, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$36, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                xml_utilities.xml_end_tag_internal( $str92$cycl );
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$38, thread );
              }
            }
          }
        }
        finally
        {
          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$30, thread );
        }
      }
      finally
      {
        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values3 = Values.getValuesAsVector();
        xml_utilities.xml_terpri();
        xml_utilities.xml_end_tag_internal( $str83$concept );
        Values.restoreValuesFromVector( _values3 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/lexicon-dumping.lisp", position = 17872L)
  public static SubLObject thing_describable_as_lex_p(final SubLObject lex)
  {
    return Equality.eql( cycl_utilities.formula_operator( methods.funcall_instance_method_with_1_args( lex, $sym28$GET, $kw38$DENOT ) ), $const94$ThingDescribableAsFn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/lexicon-dumping.lisp", position = 18933L)
  public static SubLObject dump_isa_genls(SubLObject input_file, SubLObject output_file)
  {
    if( input_file == UNPROVIDED )
    {
      input_file = $str95$_cyc_projects_concept_search_shor;
    }
    if( output_file == UNPROVIDED )
    {
      output_file = $str96$_cyc_projects_concept_search_shor;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( output_file, $kw40$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str51$Unable_to_open__S, output_file );
      }
      final SubLObject s = stream;
      final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
      final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
      final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
      final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( $str97$reading_the_file___ );
          final SubLObject file_var = input_file;
          SubLObject stream_$42 = NIL;
          try
          {
            final SubLObject _prev_bind_0_$43 = stream_macros.$stream_requires_locking$.currentBinding( thread );
            try
            {
              stream_macros.$stream_requires_locking$.bind( NIL, thread );
              stream_$42 = compatibility.open_text( file_var, $kw98$INPUT );
            }
            finally
            {
              stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$43, thread );
            }
            if( !stream_$42.isStream() )
            {
              Errors.error( $str51$Unable_to_open__S, file_var );
            }
            final SubLObject stream_var = stream_$42;
            if( stream_var.isStream() )
            {
              final SubLObject length_var = streams_high.file_length( stream_var );
              final SubLObject stream_var_$44 = stream_var;
              SubLObject line_number_var = NIL;
              SubLObject line = NIL;
              line_number_var = ZERO_INTEGER;
              for( line = file_utilities.do_stream_lines_get_next_line( stream_var_$44 ); NIL != line; line = file_utilities.do_stream_lines_get_next_line( stream_var_$44 ) )
              {
                final SubLObject term_id = Strings.string_trim( $list99, string_utilities.string_tokenize( line, ConsesLow.list( Characters.CHAR_tab ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED )
                    .first() );
                final SubLObject cycl_term = kb_utilities.find_object_by_compact_hl_external_id_string( term_id );
                write_one_complete_fort_record_compactly( cycl_term, s, $const100$EverythingPSC, term_id );
                utilities_macros.note_percent_progress( streams_high.file_position( stream_var, UNPROVIDED ), length_var );
                line_number_var = number_utilities.f_1X( line_number_var );
              }
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              if( stream_$42.isStream() )
              {
                streams_high.close( stream_$42, UNPROVIDED );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$44, thread );
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$45, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_4, thread );
        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_3, thread );
        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_2, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values3 = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values3 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_9, thread );
      }
    }
    return output_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/lexicon-dumping.lisp", position = 19840L)
  public static SubLObject write_one_complete_fort_record_compactly(final SubLObject cycl_term, SubLObject stream, SubLObject mt, SubLObject term_id)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    if( mt == UNPROVIDED )
    {
      mt = $const100$EverythingPSC;
    }
    if( term_id == UNPROVIDED )
    {
      term_id = kb_utilities.compact_hl_external_id_string( cycl_term );
    }
    final SubLObject all_genls = ( NIL != forts.fort_p( cycl_term ) ) ? genls.all_genls( cycl_term, mt, UNPROVIDED ) : NIL;
    final SubLObject all_isa = ( NIL != forts.fort_p( cycl_term ) ) ? isa.all_isa( cycl_term, mt, UNPROVIDED ) : NIL;
    final SubLObject string_for_term = term_id;
    print_high.princ( string_for_term, stream );
    SubLObject cdolist_list_var = all_genls;
    SubLObject genl = NIL;
    genl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      write_one_fort_compactly( genl, $str101$g_, stream );
      cdolist_list_var = cdolist_list_var.rest();
      genl = cdolist_list_var.first();
    }
    cdolist_list_var = all_isa;
    SubLObject v_isa = NIL;
    v_isa = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      write_one_fort_compactly( v_isa, $str102$i_, stream );
      cdolist_list_var = cdolist_list_var.rest();
      v_isa = cdolist_list_var.first();
    }
    streams_high.terpri( stream );
    return cycl_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl/lexicon-dumping.lisp", position = 20540L)
  public static SubLObject write_one_fort_compactly(final SubLObject fort, final SubLObject link_indicator, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    print_high.princ( $lexicon_file_record_separator$.getGlobalValue(), stream );
    print_high.princ( link_indicator, stream );
    print_high.princ( kb_utilities.compact_hl_external_id_string( fort ), stream );
    return fort;
  }

  public static SubLObject declare_lexicon_dumping_file()
  {
    SubLFiles.declareFunction( me, "get_dumping_lexicon", "GET-DUMPING-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "get_dumping_semtrans_lexicon", "GET-DUMPING-SEMTRANS-LEXICON", 0, 0, false );
    SubLFiles.declareFunction( me, "dump_opencyc_lexicon", "DUMP-OPENCYC-LEXICON", 0, 1, false );
    SubLFiles.declareFunction( me, "dump_full_lexicon", "DUMP-FULL-LEXICON", 0, 1, false );
    SubLFiles.declareFunction( me, "dump_and_link_lexicon", "DUMP-AND-LINK-LEXICON", 2, 0, false );
    SubLFiles.declareFunction( me, "fort_should_be_in_lexiconP", "FORT-SHOULD-BE-IN-LEXICON?", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_xml_lexicon", "DUMP-XML-LEXICON", 0, 4, false );
    SubLFiles.declareFunction( me, "add_entry_to_dictionary", "ADD-ENTRY-TO-DICTIONARY", 4, 0, false );
    SubLFiles.declareFunction( me, "dump_string_to_concepts_dict", "DUMP-STRING-TO-CONCEPTS-DICT", 3, 2, false );
    SubLFiles.declareFunction( me, "get_dumping_entry_cycl", "GET-DUMPING-ENTRY-CYCL", 2, 0, false );
    SubLFiles.declareFunction( me, "dump_xml_string_to_concepts_dict", "DUMP-XML-STRING-TO-CONCEPTS-DICT", 3, 2, false );
    SubLFiles.declareFunction( me, "dump_lexicon_string_row", "DUMP-LEXICON-STRING-ROW", 3, 1, false );
    SubLFiles.declareFunction( me, "xml_dump_lexicon_string_row", "XML-DUMP-LEXICON-STRING-ROW", 3, 1, false );
    SubLFiles.declareFunction( me, "contextually_dependent_entryP", "CONTEXTUALLY-DEPENDENT-ENTRY?", 1, 0, false );
    SubLFiles.declareFunction( me, "vanishingly_rare_entryP", "VANISHINGLY-RARE-ENTRY?", 1, 0, false );
    SubLFiles.declareFunction( me, "primary_entryP", "PRIMARY-ENTRY?", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_output_concept", "XML-OUTPUT-CONCEPT", 1, 1, false );
    SubLFiles.declareFunction( me, "thing_describable_as_lex_p", "THING-DESCRIBABLE-AS-LEX-P", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_isa_genls", "DUMP-ISA-GENLS", 0, 2, false );
    SubLFiles.declareFunction( me, "write_one_complete_fort_record_compactly", "WRITE-ONE-COMPLETE-FORT-RECORD-COMPACTLY", 1, 3, false );
    SubLFiles.declareFunction( me, "write_one_fort_compactly", "WRITE-ONE-FORT-COMPACTLY", 2, 1, false );
    return NIL;
  }

  public static SubLObject init_lexicon_dumping_file()
  {
    $lexicon_dumping_copy_filesP$ = SubLFiles.defparameter( "*LEXICON-DUMPING-COPY-FILES?*", T );
    $lexicon_dump_excluded_predicates$ = SubLFiles.defparameter( "*LEXICON-DUMP-EXCLUDED-PREDICATES*", $list0 );
    $dumping_lexicon$ = SubLFiles.defparameter( "*DUMPING-LEXICON*", NIL );
    $dumping_semtrans_lexicon$ = SubLFiles.defparameter( "*DUMPING-SEMTRANS-LEXICON*", NIL );
    $semtrans_lexicon_dump_excluded_pos_list$ = SubLFiles.defparameter( "*SEMTRANS-LEXICON-DUMP-EXCLUDED-POS-LIST*", $list6 );
    $lexicon_file_record_separator$ = SubLFiles.deflexical( "*LEXICON-FILE-RECORD-SEPARATOR*", Strings.make_string( ONE_INTEGER, Characters.CHAR_tab ) );
    return NIL;
  }

  public static SubLObject setup_lexicon_dumping_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_lexicon_dumping_file();
  }

  @Override
  public void initializeVariables()
  {
    init_lexicon_dumping_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_lexicon_dumping_file();
  }
  static
  {
    me = new lexicon_dumping();
    $lexicon_dumping_copy_filesP$ = null;
    $lexicon_dump_excluded_predicates$ = null;
    $dumping_lexicon$ = null;
    $dumping_semtrans_lexicon$ = null;
    $semtrans_lexicon_dump_excluded_pos_list$ = null;
    $lexicon_file_record_separator$ = null;
    $list0 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "abbreviationForLexicalWord" ) ), constant_handles.reader_make_constant_shell( makeString(
        "abbreviationString-PN" ) ), constant_handles.reader_make_constant_shell( makeString( "airportHasIATACode" ) ), constant_handles.reader_make_constant_shell( makeString( "atomicSymbol" ) ), constant_handles
            .reader_make_constant_shell( makeString( "chemicalFormulaString" ) ), constant_handles.reader_make_constant_shell( makeString( "countryCodeDigraph" ) ), constant_handles.reader_make_constant_shell(
                makeString( "countryCodeTrigraph" ) ), constant_handles.reader_make_constant_shell( makeString( "currencyCode" ) ), constant_handles.reader_make_constant_shell( makeString(
                    "geopoliticalEntityCodeDigraph" ) ), constant_handles.reader_make_constant_shell( makeString( "internetCountryCode" ) ), constant_handles.reader_make_constant_shell( makeString( "urlStringOfCW" ) )
    } );
    $sym1$TERM_LEXICON = makeSymbol( "TERM-LEXICON" );
    $sym2$EXCLUDE_PREDICATE = makeSymbol( "EXCLUDE-PREDICATE" );
    $const3$EnglishDocumentTaggingLexicalMt = constant_handles.reader_make_constant_shell( makeString( "EnglishDocumentTaggingLexicalMt" ) );
    $sym4$DEFAULT_BASE_MT = makeSymbol( "DEFAULT-BASE-MT" );
    $const5$AllGeneralEnglishValidatedLexical = constant_handles.reader_make_constant_shell( makeString( "AllGeneralEnglishValidatedLexicalMicrotheoryPSC" ) );
    $list6 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Adjective" ) ), constant_handles.reader_make_constant_shell( makeString( "Preposition" ) ), constant_handles
        .reader_make_constant_shell( makeString( "Adverb" ) ) );
    $sym7$SEMTRANS_LEXICON = makeSymbol( "SEMTRANS-LEXICON" );
    $sym8$EXCLUDE_POS = makeSymbol( "EXCLUDE-POS" );
    $str9$_cyc_projects_opencyc_tagging_lex = makeString( "/cyc/projects/opencyc/tagging-lexicon/" );
    $sym10$FORT_HAS_EXPORTED_OWL_OPENCYC_CONTENT_ = makeSymbol( "FORT-HAS-EXPORTED-OWL-OPENCYC-CONTENT?" );
    $str11$_cyc_projects_concept_search_ = makeString( "/cyc/projects/concept-search/" );
    $sym12$FORT_SHOULD_BE_IN_LEXICON_ = makeSymbol( "FORT-SHOULD-BE-IN-LEXICON?" );
    $str13$strings_to_short_ids = makeString( "strings-to-short-ids" );
    $str14$_ = makeString( "-" );
    $str15$_xml = makeString( ".xml" );
    $str16$short_ids_to_concepts_ = makeString( "short-ids-to-concepts-" );
    $str17$_tsv = makeString( ".tsv" );
    $str18$_cyc_projects_concept_search_stri = makeString( "/cyc/projects/concept-search/strings-to-short-ids.xml" );
    $str19$_cyc_projects_concept_search_shor = makeString( "/cyc/projects/concept-search/short-ids-to-concepts-test.tsv" );
    $sym20$TRUE = makeSymbol( "TRUE" );
    $str21$strings_to_short_ids_tsv = makeString( "strings-to-short-ids.tsv" );
    $str22$short_ids_to_concepts_tsv = makeString( "short-ids-to-concepts.tsv" );
    $str23$Exceeded_desired_lexicon_size = makeString( "Exceeded desired lexicon size" );
    $sym24$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $const25$stopWordString = constant_handles.reader_make_constant_shell( makeString( "stopWordString" ) );
    $kw26$GAF = makeKeyword( "GAF" );
    $sym27$ADD_STOP_WORD = makeSymbol( "ADD-STOP-WORD" );
    $sym28$GET = makeSymbol( "GET" );
    $kw29$STRING = makeKeyword( "STRING" );
    $sym30$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str31$found__a_____a_in_the_lexicon = makeString( "found ~a -> ~a in the lexicon" );
    $int32$100 = makeInteger( 100 );
    $str33$_ = makeString( "." );
    $str34$error_when_writing_out_lexicon_fo = makeString( "error when writing out lexicon for ~S: ~S" );
    $sym35$GET_STOP_WORDS = makeSymbol( "GET-STOP-WORDS" );
    $kw36$CYCL = makeKeyword( "CYCL" );
    $kw37$ENTRY_TYPE = makeKeyword( "ENTRY-TYPE" );
    $kw38$DENOT = makeKeyword( "DENOT" );
    $kw39$CASE_SENSITIVE = makeKeyword( "CASE-SENSITIVE" );
    $kw40$OUTPUT = makeKeyword( "OUTPUT" );
    $str41$Copying_files_from_temporary_loca = makeString( "Copying files from temporary locations" );
    $kw42$ENTRY_STRENGTH = makeKeyword( "ENTRY-STRENGTH" );
    $kw43$CONTEXTDEPENDENT = makeKeyword( "CONTEXTDEPENDENT" );
    $kw44$PRIMARY = makeKeyword( "PRIMARY" );
    $kw45$VANISHINGLY_RARE = makeKeyword( "VANISHINGLY-RARE" );
    $str46$February = makeString( "February" );
    $str47$adding__S___S = makeString( "adding ~S: ~S" );
    $str48$_ = makeString( " " );
    $str49$No_entries_added_for__S__ = makeString( "No entries added for ~S~%" );
    $kw50$APPEND = makeKeyword( "APPEND" );
    $str51$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str52$writing_strings_to_ids = makeString( "writing strings-to-ids" );
    $str53$ = makeString( "" );
    $str54$writing_ids_to_concepts = makeString( "writing ids-to-concepts" );
    $kw55$SEMTRANS = makeKeyword( "SEMTRANS" );
    $str56$lexicon = makeString( "lexicon" );
    $kw57$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $str58$Lexicon_Dump_XML_Clipper = makeString( "Lexicon Dump XML Clipper" );
    $str59$perl = makeString( "perl" );
    $str60$_p = makeString( "-p" );
    $str61$_i = makeString( "-i" );
    $str62$_e = makeString( "-e" );
    $str63$_s____ = makeString( "'s/<\\/" );
    $str64$____ = makeString( ">//'" );
    $str65$done_dumping___S__S__S = makeString( "done dumping: ~S ~S ~S" );
    $str66$mapping = makeString( "mapping" );
    $str67$nlString = makeString( "nlString" );
    $str68$caseSensitive = makeString( "caseSensitive" );
    $str69$t = makeString( "t" );
    $str70$f = makeString( "f" );
    $str71$entryType = makeString( "entryType" );
    $str72$mappingStrength = makeString( "mappingStrength" );
    $str73$entry = makeString( "entry" );
    $list74 = ConsesLow.list( makeKeyword( "EXTERNAL-ID" ) );
    $const75$ContextuallyDependentLexicalMappi = constant_handles.reader_make_constant_shell( makeString( "ContextuallyDependentLexicalMapping" ) );
    $kw76$PRAGMATICS = makeKeyword( "PRAGMATICS" );
    $sym77$FIRST = makeSymbol( "FIRST" );
    $const78$VanishinglyRareLexicalMapping = constant_handles.reader_make_constant_shell( makeString( "VanishinglyRareLexicalMapping" ) );
    $const79$PrimaryLexicalMapping = constant_handles.reader_make_constant_shell( makeString( "PrimaryLexicalMapping" ) );
    $list80 = ConsesLow.list( makeKeyword( "EXTERNAL-ID" ), makeKeyword( "CYCL" ), makeKeyword( "PREFERRED-NL" ) );
    $str81$uri = makeString( "uri" );
    $str82$nat = makeString( "nat" );
    $str83$concept = makeString( "concept" );
    $kw84$EXTERNAL_ID = makeKeyword( "EXTERNAL-ID" );
    $str85$externalId = makeString( "externalId" );
    $str86$id = makeString( "id" );
    $kw87$PREFERRED_NL = makeKeyword( "PREFERRED-NL" );
    $str88$preferredNl = makeString( "preferredNl" );
    $list89 = ConsesLow.list( makeString( "xml:lang" ), makeString( "en" ) );
    $kw90$PPH_LEXICAL_CONTEXT = makeKeyword( "PPH-LEXICAL-CONTEXT" );
    $const91$TextPrismParaphraseMt = constant_handles.reader_make_constant_shell( makeString( "TextPrismParaphraseMt" ) );
    $str92$cycl = makeString( "cycl" );
    $list93 = ConsesLow.list( makeString( "xml:lang" ), makeString( "x-cycl-en-us" ) );
    $const94$ThingDescribableAsFn = constant_handles.reader_make_constant_shell( makeString( "ThingDescribableAsFn" ) );
    $str95$_cyc_projects_concept_search_shor = makeString( "/cyc/projects/concept-search/short-ids-to-concepts.tsv" );
    $str96$_cyc_projects_concept_search_shor = makeString( "/cyc/projects/concept-search/short-ids-to-isa-genls.tsv" );
    $str97$reading_the_file___ = makeString( "reading the file..." );
    $kw98$INPUT = makeKeyword( "INPUT" );
    $list99 = ConsesLow.list( Characters.CHAR_quotation );
    $const100$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $str101$g_ = makeString( "g:" );
    $str102$i_ = makeString( "i:" );
  }
}
/*
 *
 * Total time: 1295 ms
 *
 */