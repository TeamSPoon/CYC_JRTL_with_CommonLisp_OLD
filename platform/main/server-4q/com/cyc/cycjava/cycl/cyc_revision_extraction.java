package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cyc_revision_extraction
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cyc_revision_extraction";
  public static final String myFingerPrint = "59cab115f767837572ec61661372c6689c429d437517747474fc1542d09c4670";

  @SubLTranslatedFile.SubL(source = "cycl/cyc-revision-extraction.lisp", position = 531L)
  public static SubLObject extract_cyc_revision_string(final SubLObject raw_revision_string)
  {
    final SubLObject first_space = Sequences.position( Characters.CHAR_space, raw_revision_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != first_space )
    {
      final SubLObject second_space = Sequences.position( Characters.CHAR_space, raw_revision_string, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), Numbers.add( first_space, ONE_INTEGER ),
          UNPROVIDED );
      if( NIL != second_space )
      {
        return Sequences.subseq( raw_revision_string, Numbers.add( first_space, ONE_INTEGER ), second_space );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-revision-extraction.lisp", position = 874L)
  public static SubLObject extract_cyc_revision_numbers(final SubLObject revision_string, SubLObject system_vesion)
  {
    if( system_vesion == UNPROVIDED )
    {
      system_vesion = TEN_INTEGER;
    }
    if( revision_string.isString() )
    {
      SubLObject start = ZERO_INTEGER;
      SubLObject period = Sequences.position( Characters.CHAR_period, revision_string, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), start, UNPROVIDED );
      SubLObject numbers = NIL;
      while ( start.isInteger())
      {
        final SubLObject integer = reader.read_from_string_ignoring_errors( revision_string, NIL, NIL, start, period );
        if( NIL != integer )
        {
          numbers = ConsesLow.cons( integer, numbers );
        }
        if( period.isInteger() )
        {
          start = Numbers.add( period, ONE_INTEGER );
          period = Sequences.position( Characters.CHAR_period, revision_string, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), start, UNPROVIDED );
        }
        else
        {
          start = NIL;
        }
      }
      numbers = Sequences.nreverse( numbers );
      if( ONE_INTEGER.numE( Sequences.length( numbers ) ) )
      {
        numbers = ConsesLow.cons( system_vesion, numbers );
      }
      return numbers;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-revision-extraction.lisp", position = 1594L)
  public static SubLObject construct_cyc_revision_string_from_numbers(final SubLObject revision_numbers)
  {
    SubLObject string = NIL;
    SubLObject s = NIL;
    try
    {
      s = streams_high.make_private_string_output_stream();
      SubLObject first_p = T;
      SubLObject cdolist_list_var = revision_numbers;
      SubLObject number = NIL;
      number = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == first_p )
        {
          print_high.princ( Characters.CHAR_period, s );
        }
        print_high.princ( number, s );
        first_p = NIL;
        cdolist_list_var = cdolist_list_var.rest();
        number = cdolist_list_var.first();
      }
      string = streams_high.get_output_stream_string( s );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( s, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return string;
  }

  public static SubLObject declare_cyc_revision_extraction_file()
  {
    SubLFiles.declareFunction( me, "extract_cyc_revision_string", "EXTRACT-CYC-REVISION-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_cyc_revision_numbers", "EXTRACT-CYC-REVISION-NUMBERS", 1, 1, false );
    SubLFiles.declareFunction( me, "construct_cyc_revision_string_from_numbers", "CONSTRUCT-CYC-REVISION-STRING-FROM-NUMBERS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cyc_revision_extraction_file()
  {
    return NIL;
  }

  public static SubLObject setup_cyc_revision_extraction_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cyc_revision_extraction_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cyc_revision_extraction_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cyc_revision_extraction_file();
  }
  static
  {
    me = new cyc_revision_extraction();
  }
}
/*
 * 
 * Total time: 25 ms
 * 
 */