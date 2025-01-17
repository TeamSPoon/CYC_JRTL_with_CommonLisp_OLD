package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class json
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.json";
  public static final String myFingerPrint = "08726f33956b366397d3b4162803038c1ce65e46d1feaa300172d130b20e83f7";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1058L)
  public static SubLSymbol $json_stream$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1668L)
  public static SubLSymbol $json_special_chars$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3092L)
  public static SubLSymbol $json_sequence_startedP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3433L)
  public static SubLSymbol $json_indent_level$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3826L)
  public static SubLSymbol $json_object_startedP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5481L)
  public static SubLSymbol $print_json_indent_increment$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8208L)
  public static SubLSymbol $json_capitalize_keysP$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$CLET;
  private static final SubLSymbol $sym2$_JSON_STREAM_;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$SYMBOLP;
  private static final SubLSymbol $sym5$STREAM;
  private static final SubLSymbol $sym6$CWITH_OUTPUT_TO_STRING;
  private static final SubLSymbol $sym7$WITH_JSON_OUTPUT_TO_STREAM;
  private static final SubLList $list8;
  private static final SubLString $str9$_u_4__0x;
  private static final SubLInteger $int10$34;
  private static final SubLString $str11$__;
  private static final SubLInteger $int12$92;
  private static final SubLString $str13$__;
  private static final SubLSymbol $sym14$STRINGP;
  private static final SubLString $str15$_;
  private static final SubLString $str16$true;
  private static final SubLString $str17$false;
  private static final SubLString $str18$Can_t_serialize__S_to_JSON_;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$JSON_INDENT;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$PROGN;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$CHECK_TYPE;
  private static final SubLList $list33;
  private static final SubLList $list34;
  private static final SubLSymbol $sym35$JSON_PRINT;
  private static final SubLList $list36;
  private static final SubLList $list37;
  private static final SubLString $str38$_;
  private static final SubLString $str39$_;
  private static final SubLString $str40$_;
  private static final SubLList $list41;
  private static final SubLString $str42$null;
  private static final SubLSymbol $kw43$EMPTY_OBJECT;
  private static final SubLSymbol $kw44$EMPTY_ARRAY;
  private static final SubLObject $const45$True;
  private static final SubLObject $const46$False;
  private static final SubLString $str47$_D;
  private static final SubLString $str48$_F;
  private static final SubLString $str49$Could_not_handle_JSON_object__S;
  private static final SubLSymbol $sym50$KEYWORDP;
  private static final SubLSymbol $sym51$FILE_EXISTS_;
  private static final SubLSymbol $kw52$INPUT;
  private static final SubLString $str53$Unable_to_open__S;
  private static final SubLString $str54$Unexpected_JSON_when_reading__S__;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$ALPHANUMERIC_OR_NUMBER_CHAR_P;
  private static final SubLString $str57$Unexpected_JSON_when_reading_prim;
  private static final SubLString $str58$Unexpected_JSON_when_reading_to_c;
  private static final SubLString $str59$Unexpected_JSON_when_reading_to_c;
  private static final SubLString $str60$Unexpected_JSON_when_reading_to_E;
  private static final SubLSymbol $sym61$_EXIT;
  private static final SubLSymbol $sym62$JSON_ROUND_TRIP;
  private static final SubLSymbol $kw63$TEST;
  private static final SubLSymbol $kw64$OWNER;
  private static final SubLSymbol $kw65$CLASSES;
  private static final SubLSymbol $kw66$KB;
  private static final SubLSymbol $kw67$BOTH;
  private static final SubLSymbol $kw68$WORKING_;
  private static final SubLList $list69;
  private static final SubLSymbol $sym70$JSON_ROUND_TRIP_FROM_LIST;
  private static final SubLList $list71;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1097L)
  public static SubLObject with_json_output_to_stream(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject stream = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    stream = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym1$CLET, ConsesLow.list( ConsesLow.list( $sym2$_JSON_STREAM_, stream ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1277L)
  public static SubLObject with_json_output_to_string(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject string_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    string_var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    assert NIL != Types.symbolp( string_var ) : string_var;
    final SubLObject stream = $sym5$STREAM;
    return ConsesLow.list( $sym6$CWITH_OUTPUT_TO_STRING, ConsesLow.list( stream, string_var ), ConsesLow.listS( $sym7$WITH_JSON_OUTPUT_TO_STREAM, stream, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1716L)
  public static SubLObject json_special_charP(final SubLObject v_char)
  {
    return makeBoolean( NIL != string_utilities.control_char_p( v_char ) || NIL != conses_high.member( v_char, $json_special_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1835L)
  public static SubLObject json_char_escaped_version(final SubLObject v_char)
  {
    if( NIL != string_utilities.control_char_p( v_char ) )
    {
      return PrintLow.format( NIL, $str9$_u_4__0x, Characters.char_code( v_char ) );
    }
    final SubLObject pcase_var = Characters.char_code( v_char );
    if( pcase_var.eql( $int10$34 ) )
    {
      return $str11$__;
    }
    if( pcase_var.eql( $int12$92 ) )
    {
      return $str13$__;
    }
    return PrintLow.write_to_string( v_char, EMPTY_SUBL_OBJECT_ARRAY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2087L)
  public static SubLObject json_serialize(final SubLObject l)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return print_json( l, $json_stream$.getDynamicValue( thread ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2374L)
  public static SubLObject json_write_wXescaped_special_chars(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    json_princ( $str15$_ );
    SubLObject end_var_$1;
    SubLObject end_var;
    SubLObject i;
    SubLObject v_char;
    for( end_var = ( end_var_$1 = Sequences.length( string ) ), i = NIL, i = ZERO_INTEGER; !i.numGE( end_var_$1 ); i = number_utilities.f_1X( i ) )
    {
      v_char = Strings.sublisp_char( string, i );
      if( NIL != json_special_charP( v_char ) )
      {
        json_princ( json_char_escaped_version( v_char ) );
      }
      else
      {
        json_princ( v_char );
      }
    }
    json_princ( $str15$_ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2692L)
  public static SubLObject json_serialize_atom(final SubLObject atom, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = $json_stream$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $json_stream$.currentBinding( thread );
    try
    {
      $json_stream$.bind( stream, thread );
      if( atom.isNumber() )
      {
        json_princ( atom );
      }
      else if( atom.isString() )
      {
        json_write_wXescaped_special_chars( atom );
      }
      else if( T.eql( atom ) )
      {
        json_princ( $str16$true );
      }
      else if( NIL.eql( atom ) )
      {
        json_princ( $str17$false );
      }
      else
      {
        Errors.error( $str18$Can_t_serialize__S_to_JSON_, atom );
      }
    }
    finally
    {
      $json_stream$.rebind( _prev_bind_0, thread );
    }
    return atom;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3254L)
  public static SubLObject json_serializing_sequence(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym1$CLET, $list19, $list20, reader.bq_cons( $sym21$JSON_INDENT, ConsesLow.append( body, $list22 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3505L)
  public static SubLObject json_indent(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym1$CLET, $list23, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3624L)
  public static SubLObject json_serialize_sequence_item(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym24$PROGN, $list25, $list26, ConsesLow.append( body, $list27 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3882L)
  public static SubLObject json_serializing_object(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym1$CLET, $list28, $list29, reader.bq_cons( $sym21$JSON_INDENT, ConsesLow.append( body, $list30 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4056L)
  public static SubLObject json_serialize_object_field(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject key = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
    key = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym24$PROGN, new SubLObject[] { ConsesLow.listS( $sym32$CHECK_TYPE, key, $list33 ), $list34, $list26, ConsesLow.list( $sym35$JSON_PRINT, key ), $list36, ConsesLow.append( body, $list37 )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4328L)
  public static SubLObject json_serialize_atom_sequence(final SubLObject sequence, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = $json_stream$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $json_stream$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $json_sequence_startedP$.currentBinding( thread );
    try
    {
      $json_stream$.bind( stream, thread );
      $json_sequence_startedP$.bind( NIL, thread );
      json_princ( $str38$_ );
      final SubLObject _prev_bind_0_$2 = $json_indent_level$.currentBinding( thread );
      try
      {
        $json_indent_level$.bind( number_utilities.f_1X( $json_indent_level$.getDynamicValue( thread ) ), thread );
        for( SubLObject sequence_var = sequence, end_index = sequence_var.isList() ? NIL : Sequences.length( sequence_var ), element_num = ZERO_INTEGER, sequence_doneP = subl_macros.do_sequence_index_doneP( element_num,
            end_index, sequence_var ); NIL == sequence_doneP; sequence_doneP = subl_macros.do_sequence_index_doneP( element_num, end_index, sequence_var ) )
        {
          final SubLObject item = subl_macros.do_sequence_index_valueP( element_num, sequence_var );
          if( NIL != $json_sequence_startedP$.getDynamicValue( thread ) )
          {
            json_princ( $str39$_ );
          }
          json_newline();
          json_serialize_atom( item, UNPROVIDED );
          $json_sequence_startedP$.setDynamicValue( T, thread );
          sequence_var = subl_macros.do_sequence_index_update( sequence_var );
          element_num = Numbers.add( element_num, ONE_INTEGER );
        }
        json_princ( $str40$_ );
      }
      finally
      {
        $json_indent_level$.rebind( _prev_bind_0_$2, thread );
      }
    }
    finally
    {
      $json_sequence_startedP$.rebind( _prev_bind_2, thread );
      $json_stream$.rebind( _prev_bind_0, thread );
    }
    return sequence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4599L)
  public static SubLObject json_princ(final SubLObject obj)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return print_high.princ( obj, $json_stream$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4667L)
  public static SubLObject json_print(final SubLObject obj)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return print_high.prin1( obj, $json_stream$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4735L)
  public static SubLObject json_newline()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    streams_high.terpri( $json_stream$.getDynamicValue( thread ) );
    json_do_indent();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4824L)
  public static SubLObject json_do_indent()
  {
    SubLThread thread;
    SubLObject i;
    for( thread = SubLProcess.currentSubLThread(), i = NIL, i = ZERO_INTEGER; i.numL( $json_indent_level$.getDynamicValue( thread ) ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      json_princ( Characters.CHAR_tab );
    }
    return $json_indent_level$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4970L)
  public static SubLObject json_lookup_path(final SubLObject keys, final SubLObject v_json)
  {
    if( NIL == keys )
    {
      return v_json;
    }
    final SubLObject key = keys.first();
    if( NIL != list_utilities.member_eqP( v_json, $list41 ) )
    {
      return NIL;
    }
    if( NIL != plist_with_keyword_keys_p( v_json ) )
    {
      return json_lookup_path( keys.rest(), conses_high.getf( v_json, key, UNPROVIDED ) );
    }
    if( key.isNumber() )
    {
      return json_lookup_path( keys.rest(), ConsesLow.nth( key, v_json ) );
    }
    return v_json;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6064L)
  public static SubLObject print_json_to_string(final SubLObject v_object, SubLObject indent)
  {
    if( indent == UNPROVIDED )
    {
      indent = ZERO_INTEGER;
    }
    SubLObject string = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      print_json( v_object, stream, indent );
      string = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6252L)
  public static SubLObject print_json(final SubLObject v_object, SubLObject stream, SubLObject indent)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( indent == UNPROVIDED )
    {
      indent = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject deeper_indent = Numbers.add( indent, $print_json_indent_increment$.getDynamicValue( thread ) );
    if( NIL == v_object )
    {
      print_high.princ( $str42$null, stream );
    }
    else if( v_object == $kw43$EMPTY_OBJECT )
    {
      print_high.princ( Characters.CHAR_lbrace, stream );
      print_high.princ( Characters.CHAR_rbrace, stream );
    }
    else if( NIL != plist_with_keyword_keys_p( v_object ) )
    {
      SubLObject skipped_initial_commaP = NIL;
      print_high.princ( Characters.CHAR_lbrace, stream );
      streams_high.terpri( stream );
      SubLObject remainder;
      SubLObject key;
      SubLObject value;
      for( remainder = NIL, remainder = v_object; NIL != remainder; remainder = conses_high.cddr( remainder ) )
      {
        key = remainder.first();
        value = conses_high.cadr( remainder );
        if( NIL != skipped_initial_commaP )
        {
          print_high.princ( Characters.CHAR_comma, stream );
          streams_high.terpri( stream );
        }
        else
        {
          skipped_initial_commaP = T;
        }
        print_high.princ( Strings.make_string( deeper_indent, UNPROVIDED ), stream );
        print_high.princ( Characters.CHAR_quotation, stream );
        print_high.princ( Symbols.symbol_name( key ), stream );
        print_high.princ( Characters.CHAR_quotation, stream );
        print_high.princ( Characters.CHAR_colon, stream );
        print_high.princ( Characters.CHAR_space, stream );
        print_json( value, stream, deeper_indent );
      }
      streams_high.terpri( stream );
      print_high.princ( Strings.make_string( indent, UNPROVIDED ), stream );
      print_high.princ( Characters.CHAR_rbrace, stream );
    }
    else if( v_object == $kw44$EMPTY_ARRAY )
    {
      print_high.princ( Characters.CHAR_lbracket, stream );
      print_high.princ( Characters.CHAR_rbracket, stream );
    }
    else if( NIL != unicode_nauts.unicode_naut_p( v_object, UNPROVIDED ) )
    {
      json_serialize_atom( cycl_string.cycl_string_to_utf8_string( v_object ), stream );
    }
    else if( v_object.isList() )
    {
      SubLObject skipped_initial_commaP = NIL;
      print_high.princ( Characters.CHAR_lbracket, stream );
      print_high.princ( Characters.CHAR_space, stream );
      SubLObject cdolist_list_var = v_object;
      SubLObject elem = NIL;
      elem = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != skipped_initial_commaP )
        {
          print_high.princ( Characters.CHAR_comma, stream );
          print_high.princ( Characters.CHAR_space, stream );
        }
        else
        {
          skipped_initial_commaP = T;
        }
        print_json( elem, stream, deeper_indent );
        cdolist_list_var = cdolist_list_var.rest();
        elem = cdolist_list_var.first();
      }
      print_high.princ( Characters.CHAR_space, stream );
      print_high.princ( Characters.CHAR_rbracket, stream );
    }
    else if( NIL != kb_utilities.kbeq( v_object, $const45$True ) )
    {
      print_high.princ( $str16$true, stream );
    }
    else if( NIL != kb_utilities.kbeq( v_object, $const46$False ) )
    {
      print_high.princ( $str17$false, stream );
    }
    else if( v_object.isString() )
    {
      json_serialize_atom( v_object, stream );
    }
    else if( v_object.isInteger() )
    {
      PrintLow.format( stream, $str47$_D, v_object );
    }
    else if( v_object.isNumber() )
    {
      PrintLow.format( stream, $str48$_F, v_object );
    }
    else
    {
      Errors.error( $str49$Could_not_handle_JSON_object__S, v_object );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8062L)
  public static SubLObject plist_with_keyword_keys_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.property_list_p( v_object ) && NIL != list_utilities.every_in_list( $sym50$KEYWORDP, list_utilities.plist_keys( v_object ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8509L)
  public static SubLObject parse_json_from_string(final SubLObject string)
  {
    SubLObject result = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_input_stream( string, ZERO_INTEGER, NIL );
      result = parse_json_value_from_stream( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9055L)
  public static SubLObject parse_json_from_file(final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( filename, $sym51$FILE_EXISTS_ );
    SubLObject result = NIL;
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( filename, $kw52$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str53$Unable_to_open__S, filename );
      }
      final SubLObject stream_$3 = stream;
      result = parse_json_value_from_stream( stream_$3 );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9291L)
  public static SubLObject parse_json_from_stream(final SubLObject stream)
  {
    final SubLObject result = parse_json_value_from_stream( stream );
    json_read_until_eof( stream );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9449L)
  public static SubLObject parse_json_value_from_stream(final SubLObject stream)
  {
    json_read_whitespace( stream, UNPROVIDED );
    final SubLObject pcase_var;
    final SubLObject next_char = pcase_var = streams_high.peek_char( NIL, stream, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( pcase_var.eql( Characters.CHAR_quotation ) )
    {
      return parse_json_string_from_stream( stream );
    }
    if( pcase_var.eql( Characters.CHAR_lbrace ) )
    {
      return parse_json_object_from_stream( stream );
    }
    if( pcase_var.eql( Characters.CHAR_lbracket ) )
    {
      return parse_json_array_from_stream( stream );
    }
    return parse_json_primitive_from_stream( stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9952L)
  public static SubLObject parse_json_object_from_stream(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    json_read_until_char( stream, Characters.CHAR_lbrace );
    json_read_whitespace( stream, UNPROVIDED );
    if( !Characters.CHAR_rbrace.eql( streams_high.peek_char( NIL, stream, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) )
    {
      SubLObject key;
      SubLObject value;
      SubLObject moreP;
      for( SubLObject doneP = NIL; NIL == doneP; doneP = makeBoolean( NIL == moreP ), result = ConsesLow.cons( key, result ), result = ConsesLow.cons( value, result ) )
      {
        thread.resetMultipleValues();
        key = parse_json_keyXvalue_from_stream( stream );
        value = thread.secondMultipleValue();
        moreP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
      }
    }
    json_read_until_char( stream, Characters.CHAR_rbrace );
    return ( NIL != result ) ? Sequences.nreverse( result ) : $kw43$EMPTY_OBJECT;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10490L)
  public static SubLObject parse_json_keyXvalue_from_stream(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject key = parse_json_string_from_stream( stream );
    key = Symbols.make_keyword( ( NIL != $json_capitalize_keysP$.getDynamicValue( thread ) ) ? Strings.string_upcase( key, UNPROVIDED, UNPROVIDED ) : key );
    json_read_until_char( stream, Characters.CHAR_colon );
    final SubLObject value = parse_json_value_from_stream( stream );
    final SubLObject moreP = json_read_whitespace( stream, $list55 );
    return Values.values( key, value, moreP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10884L)
  public static SubLObject parse_json_string_from_stream(final SubLObject stream)
  {
    SubLObject result = NIL;
    json_read_until_char( stream, Characters.CHAR_quotation );
    final SubLObject string = json_read_until_char_unless( stream, Characters.CHAR_quotation, Characters.CHAR_backslash );
    result = unicode_nauts.utf8_string_to_cycl_safe_string( string_utilities.string_subst( $str15$_, $str11$__, string, UNPROVIDED ) );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11240L)
  public static SubLObject parse_json_primitive_from_stream(final SubLObject stream)
  {
    final SubLObject string = web_utilities.read_while( stream, $sym56$ALPHANUMERIC_OR_NUMBER_CHAR_P, UNPROVIDED );
    final SubLObject possible_number = reader.read_from_string_ignoring_errors( string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( possible_number.isNumber() )
    {
      return possible_number;
    }
    final SubLObject downcase_string = Strings.string_downcase( string, UNPROVIDED, UNPROVIDED );
    if( NIL != Strings.stringE( downcase_string, $str16$true, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return $const45$True;
    }
    if( NIL != Strings.stringE( downcase_string, $str17$false, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return $const46$False;
    }
    if( NIL != Strings.stringE( downcase_string, $str42$null, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    Errors.error( $str57$Unexpected_JSON_when_reading_prim, stream, string );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11866L)
  public static SubLObject parse_json_array_from_stream(final SubLObject stream)
  {
    SubLObject result = NIL;
    json_read_until_char( stream, Characters.CHAR_lbracket );
    json_read_whitespace( stream, UNPROVIDED );
    if( !Characters.CHAR_rbracket.eql( streams_high.peek_char( NIL, stream, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) )
    {
      SubLObject value;
      SubLObject moreP;
      for( SubLObject doneP = NIL; NIL == doneP; doneP = makeBoolean( NIL == moreP ), result = ConsesLow.cons( value, result ) )
      {
        value = parse_json_value_from_stream( stream );
        moreP = json_read_whitespace( stream, $list55 );
      }
    }
    json_read_until_char( stream, Characters.CHAR_rbracket );
    return ( NIL != result ) ? Sequences.nreverse( result ) : $kw44$EMPTY_ARRAY;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12388L)
  public static SubLObject json_read_whitespace(final SubLObject stream, SubLObject additional_chars)
  {
    if( additional_chars == UNPROVIDED )
    {
      additional_chars = NIL;
    }
    SubLObject v_char = streams_high.peek_char( NIL, stream, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject additional_char_foundP = NIL;
    while ( NIL != conses_high.member( v_char, additional_chars, UNPROVIDED, UNPROVIDED ) || NIL != string_utilities.whitespacep( v_char ))
    {
      if( NIL != subl_promotions.memberP( streams_high.read_char( stream, UNPROVIDED, UNPROVIDED, UNPROVIDED ), additional_chars, UNPROVIDED, UNPROVIDED ) )
      {
        additional_char_foundP = T;
      }
      v_char = streams_high.peek_char( NIL, stream, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return additional_char_foundP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12918L)
  public static SubLObject json_read_until_char(final SubLObject stream, final SubLObject v_char)
  {
    final SubLObject string = web_utilities.read_until_char( stream, v_char, UNPROVIDED );
    if( NIL == string_utilities.whitespace_stringP( string ) )
    {
      Errors.error( $str58$Unexpected_JSON_when_reading_to_c, v_char, stream, string );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13170L)
  public static SubLObject json_read_until_one_of(final SubLObject stream, final SubLObject chars)
  {
    final SubLObject string = web_utilities.read_until_one_of( stream, chars, UNPROVIDED );
    if( NIL == string_utilities.whitespace_stringP( string ) )
    {
      Errors.error( $str59$Unexpected_JSON_when_reading_to_c, chars, stream, string );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13430L)
  public static SubLObject json_read_until_char_unless(final SubLObject stream, final SubLObject v_char, final SubLObject unless_char)
  {
    final SubLObject string = web_utilities.read_until_char_unless( stream, v_char, unless_char, UNPROVIDED );
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13588L)
  public static SubLObject json_read_until_eof(final SubLObject stream)
  {
    final SubLObject string = web_utilities.slack_read_until_eof( stream, UNPROVIDED );
    if( NIL == string_utilities.whitespace_stringP( string ) )
    {
      Errors.error( $str60$Unexpected_JSON_when_reading_to_E, stream, string );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13828L)
  public static SubLObject json_round_trip(final SubLObject string)
  {
    final SubLObject initial_json = parse_json_from_string( string );
    final SubLObject json_trip1 = parse_json_from_string( print_json_to_string( initial_json, UNPROVIDED ) );
    return Equality.equal( initial_json, json_trip1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13828L)
  public static SubLObject json_round_trip_from_list(final SubLObject list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $json_capitalize_keysP$.currentBinding( thread );
    try
    {
      $json_capitalize_keysP$.bind( NIL, thread );
      final SubLObject json_trip1 = parse_json_from_string( print_json_to_string( list, UNPROVIDED ) );
      return Equality.equal( list, json_trip1 );
    }
    finally
    {
      $json_capitalize_keysP$.rebind( _prev_bind_0, thread );
    }
  }

  public static SubLObject declare_json_file()
  {
    SubLFiles.declareMacro( me, "with_json_output_to_stream", "WITH-JSON-OUTPUT-TO-STREAM" );
    SubLFiles.declareMacro( me, "with_json_output_to_string", "WITH-JSON-OUTPUT-TO-STRING" );
    SubLFiles.declareFunction( me, "json_special_charP", "JSON-SPECIAL-CHAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "json_char_escaped_version", "JSON-CHAR-ESCAPED-VERSION", 1, 0, false );
    SubLFiles.declareFunction( me, "json_serialize", "JSON-SERIALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "json_write_wXescaped_special_chars", "JSON-WRITE-W/ESCAPED-SPECIAL-CHARS", 1, 0, false );
    SubLFiles.declareFunction( me, "json_serialize_atom", "JSON-SERIALIZE-ATOM", 1, 1, false );
    SubLFiles.declareMacro( me, "json_serializing_sequence", "JSON-SERIALIZING-SEQUENCE" );
    SubLFiles.declareMacro( me, "json_indent", "JSON-INDENT" );
    SubLFiles.declareMacro( me, "json_serialize_sequence_item", "JSON-SERIALIZE-SEQUENCE-ITEM" );
    SubLFiles.declareMacro( me, "json_serializing_object", "JSON-SERIALIZING-OBJECT" );
    SubLFiles.declareMacro( me, "json_serialize_object_field", "JSON-SERIALIZE-OBJECT-FIELD" );
    SubLFiles.declareFunction( me, "json_serialize_atom_sequence", "JSON-SERIALIZE-ATOM-SEQUENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "json_princ", "JSON-PRINC", 1, 0, false );
    SubLFiles.declareFunction( me, "json_print", "JSON-PRINT", 1, 0, false );
    SubLFiles.declareFunction( me, "json_newline", "JSON-NEWLINE", 0, 0, false );
    SubLFiles.declareFunction( me, "json_do_indent", "JSON-DO-INDENT", 0, 0, false );
    SubLFiles.declareFunction( me, "json_lookup_path", "JSON-LOOKUP-PATH", 2, 0, false );
    SubLFiles.declareFunction( me, "print_json_to_string", "PRINT-JSON-TO-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "print_json", "PRINT-JSON", 1, 2, false );
    SubLFiles.declareFunction( me, "plist_with_keyword_keys_p", "PLIST-WITH-KEYWORD-KEYS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_json_from_string", "PARSE-JSON-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_json_from_file", "PARSE-JSON-FROM-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_json_from_stream", "PARSE-JSON-FROM-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_json_value_from_stream", "PARSE-JSON-VALUE-FROM-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_json_object_from_stream", "PARSE-JSON-OBJECT-FROM-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_json_keyXvalue_from_stream", "PARSE-JSON-KEY/VALUE-FROM-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_json_string_from_stream", "PARSE-JSON-STRING-FROM-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_json_primitive_from_stream", "PARSE-JSON-PRIMITIVE-FROM-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_json_array_from_stream", "PARSE-JSON-ARRAY-FROM-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "json_read_whitespace", "JSON-READ-WHITESPACE", 1, 1, false );
    SubLFiles.declareFunction( me, "json_read_until_char", "JSON-READ-UNTIL-CHAR", 2, 0, false );
    SubLFiles.declareFunction( me, "json_read_until_one_of", "JSON-READ-UNTIL-ONE-OF", 2, 0, false );
    SubLFiles.declareFunction( me, "json_read_until_char_unless", "JSON-READ-UNTIL-CHAR-UNLESS", 3, 0, false );
    SubLFiles.declareFunction( me, "json_read_until_eof", "JSON-READ-UNTIL-EOF", 1, 0, false );
    SubLFiles.declareFunction( me, "json_round_trip", "JSON-ROUND-TRIP", 1, 0, false );
    SubLFiles.declareFunction( me, "json_round_trip_from_list", "JSON-ROUND-TRIP-FROM-LIST", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_json_file()
  {
    $json_stream$ = SubLFiles.defparameter( "*JSON-STREAM*", T );
    $json_special_chars$ = SubLFiles.defconstant( "*JSON-SPECIAL-CHARS*", $list8 );
    $json_sequence_startedP$ = SubLFiles.defparameter( "*JSON-SEQUENCE-STARTED?*", NIL );
    $json_indent_level$ = SubLFiles.defparameter( "*JSON-INDENT-LEVEL*", ZERO_INTEGER );
    $json_object_startedP$ = SubLFiles.defparameter( "*JSON-OBJECT-STARTED?*", NIL );
    $print_json_indent_increment$ = SubLFiles.defparameter( "*PRINT-JSON-INDENT-INCREMENT*", TWO_INTEGER );
    $json_capitalize_keysP$ = SubLFiles.defparameter( "*JSON-CAPITALIZE-KEYS?*", T );
    return NIL;
  }

  public static SubLObject setup_json_file()
  {
    generic_testing.define_test_case_table_int( $sym62$JSON_ROUND_TRIP, ConsesLow.list( new SubLObject[] { $kw63$TEST, NIL, $kw64$OWNER, NIL, $kw65$CLASSES, NIL, $kw66$KB, $kw67$BOTH, $kw68$WORKING_, T
    } ), $list69 );
    generic_testing.define_test_case_table_int( $sym70$JSON_ROUND_TRIP_FROM_LIST, ConsesLow.list( new SubLObject[] { $kw63$TEST, NIL, $kw64$OWNER, NIL, $kw65$CLASSES, NIL, $kw66$KB, $kw67$BOTH, $kw68$WORKING_, T
    } ), $list71 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_json_file();
  }

  @Override
  public void initializeVariables()
  {
    init_json_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_json_file();
  }
  static
  {
    me = new json();
    $json_stream$ = null;
    $json_special_chars$ = null;
    $json_sequence_startedP$ = null;
    $json_indent_level$ = null;
    $json_object_startedP$ = null;
    $print_json_indent_increment$ = null;
    $json_capitalize_keysP$ = null;
    $list0 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1$CLET = makeSymbol( "CLET" );
    $sym2$_JSON_STREAM_ = makeSymbol( "*JSON-STREAM*" );
    $list3 = ConsesLow.list( makeSymbol( "STRING-VAR" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym4$SYMBOLP = makeSymbol( "SYMBOLP" );
    $sym5$STREAM = makeUninternedSymbol( "STREAM" );
    $sym6$CWITH_OUTPUT_TO_STRING = makeSymbol( "CWITH-OUTPUT-TO-STRING" );
    $sym7$WITH_JSON_OUTPUT_TO_STREAM = makeSymbol( "WITH-JSON-OUTPUT-TO-STREAM" );
    $list8 = ConsesLow.list( Characters.CHAR_backslash, Characters.CHAR_quotation );
    $str9$_u_4__0x = makeString( "\\u~4,'0x" );
    $int10$34 = makeInteger( 34 );
    $str11$__ = makeString( "\\\"" );
    $int12$92 = makeInteger( 92 );
    $str13$__ = makeString( "\\\\" );
    $sym14$STRINGP = makeSymbol( "STRINGP" );
    $str15$_ = makeString( "\"" );
    $str16$true = makeString( "true" );
    $str17$false = makeString( "false" );
    $str18$Can_t_serialize__S_to_JSON_ = makeString( "Can't serialize ~S to JSON." );
    $list19 = ConsesLow.list( ConsesLow.list( makeSymbol( "*JSON-SEQUENCE-STARTED?*" ), NIL ) );
    $list20 = ConsesLow.list( makeSymbol( "JSON-PRINC" ), makeString( "[" ) );
    $sym21$JSON_INDENT = makeSymbol( "JSON-INDENT" );
    $list22 = ConsesLow.list( ConsesLow.list( makeSymbol( "JSON-PRINC" ), makeString( "]" ) ) );
    $list23 = ConsesLow.list( ConsesLow.list( makeSymbol( "*JSON-INDENT-LEVEL*" ), ConsesLow.list( makeSymbol( "1+" ), makeSymbol( "*JSON-INDENT-LEVEL*" ) ) ) );
    $sym24$PROGN = makeSymbol( "PROGN" );
    $list25 = ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "*JSON-SEQUENCE-STARTED?*" ), ConsesLow.list( makeSymbol( "JSON-PRINC" ), makeString( "," ) ) );
    $list26 = ConsesLow.list( makeSymbol( "JSON-NEWLINE" ) );
    $list27 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "*JSON-SEQUENCE-STARTED?*" ), T ) );
    $list28 = ConsesLow.list( ConsesLow.list( makeSymbol( "*JSON-OBJECT-STARTED?*" ), NIL ) );
    $list29 = ConsesLow.list( makeSymbol( "JSON-PRINC" ), makeString( "{" ) );
    $list30 = ConsesLow.list( ConsesLow.list( makeSymbol( "JSON-PRINC" ), makeString( "}" ) ) );
    $list31 = ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym32$CHECK_TYPE = makeSymbol( "CHECK-TYPE" );
    $list33 = ConsesLow.list( makeSymbol( "STRINGP" ) );
    $list34 = ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "*JSON-OBJECT-STARTED?*" ), ConsesLow.list( makeSymbol( "JSON-PRINC" ), makeString( "," ) ) );
    $sym35$JSON_PRINT = makeSymbol( "JSON-PRINT" );
    $list36 = ConsesLow.list( makeSymbol( "JSON-PRINC" ), makeString( ": " ) );
    $list37 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "*JSON-OBJECT-STARTED?*" ), T ) );
    $str38$_ = makeString( "[" );
    $str39$_ = makeString( "," );
    $str40$_ = makeString( "]" );
    $list41 = ConsesLow.list( makeKeyword( "EMPTY-OBJECT" ), makeKeyword( "EMPTY-ARRAY" ) );
    $str42$null = makeString( "null" );
    $kw43$EMPTY_OBJECT = makeKeyword( "EMPTY-OBJECT" );
    $kw44$EMPTY_ARRAY = makeKeyword( "EMPTY-ARRAY" );
    $const45$True = constant_handles.reader_make_constant_shell( makeString( "True" ) );
    $const46$False = constant_handles.reader_make_constant_shell( makeString( "False" ) );
    $str47$_D = makeString( "~D" );
    $str48$_F = makeString( "~F" );
    $str49$Could_not_handle_JSON_object__S = makeString( "Could not handle JSON object ~S" );
    $sym50$KEYWORDP = makeSymbol( "KEYWORDP" );
    $sym51$FILE_EXISTS_ = makeSymbol( "FILE-EXISTS?" );
    $kw52$INPUT = makeKeyword( "INPUT" );
    $str53$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str54$Unexpected_JSON_when_reading__S__ = makeString( "Unexpected JSON when reading ~S (got ~S)" );
    $list55 = ConsesLow.list( Characters.CHAR_comma );
    $sym56$ALPHANUMERIC_OR_NUMBER_CHAR_P = makeSymbol( "ALPHANUMERIC-OR-NUMBER-CHAR-P" );
    $str57$Unexpected_JSON_when_reading_prim = makeString( "Unexpected JSON when reading primitive in ~S (got ~S)" );
    $str58$Unexpected_JSON_when_reading_to_c = makeString( "Unexpected JSON when reading to char ~S in ~S (got ~S)" );
    $str59$Unexpected_JSON_when_reading_to_c = makeString( "Unexpected JSON when reading to chars ~S in ~S (got ~S)" );
    $str60$Unexpected_JSON_when_reading_to_E = makeString( "Unexpected JSON when reading to EOF from ~S (got ~S)" );
    $sym61$_EXIT = makeSymbol( "%EXIT" );
    $sym62$JSON_ROUND_TRIP = makeSymbol( "JSON-ROUND-TRIP" );
    $kw63$TEST = makeKeyword( "TEST" );
    $kw64$OWNER = makeKeyword( "OWNER" );
    $kw65$CLASSES = makeKeyword( "CLASSES" );
    $kw66$KB = makeKeyword( "KB" );
    $kw67$BOTH = makeKeyword( "BOTH" );
    $kw68$WORKING_ = makeKeyword( "WORKING?" );
    $list69 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( makeString(
        "{\n    \"firstName\": \"John\",\n    \"lastName\": \"Smith\",\n    \"isAlive\": true,\n    \"age\": 25,\n    \"height_cm\": 167.64,\n    \"address\": {\n        \"streetAddress\": \"21 2nd Street\",\n        \"city\": \"New York\",\n        \"state\": \"NY\",\n        \"postalCode\": \"10021-3100\"\n    },\n    \"phoneNumbers\": [\n        { \"type\": \"home\", \"number\": \"212 555-1234\" },\n        { \"type\": \"fax\",  \"number\": \"646 555-4567\" }\n    ]\n    }" ) ),
        T ), ConsesLow.list( ConsesLow.list( makeString(
            "{\n    \"name\": \"Product\",\n    \"properties\": {\n        \"id\": {\n            \"type\": \"number\",\n            \"description\": \"Product identifier\",\n            \"required\": true\n        },\n        \"name\": {\n            \"type\": \"string\",\n            \"description\": \"Name of the product\",\n            \"required\": true\n        },\n        \"price\": {\n            \"type\": \"number\",\n            \"minimum\": 0,\n            \"required\": true\n        },\n        \"tags\": {\n            \"type\": \"array\",\n            \"items\": {\n                \"type\": \"string\"\n            }\n        },\n        \"stock\": {\n            \"type\": \"object\",\n            \"properties\": {\n                \"warehouse\": {\n                    \"type\": \"number\"\n                },\n                \"retail\": {\n                    \"type\": \"number\"\n                }\n            }\n        }\n    }\n    }" ) ),
            T ), ConsesLow.list( ConsesLow.list( makeString(
                "{\n    \"id\": 1,\n    \"name\": \"Foo\",\n    \"price\": 123,\n    \"tags\": [ \"Bar\", \"Eek\" ],\n    \"stock\": {\n        \"warehouse\": 300,\n        \"retail\": 20\n    }\n}" ) ), T ), ConsesLow
                    .list( ConsesLow.list( makeString(
                        "{\n  \"@context\": {\n    \"name\": \"http://xmlns.com/foaf/0.1/name\",\n    \"homepage\": {\n      \"@id\": \"http://xmlns.com/foaf/0.1/workplaceHomepage\",\n      \"@type\": \"@id\"\n    },\n    \"Person\": \"http://xmlns.com/foaf/0.1/Person\"\n  },\n  \"@id\": \"http://me.bob.com\",\n  \"@type\": \"Person\",\n  \"name\": \"Bob\",\n  \"homepage\": \"http://www.bob.com/\"\n}" ) ),
                        T ), ConsesLow.list( ConsesLow.list( makeString(
                            "[\n  {\n    \"@id\": \"http://purl.oreilly.com/works/45U8QJGZSQKDH8N\",\n    \"@type\": \"http://purl.org/vocab/frbr/core#Work\",\n    \"http://purl.org/dc/terms/title\": \"Just a Geek\",\n    \"http://purl.org/dc/terms/creator\": \"Whil Wheaton\",\n    \"http://purl.org/vocab/frbr/core#realization\":\n    [\n      \"http://purl.oreilly.com/products/9780596007683.BOOK\",\n      \"http://purl.oreilly.com/products/9780596802189.EBOOK\"\n    ]\n  },\n  {\n    \"@id\": \"http://purl.oreilly.com/products/9780596007683.BOOK\",\n    \"@type\": \"http://purl.org/vocab/frbr/core#Expression\",\n    \"http://purl.org/dc/terms/type\": \"http://purl.oreilly.com/product-types/BOOK\"\n  },\n  {\n    \"@id\": \"http://purl.oreilly.com/products/9780596802189.EBOOK\",\n    \"@type\": \"http://purl.org/vocab/frbr/core#Expression\",\n    \"http://purl.org/dc/terms/type\": \"http://purl.oreilly.com/product-types/EBOOK\"\n  }\n  ]" ) ),
                            T ), ConsesLow.list( ConsesLow.list( makeString(
                                "{\n        \"success\": \"t\",\n        \"data\": [\n                {\n                        \"turnId\": \"MxGBgR4raDzs1C5URauzw2sjS_rBUg\"\n                        ,\n                        \"dialog\": \"This is what I need to solve.\"\n                        \n                        ,\n                        \"math\": \"<mathmath delayms=\\\"500\\\"><math overflow=\\\"linebreak\\\" xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mrow><menclose notation=\\\"box\\\"><mtext>1</mtext></menclose><mspace width=\\\".5em\\\"/><mfrac><mn>12u000A  </mn><mn>30u000A  </mn>u000A </mfrac></mrow>u000A</math></mathmath>\"\n                        ,\n                        \"explanation\": \"Each sensor needs to get<math overflow=\\\"linebreak\\\" xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mspace width=\\\".5em\\\"/>u000A</math><math overflow=\\\"linebreak\\\" xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mfrac><mn>12u000A  </mn><mn>30u000A  </mn>u000A </mfrac>u000A</math><math overflow=\\\"linebreak\\\" xmlns=\\\"http://www.w3.org/1998/Math/MathML\\\"><mspace width=\\\".5em\\\"/>u000A</math>of the power from each generator.\"\n                        },\n                {\n                        \n                        \"options\": [\n                                {\n                                        \"id\": 0,\n                                        \"text\": \"u0009OK, Continue.\"}\n                                ]}]}" ) ),
                                T ), ConsesLow.list( ConsesLow.list( makeString( " { \"success\": \"t\",  \"data1\": { },  \"data2\": [] }" ) ), T ), ConsesLow.list( ConsesLow.list( makeString( " true " ) ), T ),
      ConsesLow.list( ConsesLow.list( makeString( "false" ) ), T ), ConsesLow.list( ConsesLow.list( makeString( "null" ) ), T ), ConsesLow.list( ConsesLow.list( makeString( "{}" ) ), T ), ConsesLow.list( ConsesLow.list(
          makeString( "[]" ) ), T ), ConsesLow.list( ConsesLow.list( makeString( "1" ) ), T ), ConsesLow.list( ConsesLow.list( makeString( "-1" ) ), T ), ConsesLow.list( ConsesLow.list( makeString( "0.0001" ) ), T ),
      ConsesLow.list( ConsesLow.list( makeString( "-0.0001" ) ), T ), ConsesLow.list( ConsesLow.list( makeString( "[0, 0, 0, 0, 0, 0, 0]" ) ), T ), ConsesLow.list( ConsesLow.list( makeString(
          "{\"foo\": \"bar\", \"foo\": \"bar\"}" ) ), T )
    } );
    $sym70$JSON_ROUND_TRIP_FROM_LIST = makeSymbol( "JSON-ROUND-TRIP-FROM-LIST" );
    $list71 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "windowTitle" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "UnicodeStringFn" ) ), makeString(
        "(10 x 20 volts) + 2&u2153;y = 228 volts" ) ) ) ), T ) );
  }
}
/*
 * 
 * Total time: 244 ms
 * 
 */