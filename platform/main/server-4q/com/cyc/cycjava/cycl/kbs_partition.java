package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kbs_partition
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.kbs_partition";
  public static final String myFingerPrint = "45b6e0da4291561310d5842345dfbf672ef17fec62e072e8ceaba3b9193f9a63";
  @SubLTranslatedFile.SubL(source = "cycl/kbs-partition.lisp", position = 968L)
  private static SubLSymbol $kbs_partition$;
  @SubLTranslatedFile.SubL(source = "cycl/kbs-partition.lisp", position = 3251L)
  private static SubLSymbol $kbs_splicing_partition$;
  @SubLTranslatedFile.SubL(source = "cycl/kbs-partition.lisp", position = 3575L)
  private static SubLSymbol $kbs_splicing_assertions$;
  private static final SubLList $list0;
  private static final SubLString $str1$scoping_KBS_FORTs;
  private static final SubLSymbol $kw2$SKIP;
  private static final SubLString $str3$scoping_KBS_assertions;
  private static final SubLSymbol $sym4$STRINGP;
  private static final SubLString $str5$scoping_KBS_deductions;
  private static final SubLString $str6$cleaning_KBS_assert_info;
  private static final SubLSymbol $kw7$UNCHANGED;
  private static final SubLSymbol $sym8$VALID_ASSERT_INFO_FORT;
  private static final SubLObject $const9$isa;
  private static final SubLList $list10;
  private static final SubLString $str11$scoping_KBS_splicing_assertions;
  private static final SubLString $str12$cdolist;

  @SubLTranslatedFile.SubL(source = "cycl/kbs-partition.lisp", position = 1253L)
  public static SubLObject save_kbs_partition(final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = kb_hl_supports_high.$unreify_kb_hl_supportsP$.currentBinding( thread );
    try
    {
      kb_hl_supports_high.$unreify_kb_hl_supportsP$.bind( T, thread );
      result = partitions.save_partition( filename, $kbs_partition$.getDynamicValue( thread ) );
    }
    finally
    {
      kb_hl_supports_high.$unreify_kb_hl_supportsP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-partition.lisp", position = 1442L)
  public static SubLObject load_kbs_partition(final SubLObject filename)
  {
    return partitions.load_entire_kb_partition( filename );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-partition.lisp", position = 1533L)
  public static SubLObject scope_kbs_forts()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject message = $str1$scoping_KBS_FORTs;
    final SubLObject total = forts.fort_count();
    SubLObject sofar = ZERO_INTEGER;
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
        utilities_macros.noting_percent_progress_preamble( message );
        SubLObject cdolist_list_var = forts.do_forts_tables();
        SubLObject table_var = NIL;
        table_var = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject idx = table_var;
          if( NIL == id_index.id_index_objects_empty_p( idx, $kw2$SKIP ) )
          {
            final SubLObject idx_$1 = idx;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$1, $kw2$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$1 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject id;
              SubLObject fort;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                fort = Vectors.aref( vector_var, id );
                if( NIL == id_index.id_index_tombstone_p( fort ) || NIL == id_index.id_index_skip_tombstones_p( $kw2$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( fort ) )
                  {
                    fort = $kw2$SKIP;
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                  if( NIL != kbs_identification.kbs_fort_p( fort ) )
                  {
                    partitions.scope_partition_object_only( fort );
                  }
                }
              }
            }
            final SubLObject idx_$2 = idx;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$2 ) || NIL == id_index.id_index_skip_tombstones_p( $kw2$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$2 );
              SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$2 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$2 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw2$SKIP ) ) ? NIL : $kw2$SKIP;
              while ( id2.numL( end_id ))
              {
                final SubLObject fort2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw2$SKIP ) || NIL == id_index.id_index_tombstone_p( fort2 ) )
                {
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                  if( NIL != kbs_identification.kbs_fort_p( fort2 ) )
                  {
                    partitions.scope_partition_object_only( fort2 );
                  }
                }
                id2 = Numbers.add( id2, ONE_INTEGER );
              }
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          table_var = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-partition.lisp", position = 1746L)
  public static SubLObject scope_kbs_assertions()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject idx = assertion_handles.do_assertions_table();
    final SubLObject mess = $str3$scoping_KBS_assertions;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
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
        final SubLObject idx_$4 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$4, $kw2$SKIP ) )
        {
          final SubLObject idx_$5 = idx_$4;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$5, $kw2$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$5 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject a_id;
            SubLObject a_handle;
            SubLObject assertion;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              a_handle = Vectors.aref( vector_var, a_id );
              if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw2$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                {
                  a_handle = $kw2$SKIP;
                }
                assertion = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                if( NIL != kbs_identification.kbs_assertion_p( assertion ) )
                {
                  partitions.scope_partition_object_only( assertion );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$6 = idx_$4;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$6 ) || NIL == id_index.id_index_skip_tombstones_p( $kw2$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$6 );
            SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$6 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$6 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw2$SKIP ) ) ? NIL : $kw2$SKIP;
            while ( a_id2.numL( end_id ))
            {
              final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw2$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
              {
                final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                if( NIL != kbs_identification.kbs_assertion_p( assertion2 ) )
                {
                  partitions.scope_partition_object_only( assertion2 );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              a_id2 = Numbers.add( a_id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-partition.lisp", position = 1980L)
  public static SubLObject scope_kbs_deductions()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject idx = deduction_handles.do_deductions_table();
    final SubLObject mess = $str5$scoping_KBS_deductions;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
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
        final SubLObject idx_$8 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$8, $kw2$SKIP ) )
        {
          final SubLObject idx_$9 = idx_$8;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$9, $kw2$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$9 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject d_id;
            SubLObject d_handle;
            SubLObject deduction;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              d_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              d_handle = Vectors.aref( vector_var, d_id );
              if( NIL == id_index.id_index_tombstone_p( d_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw2$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( d_handle ) )
                {
                  d_handle = $kw2$SKIP;
                }
                deduction = deduction_handles.resolve_deduction_id_value_pair( d_id, d_handle );
                if( NIL != kbs_identification.kbs_deduction_p( deduction ) )
                {
                  partitions.scope_partition_object_only( deduction );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$10 = idx_$8;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$10 ) || NIL == id_index.id_index_skip_tombstones_p( $kw2$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$10 );
            SubLObject d_id2 = id_index.id_index_sparse_id_threshold( idx_$10 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$10 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw2$SKIP ) ) ? NIL : $kw2$SKIP;
            while ( d_id2.numL( end_id ))
            {
              final SubLObject d_handle2 = Hashtables.gethash_without_values( d_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw2$SKIP ) || NIL == id_index.id_index_tombstone_p( d_handle2 ) )
              {
                final SubLObject deduction2 = deduction_handles.resolve_deduction_id_value_pair( d_id2, d_handle2 );
                if( NIL != kbs_identification.kbs_deduction_p( deduction2 ) )
                {
                  partitions.scope_partition_object_only( deduction2 );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              d_id2 = Numbers.add( d_id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$11, thread );
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-partition.lisp", position = 2214L)
  public static SubLObject clean_kbs_assert_info()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $str6$cleaning_KBS_assert_info;
        final SubLObject total = id_index.id_index_count( idx );
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != Types.stringp( mess ) : mess;
        final SubLObject _prev_bind_0_$12 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
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
            final SubLObject idx_$13 = idx;
            if( NIL == id_index.id_index_objects_empty_p( idx_$13, $kw2$SKIP ) )
            {
              final SubLObject idx_$14 = idx_$13;
              if( NIL == id_index.id_index_dense_objects_empty_p( idx_$14, $kw2$SKIP ) )
              {
                final SubLObject vector_var = id_index.id_index_dense_objects( idx_$14 );
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject a_id;
                SubLObject a_handle;
                SubLObject assertion;
                SubLObject asserted_by_value;
                SubLObject asserted_why_value;
                for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                {
                  a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                  a_handle = Vectors.aref( vector_var, a_id );
                  if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw2$SKIP ) )
                  {
                    if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                    {
                      a_handle = $kw2$SKIP;
                    }
                    assertion = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                    if( NIL != assertions_high.asserted_assertionP( assertion ) )
                    {
                      asserted_by_value = ( NIL != invalid_assert_info_fort( assertions_high.asserted_by( assertion ) ) ) ? NIL : $kw7$UNCHANGED;
                      asserted_why_value = ( NIL != invalid_assert_info_fort( assertions_high.asserted_why( assertion ) ) ) ? NIL : $kw7$UNCHANGED;
                      if( NIL == asserted_by_value || NIL == asserted_why_value )
                      {
                        assertions_high.timestamp_asserted_assertion( assertion, asserted_by_value, $kw7$UNCHANGED, asserted_why_value, $kw7$UNCHANGED );
                      }
                    }
                    sofar = Numbers.add( sofar, ONE_INTEGER );
                    utilities_macros.note_percent_progress( sofar, total );
                  }
                }
              }
              final SubLObject idx_$15 = idx_$13;
              if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$15 ) || NIL == id_index.id_index_skip_tombstones_p( $kw2$SKIP ) )
              {
                final SubLObject sparse = id_index.id_index_sparse_objects( idx_$15 );
                SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$15 );
                final SubLObject end_id = id_index.id_index_next_id( idx_$15 );
                final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw2$SKIP ) ) ? NIL : $kw2$SKIP;
                while ( a_id2.numL( end_id ))
                {
                  final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
                  if( NIL == id_index.id_index_skip_tombstones_p( $kw2$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
                  {
                    final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                    if( NIL != assertions_high.asserted_assertionP( assertion2 ) )
                    {
                      final SubLObject asserted_by_value2 = ( NIL != invalid_assert_info_fort( assertions_high.asserted_by( assertion2 ) ) ) ? NIL : $kw7$UNCHANGED;
                      final SubLObject asserted_why_value2 = ( NIL != invalid_assert_info_fort( assertions_high.asserted_why( assertion2 ) ) ) ? NIL : $kw7$UNCHANGED;
                      if( NIL == asserted_by_value2 || NIL == asserted_why_value2 )
                      {
                        assertions_high.timestamp_asserted_assertion( assertion2, asserted_by_value2, $kw7$UNCHANGED, asserted_why_value2, $kw7$UNCHANGED );
                      }
                    }
                    sofar = Numbers.add( sofar, ONE_INTEGER );
                    utilities_macros.note_percent_progress( sofar, total );
                  }
                  a_id2 = Numbers.add( a_id2, ONE_INTEGER );
                }
              }
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              utilities_macros.noting_percent_progress_postamble();
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$13, thread );
            }
          }
        }
        finally
        {
          utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
          utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
          utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
          utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$12, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$14, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-partition.lisp", position = 2933L)
  public static SubLObject invalid_assert_info_fort(final SubLObject obj)
  {
    return makeBoolean( NIL != forts.fort_p( obj ) && NIL == valid_assert_info_fort( obj ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-partition.lisp", position = 3104L)
  public static SubLObject valid_assert_info_fort_internal(final SubLObject fort)
  {
    return Numbers.plusp( kb_indexing.num_gaf_arg_index( fort, ONE_INTEGER, $const9$isa, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-partition.lisp", position = 3104L)
  public static SubLObject valid_assert_info_fort(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return valid_assert_info_fort_internal( fort );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym8$VALID_ASSERT_INFO_FORT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym8$VALID_ASSERT_INFO_FORT, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym8$VALID_ASSERT_INFO_FORT, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( valid_assert_info_fort_internal( fort ) ) );
      memoization_state.caching_state_put( caching_state, fort, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-partition.lisp", position = 3460L)
  public static SubLObject save_kbs_splicing_partition(final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return partitions.save_partition( filename, $kbs_splicing_partition$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-partition.lisp", position = 3641L)
  public static SubLObject add_kbs_splicing_assertion(final SubLObject assertion)
  {
    if( NIL != assertion_handles.assertion_p( assertion ) )
    {
      $kbs_splicing_assertions$.setGlobalValue( ConsesLow.cons( assertion, $kbs_splicing_assertions$.getGlobalValue() ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-partition.lisp", position = 3794L)
  public static SubLObject clear_kbs_splicing_assertions()
  {
    $kbs_splicing_assertions$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kbs-partition.lisp", position = 3899L)
  public static SubLObject scope_kbs_splicing_assertions()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject list_var = $kbs_splicing_assertions$.getGlobalValue();
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str11$scoping_KBS_splicing_assertions, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = list_var;
        SubLObject assertion = NIL;
        assertion = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          partitions.scope_partition_assertion( assertion );
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          assertion = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$18, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  public static SubLObject declare_kbs_partition_file()
  {
    SubLFiles.declareFunction( me, "save_kbs_partition", "SAVE-KBS-PARTITION", 1, 0, false );
    SubLFiles.declareFunction( me, "load_kbs_partition", "LOAD-KBS-PARTITION", 1, 0, false );
    SubLFiles.declareFunction( me, "scope_kbs_forts", "SCOPE-KBS-FORTS", 0, 0, false );
    SubLFiles.declareFunction( me, "scope_kbs_assertions", "SCOPE-KBS-ASSERTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "scope_kbs_deductions", "SCOPE-KBS-DEDUCTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "clean_kbs_assert_info", "CLEAN-KBS-ASSERT-INFO", 0, 0, false );
    SubLFiles.declareFunction( me, "invalid_assert_info_fort", "INVALID-ASSERT-INFO-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_assert_info_fort_internal", "VALID-ASSERT-INFO-FORT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_assert_info_fort", "VALID-ASSERT-INFO-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "save_kbs_splicing_partition", "SAVE-KBS-SPLICING-PARTITION", 1, 0, false );
    SubLFiles.declareFunction( me, "add_kbs_splicing_assertion", "ADD-KBS-SPLICING-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_kbs_splicing_assertions", "CLEAR-KBS-SPLICING-ASSERTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "scope_kbs_splicing_assertions", "SCOPE-KBS-SPLICING-ASSERTIONS", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_kbs_partition_file()
  {
    $kbs_partition$ = SubLFiles.defparameter( "*KBS-PARTITION*", $list0 );
    $kbs_splicing_partition$ = SubLFiles.defparameter( "*KBS-SPLICING-PARTITION*", $list10 );
    $kbs_splicing_assertions$ = SubLFiles.deflexical( "*KBS-SPLICING-ASSERTIONS*", NIL );
    return NIL;
  }

  public static SubLObject setup_kbs_partition_file()
  {
    memoization_state.note_memoized_function( $sym8$VALID_ASSERT_INFO_FORT );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kbs_partition_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kbs_partition_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kbs_partition_file();
  }
  static
  {
    me = new kbs_partition();
    $kbs_partition$ = null;
    $kbs_splicing_partition$ = null;
    $kbs_splicing_assertions$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeKeyword( "FUNCTION" ), makeSymbol( "SCOPE-KBS-FORTS" ) ), ConsesLow.list( makeKeyword( "FUNCTION" ), makeSymbol( "SCOPE-KBS-ASSERTIONS" ) ), ConsesLow.list( makeKeyword(
        "FUNCTION" ), makeSymbol( "SCOPE-KBS-DEDUCTIONS" ) ), ConsesLow.list( makeKeyword( "SCOPE-COMPLETELY-SPECIFIED?" ), T ) );
    $str1$scoping_KBS_FORTs = makeString( "scoping KBS FORTs" );
    $kw2$SKIP = makeKeyword( "SKIP" );
    $str3$scoping_KBS_assertions = makeString( "scoping KBS assertions" );
    $sym4$STRINGP = makeSymbol( "STRINGP" );
    $str5$scoping_KBS_deductions = makeString( "scoping KBS deductions" );
    $str6$cleaning_KBS_assert_info = makeString( "cleaning KBS assert info" );
    $kw7$UNCHANGED = makeKeyword( "UNCHANGED" );
    $sym8$VALID_ASSERT_INFO_FORT = makeSymbol( "VALID-ASSERT-INFO-FORT" );
    $const9$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list10 = ConsesLow.list( ConsesLow.list( makeKeyword( "FUNCTION" ), makeSymbol( "SCOPE-KBS-SPLICING-ASSERTIONS" ) ) );
    $str11$scoping_KBS_splicing_assertions = makeString( "scoping KBS splicing assertions" );
    $str12$cdolist = makeString( "cdolist" );
  }
}
/*
 * 
 * Total time: 348 ms
 * 
 */