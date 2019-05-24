package com.cyc.cycjava.cycl.rdf;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rdf_blank_node
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rdf.rdf_blank_node";
  public static final String myFingerPrint = "ac79f8de866576acdfc47139c8ce6a599084080c5b2be45ef0c7ccc10232937f";
  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-blank-node.lisp", position = 1454L)
  public static SubLSymbol $dtp_rdf_blank_node$;
  private static final SubLSymbol $sym0$RDF_BLANK_NODE;
  private static final SubLSymbol $sym1$RDF_BLANK_NODE_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PRINT_RDF_BLANK_NODE;
  private static final SubLSymbol $sym7$RDF_BLANK_NODE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$RDF_BNODE_ID;
  private static final SubLSymbol $sym10$_CSETF_RDF_BNODE_ID;
  private static final SubLSymbol $kw11$ID;
  private static final SubLString $str12$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw13$BEGIN;
  private static final SubLSymbol $sym14$MAKE_RDF_BLANK_NODE;
  private static final SubLSymbol $kw15$SLOT;
  private static final SubLSymbol $kw16$END;
  private static final SubLSymbol $sym17$VISIT_DEFSTRUCT_OBJECT_RDF_BLANK_NODE_METHOD;
  private static final SubLString $str18$_RDF_BLANK_NODE__S_;
  private static final SubLSymbol $sym19$SXHASH_RDF_BLANK_NODE_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-blank-node.lisp", position = 880L)
  public static SubLObject rdf_blank_node_equal_p(final SubLObject node1, final SubLObject node2)
  {
    return Equality.equal( rdf_blank_node_id( node1 ), rdf_blank_node_id( node2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-blank-node.lisp", position = 1002L)
  public static SubLObject rdf_blank_node_L(final SubLObject node1, final SubLObject node2)
  {
    final SubLObject id1 = rdf_blank_node_id( node1 );
    final SubLObject id2 = rdf_blank_node_id( node2 );
    return ( id1.isString() && id2.isString() ) ? Strings.stringL( id1, id2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED )
        : ( ( id1.isNumber() && id2.isNumber() ) ? Numbers.numL( id1, id2 ) : Strings.stringL( print_high.princ_to_string( id1 ), print_high.princ_to_string( id2 ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-blank-node.lisp", position = 1454L)
  public static SubLObject rdf_blank_node_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_rdf_blank_node( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-blank-node.lisp", position = 1454L)
  public static SubLObject rdf_blank_node_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $rdf_blank_node_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-blank-node.lisp", position = 1454L)
  public static SubLObject rdf_bnode_id(final SubLObject v_object)
  {
    assert NIL != rdf_blank_node_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-blank-node.lisp", position = 1454L)
  public static SubLObject _csetf_rdf_bnode_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != rdf_blank_node_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-blank-node.lisp", position = 1454L)
  public static SubLObject make_rdf_blank_node(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $rdf_blank_node_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw11$ID ) )
      {
        _csetf_rdf_bnode_id( v_new, current_value );
      }
      else
      {
        Errors.error( $str12$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-blank-node.lisp", position = 1454L)
  public static SubLObject visit_defstruct_rdf_blank_node(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw13$BEGIN, $sym14$MAKE_RDF_BLANK_NODE, ONE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw15$SLOT, $kw11$ID, rdf_bnode_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw16$END, $sym14$MAKE_RDF_BLANK_NODE, ONE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-blank-node.lisp", position = 1454L)
  public static SubLObject visit_defstruct_object_rdf_blank_node_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_rdf_blank_node( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-blank-node.lisp", position = 1572L)
  public static SubLObject print_rdf_blank_node(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str18$_RDF_BLANK_NODE__S_, rdf_bnode_id( v_object ) );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-blank-node.lisp", position = 1735L)
  public static SubLObject new_rdf_blank_node(final SubLObject id)
  {
    final SubLObject bnode = make_rdf_blank_node( UNPROVIDED );
    _csetf_rdf_bnode_id( bnode, id );
    return bnode;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-blank-node.lisp", position = 1889L)
  public static SubLObject rdf_blank_node_id_string(final SubLObject bnode)
  {
    assert NIL != rdf_blank_node_p( bnode ) : bnode;
    return print_high.princ_to_string( rdf_bnode_id( bnode ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-blank-node.lisp", position = 2039L)
  public static SubLObject rdf_blank_node_id(final SubLObject bnode)
  {
    assert NIL != rdf_blank_node_p( bnode ) : bnode;
    return rdf_bnode_id( bnode );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-blank-node.lisp", position = 2150L)
  public static SubLObject sxhash_rdf_blank_node_method(final SubLObject v_object)
  {
    return sxhash_rdf_blank_node( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-blank-node.lisp", position = 2258L)
  public static SubLObject sxhash_rdf_blank_node(final SubLObject bnode)
  {
    return Sxhash.sxhash( rdf_bnode_id( bnode ) );
  }

  public static SubLObject declare_rdf_blank_node_file()
  {
    SubLFiles.declareFunction( me, "rdf_blank_node_equal_p", "RDF-BLANK-NODE-EQUAL-P", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_blank_node_L", "RDF-BLANK-NODE-<", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_blank_node_print_function_trampoline", "RDF-BLANK-NODE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "rdf_blank_node_p", "RDF-BLANK-NODE-P", 1, 0, false );
    new $rdf_blank_node_p$UnaryFunction();
    SubLFiles.declareFunction( me, "rdf_bnode_id", "RDF-BNODE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rdf_bnode_id", "_CSETF-RDF-BNODE-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "make_rdf_blank_node", "MAKE-RDF-BLANK-NODE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_rdf_blank_node", "VISIT-DEFSTRUCT-RDF-BLANK-NODE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_rdf_blank_node_method", "VISIT-DEFSTRUCT-OBJECT-RDF-BLANK-NODE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_rdf_blank_node", "PRINT-RDF-BLANK-NODE", 3, 0, false );
    SubLFiles.declareFunction( me, "new_rdf_blank_node", "NEW-RDF-BLANK-NODE", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_blank_node_id_string", "RDF-BLANK-NODE-ID-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "rdf_blank_node_id", "RDF-BLANK-NODE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_rdf_blank_node_method", "SXHASH-RDF-BLANK-NODE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_rdf_blank_node", "SXHASH-RDF-BLANK-NODE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_rdf_blank_node_file()
  {
    $dtp_rdf_blank_node$ = SubLFiles.defconstant( "*DTP-RDF-BLANK-NODE*", $sym0$RDF_BLANK_NODE );
    return NIL;
  }

  public static SubLObject setup_rdf_blank_node_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_rdf_blank_node$.getGlobalValue(), Symbols.symbol_function( $sym7$RDF_BLANK_NODE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$RDF_BNODE_ID, $sym10$_CSETF_RDF_BNODE_ID );
    Equality.identity( $sym0$RDF_BLANK_NODE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rdf_blank_node$.getGlobalValue(), Symbols.symbol_function( $sym17$VISIT_DEFSTRUCT_OBJECT_RDF_BLANK_NODE_METHOD ) );
    utilities_macros.note_funcall_helper_function( $sym6$PRINT_RDF_BLANK_NODE );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_rdf_blank_node$.getGlobalValue(), Symbols.symbol_function( $sym19$SXHASH_RDF_BLANK_NODE_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rdf_blank_node_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rdf_blank_node_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rdf_blank_node_file();
  }
  static
  {
    me = new rdf_blank_node();
    $dtp_rdf_blank_node$ = null;
    $sym0$RDF_BLANK_NODE = makeSymbol( "RDF-BLANK-NODE" );
    $sym1$RDF_BLANK_NODE_P = makeSymbol( "RDF-BLANK-NODE-P" );
    $list2 = ConsesLow.list( makeSymbol( "ID" ) );
    $list3 = ConsesLow.list( makeKeyword( "ID" ) );
    $list4 = ConsesLow.list( makeSymbol( "RDF-BNODE-ID" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-RDF-BNODE-ID" ) );
    $sym6$PRINT_RDF_BLANK_NODE = makeSymbol( "PRINT-RDF-BLANK-NODE" );
    $sym7$RDF_BLANK_NODE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "RDF-BLANK-NODE-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "RDF-BLANK-NODE-P" ) );
    $sym9$RDF_BNODE_ID = makeSymbol( "RDF-BNODE-ID" );
    $sym10$_CSETF_RDF_BNODE_ID = makeSymbol( "_CSETF-RDF-BNODE-ID" );
    $kw11$ID = makeKeyword( "ID" );
    $str12$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw13$BEGIN = makeKeyword( "BEGIN" );
    $sym14$MAKE_RDF_BLANK_NODE = makeSymbol( "MAKE-RDF-BLANK-NODE" );
    $kw15$SLOT = makeKeyword( "SLOT" );
    $kw16$END = makeKeyword( "END" );
    $sym17$VISIT_DEFSTRUCT_OBJECT_RDF_BLANK_NODE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-RDF-BLANK-NODE-METHOD" );
    $str18$_RDF_BLANK_NODE__S_ = makeString( "<RDF-BLANK-NODE ~S>" );
    $sym19$SXHASH_RDF_BLANK_NODE_METHOD = makeSymbol( "SXHASH-RDF-BLANK-NODE-METHOD" );
  }

  public static final class $rdf_blank_node_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    private static final SubLStructDeclNative structDecl;

    public $rdf_blank_node_native()
    {
      this.$id = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $rdf_blank_node_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $rdf_blank_node_native.class, $sym0$RDF_BLANK_NODE, $sym1$RDF_BLANK_NODE_P, $list2, $list3, new String[] { "$id"
      }, $list4, $list5, $sym6$PRINT_RDF_BLANK_NODE );
    }
  }

  public static final class $rdf_blank_node_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $rdf_blank_node_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "RDF-BLANK-NODE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return rdf_blank_node_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 100 ms
 * 
 */