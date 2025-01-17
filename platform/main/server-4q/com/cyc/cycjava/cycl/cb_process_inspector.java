package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;

import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_process_inspector
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_process_inspector";
  public static final String myFingerPrint = "96a0bd1130c9080b5b5372cedc96113c2201fbbd30d16967f23cc954ac66d733";
  private static final SubLString $str0$_Process_Inspector_;
  private static final SubLSymbol $kw1$MAIN;
  private static final SubLString $str2$cb_process_inspector;
  private static final SubLSymbol $kw3$PROCESS_INSPECTOR;
  private static final SubLSymbol $sym4$CB_LINK_PROCESS_INSPECTOR;
  private static final SubLString $str5$the_Process_Inspector;
  private static final SubLString $str6$Cyc_Process_Inspector;
  private static final SubLString $str7$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str8$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw9$UNINITIALIZED;
  private static final SubLSymbol $kw10$CB_CYC;
  private static final SubLSymbol $kw11$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw12$SHA1;
  private static final SubLString $str13$yui_skin_sam;
  private static final SubLString $str14$reloadFrameButton;
  private static final SubLString $str15$button;
  private static final SubLString $str16$reload;
  private static final SubLString $str17$Refresh_Frames;
  private static final SubLString $str18$_Refresh_;
  private static final SubLSymbol $sym19$CB_PROCESS_INSPECTOR;
  private static final SubLSymbol $kw20$HTML_HANDLER;
  private static final SubLSymbol $kw21$LEFT;
  private static final SubLString $str22$100_;
  private static final SubLString $str23$30_;
  private static final SubLString $str24$ID;
  private static final SubLString $str25$70_;
  private static final SubLString $str26$Name;
  private static final SubLString $str27$Action_A;
  private static final SubLString $str28$;
  private static final SubLSymbol $kw29$CENTER;
  private static final SubLString $str30$20_;
  private static final SubLString $str31$Prior;
  private static final SubLString $str32$50_;
  private static final SubLString $str33$State;
  private static final SubLString $str34$Current_Form;
  private static final SubLString $str35$_optional_;
  private static final SubLString $str36$DFFFDF;
  private static final SubLSymbol $kw37$TOP;
  private static final SubLSymbol $kw38$KILL_PROCESS;
  private static final SubLString $str39$_Kill_;
  private static final SubLString $str40$Run;
  private static final SubLString $str41$___;
  private static final SubLSymbol $sym42$PROCESSP;
  private static final SubLSymbol $kw43$SELF;
  private static final SubLString $str44$cb_confirm_kill_process__A;
  private static final SubLSymbol $sym45$CB_LINK_KILL_PROCESS;
  private static final SubLString $str46$the_Cyc_term_kill_facility;
  private static final SubLList $list47;
  private static final SubLString $str48$Process__A_no_longer_exists_;
  private static final SubLString $str49$Confirm_Kill_Process;
  private static final SubLString $str50$post;
  private static final SubLString $str51$cb_kill_process;
  private static final SubLString $str52$confirmed;
  private static final SubLString $str53$T;
  private static final SubLString $str54$Please_confirm_kill_of_;
  private static final SubLString $str55$No;
  private static final SubLString $str56$Yes__Kill;
  private static final SubLSymbol $sym57$CB_CONFIRM_KILL_PROCESS;
  private static final SubLList $list58;
  private static final SubLSymbol $kw59$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym60$IGNORE_ERRORS_HANDLER;
  private static final SubLFloat $float61$0_5;
  private static final SubLSymbol $sym62$CB_KILL_PROCESS;
  private static final SubLSymbol $sym63$STRING_LESSP;
  private static final SubLSymbol $sym64$PROCESS_NAME;
  private static final SubLSymbol $sym65$PROCESS_FORM;
  private static final SubLSymbol $sym66$CB_PROCESS_RUNNING_;
  private static final SubLSymbol $sym67$INFERENCE_OBJECT_P;
  private static final SubLSymbol $sym68$KB_OBJECT_P;
  private static final SubLInteger $int69$100;

  @SubLTranslatedFile.SubL(source = "cycl/cb-process-inspector.lisp", position = 976L)
  public static SubLObject cb_link_process_inspector(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str0$_Process_Inspector_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw1$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str2$cb_process_inspector );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-process-inspector.lisp", position = 1272L)
  public static SubLObject cb_process_inspector(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      return cyc_navigator_internals.guest_warn( $str5$the_Process_Inspector );
    }
    final SubLObject title_var = $str6$Cyc_Process_Inspector;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str7$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str8$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw9$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw10$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str13$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str14$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str16$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str17$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$4, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
            html_utilities.html_princ_strong( $str6$Cyc_Process_Inspector );
            html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
            html_utilities.html_indent( FOUR_INTEGER );
            cb_utilities.cb_link( $kw3$PROCESS_INSPECTOR, $str18$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            cb_process_inspector_guts();
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$3, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$2, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$1, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-process-inspector.lisp", position = 1716L)
  public static SubLObject cb_process_inspector_guts()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject processes = cb_active_processes_for_display();
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ONE_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( TWO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( TWO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      cb_show_process_inspector_header_line();
      SubLObject cdolist_list_var = processes;
      SubLObject process = NIL;
      process = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        cb_show_process_inspector_line( process );
        cdolist_list_var = cdolist_list_var.rest();
        process = cdolist_list_var.first();
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return Sequences.length( processes );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-process-inspector.lisp", position = 2052L)
  public static SubLObject cb_show_process_inspector_header_line()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw21$LEFT ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( ZERO_INTEGER );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_width$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str22$100_ );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw21$LEFT ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_width$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str23$30_ );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ_strong( $str24$ID );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$8, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( TWO_INTEGER );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw21$LEFT ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_width$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str25$70_ );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ_strong( $str26$Name );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$7, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw21$LEFT ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_width$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str23$30_ );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str27$Action_A, $str28$ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw29$CENTER ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_width$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str30$20_ );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ_strong( $str31$Prior );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw21$LEFT ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_width$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str32$50_ );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ_strong( $str33$State );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw29$CENTER ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ_strong( $str34$Current_Form );
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
        html_utilities.html_princ( $str35$_optional_ );
        html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-process-inspector.lisp", position = 2952L)
  public static SubLObject cb_show_process_inspector_line(final SubLObject process)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject id = process_utilities.process_suid( process );
    final SubLObject priority = Threads.process_priority( process );
    final SubLObject name = Threads.process_name( process );
    final SubLObject whostate = Threads.process_whostate( process );
    final SubLObject form = process_utilities.process_form( process );
    final SubLObject runningP = cb_process_runningP( process );
    final SubLObject bgcolor = ( NIL != runningP ) ? $str36$DFFFDF : NIL;
    html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_utilities.html_align( $kw37$TOP ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != bgcolor )
    {
      html_utilities.html_markup( html_macros.$html_table_row_bgcolor$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( bgcolor );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw21$LEFT ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw37$TOP ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( ZERO_INTEGER );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_width$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str22$100_ );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw21$LEFT ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_width$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str23$30_ );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              cb_utilities.cb_form( id, UNPROVIDED, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$18, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( TWO_INTEGER );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw21$LEFT ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_width$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str25$70_ );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( name );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$19, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw21$LEFT ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_width$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str23$30_ );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              if( NIL == process_utilities.active_process_at_startupP( process ) )
              {
                cb_utilities.cb_link( $kw38$KILL_PROCESS, process, $str39$_Kill_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw29$CENTER ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_width$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str30$20_ );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              cb_utilities.cb_form( priority, UNPROVIDED, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$22, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw21$LEFT ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_width$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str32$50_ );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              if( whostate.equal( $str40$Run ) )
              {
                html_utilities.html_princ_strong( whostate );
              }
              else if( whostate.isString() )
              {
                html_utilities.html_princ( whostate );
              }
              else
              {
                html_utilities.html_princ( $str41$___ );
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$23, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$20, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      if( NIL != form )
      {
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw21$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw37$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          cb_show_process_form( form );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$24, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return process;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-process-inspector.lisp", position = 4520L)
  public static SubLObject cb_link_kill_process(final SubLObject process, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.processp( process ) : process;
    if( NIL == linktext )
    {
      linktext = $str39$_Kill_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw43$SELF );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str44$cb_confirm_kill_process__A, process_utilities.process_suid( process ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return process;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-process-inspector.lisp", position = 4857L)
  public static SubLObject cb_confirm_kill_process(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      return cyc_navigator_internals.guest_warn( $str46$the_Cyc_term_kill_facility );
    }
    SubLObject process_id_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list47 );
    process_id_string = args.first();
    final SubLObject current = args.rest();
    if( NIL == current )
    {
      final SubLObject process = cb_guess_process( process_id_string );
      if( NIL == Types.processp( process ) )
      {
        return cb_utilities.cb_error( $str48$Process__A_no_longer_exists_, process_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      final SubLObject title_var = $str49$Confirm_Kill_Process;
      final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_utilities.html_markup( $str7$__DOCTYPE_html_PUBLIC_____W3C__DT );
        if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( $str8$_meta_http_equiv__X_UA_Compatible );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$25 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
        try
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw9$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
          html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          cb_parameters.cb_head_shortcut_icon();
          html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
          cyc_file_dependencies.css( $kw10$CB_CYC );
          dhtml_macros.html_basic_cb_scripts();
          if( NIL != title_var )
          {
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
            html_utilities.html_princ( title_var );
            html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
          }
          html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$26 = html_macros.$html_inside_bodyP$.currentBinding( thread );
          try
          {
            html_macros.$html_inside_bodyP$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
            if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
            {
              html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str13$yui_skin_sam );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str14$reloadFrameButton );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str15$button );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str16$reload );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_princ( $str17$Refresh_Frames );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                {
                  html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$28, thread );
              }
              html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
              if( NIL != title_var )
              {
                html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
                html_utilities.html_markup( TWO_INTEGER );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                html_utilities.html_princ( title_var );
                html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
                html_utilities.html_markup( TWO_INTEGER );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
              html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str50$post );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != frame_name_var )
              {
                html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( frame_name_var );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding( thread );
              final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
              final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_macros.$within_html_form$.bind( T, thread );
                html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                html_utilities.html_hidden_input( $str51$cb_kill_process, process_id_string, UNPROVIDED );
                html_utilities.html_hidden_input( $str52$confirmed, $str53$T, UNPROVIDED );
                html_utilities.html_princ( $str54$Please_confirm_kill_of_ );
                cb_utilities.cb_form( process, UNPROVIDED, UNPROVIDED );
                html_utilities.html_newline( TWO_INTEGER );
                cb_utilities.cb_back_button( $kw43$SELF, $str55$No );
                html_utilities.html_submit_input( $str56$Yes__Kill, UNPROVIDED, UNPROVIDED );
                html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
              }
              finally
              {
                html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
                html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$29, thread );
              }
              html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_copyright_notice();
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$27, thread );
            }
            html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$26, thread );
          }
          html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
        }
        finally
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$25, thread );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list47 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-process-inspector.lisp", position = 5527L)
  public static SubLObject cb_kill_process(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      return cyc_navigator_internals.guest_warn( $str5$the_Process_Inspector );
    }
    SubLObject process_id_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list58 );
    process_id_string = args.first();
    final SubLObject other_args;
    final SubLObject current = other_args = args.rest();
    final SubLObject process = cb_guess_process( process_id_string );
    if( NIL == Types.processp( process ) )
    {
      return cb_utilities.cb_error( $str48$Process__A_no_longer_exists_, process_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw59$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym60$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          Threads.kill_process( process );
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw59$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    Threads.sleep( $float61$0_5 );
    return cb_process_inspector( UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-process-inspector.lisp", position = 6783L)
  public static SubLObject cb_active_processes_for_display()
  {
    SubLObject processes_for_display = Threads.all_processes();
    processes_for_display = Sequences.remove( Threads.current_process(), processes_for_display, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    processes_for_display = Sort.sort( processes_for_display, Symbols.symbol_function( $sym63$STRING_LESSP ), Symbols.symbol_function( $sym64$PROCESS_NAME ) );
    processes_for_display = list_utilities.stable_sort_via_test( processes_for_display, $sym65$PROCESS_FORM, UNPROVIDED );
    processes_for_display = list_utilities.stable_sort_via_test( processes_for_display, $sym66$CB_PROCESS_RUNNING_, UNPROVIDED );
    return processes_for_display;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-process-inspector.lisp", position = 7838L)
  public static SubLObject cb_process_runningP(final SubLObject process)
  {
    return makeBoolean( NIL != Threads.valid_process_p( process ) && $str40$Run.equal( Threads.process_whostate( process ) ) && NIL != list_utilities.sublisp_boolean( process_utilities.process_form( process ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-process-inspector.lisp", position = 8207L)
  public static SubLObject cb_show_process_form(final SubLObject form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_small_head$.getGlobalValue() );
    if( NIL != list_utilities.tree_find_if( $sym67$INFERENCE_OBJECT_P, form, UNPROVIDED ) || NIL != list_utilities.tree_find_if( $sym68$KB_OBJECT_P, form, UNPROVIDED ) || list_utilities.cons_count( form ).numG(
        $int69$100 ) )
    {
      html_utilities.html_markup( html_macros.$html_code_head$.getGlobalValue() );
      cb_utilities.cb_form( form, ZERO_INTEGER, T );
      html_utilities.html_markup( html_macros.$html_code_tail$.getGlobalValue() );
    }
    else
    {
      html_macros.verify_not_within_html_pre();
      html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
      final SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding( thread );
      try
      {
        html_macros.$within_html_pre$.bind( T, thread );
        format_cycl_expression.format_cycl_expression( form, html_macros.$html_stream$.getDynamicValue( thread ), UNPROVIDED );
      }
      finally
      {
        html_macros.$within_html_pre$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
    }
    html_utilities.html_markup( html_macros.$html_small_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-process-inspector.lisp", position = 8720L)
  public static SubLObject cb_guess_process(final SubLObject v_object)
  {
    if( NIL != Types.processp( v_object ) )
    {
      return v_object;
    }
    if( v_object.isString() )
    {
      final SubLObject integer = reader.read_from_string_ignoring_errors( v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return cb_guess_process( integer );
    }
    if( v_object.isInteger() )
    {
      return process_utilities.find_process_by_suid( v_object );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-process-inspector.lisp", position = 9016L)
  public static SubLObject inference_object_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_datastructures_inference.inference_p( v_object ) || NIL != inference_datastructures_problem.problem_p( v_object ) || NIL != inference_datastructures_tactic.tactic_p( v_object )
        || NIL != inference_datastructures_proof.proof_p( v_object ) || NIL != inference_datastructures_problem_link.problem_link_p( v_object ) || NIL != inference_datastructures_problem_store.problem_store_p( v_object )
        || NIL != inference_datastructures_strategy.strategy_p( v_object ) || NIL != inference_datastructures_inference.inference_answer_p( v_object ) || NIL != inference_datastructures_inference
            .inference_answer_justification_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-process-inspector.lisp", position = 9483L)
  public static SubLObject kb_object_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != constant_handles.constant_p( v_object ) || NIL != nart_handles.nart_p( v_object ) || NIL != assertion_handles.assertion_p( v_object ) || NIL != deduction_handles.deduction_p( v_object )
        || NIL != kb_hl_support_handles.kb_hl_support_p( v_object ) || NIL != clause_strucs.clause_struc_p( v_object ) );
  }

  public static SubLObject declare_cb_process_inspector_file()
  {
    SubLFiles.declareFunction( me, "cb_link_process_inspector", "CB-LINK-PROCESS-INSPECTOR", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_process_inspector", "CB-PROCESS-INSPECTOR", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_process_inspector_guts", "CB-PROCESS-INSPECTOR-GUTS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_show_process_inspector_header_line", "CB-SHOW-PROCESS-INSPECTOR-HEADER-LINE", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_show_process_inspector_line", "CB-SHOW-PROCESS-INSPECTOR-LINE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_kill_process", "CB-LINK-KILL-PROCESS", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_confirm_kill_process", "CB-CONFIRM-KILL-PROCESS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_kill_process", "CB-KILL-PROCESS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_active_processes_for_display", "CB-ACTIVE-PROCESSES-FOR-DISPLAY", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_process_runningP", "CB-PROCESS-RUNNING?", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_process_form", "CB-SHOW-PROCESS-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_guess_process", "CB-GUESS-PROCESS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_object_p", "INFERENCE-OBJECT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_object_p", "KB-OBJECT-P", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_process_inspector_file()
  {
    return NIL;
  }

  public static SubLObject setup_cb_process_inspector_file()
  {
    cb_utilities.setup_cb_link_method( $kw3$PROCESS_INSPECTOR, $sym4$CB_LINK_PROCESS_INSPECTOR, ONE_INTEGER );
    html_macros.note_cgi_handler_function( $sym19$CB_PROCESS_INSPECTOR, $kw20$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw38$KILL_PROCESS, $sym45$CB_LINK_KILL_PROCESS, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym57$CB_CONFIRM_KILL_PROCESS, $kw20$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym62$CB_KILL_PROCESS, $kw20$HTML_HANDLER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_process_inspector_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_process_inspector_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_process_inspector_file();
  }
  static
  {
    me = new cb_process_inspector();
    $str0$_Process_Inspector_ = makeString( "[Process Inspector]" );
    $kw1$MAIN = makeKeyword( "MAIN" );
    $str2$cb_process_inspector = makeString( "cb-process-inspector" );
    $kw3$PROCESS_INSPECTOR = makeKeyword( "PROCESS-INSPECTOR" );
    $sym4$CB_LINK_PROCESS_INSPECTOR = makeSymbol( "CB-LINK-PROCESS-INSPECTOR" );
    $str5$the_Process_Inspector = makeString( "the Process Inspector" );
    $str6$Cyc_Process_Inspector = makeString( "Cyc Process Inspector" );
    $str7$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str8$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw9$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw10$CB_CYC = makeKeyword( "CB-CYC" );
    $kw11$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw12$SHA1 = makeKeyword( "SHA1" );
    $str13$yui_skin_sam = makeString( "yui-skin-sam" );
    $str14$reloadFrameButton = makeString( "reloadFrameButton" );
    $str15$button = makeString( "button" );
    $str16$reload = makeString( "reload" );
    $str17$Refresh_Frames = makeString( "Refresh Frames" );
    $str18$_Refresh_ = makeString( "[Refresh]" );
    $sym19$CB_PROCESS_INSPECTOR = makeSymbol( "CB-PROCESS-INSPECTOR" );
    $kw20$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $kw21$LEFT = makeKeyword( "LEFT" );
    $str22$100_ = makeString( "100%" );
    $str23$30_ = makeString( "30%" );
    $str24$ID = makeString( "ID" );
    $str25$70_ = makeString( "70%" );
    $str26$Name = makeString( "Name" );
    $str27$Action_A = makeString( "Action~A" );
    $str28$ = makeString( "" );
    $kw29$CENTER = makeKeyword( "CENTER" );
    $str30$20_ = makeString( "20%" );
    $str31$Prior = makeString( "Prior" );
    $str32$50_ = makeString( "50%" );
    $str33$State = makeString( "State" );
    $str34$Current_Form = makeString( "Current Form" );
    $str35$_optional_ = makeString( "(optional)" );
    $str36$DFFFDF = makeString( "DFFFDF" );
    $kw37$TOP = makeKeyword( "TOP" );
    $kw38$KILL_PROCESS = makeKeyword( "KILL-PROCESS" );
    $str39$_Kill_ = makeString( "[Kill]" );
    $str40$Run = makeString( "Run" );
    $str41$___ = makeString( "???" );
    $sym42$PROCESSP = makeSymbol( "PROCESSP" );
    $kw43$SELF = makeKeyword( "SELF" );
    $str44$cb_confirm_kill_process__A = makeString( "cb-confirm-kill-process&~A" );
    $sym45$CB_LINK_KILL_PROCESS = makeSymbol( "CB-LINK-KILL-PROCESS" );
    $str46$the_Cyc_term_kill_facility = makeString( "the Cyc term kill facility" );
    $list47 = ConsesLow.list( makeSymbol( "PROCESS-ID-STRING" ) );
    $str48$Process__A_no_longer_exists_ = makeString( "Process ~A no longer exists." );
    $str49$Confirm_Kill_Process = makeString( "Confirm Kill Process" );
    $str50$post = makeString( "post" );
    $str51$cb_kill_process = makeString( "cb-kill-process" );
    $str52$confirmed = makeString( "confirmed" );
    $str53$T = makeString( "T" );
    $str54$Please_confirm_kill_of_ = makeString( "Please confirm kill of " );
    $str55$No = makeString( "No" );
    $str56$Yes__Kill = makeString( "Yes, Kill" );
    $sym57$CB_CONFIRM_KILL_PROCESS = makeSymbol( "CB-CONFIRM-KILL-PROCESS" );
    $list58 = ConsesLow.list( makeSymbol( "PROCESS-ID-STRING" ), makeSymbol( "&REST" ), makeSymbol( "OTHER-ARGS" ) );
    $kw59$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym60$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $float61$0_5 = makeDouble( 0.5 );
    $sym62$CB_KILL_PROCESS = makeSymbol( "CB-KILL-PROCESS" );
    $sym63$STRING_LESSP = makeSymbol( "STRING-LESSP" );
    $sym64$PROCESS_NAME = makeSymbol( "PROCESS-NAME" );
    $sym65$PROCESS_FORM = makeSymbol( "PROCESS-FORM" );
    $sym66$CB_PROCESS_RUNNING_ = makeSymbol( "CB-PROCESS-RUNNING?" );
    $sym67$INFERENCE_OBJECT_P = makeSymbol( "INFERENCE-OBJECT-P" );
    $sym68$KB_OBJECT_P = makeSymbol( "KB-OBJECT-P" );
    $int69$100 = makeInteger( 100 );
  }
}
/*
 * 
 * Total time: 399 ms
 * 
 */