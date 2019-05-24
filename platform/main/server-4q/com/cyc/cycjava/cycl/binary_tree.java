package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_dates;
import com.cyc.cycjava.cycl.sbhl.sbhl_iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class binary_tree
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.binary_tree";
  public static final String myFingerPrint = "b5cec37136debeba42ccb2e3dd8d92cc37b85e43ba665ad95f49a84c9bff7c52";
  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 1195L)
  public static SubLSymbol $dtp_btree$;
  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 1790L)
  private static SubLSymbol $btree_free_list$;
  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 1790L)
  private static SubLSymbol $btree_free_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 3745L)
  private static SubLSymbol $validate_btrees$;
  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 6543L)
  private static SubLSymbol $btree_tags$;
  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 9211L)
  private static SubLSymbol $btree_remove_debugging$;
  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 10669L)
  private static SubLSymbol $cfasl_opcode_btree$;
  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 11536L)
  private static SubLSymbol $cfasl_opcode_legacy_btree_low$;
  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 12018L)
  private static SubLSymbol $cfasl_opcode_legacy_btree_high$;
  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 12476L)
  private static SubLSymbol $cfasl_opcode_legacy_btree_leaf$;
  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 12916L)
  private static SubLSymbol $btree_balance_vector_index$;
  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 13030L)
  private static SubLSymbol $btree_balance_vector$;
  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 16183L)
  public static SubLSymbol $dtp_avl_tree$;
  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 21308L)
  private static SubLSymbol $cfasl_opcode_avl_tree$;
  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 42081L)
  public static SubLSymbol $print_avl_tree_node_dataP$;
  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 42338L)
  public static SubLSymbol $dtp_avl_tree_node$;
  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 45802L)
  private static SubLSymbol $cfasl_opcode_avl_tree_node$;
  private static final SubLSymbol $sym0$BTREE;
  private static final SubLSymbol $sym1$BTREE_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PRINT_BTREE;
  private static final SubLSymbol $sym7$BTREE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$BT_TAG;
  private static final SubLSymbol $sym10$_CSETF_BT_TAG;
  private static final SubLSymbol $sym11$BT_STATE;
  private static final SubLSymbol $sym12$_CSETF_BT_STATE;
  private static final SubLSymbol $sym13$BT_LOWER;
  private static final SubLSymbol $sym14$_CSETF_BT_LOWER;
  private static final SubLSymbol $sym15$BT_HIGHER;
  private static final SubLSymbol $sym16$_CSETF_BT_HIGHER;
  private static final SubLSymbol $kw17$TAG;
  private static final SubLSymbol $kw18$STATE;
  private static final SubLSymbol $kw19$LOWER;
  private static final SubLSymbol $kw20$HIGHER;
  private static final SubLString $str21$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw22$BEGIN;
  private static final SubLSymbol $sym23$MAKE_BTREE;
  private static final SubLSymbol $kw24$SLOT;
  private static final SubLSymbol $kw25$END;
  private static final SubLSymbol $sym26$VISIT_DEFSTRUCT_OBJECT_BTREE_METHOD;
  private static final SubLString $str27$__BT_;
  private static final SubLString $str28$_;
  private static final SubLString $str29$_;
  private static final SubLString $str30$_;
  private static final SubLString $str31$__S_;
  private static final SubLString $str32$BTREE_resource_lock;
  private static final SubLSymbol $kw33$FREE;
  private static final SubLList $list34;
  private static final SubLList $list35;
  private static final SubLSymbol $kw36$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw37$DONE;
  private static final SubLSymbol $sym38$SUBTREE;
  private static final SubLSymbol $sym39$DO_BTREE;
  private static final SubLSymbol $sym40$CLET;
  private static final SubLSymbol $sym41$DO_BTREE_INDEX_KEY;
  private static final SubLSymbol $sym42$DO_BTREE_INDEX_VALUE;
  private static final SubLSymbol $sym43$DO_BTREE_INDEX;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$STACK;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$CDO;
  private static final SubLSymbol $sym48$COR;
  private static final SubLSymbol $sym49$NULL;
  private static final SubLSymbol $sym50$CSETQ;
  private static final SubLList $list51;
  private static final SubLSymbol $sym52$LOWER;
  private static final SubLSymbol $sym53$DO_BTREE_LOWER;
  private static final SubLSymbol $sym54$HIGHER;
  private static final SubLSymbol $sym55$DO_BTREE_HIGHER;
  private static final SubLSymbol $sym56$PCOND;
  private static final SubLSymbol $sym57$PWHEN;
  private static final SubLSymbol $sym58$CPUSH;
  private static final SubLList $list59;
  private static final SubLList $list60;
  private static final SubLSymbol $sym61$CAR;
  private static final SubLSymbol $sym62$CPOP;
  private static final SubLString $str63$Binary_Tree__S_is_broken_before_i;
  private static final SubLString $str64$Binary_Tree__S_is_broken_after_in;
  private static final SubLString $str65$Binary_Tree__S_is_broken_before_r;
  private static final SubLString $str66$Binary_Tree__S_is_broken_after_re;
  private static final SubLSymbol $sym67$TRUE;
  private static final SubLSymbol $sym68$GATHER_BTREE_TAG;
  private static final SubLString $str69$_S_info_will_be_lost_inserting__S;
  private static final SubLString $str70$The_tags__S_were_lost_from_tree__;
  private static final SubLSymbol $sym71$CFASL_INPUT_BTREE;
  private static final SubLSymbol $sym72$CFASL_OUTPUT_OBJECT_BTREE_METHOD;
  private static final SubLSymbol $sym73$CFASL_INPUT_LEGACY_BTREE_LOW;
  private static final SubLInteger $int74$21;
  private static final SubLSymbol $sym75$CFASL_INPUT_LEGACY_BTREE_HIGH;
  private static final SubLInteger $int76$22;
  private static final SubLSymbol $sym77$CFASL_INPUT_LEGACY_BTREE_LEAF;
  private static final SubLSymbol $sym78$BTREE_BALANCE_INSERT_NODE;
  private static final SubLSymbol $sym79$AVL_TREE;
  private static final SubLSymbol $sym80$AVL_TREE_P;
  private static final SubLList $list81;
  private static final SubLList $list82;
  private static final SubLList $list83;
  private static final SubLList $list84;
  private static final SubLSymbol $sym85$PRINT_AVL_TREE;
  private static final SubLSymbol $sym86$AVL_TREE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list87;
  private static final SubLSymbol $sym88$AVLT_ROOT;
  private static final SubLSymbol $sym89$_CSETF_AVLT_ROOT;
  private static final SubLSymbol $sym90$AVLT_TEST;
  private static final SubLSymbol $sym91$_CSETF_AVLT_TEST;
  private static final SubLSymbol $sym92$AVLT_SIZE;
  private static final SubLSymbol $sym93$_CSETF_AVLT_SIZE;
  private static final SubLSymbol $kw94$ROOT;
  private static final SubLSymbol $kw95$TEST;
  private static final SubLSymbol $kw96$SIZE;
  private static final SubLSymbol $sym97$MAKE_AVL_TREE;
  private static final SubLSymbol $sym98$VISIT_DEFSTRUCT_OBJECT_AVL_TREE_METHOD;
  private static final SubLString $str99$test__a_size__a;
  private static final SubLSymbol $sym100$FUNCTION_SPEC_P;
  private static final SubLSymbol $kw101$FORWARD;
  private static final SubLSymbol $sym102$AVL_TREE_ITERATOR_DONE;
  private static final SubLSymbol $sym103$AVL_TREE_ITERATOR_NEXT;
  private static final SubLSymbol $sym104$SBHL_AVL_TREE_ITERATOR_DONE;
  private static final SubLSymbol $sym105$SBHL_AVL_TREE_ITERATOR_NEXT;
  private static final SubLInteger $int106$80;
  private static final SubLSymbol $sym107$CFASL_INPUT_AVL_TREE;
  private static final SubLSymbol $sym108$CFASL_OUTPUT_OBJECT_AVL_TREE_METHOD;
  private static final SubLList $list109;
  private static final SubLSymbol $sym110$_;
  private static final SubLSymbol $sym111$TERM__;
  private static final SubLSymbol $sym112$SBHL_DATE_;
  private static final SubLInteger $int113$_2;
  private static final SubLString $str114$AVL_tree__a_is_corrupt_;
  private static final SubLString $str115$AVL_tree__a_is_corrupt;
  private static final SubLList $list116;
  private static final SubLSymbol $sym117$AVL_TREE_NODE;
  private static final SubLSymbol $sym118$AVL_TREE_NODE_P;
  private static final SubLList $list119;
  private static final SubLList $list120;
  private static final SubLList $list121;
  private static final SubLList $list122;
  private static final SubLSymbol $sym123$PRINT_AVL_TREE_NODE;
  private static final SubLSymbol $sym124$AVL_TREE_NODE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list125;
  private static final SubLSymbol $sym126$AVLTN_DATA;
  private static final SubLSymbol $sym127$_CSETF_AVLTN_DATA;
  private static final SubLSymbol $sym128$AVLTN_BALANCE;
  private static final SubLSymbol $sym129$_CSETF_AVLTN_BALANCE;
  private static final SubLSymbol $sym130$AVLTN_LOWER;
  private static final SubLSymbol $sym131$_CSETF_AVLTN_LOWER;
  private static final SubLSymbol $sym132$AVLTN_HIGHER;
  private static final SubLSymbol $sym133$_CSETF_AVLTN_HIGHER;
  private static final SubLSymbol $kw134$DATA;
  private static final SubLSymbol $kw135$BALANCE;
  private static final SubLSymbol $sym136$MAKE_AVL_TREE_NODE;
  private static final SubLSymbol $sym137$VISIT_DEFSTRUCT_OBJECT_AVL_TREE_NODE_METHOD;
  private static final SubLString $str138$__a_;
  private static final SubLString $str139$__Data______a;
  private static final SubLString $str140$__Balance___a;
  private static final SubLString $str141$__Lower_____a;
  private static final SubLString $str142$__Higher____a;
  private static final SubLString $str143$__;
  private static final SubLInteger $int144$81;
  private static final SubLSymbol $sym145$CFASL_INPUT_AVL_TREE_NODE;
  private static final SubLSymbol $sym146$CFASL_OUTPUT_OBJECT_AVL_TREE_NODE_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 1195L)
  public static SubLObject btree_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_btree( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 1195L)
  public static SubLObject btree_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $btree_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 1195L)
  public static SubLObject bt_tag(final SubLObject v_object)
  {
    assert NIL != btree_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 1195L)
  public static SubLObject bt_state(final SubLObject v_object)
  {
    assert NIL != btree_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 1195L)
  public static SubLObject bt_lower(final SubLObject v_object)
  {
    assert NIL != btree_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 1195L)
  public static SubLObject bt_higher(final SubLObject v_object)
  {
    assert NIL != btree_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 1195L)
  public static SubLObject _csetf_bt_tag(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != btree_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 1195L)
  public static SubLObject _csetf_bt_state(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != btree_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 1195L)
  public static SubLObject _csetf_bt_lower(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != btree_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 1195L)
  public static SubLObject _csetf_bt_higher(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != btree_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 1195L)
  public static SubLObject make_btree(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $btree_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw17$TAG ) )
      {
        _csetf_bt_tag( v_new, current_value );
      }
      else if( pcase_var.eql( $kw18$STATE ) )
      {
        _csetf_bt_state( v_new, current_value );
      }
      else if( pcase_var.eql( $kw19$LOWER ) )
      {
        _csetf_bt_lower( v_new, current_value );
      }
      else if( pcase_var.eql( $kw20$HIGHER ) )
      {
        _csetf_bt_higher( v_new, current_value );
      }
      else
      {
        Errors.error( $str21$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 1195L)
  public static SubLObject visit_defstruct_btree(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw22$BEGIN, $sym23$MAKE_BTREE, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw17$TAG, bt_tag( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw18$STATE, bt_state( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw19$LOWER, bt_lower( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw20$HIGHER, bt_higher( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$END, $sym23$MAKE_BTREE, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 1195L)
  public static SubLObject visit_defstruct_object_btree_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_btree( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 1314L)
  public static SubLObject print_btree(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject higher = bt_higher( v_object );
    final SubLObject lower = bt_lower( v_object );
    if( depth.numE( ZERO_INTEGER ) )
    {
      print_high.princ( $str27$__BT_, stream );
      if( NIL != lower )
      {
        print_btree( lower, stream, ONE_INTEGER );
      }
      else
      {
        print_high.princ( $str28$_, stream );
      }
      print_high.princ( $str29$_, stream );
      print_high.prin1( bt_tag( v_object ), stream );
      print_high.princ( $str29$_, stream );
      if( NIL != higher )
      {
        print_btree( higher, stream, ONE_INTEGER );
      }
      else
      {
        print_high.princ( $str28$_, stream );
      }
      print_high.princ( $str30$_, stream );
    }
    else
    {
      PrintLow.format( stream, $str31$__S_, bt_tag( v_object ) );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 1790L)
  public static SubLObject make_static_btree()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_object = NIL;
    final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding( thread );
    try
    {
      Storage.$current_area$.bind( Storage.get_static_area(), thread );
      v_object = make_btree( UNPROVIDED );
    }
    finally
    {
      Storage.$current_area$.rebind( _prev_bind_0, thread );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 1790L)
  public static SubLObject init_btree(final SubLObject btree)
  {
    _csetf_bt_tag( btree, NIL );
    _csetf_bt_state( btree, NIL );
    _csetf_bt_lower( btree, NIL );
    _csetf_bt_higher( btree, NIL );
    return btree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 1790L)
  public static SubLObject free_btree_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != btree_p( v_object ) && bt_state( v_object ) == $kw33$FREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 1790L)
  public static SubLObject free_btree(SubLObject v_object)
  {
    assert NIL != btree_p( v_object ) : v_object;
    if( NIL == free_btree_p( v_object ) )
    {
      v_object = init_btree( v_object );
      _csetf_bt_state( v_object, $kw33$FREE );
      if( NIL != utilities_macros.$structure_resourcing_enabled$.getGlobalValue() )
      {
        SubLObject release = NIL;
        try
        {
          release = Locks.seize_lock( $btree_free_lock$.getGlobalValue() );
          _csetf_bt_tag( v_object, $btree_free_list$.getGlobalValue() );
          $btree_free_list$.setGlobalValue( v_object );
        }
        finally
        {
          if( NIL != release )
          {
            Locks.release_lock( $btree_free_lock$.getGlobalValue() );
          }
        }
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 1790L)
  public static SubLObject get_btree()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != utilities_macros.$structure_resourcing_enabled$.getGlobalValue() )
    {
      SubLObject v_object = NIL;
      SubLObject found = NIL;
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( $btree_free_lock$.getGlobalValue() );
        v_object = $btree_free_list$.getGlobalValue();
        while ( NIL == found && NIL != v_object)
        {
          if( NIL != free_btree_p( v_object ) )
          {
            $btree_free_list$.setGlobalValue( bt_tag( v_object ) );
            found = T;
          }
          else
          {
            v_object = bt_tag( v_object );
          }
        }
        if( NIL == found )
        {
          if( NIL != utilities_macros.$structure_resourcing_make_static$.getDynamicValue( thread ) )
          {
            v_object = make_static_btree();
          }
          else
          {
            v_object = make_btree( UNPROVIDED );
          }
          $btree_free_list$.setGlobalValue( NIL );
        }
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( $btree_free_lock$.getGlobalValue() );
        }
      }
      return init_btree( v_object );
    }
    if( NIL != utilities_macros.$structure_resourcing_make_static$.getDynamicValue( thread ) )
    {
      return init_btree( make_static_btree() );
    }
    return init_btree( make_btree( UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 2014L)
  public static SubLObject free_entire_btree(final SubLObject btree)
  {
    if( NIL != btree_p( btree ) )
    {
      free_entire_btree( bt_lower( btree ) );
      free_entire_btree( bt_higher( btree ) );
      final SubLObject state = bt_state( btree );
      if( NIL != btree_p( state ) )
      {
        free_entire_btree( state );
      }
      free_btree( btree );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 2289L)
  public static SubLObject do_btree_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject key = NIL;
    SubLObject value = NIL;
    SubLObject btree = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
    value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
    btree = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list34 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list34 );
      if( NIL == conses_high.member( current_$1, $list35, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw36$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list34 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw37$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject subtree = $sym38$SUBTREE;
    return ConsesLow.list( $sym39$DO_BTREE, ConsesLow.list( subtree, btree, $kw37$DONE, done ), ConsesLow.listS( $sym40$CLET, ConsesLow.list( ConsesLow.list( key, ConsesLow.list( $sym41$DO_BTREE_INDEX_KEY, subtree ) ),
        ConsesLow.list( value, ConsesLow.list( $sym42$DO_BTREE_INDEX_VALUE, subtree ) ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 2795L)
  public static SubLObject do_btree_index_key(final SubLObject btree)
  {
    return bt_tag( btree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 2894L)
  public static SubLObject do_btree_index_value(final SubLObject btree)
  {
    return bt_state( btree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 2997L)
  public static SubLObject do_btree(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject btree = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    btree = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list44 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list44 );
      if( NIL == conses_high.member( current_$2, $list35, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw36$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list44 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw37$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject stack = $sym45$STACK;
    return ConsesLow.list( $sym40$CLET, ConsesLow.list( reader.bq_cons( stack, $list46 ), ConsesLow.list( var, btree ) ), ConsesLow.listS( $sym47$CDO, NIL, ConsesLow.list( ( NIL != done ) ? ConsesLow.list( $sym48$COR,
        done, ConsesLow.list( $sym49$NULL, var ) ) : ConsesLow.list( $sym49$NULL, var ), ConsesLow.listS( $sym50$CSETQ, stack, $list51 ) ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym40$CLET, ConsesLow
            .list( ConsesLow.list( $sym52$LOWER, ConsesLow.list( $sym53$DO_BTREE_LOWER, var ) ), ConsesLow.list( $sym54$HIGHER, ConsesLow.list( $sym55$DO_BTREE_HIGHER, var ) ) ), ConsesLow.list( $sym56$PCOND, ConsesLow
                .list( $sym52$LOWER, ConsesLow.list( $sym57$PWHEN, $sym54$HIGHER, ConsesLow.list( $sym58$CPUSH, $sym54$HIGHER, stack ) ), ConsesLow.listS( $sym50$CSETQ, var, $list59 ) ), ConsesLow.list( $sym54$HIGHER,
                    ConsesLow.listS( $sym50$CSETQ, var, $list60 ) ), ConsesLow.list( T, ConsesLow.list( $sym50$CSETQ, var, ConsesLow.list( $sym61$CAR, stack ) ), ConsesLow.list( $sym62$CPOP, stack ) ) ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 3561L)
  public static SubLObject do_btree_lower(final SubLObject btree)
  {
    return bt_lower( btree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 3652L)
  public static SubLObject do_btree_higher(final SubLObject btree)
  {
    return bt_higher( btree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 3828L)
  public static SubLObject btree_insert(final SubLObject val, final SubLObject tag, final SubLObject btree, final SubLObject comp_func, final SubLObject add_val_func)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $validate_btrees$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == btree_validate( btree, comp_func, UNPROVIDED, UNPROVIDED ) )
    {
      Errors.error( $str63$Binary_Tree__S_is_broken_before_i, btree );
    }
    thread.resetMultipleValues();
    final SubLObject node = btree_find_aux( tag, btree, comp_func, T );
    final SubLObject back = thread.secondMultipleValue();
    thread.resetMultipleValues();
    _csetf_bt_state( node, ( NIL != add_val_func ) ? Functions.funcall( add_val_func, val, bt_state( node ) ) : NIL );
    final SubLObject ans = ( NIL != btree ) ? btree : node;
    if( NIL != $validate_btrees$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == btree_validate( ans, comp_func, UNPROVIDED, UNPROVIDED ) )
    {
      Errors.error( $str64$Binary_Tree__S_is_broken_after_in, ans );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 4444L)
  public static SubLObject btree_remove(final SubLObject val, final SubLObject tag, final SubLObject btree, final SubLObject comp_func, final SubLObject rem_val_func, SubLObject empty_func)
  {
    if( empty_func == UNPROVIDED )
    {
      empty_func = Symbols.symbol_function( $sym49$NULL );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $validate_btrees$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == btree_validate( btree, comp_func, UNPROVIDED, UNPROVIDED ) )
    {
      Errors.error( $str65$Binary_Tree__S_is_broken_before_r, btree );
    }
    thread.resetMultipleValues();
    final SubLObject node = btree_find_aux( tag, btree, comp_func, UNPROVIDED );
    final SubLObject back = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject ans = btree;
    if( NIL != btree_p( node ) )
    {
      _csetf_bt_state( node, Functions.funcall( rem_val_func, val, bt_state( node ) ) );
      if( NIL != Functions.funcall( empty_func, bt_state( node ) ) )
      {
        ans = btree_remove_aux( node, back, btree, comp_func );
      }
    }
    if( NIL != $validate_btrees$.getDynamicValue( thread ) && NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == btree_validate( ans, comp_func, UNPROVIDED, UNPROVIDED ) )
    {
      Errors.error( $str66$Binary_Tree__S_is_broken_after_re, ans );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 5099L)
  public static SubLObject btree_find(final SubLObject tag, final SubLObject btree, final SubLObject comp_func)
  {
    return Values.values( btree_find_aux( tag, btree, comp_func, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 5203L)
  public static SubLObject btree_find_best(final SubLObject btree)
  {
    SubLObject back = NIL;
    SubLObject next = NIL;
    back = NIL;
    for( next = btree; NIL != next; next = bt_lower( next ) )
    {
      back = next;
    }
    return back;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 5333L)
  public static SubLObject btree_find_worst(final SubLObject btree)
  {
    SubLObject back = NIL;
    SubLObject next = NIL;
    back = NIL;
    for( next = btree; NIL != next; next = bt_higher( next ) )
    {
      back = next;
    }
    return back;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 5465L)
  public static SubLObject map_btree(final SubLObject op, final SubLObject btree, SubLObject test, SubLObject key)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( $sym67$TRUE );
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    if( NIL != btree_p( btree ) )
    {
      if( NIL != Functions.funcall( test, Functions.funcall( key, btree ) ) )
      {
        Functions.funcall( op, Functions.funcall( key, btree ) );
      }
      map_btree( op, bt_lower( btree ), test, key );
      map_btree( op, bt_higher( btree ), test, key );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 5794L)
  public static SubLObject map_btree_forward(final SubLObject op, final SubLObject btree, SubLObject test, SubLObject key)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( $sym67$TRUE );
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    if( NIL != btree_p( btree ) )
    {
      map_btree_forward( op, bt_lower( btree ), test, key );
      if( NIL != Functions.funcall( test, Functions.funcall( key, btree ) ) )
      {
        Functions.funcall( op, Functions.funcall( key, btree ) );
      }
      map_btree_forward( op, bt_higher( btree ), test, key );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 6167L)
  public static SubLObject map_btree_backward(final SubLObject op, final SubLObject btree, SubLObject test, SubLObject key)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( $sym67$TRUE );
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    if( NIL != btree_p( btree ) )
    {
      map_btree_backward( op, bt_higher( btree ), test, key );
      if( NIL != Functions.funcall( test, Functions.funcall( key, btree ) ) )
      {
        Functions.funcall( op, Functions.funcall( key, btree ) );
      }
      map_btree_backward( op, bt_lower( btree ), test, key );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 6584L)
  public static SubLObject gather_btree_tag(final SubLObject btree)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $btree_tags$.setDynamicValue( ConsesLow.cons( bt_tag( btree ), $btree_tags$.getDynamicValue( thread ) ), thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 6677L)
  public static SubLObject btree_tags(final SubLObject btree)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = $btree_tags$.currentBinding( thread );
    try
    {
      $btree_tags$.bind( NIL, thread );
      map_btree( Symbols.symbol_function( $sym68$GATHER_BTREE_TAG ), btree, UNPROVIDED, UNPROVIDED );
      ans = Sequences.nreverse( $btree_tags$.getDynamicValue( thread ) );
    }
    finally
    {
      $btree_tags$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 6859L)
  public static SubLObject btree_node_count(final SubLObject btree)
  {
    if( NIL == btree )
    {
      return ZERO_INTEGER;
    }
    return Numbers.add( ONE_INTEGER, btree_node_count( bt_lower( btree ) ), btree_node_count( bt_higher( btree ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 7084L)
  public static SubLObject btree_deepest_depth(final SubLObject btree)
  {
    if( NIL == btree )
    {
      return ZERO_INTEGER;
    }
    return Numbers.add( ONE_INTEGER, Numbers.max( btree_deepest_depth( bt_lower( btree ) ), btree_deepest_depth( bt_higher( btree ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 7331L)
  public static SubLObject btree_shallowest_depth(final SubLObject btree)
  {
    if( NIL == btree )
    {
      return ZERO_INTEGER;
    }
    return Numbers.add( ONE_INTEGER, Numbers.min( btree_shallowest_depth( bt_lower( btree ) ), btree_shallowest_depth( bt_higher( btree ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 7591L)
  public static SubLObject btree_validate(final SubLObject btree, final SubLObject comp_func, SubLObject max_limit, SubLObject min_limit)
  {
    if( max_limit == UNPROVIDED )
    {
      max_limit = NIL;
    }
    if( min_limit == UNPROVIDED )
    {
      min_limit = NIL;
    }
    if( NIL == btree )
    {
      return T;
    }
    final SubLObject tag = bt_tag( btree );
    return makeBoolean( ( NIL == max_limit || NIL != Functions.funcall( comp_func, tag, max_limit ) ) && ( NIL == min_limit || NIL != Functions.funcall( comp_func, min_limit, tag ) ) && NIL != btree_validate( bt_lower(
        btree ), comp_func, tag, min_limit ) && NIL != btree_validate( bt_higher( btree ), comp_func, max_limit, tag ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 8033L)
  public static SubLObject incomparable(final SubLObject func, final SubLObject obj1, final SubLObject obj2)
  {
    return makeBoolean( NIL == Functions.funcall( func, obj1, obj2 ) && NIL == Functions.funcall( func, obj2, obj1 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 8223L)
  public static SubLObject btree_find_aux(final SubLObject tag, final SubLObject btree, final SubLObject comp_func, SubLObject createP)
  {
    if( createP == UNPROVIDED )
    {
      createP = NIL;
    }
    SubLObject back = NIL;
    SubLObject next = NIL;
    back = NIL;
    for( next = btree; NIL != next && NIL == incomparable( comp_func, tag, bt_tag( next ) ); next = ( ( NIL != Functions.funcall( comp_func, tag, bt_tag( next ) ) ) ? bt_lower( next ) : bt_higher( next ) ) )
    {
      back = next;
    }
    if( NIL == next && NIL != createP )
    {
      final SubLObject v_new = get_btree();
      _csetf_bt_tag( v_new, tag );
      if( NIL != back )
      {
        btree_insert_aux( v_new, back, comp_func );
      }
      next = v_new;
    }
    return subl_promotions.values2( next, back );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 8705L)
  public static SubLObject btree_insert_aux(final SubLObject v_new, final SubLObject old, final SubLObject comp_func)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != Functions.funcall( comp_func, bt_tag( old ), bt_tag( v_new ) ) )
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != bt_higher( old ) )
      {
        Errors.error( $str69$_S_info_will_be_lost_inserting__S, bt_higher( old ), v_new, old );
      }
      _csetf_bt_higher( old, v_new );
    }
    else
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != bt_lower( old ) )
      {
        Errors.error( $str69$_S_info_will_be_lost_inserting__S, bt_lower( old ), v_new, old );
      }
      _csetf_bt_lower( old, v_new );
    }
    return old;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 9265L)
  public static SubLObject btree_remove_aux(final SubLObject node, final SubLObject back, final SubLObject top, final SubLObject comp_func)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject low = bt_lower( node );
    final SubLObject high = bt_higher( node );
    SubLObject replacement = NIL;
    SubLObject re_insert = NIL;
    SubLObject ans = top;
    SubLObject before = NIL;
    SubLObject after = NIL;
    if( NIL != low && NIL != high )
    {
      final SubLObject rand = random.random( TWO_INTEGER );
      replacement = ( rand.numE( ZERO_INTEGER ) ? low : high );
      re_insert = ( rand.numE( ZERO_INTEGER ) ? high : low );
    }
    else
    {
      replacement = ( NIL != low ) ? low : ( ( NIL != high ) ? high : NIL );
    }
    if( NIL != $btree_remove_debugging$.getDynamicValue( thread ) )
    {
      before = btree_tags( ans );
    }
    if( NIL != re_insert )
    {
      btree_insert_tree( re_insert, replacement, comp_func );
    }
    if( NIL != back )
    {
      if( bt_lower( back ).eql( node ) )
      {
        _csetf_bt_lower( back, replacement );
      }
      else
      {
        _csetf_bt_higher( back, replacement );
      }
    }
    else
    {
      ans = replacement;
    }
    if( NIL != $btree_remove_debugging$.getDynamicValue( thread ) )
    {
      after = ConsesLow.cons( bt_tag( node ), btree_tags( ans ) );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == conses_high.subsetp( before, after, UNPROVIDED, UNPROVIDED ) )
      {
        Errors.error( $str70$The_tags__S_were_lost_from_tree__, conses_high.set_difference( before, after, UNPROVIDED, UNPROVIDED ) );
      }
    }
    free_btree( node );
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 10454L)
  public static SubLObject btree_insert_tree(final SubLObject v_new, final SubLObject btree, final SubLObject comp_func)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject node = btree_find_aux( bt_tag( v_new ), btree, comp_func, UNPROVIDED );
    final SubLObject back = thread.secondMultipleValue();
    thread.resetMultipleValues();
    btree_insert_aux( v_new, back, comp_func );
    return btree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 10787L)
  public static SubLObject cfasl_output_btree(final SubLObject btree, final SubLObject stream)
  {
    cfasl.cfasl_raw_write_byte( $cfasl_opcode_btree$.getGlobalValue(), stream );
    cfasl.cfasl_output( bt_tag( btree ), stream );
    cfasl.cfasl_output( bt_state( btree ), stream );
    cfasl.cfasl_output( bt_lower( btree ), stream );
    cfasl.cfasl_output( bt_higher( btree ), stream );
    return btree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 11080L)
  public static SubLObject cfasl_output_object_btree_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_btree( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 11184L)
  public static SubLObject cfasl_input_btree(final SubLObject stream)
  {
    SubLObject btree = NIL;
    btree = get_btree();
    _csetf_bt_tag( btree, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    _csetf_bt_state( btree, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    _csetf_bt_lower( btree, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    _csetf_bt_higher( btree, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    return btree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 11653L)
  public static SubLObject cfasl_input_legacy_btree_low(final SubLObject stream)
  {
    SubLObject btree = NIL;
    btree = get_btree();
    _csetf_bt_tag( btree, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    _csetf_bt_state( btree, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    _csetf_bt_lower( btree, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    _csetf_bt_higher( btree, NIL );
    return btree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 12108L)
  public static SubLObject cfasl_input_legacy_btree_high(final SubLObject stream)
  {
    SubLObject btree = NIL;
    btree = get_btree();
    _csetf_bt_tag( btree, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    _csetf_bt_state( btree, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    _csetf_bt_lower( btree, NIL );
    _csetf_bt_higher( btree, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    return btree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 12566L)
  public static SubLObject cfasl_input_legacy_btree_leaf(final SubLObject stream)
  {
    SubLObject btree = NIL;
    btree = get_btree();
    _csetf_bt_tag( btree, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    _csetf_bt_state( btree, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    _csetf_bt_lower( btree, NIL );
    _csetf_bt_higher( btree, NIL );
    return btree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 13080L)
  public static SubLObject btree_balancedP(final SubLObject btree)
  {
    if( Numbers.add( ONE_INTEGER, btree_shallowest_depth( btree ) ).numL( btree_deepest_depth( btree ) ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 13286L)
  public static SubLObject btree_balance(final SubLObject btree, SubLObject comp_func)
  {
    if( comp_func == UNPROVIDED )
    {
      comp_func = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == btree )
    {
      return NIL;
    }
    SubLObject ans = NIL;
    final SubLObject count = btree_node_count( btree );
    final SubLObject _prev_bind_0 = $btree_balance_vector$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $btree_balance_vector_index$.currentBinding( thread );
    try
    {
      $btree_balance_vector$.bind( Vectors.make_vector( count, NIL ), thread );
      $btree_balance_vector_index$.bind( ZERO_INTEGER, thread );
      map_btree_forward( Symbols.symbol_function( $sym78$BTREE_BALANCE_INSERT_NODE ), btree, UNPROVIDED, UNPROVIDED );
      if( NIL != comp_func )
      {
        $btree_balance_vector$.setDynamicValue( Sort.sort( $btree_balance_vector$.getDynamicValue( thread ), comp_func, Symbols.symbol_function( $sym9$BT_TAG ) ), thread );
      }
      SubLObject index;
      SubLObject btree_$3;
      for( index = NIL, index = ZERO_INTEGER; index.numL( count ); index = Numbers.add( index, ONE_INTEGER ) )
      {
        btree_$3 = Vectors.aref( $btree_balance_vector$.getDynamicValue( thread ), index );
        _csetf_bt_lower( btree_$3, NIL );
        _csetf_bt_higher( btree_$3, NIL );
      }
      ans = btree_balance_recursive( $btree_balance_vector$.getDynamicValue( thread ), ZERO_INTEGER, count );
    }
    finally
    {
      $btree_balance_vector_index$.rebind( _prev_bind_2, thread );
      $btree_balance_vector$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 14180L)
  public static SubLObject btree_balance_insert_node(final SubLObject btree)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != btree_p( btree ) )
    {
      Vectors.set_aref( $btree_balance_vector$.getDynamicValue( thread ), $btree_balance_vector_index$.getDynamicValue( thread ), btree );
      $btree_balance_vector_index$.setDynamicValue( Numbers.add( $btree_balance_vector_index$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 14401L)
  public static SubLObject btree_balance_recursive(final SubLObject node_vector, final SubLObject low_index, final SubLObject high_index)
  {
    if( high_index.numE( low_index ) )
    {
      return NIL;
    }
    if( high_index.numE( Numbers.add( low_index, ONE_INTEGER ) ) )
    {
      final SubLObject single_node = Vectors.aref( node_vector, low_index );
      _csetf_bt_lower( single_node, NIL );
      _csetf_bt_higher( single_node, NIL );
      return single_node;
    }
    final SubLObject between_index = btree_balance_split_point( low_index, high_index );
    final SubLObject between_node = Vectors.aref( node_vector, between_index );
    final SubLObject balanced_lower = btree_balance_recursive( node_vector, low_index, between_index );
    final SubLObject balanced_higher = btree_balance_recursive( node_vector, Numbers.add( between_index, ONE_INTEGER ), high_index );
    _csetf_bt_lower( between_node, balanced_lower );
    _csetf_bt_higher( between_node, balanced_higher );
    return between_node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 15234L)
  public static SubLObject btree_balance_split_point(final SubLObject low, final SubLObject high)
  {
    if( NIL != Numbers.evenp( Numbers.subtract( high, low ) ) )
    {
      return Numbers.subtract( Numbers.integerDivide( Numbers.add( high, low ), TWO_INTEGER ), random.random( TWO_INTEGER ) );
    }
    return Numbers.integerDivide( Numbers.add( low, high ), TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 16183L)
  public static SubLObject avl_tree_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_avl_tree( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 16183L)
  public static SubLObject avl_tree_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $avl_tree_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 16183L)
  public static SubLObject avlt_root(final SubLObject v_object)
  {
    assert NIL != avl_tree_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 16183L)
  public static SubLObject avlt_test(final SubLObject v_object)
  {
    assert NIL != avl_tree_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 16183L)
  public static SubLObject avlt_size(final SubLObject v_object)
  {
    assert NIL != avl_tree_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 16183L)
  public static SubLObject _csetf_avlt_root(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != avl_tree_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 16183L)
  public static SubLObject _csetf_avlt_test(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != avl_tree_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 16183L)
  public static SubLObject _csetf_avlt_size(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != avl_tree_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 16183L)
  public static SubLObject make_avl_tree(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $avl_tree_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw94$ROOT ) )
      {
        _csetf_avlt_root( v_new, current_value );
      }
      else if( pcase_var.eql( $kw95$TEST ) )
      {
        _csetf_avlt_test( v_new, current_value );
      }
      else if( pcase_var.eql( $kw96$SIZE ) )
      {
        _csetf_avlt_size( v_new, current_value );
      }
      else
      {
        Errors.error( $str21$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 16183L)
  public static SubLObject visit_defstruct_avl_tree(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw22$BEGIN, $sym97$MAKE_AVL_TREE, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw94$ROOT, avlt_root( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw95$TEST, avlt_test( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw96$SIZE, avlt_size( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$END, $sym97$MAKE_AVL_TREE, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 16183L)
  public static SubLObject visit_defstruct_object_avl_tree_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_avl_tree( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 16302L)
  public static SubLObject print_avl_tree(final SubLObject avl_tree, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( avl_tree, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, avl_tree, T, T );
      PrintLow.format( stream, $str99$test__a_size__a, avlt_test( avl_tree ), avlt_size( avl_tree ) );
      print_macros.print_unreadable_object_postamble( stream, avl_tree, T, T );
    }
    return avl_tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 16541L)
  public static SubLObject new_avl_tree(final SubLObject sort_test)
  {
    assert NIL != Types.function_spec_p( sort_test ) : sort_test;
    final SubLObject tree = make_avl_tree( UNPROVIDED );
    _csetf_avlt_test( tree, sort_test );
    _csetf_avlt_size( tree, ZERO_INTEGER );
    return tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 16845L)
  public static SubLObject avl_tree_sort_test(final SubLObject avl_tree)
  {
    return avlt_test( avl_tree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 16993L)
  public static SubLObject avl_tree_size(final SubLObject avl_tree)
  {
    return avlt_size( avl_tree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 17104L)
  public static SubLObject avl_tree_emptyP(final SubLObject avl_tree)
  {
    return Types.sublisp_null( avlt_root( avl_tree ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 17241L)
  public static SubLObject avl_tree_find(final SubLObject avl_tree, final SubLObject item)
  {
    return avl_tree_find_exact( avl_tree, avlt_root( avl_tree ), item );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 17425L)
  public static SubLObject avl_tree_find_least(final SubLObject avl_tree, SubLObject item, SubLObject strictP)
  {
    if( item == UNPROVIDED )
    {
      item = NIL;
    }
    if( strictP == UNPROVIDED )
    {
      strictP = NIL;
    }
    return ( NIL != item ) ? avl_tree_find_bounded_below( avl_tree, avlt_root( avl_tree ), item, strictP ) : avl_tree_find_unbounded_below( avlt_root( avl_tree ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 17860L)
  public static SubLObject avl_tree_find_greatest(final SubLObject avl_tree, SubLObject item, SubLObject strictP)
  {
    if( item == UNPROVIDED )
    {
      item = NIL;
    }
    if( strictP == UNPROVIDED )
    {
      strictP = NIL;
    }
    return ( NIL != item ) ? avl_tree_find_bounded_above( avl_tree, avlt_root( avl_tree ), item, strictP ) : avl_tree_find_unbounded_above( avlt_root( avl_tree ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 18310L)
  public static SubLObject avl_tree_insert(final SubLObject avl_tree, final SubLObject item)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject new_root = avl_tree_insert_and_rebalance( avl_tree, item );
    final SubLObject updatedP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != updatedP )
    {
      _csetf_avlt_size( avl_tree, Numbers.add( avlt_size( avl_tree ), ONE_INTEGER ) );
      if( NIL != new_root )
      {
        _csetf_avlt_root( avl_tree, new_root );
      }
    }
    return avl_tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 18730L)
  public static SubLObject avl_tree_remove(final SubLObject avl_tree, final SubLObject item)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == avl_tree_emptyP( avl_tree ) )
    {
      thread.resetMultipleValues();
      final SubLObject new_root = avl_tree_remove_and_rebalance( avl_tree, item );
      final SubLObject updatedP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != updatedP )
      {
        _csetf_avlt_size( avl_tree, Numbers.subtract( avlt_size( avl_tree ), ONE_INTEGER ) );
        _csetf_avlt_root( avl_tree, new_root );
      }
    }
    return avl_tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 19117L)
  public static SubLObject clear_avl_tree(final SubLObject avl_tree)
  {
    _csetf_avlt_root( avl_tree, NIL );
    _csetf_avlt_size( avl_tree, ZERO_INTEGER );
    return avl_tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 19266L)
  public static SubLObject copy_avl_tree(final SubLObject avl_tree)
  {
    final SubLObject root = avlt_root( avl_tree );
    final SubLObject test = avlt_test( avl_tree );
    final SubLObject size = avlt_size( avl_tree );
    final SubLObject new_tree = new_avl_tree( test );
    final SubLObject new_root = copy_avl_tree_node( root );
    _csetf_avlt_root( new_tree, new_root );
    _csetf_avlt_size( new_tree, size );
    return avl_tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 19736L)
  public static SubLObject avl_trees_equalP(final SubLObject avl_tree1, final SubLObject avl_tree2, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    return makeBoolean( avlt_size( avl_tree1 ).eql( avlt_size( avl_tree2 ) ) && misc_utilities.function_spec_function( avlt_test( avl_tree1 ) ).eql( misc_utilities.function_spec_function( avlt_test( avl_tree2 ) ) )
        && NIL != avl_tree_nodes_equalP( avlt_root( avl_tree1 ), avlt_root( avl_tree2 ), test ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 20184L)
  public static SubLObject list_to_avl_tree(final SubLObject list, final SubLObject sort_test)
  {
    final SubLObject avl_tree = new_avl_tree( sort_test );
    SubLObject cdolist_list_var = list;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      avl_tree_insert( avl_tree, item );
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return avl_tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 20444L)
  public static SubLObject new_avl_tree_iterator(final SubLObject avl_tree, SubLObject least, SubLObject greatest, SubLObject direction)
  {
    if( least == UNPROVIDED )
    {
      least = NIL;
    }
    if( greatest == UNPROVIDED )
    {
      greatest = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = $kw101$FORWARD;
    }
    return iteration.new_iterator( avl_tree_iterator_state( avl_tree, least, greatest, direction ), $sym102$AVL_TREE_ITERATOR_DONE, $sym103$AVL_TREE_ITERATOR_NEXT, $sym67$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 21055L)
  public static SubLObject new_avl_tree_sbhl_iterator(final SubLObject avl_tree, SubLObject least, SubLObject greatest, SubLObject direction)
  {
    if( least == UNPROVIDED )
    {
      least = NIL;
    }
    if( greatest == UNPROVIDED )
    {
      greatest = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = $kw101$FORWARD;
    }
    return sbhl_iteration.new_sbhl_iterator( avl_tree_iterator_state( avl_tree, least, greatest, direction ), $sym104$SBHL_AVL_TREE_ITERATOR_DONE, $sym105$SBHL_AVL_TREE_ITERATOR_NEXT, $sym67$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 21433L)
  public static SubLObject cfasl_output_object_avl_tree_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_avl_tree( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 21554L)
  public static SubLObject cfasl_output_avl_tree(final SubLObject avl_tree, final SubLObject stream)
  {
    cfasl.cfasl_raw_write_byte( $cfasl_opcode_avl_tree$.getGlobalValue(), stream );
    final SubLObject root = avlt_root( avl_tree );
    final SubLObject test = avlt_test( avl_tree );
    final SubLObject size = avlt_size( avl_tree );
    cfasl.cfasl_output( root, stream );
    cfasl.cfasl_output( test, stream );
    cfasl.cfasl_output( size, stream );
    return avl_tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 21877L)
  public static SubLObject cfasl_input_avl_tree(final SubLObject stream)
  {
    final SubLObject root = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject test = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject size = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    SubLObject avl_tree = NIL;
    avl_tree = make_avl_tree( UNPROVIDED );
    _csetf_avlt_root( avl_tree, root );
    _csetf_avlt_test( avl_tree, test );
    _csetf_avlt_size( avl_tree, size );
    return avl_tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 22250L)
  public static SubLObject avl_tree_balancedP(final SubLObject avl_tree)
  {
    return avl_tree_balancedP_int( avlt_root( avl_tree ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 22437L)
  public static SubLObject avl_tree_balancedP_int(final SubLObject node)
  {
    return makeBoolean( NIL == node || ( NIL != subl_promotions.memberP( avl_tree_node_balance( node ), $list109, Symbols.symbol_function( EQL ), UNPROVIDED ) && NIL != avl_tree_balancedP_int( avl_tree_node_lower(
        node ) ) && NIL != avl_tree_balancedP_int( avl_tree_node_higher( node ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 22691L)
  public static SubLObject avl_tree_height(final SubLObject avl_tree)
  {
    return avl_tree_node_height( avlt_root( avl_tree ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 22788L)
  public static SubLObject avl_tree_node_height(final SubLObject node)
  {
    return ( NIL != node ) ? number_utilities.f_1X( Numbers.max( avl_tree_node_height( avl_tree_node_lower( node ) ), avl_tree_node_height( avl_tree_node_higher( node ) ) ) ) : ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 22984L)
  public static SubLObject verify_avl_tree(final SubLObject avl_tree)
  {
    return makeBoolean( NIL != avl_tree_emptyP( avl_tree ) || NIL != verify_avl_tree_int( avlt_root( avl_tree ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 23118L)
  public static SubLObject verify_avl_tree_int(final SubLObject node)
  {
    if( NIL == node )
    {
      return ZERO_INTEGER;
    }
    final SubLObject lower_depth = verify_avl_tree_int( avl_tree_node_lower( node ) );
    if( NIL == lower_depth )
    {
      return NIL;
    }
    final SubLObject higher_depth = verify_avl_tree_int( avl_tree_node_higher( node ) );
    if( NIL != higher_depth && Numbers.subtract( higher_depth, lower_depth ).eql( avl_tree_node_balance( node ) ) )
    {
      return number_utilities.f_1X( Numbers.max( higher_depth, lower_depth ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 23552L)
  public static SubLObject avl_tree_less_thanP(final SubLObject avl_tree, final SubLObject item1, final SubLObject item2)
  {
    final SubLObject pcase_var = avl_tree_sort_test( avl_tree );
    if( pcase_var.eql( $sym110$_ ) )
    {
      return Numbers.numL( item1, item2 );
    }
    if( pcase_var.eql( $sym111$TERM__ ) )
    {
      return kb_utilities.term_L( item1, item2, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( pcase_var.eql( $sym112$SBHL_DATE_ ) )
    {
      return sbhl_time_dates.sbhl_dateL( item1, item2 );
    }
    return Functions.funcall( avl_tree_sort_test( avl_tree ), item1, item2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 23967L)
  public static SubLObject avl_tree_greater_thanP(final SubLObject avl_tree, final SubLObject item1, final SubLObject item2)
  {
    return avl_tree_less_thanP( avl_tree, item2, item1 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 24082L)
  public static SubLObject avl_tree_find_exact(final SubLObject tree, final SubLObject node, final SubLObject item)
  {
    if( NIL == node )
    {
      return NIL;
    }
    if( NIL != avl_tree_less_thanP( tree, item, avl_tree_node_data( node ) ) )
    {
      return avl_tree_find_exact( tree, avl_tree_node_lower( node ), item );
    }
    if( NIL != avl_tree_greater_thanP( tree, item, avl_tree_node_data( node ) ) )
    {
      return avl_tree_find_exact( tree, avl_tree_node_higher( node ), item );
    }
    return avl_tree_node_data( node );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 24492L)
  public static SubLObject avl_tree_find_bounded_below(final SubLObject tree, final SubLObject node, final SubLObject item, final SubLObject strictP)
  {
    if( NIL == node )
    {
      return NIL;
    }
    if( NIL != avl_tree_less_thanP( tree, item, avl_tree_node_data( node ) ) )
    {
      final SubLObject candidate = avl_tree_find_bounded_below( tree, avl_tree_node_lower( node ), item, strictP );
      return ( NIL != candidate ) ? candidate : avl_tree_node_data( node );
    }
    if( NIL != avl_tree_greater_thanP( tree, item, avl_tree_node_data( node ) ) )
    {
      return avl_tree_find_bounded_below( tree, avl_tree_node_higher( node ), item, strictP );
    }
    return ( NIL != strictP ) ? avl_tree_find_bounded_below( tree, avl_tree_node_higher( node ), item, strictP ) : avl_tree_node_data( node );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 25112L)
  public static SubLObject avl_tree_find_bounded_above(final SubLObject tree, final SubLObject node, final SubLObject item, final SubLObject strictP)
  {
    if( NIL == node )
    {
      return NIL;
    }
    if( NIL != avl_tree_greater_thanP( tree, item, avl_tree_node_data( node ) ) )
    {
      final SubLObject candidate = avl_tree_find_bounded_above( tree, avl_tree_node_higher( node ), item, strictP );
      return ( NIL != candidate ) ? candidate : avl_tree_node_data( node );
    }
    if( NIL != avl_tree_less_thanP( tree, item, avl_tree_node_data( node ) ) )
    {
      return avl_tree_find_bounded_above( tree, avl_tree_node_lower( node ), item, strictP );
    }
    return ( NIL != strictP ) ? avl_tree_find_bounded_above( tree, avl_tree_node_lower( node ), item, strictP ) : avl_tree_node_data( node );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 25731L)
  public static SubLObject avl_tree_find_unbounded_below(final SubLObject node)
  {
    return ( NIL != node ) ? avl_tree_node_data( avl_tree_find_unbounded_below_int( node ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 25871L)
  public static SubLObject avl_tree_find_unbounded_below_int(final SubLObject node)
  {
    return ( NIL != avl_tree_node_has_lower_nodeP( node ) ) ? avl_tree_find_unbounded_below_int( avl_tree_node_lower( node ) ) : node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 26059L)
  public static SubLObject avl_tree_find_unbounded_above(final SubLObject node)
  {
    return ( NIL != node ) ? avl_tree_node_data( avl_tree_find_unbounded_above_int( node ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 26199L)
  public static SubLObject avl_tree_find_unbounded_above_int(final SubLObject node)
  {
    return ( NIL != avl_tree_node_has_higher_nodeP( node ) ) ? avl_tree_find_unbounded_above_int( avl_tree_node_higher( node ) ) : node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 26389L)
  public static SubLObject avl_tree_insert_and_rebalance(final SubLObject tree, final SubLObject item)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject root = avlt_root( tree );
    if( NIL != root )
    {
      thread.resetMultipleValues();
      final SubLObject new_node = avl_tree_insert_item( tree, root, item );
      final SubLObject new_root = thread.secondMultipleValue();
      final SubLObject adjust_balanceP = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      return subl_promotions.values2( new_root, list_utilities.sublisp_boolean( new_node ) );
    }
    return subl_promotions.values2( new_avl_tree_node( item, ZERO_INTEGER, NIL, NIL ), T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 26751L)
  public static SubLObject avl_tree_insert_item(final SubLObject tree, final SubLObject node, final SubLObject item)
  {
    final SubLObject data = avl_tree_node_data( node );
    if( NIL != avl_tree_less_thanP( tree, item, data ) )
    {
      return avl_tree_insert_item_below( tree, node, item );
    }
    if( NIL != avl_tree_greater_thanP( tree, item, data ) )
    {
      return avl_tree_insert_item_above( tree, node, item );
    }
    return subl_promotions.values3( NIL, NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 27099L)
  public static SubLObject avl_tree_insert_item_below(final SubLObject tree, final SubLObject node, final SubLObject item)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != avl_tree_node_has_lower_nodeP( node ) )
    {
      thread.resetMultipleValues();
      final SubLObject new_node = avl_tree_insert_item( tree, avl_tree_node_lower( node ), item );
      final SubLObject new_child = thread.secondMultipleValue();
      final SubLObject adjust_balanceP = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL == new_node )
      {
        return subl_promotions.values3( NIL, NIL, NIL );
      }
      if( NIL != new_child )
      {
        reset_avl_tree_node_lower( node, new_child );
      }
      if( NIL == adjust_balanceP )
      {
        return subl_promotions.values3( new_node, NIL, NIL );
      }
      decrement_avl_tree_node_balance( node, UNPROVIDED );
      final SubLObject pcase_var = avl_tree_node_balance( node );
      if( pcase_var.eql( $int113$_2 ) )
      {
        final SubLObject replacement_node = avl_tree_rebalance_at_node_negative( node );
        return subl_promotions.values3( new_node, replacement_node, NIL );
      }
      if( pcase_var.eql( MINUS_ONE_INTEGER ) )
      {
        return subl_promotions.values3( new_node, NIL, T );
      }
      if( pcase_var.eql( ZERO_INTEGER ) )
      {
        return subl_promotions.values3( new_node, NIL, NIL );
      }
      return Errors.error( $str114$AVL_tree__a_is_corrupt_, tree );
    }
    else
    {
      final SubLObject new_node = new_avl_tree_node( item, ZERO_INTEGER, NIL, NIL );
      reset_avl_tree_node_lower( node, new_node );
      decrement_avl_tree_node_balance( node, UNPROVIDED );
      final SubLObject pcase_var2 = avl_tree_node_balance( node );
      if( pcase_var2.eql( MINUS_ONE_INTEGER ) )
      {
        return subl_promotions.values3( new_node, NIL, T );
      }
      if( pcase_var2.eql( ZERO_INTEGER ) )
      {
        return subl_promotions.values3( new_node, NIL, NIL );
      }
      return Errors.error( $str114$AVL_tree__a_is_corrupt_, tree );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 28282L)
  public static SubLObject avl_tree_insert_item_above(final SubLObject tree, final SubLObject node, final SubLObject item)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != avl_tree_node_has_higher_nodeP( node ) )
    {
      thread.resetMultipleValues();
      final SubLObject new_node = avl_tree_insert_item( tree, avl_tree_node_higher( node ), item );
      final SubLObject new_child = thread.secondMultipleValue();
      final SubLObject adjust_balanceP = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL == new_node )
      {
        return subl_promotions.values3( NIL, NIL, NIL );
      }
      if( NIL != new_child )
      {
        reset_avl_tree_node_higher( node, new_child );
      }
      if( NIL == adjust_balanceP )
      {
        return subl_promotions.values3( new_node, NIL, NIL );
      }
      increment_avl_tree_node_balance( node, UNPROVIDED );
      final SubLObject pcase_var = avl_tree_node_balance( node );
      if( pcase_var.eql( ZERO_INTEGER ) )
      {
        return subl_promotions.values3( new_node, NIL, NIL );
      }
      if( pcase_var.eql( ONE_INTEGER ) )
      {
        return subl_promotions.values3( new_node, NIL, T );
      }
      if( pcase_var.eql( TWO_INTEGER ) )
      {
        final SubLObject replacement_node = avl_tree_rebalance_at_node_positive( node );
        return subl_promotions.values3( new_node, replacement_node, NIL );
      }
      return Errors.error( $str115$AVL_tree__a_is_corrupt, tree );
    }
    else
    {
      final SubLObject new_node = new_avl_tree_node( item, ZERO_INTEGER, NIL, NIL );
      reset_avl_tree_node_higher( node, new_node );
      increment_avl_tree_node_balance( node, UNPROVIDED );
      final SubLObject pcase_var2 = avl_tree_node_balance( node );
      if( pcase_var2.eql( ZERO_INTEGER ) )
      {
        return subl_promotions.values3( new_node, NIL, NIL );
      }
      if( pcase_var2.eql( ONE_INTEGER ) )
      {
        return subl_promotions.values3( new_node, NIL, T );
      }
      return Errors.error( $str114$AVL_tree__a_is_corrupt_, tree );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 29465L)
  public static SubLObject avl_tree_remove_and_rebalance(final SubLObject tree, final SubLObject item)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject root = avlt_root( tree );
    if( NIL != root )
    {
      thread.resetMultipleValues();
      final SubLObject new_root = avl_tree_remove_item( tree, root, item );
      final SubLObject updatedP = thread.secondMultipleValue();
      final SubLObject adjust_balanceP = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      return subl_promotions.values2( new_root, updatedP );
    }
    return subl_promotions.values2( NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 29786L)
  public static SubLObject avl_tree_remove_item(final SubLObject tree, final SubLObject node, final SubLObject item)
  {
    if( NIL != avl_tree_less_thanP( tree, item, avl_tree_node_data( node ) ) )
    {
      return avl_tree_remove_item_below( tree, node, item );
    }
    if( NIL != avl_tree_greater_thanP( tree, item, avl_tree_node_data( node ) ) )
    {
      return avl_tree_remove_item_above( tree, node, item );
    }
    return avl_tree_remove_node( node );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 30126L)
  public static SubLObject avl_tree_remove_node(final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject lower = avl_tree_node_lower( node );
    SubLObject higher = avl_tree_node_higher( node );
    if( NIL == higher )
    {
      return subl_promotions.values3( lower, T, T );
    }
    if( NIL != avl_tree_node_has_lower_nodeP( higher ) )
    {
      thread.resetMultipleValues();
      SubLObject new_node = avl_tree_remove_node_int( node, higher );
      SubLObject adjust_balanceP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != adjust_balanceP )
      {
        SubLObject pcase_var = avl_tree_node_balance( higher );
        if( pcase_var.eql( MINUS_ONE_INTEGER ) )
        {
          reset_avl_tree_node_balance( higher, ZERO_INTEGER );
        }
        else if( pcase_var.eql( ZERO_INTEGER ) )
        {
          reset_avl_tree_node_balance( higher, ONE_INTEGER );
          adjust_balanceP = NIL;
        }
        else if( pcase_var.eql( ONE_INTEGER ) )
        {
          reset_avl_tree_node_balance( higher, TWO_INTEGER );
          final SubLObject new_higher = avl_tree_rebalance_at_node_positive( higher );
          reset_avl_tree_node_higher( new_node, new_higher );
          adjust_balanceP = makeBoolean( !MINUS_ONE_INTEGER.eql( avl_tree_node_balance( new_higher ) ) );
        }
        if( NIL != adjust_balanceP )
        {
          pcase_var = avl_tree_node_balance( new_node );
          if( pcase_var.eql( MINUS_ONE_INTEGER ) )
          {
            reset_avl_tree_node_balance( new_node, $int113$_2 );
            new_node = avl_tree_rebalance_at_node_negative( new_node );
            adjust_balanceP = makeBoolean( !ONE_INTEGER.eql( avl_tree_node_balance( new_node ) ) );
          }
          else if( pcase_var.eql( ZERO_INTEGER ) )
          {
            reset_avl_tree_node_balance( new_node, MINUS_ONE_INTEGER );
            adjust_balanceP = NIL;
          }
          else if( pcase_var.eql( ONE_INTEGER ) )
          {
            reset_avl_tree_node_balance( new_node, ZERO_INTEGER );
          }
        }
      }
      return subl_promotions.values3( new_node, T, adjust_balanceP );
    }
    reset_avl_tree_node_lower( higher, lower );
    final SubLObject pcase_var2 = avl_tree_node_balance( node );
    if( pcase_var2.eql( MINUS_ONE_INTEGER ) )
    {
      reset_avl_tree_node_balance( higher, $int113$_2 );
      higher = avl_tree_rebalance_at_node_negative( higher );
      return subl_promotions.values3( higher, T, makeBoolean( !ONE_INTEGER.eql( avl_tree_node_balance( higher ) ) ) );
    }
    if( pcase_var2.eql( ZERO_INTEGER ) )
    {
      reset_avl_tree_node_balance( higher, MINUS_ONE_INTEGER );
      return subl_promotions.values3( higher, T, NIL );
    }
    if( pcase_var2.eql( ONE_INTEGER ) )
    {
      reset_avl_tree_node_balance( higher, ZERO_INTEGER );
      return subl_promotions.values3( higher, T, T );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 31905L)
  public static SubLObject avl_tree_remove_node_int(final SubLObject dead_node, final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject lower = avl_tree_node_lower( node );
    if( NIL != avl_tree_node_has_lower_nodeP( lower ) )
    {
      thread.resetMultipleValues();
      final SubLObject result_node = avl_tree_remove_node_int( dead_node, lower );
      SubLObject adjust_balanceP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != adjust_balanceP )
      {
        final SubLObject pcase_var = avl_tree_node_balance( lower );
        if( pcase_var.eql( MINUS_ONE_INTEGER ) )
        {
          reset_avl_tree_node_balance( lower, ZERO_INTEGER );
        }
        else if( pcase_var.eql( ZERO_INTEGER ) )
        {
          reset_avl_tree_node_balance( lower, ONE_INTEGER );
          adjust_balanceP = NIL;
        }
        else if( pcase_var.eql( ONE_INTEGER ) )
        {
          reset_avl_tree_node_balance( lower, TWO_INTEGER );
          final SubLObject new_lower = avl_tree_rebalance_at_node_positive( lower );
          reset_avl_tree_node_lower( node, new_lower );
          if( MINUS_ONE_INTEGER.eql( avl_tree_node_balance( new_lower ) ) )
          {
            adjust_balanceP = NIL;
          }
        }
      }
      return subl_promotions.values2( result_node, adjust_balanceP );
    }
    reset_avl_tree_node_lower( lower, avl_tree_node_lower( dead_node ) );
    reset_avl_tree_node_lower( node, avl_tree_node_higher( lower ) );
    reset_avl_tree_node_higher( lower, avl_tree_node_higher( dead_node ) );
    reset_avl_tree_node_balance( lower, avl_tree_node_balance( dead_node ) );
    return subl_promotions.values2( lower, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 33003L)
  public static SubLObject avl_tree_remove_item_below(final SubLObject tree, final SubLObject node, final SubLObject item)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == avl_tree_node_has_lower_nodeP( node ) )
    {
      return subl_promotions.values3( NIL, NIL, NIL );
    }
    thread.resetMultipleValues();
    final SubLObject new_lower = avl_tree_remove_item( tree, avl_tree_node_lower( node ), item );
    final SubLObject updatedP = thread.secondMultipleValue();
    SubLObject adjust_balanceP = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != updatedP )
    {
      SubLObject result_node = node;
      reset_avl_tree_node_lower( node, new_lower );
      if( NIL != adjust_balanceP )
      {
        final SubLObject pcase_var = avl_tree_node_balance( node );
        if( pcase_var.eql( MINUS_ONE_INTEGER ) )
        {
          reset_avl_tree_node_balance( node, ZERO_INTEGER );
        }
        else if( pcase_var.eql( ZERO_INTEGER ) )
        {
          reset_avl_tree_node_balance( node, ONE_INTEGER );
          adjust_balanceP = NIL;
        }
        else if( pcase_var.eql( ONE_INTEGER ) )
        {
          reset_avl_tree_node_balance( node, TWO_INTEGER );
          result_node = avl_tree_rebalance_at_node_positive( node );
          adjust_balanceP = makeBoolean( !MINUS_ONE_INTEGER.eql( avl_tree_node_balance( result_node ) ) );
        }
      }
      return subl_promotions.values3( result_node, T, adjust_balanceP );
    }
    return subl_promotions.values3( NIL, NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 33874L)
  public static SubLObject avl_tree_remove_item_above(final SubLObject tree, final SubLObject node, final SubLObject item)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == avl_tree_node_has_higher_nodeP( node ) )
    {
      return subl_promotions.values3( NIL, NIL, NIL );
    }
    thread.resetMultipleValues();
    final SubLObject new_higher = avl_tree_remove_item( tree, avl_tree_node_higher( node ), item );
    final SubLObject updatedP = thread.secondMultipleValue();
    SubLObject adjust_balanceP = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != updatedP )
    {
      SubLObject result_node = node;
      reset_avl_tree_node_higher( node, new_higher );
      if( NIL != adjust_balanceP )
      {
        final SubLObject pcase_var = avl_tree_node_balance( node );
        if( pcase_var.eql( MINUS_ONE_INTEGER ) )
        {
          reset_avl_tree_node_balance( node, $int113$_2 );
          result_node = avl_tree_rebalance_at_node_negative( node );
          adjust_balanceP = makeBoolean( !ONE_INTEGER.eql( avl_tree_node_balance( result_node ) ) );
        }
        else if( pcase_var.eql( ZERO_INTEGER ) )
        {
          reset_avl_tree_node_balance( node, MINUS_ONE_INTEGER );
          adjust_balanceP = NIL;
        }
        else if( pcase_var.eql( ONE_INTEGER ) )
        {
          reset_avl_tree_node_balance( node, ZERO_INTEGER );
        }
      }
      return subl_promotions.values3( result_node, T, adjust_balanceP );
    }
    return subl_promotions.values3( NIL, NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 34751L)
  public static SubLObject avl_tree_rebalance_at_node_negative(final SubLObject node)
  {
    final SubLObject child = avl_tree_node_lower( node );
    final SubLObject child_higher = avl_tree_node_higher( child );
    final SubLObject pcase_var = avl_tree_node_balance( child );
    if( pcase_var.eql( MINUS_ONE_INTEGER ) )
    {
      reset_avl_tree_node_higher( child, node );
      reset_avl_tree_node_lower( node, child_higher );
      reset_avl_tree_node_balance( child, ZERO_INTEGER );
      reset_avl_tree_node_balance( node, ZERO_INTEGER );
      return child;
    }
    if( pcase_var.eql( ZERO_INTEGER ) )
    {
      reset_avl_tree_node_higher( child, node );
      reset_avl_tree_node_lower( node, child_higher );
      reset_avl_tree_node_balance( child, ONE_INTEGER );
      reset_avl_tree_node_balance( node, MINUS_ONE_INTEGER );
      return child;
    }
    if( pcase_var.eql( ONE_INTEGER ) )
    {
      reset_avl_tree_node_higher( child, avl_tree_node_lower( child_higher ) );
      reset_avl_tree_node_lower( node, avl_tree_node_higher( child_higher ) );
      reset_avl_tree_node_higher( child_higher, node );
      reset_avl_tree_node_lower( child_higher, child );
      final SubLObject pcase_var_$4 = avl_tree_node_balance( child_higher );
      if( pcase_var_$4.eql( MINUS_ONE_INTEGER ) )
      {
        reset_avl_tree_node_balance( node, ONE_INTEGER );
        reset_avl_tree_node_balance( child, ZERO_INTEGER );
      }
      else if( pcase_var_$4.eql( ZERO_INTEGER ) )
      {
        reset_avl_tree_node_balance( node, ZERO_INTEGER );
        reset_avl_tree_node_balance( child, ZERO_INTEGER );
      }
      else if( pcase_var_$4.eql( ONE_INTEGER ) )
      {
        reset_avl_tree_node_balance( node, ZERO_INTEGER );
        reset_avl_tree_node_balance( child, MINUS_ONE_INTEGER );
      }
      reset_avl_tree_node_balance( child_higher, ZERO_INTEGER );
      return child_higher;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 36234L)
  public static SubLObject avl_tree_rebalance_at_node_positive(final SubLObject node)
  {
    final SubLObject child = avl_tree_node_higher( node );
    final SubLObject child_lower = avl_tree_node_lower( child );
    final SubLObject pcase_var = avl_tree_node_balance( child );
    if( pcase_var.eql( MINUS_ONE_INTEGER ) )
    {
      reset_avl_tree_node_lower( child, avl_tree_node_higher( child_lower ) );
      reset_avl_tree_node_higher( node, avl_tree_node_lower( child_lower ) );
      reset_avl_tree_node_lower( child_lower, node );
      reset_avl_tree_node_higher( child_lower, child );
      final SubLObject pcase_var_$5 = avl_tree_node_balance( child_lower );
      if( pcase_var_$5.eql( MINUS_ONE_INTEGER ) )
      {
        reset_avl_tree_node_balance( node, ZERO_INTEGER );
        reset_avl_tree_node_balance( child, ONE_INTEGER );
      }
      else if( pcase_var_$5.eql( ZERO_INTEGER ) )
      {
        reset_avl_tree_node_balance( node, ZERO_INTEGER );
        reset_avl_tree_node_balance( child, ZERO_INTEGER );
      }
      else if( pcase_var_$5.eql( ONE_INTEGER ) )
      {
        reset_avl_tree_node_balance( node, MINUS_ONE_INTEGER );
        reset_avl_tree_node_balance( child, ZERO_INTEGER );
      }
      reset_avl_tree_node_balance( child_lower, ZERO_INTEGER );
      return child_lower;
    }
    if( pcase_var.eql( ZERO_INTEGER ) )
    {
      reset_avl_tree_node_lower( child, node );
      reset_avl_tree_node_higher( node, child_lower );
      reset_avl_tree_node_balance( child, MINUS_ONE_INTEGER );
      reset_avl_tree_node_balance( node, ONE_INTEGER );
      return child;
    }
    if( pcase_var.eql( ONE_INTEGER ) )
    {
      reset_avl_tree_node_lower( child, node );
      reset_avl_tree_node_higher( node, child_lower );
      reset_avl_tree_node_balance( child, ZERO_INTEGER );
      reset_avl_tree_node_balance( node, ZERO_INTEGER );
      return child;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 37687L)
  public static SubLObject avl_tree_iterator_state(final SubLObject avl_tree, final SubLObject least, final SubLObject greatest, final SubLObject direction)
  {
    final SubLObject stack = stacks.create_stack();
    final SubLObject end = ( direction == $kw101$FORWARD ) ? greatest : least;
    if( NIL == least || NIL == greatest || NIL == avl_tree_greater_thanP( avl_tree, least, greatest ) )
    {
      if( direction == $kw101$FORWARD )
      {
        initialize_avl_tree_iterator_stack_forward( avl_tree, avlt_root( avl_tree ), stack, least, greatest );
      }
      else
      {
        initialize_avl_tree_iterator_stack_backward( avl_tree, avlt_root( avl_tree ), stack, least, greatest );
      }
    }
    return ConsesLow.list( avl_tree, stack, end, direction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 38255L)
  public static SubLObject initialize_avl_tree_iterator_stack_forward(final SubLObject tree, final SubLObject node, final SubLObject stack, final SubLObject least, final SubLObject greatest)
  {
    if( NIL == node )
    {
      return stack;
    }
    if( NIL == least )
    {
      if( NIL == greatest || NIL == avl_tree_greater_thanP( tree, avl_tree_node_data( node ), greatest ) )
      {
        stacks.stack_push( node, stack );
      }
      return initialize_avl_tree_iterator_stack_forward( tree, avl_tree_node_lower( node ), stack, least, greatest );
    }
    if( NIL != avl_tree_less_thanP( tree, least, avl_tree_node_data( node ) ) )
    {
      if( NIL == greatest || NIL == avl_tree_greater_thanP( tree, avl_tree_node_data( node ), greatest ) )
      {
        stacks.stack_push( node, stack );
      }
      return initialize_avl_tree_iterator_stack_forward( tree, avl_tree_node_lower( node ), stack, least, greatest );
    }
    if( NIL != avl_tree_greater_thanP( tree, least, avl_tree_node_data( node ) ) )
    {
      return initialize_avl_tree_iterator_stack_forward( tree, avl_tree_node_higher( node ), stack, least, greatest );
    }
    stacks.stack_push( node, stack );
    return stack;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 39158L)
  public static SubLObject initialize_avl_tree_iterator_stack_backward(final SubLObject tree, final SubLObject node, final SubLObject stack, final SubLObject least, final SubLObject greatest)
  {
    if( NIL == node )
    {
      return stack;
    }
    if( NIL == greatest )
    {
      if( NIL == least || NIL == avl_tree_less_thanP( tree, avl_tree_node_data( node ), least ) )
      {
        stacks.stack_push( node, stack );
      }
      return initialize_avl_tree_iterator_stack_backward( tree, avl_tree_node_higher( node ), stack, least, greatest );
    }
    if( NIL != avl_tree_greater_thanP( tree, greatest, avl_tree_node_data( node ) ) )
    {
      if( NIL == least || NIL == avl_tree_less_thanP( tree, avl_tree_node_data( node ), least ) )
      {
        stacks.stack_push( node, stack );
      }
      return initialize_avl_tree_iterator_stack_backward( tree, avl_tree_node_higher( node ), stack, least, greatest );
    }
    if( NIL != avl_tree_less_thanP( tree, greatest, avl_tree_node_data( node ) ) )
    {
      return initialize_avl_tree_iterator_stack_backward( tree, avl_tree_node_lower( node ), stack, least, greatest );
    }
    stacks.stack_push( node, stack );
    return stack;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 40057L)
  public static SubLObject avl_tree_iterator_done(final SubLObject state)
  {
    SubLObject tree = NIL;
    SubLObject stack = NIL;
    SubLObject end = NIL;
    SubLObject direction = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list116 );
    tree = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list116 );
    stack = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list116 );
    end = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list116 );
    direction = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return stacks.stack_empty_p( stack );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list116 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 40229L)
  public static SubLObject avl_tree_iterator_next(final SubLObject state)
  {
    SubLObject tree = NIL;
    SubLObject stack = NIL;
    SubLObject end = NIL;
    SubLObject direction = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list116 );
    tree = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list116 );
    stack = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list116 );
    end = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list116 );
    direction = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject node = stacks.stack_pop( stack );
      final SubLObject data = avl_tree_node_data( node );
      if( direction == $kw101$FORWARD )
      {
        if( NIL == end || NIL != avl_tree_less_thanP( tree, data, end ) )
        {
          avl_tree_iterator_next_forward( tree, avl_tree_node_higher( node ), stack, end );
        }
      }
      else if( NIL == end || NIL != avl_tree_greater_thanP( tree, data, end ) )
      {
        avl_tree_iterator_next_backward( tree, avl_tree_node_lower( node ), stack, end );
      }
      return subl_promotions.values3( data, state, Types.sublisp_null( data ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list116 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 40808L)
  public static SubLObject avl_tree_iterator_next_forward(final SubLObject tree, final SubLObject node, final SubLObject stack, final SubLObject end)
  {
    if( NIL != node )
    {
      if( NIL == end || NIL == avl_tree_greater_thanP( tree, avl_tree_node_data( node ), end ) )
      {
        stacks.stack_push( node, stack );
      }
      avl_tree_iterator_next_forward( tree, avl_tree_node_lower( node ), stack, end );
    }
    return stack;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 41107L)
  public static SubLObject avl_tree_iterator_next_backward(final SubLObject tree, final SubLObject node, final SubLObject stack, final SubLObject end)
  {
    if( NIL != node )
    {
      if( NIL == end || NIL == avl_tree_less_thanP( tree, avl_tree_node_data( node ), end ) )
      {
        stacks.stack_push( node, stack );
      }
      avl_tree_iterator_next_backward( tree, avl_tree_node_higher( node ), stack, end );
    }
    return stack;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 41406L)
  public static SubLObject sbhl_avl_tree_iterator_done(final SubLObject state)
  {
    return avl_tree_iterator_done( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 41501L)
  public static SubLObject sbhl_avl_tree_iterator_next(final SubLObject state)
  {
    SubLObject tree = NIL;
    SubLObject stack = NIL;
    SubLObject end = NIL;
    SubLObject direction = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list116 );
    tree = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list116 );
    stack = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list116 );
    end = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list116 );
    direction = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject node = stacks.stack_pop( stack );
      SubLObject data = NIL;
      if( NIL != node )
      {
        data = avl_tree_node_data( node );
        if( direction == $kw101$FORWARD )
        {
          if( NIL == end || NIL != avl_tree_less_thanP( tree, data, end ) )
          {
            avl_tree_iterator_next_forward( tree, avl_tree_node_higher( node ), stack, end );
          }
        }
        else if( NIL == end || NIL != avl_tree_greater_thanP( tree, data, end ) )
        {
          avl_tree_iterator_next_backward( tree, avl_tree_node_lower( node ), stack, end );
        }
      }
      return data;
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list116 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 42338L)
  public static SubLObject avl_tree_node_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_avl_tree_node( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 42338L)
  public static SubLObject avl_tree_node_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $avl_tree_node_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 42338L)
  public static SubLObject avltn_data(final SubLObject v_object)
  {
    assert NIL != avl_tree_node_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 42338L)
  public static SubLObject avltn_balance(final SubLObject v_object)
  {
    assert NIL != avl_tree_node_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 42338L)
  public static SubLObject avltn_lower(final SubLObject v_object)
  {
    assert NIL != avl_tree_node_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 42338L)
  public static SubLObject avltn_higher(final SubLObject v_object)
  {
    assert NIL != avl_tree_node_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 42338L)
  public static SubLObject _csetf_avltn_data(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != avl_tree_node_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 42338L)
  public static SubLObject _csetf_avltn_balance(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != avl_tree_node_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 42338L)
  public static SubLObject _csetf_avltn_lower(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != avl_tree_node_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 42338L)
  public static SubLObject _csetf_avltn_higher(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != avl_tree_node_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 42338L)
  public static SubLObject make_avl_tree_node(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $avl_tree_node_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw134$DATA ) )
      {
        _csetf_avltn_data( v_new, current_value );
      }
      else if( pcase_var.eql( $kw135$BALANCE ) )
      {
        _csetf_avltn_balance( v_new, current_value );
      }
      else if( pcase_var.eql( $kw19$LOWER ) )
      {
        _csetf_avltn_lower( v_new, current_value );
      }
      else if( pcase_var.eql( $kw20$HIGHER ) )
      {
        _csetf_avltn_higher( v_new, current_value );
      }
      else
      {
        Errors.error( $str21$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 42338L)
  public static SubLObject visit_defstruct_avl_tree_node(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw22$BEGIN, $sym136$MAKE_AVL_TREE_NODE, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw134$DATA, avltn_data( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw135$BALANCE, avltn_balance( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw19$LOWER, avltn_lower( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw20$HIGHER, avltn_higher( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$END, $sym136$MAKE_AVL_TREE_NODE, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 42338L)
  public static SubLObject visit_defstruct_object_avl_tree_node_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_avl_tree_node( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 42478L)
  public static SubLObject print_avl_tree_node(final SubLObject avl_tree_node, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( avl_tree_node, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, avl_tree_node, T, T );
      if( NIL != $print_avl_tree_node_dataP$.getDynamicValue( thread ) )
      {
        PrintLow.format( stream, $str138$__a_, avltn_data( avl_tree_node ) );
      }
      print_macros.print_unreadable_object_postamble( stream, avl_tree_node, T, T );
    }
    return avl_tree_node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 42750L)
  public static SubLObject new_avl_tree_node(final SubLObject data, SubLObject balance, SubLObject lower, SubLObject higher)
  {
    if( balance == UNPROVIDED )
    {
      balance = ZERO_INTEGER;
    }
    if( lower == UNPROVIDED )
    {
      lower = NIL;
    }
    if( higher == UNPROVIDED )
    {
      higher = NIL;
    }
    final SubLObject node = make_avl_tree_node( UNPROVIDED );
    _csetf_avltn_data( node, data );
    _csetf_avltn_balance( node, balance );
    _csetf_avltn_lower( node, lower );
    _csetf_avltn_higher( node, higher );
    return node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 43080L)
  public static SubLObject avl_tree_node_data(final SubLObject avl_tree_node)
  {
    return avltn_data( avl_tree_node );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 43210L)
  public static SubLObject avl_tree_node_balance(final SubLObject avl_tree_node)
  {
    return avltn_balance( avl_tree_node );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 43304L)
  public static SubLObject avl_tree_node_lower(final SubLObject avl_tree_node)
  {
    return avltn_lower( avl_tree_node );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 43394L)
  public static SubLObject avl_tree_node_higher(final SubLObject avl_tree_node)
  {
    return avltn_higher( avl_tree_node );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 43486L)
  public static SubLObject increment_avl_tree_node_balance(final SubLObject avl_tree_node, SubLObject delta)
  {
    if( delta == UNPROVIDED )
    {
      delta = ONE_INTEGER;
    }
    _csetf_avltn_balance( avl_tree_node, Numbers.add( avltn_balance( avl_tree_node ), delta ) );
    return avl_tree_node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 43679L)
  public static SubLObject decrement_avl_tree_node_balance(final SubLObject avl_tree_node, SubLObject delta)
  {
    if( delta == UNPROVIDED )
    {
      delta = ONE_INTEGER;
    }
    _csetf_avltn_balance( avl_tree_node, Numbers.subtract( avltn_balance( avl_tree_node ), delta ) );
    return avl_tree_node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 43832L)
  public static SubLObject reset_avl_tree_node_balance(final SubLObject avl_tree_node, final SubLObject balance)
  {
    _csetf_avltn_balance( avl_tree_node, balance );
    return avl_tree_node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 43972L)
  public static SubLObject reset_avl_tree_node_lower(final SubLObject avl_tree_node, final SubLObject lower)
  {
    _csetf_avltn_lower( avl_tree_node, lower );
    return avl_tree_node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 44104L)
  public static SubLObject reset_avl_tree_node_higher(final SubLObject avl_tree_node, final SubLObject higher)
  {
    _csetf_avltn_higher( avl_tree_node, higher );
    return avl_tree_node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 44240L)
  public static SubLObject avl_tree_node_has_lower_nodeP(final SubLObject avl_tree_node)
  {
    return list_utilities.sublisp_boolean( avltn_lower( avl_tree_node ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 44390L)
  public static SubLObject avl_tree_node_has_higher_nodeP(final SubLObject avl_tree_node)
  {
    return list_utilities.sublisp_boolean( avltn_higher( avl_tree_node ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 44502L)
  public static SubLObject print_avl_tree_node_contents(final SubLObject avl_tree_node, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    PrintLow.format( stream, $str139$__Data______a, avltn_data( avl_tree_node ) );
    PrintLow.format( stream, $str140$__Balance___a, avltn_balance( avl_tree_node ) );
    PrintLow.format( stream, $str141$__Lower_____a, avltn_lower( avl_tree_node ) );
    PrintLow.format( stream, $str142$__Higher____a, avltn_higher( avl_tree_node ) );
    PrintLow.format( stream, $str143$__ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 44871L)
  public static SubLObject copy_avl_tree_node(final SubLObject avl_tree_node)
  {
    final SubLObject data = avltn_data( avl_tree_node );
    final SubLObject balance = avltn_balance( avl_tree_node );
    SubLObject lower = avltn_lower( avl_tree_node );
    SubLObject higher = avltn_higher( avl_tree_node );
    if( NIL != avl_tree_node_p( lower ) )
    {
      lower = copy_avl_tree_node( lower );
    }
    if( NIL != avl_tree_node_p( higher ) )
    {
      higher = copy_avl_tree_node( higher );
    }
    return new_avl_tree_node( data, balance, lower, higher );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 45320L)
  public static SubLObject avl_tree_nodes_equalP(final SubLObject avl_tree_node1, final SubLObject avl_tree_node2, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( NIL == avl_tree_node1 )
    {
      return Types.sublisp_null( avl_tree_node2 );
    }
    if( NIL == avl_tree_node2 )
    {
      return NIL;
    }
    return makeBoolean( NIL != Functions.funcall( test, avltn_data( avl_tree_node1 ), avltn_data( avl_tree_node2 ) ) && NIL != avl_tree_nodes_equalP( avltn_lower( avl_tree_node1 ), avltn_lower( avl_tree_node2 ), test )
        && NIL != avl_tree_nodes_equalP( avltn_higher( avl_tree_node1 ), avltn_higher( avl_tree_node2 ), test ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 45936L)
  public static SubLObject cfasl_output_object_avl_tree_node_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_avl_tree_node( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 46067L)
  public static SubLObject cfasl_output_avl_tree_node(final SubLObject node, final SubLObject stream)
  {
    cfasl.cfasl_raw_write_byte( $cfasl_opcode_avl_tree_node$.getGlobalValue(), stream );
    final SubLObject data = avltn_data( node );
    final SubLObject balance = avltn_balance( node );
    final SubLObject lower = avltn_lower( node );
    final SubLObject higher = avltn_higher( node );
    cfasl.cfasl_output( data, stream );
    cfasl.cfasl_output( balance, stream );
    cfasl.cfasl_output( lower, stream );
    cfasl.cfasl_output( higher, stream );
    return node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/binary-tree.lisp", position = 46465L)
  public static SubLObject cfasl_input_avl_tree_node(final SubLObject stream)
  {
    final SubLObject data = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject balance = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject lower = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject higher = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    SubLObject node = NIL;
    node = make_avl_tree_node( UNPROVIDED );
    _csetf_avltn_data( node, data );
    _csetf_avltn_balance( node, balance );
    _csetf_avltn_lower( node, lower );
    _csetf_avltn_higher( node, higher );
    return node;
  }

  public static SubLObject declare_binary_tree_file()
  {
    SubLFiles.declareFunction( me, "btree_print_function_trampoline", "BTREE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "btree_p", "BTREE-P", 1, 0, false );
    new $btree_p$UnaryFunction();
    SubLFiles.declareFunction( me, "bt_tag", "BT-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "bt_state", "BT-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "bt_lower", "BT-LOWER", 1, 0, false );
    SubLFiles.declareFunction( me, "bt_higher", "BT-HIGHER", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_bt_tag", "_CSETF-BT-TAG", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_bt_state", "_CSETF-BT-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_bt_lower", "_CSETF-BT-LOWER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_bt_higher", "_CSETF-BT-HIGHER", 2, 0, false );
    SubLFiles.declareFunction( me, "make_btree", "MAKE-BTREE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_btree", "VISIT-DEFSTRUCT-BTREE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_btree_method", "VISIT-DEFSTRUCT-OBJECT-BTREE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_btree", "PRINT-BTREE", 3, 0, false );
    SubLFiles.declareFunction( me, "make_static_btree", "MAKE-STATIC-BTREE", 0, 0, false );
    SubLFiles.declareFunction( me, "init_btree", "INIT-BTREE", 1, 0, false );
    SubLFiles.declareFunction( me, "free_btree_p", "FREE-BTREE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "free_btree", "FREE-BTREE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_btree", "GET-BTREE", 0, 0, false );
    SubLFiles.declareFunction( me, "free_entire_btree", "FREE-ENTIRE-BTREE", 1, 0, false );
    SubLFiles.declareMacro( me, "do_btree_index", "DO-BTREE-INDEX" );
    SubLFiles.declareFunction( me, "do_btree_index_key", "DO-BTREE-INDEX-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "do_btree_index_value", "DO-BTREE-INDEX-VALUE", 1, 0, false );
    SubLFiles.declareMacro( me, "do_btree", "DO-BTREE" );
    SubLFiles.declareFunction( me, "do_btree_lower", "DO-BTREE-LOWER", 1, 0, false );
    SubLFiles.declareFunction( me, "do_btree_higher", "DO-BTREE-HIGHER", 1, 0, false );
    SubLFiles.declareFunction( me, "btree_insert", "BTREE-INSERT", 5, 0, false );
    SubLFiles.declareFunction( me, "btree_remove", "BTREE-REMOVE", 5, 1, false );
    SubLFiles.declareFunction( me, "btree_find", "BTREE-FIND", 3, 0, false );
    SubLFiles.declareFunction( me, "btree_find_best", "BTREE-FIND-BEST", 1, 0, false );
    SubLFiles.declareFunction( me, "btree_find_worst", "BTREE-FIND-WORST", 1, 0, false );
    SubLFiles.declareFunction( me, "map_btree", "MAP-BTREE", 2, 2, false );
    SubLFiles.declareFunction( me, "map_btree_forward", "MAP-BTREE-FORWARD", 2, 2, false );
    SubLFiles.declareFunction( me, "map_btree_backward", "MAP-BTREE-BACKWARD", 2, 2, false );
    SubLFiles.declareFunction( me, "gather_btree_tag", "GATHER-BTREE-TAG", 1, 0, false );
    SubLFiles.declareFunction( me, "btree_tags", "BTREE-TAGS", 1, 0, false );
    SubLFiles.declareFunction( me, "btree_node_count", "BTREE-NODE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "btree_deepest_depth", "BTREE-DEEPEST-DEPTH", 1, 0, false );
    SubLFiles.declareFunction( me, "btree_shallowest_depth", "BTREE-SHALLOWEST-DEPTH", 1, 0, false );
    SubLFiles.declareFunction( me, "btree_validate", "BTREE-VALIDATE", 2, 2, false );
    SubLFiles.declareFunction( me, "incomparable", "INCOMPARABLE", 3, 0, false );
    SubLFiles.declareFunction( me, "btree_find_aux", "BTREE-FIND-AUX", 3, 1, false );
    SubLFiles.declareFunction( me, "btree_insert_aux", "BTREE-INSERT-AUX", 3, 0, false );
    SubLFiles.declareFunction( me, "btree_remove_aux", "BTREE-REMOVE-AUX", 4, 0, false );
    SubLFiles.declareFunction( me, "btree_insert_tree", "BTREE-INSERT-TREE", 3, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_btree", "CFASL-OUTPUT-BTREE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_btree_method", "CFASL-OUTPUT-OBJECT-BTREE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_btree", "CFASL-INPUT-BTREE", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_legacy_btree_low", "CFASL-INPUT-LEGACY-BTREE-LOW", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_legacy_btree_high", "CFASL-INPUT-LEGACY-BTREE-HIGH", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_legacy_btree_leaf", "CFASL-INPUT-LEGACY-BTREE-LEAF", 1, 0, false );
    SubLFiles.declareFunction( me, "btree_balancedP", "BTREE-BALANCED?", 1, 0, false );
    SubLFiles.declareFunction( me, "btree_balance", "BTREE-BALANCE", 1, 1, false );
    SubLFiles.declareFunction( me, "btree_balance_insert_node", "BTREE-BALANCE-INSERT-NODE", 1, 0, false );
    SubLFiles.declareFunction( me, "btree_balance_recursive", "BTREE-BALANCE-RECURSIVE", 3, 0, false );
    SubLFiles.declareFunction( me, "btree_balance_split_point", "BTREE-BALANCE-SPLIT-POINT", 2, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_print_function_trampoline", "AVL-TREE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_p", "AVL-TREE-P", 1, 0, false );
    new $avl_tree_p$UnaryFunction();
    SubLFiles.declareFunction( me, "avlt_root", "AVLT-ROOT", 1, 0, false );
    SubLFiles.declareFunction( me, "avlt_test", "AVLT-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "avlt_size", "AVLT-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_avlt_root", "_CSETF-AVLT-ROOT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_avlt_test", "_CSETF-AVLT-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_avlt_size", "_CSETF-AVLT-SIZE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_avl_tree", "MAKE-AVL-TREE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_avl_tree", "VISIT-DEFSTRUCT-AVL-TREE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_avl_tree_method", "VISIT-DEFSTRUCT-OBJECT-AVL-TREE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_avl_tree", "PRINT-AVL-TREE", 3, 0, false );
    SubLFiles.declareFunction( me, "new_avl_tree", "NEW-AVL-TREE", 1, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_sort_test", "AVL-TREE-SORT-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_size", "AVL-TREE-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_emptyP", "AVL-TREE-EMPTY?", 1, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_find", "AVL-TREE-FIND", 2, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_find_least", "AVL-TREE-FIND-LEAST", 1, 2, false );
    SubLFiles.declareFunction( me, "avl_tree_find_greatest", "AVL-TREE-FIND-GREATEST", 1, 2, false );
    SubLFiles.declareFunction( me, "avl_tree_insert", "AVL-TREE-INSERT", 2, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_remove", "AVL-TREE-REMOVE", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_avl_tree", "CLEAR-AVL-TREE", 1, 0, false );
    SubLFiles.declareFunction( me, "copy_avl_tree", "COPY-AVL-TREE", 1, 0, false );
    SubLFiles.declareFunction( me, "avl_trees_equalP", "AVL-TREES-EQUAL?", 2, 1, false );
    SubLFiles.declareFunction( me, "list_to_avl_tree", "LIST-TO-AVL-TREE", 2, 0, false );
    SubLFiles.declareFunction( me, "new_avl_tree_iterator", "NEW-AVL-TREE-ITERATOR", 1, 3, false );
    SubLFiles.declareFunction( me, "new_avl_tree_sbhl_iterator", "NEW-AVL-TREE-SBHL-ITERATOR", 1, 3, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_avl_tree_method", "CFASL-OUTPUT-OBJECT-AVL-TREE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_avl_tree", "CFASL-OUTPUT-AVL-TREE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_avl_tree", "CFASL-INPUT-AVL-TREE", 1, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_balancedP", "AVL-TREE-BALANCED?", 1, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_balancedP_int", "AVL-TREE-BALANCED?-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_height", "AVL-TREE-HEIGHT", 1, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_node_height", "AVL-TREE-NODE-HEIGHT", 1, 0, false );
    SubLFiles.declareFunction( me, "verify_avl_tree", "VERIFY-AVL-TREE", 1, 0, false );
    SubLFiles.declareFunction( me, "verify_avl_tree_int", "VERIFY-AVL-TREE-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_less_thanP", "AVL-TREE-LESS-THAN?", 3, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_greater_thanP", "AVL-TREE-GREATER-THAN?", 3, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_find_exact", "AVL-TREE-FIND-EXACT", 3, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_find_bounded_below", "AVL-TREE-FIND-BOUNDED-BELOW", 4, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_find_bounded_above", "AVL-TREE-FIND-BOUNDED-ABOVE", 4, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_find_unbounded_below", "AVL-TREE-FIND-UNBOUNDED-BELOW", 1, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_find_unbounded_below_int", "AVL-TREE-FIND-UNBOUNDED-BELOW-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_find_unbounded_above", "AVL-TREE-FIND-UNBOUNDED-ABOVE", 1, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_find_unbounded_above_int", "AVL-TREE-FIND-UNBOUNDED-ABOVE-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_insert_and_rebalance", "AVL-TREE-INSERT-AND-REBALANCE", 2, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_insert_item", "AVL-TREE-INSERT-ITEM", 3, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_insert_item_below", "AVL-TREE-INSERT-ITEM-BELOW", 3, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_insert_item_above", "AVL-TREE-INSERT-ITEM-ABOVE", 3, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_remove_and_rebalance", "AVL-TREE-REMOVE-AND-REBALANCE", 2, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_remove_item", "AVL-TREE-REMOVE-ITEM", 3, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_remove_node", "AVL-TREE-REMOVE-NODE", 1, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_remove_node_int", "AVL-TREE-REMOVE-NODE-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_remove_item_below", "AVL-TREE-REMOVE-ITEM-BELOW", 3, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_remove_item_above", "AVL-TREE-REMOVE-ITEM-ABOVE", 3, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_rebalance_at_node_negative", "AVL-TREE-REBALANCE-AT-NODE-NEGATIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_rebalance_at_node_positive", "AVL-TREE-REBALANCE-AT-NODE-POSITIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_iterator_state", "AVL-TREE-ITERATOR-STATE", 4, 0, false );
    SubLFiles.declareFunction( me, "initialize_avl_tree_iterator_stack_forward", "INITIALIZE-AVL-TREE-ITERATOR-STACK-FORWARD", 5, 0, false );
    SubLFiles.declareFunction( me, "initialize_avl_tree_iterator_stack_backward", "INITIALIZE-AVL-TREE-ITERATOR-STACK-BACKWARD", 5, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_iterator_done", "AVL-TREE-ITERATOR-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_iterator_next", "AVL-TREE-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_iterator_next_forward", "AVL-TREE-ITERATOR-NEXT-FORWARD", 4, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_iterator_next_backward", "AVL-TREE-ITERATOR-NEXT-BACKWARD", 4, 0, false );
    SubLFiles.declareFunction( me, "sbhl_avl_tree_iterator_done", "SBHL-AVL-TREE-ITERATOR-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_avl_tree_iterator_next", "SBHL-AVL-TREE-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_node_print_function_trampoline", "AVL-TREE-NODE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_node_p", "AVL-TREE-NODE-P", 1, 0, false );
    new $avl_tree_node_p$UnaryFunction();
    SubLFiles.declareFunction( me, "avltn_data", "AVLTN-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "avltn_balance", "AVLTN-BALANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "avltn_lower", "AVLTN-LOWER", 1, 0, false );
    SubLFiles.declareFunction( me, "avltn_higher", "AVLTN-HIGHER", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_avltn_data", "_CSETF-AVLTN-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_avltn_balance", "_CSETF-AVLTN-BALANCE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_avltn_lower", "_CSETF-AVLTN-LOWER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_avltn_higher", "_CSETF-AVLTN-HIGHER", 2, 0, false );
    SubLFiles.declareFunction( me, "make_avl_tree_node", "MAKE-AVL-TREE-NODE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_avl_tree_node", "VISIT-DEFSTRUCT-AVL-TREE-NODE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_avl_tree_node_method", "VISIT-DEFSTRUCT-OBJECT-AVL-TREE-NODE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_avl_tree_node", "PRINT-AVL-TREE-NODE", 3, 0, false );
    SubLFiles.declareFunction( me, "new_avl_tree_node", "NEW-AVL-TREE-NODE", 1, 3, false );
    SubLFiles.declareFunction( me, "avl_tree_node_data", "AVL-TREE-NODE-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_node_balance", "AVL-TREE-NODE-BALANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_node_lower", "AVL-TREE-NODE-LOWER", 1, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_node_higher", "AVL-TREE-NODE-HIGHER", 1, 0, false );
    SubLFiles.declareFunction( me, "increment_avl_tree_node_balance", "INCREMENT-AVL-TREE-NODE-BALANCE", 1, 1, false );
    SubLFiles.declareFunction( me, "decrement_avl_tree_node_balance", "DECREMENT-AVL-TREE-NODE-BALANCE", 1, 1, false );
    SubLFiles.declareFunction( me, "reset_avl_tree_node_balance", "RESET-AVL-TREE-NODE-BALANCE", 2, 0, false );
    SubLFiles.declareFunction( me, "reset_avl_tree_node_lower", "RESET-AVL-TREE-NODE-LOWER", 2, 0, false );
    SubLFiles.declareFunction( me, "reset_avl_tree_node_higher", "RESET-AVL-TREE-NODE-HIGHER", 2, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_node_has_lower_nodeP", "AVL-TREE-NODE-HAS-LOWER-NODE?", 1, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_node_has_higher_nodeP", "AVL-TREE-NODE-HAS-HIGHER-NODE?", 1, 0, false );
    SubLFiles.declareFunction( me, "print_avl_tree_node_contents", "PRINT-AVL-TREE-NODE-CONTENTS", 1, 1, false );
    SubLFiles.declareFunction( me, "copy_avl_tree_node", "COPY-AVL-TREE-NODE", 1, 0, false );
    SubLFiles.declareFunction( me, "avl_tree_nodes_equalP", "AVL-TREE-NODES-EQUAL?", 2, 1, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_avl_tree_node_method", "CFASL-OUTPUT-OBJECT-AVL-TREE-NODE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_avl_tree_node", "CFASL-OUTPUT-AVL-TREE-NODE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_avl_tree_node", "CFASL-INPUT-AVL-TREE-NODE", 1, 0, false );
    new $cfasl_input_avl_tree_node$UnaryFunction();
    return NIL;
  }

  public static SubLObject init_binary_tree_file()
  {
    $dtp_btree$ = SubLFiles.defconstant( "*DTP-BTREE*", $sym0$BTREE );
    $btree_free_list$ = SubLFiles.deflexical( "*BTREE-FREE-LIST*", NIL );
    $btree_free_lock$ = SubLFiles.deflexical( "*BTREE-FREE-LOCK*", Locks.make_lock( $str32$BTREE_resource_lock ) );
    $validate_btrees$ = SubLFiles.defparameter( "*VALIDATE-BTREES*", NIL );
    $btree_tags$ = SubLFiles.defparameter( "*BTREE-TAGS*", NIL );
    $btree_remove_debugging$ = SubLFiles.defparameter( "*BTREE-REMOVE-DEBUGGING*", NIL );
    $cfasl_opcode_btree$ = SubLFiles.defconstant( "*CFASL-OPCODE-BTREE*", NINETEEN_INTEGER );
    $cfasl_opcode_legacy_btree_low$ = SubLFiles.defconstant( "*CFASL-OPCODE-LEGACY-BTREE-LOW*", TWENTY_INTEGER );
    $cfasl_opcode_legacy_btree_high$ = SubLFiles.defconstant( "*CFASL-OPCODE-LEGACY-BTREE-HIGH*", $int74$21 );
    $cfasl_opcode_legacy_btree_leaf$ = SubLFiles.defconstant( "*CFASL-OPCODE-LEGACY-BTREE-LEAF*", $int76$22 );
    $btree_balance_vector_index$ = SubLFiles.defparameter( "*BTREE-BALANCE-VECTOR-INDEX*", ZERO_INTEGER );
    $btree_balance_vector$ = SubLFiles.defparameter( "*BTREE-BALANCE-VECTOR*", NIL );
    $dtp_avl_tree$ = SubLFiles.defconstant( "*DTP-AVL-TREE*", $sym79$AVL_TREE );
    $cfasl_opcode_avl_tree$ = SubLFiles.defconstant( "*CFASL-OPCODE-AVL-TREE*", $int106$80 );
    $print_avl_tree_node_dataP$ = SubLFiles.defparameter( "*PRINT-AVL-TREE-NODE-DATA?*", T );
    $dtp_avl_tree_node$ = SubLFiles.defconstant( "*DTP-AVL-TREE-NODE*", $sym117$AVL_TREE_NODE );
    $cfasl_opcode_avl_tree_node$ = SubLFiles.defconstant( "*CFASL-OPCODE-AVL-TREE-NODE*", $int144$81 );
    return NIL;
  }

  public static SubLObject setup_binary_tree_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_btree$.getGlobalValue(), Symbols.symbol_function( $sym7$BTREE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$BT_TAG, $sym10$_CSETF_BT_TAG );
    Structures.def_csetf( $sym11$BT_STATE, $sym12$_CSETF_BT_STATE );
    Structures.def_csetf( $sym13$BT_LOWER, $sym14$_CSETF_BT_LOWER );
    Structures.def_csetf( $sym15$BT_HIGHER, $sym16$_CSETF_BT_HIGHER );
    Equality.identity( $sym0$BTREE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_btree$.getGlobalValue(), Symbols.symbol_function( $sym26$VISIT_DEFSTRUCT_OBJECT_BTREE_METHOD ) );
    access_macros.register_macro_helper( $sym41$DO_BTREE_INDEX_KEY, $sym43$DO_BTREE_INDEX );
    access_macros.register_macro_helper( $sym42$DO_BTREE_INDEX_VALUE, $sym43$DO_BTREE_INDEX );
    access_macros.register_macro_helper( $sym39$DO_BTREE, $sym43$DO_BTREE_INDEX );
    access_macros.register_macro_helper( $sym53$DO_BTREE_LOWER, $sym39$DO_BTREE );
    access_macros.register_macro_helper( $sym55$DO_BTREE_HIGHER, $sym39$DO_BTREE );
    cfasl.register_cfasl_input_function( $cfasl_opcode_btree$.getGlobalValue(), $sym71$CFASL_INPUT_BTREE );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_btree$.getGlobalValue(), Symbols.symbol_function( $sym72$CFASL_OUTPUT_OBJECT_BTREE_METHOD ) );
    cfasl.register_cfasl_input_function( $cfasl_opcode_legacy_btree_low$.getGlobalValue(), $sym73$CFASL_INPUT_LEGACY_BTREE_LOW );
    cfasl.register_cfasl_input_function( $cfasl_opcode_legacy_btree_high$.getGlobalValue(), $sym75$CFASL_INPUT_LEGACY_BTREE_HIGH );
    cfasl.register_cfasl_input_function( $cfasl_opcode_legacy_btree_leaf$.getGlobalValue(), $sym77$CFASL_INPUT_LEGACY_BTREE_LEAF );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_avl_tree$.getGlobalValue(), Symbols.symbol_function( $sym86$AVL_TREE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list87 );
    Structures.def_csetf( $sym88$AVLT_ROOT, $sym89$_CSETF_AVLT_ROOT );
    Structures.def_csetf( $sym90$AVLT_TEST, $sym91$_CSETF_AVLT_TEST );
    Structures.def_csetf( $sym92$AVLT_SIZE, $sym93$_CSETF_AVLT_SIZE );
    Equality.identity( $sym79$AVL_TREE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_avl_tree$.getGlobalValue(), Symbols.symbol_function( $sym98$VISIT_DEFSTRUCT_OBJECT_AVL_TREE_METHOD ) );
    cfasl.register_cfasl_input_function( $cfasl_opcode_avl_tree$.getGlobalValue(), $sym107$CFASL_INPUT_AVL_TREE );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_avl_tree$.getGlobalValue(), Symbols.symbol_function( $sym108$CFASL_OUTPUT_OBJECT_AVL_TREE_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_avl_tree_node$.getGlobalValue(), Symbols.symbol_function( $sym124$AVL_TREE_NODE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list125 );
    Structures.def_csetf( $sym126$AVLTN_DATA, $sym127$_CSETF_AVLTN_DATA );
    Structures.def_csetf( $sym128$AVLTN_BALANCE, $sym129$_CSETF_AVLTN_BALANCE );
    Structures.def_csetf( $sym130$AVLTN_LOWER, $sym131$_CSETF_AVLTN_LOWER );
    Structures.def_csetf( $sym132$AVLTN_HIGHER, $sym133$_CSETF_AVLTN_HIGHER );
    Equality.identity( $sym117$AVL_TREE_NODE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_avl_tree_node$.getGlobalValue(), Symbols.symbol_function( $sym137$VISIT_DEFSTRUCT_OBJECT_AVL_TREE_NODE_METHOD ) );
    cfasl.register_cfasl_input_function( $cfasl_opcode_avl_tree_node$.getGlobalValue(), $sym145$CFASL_INPUT_AVL_TREE_NODE );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_avl_tree_node$.getGlobalValue(), Symbols.symbol_function( $sym146$CFASL_OUTPUT_OBJECT_AVL_TREE_NODE_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_binary_tree_file();
  }

  @Override
  public void initializeVariables()
  {
    init_binary_tree_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_binary_tree_file();
  }
  static
  {
    me = new binary_tree();
    $dtp_btree$ = null;
    $btree_free_list$ = null;
    $btree_free_lock$ = null;
    $validate_btrees$ = null;
    $btree_tags$ = null;
    $btree_remove_debugging$ = null;
    $cfasl_opcode_btree$ = null;
    $cfasl_opcode_legacy_btree_low$ = null;
    $cfasl_opcode_legacy_btree_high$ = null;
    $cfasl_opcode_legacy_btree_leaf$ = null;
    $btree_balance_vector_index$ = null;
    $btree_balance_vector$ = null;
    $dtp_avl_tree$ = null;
    $cfasl_opcode_avl_tree$ = null;
    $print_avl_tree_node_dataP$ = null;
    $dtp_avl_tree_node$ = null;
    $cfasl_opcode_avl_tree_node$ = null;
    $sym0$BTREE = makeSymbol( "BTREE" );
    $sym1$BTREE_P = makeSymbol( "BTREE-P" );
    $list2 = ConsesLow.list( makeSymbol( "TAG" ), makeSymbol( "STATE" ), makeSymbol( "LOWER" ), makeSymbol( "HIGHER" ) );
    $list3 = ConsesLow.list( makeKeyword( "TAG" ), makeKeyword( "STATE" ), makeKeyword( "LOWER" ), makeKeyword( "HIGHER" ) );
    $list4 = ConsesLow.list( makeSymbol( "BT-TAG" ), makeSymbol( "BT-STATE" ), makeSymbol( "BT-LOWER" ), makeSymbol( "BT-HIGHER" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-BT-TAG" ), makeSymbol( "_CSETF-BT-STATE" ), makeSymbol( "_CSETF-BT-LOWER" ), makeSymbol( "_CSETF-BT-HIGHER" ) );
    $sym6$PRINT_BTREE = makeSymbol( "PRINT-BTREE" );
    $sym7$BTREE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "BTREE-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "BTREE-P" ) );
    $sym9$BT_TAG = makeSymbol( "BT-TAG" );
    $sym10$_CSETF_BT_TAG = makeSymbol( "_CSETF-BT-TAG" );
    $sym11$BT_STATE = makeSymbol( "BT-STATE" );
    $sym12$_CSETF_BT_STATE = makeSymbol( "_CSETF-BT-STATE" );
    $sym13$BT_LOWER = makeSymbol( "BT-LOWER" );
    $sym14$_CSETF_BT_LOWER = makeSymbol( "_CSETF-BT-LOWER" );
    $sym15$BT_HIGHER = makeSymbol( "BT-HIGHER" );
    $sym16$_CSETF_BT_HIGHER = makeSymbol( "_CSETF-BT-HIGHER" );
    $kw17$TAG = makeKeyword( "TAG" );
    $kw18$STATE = makeKeyword( "STATE" );
    $kw19$LOWER = makeKeyword( "LOWER" );
    $kw20$HIGHER = makeKeyword( "HIGHER" );
    $str21$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw22$BEGIN = makeKeyword( "BEGIN" );
    $sym23$MAKE_BTREE = makeSymbol( "MAKE-BTREE" );
    $kw24$SLOT = makeKeyword( "SLOT" );
    $kw25$END = makeKeyword( "END" );
    $sym26$VISIT_DEFSTRUCT_OBJECT_BTREE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-BTREE-METHOD" );
    $str27$__BT_ = makeString( "#<BT:" );
    $str28$_ = makeString( "@" );
    $str29$_ = makeString( ":" );
    $str30$_ = makeString( ">" );
    $str31$__S_ = makeString( "[~S]" );
    $str32$BTREE_resource_lock = makeString( "BTREE resource lock" );
    $kw33$FREE = makeKeyword( "FREE" );
    $list34 = ConsesLow.list( ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "VALUE" ), makeSymbol( "BTREE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list35 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw36$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw37$DONE = makeKeyword( "DONE" );
    $sym38$SUBTREE = makeUninternedSymbol( "SUBTREE" );
    $sym39$DO_BTREE = makeSymbol( "DO-BTREE" );
    $sym40$CLET = makeSymbol( "CLET" );
    $sym41$DO_BTREE_INDEX_KEY = makeSymbol( "DO-BTREE-INDEX-KEY" );
    $sym42$DO_BTREE_INDEX_VALUE = makeSymbol( "DO-BTREE-INDEX-VALUE" );
    $sym43$DO_BTREE_INDEX = makeSymbol( "DO-BTREE-INDEX" );
    $list44 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "BTREE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym45$STACK = makeUninternedSymbol( "STACK" );
    $list46 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTE" ), NIL ) );
    $sym47$CDO = makeSymbol( "CDO" );
    $sym48$COR = makeSymbol( "COR" );
    $sym49$NULL = makeSymbol( "NULL" );
    $sym50$CSETQ = makeSymbol( "CSETQ" );
    $list51 = ConsesLow.list( NIL );
    $sym52$LOWER = makeSymbol( "LOWER" );
    $sym53$DO_BTREE_LOWER = makeSymbol( "DO-BTREE-LOWER" );
    $sym54$HIGHER = makeSymbol( "HIGHER" );
    $sym55$DO_BTREE_HIGHER = makeSymbol( "DO-BTREE-HIGHER" );
    $sym56$PCOND = makeSymbol( "PCOND" );
    $sym57$PWHEN = makeSymbol( "PWHEN" );
    $sym58$CPUSH = makeSymbol( "CPUSH" );
    $list59 = ConsesLow.list( makeSymbol( "LOWER" ) );
    $list60 = ConsesLow.list( makeSymbol( "HIGHER" ) );
    $sym61$CAR = makeSymbol( "CAR" );
    $sym62$CPOP = makeSymbol( "CPOP" );
    $str63$Binary_Tree__S_is_broken_before_i = makeString( "Binary Tree ~S is broken before insert!" );
    $str64$Binary_Tree__S_is_broken_after_in = makeString( "Binary Tree ~S is broken after insert!" );
    $str65$Binary_Tree__S_is_broken_before_r = makeString( "Binary Tree ~S is broken before removal!" );
    $str66$Binary_Tree__S_is_broken_after_re = makeString( "Binary Tree ~S is broken after removal!" );
    $sym67$TRUE = makeSymbol( "TRUE" );
    $sym68$GATHER_BTREE_TAG = makeSymbol( "GATHER-BTREE-TAG" );
    $str69$_S_info_will_be_lost_inserting__S = makeString( "~S info will be lost inserting ~S into ~S" );
    $str70$The_tags__S_were_lost_from_tree__ = makeString( "The tags ~S were lost from tree ~S" );
    $sym71$CFASL_INPUT_BTREE = makeSymbol( "CFASL-INPUT-BTREE" );
    $sym72$CFASL_OUTPUT_OBJECT_BTREE_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-BTREE-METHOD" );
    $sym73$CFASL_INPUT_LEGACY_BTREE_LOW = makeSymbol( "CFASL-INPUT-LEGACY-BTREE-LOW" );
    $int74$21 = makeInteger( 21 );
    $sym75$CFASL_INPUT_LEGACY_BTREE_HIGH = makeSymbol( "CFASL-INPUT-LEGACY-BTREE-HIGH" );
    $int76$22 = makeInteger( 22 );
    $sym77$CFASL_INPUT_LEGACY_BTREE_LEAF = makeSymbol( "CFASL-INPUT-LEGACY-BTREE-LEAF" );
    $sym78$BTREE_BALANCE_INSERT_NODE = makeSymbol( "BTREE-BALANCE-INSERT-NODE" );
    $sym79$AVL_TREE = makeSymbol( "AVL-TREE" );
    $sym80$AVL_TREE_P = makeSymbol( "AVL-TREE-P" );
    $list81 = ConsesLow.list( makeSymbol( "ROOT" ), makeSymbol( "TEST" ), makeSymbol( "SIZE" ) );
    $list82 = ConsesLow.list( makeKeyword( "ROOT" ), makeKeyword( "TEST" ), makeKeyword( "SIZE" ) );
    $list83 = ConsesLow.list( makeSymbol( "AVLT-ROOT" ), makeSymbol( "AVLT-TEST" ), makeSymbol( "AVLT-SIZE" ) );
    $list84 = ConsesLow.list( makeSymbol( "_CSETF-AVLT-ROOT" ), makeSymbol( "_CSETF-AVLT-TEST" ), makeSymbol( "_CSETF-AVLT-SIZE" ) );
    $sym85$PRINT_AVL_TREE = makeSymbol( "PRINT-AVL-TREE" );
    $sym86$AVL_TREE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "AVL-TREE-PRINT-FUNCTION-TRAMPOLINE" );
    $list87 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "AVL-TREE-P" ) );
    $sym88$AVLT_ROOT = makeSymbol( "AVLT-ROOT" );
    $sym89$_CSETF_AVLT_ROOT = makeSymbol( "_CSETF-AVLT-ROOT" );
    $sym90$AVLT_TEST = makeSymbol( "AVLT-TEST" );
    $sym91$_CSETF_AVLT_TEST = makeSymbol( "_CSETF-AVLT-TEST" );
    $sym92$AVLT_SIZE = makeSymbol( "AVLT-SIZE" );
    $sym93$_CSETF_AVLT_SIZE = makeSymbol( "_CSETF-AVLT-SIZE" );
    $kw94$ROOT = makeKeyword( "ROOT" );
    $kw95$TEST = makeKeyword( "TEST" );
    $kw96$SIZE = makeKeyword( "SIZE" );
    $sym97$MAKE_AVL_TREE = makeSymbol( "MAKE-AVL-TREE" );
    $sym98$VISIT_DEFSTRUCT_OBJECT_AVL_TREE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-AVL-TREE-METHOD" );
    $str99$test__a_size__a = makeString( "test=~a size=~a" );
    $sym100$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $kw101$FORWARD = makeKeyword( "FORWARD" );
    $sym102$AVL_TREE_ITERATOR_DONE = makeSymbol( "AVL-TREE-ITERATOR-DONE" );
    $sym103$AVL_TREE_ITERATOR_NEXT = makeSymbol( "AVL-TREE-ITERATOR-NEXT" );
    $sym104$SBHL_AVL_TREE_ITERATOR_DONE = makeSymbol( "SBHL-AVL-TREE-ITERATOR-DONE" );
    $sym105$SBHL_AVL_TREE_ITERATOR_NEXT = makeSymbol( "SBHL-AVL-TREE-ITERATOR-NEXT" );
    $int106$80 = makeInteger( 80 );
    $sym107$CFASL_INPUT_AVL_TREE = makeSymbol( "CFASL-INPUT-AVL-TREE" );
    $sym108$CFASL_OUTPUT_OBJECT_AVL_TREE_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-AVL-TREE-METHOD" );
    $list109 = ConsesLow.list( MINUS_ONE_INTEGER, ZERO_INTEGER, ONE_INTEGER );
    $sym110$_ = makeSymbol( "<" );
    $sym111$TERM__ = makeSymbol( "TERM-<" );
    $sym112$SBHL_DATE_ = makeSymbol( "SBHL-DATE<" );
    $int113$_2 = makeInteger( -2 );
    $str114$AVL_tree__a_is_corrupt_ = makeString( "AVL tree ~a is corrupt." );
    $str115$AVL_tree__a_is_corrupt = makeString( "AVL tree ~a is corrupt" );
    $list116 = ConsesLow.list( makeSymbol( "TREE" ), makeSymbol( "STACK" ), makeSymbol( "END" ), makeSymbol( "DIRECTION" ) );
    $sym117$AVL_TREE_NODE = makeSymbol( "AVL-TREE-NODE" );
    $sym118$AVL_TREE_NODE_P = makeSymbol( "AVL-TREE-NODE-P" );
    $list119 = ConsesLow.list( makeSymbol( "DATA" ), makeSymbol( "BALANCE" ), makeSymbol( "LOWER" ), makeSymbol( "HIGHER" ) );
    $list120 = ConsesLow.list( makeKeyword( "DATA" ), makeKeyword( "BALANCE" ), makeKeyword( "LOWER" ), makeKeyword( "HIGHER" ) );
    $list121 = ConsesLow.list( makeSymbol( "AVLTN-DATA" ), makeSymbol( "AVLTN-BALANCE" ), makeSymbol( "AVLTN-LOWER" ), makeSymbol( "AVLTN-HIGHER" ) );
    $list122 = ConsesLow.list( makeSymbol( "_CSETF-AVLTN-DATA" ), makeSymbol( "_CSETF-AVLTN-BALANCE" ), makeSymbol( "_CSETF-AVLTN-LOWER" ), makeSymbol( "_CSETF-AVLTN-HIGHER" ) );
    $sym123$PRINT_AVL_TREE_NODE = makeSymbol( "PRINT-AVL-TREE-NODE" );
    $sym124$AVL_TREE_NODE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "AVL-TREE-NODE-PRINT-FUNCTION-TRAMPOLINE" );
    $list125 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "AVL-TREE-NODE-P" ) );
    $sym126$AVLTN_DATA = makeSymbol( "AVLTN-DATA" );
    $sym127$_CSETF_AVLTN_DATA = makeSymbol( "_CSETF-AVLTN-DATA" );
    $sym128$AVLTN_BALANCE = makeSymbol( "AVLTN-BALANCE" );
    $sym129$_CSETF_AVLTN_BALANCE = makeSymbol( "_CSETF-AVLTN-BALANCE" );
    $sym130$AVLTN_LOWER = makeSymbol( "AVLTN-LOWER" );
    $sym131$_CSETF_AVLTN_LOWER = makeSymbol( "_CSETF-AVLTN-LOWER" );
    $sym132$AVLTN_HIGHER = makeSymbol( "AVLTN-HIGHER" );
    $sym133$_CSETF_AVLTN_HIGHER = makeSymbol( "_CSETF-AVLTN-HIGHER" );
    $kw134$DATA = makeKeyword( "DATA" );
    $kw135$BALANCE = makeKeyword( "BALANCE" );
    $sym136$MAKE_AVL_TREE_NODE = makeSymbol( "MAKE-AVL-TREE-NODE" );
    $sym137$VISIT_DEFSTRUCT_OBJECT_AVL_TREE_NODE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-AVL-TREE-NODE-METHOD" );
    $str138$__a_ = makeString( "(~a)" );
    $str139$__Data______a = makeString( "~%Data:    ~a" );
    $str140$__Balance___a = makeString( "~%Balance: ~a" );
    $str141$__Lower_____a = makeString( "~%Lower:   ~a" );
    $str142$__Higher____a = makeString( "~%Higher:  ~a" );
    $str143$__ = makeString( "~%" );
    $int144$81 = makeInteger( 81 );
    $sym145$CFASL_INPUT_AVL_TREE_NODE = makeSymbol( "CFASL-INPUT-AVL-TREE-NODE" );
    $sym146$CFASL_OUTPUT_OBJECT_AVL_TREE_NODE_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-AVL-TREE-NODE-METHOD" );
  }

  public static final class $btree_native
      extends
        SubLStructNative
  {
    public SubLObject $tag;
    public SubLObject $state;
    public SubLObject $lower;
    public SubLObject $higher;
    private static final SubLStructDeclNative structDecl;

    public $btree_native()
    {
      this.$tag = CommonSymbols.NIL;
      this.$state = CommonSymbols.NIL;
      this.$lower = CommonSymbols.NIL;
      this.$higher = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $btree_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$tag;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$state;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$lower;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$higher;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$tag = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$state = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$lower = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$higher = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $btree_native.class, $sym0$BTREE, $sym1$BTREE_P, $list2, $list3, new String[] { "$tag", "$state", "$lower", "$higher"
      }, $list4, $list5, $sym6$PRINT_BTREE );
    }
  }

  public static final class $btree_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $btree_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "BTREE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return btree_p( arg1 );
    }
  }

  public static final class $avl_tree_native
      extends
        SubLStructNative
  {
    public SubLObject $root;
    public SubLObject $test;
    public SubLObject $size;
    private static final SubLStructDeclNative structDecl;

    public $avl_tree_native()
    {
      this.$root = CommonSymbols.NIL;
      this.$test = CommonSymbols.NIL;
      this.$size = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $avl_tree_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$root;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$test;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$size;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$root = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$test = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$size = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $avl_tree_native.class, $sym79$AVL_TREE, $sym80$AVL_TREE_P, $list81, $list82, new String[] { "$root", "$test", "$size"
      }, $list83, $list84, $sym85$PRINT_AVL_TREE );
    }
  }

  public static final class $avl_tree_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $avl_tree_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "AVL-TREE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return avl_tree_p( arg1 );
    }
  }

  public static final class $avl_tree_node_native
      extends
        SubLStructNative
  {
    public SubLObject $data;
    public SubLObject $balance;
    public SubLObject $lower;
    public SubLObject $higher;
    private static final SubLStructDeclNative structDecl;

    public $avl_tree_node_native()
    {
      this.$data = CommonSymbols.NIL;
      this.$balance = CommonSymbols.NIL;
      this.$lower = CommonSymbols.NIL;
      this.$higher = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $avl_tree_node_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$data;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$balance;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$lower;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$higher;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$data = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$balance = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$lower = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$higher = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $avl_tree_node_native.class, $sym117$AVL_TREE_NODE, $sym118$AVL_TREE_NODE_P, $list119, $list120, new String[] { "$data", "$balance", "$lower", "$higher"
      }, $list121, $list122, $sym123$PRINT_AVL_TREE_NODE );
    }
  }

  public static final class $avl_tree_node_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $avl_tree_node_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "AVL-TREE-NODE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return avl_tree_node_p( arg1 );
    }
  }

  public static final class $cfasl_input_avl_tree_node$UnaryFunction
      extends
        UnaryFunction
  {
    public $cfasl_input_avl_tree_node$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CFASL-INPUT-AVL-TREE-NODE" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cfasl_input_avl_tree_node( arg1 );
    }
  }
}
/*
 * 
 * Total time: 525 ms
 * 
 */