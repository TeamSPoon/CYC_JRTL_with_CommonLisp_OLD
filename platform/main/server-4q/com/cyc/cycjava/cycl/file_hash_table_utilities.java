package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class file_hash_table_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.file_hash_table_utilities";
  public static final String myFingerPrint = "9385ba81d235411de3acb0bca4956b557e2d33c85121e7551181c6e16f6284dd";
  @SubLTranslatedFile.SubL(source = "cycl/file-hash-table-utilities.lisp", position = 4215L)
  public static SubLSymbol $default_test_file_hash_table_tmpdir$;
  private static final SubLList $list0;
  private static final SubLInteger $int1$256;
  private static final SubLString $str2$Not_Found;
  private static final SubLString $str3$Checking_the_map_against_the_FHT_;
  private static final SubLSymbol $sym4$STRINGP;
  private static final SubLString $str5$Given_size_mismatch__check_for_ex;
  private static final SubLSymbol $kw6$MAP_ONLY;
  private static final SubLSymbol $kw7$FHT_ONLY;
  private static final SubLSymbol $kw8$VALUES_DIFFER;
  private static final SubLSymbol $sym9$TEST_FILE_HASH_TABLE_RETRIEVAL;
  private static final SubLSymbol $kw10$TEST;
  private static final SubLSymbol $kw11$OWNER;
  private static final SubLSymbol $kw12$CLASSES;
  private static final SubLSymbol $kw13$KB;
  private static final SubLSymbol $kw14$TINY;
  private static final SubLSymbol $kw15$WORKING_;
  private static final SubLList $list16;
  private static final SubLSymbol $kw17$SUCCESS;
  private static final SubLList $list18;
  private static final SubLSymbol $kw19$SLOW;
  private static final SubLSymbol $kw20$FAST;
  private static final SubLString $str21$Unknown_write_style__A_;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLSymbol $kw24$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw25$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym26$IGNORE_ERRORS_HANDLER;

  @SubLTranslatedFile.SubL(source = "cycl/file-hash-table-utilities.lisp", position = 962L)
  public static SubLObject write_map_to_file_hash_table(final SubLObject map, final SubLObject filename, SubLObject serialization_fn, SubLObject tempdir)
  {
    if( serialization_fn == UNPROVIDED )
    {
      serialization_fn = file_hash_table.$default_fht_serialization_protocol$.getGlobalValue();
    }
    if( tempdir == UNPROVIDED )
    {
      tempdir = file_utilities.temp_directory();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject test = map_utilities.map_test( map );
    final SubLObject size = map_utilities.map_size( map );
    SubLObject fast_fht = NIL;
    try
    {
      fast_fht = file_hash_table.fast_create_file_hash_table( filename, tempdir, test, serialization_fn );
      final SubLObject iterator = map_utilities.new_map_iterator( map );
      SubLObject valid;
      for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
      {
        thread.resetMultipleValues();
        final SubLObject var = iteration.iteration_next( iterator );
        valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != valid )
        {
          SubLObject current;
          final SubLObject datum = current = var;
          SubLObject key = NIL;
          SubLObject values = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
          key = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
          values = current.first();
          current = current.rest();
          if( NIL == current )
          {
            file_hash_table.fast_put_file_hash_table( key, fast_fht, values );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
          }
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != file_hash_table.fast_create_fht_p( fast_fht ) )
        {
          file_hash_table.finalize_fast_create_file_hash_table( fast_fht, NIL, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-hash-table-utilities.lisp", position = 1847L)
  public static SubLObject write_map_to_file_hash_table_slow(final SubLObject map, final SubLObject filename, SubLObject serialization_fn)
  {
    if( serialization_fn == UNPROVIDED )
    {
      serialization_fn = file_hash_table.$default_fht_serialization_protocol$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject test = map_utilities.map_test( map );
    final SubLObject size = map_utilities.map_size( map );
    SubLObject fht = NIL;
    try
    {
      fht = file_hash_table.create_file_hash_table( filename, size, $int1$256, test, serialization_fn );
      final SubLObject iterator = map_utilities.new_map_iterator( map );
      SubLObject valid;
      for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
      {
        thread.resetMultipleValues();
        final SubLObject var = iteration.iteration_next( iterator );
        valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != valid )
        {
          SubLObject current;
          final SubLObject datum = current = var;
          SubLObject key = NIL;
          SubLObject values = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
          key = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
          values = current.first();
          current = current.rest();
          if( NIL == current )
          {
            file_hash_table.put_file_hash_table( key, fht, values );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
          }
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != file_hash_table.file_hash_table_p( fht ) )
        {
          file_hash_table.finalize_file_hash_table( fht );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-hash-table-utilities.lisp", position = 2492L)
  public static SubLObject compare_map_to_file_hash_table(final SubLObject map, final SubLObject filename, final SubLObject value_compare_fn, SubLObject serialization_fn)
  {
    if( serialization_fn == UNPROVIDED )
    {
      serialization_fn = file_hash_table.$default_fht_serialization_protocol$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject test = map_utilities.map_test( map );
    final SubLObject not_found_symbol = Symbols.make_symbol( $str2$Not_Found );
    SubLObject map_only = NIL;
    SubLObject fht_only = NIL;
    SubLObject values_differ = NIL;
    SubLObject fht = NIL;
    try
    {
      fht = file_hash_table.open_file_hash_table_read_only( filename, test, serialization_fn );
      final SubLObject mess = $str3$Checking_the_map_against_the_FHT_;
      SubLObject sofar = ZERO_INTEGER;
      final SubLObject total = map_utilities.map_size( map );
      assert NIL != Types.stringp( mess ) : mess;
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
          utilities_macros.noting_percent_progress_preamble( mess );
          final SubLObject iterator = map_utilities.new_map_iterator( map );
          SubLObject valid;
          for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
          {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next( iterator );
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != valid )
            {
              SubLObject current;
              final SubLObject datum = current = var;
              SubLObject key = NIL;
              SubLObject values = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
              key = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
              values = current.first();
              current = current.rest();
              if( NIL == current )
              {
                utilities_macros.note_percent_progress( sofar, total );
                sofar = Numbers.add( sofar, ONE_INTEGER );
                final SubLObject fht_values = file_hash_table.get_file_hash_table( key, fht, not_found_symbol );
                if( not_found_symbol.eql( fht_values ) )
                {
                  map_only = ConsesLow.cons( key, map_only );
                }
                else
                {
                  final SubLObject result = Functions.funcall( value_compare_fn, values, fht_values );
                  if( NIL == list_utilities.sublisp_boolean( result ) )
                  {
                    values_differ = ConsesLow.cons( key, values_differ );
                  }
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$1, thread );
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
      if( !map_utilities.map_size( map ).numE( file_hash_table.file_hash_table_count( fht ) ) )
      {
        final SubLObject fht_var = fht;
        utilities_macros.$progress_note$.setDynamicValue( $str5$Given_size_mismatch__check_for_ex, thread );
        utilities_macros.$progress_start_time$.setDynamicValue( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.setDynamicValue( file_hash_table.file_hash_table_count( fht_var ), thread );
        utilities_macros.$progress_sofar$.setDynamicValue( ZERO_INTEGER, thread );
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
        try
        {
          utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
          utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
          utilities_macros.$within_noting_percent_progress$.bind( T, thread );
          utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
          try
          {
            utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
            SubLObject continuation = NIL;
            SubLObject next;
            for( SubLObject completeP = NIL; NIL == completeP; completeP = Types.sublisp_null( next ) )
            {
              thread.resetMultipleValues();
              final SubLObject the_key = file_hash_table.get_file_hash_table_any( fht_var, continuation, T );
              final SubLObject the_value = thread.secondMultipleValue();
              next = thread.thirdMultipleValue();
              thread.resetMultipleValues();
              if( NIL != next )
              {
                final SubLObject key2 = the_key;
                final SubLObject value = the_value;
                utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
                utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
                final SubLObject map_values = map_utilities.map_get( map, key2, not_found_symbol );
                if( not_found_symbol.eql( map_values ) )
                {
                  fht_only = ConsesLow.cons( key2, fht_only );
                }
              }
              continuation = next;
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              utilities_macros.noting_percent_progress_postamble();
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
            }
          }
        }
        finally
        {
          utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
          utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
          utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
          utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values3 = Values.getValuesAsVector();
        if( NIL != file_hash_table.file_hash_table_p( fht ) )
        {
          file_hash_table.finalize_file_hash_table( fht );
        }
        Values.restoreValuesFromVector( _values3 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_9, thread );
      }
    }
    return ConsesLow.list( $kw6$MAP_ONLY, map_only, $kw7$FHT_ONLY, fht_only, $kw8$VALUES_DIFFER, values_differ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-hash-table-utilities.lisp", position = 4720L)
  public static SubLObject test_file_hash_table_retrieval(final SubLObject pairs, final SubLObject test_fn, final SubLObject serialization_fn, final SubLObject write_style, final SubLObject value_test_fn)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject map = dictionary.new_dictionary( test_fn, UNPROVIDED );
    final SubLObject temp_dir = $default_test_file_hash_table_tmpdir$.getDynamicValue( thread );
    final SubLObject filename = file_utilities.make_temp_filename( temp_dir );
    SubLObject outcome = $kw17$SUCCESS;
    try
    {
      SubLObject cdolist_list_var = pairs;
      SubLObject pair = NIL;
      pair = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = pair;
        SubLObject key = NIL;
        SubLObject value = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
        key = current.first();
        current = ( value = current.rest() );
        map_utilities.map_put( map, key, value );
        cdolist_list_var = cdolist_list_var.rest();
        pair = cdolist_list_var.first();
      }
      if( write_style.eql( $kw19$SLOW ) )
      {
        write_map_to_file_hash_table_slow( map, filename, serialization_fn );
      }
      else if( write_style.eql( $kw20$FAST ) )
      {
        write_map_to_file_hash_table( map, filename, serialization_fn, temp_dir );
      }
      else
      {
        Errors.error( $str21$Unknown_write_style__A_, write_style );
      }
      final SubLObject results = compare_map_to_file_hash_table( map, filename, value_test_fn, serialization_fn );
      final SubLObject current2;
      final SubLObject datum2 = current2 = results;
      SubLObject allow_other_keys_p = NIL;
      SubLObject rest = current2;
      SubLObject bad = NIL;
      SubLObject current_$3 = NIL;
      while ( NIL != rest)
      {
        cdestructuring_bind.destructuring_bind_must_consp( rest, datum2, $list22 );
        current_$3 = rest.first();
        rest = rest.rest();
        cdestructuring_bind.destructuring_bind_must_consp( rest, datum2, $list22 );
        if( NIL == conses_high.member( current_$3, $list23, UNPROVIDED, UNPROVIDED ) )
        {
          bad = T;
        }
        if( current_$3 == $kw24$ALLOW_OTHER_KEYS )
        {
          allow_other_keys_p = rest.first();
        }
        rest = rest.rest();
      }
      if( NIL != bad && NIL == allow_other_keys_p )
      {
        cdestructuring_bind.cdestructuring_bind_error( datum2, $list22 );
      }
      final SubLObject map_only_tail = cdestructuring_bind.property_list_member( $kw6$MAP_ONLY, current2 );
      final SubLObject map_only = ( NIL != map_only_tail ) ? conses_high.cadr( map_only_tail ) : NIL;
      final SubLObject fht_only_tail = cdestructuring_bind.property_list_member( $kw7$FHT_ONLY, current2 );
      final SubLObject fht_only = ( NIL != fht_only_tail ) ? conses_high.cadr( fht_only_tail ) : NIL;
      final SubLObject values_differ_tail = cdestructuring_bind.property_list_member( $kw8$VALUES_DIFFER, current2 );
      final SubLObject values_differ = ( NIL != values_differ_tail ) ? conses_high.cadr( values_differ_tail ) : NIL;
      if( NIL != values_differ || NIL != fht_only || NIL != map_only )
      {
        outcome = results;
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        SubLObject ignore_errors_tag = NIL;
        try
        {
          thread.throwStack.push( $kw25$IGNORE_ERRORS_TARGET );
          final SubLObject _prev_bind_0_$4 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( Symbols.symbol_function( $sym26$IGNORE_ERRORS_HANDLER ), thread );
            try
            {
              Filesys.delete_file( filename );
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
          ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw25$IGNORE_ERRORS_TARGET );
          thread.throwStack.pop();
        }
        finally
        {
          thread.throwStack.pop();
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return outcome;
  }

  public static SubLObject declare_file_hash_table_utilities_file()
  {
    SubLFiles.declareFunction( me, "write_map_to_file_hash_table", "WRITE-MAP-TO-FILE-HASH-TABLE", 2, 2, false );
    SubLFiles.declareFunction( me, "write_map_to_file_hash_table_slow", "WRITE-MAP-TO-FILE-HASH-TABLE-SLOW", 2, 1, false );
    SubLFiles.declareFunction( me, "compare_map_to_file_hash_table", "COMPARE-MAP-TO-FILE-HASH-TABLE", 3, 1, false );
    SubLFiles.declareFunction( me, "test_file_hash_table_retrieval", "TEST-FILE-HASH-TABLE-RETRIEVAL", 5, 0, false );
    return NIL;
  }

  public static SubLObject init_file_hash_table_utilities_file()
  {
    $default_test_file_hash_table_tmpdir$ = SubLFiles.defparameter( "*DEFAULT-TEST-FILE-HASH-TABLE-TMPDIR*", file_utilities.temp_directory() );
    return NIL;
  }

  public static SubLObject setup_file_hash_table_utilities_file()
  {
    generic_testing.define_test_case_table_int( $sym9$TEST_FILE_HASH_TABLE_RETRIEVAL, ConsesLow.list( new SubLObject[] { $kw10$TEST, EQUAL, $kw11$OWNER, NIL, $kw12$CLASSES, NIL, $kw13$KB, $kw14$TINY, $kw15$WORKING_, T
    } ), $list16 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_file_hash_table_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_file_hash_table_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_file_hash_table_utilities_file();
  }
  static
  {
    me = new file_hash_table_utilities();
    $default_test_file_hash_table_tmpdir$ = null;
    $list0 = ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "VALUES" ) );
    $int1$256 = makeInteger( 256 );
    $str2$Not_Found = makeString( "Not Found" );
    $str3$Checking_the_map_against_the_FHT_ = makeString( "Checking the map against the FHT ...." );
    $sym4$STRINGP = makeSymbol( "STRINGP" );
    $str5$Given_size_mismatch__check_for_ex = makeString( "Given size mismatch, check for extra keys ..." );
    $kw6$MAP_ONLY = makeKeyword( "MAP-ONLY" );
    $kw7$FHT_ONLY = makeKeyword( "FHT-ONLY" );
    $kw8$VALUES_DIFFER = makeKeyword( "VALUES-DIFFER" );
    $sym9$TEST_FILE_HASH_TABLE_RETRIEVAL = makeSymbol( "TEST-FILE-HASH-TABLE-RETRIEVAL" );
    $kw10$TEST = makeKeyword( "TEST" );
    $kw11$OWNER = makeKeyword( "OWNER" );
    $kw12$CLASSES = makeKeyword( "CLASSES" );
    $kw13$KB = makeKeyword( "KB" );
    $kw14$TINY = makeKeyword( "TINY" );
    $kw15$WORKING_ = makeKeyword( "WORKING?" );
    $list16 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.cons( makeString( "bd5880ee-9c29-11b1-9dad-c379636f7270" ), ZERO_INTEGER ), ConsesLow.cons( makeString(
        "bd588052-9c29-11b1-9dad-c379636f7270" ), ONE_INTEGER ), ConsesLow.cons( makeString( "bd588044-9c29-11b1-9dad-c379636f7270" ), TWO_INTEGER ), ConsesLow.cons( makeString( "bd58810e-9c29-11b1-9dad-c379636f7270" ),
            THREE_INTEGER ) ), EQUAL, makeKeyword( "IMAGE-DEPENDENT-CFASL" ), makeKeyword( "SLOW" ), makeSymbol( "=" ) ), makeKeyword( "SUCCESS" ) ) );
    $kw17$SUCCESS = makeKeyword( "SUCCESS" );
    $list18 = ConsesLow.cons( makeSymbol( "KEY" ), makeSymbol( "VALUE" ) );
    $kw19$SLOW = makeKeyword( "SLOW" );
    $kw20$FAST = makeKeyword( "FAST" );
    $str21$Unknown_write_style__A_ = makeString( "Unknown write style ~A." );
    $list22 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "MAP-ONLY" ), makeSymbol( "FHT-ONLY" ), makeSymbol( "VALUES-DIFFER" ) );
    $list23 = ConsesLow.list( makeKeyword( "MAP-ONLY" ), makeKeyword( "FHT-ONLY" ), makeKeyword( "VALUES-DIFFER" ) );
    $kw24$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw25$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym26$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
  }
}
/*
 * 
 * Total time: 273 ms
 * 
 */