package com.cyc.cycjava.cycl.rdf;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.xml_parsing_utilities;
import com.cyc.cycjava.cycl.owl.owl_to_cycl;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.unicode_nauts;
import com.cyc.cycjava.cycl.unicode_strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rdf_literal
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rdf.rdf_literal";
  public static final String myFingerPrint = "70ac18a4df4422bdf9b0e087893c12af042a3111e13f6a9f4d8594e3506bca85";
  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 1755L)
  public static SubLSymbol $dtp_rdf_literal$;
  private static final SubLSymbol $sym0$RDF_LITERAL;
  private static final SubLSymbol $sym1$RDF_LITERAL_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PRINT_RDF_LITERAL;
  private static final SubLSymbol $sym7$RDF_LITERAL_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$RDF_LIT_UTF8_LEXICAL_FORM;
  private static final SubLSymbol $sym10$_CSETF_RDF_LIT_UTF8_LEXICAL_FORM;
  private static final SubLSymbol $sym11$RDF_LIT_LANGUAGE_TAG;
  private static final SubLSymbol $sym12$_CSETF_RDF_LIT_LANGUAGE_TAG;
  private static final SubLSymbol $sym13$RDF_LIT_DATATYPE;
  private static final SubLSymbol $sym14$_CSETF_RDF_LIT_DATATYPE;
  private static final SubLSymbol $kw15$UTF8_LEXICAL_FORM;
  private static final SubLSymbol $kw16$LANGUAGE_TAG;
  private static final SubLSymbol $kw17$DATATYPE;
  private static final SubLString $str18$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw19$BEGIN;
  private static final SubLSymbol $sym20$MAKE_RDF_LITERAL;
  private static final SubLSymbol $kw21$SLOT;
  private static final SubLSymbol $kw22$END;
  private static final SubLSymbol $sym23$VISIT_DEFSTRUCT_OBJECT_RDF_LITERAL_METHOD;
  private static final SubLString $str24$_RDF_LITERAL__S;
  private static final SubLString $str25$__S;
  private static final SubLString $str26$_;
  private static final SubLSymbol $sym27$STRINGP;
  private static final SubLSymbol $sym28$VALID_RDF_LITERAL_DATATYPE_P;
  private static final SubLString $str29$en;
  private static final SubLString $str30$string;
  private static final SubLString $str31$__literal_;
  private static final SubLString $str32$lang;
  private static final SubLString $str33$datatype;
  private static final SubLString $str34$boolean;
  private static final SubLString $str35$integer;
  private static final SubLString $str36$nonPositiveInteger;
  private static final SubLString $str37$negativeInteger;
  private static final SubLString $str38$long;
  private static final SubLString $str39$int;
  private static final SubLString $str40$short;
  private static final SubLString $str41$byte;
  private static final SubLString $str42$nonNegativeInteger;
  private static final SubLString $str43$unsignedLong;
  private static final SubLString $str44$unsignedShort;
  private static final SubLString $str45$unsignedByte;
  private static final SubLString $str46$positiveInteger;
  private static final SubLString $str47$double;
  private static final SubLString $str48$float;
  private static final SubLString $str49$decimal;
  private static final SubLString $str50$date;
  private static final SubLString $str51$time;
  private static final SubLString $str52$dateTime;
  private static final SubLString $str53$anyURI;
  private static final SubLSymbol $sym54$SXHASH_RDF_LITERAL_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 870L)
  public static SubLObject rdf_literal_equal_p(final SubLObject literal1, final SubLObject literal2)
  {
    return makeBoolean( rdf_literal_utf8_lexical_form( literal1 ).equal( rdf_literal_utf8_lexical_form( literal2 ) ) && rdf_literal_language_tag( literal1 ).equal( rdf_literal_language_tag( literal2 ) )
        && rdf_literal_datatype( literal1 ).equal( rdf_literal_datatype( literal2 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 1196L)
  public static SubLObject rdf_literal_L(final SubLObject literal1, final SubLObject literal2)
  {
    return Strings.stringL( rdf_literal_utf8_lexical_form( literal1 ), rdf_literal_utf8_lexical_form( literal2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 1347L)
  public static SubLObject rdf_literal_cyc_string(final SubLObject v_rdf_literal)
  {
    final SubLObject utf8 = rdf_literal_utf8_lexical_form( v_rdf_literal );
    return ( NIL != unicode_strings.ascii_string_p( utf8 ) ) ? utf8 : unicode_nauts.non_ascii_string_to_unicode( utf8 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 1755L)
  public static SubLObject rdf_literal_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_rdf_literal( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 1755L)
  public static SubLObject rdf_literal_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $rdf_literal_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 1755L)
  public static SubLObject rdf_lit_utf8_lexical_form(final SubLObject v_object)
  {
    assert NIL != rdf_literal_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 1755L)
  public static SubLObject rdf_lit_language_tag(final SubLObject v_object)
  {
    assert NIL != rdf_literal_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 1755L)
  public static SubLObject rdf_lit_datatype(final SubLObject v_object)
  {
    assert NIL != rdf_literal_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 1755L)
  public static SubLObject _csetf_rdf_lit_utf8_lexical_form(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rdf_literal_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 1755L)
  public static SubLObject _csetf_rdf_lit_language_tag(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rdf_literal_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 1755L)
  public static SubLObject _csetf_rdf_lit_datatype(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rdf_literal_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 1755L)
  public static SubLObject make_rdf_literal(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $rdf_literal_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw15$UTF8_LEXICAL_FORM ) )
      {
        _csetf_rdf_lit_utf8_lexical_form( v_new, current_value );
      }
      else if( pcase_var.eql( $kw16$LANGUAGE_TAG ) )
      {
        _csetf_rdf_lit_language_tag( v_new, current_value );
      }
      else if( pcase_var.eql( $kw17$DATATYPE ) )
      {
        _csetf_rdf_lit_datatype( v_new, current_value );
      }
      else
      {
        Errors.error( $str18$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 1755L)
  public static SubLObject visit_defstruct_rdf_literal(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw19$BEGIN, $sym20$MAKE_RDF_LITERAL, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw15$UTF8_LEXICAL_FORM, rdf_lit_utf8_lexical_form( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw16$LANGUAGE_TAG, rdf_lit_language_tag( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw17$DATATYPE, rdf_lit_datatype( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$END, $sym20$MAKE_RDF_LITERAL, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 1755L)
  public static SubLObject visit_defstruct_object_rdf_literal_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_rdf_literal( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 1906L)
  public static SubLObject print_rdf_literal(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str24$_RDF_LITERAL__S, rdf_literal_utf8_lexical_form( v_object ) );
    if( NIL != rdf_literal_language_tag( v_object ) )
    {
      PrintLow.format( stream, $str25$__S, rdf_literal_language_tag( v_object ) );
    }
    if( NIL != rdf_literal_datatype( v_object ) )
    {
      PrintLow.format( stream, $str25$__S, rdf_literal_datatype( v_object ) );
    }
    print_high.princ( $str26$_, stream );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 2300L)
  public static SubLObject new_rdf_literal(final SubLObject utf8_lexical_form, final SubLObject language_tag, final SubLObject datatype)
  {
    assert NIL != Types.stringp( utf8_lexical_form ) : utf8_lexical_form;
    if( NIL != language_tag && !assertionsDisabledInClass && NIL == Types.stringp( language_tag ) )
    {
      throw new AssertionError( language_tag );
    }
    if( NIL != datatype && !assertionsDisabledInClass && NIL == valid_rdf_literal_datatype_p( datatype ) )
    {
      throw new AssertionError( datatype );
    }
    final SubLObject literal = make_rdf_literal( UNPROVIDED );
    _csetf_rdf_lit_utf8_lexical_form( literal, utf8_lexical_form );
    if( NIL != string_utilities.non_empty_string_p( language_tag ) )
    {
      _csetf_rdf_lit_language_tag( literal, Strings.string_downcase( language_tag, UNPROVIDED, UNPROVIDED ) );
    }
    if( NIL != datatype )
    {
      _csetf_rdf_lit_datatype( literal, ( NIL != rdf_uri.rdf_uri_p( datatype ) ) ? datatype : get_datatype_uri( datatype ) );
    }
    return literal;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 2939L)
  public static SubLObject new_rdf_string_literal(final SubLObject utf8_lexical_form, SubLObject language)
  {
    if( language == UNPROVIDED )
    {
      language = $str29$en;
    }
    return new_rdf_literal( utf8_lexical_form, language, rdf_utilities.xsd_expanded_name( $str30$string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 3110L)
  public static SubLObject new_rdf_literal_from_sparql_results_xml(final SubLObject utf8_xml_form)
  {
    assert NIL != Types.stringp( utf8_xml_form ) : utf8_xml_form;
    final SubLObject literal_tag_end = Sequences.search( $str26$_, utf8_xml_form, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, NIL, ZERO_INTEGER, UNPROVIDED );
    final SubLObject literal_start = number_utilities.f_1X( literal_tag_end );
    final SubLObject literal_end = Sequences.search( $str31$__literal_, utf8_xml_form, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, NIL, literal_start, UNPROVIDED );
    final SubLObject literal_value = string_utilities.substring( utf8_xml_form, literal_start, literal_end );
    final SubLObject literal_tag = string_utilities.substring( utf8_xml_form, ZERO_INTEGER, literal_start );
    final SubLObject language = xml_parsing_utilities.xml_tag_attribute_value( literal_tag, owl_to_cycl.xml_name( $str32$lang ), UNPROVIDED );
    final SubLObject datatype = xml_parsing_utilities.xml_tag_attribute_value( literal_tag, $str33$datatype, UNPROVIDED );
    final SubLObject literal = make_rdf_literal( UNPROVIDED );
    _csetf_rdf_lit_utf8_lexical_form( literal, literal_value );
    if( NIL != string_utilities.non_empty_string_p( language ) )
    {
      _csetf_rdf_lit_language_tag( literal, language );
    }
    if( NIL != datatype )
    {
      _csetf_rdf_lit_datatype( literal, ( NIL != rdf_uri.rdf_uri_p( datatype ) ) ? datatype : get_datatype_uri( datatype ) );
    }
    return literal;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 4082L)
  public static SubLObject valid_rdf_literal_datatype_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != rdf_datatype_uri_p( v_object ) || NIL != web_utilities.uri_p( v_object, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 4202L)
  public static SubLObject rdf_datatype_uri_p(final SubLObject v_object)
  {
    return rdf_uri.rdf_uri_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 4274L)
  public static SubLObject rdf_boolean_literal_p(final SubLObject literal)
  {
    final SubLObject datatype = rdf_literal_datatype( literal );
    return makeBoolean( NIL != rdf_uri.rdf_uri_p( datatype ) && rdf_uri.rdf_uri_utf8_string( datatype ).equal( rdf_utilities.xsd_expanded_name( $str34$boolean ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 4494L)
  public static SubLObject rdf_string_literal_p(final SubLObject literal)
  {
    final SubLObject datatype = rdf_literal_datatype( literal );
    return makeBoolean( NIL != rdf_uri.rdf_uri_p( datatype ) && rdf_uri.rdf_uri_utf8_string( datatype ).equal( rdf_utilities.xsd_expanded_name( $str30$string ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 4712L)
  public static SubLObject rdf_integer_literal_p(final SubLObject literal)
  {
    final SubLObject datatype = rdf_literal_datatype( literal );
    return makeBoolean( NIL != rdf_uri.rdf_uri_p( datatype ) && ( rdf_uri.rdf_uri_utf8_string( datatype ).equal( rdf_utilities.xsd_expanded_name( $str35$integer ) ) || rdf_uri.rdf_uri_utf8_string( datatype ).equal(
        rdf_utilities.xsd_expanded_name( $str36$nonPositiveInteger ) ) || rdf_uri.rdf_uri_utf8_string( datatype ).equal( rdf_utilities.xsd_expanded_name( $str37$negativeInteger ) ) || rdf_uri.rdf_uri_utf8_string(
            datatype ).equal( rdf_utilities.xsd_expanded_name( $str38$long ) ) || rdf_uri.rdf_uri_utf8_string( datatype ).equal( rdf_utilities.xsd_expanded_name( $str39$int ) ) || rdf_uri.rdf_uri_utf8_string( datatype )
                .equal( rdf_utilities.xsd_expanded_name( $str40$short ) ) || rdf_uri.rdf_uri_utf8_string( datatype ).equal( rdf_utilities.xsd_expanded_name( $str41$byte ) ) || rdf_uri.rdf_uri_utf8_string( datatype )
                    .equal( rdf_utilities.xsd_expanded_name( $str42$nonNegativeInteger ) ) || rdf_uri.rdf_uri_utf8_string( datatype ).equal( rdf_utilities.xsd_expanded_name( $str43$unsignedLong ) ) || rdf_uri
                        .rdf_uri_utf8_string( datatype ).equal( rdf_utilities.xsd_expanded_name( $str44$unsignedShort ) ) || rdf_uri.rdf_uri_utf8_string( datatype ).equal( rdf_utilities.xsd_expanded_name(
                            $str45$unsignedByte ) ) || rdf_uri.rdf_uri_utf8_string( datatype ).equal( rdf_utilities.xsd_expanded_name( $str46$positiveInteger ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 5796L)
  public static SubLObject rdf_double_literal_p(final SubLObject literal)
  {
    final SubLObject datatype = rdf_literal_datatype( literal );
    return makeBoolean( NIL != rdf_uri.rdf_uri_p( datatype ) && ( rdf_uri.rdf_uri_utf8_string( datatype ).equal( rdf_utilities.xsd_expanded_name( $str47$double ) ) || rdf_uri.rdf_uri_utf8_string( datatype ).equal(
        rdf_utilities.xsd_expanded_name( $str48$float ) ) || rdf_uri.rdf_uri_utf8_string( datatype ).equal( rdf_utilities.xsd_expanded_name( $str49$decimal ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 6195L)
  public static SubLObject rdf_date_literal_p(final SubLObject literal)
  {
    final SubLObject datatype = rdf_literal_datatype( literal );
    return makeBoolean( NIL != rdf_uri.rdf_uri_p( datatype ) && ( rdf_uri.rdf_uri_utf8_string( datatype ).equal( rdf_utilities.xsd_expanded_name( $str50$date ) ) || rdf_uri.rdf_uri_utf8_string( datatype ).equal(
        rdf_utilities.xsd_expanded_name( $str51$time ) ) || rdf_uri.rdf_uri_utf8_string( datatype ).equal( rdf_utilities.xsd_expanded_name( $str52$dateTime ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 6590L)
  public static SubLObject rdf_uri_literal_p(final SubLObject literal)
  {
    final SubLObject datatype = rdf_literal_datatype( literal );
    return makeBoolean( NIL != rdf_uri.rdf_uri_p( datatype ) && rdf_uri.rdf_uri_utf8_string( datatype ).equal( rdf_utilities.xsd_expanded_name( $str53$anyURI ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 6805L)
  public static SubLObject get_datatype_uri(final SubLObject datatype_uri)
  {
    assert NIL != Types.stringp( datatype_uri ) : datatype_uri;
    return rdf_uri.get_rdf_uri( datatype_uri, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 6928L)
  public static SubLObject rdf_literal_utf8_lexical_form(final SubLObject literal)
  {
    assert NIL != rdf_literal_p( literal ) : literal;
    return rdf_lit_utf8_lexical_form( literal );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 7081L)
  public static SubLObject rdf_literal_language_tag(final SubLObject literal)
  {
    assert NIL != rdf_literal_p( literal ) : literal;
    return rdf_lit_language_tag( literal );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 7212L)
  public static SubLObject rdf_literal_datatype(final SubLObject literal)
  {
    assert NIL != rdf_literal_p( literal ) : literal;
    return rdf_lit_datatype( literal );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 7335L)
  public static SubLObject sxhash_rdf_literal_method(final SubLObject v_object)
  {
    return sxhash_rdf_literal( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-literal.lisp", position = 7437L)
  public static SubLObject sxhash_rdf_literal(final SubLObject literal)
  {
    return Sxhash.sxhash( rdf_lit_utf8_lexical_form( literal ) );
  }

  public static SubLObject declare_rdf_literal_file()
  {
    SubLFiles.declareFunction( me, "rdf_literal_equal_p", "RDF-LITERAL-EQUAL-P", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_literal_L", "RDF-LITERAL-<", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_literal_cyc_string", "RDF-LITERAL-CYC-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_literal_print_function_trampoline", "RDF-LITERAL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_literal_p", "RDF-LITERAL-P", 1, 0, false );
    new $rdf_literal_p$UnaryFunction();
    SubLFiles.declareFunction( me, "rdf_lit_utf8_lexical_form", "RDF-LIT-UTF8-LEXICAL-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_lit_language_tag", "RDF-LIT-LANGUAGE-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_lit_datatype", "RDF-LIT-DATATYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rdf_lit_utf8_lexical_form", "_CSETF-RDF-LIT-UTF8-LEXICAL-FORM", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rdf_lit_language_tag", "_CSETF-RDF-LIT-LANGUAGE-TAG", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rdf_lit_datatype", "_CSETF-RDF-LIT-DATATYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_rdf_literal", "MAKE-RDF-LITERAL", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_rdf_literal", "VISIT-DEFSTRUCT-RDF-LITERAL", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_rdf_literal_method", "VISIT-DEFSTRUCT-OBJECT-RDF-LITERAL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_rdf_literal", "PRINT-RDF-LITERAL", 3, 0, false );
    SubLFiles.declareFunction( me, "new_rdf_literal", "NEW-RDF-LITERAL", 3, 0, false );
    SubLFiles.declareFunction( me, "new_rdf_string_literal", "NEW-RDF-STRING-LITERAL", 1, 1, false );
    SubLFiles.declareFunction( me, "new_rdf_literal_from_sparql_results_xml", "NEW-RDF-LITERAL-FROM-SPARQL-RESULTS-XML", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_rdf_literal_datatype_p", "VALID-RDF-LITERAL-DATATYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_datatype_uri_p", "RDF-DATATYPE-URI-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_boolean_literal_p", "RDF-BOOLEAN-LITERAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_string_literal_p", "RDF-STRING-LITERAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_integer_literal_p", "RDF-INTEGER-LITERAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_double_literal_p", "RDF-DOUBLE-LITERAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_date_literal_p", "RDF-DATE-LITERAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_uri_literal_p", "RDF-URI-LITERAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_datatype_uri", "GET-DATATYPE-URI", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_literal_utf8_lexical_form", "RDF-LITERAL-UTF8-LEXICAL-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_literal_language_tag", "RDF-LITERAL-LANGUAGE-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_literal_datatype", "RDF-LITERAL-DATATYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_rdf_literal_method", "SXHASH-RDF-LITERAL-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_rdf_literal", "SXHASH-RDF-LITERAL", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_rdf_literal_file()
  {
    $dtp_rdf_literal$ = SubLFiles.defconstant( "*DTP-RDF-LITERAL*", $sym0$RDF_LITERAL );
    return NIL;
  }

  public static SubLObject setup_rdf_literal_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_rdf_literal$.getGlobalValue(), Symbols.symbol_function( $sym7$RDF_LITERAL_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$RDF_LIT_UTF8_LEXICAL_FORM, $sym10$_CSETF_RDF_LIT_UTF8_LEXICAL_FORM );
    Structures.def_csetf( $sym11$RDF_LIT_LANGUAGE_TAG, $sym12$_CSETF_RDF_LIT_LANGUAGE_TAG );
    Structures.def_csetf( $sym13$RDF_LIT_DATATYPE, $sym14$_CSETF_RDF_LIT_DATATYPE );
    Equality.identity( $sym0$RDF_LITERAL );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rdf_literal$.getGlobalValue(), Symbols.symbol_function( $sym23$VISIT_DEFSTRUCT_OBJECT_RDF_LITERAL_METHOD ) );
    utilities_macros.note_funcall_helper_function( $sym6$PRINT_RDF_LITERAL );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_rdf_literal$.getGlobalValue(), Symbols.symbol_function( $sym54$SXHASH_RDF_LITERAL_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rdf_literal_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rdf_literal_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rdf_literal_file();
  }
  static
  {
    me = new rdf_literal();
    $dtp_rdf_literal$ = null;
    $sym0$RDF_LITERAL = makeSymbol( "RDF-LITERAL" );
    $sym1$RDF_LITERAL_P = makeSymbol( "RDF-LITERAL-P" );
    $list2 = ConsesLow.list( makeSymbol( "UTF8-LEXICAL-FORM" ), makeSymbol( "LANGUAGE-TAG" ), makeSymbol( "DATATYPE" ) );
    $list3 = ConsesLow.list( makeKeyword( "UTF8-LEXICAL-FORM" ), makeKeyword( "LANGUAGE-TAG" ), makeKeyword( "DATATYPE" ) );
    $list4 = ConsesLow.list( makeSymbol( "RDF-LIT-UTF8-LEXICAL-FORM" ), makeSymbol( "RDF-LIT-LANGUAGE-TAG" ), makeSymbol( "RDF-LIT-DATATYPE" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-RDF-LIT-UTF8-LEXICAL-FORM" ), makeSymbol( "_CSETF-RDF-LIT-LANGUAGE-TAG" ), makeSymbol( "_CSETF-RDF-LIT-DATATYPE" ) );
    $sym6$PRINT_RDF_LITERAL = makeSymbol( "PRINT-RDF-LITERAL" );
    $sym7$RDF_LITERAL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "RDF-LITERAL-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "RDF-LITERAL-P" ) );
    $sym9$RDF_LIT_UTF8_LEXICAL_FORM = makeSymbol( "RDF-LIT-UTF8-LEXICAL-FORM" );
    $sym10$_CSETF_RDF_LIT_UTF8_LEXICAL_FORM = makeSymbol( "_CSETF-RDF-LIT-UTF8-LEXICAL-FORM" );
    $sym11$RDF_LIT_LANGUAGE_TAG = makeSymbol( "RDF-LIT-LANGUAGE-TAG" );
    $sym12$_CSETF_RDF_LIT_LANGUAGE_TAG = makeSymbol( "_CSETF-RDF-LIT-LANGUAGE-TAG" );
    $sym13$RDF_LIT_DATATYPE = makeSymbol( "RDF-LIT-DATATYPE" );
    $sym14$_CSETF_RDF_LIT_DATATYPE = makeSymbol( "_CSETF-RDF-LIT-DATATYPE" );
    $kw15$UTF8_LEXICAL_FORM = makeKeyword( "UTF8-LEXICAL-FORM" );
    $kw16$LANGUAGE_TAG = makeKeyword( "LANGUAGE-TAG" );
    $kw17$DATATYPE = makeKeyword( "DATATYPE" );
    $str18$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw19$BEGIN = makeKeyword( "BEGIN" );
    $sym20$MAKE_RDF_LITERAL = makeSymbol( "MAKE-RDF-LITERAL" );
    $kw21$SLOT = makeKeyword( "SLOT" );
    $kw22$END = makeKeyword( "END" );
    $sym23$VISIT_DEFSTRUCT_OBJECT_RDF_LITERAL_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-RDF-LITERAL-METHOD" );
    $str24$_RDF_LITERAL__S = makeString( "<RDF-LITERAL ~S" );
    $str25$__S = makeString( " ~S" );
    $str26$_ = makeString( ">" );
    $sym27$STRINGP = makeSymbol( "STRINGP" );
    $sym28$VALID_RDF_LITERAL_DATATYPE_P = makeSymbol( "VALID-RDF-LITERAL-DATATYPE-P" );
    $str29$en = makeString( "en" );
    $str30$string = makeString( "string" );
    $str31$__literal_ = makeString( "</literal>" );
    $str32$lang = makeString( "lang" );
    $str33$datatype = makeString( "datatype" );
    $str34$boolean = makeString( "boolean" );
    $str35$integer = makeString( "integer" );
    $str36$nonPositiveInteger = makeString( "nonPositiveInteger" );
    $str37$negativeInteger = makeString( "negativeInteger" );
    $str38$long = makeString( "long" );
    $str39$int = makeString( "int" );
    $str40$short = makeString( "short" );
    $str41$byte = makeString( "byte" );
    $str42$nonNegativeInteger = makeString( "nonNegativeInteger" );
    $str43$unsignedLong = makeString( "unsignedLong" );
    $str44$unsignedShort = makeString( "unsignedShort" );
    $str45$unsignedByte = makeString( "unsignedByte" );
    $str46$positiveInteger = makeString( "positiveInteger" );
    $str47$double = makeString( "double" );
    $str48$float = makeString( "float" );
    $str49$decimal = makeString( "decimal" );
    $str50$date = makeString( "date" );
    $str51$time = makeString( "time" );
    $str52$dateTime = makeString( "dateTime" );
    $str53$anyURI = makeString( "anyURI" );
    $sym54$SXHASH_RDF_LITERAL_METHOD = makeSymbol( "SXHASH-RDF-LITERAL-METHOD" );
  }

  public static final class $rdf_literal_native
      extends
        SubLStructNative
  {
    public SubLObject $utf8_lexical_form;
    public SubLObject $language_tag;
    public SubLObject $datatype;
    private static final SubLStructDeclNative structDecl;

    public $rdf_literal_native()
    {
      this.$utf8_lexical_form = CommonSymbols.NIL;
      this.$language_tag = CommonSymbols.NIL;
      this.$datatype = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $rdf_literal_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$utf8_lexical_form;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$language_tag;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$datatype;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$utf8_lexical_form = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$language_tag = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$datatype = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $rdf_literal_native.class, $sym0$RDF_LITERAL, $sym1$RDF_LITERAL_P, $list2, $list3, new String[] { "$utf8_lexical_form", "$language_tag", "$datatype"
      }, $list4, $list5, $sym6$PRINT_RDF_LITERAL );
    }
  }

  public static final class $rdf_literal_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $rdf_literal_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RDF-LITERAL-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return rdf_literal_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 245 ms synthetic
 */