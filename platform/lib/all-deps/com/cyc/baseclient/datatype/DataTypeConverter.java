/* $Id: DataTypeConverter.java 150536 2014-04-15 20:54:59Z nwinant $
 *
 * Copyright (c) 2010 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */
package com.cyc.baseclient.datatype;

//// Internal Imports
//// External Imports
import java.math.BigDecimal;
import java.util.Map;
import com.cyc.baseclient.cycobject.CycArrayList;
import com.cyc.baseclient.cycobject.CycNaut;
import com.cyc.base.cycobject.CycObject;
import com.cyc.baseclient.util.ParseException;

/** 
 * <P>DataTypeConverter is an abstract base class for building classes which
 * convert Java datatypes to their corresponding CycL representations and vice 
 * versa.
 *
 * <P>Copyright (c) 2010 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * Created on : May 21, 2010, 4:01:30 PM
 * Author     : nwinant
 * @version $Id: DataTypeConverter.java 150536 2014-04-15 20:54:59Z nwinant $
 */
abstract public class DataTypeConverter<E> {
  
  protected E handleParseException(ParseException ex, final boolean shouldReportFailure) {
    if (shouldReportFailure) {
      ex.printStackTrace();
    }
    return null;
  }

  //// Constructors
  //// Public Area
  /** Try to parse <code>cycList</code> into a Java <code>E</code>.
   *
   * If the parse fails, prints a stack trace iff <code>shouldReportFailure</code>
   * is non-null, and returns null.
   * @deprecated Use CycObject version.
   */
  protected E parse(final CycArrayList cycList, final boolean shouldReportFailure) {
    final Object naut = CycNaut.convertIfPromising(cycList);
    if (naut instanceof CycNaut) {
      return parse((CycNaut) naut, shouldReportFailure);
    } else if (shouldReportFailure) {
      new IllegalArgumentException(cycList + " cannot be interpreted as a NAUT").printStackTrace();
    }
    return null;
  }

  /** Try to parse <code>cycList</code> into a Java <code>E</code>.
   *
   * If the parse fails, prints a stack trace iff <code>shouldReportFailure</code>
   * is non-null, and returns null.
   */
  protected E parse(final CycObject cycObject, final boolean shouldReportFailure) {
    try {
      return fromCycTerm(cycObject);
    } catch (ParseException ex) {
      return handleParseException(ex, shouldReportFailure);
    }
  }

  /** Try to parse <code>cycList</code> into a Java <code>E</code>.
   *
   * Prints stack trace and returns null if the parse fails.
   * @deprecated Use CycObject version.
   */
  protected E parse(final CycArrayList cycList) {
    return parse(cycList, true);
  }

  /** Try to parse <code>naut</code> into a Java <code>E</code>.
   *
   * Prints stack trace and returns null if the parse fails.
   */
  protected E parse(final CycObject cycObject) {
    return parse(cycObject, true);
  }

  protected boolean isOfType(final Object object) {
    if (object instanceof CycArrayList) {
      return parse((CycArrayList) object, false) != null;
    } else if (object instanceof CycObject) {
      return parse((CycObject) object, false) != null;
    } else {
      return false;
    }
  }

  /**
   * Convert Java object of type <code>E</code> to <code>naut</code>.
   *
   * Throws a ParseException if the parse fails.
   */
  protected abstract CycObject toCycTerm(final E obj) throws ParseException;

  //// Protected Area
  /** Try to parse <code>naut</code> into a Java <code>E</code>. This method
   * should typically be accessed via the <code>parse()</code> methods.
   *
   * Throws a ParseException if the parse fails.
   */
  protected abstract E fromCycTerm(final CycObject cycObject) throws ParseException;

  protected static Integer parseInteger(final Object obj, final String type) throws ParseException {
    final Integer result;
    try {
      result = Integer.valueOf(obj.toString());
    } catch (NumberFormatException nfe) {
      throw new ParseException(obj + " is not a valid " + type + ".");
    }
    return result;
  }

  protected static BigDecimal parseBigDecimal(final Object obj, final String type) throws ParseException {
    final BigDecimal result;
    try {
      result = new BigDecimal(obj.toString());
    } catch (NumberFormatException nfe) {
      throw new ParseException(obj + " is not a valid " + type + ".");
    }
    return result;
  }

  protected static Float parseFloat(final Object obj, final String type) throws ParseException {
    final Float floatValue;
    try {
      floatValue = Float.valueOf(obj.toString());
    } catch (NumberFormatException nfe) {
      throw new ParseException(obj + " is not a valid " + type + ".");
    }
    return floatValue;
  }

  static protected void throwParseException(final Object obj, final String detail) throws ParseException {
    throw new ParseException("Can't parse " + obj + ": " + detail);
  }

  static protected void throwParseException(final Object obj) throws ParseException {
    throw new ParseException("Can't parse " + obj);
  }

  protected static <K, V> K lookupKeyByValue(Map<K, V> map, V value) {
    for (final Map.Entry<K, V> entry : map.entrySet()) {
      if (value.equals(entry.getValue())) {
        return entry.getKey();
      }
    }
    return null;
  }
  //// Private Area
  //// Internal Rep
  //// Main
}
