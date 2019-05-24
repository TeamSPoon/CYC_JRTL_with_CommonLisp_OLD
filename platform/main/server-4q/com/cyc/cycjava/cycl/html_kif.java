package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class html_kif
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.html_kif";
  public static final String myFingerPrint = "d250e9c08dfd84339c753f60fd623824c5878724dc5eb71f58f6da09b68f156f";
  private static final SubLString $str0$KIF_Translation_Utilities;
  private static final SubLString $str1$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str2$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw3$UNINITIALIZED;
  private static final SubLSymbol $kw4$CB_CYC;
  private static final SubLSymbol $kw5$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw6$SHA1;
  private static final SubLString $str7$yui_skin_sam;
  private static final SubLString $str8$reloadFrameButton;
  private static final SubLString $str9$button;
  private static final SubLString $str10$reload;
  private static final SubLString $str11$Refresh_Frames;
  private static final SubLString $str12$post;
  private static final SubLString $str13$cb_handle_mt_to_kif_file;
  private static final SubLString $str14$cb_kif_utilities;
  private static final SubLString $str15$Save_the_contents_of_a_microtheor;
  private static final SubLSymbol $kw16$RIGHT;
  private static final SubLString $str17$mt;
  private static final SubLString $str18$Complete;
  private static final SubLObject $const19$Microtheory;
  private static final SubLString $str20$Mt___;
  private static final SubLString $str21$Filename___;
  private static final SubLString $str22$filename;
  private static final SubLSymbol $kw23$SELF;
  private static final SubLString $str24$Cancel;
  private static final SubLString $str25$Clear;
  private static final SubLString $str26$Save_as_KIF;
  private static final SubLString $str27$cb_handle_meld_to_kif;
  private static final SubLString $str28$Enter_a_CycL_formula_to_convert_t;
  private static final SubLString $str29$Formula__;
  private static final SubLString $str30$formula;
  private static final SubLString $str31$Cyclify;
  private static final SubLString $str32$Convert_to_KIF;
  private static final SubLInteger $int33$80;
  private static final SubLSymbol $sym34$CB_KIF_UTILITIES;
  private static final SubLSymbol $kw35$HTML_HANDLER;
  private static final SubLString $str36$KIF_Utilities;
  private static final SubLSymbol $kw37$MAIN;
  private static final SubLSymbol $kw38$KIF_UTILITIES;
  private static final SubLSymbol $sym39$CB_LINK_KIF_UTILITIES;
  private static final SubLString $str40$KIF;
  private static final SubLString $str41$_S_did_not_specify_a_term;
  private static final SubLString $str42$_A_is_not_a_microtheory;
  private static final SubLString $str43$Microtheory_being_saved_in_KIF;
  private static final SubLSymbol $sym44$CB_HANDLE_MT_TO_KIF_FILE;
  private static final SubLSymbol $sym45$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const46$EverythingPSC;
  private static final SubLString $str47$Unable_to_translate_the_given_for;
  private static final SubLString $str48$KIF_Translation;
  private static final SubLString $str49$CycL_formula__;
  private static final SubLString $str50$KIF_translation__;
  private static final SubLSymbol $sym51$CB_HANDLE_MELD_TO_KIF;
  private static final SubLList $list52;
  private static final SubLString $str53$Could_not_determine_an_assertion_;
  private static final SubLString $str54$Assertion_KIF_Spec;
  private static final SubLString $str55$EL_Formula___;
  private static final SubLString $str56$KIF_spec___;
  private static final SubLSymbol $sym57$CB_ASSERTION_KIF_FORMULA;
  private static final SubLString $str58$_KIF_;
  private static final SubLString $str59$cb_assertion_kif_formula__a;
  private static final SubLSymbol $kw60$ASSERTION_KIF_FORMULA;
  private static final SubLSymbol $sym61$CB_LINK_ASSERTION_KIF_FORMULA;
  private static final SubLList $list62;
  private static final SubLList $list63;
  private static final SubLSymbol $kw64$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw65$DIRECTION;
  private static final SubLSymbol $kw66$MONOTONICITY;
  private static final SubLSymbol $kw67$CREATOR;
  private static final SubLSymbol $kw68$CREATION_DATE;
  private static final SubLSymbol $kw69$MICROTHEORY;
  private static final SubLSymbol $kw70$KIF;
  private static final SubLString $str71$_;
  private static final SubLString $str72$_;

  @SubLTranslatedFile.SubL(source = "cycl/html-kif.lisp", position = 867L)
  public static SubLObject cb_kif_utilities(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str0$KIF_Translation_Utilities;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str1$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str2$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw3$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw4$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw5$SAM_AUTOCOMPLETE_CSS );
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
          html_utilities.html_markup( $str7$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str8$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str9$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str10$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str11$Refresh_Frames );
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
            SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str12$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
            SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str13$cb_handle_mt_to_kif_file, T, UNPROVIDED );
              cb_utilities.cb_help_preamble( $str14$cb_kif_utilities, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str15$Save_the_contents_of_a_microtheor );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( ZERO_INTEGER );
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
                  html_utilities.html_markup( html_utilities.html_align( $kw16$RIGHT ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_complete.html_complete_button( $str17$mt, $str18$Complete, $const19$Microtheory, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    html_utilities.html_indent( UNPROVIDED );
                    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                    html_utilities.html_princ( $str20$Mt___ );
                    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$8, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_text_input( $str17$mt, NIL, cb_parameters.$cb_constant_input_width$.getDynamicValue( thread ) );
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
                  html_utilities.html_markup( html_utilities.html_align( $kw16$RIGHT ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                    html_utilities.html_princ( $str21$Filename___ );
                    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_text_input( $str22$filename, NIL, cb_parameters.$cb_constant_input_width$.getDynamicValue( thread ) );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( TWO_INTEGER );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    cb_utilities.cb_back_button( $kw23$SELF, $str24$Cancel );
                    html_utilities.html_indent( UNPROVIDED );
                    html_utilities.html_reset_input( $str25$Clear );
                    html_utilities.html_indent( UNPROVIDED );
                    html_utilities.html_submit_input( $str26$Save_as_KIF, UNPROVIDED, UNPROVIDED );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str12$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
            _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str27$cb_handle_meld_to_kif, T, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str28$Enter_a_CycL_formula_to_convert_t );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str29$Formula__ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_reset_input( $str25$Clear );
              html_utilities.html_indent( UNPROVIDED );
              html_complete.html_complete_button( $str30$formula, $str18$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( UNPROVIDED );
              html_complete.html_cyclify_button( $str30$formula, $str31$Cyclify, UNPROVIDED );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_submit_input( $str32$Convert_to_KIF, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str30$formula );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $int33$80 );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( TEN_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
              }
              html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
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

  @SubLTranslatedFile.SubL(source = "cycl/html-kif.lisp", position = 2557L)
  public static SubLObject cb_link_kif_utilities(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str36$KIF_Utilities;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw37$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str14$cb_kif_utilities );
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

  @SubLTranslatedFile.SubL(source = "cycl/html-kif.lisp", position = 2860L)
  public static SubLObject cb_handle_mt_to_kif_file(final SubLObject args)
  {
    final SubLObject mt_string = html_utilities.html_extract_input( $str17$mt, args );
    final SubLObject filename = html_utilities.html_extract_input( $str22$filename, args );
    final SubLObject mt = cb_utilities.cb_guess_fort( mt_string, UNPROVIDED );
    if( NIL == forts.fort_p( mt ) )
    {
      return cb_utilities.cb_error( $str41$_S_did_not_specify_a_term, mt_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL == isa.isa_in_any_mtP( mt, $const19$Microtheory ) )
    {
      return cb_utilities.cb_error( $str42$_A_is_not_a_microtheory, mt_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    cb_utilities.cb_message_page_with_history( $str43$Microtheory_being_saved_in_KIF, UNPROVIDED );
    kif.write_mt_to_kif_file( mt, filename, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-kif.lisp", position = 3367L)
  public static SubLObject cb_handle_meld_to_kif(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject formula_string = html_utilities.html_extract_input( $str30$formula, args );
    SubLObject formula = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym45$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const46$EverythingPSC, thread );
      formula = cb_assertion_editor.cb_extract_formula_from_string( formula_string, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    if( !formula.isCons() )
    {
      return NIL;
    }
    final SubLObject v_kif = kif.meld_to_kif( formula );
    if( NIL == v_kif )
    {
      return cb_utilities.cb_error( $str47$Unable_to_translate_the_given_for, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject title_var = $str48$KIF_Translation;
    final SubLObject _prev_bind_3 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str1$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str2$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$17 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw3$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw4$CB_CYC );
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
        final SubLObject _prev_bind_0_$18 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str7$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str8$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str9$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str10$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str11$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$20, thread );
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
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_4 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_5 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              cb_utilities.cb_back_button( UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str49$CycL_formula__ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              cb_utilities.cb_form( formula, NIL, T );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str50$KIF_translation__ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              cb_utilities.cb_form( v_kif, NIL, T );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_5, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_4, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$19, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$18, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$17, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_3, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-kif.lisp", position = 4110L)
  public static SubLObject cb_assertion_kif_formula(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject assertion_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list52 );
    assertion_id = args.first();
    final SubLObject current = args.rest();
    if( NIL == current )
    {
      final SubLObject assertion = cb_utilities.cb_guess_assertion( assertion_id );
      if( NIL == assertion_handles.assertion_p( assertion ) )
      {
        return cb_utilities.cb_error( $str53$Could_not_determine_an_assertion_, assertion_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      final SubLObject title_var = $str54$Assertion_KIF_Spec;
      final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_utilities.html_markup( $str1$__DOCTYPE_html_PUBLIC_____W3C__DT );
        if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( $str2$_meta_http_equiv__X_UA_Compatible );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$22 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
        try
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw3$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
          html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          cb_parameters.cb_head_shortcut_icon();
          html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
          cyc_file_dependencies.css( $kw4$CB_CYC );
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
          final SubLObject _prev_bind_0_$23 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
            html_utilities.html_markup( $str7$yui_skin_sam );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str8$reloadFrameButton );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str9$button );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str10$reload );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_princ( $str11$Refresh_Frames );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                {
                  html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$25, thread );
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
              html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding( thread );
              final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
              final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_macros.$within_html_form$.bind( T, thread );
                html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                cb_utilities.cb_back_button( UNPROVIDED, UNPROVIDED );
                final SubLObject el_formula = uncanonicalizer.assertion_el_formula( assertion );
                final SubLObject mt = assertions_high.assertion_mt( assertion );
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str20$Mt___ );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                cb_utilities.cb_form( mt, UNPROVIDED, UNPROVIDED );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str55$EL_Formula___ );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_newline( UNPROVIDED );
                cb_utilities.cb_form_assertion_formula( assertion, el_formula, ZERO_INTEGER, T, UNPROVIDED );
                final SubLObject kif_formula = kif.assertion_kif_formula( assertion );
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str56$KIF_spec___ );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_newline( UNPROVIDED );
                cb_show_assertion_kif_formula( kif_formula );
                html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
              }
              finally
              {
                html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
                html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$26, thread );
              }
              html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_copyright_notice();
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$24, thread );
            }
            html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$23, thread );
          }
          html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
        }
        finally
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$22, thread );
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
      cdestructuring_bind.cdestructuring_bind_error( args, $list52 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-kif.lisp", position = 5109L)
  public static SubLObject cb_link_assertion_kif_formula(final SubLObject assertion, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str58$_KIF_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw37$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str59$cb_assertion_kif_formula__a, assertion_handles.assertion_id( assertion ) );
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
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-kif.lisp", position = 5418L)
  public static SubLObject cb_show_assertion_kif_formula(final SubLObject kif_formula)
  {
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = kif_formula;
    SubLObject bad = NIL;
    SubLObject current_$27 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, kif_formula, $list62 );
      current_$27 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, kif_formula, $list62 );
      if( NIL == conses_high.member( current_$27, $list63, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$27 == $kw64$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( kif_formula, $list62 );
    }
    final SubLObject direction_tail = cdestructuring_bind.property_list_member( $kw65$DIRECTION, kif_formula );
    final SubLObject direction = ( NIL != direction_tail ) ? conses_high.cadr( direction_tail ) : NIL;
    final SubLObject monotonicity_tail = cdestructuring_bind.property_list_member( $kw66$MONOTONICITY, kif_formula );
    final SubLObject monotonicity = ( NIL != monotonicity_tail ) ? conses_high.cadr( monotonicity_tail ) : NIL;
    final SubLObject creator_tail = cdestructuring_bind.property_list_member( $kw67$CREATOR, kif_formula );
    final SubLObject creator = ( NIL != creator_tail ) ? conses_high.cadr( creator_tail ) : NIL;
    final SubLObject creation_date_tail = cdestructuring_bind.property_list_member( $kw68$CREATION_DATE, kif_formula );
    final SubLObject creation_date = ( NIL != creation_date_tail ) ? conses_high.cadr( creation_date_tail ) : NIL;
    final SubLObject microtheory_tail = cdestructuring_bind.property_list_member( $kw69$MICROTHEORY, kif_formula );
    final SubLObject microtheory = ( NIL != microtheory_tail ) ? conses_high.cadr( microtheory_tail ) : NIL;
    final SubLObject kif_tail = cdestructuring_bind.property_list_member( $kw70$KIF, kif_formula );
    final SubLObject v_kif = ( NIL != kif_tail ) ? conses_high.cadr( kif_tail ) : NIL;
    html_utilities.html_princ( $str71$_ );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_indent( TWO_INTEGER );
    html_utilities.html_prin1( $kw65$DIRECTION );
    html_utilities.html_indent( UNPROVIDED );
    html_utilities.html_prin1( direction );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_indent( TWO_INTEGER );
    html_utilities.html_prin1( $kw66$MONOTONICITY );
    html_utilities.html_indent( UNPROVIDED );
    html_utilities.html_prin1( monotonicity );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_indent( TWO_INTEGER );
    html_utilities.html_prin1( $kw67$CREATOR );
    html_utilities.html_indent( UNPROVIDED );
    html_utilities.html_prin1( creator );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_indent( TWO_INTEGER );
    html_utilities.html_prin1( $kw68$CREATION_DATE );
    html_utilities.html_indent( UNPROVIDED );
    html_utilities.html_prin1( creation_date );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_indent( TWO_INTEGER );
    html_utilities.html_prin1( $kw69$MICROTHEORY );
    html_utilities.html_indent( UNPROVIDED );
    html_utilities.html_prin1( microtheory );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_indent( TWO_INTEGER );
    html_utilities.html_prin1( $kw70$KIF );
    html_utilities.html_indent( UNPROVIDED );
    cb_utilities.cb_form( v_kif, ONE_INTEGER, T );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_princ( $str72$_ );
    return NIL;
  }

  public static SubLObject declare_html_kif_file()
  {
    SubLFiles.declareFunction( me, "cb_kif_utilities", "CB-KIF-UTILITIES", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_kif_utilities", "CB-LINK-KIF-UTILITIES", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_handle_mt_to_kif_file", "CB-HANDLE-MT-TO-KIF-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_meld_to_kif", "CB-HANDLE-MELD-TO-KIF", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_kif_formula", "CB-ASSERTION-KIF-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_assertion_kif_formula", "CB-LINK-ASSERTION-KIF-FORMULA", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_show_assertion_kif_formula", "CB-SHOW-ASSERTION-KIF-FORMULA", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_html_kif_file()
  {
    return NIL;
  }

  public static SubLObject setup_html_kif_file()
  {
    html_macros.note_cgi_handler_function( $sym34$CB_KIF_UTILITIES, $kw35$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw38$KIF_UTILITIES, $sym39$CB_LINK_KIF_UTILITIES, ONE_INTEGER );
    cb_utilities.declare_deprecated_cb_tool( $kw38$KIF_UTILITIES, $str36$KIF_Utilities, $str40$KIF, $str0$KIF_Translation_Utilities );
    html_macros.note_cgi_handler_function( $sym44$CB_HANDLE_MT_TO_KIF_FILE, $kw35$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym51$CB_HANDLE_MELD_TO_KIF, $kw35$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym57$CB_ASSERTION_KIF_FORMULA, $kw35$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw60$ASSERTION_KIF_FORMULA, $sym61$CB_LINK_ASSERTION_KIF_FORMULA, TWO_INTEGER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_html_kif_file();
  }

  @Override
  public void initializeVariables()
  {
    init_html_kif_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_html_kif_file();
  }
  static
  {
    me = new html_kif();
    $str0$KIF_Translation_Utilities = makeString( "KIF Translation Utilities" );
    $str1$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str2$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw3$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw4$CB_CYC = makeKeyword( "CB-CYC" );
    $kw5$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw6$SHA1 = makeKeyword( "SHA1" );
    $str7$yui_skin_sam = makeString( "yui-skin-sam" );
    $str8$reloadFrameButton = makeString( "reloadFrameButton" );
    $str9$button = makeString( "button" );
    $str10$reload = makeString( "reload" );
    $str11$Refresh_Frames = makeString( "Refresh Frames" );
    $str12$post = makeString( "post" );
    $str13$cb_handle_mt_to_kif_file = makeString( "cb-handle-mt-to-kif-file" );
    $str14$cb_kif_utilities = makeString( "cb-kif-utilities" );
    $str15$Save_the_contents_of_a_microtheor = makeString( "Save the contents of a microtheory to a file of KIF assertion-specs :" );
    $kw16$RIGHT = makeKeyword( "RIGHT" );
    $str17$mt = makeString( "mt" );
    $str18$Complete = makeString( "Complete" );
    $const19$Microtheory = constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) );
    $str20$Mt___ = makeString( "Mt : " );
    $str21$Filename___ = makeString( "Filename : " );
    $str22$filename = makeString( "filename" );
    $kw23$SELF = makeKeyword( "SELF" );
    $str24$Cancel = makeString( "Cancel" );
    $str25$Clear = makeString( "Clear" );
    $str26$Save_as_KIF = makeString( "Save as KIF" );
    $str27$cb_handle_meld_to_kif = makeString( "cb-handle-meld-to-kif" );
    $str28$Enter_a_CycL_formula_to_convert_t = makeString( "Enter a CycL formula to convert to KIF :" );
    $str29$Formula__ = makeString( "Formula :" );
    $str30$formula = makeString( "formula" );
    $str31$Cyclify = makeString( "Cyclify" );
    $str32$Convert_to_KIF = makeString( "Convert to KIF" );
    $int33$80 = makeInteger( 80 );
    $sym34$CB_KIF_UTILITIES = makeSymbol( "CB-KIF-UTILITIES" );
    $kw35$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str36$KIF_Utilities = makeString( "KIF Utilities" );
    $kw37$MAIN = makeKeyword( "MAIN" );
    $kw38$KIF_UTILITIES = makeKeyword( "KIF-UTILITIES" );
    $sym39$CB_LINK_KIF_UTILITIES = makeSymbol( "CB-LINK-KIF-UTILITIES" );
    $str40$KIF = makeString( "KIF" );
    $str41$_S_did_not_specify_a_term = makeString( "~S did not specify a term" );
    $str42$_A_is_not_a_microtheory = makeString( "~A is not a microtheory" );
    $str43$Microtheory_being_saved_in_KIF = makeString( "Microtheory being saved in KIF" );
    $sym44$CB_HANDLE_MT_TO_KIF_FILE = makeSymbol( "CB-HANDLE-MT-TO-KIF-FILE" );
    $sym45$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const46$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $str47$Unable_to_translate_the_given_for = makeString( "Unable to translate the given formula to KIF." );
    $str48$KIF_Translation = makeString( "KIF Translation" );
    $str49$CycL_formula__ = makeString( "CycL formula :" );
    $str50$KIF_translation__ = makeString( "KIF translation :" );
    $sym51$CB_HANDLE_MELD_TO_KIF = makeSymbol( "CB-HANDLE-MELD-TO-KIF" );
    $list52 = ConsesLow.list( makeSymbol( "ASSERTION-ID" ) );
    $str53$Could_not_determine_an_assertion_ = makeString( "Could not determine an assertion from ~a" );
    $str54$Assertion_KIF_Spec = makeString( "Assertion KIF Spec" );
    $str55$EL_Formula___ = makeString( "EL Formula : " );
    $str56$KIF_spec___ = makeString( "KIF spec : " );
    $sym57$CB_ASSERTION_KIF_FORMULA = makeSymbol( "CB-ASSERTION-KIF-FORMULA" );
    $str58$_KIF_ = makeString( "[KIF]" );
    $str59$cb_assertion_kif_formula__a = makeString( "cb-assertion-kif-formula&~a" );
    $kw60$ASSERTION_KIF_FORMULA = makeKeyword( "ASSERTION-KIF-FORMULA" );
    $sym61$CB_LINK_ASSERTION_KIF_FORMULA = makeSymbol( "CB-LINK-ASSERTION-KIF-FORMULA" );
    $list62 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "DIRECTION" ), makeSymbol( "MONOTONICITY" ), makeSymbol( "CREATOR" ), makeSymbol( "CREATION-DATE" ), makeSymbol( "MICROTHEORY" ), makeSymbol( "KIF" ) );
    $list63 = ConsesLow.list( makeKeyword( "DIRECTION" ), makeKeyword( "MONOTONICITY" ), makeKeyword( "CREATOR" ), makeKeyword( "CREATION-DATE" ), makeKeyword( "MICROTHEORY" ), makeKeyword( "KIF" ) );
    $kw64$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw65$DIRECTION = makeKeyword( "DIRECTION" );
    $kw66$MONOTONICITY = makeKeyword( "MONOTONICITY" );
    $kw67$CREATOR = makeKeyword( "CREATOR" );
    $kw68$CREATION_DATE = makeKeyword( "CREATION-DATE" );
    $kw69$MICROTHEORY = makeKeyword( "MICROTHEORY" );
    $kw70$KIF = makeKeyword( "KIF" );
    $str71$_ = makeString( "(" );
    $str72$_ = makeString( ")" );
  }
}
/*
 * 
 * Total time: 455 ms
 * 
 */