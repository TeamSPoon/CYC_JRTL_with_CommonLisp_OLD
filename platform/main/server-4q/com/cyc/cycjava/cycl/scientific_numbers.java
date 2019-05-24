package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class scientific_numbers
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.scientific_numbers";
  public static final String myFingerPrint = "24980c8d1c5b1089222eea5eb275a7c31978bb1770959165b93feec573d9e6e1";
  private static final SubLSymbol $sym0$CYC_SCIENTIFIC_NUMBER_P;
  private static final SubLObject $const1$ScientificNumberFn;
  private static final SubLSymbol $sym2$INTEGERP;
  private static final SubLSymbol $sym3$POSITIVE_INTEGER_P;
  private static final SubLSymbol $sym4$SCIENTIFIC_NUMBER_P;
  private static final SubLSymbol $sym5$CYC_SCIENTIFIC_NUMBER_FROM_STRING;
  private static final SubLSymbol $sym6$ALPHA_CHAR_P;
  private static final SubLString $str7$0;
  private static final SubLString $str8$_;
  private static final SubLSymbol $sym9$NON_ZERO_DIGIT_CHAR_P;
  private static final SubLString $str10$e;
  private static final SubLSymbol $sym11$CYC_SCIENTIFIC_NUMBER_TO_STRING;
  private static final SubLString $str12$;
  private static final SubLString $str13$_;
  private static final SubLSymbol $sym14$CYC_SCIENTIFIC_NUMBER_FROM_SUBL_REAL;
  private static final SubLSymbol $kw15$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym16$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $sym17$_EXIT;
  private static final SubLSymbol $sym18$CYC_SCIENTIFIC_NUMBER_TO_SUBL_REAL;
  private static final SubLInteger $int19$_8;
  private static final SubLString $str20$Magnitude_of_exponent_of__S_is_to;
  private static final SubLFloat $float21$10_0;
  private static final SubLSymbol $sym22$CYC_SCIENTIFIC_NUMBER_SIGNIFICANT_DIGIT_COUNT;

  @SubLTranslatedFile.SubL(source = "cycl/scientific-numbers.lisp", position = 450L)
  public static SubLObject cyc_scientific_number_p(final SubLObject v_object)
  {
    return scientific_number_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/scientific-numbers.lisp", position = 616L)
  public static SubLObject scientific_number_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_utilities.el_formula_with_operator_p( v_object, $const1$ScientificNumberFn ) && NIL != el_utilities.el_binary_formula_p( v_object ) && cycl_utilities.el_formula_arg1( v_object,
        UNPROVIDED ).isInteger() && cycl_utilities.el_formula_arg2( v_object, UNPROVIDED ).isInteger() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/scientific-numbers.lisp", position = 949L)
  public static SubLObject new_scientific_number(final SubLObject significand, final SubLObject exponent)
  {
    assert NIL != Types.integerp( significand ) : significand;
    assert NIL != Types.integerp( exponent ) : exponent;
    return ConsesLow.list( $const1$ScientificNumberFn, significand, exponent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/scientific-numbers.lisp", position = 1138L)
  public static SubLObject new_scientific_number_from_integer(final SubLObject v_int, SubLObject sig_digits)
  {
    if( sig_digits == UNPROVIDED )
    {
      sig_digits = NIL;
    }
    assert NIL != Types.integerp( v_int ) : v_int;
    if( v_int.isZero() )
    {
      return new_scientific_number( ZERO_INTEGER, ZERO_INTEGER );
    }
    SubLObject significand = NIL;
    SubLObject exponent = NIL;
    if( NIL != sig_digits )
    {
      assert NIL != subl_promotions.positive_integer_p( sig_digits ) : sig_digits;
      final SubLObject new_int = number_utilities.significant_digits( v_int, sig_digits );
      final SubLObject int_length = number_utilities.decimal_integer_length( new_int );
      final SubLObject difference = Numbers.subtract( sig_digits, int_length );
      significand = ( difference.numGE( ZERO_INTEGER ) ? Numbers.multiply( new_int, Numbers.expt( TEN_INTEGER, difference ) ) : Numbers.integerDivide( new_int, Numbers.expt( TEN_INTEGER, Numbers.abs( difference ) ) ) );
      exponent = Numbers.subtract( int_length, ONE_INTEGER );
    }
    else
    {
      significand = v_int;
      exponent = Numbers.subtract( number_utilities.decimal_integer_length( v_int ), ONE_INTEGER );
    }
    return new_scientific_number( significand, exponent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/scientific-numbers.lisp", position = 2022L)
  public static SubLObject scientific_number_significand(final SubLObject sci_num)
  {
    assert NIL != scientific_number_p( sci_num ) : sci_num;
    return cycl_utilities.el_formula_arg1( sci_num, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/scientific-numbers.lisp", position = 2159L)
  public static SubLObject scientific_number_exponent(final SubLObject sci_num)
  {
    assert NIL != scientific_number_p( sci_num ) : sci_num;
    return cycl_utilities.el_formula_arg2( sci_num, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/scientific-numbers.lisp", position = 2293L)
  public static SubLObject copy_scientific_number(final SubLObject sci_num)
  {
    assert NIL != scientific_number_p( sci_num ) : sci_num;
    final SubLObject significand = scientific_number_significand( sci_num );
    final SubLObject exponent = scientific_number_exponent( sci_num );
    return new_scientific_number( significand, exponent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/scientific-numbers.lisp", position = 2565L)
  public static SubLObject scientific_number_zero_p(final SubLObject sci_num)
  {
    assert NIL != scientific_number_p( sci_num ) : sci_num;
    return Numbers.numE( ZERO_INTEGER, scientific_number_significand( sci_num ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/scientific-numbers.lisp", position = 2717L)
  public static SubLObject scientific_number_integer_p(final SubLObject sci_num)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != scientific_number_p( sci_num ) : sci_num;
    SubLObject significand = scientific_number_significand( sci_num );
    thread.resetMultipleValues();
    SubLObject quotient = Numbers.truncate( significand, TEN_INTEGER );
    SubLObject remainder = thread.secondMultipleValue();
    thread.resetMultipleValues();
    while ( quotient.numG( ZERO_INTEGER ) && ZERO_INTEGER.eql( remainder ))
    {
      significand = quotient;
      thread.resetMultipleValues();
      final SubLObject quotient_$1 = Numbers.truncate( significand, TEN_INTEGER );
      final SubLObject remainder_$2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      quotient = quotient_$1;
      remainder = remainder_$2;
    }
    return Numbers.numGE( number_utilities.f_1X( scientific_number_exponent( sci_num ) ), number_utilities.decimal_integer_length( significand ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/scientific-numbers.lisp", position = 3243L)
  public static SubLObject scientific_number_minus_p(final SubLObject sci_num)
  {
    assert NIL != scientific_number_p( sci_num ) : sci_num;
    return Numbers.minusp( scientific_number_significand( sci_num ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/scientific-numbers.lisp", position = 3399L)
  public static SubLObject scientific_number_plus_p(final SubLObject sci_num)
  {
    assert NIL != scientific_number_p( sci_num ) : sci_num;
    return Numbers.plusp( scientific_number_significand( sci_num ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/scientific-numbers.lisp", position = 3553L)
  public static SubLObject scientific_number_non_negative_p(final SubLObject sci_num)
  {
    return makeBoolean( NIL == scientific_number_minus_p( sci_num ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/scientific-numbers.lisp", position = 3667L)
  public static SubLObject scientific_number_add_significant_zeros(final SubLObject sci_num, final SubLObject zeros)
  {
    assert NIL != scientific_number_p( sci_num ) : sci_num;
    assert NIL != subl_promotions.positive_integer_p( zeros ) : zeros;
    final SubLObject significand = scientific_number_significand( sci_num );
    final SubLObject exponent = scientific_number_exponent( sci_num );
    final SubLObject new_significand = Numbers.multiply( significand, Numbers.expt( TEN_INTEGER, zeros ) );
    return new_scientific_number( new_significand, exponent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/scientific-numbers.lisp", position = 4052L)
  public static SubLObject cyc_scientific_number_from_string(final SubLObject string)
  {
    return scientific_number_from_string( string, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/scientific-numbers.lisp", position = 4501L)
  public static SubLObject scientific_number_from_string(final SubLObject string, SubLObject sig_digits)
  {
    if( sig_digits == UNPROVIDED )
    {
      sig_digits = NIL;
    }
    if( NIL == number_utilities.extended_number_string_p( string ) )
    {
      relation_evaluation.throw_unevaluatable();
    }
    SubLObject significand = NIL;
    SubLObject exponent = NIL;
    final SubLObject exponent_marker = Sequences.find_if( $sym6$ALPHA_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject exponent_string = ( NIL != exponent_marker ) ? string_utilities.string_after( string, exponent_marker ) : $str7$0;
    SubLObject significand_string = ( NIL != exponent_marker ) ? string_utilities.string_upto( string, exponent_marker ) : string_utilities.copy_string( string );
    SubLObject negativeP = NIL;
    if( Characters.CHAR_hyphen.eql( Sequences.elt( significand_string, ZERO_INTEGER ) ) )
    {
      negativeP = T;
      significand_string = string_utilities.substring( significand_string, ONE_INTEGER, UNPROVIDED );
    }
    else if( Characters.CHAR_plus.eql( Sequences.elt( significand_string, ZERO_INTEGER ) ) )
    {
      significand_string = string_utilities.substring( significand_string, ONE_INTEGER, UNPROVIDED );
    }
    if( Characters.CHAR_period.eql( Sequences.elt( significand_string, ZERO_INTEGER ) ) )
    {
      significand_string = Sequences.cconcatenate( $str7$0, significand_string );
    }
    SubLObject decimal_position = string_utilities.char_position( Characters.CHAR_period, significand_string, UNPROVIDED );
    if( NIL != decimal_position )
    {
      significand_string = Sequences.remove( Characters.CHAR_period, significand_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      decimal_position = Sequences.length( significand_string );
    }
    final SubLObject first_significant_digit = first_non_zero_digit_position( significand_string );
    if( NIL != negativeP && NIL != first_significant_digit )
    {
      significand_string = Sequences.cconcatenate( $str8$_, significand_string );
    }
    if( NIL != first_significant_digit )
    {
      significand = string_utilities.string_to_integer( significand_string );
      exponent = Numbers.add( string_utilities.string_to_integer( exponent_string ), Numbers.subtract( decimal_position, first_significant_digit, ONE_INTEGER ) );
    }
    else
    {
      significand = ZERO_INTEGER;
    }
    if( significand.numE( ZERO_INTEGER ) )
    {
      exponent = ZERO_INTEGER;
    }
    final SubLObject new_sci_num = new_scientific_number( significand, exponent );
    if( NIL == sig_digits )
    {
      return new_sci_num;
    }
    final SubLObject new_sig_digits = cyc_scientific_number_significant_digit_count( new_sci_num );
    if( new_sig_digits.numG( sig_digits ) )
    {
      return number_utilities.significant_digits( new_sci_num, sig_digits );
    }
    if( new_sig_digits.numL( sig_digits ) )
    {
      return scientific_number_add_significant_zeros( new_sci_num, Numbers.subtract( sig_digits, new_sig_digits ) );
    }
    return new_sci_num;
  }

  @SubLTranslatedFile.SubL(source = "cycl/scientific-numbers.lisp", position = 6911L)
  public static SubLObject first_non_zero_digit_position(final SubLObject string)
  {
    return Sequences.position_if( $sym9$NON_ZERO_DIGIT_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/scientific-numbers.lisp", position = 7020L)
  public static SubLObject non_zero_digit_char_p(final SubLObject v_char)
  {
    return makeBoolean( NIL != Characters.digit_char_p( v_char, UNPROVIDED ) && !v_char.eql( Characters.CHAR_0 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/scientific-numbers.lisp", position = 7129L)
  public static SubLObject cyc_scientific_number_to_string(final SubLObject inputs)
  {
    SubLObject scientific_number = NIL;
    SubLObject exponent_marker = $str10$e;
    if( Sequences.length( inputs ).numE( ONE_INTEGER ) )
    {
      scientific_number = inputs.first();
    }
    else
    {
      scientific_number = inputs.first();
      exponent_marker = conses_high.second( inputs );
    }
    if( NIL == cyc_scientific_number_p( scientific_number ) || !exponent_marker.isString() )
    {
      relation_evaluation.throw_unevaluatable();
    }
    return scientific_number_to_string( scientific_number, exponent_marker );
  }

  @SubLTranslatedFile.SubL(source = "cycl/scientific-numbers.lisp", position = 8024L)
  public static SubLObject scientific_number_to_string(final SubLObject scientific_number, SubLObject exponent_marker)
  {
    if( exponent_marker == UNPROVIDED )
    {
      exponent_marker = $str10$e;
    }
    final SubLObject significand = scientific_number_significand( scientific_number );
    if( significand.isZero() )
    {
      return $str7$0;
    }
    SubLObject significand_string = string_utilities.str( significand );
    final SubLObject exponent = scientific_number_exponent( scientific_number );
    final SubLObject exponent_string = string_utilities.str( exponent );
    SubLObject sign = NIL;
    if( Characters.CHAR_hyphen.eql( Sequences.elt( significand_string, ZERO_INTEGER ) ) )
    {
      sign = $str8$_;
      significand_string = string_utilities.substring( significand_string, ONE_INTEGER, UNPROVIDED );
    }
    else
    {
      sign = $str12$;
    }
    if( Sequences.length( significand_string ).numG( ONE_INTEGER ) )
    {
      significand_string = Sequences.cconcatenate( string_utilities.substring( significand_string, ZERO_INTEGER, ONE_INTEGER ), new SubLObject[] { $str13$_, string_utilities.substring( significand_string, ONE_INTEGER,
          UNPROVIDED )
      } );
    }
    return Sequences.cconcatenate( sign, new SubLObject[] { significand_string, exponent_marker, exponent_string
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/scientific-numbers.lisp", position = 8803L)
  public static SubLObject cyc_scientific_number_from_subl_real(final SubLObject number)
  {
    return scientific_number_from_subl_real( number, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/scientific-numbers.lisp", position = 9052L)
  public static SubLObject scientific_number_from_subl_real(final SubLObject number, SubLObject sig_digits)
  {
    if( sig_digits == UNPROVIDED )
    {
      sig_digits = NIL;
    }
    return scientific_number_from_string( string_utilities.str( number ), sig_digits );
  }

  @SubLTranslatedFile.SubL(source = "cycl/scientific-numbers.lisp", position = 9199L)
  public static SubLObject cyc_scientific_number_to_subl_real(final SubLObject scientific_number)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw15$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym16$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          return scientific_number_to_subl_real( scientific_number );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw15$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    relation_evaluation.throw_unevaluatable();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/scientific-numbers.lisp", position = 9486L)
  public static SubLObject scientific_number_to_subl_real(final SubLObject scientific_number)
  {
    if( NIL != scientific_number_zero_p( scientific_number ) )
    {
      return ZERO_INTEGER;
    }
    final SubLObject sig = scientific_number_significand( scientific_number );
    final SubLObject exp = scientific_number_exponent( scientific_number );
    if( exp.numG( SIXTEEN_INTEGER ) || exp.numL( $int19$_8 ) )
    {
      Errors.error( $str20$Magnitude_of_exponent_of__S_is_to, scientific_number );
    }
    final SubLObject real_sig = Numbers.multiply( $float21$10_0, sig, Numbers.expt( TEN_INTEGER, Numbers.minus( number_utilities.decimal_integer_length( sig ) ) ) );
    return number_utilities.significant_digits( Numbers.multiply( real_sig, Numbers.expt( TEN_INTEGER, exp ) ), scientific_number_significant_digit_count( scientific_number ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/scientific-numbers.lisp", position = 10216L)
  public static SubLObject scientific_number_to_integer_or_fraction(final SubLObject scientific_number, SubLObject reduce_fractionsP)
  {
    if( reduce_fractionsP == UNPROVIDED )
    {
      reduce_fractionsP = NIL;
    }
    if( NIL != scientific_number_zero_p( scientific_number ) )
    {
      return ZERO_INTEGER;
    }
    if( NIL != scientific_number_integer_p( scientific_number ) )
    {
      final SubLObject real = scientific_number_to_subl_real( scientific_number );
      final SubLObject ans = real.isInteger() ? real : Numbers.truncate( real, UNPROVIDED );
      return ans;
    }
    final SubLObject num = scientific_number_significand( scientific_number );
    final SubLObject exp = number_utilities.f_1_( Numbers.subtract( number_utilities.decimal_integer_length( scientific_number_significand( scientific_number ) ), scientific_number_exponent( scientific_number ) ) );
    final SubLObject den = scientific_number_to_integer_or_fraction( new_scientific_number( ONE_INTEGER, exp ), UNPROVIDED );
    final SubLObject fract = fraction_utilities.new_fraction( num, den );
    return ( NIL != reduce_fractionsP ) ? fraction_utilities.fraction_reduce( fract ) : fract;
  }

  @SubLTranslatedFile.SubL(source = "cycl/scientific-numbers.lisp", position = 11119L)
  public static SubLObject cyc_scientific_number_significant_digit_count(final SubLObject scientific_number)
  {
    return scientific_number_significant_digit_count( scientific_number );
  }

  @SubLTranslatedFile.SubL(source = "cycl/scientific-numbers.lisp", position = 11417L)
  public static SubLObject scientific_number_significant_digit_count(final SubLObject scientific_number)
  {
    final SubLObject significand = scientific_number_significand( scientific_number );
    return number_utilities.decimal_integer_length( significand );
  }

  @SubLTranslatedFile.SubL(source = "cycl/scientific-numbers.lisp", position = 11621L)
  public static SubLObject scientific_number_decimal_places(final SubLObject scientific_number)
  {
    return Numbers.max( ZERO_INTEGER, Numbers.subtract( scientific_number_significant_digit_count( scientific_number ), ONE_INTEGER, scientific_number_exponent( scientific_number ) ) );
  }

  public static SubLObject declare_scientific_numbers_file()
  {
    SubLFiles.declareFunction( me, "cyc_scientific_number_p", "CYC-SCIENTIFIC-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "scientific_number_p", "SCIENTIFIC-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_scientific_number", "NEW-SCIENTIFIC-NUMBER", 2, 0, false );
    SubLFiles.declareFunction( me, "new_scientific_number_from_integer", "NEW-SCIENTIFIC-NUMBER-FROM-INTEGER", 1, 1, false );
    SubLFiles.declareFunction( me, "scientific_number_significand", "SCIENTIFIC-NUMBER-SIGNIFICAND", 1, 0, false );
    SubLFiles.declareFunction( me, "scientific_number_exponent", "SCIENTIFIC-NUMBER-EXPONENT", 1, 0, false );
    SubLFiles.declareFunction( me, "copy_scientific_number", "COPY-SCIENTIFIC-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "scientific_number_zero_p", "SCIENTIFIC-NUMBER-ZERO-P", 1, 0, false );
    SubLFiles.declareFunction( me, "scientific_number_integer_p", "SCIENTIFIC-NUMBER-INTEGER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "scientific_number_minus_p", "SCIENTIFIC-NUMBER-MINUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "scientific_number_plus_p", "SCIENTIFIC-NUMBER-PLUS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "scientific_number_non_negative_p", "SCIENTIFIC-NUMBER-NON-NEGATIVE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "scientific_number_add_significant_zeros", "SCIENTIFIC-NUMBER-ADD-SIGNIFICANT-ZEROS", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_scientific_number_from_string", "CYC-SCIENTIFIC-NUMBER-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "scientific_number_from_string", "SCIENTIFIC-NUMBER-FROM-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "first_non_zero_digit_position", "FIRST-NON-ZERO-DIGIT-POSITION", 1, 0, false );
    SubLFiles.declareFunction( me, "non_zero_digit_char_p", "NON-ZERO-DIGIT-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_scientific_number_to_string", "CYC-SCIENTIFIC-NUMBER-TO-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "scientific_number_to_string", "SCIENTIFIC-NUMBER-TO-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "cyc_scientific_number_from_subl_real", "CYC-SCIENTIFIC-NUMBER-FROM-SUBL-REAL", 1, 0, false );
    SubLFiles.declareFunction( me, "scientific_number_from_subl_real", "SCIENTIFIC-NUMBER-FROM-SUBL-REAL", 1, 1, false );
    SubLFiles.declareFunction( me, "cyc_scientific_number_to_subl_real", "CYC-SCIENTIFIC-NUMBER-TO-SUBL-REAL", 1, 0, false );
    SubLFiles.declareFunction( me, "scientific_number_to_subl_real", "SCIENTIFIC-NUMBER-TO-SUBL-REAL", 1, 0, false );
    SubLFiles.declareFunction( me, "scientific_number_to_integer_or_fraction", "SCIENTIFIC-NUMBER-TO-INTEGER-OR-FRACTION", 1, 1, false );
    SubLFiles.declareFunction( me, "cyc_scientific_number_significant_digit_count", "CYC-SCIENTIFIC-NUMBER-SIGNIFICANT-DIGIT-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "scientific_number_significant_digit_count", "SCIENTIFIC-NUMBER-SIGNIFICANT-DIGIT-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "scientific_number_decimal_places", "SCIENTIFIC-NUMBER-DECIMAL-PLACES", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_scientific_numbers_file()
  {
    return NIL;
  }

  public static SubLObject setup_scientific_numbers_file()
  {
    utilities_macros.register_kb_function( $sym0$CYC_SCIENTIFIC_NUMBER_P );
    utilities_macros.register_kb_function( $sym5$CYC_SCIENTIFIC_NUMBER_FROM_STRING );
    utilities_macros.register_kb_function( $sym11$CYC_SCIENTIFIC_NUMBER_TO_STRING );
    utilities_macros.register_kb_function( $sym14$CYC_SCIENTIFIC_NUMBER_FROM_SUBL_REAL );
    utilities_macros.register_kb_function( $sym18$CYC_SCIENTIFIC_NUMBER_TO_SUBL_REAL );
    utilities_macros.register_kb_function( $sym22$CYC_SCIENTIFIC_NUMBER_SIGNIFICANT_DIGIT_COUNT );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_scientific_numbers_file();
  }

  @Override
  public void initializeVariables()
  {
    init_scientific_numbers_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_scientific_numbers_file();
  }
  static
  {
    me = new scientific_numbers();
    $sym0$CYC_SCIENTIFIC_NUMBER_P = makeSymbol( "CYC-SCIENTIFIC-NUMBER-P" );
    $const1$ScientificNumberFn = constant_handles.reader_make_constant_shell( makeString( "ScientificNumberFn" ) );
    $sym2$INTEGERP = makeSymbol( "INTEGERP" );
    $sym3$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $sym4$SCIENTIFIC_NUMBER_P = makeSymbol( "SCIENTIFIC-NUMBER-P" );
    $sym5$CYC_SCIENTIFIC_NUMBER_FROM_STRING = makeSymbol( "CYC-SCIENTIFIC-NUMBER-FROM-STRING" );
    $sym6$ALPHA_CHAR_P = makeSymbol( "ALPHA-CHAR-P" );
    $str7$0 = makeString( "0" );
    $str8$_ = makeString( "-" );
    $sym9$NON_ZERO_DIGIT_CHAR_P = makeSymbol( "NON-ZERO-DIGIT-CHAR-P" );
    $str10$e = makeString( "e" );
    $sym11$CYC_SCIENTIFIC_NUMBER_TO_STRING = makeSymbol( "CYC-SCIENTIFIC-NUMBER-TO-STRING" );
    $str12$ = makeString( "" );
    $str13$_ = makeString( "." );
    $sym14$CYC_SCIENTIFIC_NUMBER_FROM_SUBL_REAL = makeSymbol( "CYC-SCIENTIFIC-NUMBER-FROM-SUBL-REAL" );
    $kw15$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym16$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $sym17$_EXIT = makeSymbol( "%EXIT" );
    $sym18$CYC_SCIENTIFIC_NUMBER_TO_SUBL_REAL = makeSymbol( "CYC-SCIENTIFIC-NUMBER-TO-SUBL-REAL" );
    $int19$_8 = makeInteger( -8 );
    $str20$Magnitude_of_exponent_of__S_is_to = makeString( "Magnitude of exponent of ~S is too great to convert to a SubL real number." );
    $float21$10_0 = makeDouble( 10.0 );
    $sym22$CYC_SCIENTIFIC_NUMBER_SIGNIFICANT_DIGIT_COUNT = makeSymbol( "CYC-SCIENTIFIC-NUMBER-SIGNIFICANT-DIGIT-COUNT" );
  }
}
/*
 * 
 * Total time: 192 ms
 * 
 */