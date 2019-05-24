package com.cyc.cycjava.cycl.owl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.cycjava.cycl.rdf.rdf_blank_node;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.rdf.rdf_triple;
import com.cyc.cycjava.cycl.rkf_assertion_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.rdf.rdf_graph;
import com.cyc.cycjava.cycl.rdf.rdf_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.rkf_term_utilities;
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.rdf.rdf_uri;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class owl_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.owl.owl_utilities";
  public static final String myFingerPrint = "8f0c7e6cb804e27d0f534bc3b25bf95a6c59e3c560d81d9c2e5cf28c4a0a8347";
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 1558L)
  private static SubLSymbol $owl_namespace$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 1690L)
  private static SubLSymbol $owl11_namespace$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 1965L)
  public static SubLSymbol $owl_warnP$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 2005L)
  public static SubLSymbol $owl_verboseP$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 2442L)
  private static SubLSymbol $owl_name_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 2563L)
  private static SubLSymbol $owl_expanded_name_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 2702L)
  private static SubLSymbol $owl11_name_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 2827L)
  private static SubLSymbol $owl11_expanded_name_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 7252L)
  public static SubLSymbol $owl_importer_use_rkfP$;
  private static final SubLString $str0$http___www_w3_org_2002_07_owl_;
  private static final SubLString $str1$http___www_w3_org_2006_12_owl11_;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$PWHEN;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$WARN;
  private static final SubLSymbol $sym6$_OWL_VERBOSE__;
  private static final SubLSymbol $sym7$FORMAT;
  private static final SubLSymbol $sym8$CCONCATENATE;
  private static final SubLString $str9$__;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$OWL_NAME;
  private static final SubLString $str13$owl_;
  private static final SubLSymbol $sym14$_OWL_NAME_CACHING_STATE_;
  private static final SubLSymbol $sym15$OWL_EXPANDED_NAME;
  private static final SubLSymbol $sym16$_OWL_EXPANDED_NAME_CACHING_STATE_;
  private static final SubLSymbol $sym17$OWL11_NAME;
  private static final SubLString $str18$owl11_;
  private static final SubLSymbol $sym19$_OWL11_NAME_CACHING_STATE_;
  private static final SubLSymbol $sym20$OWL11_EXPANDED_NAME;
  private static final SubLSymbol $sym21$_OWL11_EXPANDED_NAME_CACHING_STATE_;
  private static final SubLSymbol $sym22$VALID_CONSTANT_NAME_CHAR_P;
  private static final SubLString $str23$_;
  private static final SubLSymbol $kw24$UPCASE;
  private static final SubLSymbol $kw25$DOWNCASE;
  private static final SubLObject $const26$isa;
  private static final SubLSymbol $sym27$OWL_ASSERT_WFF;
  private static final SubLSymbol $sym28$CYCLIST_;
  private static final SubLSymbol $sym29$NON_ASCII_STRING_P;
  private static final SubLSymbol $sym30$NON_ASCII_STRING_TO_UNICODE;
  private static final SubLString $str31$Already_know__S___in__S;
  private static final SubLString $str32$__;
  private static final SubLString $str33$Failed_to_assert__S__;
  private static final SubLList $list34;
  private static final SubLString $str35$xmlns;
  private static final SubLString $str36$xmlns_;
  private static final SubLSymbol $sym37$RDF_URI_P;
  private static final SubLList $list38;
  private static final SubLString $str39$_;
  private static final SubLSymbol $sym40$NOTE_TERM_ACTED_ON_DURING_IMPORT;
  private static final SubLObject $const41$termActedOnDuringOWLImport;
  private static final SubLObject $const42$BaseKB;
  private static final SubLSymbol $sym43$RDF_GRAPH_P;
  private static final SubLString $str44$subClassOf;
  private static final SubLString $str45$type;
  private static final SubLString $str46$Class;
  private static final SubLString $str47$broader;
  private static final SubLString $str48$range;
  private static final SubLString $str49$ObjectProperty;
  private static final SubLString $str50$sw_opencyc_org;
  private static final SubLString $str51$sw_cyc_com;
  private static final SubLString $str52$sameAs;
  private static final SubLSymbol $sym53$NUMBERP;
  private static final SubLSymbol $sym54$_;
  private static final SubLString $str55$http___;
  private static final SubLString $str56$intersectionOf;
  private static final SubLSymbol $sym57$RDF_TRIPLE_PREDICATE;
  private static final SubLString $str58$unionOf;
  private static final SubLString $str59$complementOf;
  private static final SubLString $str60$Restriction;
  private static final SubLString $str61$onProperty;
  private static final SubLString $str62$oneOf;
  private static final SubLString $str63$Using_options___;
  private static final SubLString $str64$___S_____S__;
  private static final SubLString $str65$___A_nodes____A_triples___;
  private static final SubLString $str66$___S__;
  private static final SubLString $str67$___A__;
  private static final SubLString $str68$TESTING_LOUDLY__;
  private static final SubLSymbol $kw69$VERBOSE_;
  private static final SubLObject $const70$CycAdministrator;
  private static final SubLSymbol $kw71$ONTOLOGY_TERM;
  private static final SubLString $str72$_________________________________;
  private static final SubLSymbol $kw73$FAIL;
  private static final SubLSymbol $kw74$OK;
  private static final SubLString $str75$_A__import____export___A__;
  private static final SubLString $str76$_A_;
  private static final SubLString $str77$_A__export____import2___A__;
  private static final SubLString $str78$_A__import____import2___A__;
  private static final SubLString $str79$_A__;
  private static final SubLSymbol $sym80$_EXIT;
  private static final SubLString $str81$_cyc_projects_EnterpriseCyc_OWL_I;
  private static final SubLSymbol $kw82$RESTRICT_CONTEXT_;
  private static final SubLSymbol $kw83$SUPPRESS_EXPORT_OF_DERIVED_KNOWLEDGE_;
  private static final SubLSymbol $kw84$SUPPRESS_ADDITIONAL_TYPE_TRIPLES_;
  private static final SubLString $str85$_A__A__A__;
  private static final SubLString $str86$_A__A__;

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 925L)
  public static SubLObject clear_owl_caches()
  {
    owl_cycl_to_xml.clear_owl_tag_attributes();
    owl_cycl_to_xml.clear_forts_with_exported_owl_opencyc_content();
    owl_cycl_to_xml.clear_compact_hl_external_id_strings_with_exported_owl_opencyc_content();
    owl_cycl_to_xml.clear_owl_predicate_types_for_export();
    owlification.clear_owl_cycl_predicate_table();
    owl_to_cycl.clear_xml_tokens_from_file();
    owl_to_cycl.clear_owl_import_parameters_ontology_context();
    owl_to_cycl.clear_find_or_create_owl_ontology_for_uri();
    owl_to_cycl.clear_owl_property_element_names();
    owl_to_cycl.clear_owl_class_element_names();
    owl_to_cycl.clear_note_found_term_resolution();
    owl_to_cycl.clear_xml_name();
    clear_owl_name();
    clear_owl_expanded_name();
    clear_owl11_name();
    clear_owl11_expanded_name();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 1629L)
  public static SubLObject owl_namespace()
  {
    return $owl_namespace$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 1765L)
  public static SubLObject owl11_namespace()
  {
    return $owl11_namespace$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 1830L)
  public static SubLObject owl_namespace_uriP(final SubLObject v_object)
  {
    return makeBoolean( NIL != rdf_uri.rdf_uri_p( v_object ) && NIL != rdf_uri.rdf_uri_base_matchesP( v_object, owl_namespace() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 2050L)
  public static SubLObject owl_warnP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != $owl_verboseP$.getDynamicValue( thread ) || NIL != $owl_warnP$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 2124L)
  public static SubLObject owl_warn(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject format_str = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    format_str = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.list( $sym3$PWHEN, $list4, ConsesLow.listS( $sym5$WARN, format_str, ConsesLow.append( args, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 2258L)
  public static SubLObject owl_note(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject format_str = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    format_str = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.listS( $sym3$PWHEN, $sym6$_OWL_VERBOSE__, ConsesLow.listS( $sym7$FORMAT, T, ConsesLow.listS( $sym8$CCONCATENATE, $str9$__, format_str, $list10 ), ConsesLow.append( args, NIL ) ), $list11 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 2442L)
  public static SubLObject clear_owl_name()
  {
    final SubLObject cs = $owl_name_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 2442L)
  public static SubLObject remove_owl_name(final SubLObject local_name)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $owl_name_caching_state$.getGlobalValue(), ConsesLow.list( local_name ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 2442L)
  public static SubLObject owl_name_internal(final SubLObject local_name)
  {
    return Sequences.cconcatenate( $str13$owl_, local_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 2442L)
  public static SubLObject owl_name(final SubLObject local_name)
  {
    SubLObject caching_state = $owl_name_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym12$OWL_NAME, $sym14$_OWL_NAME_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( owl_name_internal( local_name ) ) );
      memoization_state.caching_state_put( caching_state, local_name, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 2563L)
  public static SubLObject clear_owl_expanded_name()
  {
    final SubLObject cs = $owl_expanded_name_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 2563L)
  public static SubLObject remove_owl_expanded_name(final SubLObject local_name)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $owl_expanded_name_caching_state$.getGlobalValue(), ConsesLow.list( local_name ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 2563L)
  public static SubLObject owl_expanded_name_internal(final SubLObject local_name)
  {
    return Sequences.cconcatenate( owl_namespace(), local_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 2563L)
  public static SubLObject owl_expanded_name(final SubLObject local_name)
  {
    SubLObject caching_state = $owl_expanded_name_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym15$OWL_EXPANDED_NAME, $sym16$_OWL_EXPANDED_NAME_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( owl_expanded_name_internal( local_name ) ) );
      memoization_state.caching_state_put( caching_state, local_name, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 2702L)
  public static SubLObject clear_owl11_name()
  {
    final SubLObject cs = $owl11_name_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 2702L)
  public static SubLObject remove_owl11_name(final SubLObject local_name)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $owl11_name_caching_state$.getGlobalValue(), ConsesLow.list( local_name ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 2702L)
  public static SubLObject owl11_name_internal(final SubLObject local_name)
  {
    return Sequences.cconcatenate( $str18$owl11_, local_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 2702L)
  public static SubLObject owl11_name(final SubLObject local_name)
  {
    SubLObject caching_state = $owl11_name_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym17$OWL11_NAME, $sym19$_OWL11_NAME_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( owl11_name_internal( local_name ) ) );
      memoization_state.caching_state_put( caching_state, local_name, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 2827L)
  public static SubLObject clear_owl11_expanded_name()
  {
    final SubLObject cs = $owl11_expanded_name_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 2827L)
  public static SubLObject remove_owl11_expanded_name(final SubLObject local_name)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $owl11_expanded_name_caching_state$.getGlobalValue(), ConsesLow.list( local_name ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 2827L)
  public static SubLObject owl11_expanded_name_internal(final SubLObject local_name)
  {
    return Sequences.cconcatenate( owl11_namespace(), local_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 2827L)
  public static SubLObject owl11_expanded_name(final SubLObject local_name)
  {
    SubLObject caching_state = $owl11_expanded_name_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym20$OWL11_EXPANDED_NAME, $sym21$_OWL11_EXPANDED_NAME_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( owl11_expanded_name_internal( local_name ) ) );
      memoization_state.caching_state_put( caching_state, local_name, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 2970L)
  public static SubLObject owl_create_wff(final SubLObject name, final SubLObject isas, final SubLObject defining_mt, final SubLObject prefix, final SubLObject capitalizeP, SubLObject cyclist)
  {
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject new_term = NIL;
    final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
    try
    {
      api_control_vars.$the_cyclist$.bind( NIL, thread );
      operation_communication.set_the_cyclist( cyclist );
      new_term = owl_create_new_constant_wff( name, isas, defining_mt, prefix, capitalizeP );
    }
    finally
    {
      api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
    }
    return new_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 3254L)
  public static SubLObject owl_create_new_constant_wff(final SubLObject name, final SubLObject isas, final SubLObject defining_mt, final SubLObject prefix, final SubLObject set_caseP)
  {
    if( NIL != owl_importer_use_rkfP() )
    {
      return rkf_term_utilities.create_new_constant( name, isas, NIL, defining_mt, prefix, NIL, set_caseP, T, T );
    }
    return owl_create_new_constant_wff_non_rkf( name, isas, defining_mt, prefix, set_caseP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 3574L)
  public static SubLObject owl_create_new_constant_wff_non_rkf(final SubLObject name, final SubLObject known_collections, final SubLObject defining_mt, final SubLObject prefix, final SubLObject set_caseP)
  {
    final SubLObject full_name = list_utilities.remove_if_not( $sym22$VALID_CONSTANT_NAME_CHAR_P, ( NIL != string_utilities.non_empty_string_p( prefix ) ) ? Sequences.cconcatenate( prefix, new SubLObject[] { $str23$_,
      name
    } ) : name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject new_constant = ke.ke_create_now( ( set_caseP == $kw24$UPCASE ) ? string_utilities.upcase_leading( full_name )
        : ( ( set_caseP == $kw25$DOWNCASE ) ? string_utilities.downcase_leading( full_name ) : full_name ), UNPROVIDED );
    SubLObject cdolist_list_var = known_collections;
    SubLObject v_isa = NIL;
    v_isa = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      owl_assert_low_wff( el_utilities.make_binary_formula( $const26$isa, new_constant, v_isa ), defining_mt );
      cdolist_list_var = cdolist_list_var.rest();
      v_isa = cdolist_list_var.first();
    }
    return new_constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 4164L)
  public static SubLObject owl_assert_wff_internal(SubLObject formula, final SubLObject mt, SubLObject import_term, SubLObject cyclist, SubLObject utf_8P)
  {
    if( import_term == UNPROVIDED )
    {
      import_term = NIL;
    }
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    if( utf_8P == UNPROVIDED )
    {
      utf_8P = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != kb_accessors.cyclistP( cyclist ) : cyclist;
    formula = narts_high.nart_expand( formula );
    if( NIL != utf_8P && NIL != cycl_utilities.expression_find_if( $sym29$NON_ASCII_STRING_P, formula, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject transformed = cycl_utilities.expression_transform( formula, $sym29$NON_ASCII_STRING_P, $sym30$NON_ASCII_STRING_TO_UNICODE, UNPROVIDED, UNPROVIDED );
      if( NIL == cycl_utilities.expression_find_if( $sym29$NON_ASCII_STRING_P, transformed, UNPROVIDED, UNPROVIDED ) )
      {
        formula = transformed;
      }
    }
    SubLObject successP = NIL;
    if( NIL != czer_meta.el_asserted_assertion_specP( formula, mt ) )
    {
      if( NIL != $owl_verboseP$.getDynamicValue( thread ) )
      {
        PrintLow.format( T, Sequences.cconcatenate( $str9$__, new SubLObject[] { $str31$Already_know__S___in__S, $str32$__
        } ), formula, mt );
        streams_high.force_output( UNPROVIDED );
      }
      successP = T;
    }
    else
    {
      final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
      try
      {
        api_control_vars.$the_cyclist$.bind( NIL, thread );
        operation_communication.set_the_cyclist( cyclist );
        thread.resetMultipleValues();
        final SubLObject assertedP = owl_assert_low_wff( formula, mt );
        final SubLObject problematic_formula = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != assertedP )
        {
          successP = T;
        }
        else if( NIL != $owl_verboseP$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, Sequences.cconcatenate( $str9$__, new SubLObject[] { $str33$Failed_to_assert__S__, $str32$__
          } ), problematic_formula );
          streams_high.force_output( UNPROVIDED );
        }
      }
      finally
      {
        api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
      }
    }
    if( NIL != successP )
    {
      note_sentence_asserted( formula, mt, import_term );
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 4164L)
  public static SubLObject owl_assert_wff(final SubLObject formula, final SubLObject mt, SubLObject import_term, SubLObject cyclist, SubLObject utf_8P)
  {
    if( import_term == UNPROVIDED )
    {
      import_term = NIL;
    }
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    if( utf_8P == UNPROVIDED )
    {
      utf_8P = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return owl_assert_wff_internal( formula, mt, import_term, cyclist, utf_8P );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym27$OWL_ASSERT_WFF, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym27$OWL_ASSERT_WFF, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym27$OWL_ASSERT_WFF, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_5( formula, mt, import_term, cyclist, utf_8P );
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
          if( mt.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( import_term.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( cyclist.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( NIL != cached_args && NIL == cached_args.rest() && utf_8P.equal( cached_args.first() ) )
                {
                  return memoization_state.caching_results( results2 );
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( owl_assert_wff_internal( formula, mt, import_term, cyclist, utf_8P ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( formula, mt, import_term, cyclist, utf_8P ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 5175L)
  public static SubLObject implementation_uriP(final SubLObject v_object)
  {
    return makeBoolean( NIL != rdf_utilities.rdf_namespace_uriP( v_object ) || NIL != rdf_utilities.rdfs_namespace_uriP( v_object ) || NIL != owl_namespace_uriP( v_object ) || NIL != rdf_utilities.xsd_namespace_uriP(
        v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 5369L)
  public static SubLObject rdf_graph_xmlns_plist(final SubLObject v_graph)
  {
    final SubLObject prefix_map = rdf_graph.rdf_graph_prefix_map( v_graph );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = prefix_map;
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject p = NIL;
      SubLObject v = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
      p = current.first();
      current = ( v = current.rest() );
      if( NIL != string_utilities.empty_string_p( p ) )
      {
        result = conses_high.putf( result, Sequences.cconcatenate( $str35$xmlns, p ), v );
      }
      else
      {
        result = conses_high.putf( result, Sequences.cconcatenate( $str36$xmlns_, p ), v );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 5880L)
  public static SubLObject rdf_abbrev_prefix_and_name_for_uri(final SubLObject prefix_map, final SubLObject uri)
  {
    assert NIL != rdf_uri.rdf_uri_p( uri ) : uri;
    final SubLObject connector = format_nil.format_nil_a( rdf_uri.rdf_uri_connector( uri ) );
    final SubLObject abbrev_string = rdf_uri.rdf_uri_utf8_string( uri );
    final SubLObject uri_string = rdf_uri.rdf_uri_utf8_string( uri );
    SubLObject found_prefix = NIL;
    SubLObject found_name = NIL;
    SubLObject found_namespace = NIL;
    SubLObject cdolist_list_var = prefix_map;
    SubLObject prefix_namespace = NIL;
    prefix_namespace = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = prefix_namespace;
      SubLObject prefix = NIL;
      SubLObject namespace = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
      prefix = current.first();
      current = ( namespace = current.rest() );
      if( NIL != string_utilities.starts_with( abbrev_string, namespace ) && NIL == string_utilities.empty_string_p( prefix ) && NIL == string_utilities.substringP( connector, string_utilities.pre_remove( uri_string,
          namespace, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        if( NIL != found_prefix )
        {
          if( NIL != string_utilities.string_length_L( prefix, found_prefix ) )
          {
            found_prefix = prefix;
            found_namespace = namespace;
          }
        }
        else
        {
          found_prefix = prefix;
          found_namespace = namespace;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      prefix_namespace = cdolist_list_var.first();
    }
    found_name = string_utilities.pre_remove( uri_string, found_namespace, UNPROVIDED );
    return Values.values( found_prefix, found_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 6817L)
  public static SubLObject rdf_graph_node_abbreviation_string(final SubLObject v_graph, final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject prefix_map = rdf_graph.rdf_graph_prefix_map( v_graph );
    if( NIL != rdf_uri.rdf_uri_p( node ) )
    {
      thread.resetMultipleValues();
      final SubLObject found_prefix = rdf_abbrev_prefix_and_name_for_uri( prefix_map, node );
      final SubLObject found_name = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != string_utilities.non_empty_string_p( found_prefix ) && NIL != string_utilities.non_empty_string_p( found_name ) )
      {
        return Sequences.cconcatenate( found_prefix, new SubLObject[] { $str39$_, found_name
        } );
      }
    }
    return format_nil.format_nil_s( node );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 7318L)
  public static SubLObject owl_importer_use_rkfP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $owl_importer_use_rkfP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 7435L)
  public static SubLObject owl_assert_low_wff(final SubLObject formula, final SubLObject mt)
  {
    if( NIL != owl_importer_use_rkfP() )
    {
      return rkf_assertion_utilities.rkf_assert_with_implicature( formula, mt, T );
    }
    return Values.values( ke.ke_assert_wff_now( formula, mt, UNPROVIDED, UNPROVIDED ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 7655L)
  public static SubLObject note_sentence_asserted(final SubLObject formula, final SubLObject mt, final SubLObject import_term)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 7970L)
  public static SubLObject note_term_acted_on_during_import_internal(final SubLObject v_term, final SubLObject import_term, SubLObject cyclist)
  {
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    return ( NIL != import_term ) ? owl_assert_wff( ConsesLow.list( $const41$termActedOnDuringOWLImport, import_term, v_term ), $const42$BaseKB, import_term, cyclist, UNPROVIDED ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 7970L)
  public static SubLObject note_term_acted_on_during_import(final SubLObject v_term, final SubLObject import_term, SubLObject cyclist)
  {
    if( cyclist == UNPROVIDED )
    {
      cyclist = operation_communication.the_cyclist();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return note_term_acted_on_during_import_internal( v_term, import_term, cyclist );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym40$NOTE_TERM_ACTED_ON_DURING_IMPORT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym40$NOTE_TERM_ACTED_ON_DURING_IMPORT, THREE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym40$NOTE_TERM_ACTED_ON_DURING_IMPORT, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( v_term, import_term, cyclist );
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
        if( v_term.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( import_term.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && cyclist.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( note_term_acted_on_during_import_internal( v_term, import_term, cyclist ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_term, import_term, cyclist ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 8239L)
  public static SubLObject rdf_graph_root_classes(final SubLObject v_graph)
  {
    assert NIL != rdf_graph.rdf_graph_p( v_graph ) : v_graph;
    SubLObject root_classes = NIL;
    SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_subjects( v_graph, rdf_utilities.rdf_expanded_name( $str45$type ), owl_expanded_name( $str46$Class ) );
    SubLObject v_class = NIL;
    v_class = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( rdf_graph.rdf_graph_subject_triple_count( v_graph, v_class, rdf_utilities.rdfs_expanded_name( $str44$subClassOf ) ).isZero() )
      {
        root_classes = ConsesLow.cons( v_class, root_classes );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_class = cdolist_list_var.first();
    }
    return root_classes;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 8703L)
  public static SubLObject rdf_graph_root_concepts(final SubLObject v_graph)
  {
    assert NIL != rdf_graph.rdf_graph_p( v_graph ) : v_graph;
    SubLObject root_concepts = NIL;
    SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_predicate_triples( v_graph, rdf_utilities.skos_expanded_name( $str47$broader ) );
    SubLObject triple = NIL;
    triple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject concept = rdf_triple.rdf_triple_object( triple );
      if( rdf_graph.rdf_graph_subject_triple_count( v_graph, concept, rdf_utilities.skos_expanded_name( $str47$broader ) ).isZero() )
      {
        final SubLObject item_var = concept;
        if( NIL == conses_high.member( item_var, root_concepts, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          root_concepts = ConsesLow.cons( item_var, root_concepts );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      triple = cdolist_list_var.first();
    }
    return root_concepts;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 9210L)
  public static SubLObject rdf_graph_object_properties_without_ranges(final SubLObject v_graph)
  {
    assert NIL != rdf_graph.rdf_graph_p( v_graph ) : v_graph;
    SubLObject v_properties = NIL;
    SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_subjects( v_graph, rdf_utilities.rdf_expanded_name( $str45$type ), owl_expanded_name( $str49$ObjectProperty ) );
    SubLObject property = NIL;
    property = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( rdf_graph.rdf_graph_subject_triple_count( v_graph, property, rdf_utilities.rdfs_expanded_name( $str48$range ) ).isZero() )
      {
        v_properties = ConsesLow.cons( property, v_properties );
      }
      cdolist_list_var = cdolist_list_var.rest();
      property = cdolist_list_var.first();
    }
    return v_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 9705L)
  public static SubLObject count_outgoing_sameas_links(final SubLObject v_graph)
  {
    SubLObject count = ZERO_INTEGER;
    SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_predicate_triples( v_graph, owl_expanded_name( $str52$sameAs ) );
    SubLObject triple = NIL;
    triple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject other = rdf_triple.rdf_triple_object( triple );
      if( NIL != rdf_uri.rdf_uri_p( other ) && NIL == Sequences.search( $str50$sw_opencyc_org, rdf_uri.rdf_uri_utf8_string( other ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED ) && NIL == Sequences.search( $str51$sw_cyc_com, rdf_uri.rdf_uri_utf8_string( other ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        count = Numbers.add( count, ONE_INTEGER );
      }
      cdolist_list_var = cdolist_list_var.rest();
      triple = cdolist_list_var.first();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 10197L)
  public static SubLObject count_all_sameas_links(final SubLObject v_graph)
  {
    SubLObject count = ZERO_INTEGER;
    SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_predicate_triples( v_graph, owl_expanded_name( $str52$sameAs ) );
    SubLObject triple = NIL;
    triple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      count = Numbers.add( count, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      triple = cdolist_list_var.first();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 10416L)
  public static SubLObject classify_sameas_links_by_namespace(final SubLObject v_graph)
  {
    final SubLObject result = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_predicate_triples( v_graph, owl_expanded_name( $str52$sameAs ) );
    SubLObject triple = NIL;
    triple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject other = rdf_triple.rdf_triple_object( triple );
      if( NIL != rdf_uri.rdf_uri_p( other ) )
      {
        final SubLObject other_uri_string = rdf_uri.rdf_uri_utf8_string( other );
        final SubLObject last_hash_pos = list_utilities.position_from_end( Characters.CHAR_hash, other_uri_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        final SubLObject last_slash_pos = list_utilities.position_from_end( Characters.CHAR_slash, other_uri_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        final SubLObject namespace = string_utilities.substring( other_uri_string, ZERO_INTEGER, number_utilities.minimum( list_utilities.delete_if_not( $sym53$NUMBERP, ConsesLow.list( last_hash_pos, last_slash_pos ),
            UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED ) );
        dictionary_utilities.dictionary_increment( result, namespace, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      triple = cdolist_list_var.first();
    }
    return dictionary_utilities.sort_dictionary_by_values( result, Symbols.symbol_function( $sym54$_ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 11082L)
  public static SubLObject classify_sameas_links_by_domain(final SubLObject v_graph)
  {
    final SubLObject result = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_predicate_triples( v_graph, owl_expanded_name( $str52$sameAs ) );
    SubLObject triple = NIL;
    triple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject other = rdf_triple.rdf_triple_object( triple );
      if( NIL != rdf_uri.rdf_uri_p( other ) )
      {
        final SubLObject other_uri_string = rdf_uri.rdf_uri_utf8_string( other );
        if( NIL != string_utilities.starts_with( other_uri_string, $str55$http___ ) )
        {
          final SubLObject slash_position = Sequences.position( Characters.CHAR_slash, other_uri_string, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), SEVEN_INTEGER, UNPROVIDED );
          final SubLObject domain = string_utilities.substring( other_uri_string, SEVEN_INTEGER, slash_position );
          dictionary_utilities.dictionary_increment( result, domain, UNPROVIDED );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      triple = cdolist_list_var.first();
    }
    return dictionary_utilities.sort_dictionary_by_values( result, Symbols.symbol_function( $sym54$_ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 11701L)
  public static SubLObject find_weird_sameas_links(final SubLObject v_graph)
  {
    SubLObject cdolist_list_var = rdf_graph.rdf_graph_find_predicate_triples( v_graph, owl_expanded_name( $str52$sameAs ) );
    SubLObject triple = NIL;
    triple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject other = rdf_triple.rdf_triple_object( triple );
      if( NIL == rdf_uri.rdf_uri_p( other ) )
      {
        print_high.print( triple, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      triple = cdolist_list_var.first();
    }
    return v_graph;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 11953L)
  public static SubLObject owl_intersection_of_node_p(final SubLObject node, final SubLObject v_graph)
  {
    if( NIL == rdf_blank_node.rdf_blank_node_p( node ) )
    {
      return NIL;
    }
    final SubLObject triples = rdf_graph.rdf_graph_find_subject_triples( v_graph, node, UNPROVIDED );
    if( ( NIL == list_utilities.doubletonP( triples ) && NIL == list_utilities.tripleP( triples ) ) || NIL == Sequences.find( rdf_graph.rdf_graph_get_uri( v_graph, owl_expanded_name( $str56$intersectionOf ), UNPROVIDED,
        UNPROVIDED ), triples, EQ, $sym57$RDF_TRIPLE_PREDICATE, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    final SubLObject type_triple = Sequences.find( rdf_graph.rdf_graph_get_uri( v_graph, rdf_utilities.rdf_expanded_name( $str45$type ), UNPROVIDED, UNPROVIDED ), triples, EQ, $sym57$RDF_TRIPLE_PREDICATE, UNPROVIDED,
        UNPROVIDED );
    return makeBoolean( NIL != type_triple && NIL != rdf_graph.rdf_nodes_equalP( rdf_triple.rdf_triple_subject( type_triple ), node ) && NIL != rdf_graph.rdf_nodes_equalP( rdf_triple.rdf_triple_object( type_triple ),
        rdf_graph.rdf_graph_get_uri( v_graph, owl_expanded_name( $str46$Class ), UNPROVIDED, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 12788L)
  public static SubLObject owl_union_of_node_p(final SubLObject node, final SubLObject v_graph)
  {
    if( NIL == rdf_blank_node.rdf_blank_node_p( node ) )
    {
      return NIL;
    }
    final SubLObject triples = rdf_graph.rdf_graph_find_subject_triples( v_graph, node, UNPROVIDED );
    if( ( NIL == list_utilities.doubletonP( triples ) && NIL == list_utilities.tripleP( triples ) ) || NIL == Sequences.find( rdf_graph.rdf_graph_get_uri( v_graph, owl_expanded_name( $str58$unionOf ), UNPROVIDED,
        UNPROVIDED ), triples, EQ, $sym57$RDF_TRIPLE_PREDICATE, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    final SubLObject type_triple = Sequences.find( rdf_graph.rdf_graph_get_uri( v_graph, rdf_utilities.rdf_expanded_name( $str45$type ), UNPROVIDED, UNPROVIDED ), triples, EQ, $sym57$RDF_TRIPLE_PREDICATE, UNPROVIDED,
        UNPROVIDED );
    return makeBoolean( NIL != type_triple && NIL != rdf_graph.rdf_nodes_equalP( rdf_triple.rdf_triple_subject( type_triple ), node ) && NIL != rdf_graph.rdf_nodes_equalP( rdf_triple.rdf_triple_object( type_triple ),
        rdf_graph.rdf_graph_get_uri( v_graph, owl_expanded_name( $str46$Class ), UNPROVIDED, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 13492L)
  public static SubLObject owl_complement_of_node_p(final SubLObject node, final SubLObject v_graph)
  {
    if( NIL == rdf_blank_node.rdf_blank_node_p( node ) )
    {
      return NIL;
    }
    final SubLObject triples = rdf_graph.rdf_graph_find_subject_triples( v_graph, node, UNPROVIDED );
    if( ( NIL == list_utilities.doubletonP( triples ) && NIL == list_utilities.tripleP( triples ) ) || NIL == Sequences.find( rdf_graph.rdf_graph_get_uri( v_graph, owl_expanded_name( $str59$complementOf ), UNPROVIDED,
        UNPROVIDED ), triples, EQ, $sym57$RDF_TRIPLE_PREDICATE, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    final SubLObject type_triple = Sequences.find( rdf_graph.rdf_graph_get_uri( v_graph, rdf_utilities.rdf_expanded_name( $str45$type ), UNPROVIDED, UNPROVIDED ), triples, EQ, $sym57$RDF_TRIPLE_PREDICATE, UNPROVIDED,
        UNPROVIDED );
    return makeBoolean( NIL != type_triple && NIL != rdf_graph.rdf_nodes_equalP( rdf_triple.rdf_triple_subject( type_triple ), node ) && NIL != rdf_graph.rdf_nodes_equalP( rdf_triple.rdf_triple_object( type_triple ),
        rdf_graph.rdf_graph_get_uri( v_graph, owl_expanded_name( $str46$Class ), UNPROVIDED, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 14206L)
  public static SubLObject owl_restriction_node_p(final SubLObject node, final SubLObject v_graph)
  {
    if( NIL != rdf_blank_node.rdf_blank_node_p( node ) )
    {
      final SubLObject triples = rdf_graph.rdf_graph_find_subject_triples( v_graph, node, UNPROVIDED );
      if( NIL != list_utilities.tripleP( triples ) || NIL != list_utilities.lengthE( triples, FOUR_INTEGER, UNPROVIDED ) )
      {
        final SubLObject type_node = rdf_graph.rdf_graph_get_uri( v_graph, rdf_utilities.rdf_expanded_name( $str45$type ), UNPROVIDED, UNPROVIDED );
        final SubLObject restriction_node = rdf_graph.rdf_graph_get_uri( v_graph, owl_expanded_name( $str60$Restriction ), UNPROVIDED, UNPROVIDED );
        final SubLObject on_property_node = rdf_graph.rdf_graph_get_uri( v_graph, owl_expanded_name( $str61$onProperty ), UNPROVIDED, UNPROVIDED );
        if( NIL != rdf_graph.rdf_graph_find_triple( v_graph, node, type_node, restriction_node ) && NIL != list_utilities.singletonP( rdf_graph.rdf_graph_find_subject_triples( v_graph, node, on_property_node ) ) )
        {
          return T;
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 14963L)
  public static SubLObject owl_one_of_node_p(final SubLObject node, final SubLObject v_graph)
  {
    if( NIL != rdf_blank_node.rdf_blank_node_p( node ) )
    {
      final SubLObject triples = rdf_graph.rdf_graph_find_subject_triples( v_graph, node, UNPROVIDED );
      if( NIL != list_utilities.doubletonP( triples ) || NIL != list_utilities.tripleP( triples ) )
      {
        final SubLObject type_node = rdf_graph.rdf_graph_get_uri( v_graph, rdf_utilities.rdf_expanded_name( $str45$type ), UNPROVIDED, UNPROVIDED );
        final SubLObject one_of_node = rdf_graph.rdf_graph_get_uri( v_graph, owl_expanded_name( $str62$oneOf ), UNPROVIDED, UNPROVIDED );
        if( NIL != list_utilities.singletonP( rdf_graph.rdf_graph_find_subject_triples( v_graph, node, type_node ) ) && NIL != list_utilities.singletonP( rdf_graph.rdf_graph_find_subject_triples( v_graph, node,
            one_of_node ) ) )
        {
          return T;
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 15561L)
  public static SubLObject owl_debug_show_options(final SubLObject option_plist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    format_nil.force_format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str63$Using_options___, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = option_plist; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      format_nil.force_format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str64$___S_____S__, property, value, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 15908L)
  public static SubLObject owl_debug_show_graph(final SubLObject v_graph)
  {
    owl_debug_show_triples( set.set_element_list( rdf_graph.rdf_graph_triples( v_graph ) ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 16041L)
  public static SubLObject owl_debug_show_graph_info(final SubLObject v_graph)
  {
    format_nil.force_format( T, $str65$___A_nodes____A_triples___, rdf_graph.rdf_graph_node_count( v_graph ), rdf_graph.rdf_graph_triple_count( v_graph ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 16215L)
  public static SubLObject owl_debug_show_triples(final SubLObject triples)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = triples;
    SubLObject triple = NIL;
    triple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      format_nil.force_format( StreamsLow.$standard_output$.getDynamicValue( thread ), $str66$___S__, triple, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      triple = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 16362L)
  public static SubLObject owl_import_file_round_trip_test(final SubLObject filename, SubLObject verboseP, SubLObject keep_kbP, SubLObject keep_fileP, SubLObject exporter_options, SubLObject importer_options)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    if( keep_kbP == UNPROVIDED )
    {
      keep_kbP = NIL;
    }
    if( keep_fileP == UNPROVIDED )
    {
      keep_fileP = NIL;
    }
    if( exporter_options == UNPROVIDED )
    {
      exporter_options = NIL;
    }
    if( importer_options == UNPROVIDED )
    {
      importer_options = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    format_nil.force_format( T, $str67$___A__, file_utilities.pathstring_filename( filename ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != verboseP )
    {
      format_nil.force_format( T, $str68$TESTING_LOUDLY__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      importer_options = conses_high.putf( importer_options, $kw69$VERBOSE_, verboseP );
      exporter_options = conses_high.putf( exporter_options, $kw69$VERBOSE_, verboseP );
    }
    final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
    try
    {
      api_control_vars.$the_cyclist$.bind( $const70$CycAdministrator, thread );
      final SubLObject importer = owl_importer2.owl_import_file( filename, importer_options );
      final SubLObject import_graph = owl_importer2.owl_importer2_graph( importer );
      final SubLObject ontology_term = owl_importer2.owl_importer2_get_option( importer, $kw71$ONTOLOGY_TERM, UNPROVIDED );
      final SubLObject exporter_filename = file_utilities.make_temp_filename( file_utilities.temp_directory() );
      final SubLObject exporter = owl_exporter2.owl_export_ontology_to_file( ontology_term, exporter_filename, exporter_options );
      final SubLObject export_graph = owl_exporter2.owl_exporter2_graph( exporter );
      final SubLObject importer2 = owl_importer2.owl_import_file_to_graph_only( exporter_filename, importer_options );
      final SubLObject import2_graph = owl_importer2.owl_importer2_graph( importer2 );
      SubLObject result1 = NIL;
      SubLObject result2 = NIL;
      thread.resetMultipleValues();
      SubLObject import_extra_triples = rdf_graph.rdf_graph_compare( import_graph, export_graph, verboseP );
      final SubLObject export_extra_triples = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != verboseP )
      {
        format_nil.force_format( T, $str72$_________________________________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        owl_debug_show_triples( import_extra_triples );
        format_nil.force_format( T, $str72$_________________________________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        owl_debug_show_triples( export_extra_triples );
        format_nil.force_format( T, $str72$_________________________________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        format_nil.force_format( T, $str32$__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL != import_extra_triples || NIL != export_extra_triples )
      {
        result1 = $kw73$FAIL;
      }
      else
      {
        result1 = $kw74$OK;
      }
      if( NIL != verboseP )
      {
        format_nil.force_format( T, $str75$_A__import____export___A__, filename, result1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        format_nil.force_format( T, $str76$_A_, result1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      thread.resetMultipleValues();
      final SubLObject export_extra_triples2 = rdf_graph.rdf_graph_compare( export_graph, import2_graph, verboseP );
      SubLObject import2_extra_triples = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != verboseP )
      {
        format_nil.force_format( T, $str72$_________________________________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        owl_debug_show_triples( export_extra_triples2 );
        format_nil.force_format( T, $str72$_________________________________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        owl_debug_show_triples( import2_extra_triples );
        format_nil.force_format( T, $str72$_________________________________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        format_nil.force_format( T, $str32$__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL != export_extra_triples2 || NIL != import2_extra_triples )
      {
        result2 = $kw73$FAIL;
      }
      else
      {
        result2 = $kw74$OK;
      }
      if( NIL != verboseP )
      {
        format_nil.force_format( T, $str77$_A__export____import2___A__, filename, result2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        format_nil.force_format( T, $str76$_A_, result2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      thread.resetMultipleValues();
      import_extra_triples = rdf_graph.rdf_graph_compare( import_graph, import2_graph, verboseP );
      import2_extra_triples = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != verboseP )
      {
        format_nil.force_format( T, $str72$_________________________________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        owl_debug_show_triples( import_extra_triples );
        format_nil.force_format( T, $str72$_________________________________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        owl_debug_show_triples( import2_extra_triples );
        format_nil.force_format( T, $str72$_________________________________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        format_nil.force_format( T, $str32$__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL != import_extra_triples || NIL != import2_extra_triples )
      {
        result2 = $kw73$FAIL;
      }
      else
      {
        result2 = $kw74$OK;
      }
      if( NIL != verboseP )
      {
        format_nil.force_format( T, $str78$_A__import____import2___A__, filename, result2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        format_nil.force_format( T, $str79$_A__, result2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL == keep_kbP )
      {
        ke.ke_kill_now( ontology_term );
      }
      if( NIL == keep_fileP )
      {
        Filesys.delete_file( exporter_filename );
      }
      return ( $kw74$OK == result1 && $kw74$OK == result2 ) ? $kw74$OK : $kw73$FAIL;
    }
    finally
    {
      api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 16362L)
  public static SubLObject owl_import_file_round_trip_test_owl_dl(final SubLObject file_number, SubLObject verboseP, SubLObject keep_kbP, SubLObject keep_fileP, SubLObject exporter_options, SubLObject importer_options)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    if( keep_kbP == UNPROVIDED )
    {
      keep_kbP = NIL;
    }
    if( keep_fileP == UNPROVIDED )
    {
      keep_fileP = NIL;
    }
    if( exporter_options == UNPROVIDED )
    {
      exporter_options = NIL;
    }
    if( importer_options == UNPROVIDED )
    {
      importer_options = NIL;
    }
    final SubLObject filename = PrintLow.format( NIL, $str81$_cyc_projects_EnterpriseCyc_OWL_I, file_number );
    return owl_import_file_round_trip_test( filename, verboseP, keep_kbP, keep_fileP, list_utilities.merge_plist( exporter_options, ConsesLow.list( $kw82$RESTRICT_CONTEXT_, T, $kw83$SUPPRESS_EXPORT_OF_DERIVED_KNOWLEDGE_,
        T, $kw84$SUPPRESS_ADDITIONAL_TYPE_TRIPLES_, T ) ), importer_options );
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 16362L)
  public static SubLObject owl_import_file_quiescence_test(final SubLObject filename, SubLObject verboseP, SubLObject keep_kbP, SubLObject keep_filesP, SubLObject exporter_options, SubLObject importer_options)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    if( keep_kbP == UNPROVIDED )
    {
      keep_kbP = NIL;
    }
    if( keep_filesP == UNPROVIDED )
    {
      keep_filesP = NIL;
    }
    if( exporter_options == UNPROVIDED )
    {
      exporter_options = NIL;
    }
    if( importer_options == UNPROVIDED )
    {
      importer_options = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
    try
    {
      api_control_vars.$the_cyclist$.bind( $const70$CycAdministrator, thread );
      final SubLObject max_iterations = THREE_INTEGER;
      SubLObject next_import_filename = filename;
      SubLObject last_export_filename = NIL;
      SubLObject last_import_graph = NIL;
      SubLObject last_export_graph = NIL;
      format_nil.force_format( T, $str67$___A__, file_utilities.pathstring_filename( filename ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != verboseP )
      {
        format_nil.force_format( T, $str68$TESTING_LOUDLY__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        importer_options = conses_high.putf( importer_options, $kw69$VERBOSE_, verboseP );
        exporter_options = conses_high.putf( exporter_options, $kw69$VERBOSE_, verboseP );
      }
      SubLObject iteration_num;
      SubLObject importer;
      SubLObject import_graph;
      SubLObject ontology_term;
      SubLObject exporter_filename;
      SubLObject exporter;
      SubLObject export_graph;
      for( iteration_num = NIL, iteration_num = ZERO_INTEGER; iteration_num.numL( max_iterations ); iteration_num = Numbers.add( iteration_num, ONE_INTEGER ) )
      {
        importer = owl_importer2.owl_import_file( next_import_filename, importer_options );
        import_graph = owl_importer2.owl_importer2_graph( importer );
        ontology_term = owl_importer2.owl_importer2_get_option( importer, $kw71$ONTOLOGY_TERM, UNPROVIDED );
        exporter_filename = file_utilities.make_temp_filename( file_utilities.temp_directory() );
        exporter = owl_exporter2.owl_export_ontology_to_file( ontology_term, exporter_filename, exporter_options );
        export_graph = owl_exporter2.owl_exporter2_graph( exporter );
        format_nil.force_format( T, $str85$_A__A__A__, iteration_num, rdf_graph.rdf_graph_triple_count( import_graph ), rdf_graph.rdf_graph_triple_count( export_graph ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
            UNPROVIDED );
        if( NIL != rdf_graph.rdf_graph_p( last_export_graph ) && NIL != rdf_graph.rdf_graph_p( last_import_graph ) && rdf_graph.rdf_graph_triple_count( last_export_graph ).eql( rdf_graph.rdf_graph_triple_count(
            last_import_graph ) ) && rdf_graph.rdf_graph_triple_count( last_import_graph ).eql( rdf_graph.rdf_graph_triple_count( import_graph ) ) && rdf_graph.rdf_graph_triple_count( import_graph ).eql( rdf_graph
                .rdf_graph_triple_count( export_graph ) ) )
        {
          format_nil.force_format( T, $str86$_A__A__, $kw74$OK, iteration_num, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          return Values.values( $kw74$OK, iteration_num );
        }
        last_import_graph = import_graph;
        last_export_graph = export_graph;
        if( NIL == keep_kbP )
        {
          ke.ke_kill_now( ontology_term );
        }
        if( NIL == keep_filesP && NIL == Strings.stringE( next_import_filename, filename, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          Filesys.delete_file( next_import_filename );
        }
        next_import_filename = exporter_filename;
        last_export_filename = exporter_filename;
      }
      if( NIL == keep_filesP && NIL == Strings.stringE( last_export_filename, filename, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        Filesys.delete_file( last_export_filename );
      }
      format_nil.force_format( T, $str79$_A__, $kw73$FAIL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return Values.values( $kw73$FAIL, max_iterations );
    }
    finally
    {
      api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/owl/owl-utilities.lisp", position = 16362L)
  public static SubLObject owl_import_file_quiescence_test_owl_dl(final SubLObject file_number, SubLObject verboseP, SubLObject keep_kbP, SubLObject keep_fileP, SubLObject exporter_options, SubLObject importer_options)
  {
    if( verboseP == UNPROVIDED )
    {
      verboseP = NIL;
    }
    if( keep_kbP == UNPROVIDED )
    {
      keep_kbP = NIL;
    }
    if( keep_fileP == UNPROVIDED )
    {
      keep_fileP = NIL;
    }
    if( exporter_options == UNPROVIDED )
    {
      exporter_options = NIL;
    }
    if( importer_options == UNPROVIDED )
    {
      importer_options = NIL;
    }
    final SubLObject filename = PrintLow.format( NIL, $str81$_cyc_projects_EnterpriseCyc_OWL_I, file_number );
    return owl_import_file_quiescence_test( filename, verboseP, keep_kbP, keep_fileP, exporter_options, importer_options );
  }

  public static SubLObject declare_owl_utilities_file()
  {
    SubLFiles.declareFunction( me, "clear_owl_caches", "CLEAR-OWL-CACHES", 0, 0, false );
    SubLFiles.declareFunction( me, "owl_namespace", "OWL-NAMESPACE", 0, 0, false );
    SubLFiles.declareFunction( me, "owl11_namespace", "OWL11-NAMESPACE", 0, 0, false );
    SubLFiles.declareFunction( me, "owl_namespace_uriP", "OWL-NAMESPACE-URI?", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_warnP", "OWL-WARN?", 0, 0, false );
    SubLFiles.declareMacro( me, "owl_warn", "OWL-WARN" );
    SubLFiles.declareMacro( me, "owl_note", "OWL-NOTE" );
    SubLFiles.declareFunction( me, "clear_owl_name", "CLEAR-OWL-NAME", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_owl_name", "REMOVE-OWL-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_name_internal", "OWL-NAME-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_name", "OWL-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_owl_expanded_name", "CLEAR-OWL-EXPANDED-NAME", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_owl_expanded_name", "REMOVE-OWL-EXPANDED-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_expanded_name_internal", "OWL-EXPANDED-NAME-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_expanded_name", "OWL-EXPANDED-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_owl11_name", "CLEAR-OWL11-NAME", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_owl11_name", "REMOVE-OWL11-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "owl11_name_internal", "OWL11-NAME-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "owl11_name", "OWL11-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_owl11_expanded_name", "CLEAR-OWL11-EXPANDED-NAME", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_owl11_expanded_name", "REMOVE-OWL11-EXPANDED-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "owl11_expanded_name_internal", "OWL11-EXPANDED-NAME-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "owl11_expanded_name", "OWL11-EXPANDED-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_create_wff", "OWL-CREATE-WFF", 5, 1, false );
    SubLFiles.declareFunction( me, "owl_create_new_constant_wff", "OWL-CREATE-NEW-CONSTANT-WFF", 5, 0, false );
    SubLFiles.declareFunction( me, "owl_create_new_constant_wff_non_rkf", "OWL-CREATE-NEW-CONSTANT-WFF-NON-RKF", 5, 0, false );
    SubLFiles.declareFunction( me, "owl_assert_wff_internal", "OWL-ASSERT-WFF-INTERNAL", 2, 3, false );
    SubLFiles.declareFunction( me, "owl_assert_wff", "OWL-ASSERT-WFF", 2, 3, false );
    SubLFiles.declareFunction( me, "implementation_uriP", "IMPLEMENTATION-URI?", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_xmlns_plist", "RDF-GRAPH-XMLNS-PLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_abbrev_prefix_and_name_for_uri", "RDF-ABBREV-PREFIX-AND-NAME-FOR-URI", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_node_abbreviation_string", "RDF-GRAPH-NODE-ABBREVIATION-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "owl_importer_use_rkfP", "OWL-IMPORTER-USE-RKF?", 0, 0, false );
    SubLFiles.declareFunction( me, "owl_assert_low_wff", "OWL-ASSERT-LOW-WFF", 2, 0, false );
    SubLFiles.declareFunction( me, "note_sentence_asserted", "NOTE-SENTENCE-ASSERTED", 3, 0, false );
    SubLFiles.declareFunction( me, "note_term_acted_on_during_import_internal", "NOTE-TERM-ACTED-ON-DURING-IMPORT-INTERNAL", 2, 1, false );
    SubLFiles.declareFunction( me, "note_term_acted_on_during_import", "NOTE-TERM-ACTED-ON-DURING-IMPORT", 2, 1, false );
    SubLFiles.declareFunction( me, "rdf_graph_root_classes", "RDF-GRAPH-ROOT-CLASSES", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_root_concepts", "RDF-GRAPH-ROOT-CONCEPTS", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_graph_object_properties_without_ranges", "RDF-GRAPH-OBJECT-PROPERTIES-WITHOUT-RANGES", 1, 0, false );
    SubLFiles.declareFunction( me, "count_outgoing_sameas_links", "COUNT-OUTGOING-SAMEAS-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "count_all_sameas_links", "COUNT-ALL-SAMEAS-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "classify_sameas_links_by_namespace", "CLASSIFY-SAMEAS-LINKS-BY-NAMESPACE", 1, 0, false );
    SubLFiles.declareFunction( me, "classify_sameas_links_by_domain", "CLASSIFY-SAMEAS-LINKS-BY-DOMAIN", 1, 0, false );
    SubLFiles.declareFunction( me, "find_weird_sameas_links", "FIND-WEIRD-SAMEAS-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_intersection_of_node_p", "OWL-INTERSECTION-OF-NODE-P", 2, 0, false );
    SubLFiles.declareFunction( me, "owl_union_of_node_p", "OWL-UNION-OF-NODE-P", 2, 0, false );
    SubLFiles.declareFunction( me, "owl_complement_of_node_p", "OWL-COMPLEMENT-OF-NODE-P", 2, 0, false );
    SubLFiles.declareFunction( me, "owl_restriction_node_p", "OWL-RESTRICTION-NODE-P", 2, 0, false );
    SubLFiles.declareFunction( me, "owl_one_of_node_p", "OWL-ONE-OF-NODE-P", 2, 0, false );
    SubLFiles.declareFunction( me, "owl_debug_show_options", "OWL-DEBUG-SHOW-OPTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_debug_show_graph", "OWL-DEBUG-SHOW-GRAPH", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_debug_show_graph_info", "OWL-DEBUG-SHOW-GRAPH-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_debug_show_triples", "OWL-DEBUG-SHOW-TRIPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "owl_import_file_round_trip_test", "OWL-IMPORT-FILE-ROUND-TRIP-TEST", 1, 5, false );
    SubLFiles.declareFunction( me, "owl_import_file_round_trip_test_owl_dl", "OWL-IMPORT-FILE-ROUND-TRIP-TEST-OWL-DL", 1, 5, false );
    SubLFiles.declareFunction( me, "owl_import_file_quiescence_test", "OWL-IMPORT-FILE-QUIESCENCE-TEST", 1, 5, false );
    SubLFiles.declareFunction( me, "owl_import_file_quiescence_test_owl_dl", "OWL-IMPORT-FILE-QUIESCENCE-TEST-OWL-DL", 1, 5, false );
    return NIL;
  }

  public static SubLObject init_owl_utilities_file()
  {
    $owl_namespace$ = SubLFiles.deflexical( "*OWL-NAMESPACE*", $str0$http___www_w3_org_2002_07_owl_ );
    $owl11_namespace$ = SubLFiles.deflexical( "*OWL11-NAMESPACE*", $str1$http___www_w3_org_2006_12_owl11_ );
    $owl_warnP$ = SubLFiles.defparameter( "*OWL-WARN?*", T );
    $owl_verboseP$ = SubLFiles.defparameter( "*OWL-VERBOSE?*", NIL );
    $owl_name_caching_state$ = SubLFiles.deflexical( "*OWL-NAME-CACHING-STATE*", NIL );
    $owl_expanded_name_caching_state$ = SubLFiles.deflexical( "*OWL-EXPANDED-NAME-CACHING-STATE*", NIL );
    $owl11_name_caching_state$ = SubLFiles.deflexical( "*OWL11-NAME-CACHING-STATE*", NIL );
    $owl11_expanded_name_caching_state$ = SubLFiles.deflexical( "*OWL11-EXPANDED-NAME-CACHING-STATE*", NIL );
    $owl_importer_use_rkfP$ = SubLFiles.defparameter( "*OWL-IMPORTER-USE-RKF?*", T );
    return NIL;
  }

  public static SubLObject setup_owl_utilities_file()
  {
    memoization_state.note_globally_cached_function( $sym12$OWL_NAME );
    memoization_state.note_globally_cached_function( $sym15$OWL_EXPANDED_NAME );
    memoization_state.note_globally_cached_function( $sym17$OWL11_NAME );
    memoization_state.note_globally_cached_function( $sym20$OWL11_EXPANDED_NAME );
    memoization_state.note_memoized_function( $sym27$OWL_ASSERT_WFF );
    memoization_state.note_memoized_function( $sym40$NOTE_TERM_ACTED_ON_DURING_IMPORT );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_owl_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_owl_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_owl_utilities_file();
  }
  static
  {
    me = new owl_utilities();
    $owl_namespace$ = null;
    $owl11_namespace$ = null;
    $owl_warnP$ = null;
    $owl_verboseP$ = null;
    $owl_name_caching_state$ = null;
    $owl_expanded_name_caching_state$ = null;
    $owl11_name_caching_state$ = null;
    $owl11_expanded_name_caching_state$ = null;
    $owl_importer_use_rkfP$ = null;
    $str0$http___www_w3_org_2002_07_owl_ = makeString( "http://www.w3.org/2002/07/owl#" );
    $str1$http___www_w3_org_2006_12_owl11_ = makeString( "http://www.w3.org/2006/12/owl11#" );
    $list2 = ConsesLow.list( makeSymbol( "FORMAT-STR" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym3$PWHEN = makeSymbol( "PWHEN" );
    $list4 = ConsesLow.list( makeSymbol( "OWL-WARN?" ) );
    $sym5$WARN = makeSymbol( "WARN" );
    $sym6$_OWL_VERBOSE__ = makeSymbol( "*OWL-VERBOSE?*" );
    $sym7$FORMAT = makeSymbol( "FORMAT" );
    $sym8$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $str9$__ = makeString( "~&" );
    $list10 = ConsesLow.list( makeString( "~%" ) );
    $list11 = ConsesLow.list( ConsesLow.list( makeSymbol( "FORCE-OUTPUT" ) ) );
    $sym12$OWL_NAME = makeSymbol( "OWL-NAME" );
    $str13$owl_ = makeString( "owl:" );
    $sym14$_OWL_NAME_CACHING_STATE_ = makeSymbol( "*OWL-NAME-CACHING-STATE*" );
    $sym15$OWL_EXPANDED_NAME = makeSymbol( "OWL-EXPANDED-NAME" );
    $sym16$_OWL_EXPANDED_NAME_CACHING_STATE_ = makeSymbol( "*OWL-EXPANDED-NAME-CACHING-STATE*" );
    $sym17$OWL11_NAME = makeSymbol( "OWL11-NAME" );
    $str18$owl11_ = makeString( "owl11:" );
    $sym19$_OWL11_NAME_CACHING_STATE_ = makeSymbol( "*OWL11-NAME-CACHING-STATE*" );
    $sym20$OWL11_EXPANDED_NAME = makeSymbol( "OWL11-EXPANDED-NAME" );
    $sym21$_OWL11_EXPANDED_NAME_CACHING_STATE_ = makeSymbol( "*OWL11-EXPANDED-NAME-CACHING-STATE*" );
    $sym22$VALID_CONSTANT_NAME_CHAR_P = makeSymbol( "VALID-CONSTANT-NAME-CHAR-P" );
    $str23$_ = makeString( "-" );
    $kw24$UPCASE = makeKeyword( "UPCASE" );
    $kw25$DOWNCASE = makeKeyword( "DOWNCASE" );
    $const26$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $sym27$OWL_ASSERT_WFF = makeSymbol( "OWL-ASSERT-WFF" );
    $sym28$CYCLIST_ = makeSymbol( "CYCLIST?" );
    $sym29$NON_ASCII_STRING_P = makeSymbol( "NON-ASCII-STRING-P" );
    $sym30$NON_ASCII_STRING_TO_UNICODE = makeSymbol( "NON-ASCII-STRING-TO-UNICODE" );
    $str31$Already_know__S___in__S = makeString( "Already know ~S~% in ~S" );
    $str32$__ = makeString( "~%" );
    $str33$Failed_to_assert__S__ = makeString( "Failed to assert ~S~%" );
    $list34 = ConsesLow.cons( makeSymbol( "P" ), makeSymbol( "V" ) );
    $str35$xmlns = makeString( "xmlns" );
    $str36$xmlns_ = makeString( "xmlns:" );
    $sym37$RDF_URI_P = makeSymbol( "RDF-URI-P" );
    $list38 = ConsesLow.cons( makeSymbol( "PREFIX" ), makeSymbol( "NAMESPACE" ) );
    $str39$_ = makeString( ":" );
    $sym40$NOTE_TERM_ACTED_ON_DURING_IMPORT = makeSymbol( "NOTE-TERM-ACTED-ON-DURING-IMPORT" );
    $const41$termActedOnDuringOWLImport = constant_handles.reader_make_constant_shell( makeString( "termActedOnDuringOWLImport" ) );
    $const42$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $sym43$RDF_GRAPH_P = makeSymbol( "RDF-GRAPH-P" );
    $str44$subClassOf = makeString( "subClassOf" );
    $str45$type = makeString( "type" );
    $str46$Class = makeString( "Class" );
    $str47$broader = makeString( "broader" );
    $str48$range = makeString( "range" );
    $str49$ObjectProperty = makeString( "ObjectProperty" );
    $str50$sw_opencyc_org = makeString( "sw.opencyc.org" );
    $str51$sw_cyc_com = makeString( "sw.cyc.com" );
    $str52$sameAs = makeString( "sameAs" );
    $sym53$NUMBERP = makeSymbol( "NUMBERP" );
    $sym54$_ = makeSymbol( ">" );
    $str55$http___ = makeString( "http://" );
    $str56$intersectionOf = makeString( "intersectionOf" );
    $sym57$RDF_TRIPLE_PREDICATE = makeSymbol( "RDF-TRIPLE-PREDICATE" );
    $str58$unionOf = makeString( "unionOf" );
    $str59$complementOf = makeString( "complementOf" );
    $str60$Restriction = makeString( "Restriction" );
    $str61$onProperty = makeString( "onProperty" );
    $str62$oneOf = makeString( "oneOf" );
    $str63$Using_options___ = makeString( "Using options:~%" );
    $str64$___S_____S__ = makeString( "  ~S -> ~S~%" );
    $str65$___A_nodes____A_triples___ = makeString( "~&~A nodes / ~A triples.~%" );
    $str66$___S__ = makeString( "  ~S~%" );
    $str67$___A__ = makeString( "  ~A: " );
    $str68$TESTING_LOUDLY__ = makeString( "TESTING LOUDLY~%" );
    $kw69$VERBOSE_ = makeKeyword( "VERBOSE?" );
    $const70$CycAdministrator = constant_handles.reader_make_constant_shell( makeString( "CycAdministrator" ) );
    $kw71$ONTOLOGY_TERM = makeKeyword( "ONTOLOGY-TERM" );
    $str72$_________________________________ = makeString( "~&--------------------------------------------------------------------------------~%" );
    $kw73$FAIL = makeKeyword( "FAIL" );
    $kw74$OK = makeKeyword( "OK" );
    $str75$_A__import____export___A__ = makeString( "~A: import -> export: ~A~%" );
    $str76$_A_ = makeString( "~A " );
    $str77$_A__export____import2___A__ = makeString( "~A: export -> import2: ~A~%" );
    $str78$_A__import____import2___A__ = makeString( "~A: import -> import2: ~A~%" );
    $str79$_A__ = makeString( "~A~%" );
    $sym80$_EXIT = makeSymbol( "%EXIT" );
    $str81$_cyc_projects_EnterpriseCyc_OWL_I = makeString( "/cyc/projects/EnterpriseCyc/OWL-Import-Export/tests/OWLDLImportTestSuiteOntologies/ontology~3,'0D.owl" );
    $kw82$RESTRICT_CONTEXT_ = makeKeyword( "RESTRICT-CONTEXT?" );
    $kw83$SUPPRESS_EXPORT_OF_DERIVED_KNOWLEDGE_ = makeKeyword( "SUPPRESS-EXPORT-OF-DERIVED-KNOWLEDGE?" );
    $kw84$SUPPRESS_ADDITIONAL_TYPE_TRIPLES_ = makeKeyword( "SUPPRESS-ADDITIONAL-TYPE-TRIPLES?" );
    $str85$_A__A__A__ = makeString( "~A(~A ~A) " );
    $str86$_A__A__ = makeString( "~A ~A~%" );
  }
}
/*
 * 
 * Total time: 412 ms
 * 
 */