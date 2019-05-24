//
//
package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.inference.arete;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class constants_low
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.constants_low";
  public static final String myFingerPrint = "9a8731ee2d77cdfb18c2be055fcd3796938bc65eeb2ddec81405b64fe8bca1cf";
  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 940L)
  private static SubLSymbol $constant_guid_table$;
  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 1155L)
  private static SubLSymbol $constant_merged_guid_table$;
  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 1313L)
  private static SubLSymbol $constant_from_guid$;
  private static final SubLSymbol $sym0$_CONSTANT_GUID_TABLE_;
  private static final SubLSymbol $kw1$UNINITIALIZED;
  private static final SubLSymbol $sym2$_CONSTANT_MERGED_GUID_TABLE_;
  private static final SubLSymbol $sym3$_CONSTANT_FROM_GUID_;
  private static final SubLInteger $int4$750;
  private static final SubLSymbol $sym5$CONSTANT_INFO;
  private static final SubLString $str6$A_constant_with_the_name__s_alrea;
  private static final SubLSymbol $sym7$CONSTANT_P;
  private static final SubLSymbol $sym8$GUID_P;
  private static final SubLSymbol $sym9$TRUE;

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 1399L)
  public static SubLObject setup_constant_guid_table(final SubLObject size, final SubLObject exactP)
  {
    SubLObject setupP = NIL;
    if( NIL == id_index.id_index_p( $constant_guid_table$.getGlobalValue() ) )
    {
      $constant_guid_table$.setGlobalValue( id_index.new_id_index( size, ZERO_INTEGER ) );
      setupP = T;
    }
    if( NIL == id_index.id_index_p( $constant_merged_guid_table$.getGlobalValue() ) )
    {
      $constant_merged_guid_table$.setGlobalValue( id_index.new_id_index( $int4$750, ZERO_INTEGER ) );
      setupP = T;
    }
    if( !$constant_from_guid$.getGlobalValue().isHashtable() )
    {
      $constant_from_guid$.setGlobalValue( Hashtables.make_hash_table( size, Symbols.symbol_function( EQUALP ), UNPROVIDED ) );
      setupP = T;
    }
    return setupP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 2259L)
  public static SubLObject lookup_constant_guid(final SubLObject id)
  {
    return id_index.id_index_lookup( $constant_guid_table$.getGlobalValue(), id, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 2368L)
  public static SubLObject lookup_constant_merged_guid(final SubLObject id)
  {
    return id_index.id_index_lookup( $constant_merged_guid_table$.getGlobalValue(), id, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 2477L)
  public static SubLObject lookup_constant_by_guid(final SubLObject guid)
  {
    return Hashtables.gethash_without_values( guid, $constant_from_guid$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 2713L)
  public static SubLObject register_constant_guid(final SubLObject id, final SubLObject constant_guid, final SubLObject constant)
  {
    id_index.id_index_enter( $constant_guid_table$.getGlobalValue(), id, constant_guid );
    Hashtables.sethash( constant_guid, $constant_from_guid$.getGlobalValue(), constant );
    return constant_guid;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 3198L)
  public static SubLObject register_constant_merged_guid(final SubLObject id, final SubLObject constant_guid, final SubLObject constant)
  {
    id_index.id_index_enter( $constant_merged_guid_table$.getGlobalValue(), id, constant_guid );
    Hashtables.sethash( constant_guid, $constant_from_guid$.getGlobalValue(), constant );
    return constant_guid;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 3623L)
  public static SubLObject deregister_constant_guid(final SubLObject id, final SubLObject guid)
  {
    id_index.id_index_remove( $constant_guid_table$.getGlobalValue(), id );
    Hashtables.remhash( guid, $constant_from_guid$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 3851L)
  public static SubLObject deregister_constant_merged_guid(final SubLObject id, final SubLObject guid)
  {
    id_index.id_index_remove( $constant_merged_guid_table$.getGlobalValue(), id );
    Hashtables.remhash( guid, $constant_from_guid$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 4056L)
  public static SubLObject clear_constant_guid_table()
  {
    id_index.clear_id_index( $constant_guid_table$.getGlobalValue() );
    id_index.clear_id_index( $constant_merged_guid_table$.getGlobalValue() );
    Hashtables.clrhash( $constant_from_guid$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 4367L)
  public static SubLObject kb_create_constant_kb_store(final SubLObject name, final SubLObject external_id)
  {
    SubLObject constant = lookup_constant_by_guid( external_id );
    if( NIL != constant )
    {
      return constants_high.constant_internal_id( constant );
    }
    final SubLObject suid = constant_handles.make_constant_suid();
    constant = constant_handles.make_constant_shell( name, T );
    constant_handles.install_constant_suid( constant, suid );
    if( name.isString() )
    {
      constant_handles.deregister_invalid_constant_by_name( name );
    }
    kb_create_constant_int( constant, name, external_id );
    return suid;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 5230L)
  public static SubLObject kb_create_constant_int(final SubLObject constant, final SubLObject name, final SubLObject external_id)
  {
    install_constant_external_id( constant, external_id );
    if( name.isString() )
    {
      constant_completion_low.add_constant_to_completions( constant, name );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 5565L)
  public static SubLObject kb_create_constant_cyc(final SubLObject name, final SubLObject internal_id)
  {
    final SubLObject constant = constant_handles.make_constant_shell( name, T );
    install_constant_internal_id( constant, internal_id );
    if( name.isString() )
    {
      constant_handles.deregister_invalid_constant_by_name( name );
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 6018L)
  public static SubLObject install_constant_external_id(final SubLObject constant, final SubLObject external_id)
  {
    SubLObject guid = NIL;
    if( NIL != constants_high.constant_legacy_id_p( external_id ) )
    {
      guid = constants_high.make_constant_legacy_guid( external_id );
    }
    else if( NIL != Guids.guid_p( external_id ) )
    {
      guid = external_id;
    }
    install_constant_guid( constant, guid );
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 7023L)
  public static SubLObject install_constant_internal_id(final SubLObject constant, final SubLObject internal_id)
  {
    return constant_handles.install_constant_suid( constant, internal_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 7279L)
  public static SubLObject kb_remove_constant_internal(final SubLObject constant)
  {
    final SubLObject name = constant_name_internal( constant );
    if( name.isString() )
    {
      constant_completion_low.remove_constant_from_completions( constant, name );
      constant_handles.deregister_invalid_constant_by_name( name );
    }
    deregister_constant_guts( constant );
    deregister_constant_ids( constant );
    constant_handles.free_constant( constant );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 8044L)
  public static SubLObject deregister_constant_guts(final SubLObject constant)
  {
    final SubLObject suid = constant_handles.constant_suid( constant );
    if( suid.isInteger() )
    {
      constant_index_manager.deregister_constant_index( suid );
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 8225L)
  public static SubLObject deregister_constant_ids(final SubLObject constant)
  {
    SubLObject guid = constants_high.constant_guid( constant );
    if( NIL != Guids.guid_p( guid ) )
    {
      deregister_constant_guid( constant_handles.constant_suid( constant ), guid );
    }
    guid = constants_high.constant_merged_guid( constant );
    if( NIL != Guids.guid_p( guid ) )
    {
      deregister_constant_merged_guid( constant_handles.constant_suid( constant ), guid );
    }
    final SubLObject suid = constant_handles.constant_suid( constant );
    if( suid.isInteger() )
    {
      constant_handles.deregister_constant_suid( suid );
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 8786L)
  public static SubLObject constant_guid_internal(final SubLObject constant)
  {
    final SubLObject id = constant_handles.constant_suid( constant );
    return lookup_constant_guid( id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 9074L)
  public static SubLObject constant_merged_guid_internal(final SubLObject constant)
  {
    final SubLObject id = constant_handles.constant_suid( constant );
    return lookup_constant_merged_guid( id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 9351L)
  public static SubLObject constant_name_internal(final SubLObject constant)
  {
    return constant_handles.c_name( constant );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 9480L)
  public static SubLObject constant_index(final SubLObject constant)
  {
    final SubLObject id = constant_handles.constant_suid( constant );
    if( NIL != id )
    {
      return constant_index_manager.lookup_constant_index( id );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 9822L)
  public static SubLObject constant_index_swapped_inP(final SubLObject constant)
  {
    arete.arete_note_constant_touched( constant );
    final SubLObject id = constant_handles.constant_suid( constant );
    if( NIL != id )
    {
      return constant_index_manager.constant_index_cachedP( id );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 10182L)
  public static SubLObject kb_new_constant_info_iterator_internal()
  {
    final SubLObject input_iterator = constant_handles.new_constants_iterator();
    return iteration.new_indirect_iterator( input_iterator, $sym5$CONSTANT_INFO, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 10502L)
  public static SubLObject constant_info(final SubLObject constant)
  {
    final SubLObject suid = constant_handles.constant_suid( constant );
    final SubLObject name = constant_name_internal( constant );
    final SubLObject guid = suid.isInteger() ? constant_guid_internal( constant ) : NIL;
    return ConsesLow.list( suid, name, guid );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 10851L)
  public static SubLObject kb_rename_constant_internal(final SubLObject constant, final SubLObject new_name)
  {
    if( NIL != constants_interface.kb_lookup_constant_by_name( new_name ) )
    {
      Errors.error( $str6$A_constant_with_the_name__s_alrea, new_name );
    }
    final SubLObject old_name = constants_high.constant_name( constant );
    if( old_name.isString() )
    {
      constant_completion_low.remove_constant_from_completions( constant, old_name );
      constant_handles.deregister_invalid_constant_by_name( old_name );
    }
    reset_constant_name( constant, new_name );
    if( new_name.isString() )
    {
      constant_completion_low.add_constant_to_completions( constant, new_name );
      constant_handles.register_invalid_constant_by_name( new_name, constant );
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 11678L)
  public static SubLObject reset_constant_name(final SubLObject constant, final SubLObject new_name)
  {
    constant_handles._csetf_c_name( constant, new_name );
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 11935L)
  public static SubLObject reset_constant_index(final SubLObject constant, final SubLObject new_index)
  {
    constant_index_manager.register_constant_index( constant_handles.constant_suid( constant ), new_index );
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 12295L)
  public static SubLObject install_constant_guid(final SubLObject constant, final SubLObject guid)
  {
    assert NIL != constant_handles.constant_p( constant ) : constant;
    assert NIL != Guids.guid_p( guid ) : guid;
    if( NIL == Guids.guid_p( constants_high.constant_guid( constant ) ) )
    {
      reset_constant_guid( constant, guid );
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 12516L)
  public static SubLObject reset_constant_guid(final SubLObject constant, final SubLObject new_guid)
  {
    register_constant_guid( constant_handles.constant_suid( constant ), new_guid, constant );
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 12867L)
  public static SubLObject install_constant_merged_guid(final SubLObject constant, final SubLObject new_guid)
  {
    assert NIL != constant_handles.constant_p( constant ) : constant;
    assert NIL != Guids.guid_p( new_guid ) : new_guid;
    if( NIL != Guids.guid_p( constants_high.constant_guid( constant ) ) )
    {
      register_constant_merged_guid( constant_handles.constant_suid( constant ), new_guid, constant );
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 13320L)
  public static SubLObject uninstall_constant_merged_guid(final SubLObject constant, final SubLObject new_guid)
  {
    assert NIL != constant_handles.constant_p( constant ) : constant;
    assert NIL != Guids.guid_p( new_guid ) : new_guid;
    if( NIL != Guids.guid_p( constants_high.constant_guid( constant ) ) )
    {
      deregister_constant_merged_guid( constant_handles.constant_suid( constant ), new_guid );
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 13770L)
  public static SubLObject random_constant_internal(SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( $sym9$TRUE );
    }
    if( constant_handles.constant_count().numG( ZERO_INTEGER ) )
    {
      final SubLObject max_id = constant_handles.next_constant_suid();
      SubLObject v_answer;
      SubLObject candidate;
      for( v_answer = NIL; NIL == v_answer; v_answer = candidate )
      {
        candidate = constant_handles.find_constant_by_suid( random.random( max_id ) );
        if( NIL != candidate && NIL != Functions.funcall( test, candidate ) )
        {
        }
      }
      return v_answer;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constants-low.lisp", position = 14171L)
  public static SubLObject load_install_constant_ids(final SubLObject constant, final SubLObject dump_id, final SubLObject guid)
  {
    final SubLObject name = constant_name_internal( constant );
    constant_handles.install_constant_suid( constant, dump_id );
    constant_handles.deregister_invalid_constant_by_name( name );
    kb_create_constant_int( constant, name, guid );
    return constant;
  }

  public static SubLObject declare_constants_low_file()
  {
    SubLFiles.declareFunction(me, "setup_constant_guid_table", "SETUP-CONSTANT-GUID-TABLE", 2, 0, false );
    SubLFiles.declareFunction(me, "lookup_constant_guid", "LOOKUP-CONSTANT-GUID", 1, 0, false );
    SubLFiles.declareFunction(me, "lookup_constant_merged_guid", "LOOKUP-CONSTANT-MERGED-GUID", 1, 0, false );
    SubLFiles.declareFunction(me, "lookup_constant_by_guid", "LOOKUP-CONSTANT-BY-GUID", 1, 0, false );
    SubLFiles.declareFunction(me, "register_constant_guid", "REGISTER-CONSTANT-GUID", 3, 0, false );
    SubLFiles.declareFunction(me, "register_constant_merged_guid", "REGISTER-CONSTANT-MERGED-GUID", 3, 0, false );
    SubLFiles.declareFunction(me, "deregister_constant_guid", "DEREGISTER-CONSTANT-GUID", 2, 0, false );
    SubLFiles.declareFunction(me, "deregister_constant_merged_guid", "DEREGISTER-CONSTANT-MERGED-GUID", 2, 0, false );
    SubLFiles.declareFunction(me, "clear_constant_guid_table", "CLEAR-CONSTANT-GUID-TABLE", 0, 0, false );
    SubLFiles.declareFunction(me, "kb_create_constant_kb_store", "KB-CREATE-CONSTANT-KB-STORE", 2, 0, false );
    SubLFiles.declareFunction(me, "kb_create_constant_int", "KB-CREATE-CONSTANT-INT", 3, 0, false );
    SubLFiles.declareFunction(me, "kb_create_constant_cyc", "KB-CREATE-CONSTANT-CYC", 2, 0, false );
    SubLFiles.declareFunction(me, "install_constant_external_id", "INSTALL-CONSTANT-EXTERNAL-ID", 2, 0, false );
    SubLFiles.declareFunction(me, "install_constant_internal_id", "INSTALL-CONSTANT-INTERNAL-ID", 2, 0, false );
    SubLFiles.declareFunction(me, "kb_remove_constant_internal", "KB-REMOVE-CONSTANT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction(me, "deregister_constant_guts", "DEREGISTER-CONSTANT-GUTS", 1, 0, false );
    SubLFiles.declareFunction(me, "deregister_constant_ids", "DEREGISTER-CONSTANT-IDS", 1, 0, false );
    SubLFiles.declareFunction(me, "constant_guid_internal", "CONSTANT-GUID-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction(me, "constant_merged_guid_internal", "CONSTANT-MERGED-GUID-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction(me, "constant_name_internal", "CONSTANT-NAME-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction(me, "constant_index", "CONSTANT-INDEX", 1, 0, false );
    SubLFiles.declareFunction(me, "constant_index_swapped_inP", "CONSTANT-INDEX-SWAPPED-IN?", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_new_constant_info_iterator_internal", "KB-NEW-CONSTANT-INFO-ITERATOR-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction(me, "constant_info", "CONSTANT-INFO", 1, 0, false );
    SubLFiles.declareFunction(me, "kb_rename_constant_internal", "KB-RENAME-CONSTANT-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction(me, "reset_constant_name", "RESET-CONSTANT-NAME", 2, 0, false );
    SubLFiles.declareFunction(me, "reset_constant_index", "RESET-CONSTANT-INDEX", 2, 0, false );
    SubLFiles.declareFunction(me, "install_constant_guid", "INSTALL-CONSTANT-GUID", 2, 0, false );
    SubLFiles.declareFunction(me, "reset_constant_guid", "RESET-CONSTANT-GUID", 2, 0, false );
    SubLFiles.declareFunction(me, "install_constant_merged_guid", "INSTALL-CONSTANT-MERGED-GUID", 2, 0, false );
    SubLFiles.declareFunction(me, "uninstall_constant_merged_guid", "UNINSTALL-CONSTANT-MERGED-GUID", 2, 0, false );
    SubLFiles.declareFunction(me, "random_constant_internal", "RANDOM-CONSTANT-INTERNAL", 0, 1, false );
    SubLFiles.declareFunction(me, "load_install_constant_ids", "LOAD-INSTALL-CONSTANT-IDS", 3, 0, false );
    return NIL;
  }

  public static SubLObject init_constants_low_file()
  {
    $constant_guid_table$ = SubLFiles.deflexical( "*CONSTANT-GUID-TABLE*", ( maybeDefault( $sym0$_CONSTANT_GUID_TABLE_, $constant_guid_table$, $kw1$UNINITIALIZED ) ) );
    $constant_merged_guid_table$ = SubLFiles.deflexical( "*CONSTANT-MERGED-GUID-TABLE*", ( maybeDefault( $sym2$_CONSTANT_MERGED_GUID_TABLE_, $constant_merged_guid_table$, $kw1$UNINITIALIZED ) ) );
    $constant_from_guid$ = SubLFiles.deflexical( "*CONSTANT-FROM-GUID*", ( maybeDefault( $sym3$_CONSTANT_FROM_GUID_, $constant_from_guid$, NIL ) ) );
    return NIL;
  }

  public static SubLObject setup_constants_low_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_CONSTANT_GUID_TABLE_ );
    subl_macro_promotions.declare_defglobal( $sym2$_CONSTANT_MERGED_GUID_TABLE_ );
    subl_macro_promotions.declare_defglobal( $sym3$_CONSTANT_FROM_GUID_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_constants_low_file();
  }

  @Override
  public void initializeVariables()
  {
    init_constants_low_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_constants_low_file();
  }
  static
  {
    me = new constants_low();
    $constant_guid_table$ = null;
    $constant_merged_guid_table$ = null;
    $constant_from_guid$ = null;
    $sym0$_CONSTANT_GUID_TABLE_ = makeSymbol( "*CONSTANT-GUID-TABLE*" );
    $kw1$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym2$_CONSTANT_MERGED_GUID_TABLE_ = makeSymbol( "*CONSTANT-MERGED-GUID-TABLE*" );
    $sym3$_CONSTANT_FROM_GUID_ = makeSymbol( "*CONSTANT-FROM-GUID*" );
    $int4$750 = makeInteger( 750 );
    $sym5$CONSTANT_INFO = makeSymbol( "CONSTANT-INFO" );
    $str6$A_constant_with_the_name__s_alrea = makeString( "A constant with the name ~s already exists." );
    $sym7$CONSTANT_P = makeSymbol( "CONSTANT-P" );
    $sym8$GUID_P = makeSymbol( "GUID-P" );
    $sym9$TRUE = makeSymbol( "TRUE" );
  }
}