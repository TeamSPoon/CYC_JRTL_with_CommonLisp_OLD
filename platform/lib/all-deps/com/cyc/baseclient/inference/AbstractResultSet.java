package com.cyc.baseclient.inference;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

//// OpenCyc Imports
import com.cyc.base.CycApiException;
import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.base.cycobject.DenotationalTerm;
import com.cyc.baseclient.cycobject.CycFort;
import com.cyc.baseclient.cycobject.CycArrayList;
import com.cyc.baseclient.cycobject.CycNart;
import com.cyc.baseclient.cycobject.CycNaut;
import com.cyc.base.cycobject.CycObject;
import com.cyc.base.inference.InferenceResultSet;
import com.cyc.baseclient.cycobject.CycSymbol;
import com.cyc.baseclient.datatype.DateConverter;

/**
 * <P>AbstractResultSet provides a class for easy access and manipulation
 * of inference results. It tries to closely mimic the java.sql.ResultSet class.
 * Example:
 *
 * <code><pre>
 *  System.out.println("Starting");
 *  CycAccess access = null;
 *  try {
 *    access = new CycAccess("localhost", 3660);
 *    ELMt inferencePSC = access.makeELMt("#$InferencePSC");
 *    String query = "(#$isa ?X #$Dog)";
 *    InferenceWorkerSynch worker = new DefaultInferenceWorkerSynch(query,
 *      inferencePSC, null, access, 500000);
 *    AbstractResultSet rs = worker.executeQuery();
 *    try {
 *      int indexOfX = rs.findColumn("?X");
 *      while (rs.next()) {
 *        CycObject curDog = rs.getCycObject(indexOfX);
 *        System.out.println("Got dog: " + curDog.cyclify());
 *      }
 *    } finally {
 *      rs.close();
 *    }
 *  } catch (Exception e) {
 *    e.printStackTrace();
 *  } finally {
 *    if (access != null) {
 *      access.close();
 *    }
 *  }
 *  System.out.println("Finished");
 *  System.out.flush();
 * </pre></code>
 *
 * @author tbrussea
 * @date Mar 22, 2010, 11:55 AM
 * @version $Id: AbstractResultSet.java 150771 2014-04-25 22:35:15Z nwinant $
 */
public abstract class AbstractResultSet implements ResultSet, InferenceResultSet {

  //// Public Area
  /**
   * Releases this <code>AbstractResultSet</code> object's server side resources.
   * Failure to close a result set may leave significant
   * resources hanging around the server until the client object is closed.
   * <P>
   * Calling the method <code>close</code> on a <code>AbstractResultSet</code>
   * object that is already closed is a no-op.
   */
  @Override
  public synchronized void close() {
    if (isClosed) {
      return;
    }
    isClosed = true;
  }

  /**
   * Retrieves whether this <code>AbstractResultSet</code> object has been closed.
   * A <code>AbstractResultSet</code> is closed if the method close has been
   * called on it.
   *
   * @return true if this <code>AbstractResultSet</code> object is closed;
   *         false if it is still open
   */
  @Override
  public boolean isClosed() {
    return isClosed;
  }

  /**
   * Retrieves whether the cursor is before the first row in
   * this <code>AbstractResultSet</code> object.
   *
   * @return <code>true</code> if the cursor is before the first row;
   * <code>false</code> if the cursor is at any other position or the
   * result set contains no rows
   */
  @Override
  public boolean isBeforeFirst() {
    ensureOpen("isBeforeFirst");
    return (cursor == -1);
  }

  /**
   * Retrieves whether the cursor is after the last row in
   * this <code>AbstractResultSet</code> object.
   * <p/>
   * <strong>Note:</strong> Calling the method <code>isLast</code> may be expensive
   * because if the inference is asynchronous, it first needs to wait until the inference
   * is complete.
   *
   * @return <code>true</code> if the cursor is after the last row;
   * <code>false</code> if the cursor is at any other position or the
   * result set contains no rows
   */
  @Override
  public boolean isAfterLast() {
    ensureOpen("isAfterLast");
    waitTillProcessingDone();
    return (cursor == getCurrentRowCount());
  }

  /**
   * Retrieves whether the cursor is on the first row of
   * this <code>AbstractResultSet</code> object.
   *
   * @return <code>true</code> if the cursor is on the first row;
   * <code>false</code> otherwise
   */
  @Override
  public boolean isFirst() {
    ensureOpen("isFirst");
    return (cursor == 0);
  }

  /**
   * Retrieves whether the cursor is on the last row of
   * this <code>AbstractResultSet</code> object.
   * <p/>
   * <strong>Note:</strong> Calling the method <code>isLast</code> may be expensive
   * because if the inference is asynchronous, it first needs to wait until the inference
   * is complete.
   *
   * @return <code>true</code> if the cursor is on the last row;
   * <code>false</code> otherwise
   */
  @Override
  public boolean isLast() {
    ensureOpen("isLast");
    waitTillProcessingDone();
    return (cursor == (getCurrentRowCount() - 1));
  }

  /**
   * Moves the cursor to the front of
   * this <code>AbstractResultSet</code> object, just before the
   * first row. This method has no effect if the result set contains no rows.
   *
   */
  @Override
  public void beforeFirst() {
    ensureOpen("beforeFirst");
    cursor = -1;
    curRow = null;
  }

  /**
   * Moves the cursor to the end of
   * this <code>AbstractResultSet</code> object, just after the
   * last row. This method has no effect if the result set contains no rows.
   * <p/>
   * <strong>Note:</strong> Calling the method <code>isLast</code> may be expensive
   * because if the inference is asynchronous, it first needs to wait until the inference
   * is complete.
   *
   */
  @Override
  public void afterLast() {
    ensureOpen("afterLast");
    waitTillProcessingDone();
    cursor = getCurrentRowCount();
    curRow = null;
  }

  /**
   * Retrieves the current row number.  The first row is number 1, the
   * second number 2, and so on.
   * @return the current row number; <code>0</code> if there is no current row
   */
  @Override
  public int getRow() {
    ensureOpen("getRow");
    //return cursor;
    return (cursor < 0) ? 0 : cursor + 1;
  }

  /**
   * Moves the cursor to just before the given row number in this
   * <code>AbstractResultSet</code> object.
   *
   * <p/>If the row number is positive, the cursor moves to
   * the given row number with respect to the beginning of the result set.
   * The first row is row 1, the second is row 2, and so on.
   *
   * <p/>If the given row number is negative, the cursor moves to
   * an absolute row position with respect to
   * the end of the result set.  For example, calling the method
   * <code>absolute(-1)</code> positions the
   * cursor on the last row; calling the method <code>absolute(-2)</code>
   * moves the cursor to the next-to-last row, and so on.
   *
   * <p/>An attempt to position the cursor beyond the first/last row in
   * the result set leaves the cursor before the first row or after
   * the last row.
   *
   * <p/><B>Note:</B> Calling <code>absolute(1)</code> is the same
   * as calling <code>first()</code>. Calling <code>absolute(-1)</code>
   * is the same as calling <code>last()</code>.
   *
   * @param row the number of the row to which the cursor should move.
   *        A positive number indicates the row number counting from the
   *        beginning of the result set; a negative number indicates the
   *        row number counting from the end of the result set
   * @return <code>true</code> if the cursor is moved to a position in this
   * <code>AbstractResultSet</code> object; <code>false</code> if the cursor
   * is before the first row or after the
   * last row
   */
  @Override
  public boolean absolute(int row) {
    ensureOpen("absolute");
    if ((row < 1) || (row > rs.size())) {
      waitTillProcessingDone();
      if (row < 0) {
        row = rs.size() + row + 1;
      }
    }
    if (row < 0) {
      row = 0;
    }
    if (row > rs.size()) {
      row = rs.size() + 1;
      cursor = rs.size();
      curRow = null;
      return false;
    }
    cursor = row - 1;
    curRow = rs.get(cursor);
    return true;
  }

  /**
   * Moves the cursor a relative number of rows, either positive or negative.
   * Attempting to move beyond the first/last row in the
   * result set positions the cursor before/after the
   * the first/last row. Calling <code>relative(0)</code> is valid, but does
   * not change the cursor position.
   *
   * <p>Note: Calling the method <code>relative(1)</code>
   * is identical to calling the method <code>next()</code> and
   * calling the method <code>relative(-1)</code> is identical
   * to calling the method <code>previous()</code>.
   *
   * <P/>
   *  <strong>Note:</strong> Calling the method <code>relative</code> may be expensive
   * because if the inference is asynchronous, it first needs to wait until the inference
   * is complete.
   *
   * @param row
   * @return <code>true</code> if the cursor is on a row;
   *         <code>false</code> otherwise
   */
  @Override
  public boolean relative(int row) {
    ensureOpen("relative");
    return absolute(getRow() + row);
  }

  /**
   * Moves the cursor to the first row in
   * this <code>AbstractResultSet</code> object.
   *
   * @return <code>true</code> if the cursor is on a valid row;
   * <code>false</code> if there are no rows in the result set
   */
  @Override
  public boolean first() {
    ensureOpen("first");
    return absolute(1);
  }

  /**
   * Moves the cursor to the last row in
   * this <code>AbstractResultSet</code> object.
   *
   * <P/>
   *  <strong>Note:</strong> Calling the method <code>last</code> may be expensive
   * because if the inference is asynchronous, it first needs to wait until the inference
   * is complete.
   *
   * @return <code>true</code> if the cursor is on a valid row;
   * <code>false</code> if there are no rows in the result set
   */
  @Override
  public boolean last() {
    ensureOpen("last");
    waitTillProcessingDone();
    return absolute(getCurrentRowCount() - 1);
  }

  /**
   * Moves the cursor to the previous row in this
   * <code>AbstractResultSet</code> object.
   *<p>
   * When a call to the <code>previous</code> method returns <code>false</code>,
   * the cursor is positioned before the first row.  Any invocation of a
   * <code>AbstractResultSet</code> method which requires a current row will result in a
   * <code>SQLException</code> being thrown.
   *<p>
   * If an input stream is open for the current row, a call to the method
   * <code>previous</code> will implicitly close it.  A <code>AbstractResultSet</code>
   *  object's warning change is cleared when a new row is read.
   *<p>
   *
   * @return <code>true</code> if the cursor is now positioned on a valid row;
   * <code>false</code> if the cursor is positioned before the first row
   * @since 1.2
   */
  @Override
  public boolean previous() {
    ensureOpen("previous");
    return relative(-1);
  }

  /**
   * Moves the cursor forward one row from its current position.
   * A <code>AbstractResultSet</code> cursor is initially positioned
   * before the first row; the first call to the method
   * <code>next</code> makes the first row the current row; the
   * second call makes the second row the current row, and so on.
   *
   * @return <code>true</code> if the new current row is valid;
   * <code>false</code> if there are no more rows
   */
  @Override
  public boolean next() {
    ensureOpen("next");
    return relative(1);
  }

  /**
   * Returns, as an <code>Object</code>, the value at the current row and at the 
   * column identified by <code>col</code>. Returns </code>null<code> 
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)<code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as an <code>Object</code>, at the current row and 
   * at the column identified by the <code>col</code>. Returns </code>null<code>,
   * if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   */
  @Override
  public Object getObject(String col)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException {
    return getObject(findColumnStrict(col));
  }

  /**
   * Returns, as an <code>Object</code>, the value at the current row and at the 
   * column identified by <code>colIndex</code>. Returns </code>null<code> 
   * if no value is set for the current row and given column.

   * @param colIndex the column index of interest (one-based)
   * @return the value, as an <code>Object</code>, at the current row and 
   * at the column identified by <code>colIndex</code>. Returns 
   * </code>null<code>, if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>colIndex</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   */
  @Override
  public Object getObject(int colIndex)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException {
    ensureOpen("getObject");
    if ((colIndex <= 0) || (colIndex > getMaxColumns())) {
      throw new IllegalArgumentException("Invalid column index: " + colIndex);
    }
    return curRow.get(colIndex - 1);
  }

  /**
   * Returns, as a <code>DenotationalTerm</code>, the value at the current row and at the
   * column identified by <code>col</code>. Returns </code>null<code> 
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)<code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as a <code>DenotationalTerm</code>, at the current row and
   * at the column identified by the <code>col</code>. Returns </code>null<code>,
   * if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>DenotationalTerm</code>
   */
  @Override
  public DenotationalTerm getDenotationalTerm(String col)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    return getDenotationalTerm(findColumnStrict(col));
  }

  /**
   * Returns, as a <code>DenotationalTerm</code>, the value at the current row and at the
   * column identified by <code>colIndex</code>. Returns </code>null<code> 
   * if no value is set for the current row and given column.

   * @param colIndex the column index of interest (one-based)
   * @return the value, as a <code>DenotationalTerm</code>, at the current row and
   * at the column identified by <code>colIndex</code>. Returns 
   * </code>null<code>, if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>colIndex</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>DenotationalTerm</code>
   */
  @Override
  public DenotationalTerm getDenotationalTerm(int colIndex)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    ensureOpen("getDenotationalTerm");

    return (DenotationalTerm) getObject(colIndex);
  }

  /**
   * Returns, as a <code>String</code>, the value at the current row and at the
   * column identified by <code>col</code>. Returns </code>null<code>
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)<code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as a <code>String</code>, at the current row and
   * at the column identified by the <code>col</code>. Returns </code>null<code>,
   * if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>String</code>
   */
  @Override
  public String getString(String col)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    return getString(findColumnStrict(col));
  }

  /**
   * Returns, as a <code>String</code>, the value at the current row and at the
   * column identified by <code>colIndex</code>. Returns </code>null<code>
   * if no value is set for the current row and given column.

   * @param colIndex the column index of interest (one-based)
   * @return the value, as a <code>String</code>, at the current row and
   * at the column identified by <code>colIndex</code>. Returns
   * </code>null<code>, if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>colIndex</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>String</code>
   */
  @Override
  public String getString(int colIndex)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    ensureOpen("getString");
    return (String) getObject(colIndex);
  }

  /**
   * Returns, as a <code>long</code>, the value at the current row and at the
   * column identified by <code>col</code>. Returns </code>null<code>
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)<code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as a <code>long</code>, at the current row and
   * at the column identified by the <code>col</code>. Returns </code>null<code>,
   * if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>long</code>
   */
  @Override
  public long getLong(String col)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    return getLong(findColumnStrict(col));
  }

  /**
   * Returns, as a <code>long</code>, the value at the current row and at the
   * column identified by <code>colIndex</code>. Returns </code>null<code>
   * if no value is set for the current row and given column.

   * @param colIndex the column index of interest (one-based)
   * @return the value, as a <code>long</code>, at the current row and
   * at the column identified by <code>colIndex</code>. Returns
   * </code>null<code>, if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>colIndex</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>long</code>
   */
  @Override
  public long getLong(int colIndex)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    ensureOpen("getLong");
    return ((Number) getObject(colIndex)).longValue();
  }

  /**
   * Returns, as a <code>int</code>, the value at the current row and at the
   * column identified by <code>col</code>. Returns </code>null<code>
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)<code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as a <code>int</code>, at the current row and
   * at the column identified by the <code>col</code>y. Returns </code>null<code>,
   * if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>int</code>
   */
  @Override
  public int getInt(String col)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    return getInt(findColumnStrict(col));
  }

  /**
   * Returns, as a <code>int</code>, the value at the current row and at the
   * column identified by <code>colIndex</code>. Returns </code>null<code>
   * if no value is set for the current row and given column.

   * @param colIndex the column index of interest (one-based)
   * @return the value, as a <code>int</code>, at the current row and
   * at the column identified by <code>colIndex</code>. Returns
   * </code>null<code>, if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>colIndex</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>int</code>
   */
  @Override
  public int getInt(int colIndex)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    ensureOpen("getInt");
    return ((Number) getObject(colIndex)).intValue();
  }

  /**
   * Returns, as a <code>double</code>, the value at the current row and at the
   * column identified by <code>col</code>. Returns </code>null<code>
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)<code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as a <code>double</code>, at the current row and
   * at the column identified by the <code>col</code>. Returns </code>null<code>,
   * if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>double</code>
   */
  @Override
  public double getDouble(String col)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    return getDouble(findColumnStrict(col));
  }

  /**
   * Returns, as a <code>double</code>, the value at the current row and at the
   * column identified by <code>colIndex</code>. Returns </code>null<code>
   * if no value is set for the current row and given column.

   * @param colIndex the column index of interest (one-based)
   * @return the value, as a <code>double</code>, at the current row and
   * at the column identified by <code>colIndex</code>. Returns
   * </code>null<code>, if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>colIndex</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>double</code>
   */
  @Override
  public double getDouble(int colIndex)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    ensureOpen("getDouble");
    return ((Number) getObject(colIndex)).doubleValue();
  }

  /**
   * Returns, as a <code>float</code>, the value at the current row and at the
   * column identified by <code>col</code>. Returns </code>null<code>
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)<code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as a <code>float</code>, at the current row and
   * at the column identified by the <code>col</code>. Returns </code>null<code>,
   * if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>float</code>
   */
  @Override
  public float getFloat(String col)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    return getFloat(findColumnStrict(col));
  }

  /**
   * Returns, as a <code>float</code>, the value at the current row and at the
   * column identified by <code>colIndex</code>. Returns </code>null<code>
   * if no value is set for the current row and given column.

   * @param colIndex the column index of interest (one-based)
   * @return the value, as a <code>float</code>, at the current row and
   * at the column identified by <code>colIndex</code>. Returns
   * </code>null<code>, if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>colIndex</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>float</code>
   */
  @Override
  public float getFloat(int colIndex)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    ensureOpen("getFloat");
    return ((Number) getObject(colIndex)).floatValue();
  }

  /**
   * Returns, as a <code>boolean</code>, the value at the current row and at the
   * column identified by <code>col</code>. Returns </code>null<code>
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)<code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as a <code>boolean</code>, at the current row and
   * at the column identified by the <code>col</code>. Returns </code>null<code>,
   * if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>boolean</code>
   */
  @Override
  public boolean getBoolean(String col)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    return getBoolean(findColumnStrict(col));
  }

  /**
   * Returns, as a <code>boolean</code>, the value at the current row and at the
   * column identified by <code>colIndex</code>. Returns </code>null<code>
   * if no value is set for the current row and given column.

   * @param colIndex the column index of interest (one-based)
   * @return the value, as a <code>boolean</code>, at the current row and
   * at the column identified by <code>colIndex</code>. Returns
   * </code>null<code>, if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>colIndex</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>boolean</code>
   */
  @Override
  public boolean getBoolean(int colIndex)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    ensureOpen("getBoolean");
    Object val = getObject(colIndex);
    if (!(val instanceof CycSymbol)) {
      return false;
    }
    return !((CycSymbol) val).getSymbolName().equalsIgnoreCase("nil");
  }

  /**
   * Returns, as a <code>CycConstant</code>, the value at the current row and at the
   * column identified by <code>col</code>. Returns </code>null<code>
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)<code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as a <code>CycConstant</code>, at the current row and
   * at the column identified by the <code>col</code>. Returns </code>null<code>,
   * if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>CycConstant</code>
   */
  @Override
  public CycConstant getConstant(String col)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    return getConstant(findColumnStrict(col));
  }

  /**
   * Returns, as a <code>CycConstant</code>, the value at the current row and at the
   * column identified by <code>colIndex</code>. Returns </code>null<code>
   * if no value is set for the current row and given column.

   * @param colIndex the column index of interest (one-based)
   * @return the value, as a <code>CycConstant</code>, at the current row and
   * at the column identified by <code>colIndex</code>. Returns
   * </code>null<code>, if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>colIndex</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>CycConstant</code>
   */
  @Override
  public CycConstant getConstant(int colIndex)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    ensureOpen("getConstant");
    return (CycConstant) getObject(colIndex);
  }

  /**
   * Returns, as a <code>CycObject</code>, the value at the current row and at the
   * column identified by <code>col</code>. Returns </code>null<code>
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)<code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as a <code>CycObject</code>, at the current row and
   * at the column identified by the <code>col</code>. Returns </code>null<code>,
   * if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>CycObject</code>
   */
  @Override
  public CycObject getCycObject(String col)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    return getCycObject(findColumnStrict(col));
  }

  /**
   * Returns, as a <code>CycObject</code>, the value at the current row and at the
   * column identified by <code>colIndex</code>. Returns </code>null<code>
   * if no value is set for the current row and given column. Note: literal
   * strings and numbers are not CycObjects and can possibly be returned by
   * some inferences. Only call this method if you are sure that literals
   * are not a valid return result for the given <code>colIndex</code> or
   * a ClassCastException will be thrown when a literal is encountered.
   * @param colIndex the column index of interest (one-based)
   * @return the value, as a <code>CycObject</code>, at the current row and
   * at the column identified by <code>colIndex</code>. Returns
   * </code>null<code>, if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>colIndex</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>CycObject</code>
   */
  @Override
  public CycObject getCycObject(int colIndex)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    ensureOpen("getCycObject");
    return (CycObject) getObject(colIndex);
  }

  /**
   * Returns, as a <code>CycFort</code>, the value at the current row and at the
   * column identified by <code>col</code>. Returns </code>null<code>
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)<code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as a <code>CycFort</code>, at the current row and
   * at the column identified by the <code>col</code>. Returns </code>null<code>,
   * if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>CycFort</code>
   */
  @Override
  public CycFort getFort(String col)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    return getFort(findColumnStrict(col));
  }

  /**
   * Returns, as a <code>CycFort</code>, the value at the current row and at the
   * column identified by <code>colIndex</code>. Returns </code>null<code>
   * if no value is set for the current row and given column.

   * @param colIndex the column index of interest (one-based)
   * @return the value, as a <code>CycFort</code>, at the current row and
   * at the column identified by <code>colIndex</code>. Returns
   * </code>null<code>, if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>colIndex</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>CycFort</code>
   */
  @Override
  public CycFort getFort(int colIndex)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    ensureOpen("getFort");
    return (CycFort) getObject(colIndex);
  }

  /**
   * Returns, as a <code>CycArrayList</code>, the value at the current row and at the
   * column identified by <code>col</code>. Returns </code>null<code>
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)<code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as a <code>CycArrayList</code>, at the current row and
   * at the column identified by the <code>col</code>. Returns </code>null<code>,
   * if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>CycArrayList</code>
   */
  @Override
  public CycArrayList<Object> getList(String col)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    return getList(findColumnStrict(col));
  }

  /**
   * Returns, as a <code>CycArrayList</code>, the value at the current row and at the
   * column identified by <code>colIndex</code>. Returns </code>null<code>
   * if no value is set for the current row and given column.

   * @param colIndex the column index of interest (one-based)
   * @return the value, as a <code>CycArrayList</code>, at the current row and
   * at the column identified by <code>colIndex</code>. Returns
   * </code>null<code>, if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>colIndex</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>CycArrayList</code>
   */
  @SuppressWarnings("unchecked")
  @Override
  public CycArrayList<Object> getList(int colIndex)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    ensureOpen("getList");
    return (CycArrayList<Object>) getObject(colIndex);
  }

  /**
   * Returns, as a <code>CycNart</code>, the value at the current row and at the
   * column identified by <code>col</code>. Returns </code>null<code>
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)<code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as a <code>CycNart</code>, at the current row and
   * at the column identified by the <code>col</code>. Returns </code>null<code>,
   * if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>CycNart</code>
   */
  @Override
  public CycNart getNart(String col)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    return getNart(findColumnStrict(col));
  }

  /**
   * Returns, as a <code>CycNart</code>, the value at the current row and at the
   * column identified by <code>colIndex</code>. Returns </code>null<code>
   * if no value is set for the current row and given column.

   * @param colIndex the column index of interest (one-based)
   * @return the value, as a <code>CycNart</code>, at the current row and
   * at the column identified by <code>colIndex</code>. Returns
   * </code>null<code>, if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>colIndex</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>CycNart</code>
   */
  @Override
  public CycNart getNart(int colIndex)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    ensureOpen("getNart");
    return (CycNart) getObject(colIndex);
  }

  /**
   * Returns, as a <code>CycNaut</code>, the value at the current row and at the
   * column identified by <code>col</code>. Returns </code>null<code>
   * if no value is set for the current row and given column.
   *
   * <p/><strong>Note:</strong> Use the method <code>int colIindex = findColumn(col)<code> once
   * and the version of this method that takes an integer for maximum performance.
   *
   * @param col the name of the variable that represents the column of interest
   * @return the value, as a <code>CycNaut</code>, at the current row and
   * at the column identified by the <code>col</code>. Returns </code>null<code>,
   * if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>CycNaut</code>
   */
  @Override
  public CycNaut getNaut(String col)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    return getNaut(findColumnStrict(col));
  }

  /**
   * Returns, as a <code>CycNaut</code>, the value at the current row and at the
   * column identified by <code>colIndex</code>. Returns </code>null<code>
   * if no value is set for the current row and given column.

   * @param colIndex the column index of interest (one-based)
   * @return the value, as a <code>CycNaut</code>, at the current row and
   * at the column identified by <code>colIndex</code>. Returns
   * </code>null<code>, if no value is set for the current row and given column.
   * @throws IllegalArgumentException if <code>colIndex</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>CycNaut</code>
   */
  @Override
  public CycNaut getNaut(int colIndex)
          throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    ensureOpen("getCycNaut");
    return (CycNaut) getObject(colIndex);
  }
  
  /**
   * Returns, as a <code>java.sql.Date</code> object, the value at the current row and at the
   * column identified by <code>col</code> which should be a
   * <code>CycVariable</code> in the original query. Returns </code>null<code>
   * if no value is set for the current row and given column.
   *
   * @param colIndex the column index of interest (one-based)
   * @return the value, as a <code>java.sql.Date</code>, at the current row and
   * at the column identified by the <code>col</code> which is a
   * <code>CycVariable</code> in the original query. Returns </code>null<code>,
   * if no value is set for the current row and given column.
   * @note Fails on dates that are not CycNauts using #$YearFn (i.e. it will not
   * work on skolemized dates, or other forms of dates that don't use the #$YearFn vocabulary).
   * @throws CycApiException if called on a closed result set
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>java.util.Date</code>
   */
  @Override
  public Date getDate(int colIndex)
      throws CycApiException, IllegalArgumentException, ArrayIndexOutOfBoundsException, ClassCastException {
    Object obj = getObject(colIndex);
    return new Date(DateConverter.parseCycDate(((CycNaut)CycNaut.convertIfPromising(obj))).getTime());
  }
  
    /**
   * Returns, as a <code>java.sql.Date</code> object, the value at the current row and at the
   * column identified by <code>col</code> which should be a
   * <code>CycVariable</code> in the original query. Returns </code>null<code>
   * if no value is set for the current row and given column.
   *
   * @param columnLabel the name of the variable that represents the column of interest
   * @return the value, as a <code>java.sql.Date</code>, at the current row and
   * at the column identified by the <code>col</code> which is a
   * <code>CycVariable</code> in the original query. Returns </code>null<code>,
   * if no value is set for the current row and given column.
   * @note Fails on dates that are not CycNauts using #$YearFn (i.e. it will not
   * work on skolemized dates, or other forms of dates that don't use the #$YearFn vocabulary).
   * @throws CycApiException if called on a closed result set
   * @throws IllegalArgumentException if <code>col</code> is not valid
   * @throws ArrayIndexOutOfBoundsException if the current cursor is not on a valid row
   * @throws ClassCastException if the value is not convertible to a
 <code>java.util.Date</code>
   */
  @Override
  public Date getDate(String columnLabel) throws SQLException {
    return getDate(findColumnStrict(columnLabel));
  }
  
  /**
   * Returns the column index for <code>col</code>.
   *
   * @param col the column name to look up
   * @return the column index for the given <code>col</code> name.
   * @throws IllegalArgumentException if called with an invalid <code>col</code>
   */
  @Override
  public int findColumn(String col) throws IllegalArgumentException {
    ensureOpen("findColumn");
    int colIndex = columnNames.indexOf(col);
    if (colIndex < 0) {
      throw new IllegalArgumentException("Unable to find column: " + col);
    }
    return colIndex + 1;
  }

  /**
   * Returns the maximum number of columns.
   *
   * @return the maximum number of columns.
   */
  @Override
  public int getMaxColumns() {
    waitTillProcessingDone();
    return columnNames.size();
  }

  /**
   * Returns a list (cloned) of column names that are available.
   *
   * @return a list (cloned) of column names that are available.
   */
  @Override
  public List<String> getColumnNames() {
    List<String> results = new ArrayList<String>(columnNames.size());
    results.addAll(columnNames);
    return results;
  }

  /**
   * Returns the number of rows currently in the result set.
   *
   * @return the number of rows currently in the result set
   */
  @Override
  public int getCurrentRowCount() {
    return rs.size();
  }

  /**
   * Returns a String representation for this object.
   *
   * @return a String representation for this object.
   */
  @Override
  public String toString() {
    if (hasTruthValue()) {
      return "" + getTruthValue();
    }
    StringBuffer buf = new StringBuffer("(");
    int count = 0;
    if (rs != null) {
      for (List<Object> row : rs) {
        if (count++ > 15) {
          buf.append("...");
          break;
        }
        if (count > 1) {
          buf.append(", ");
        }
        buf.append("[row:" + (count - 1) + " ");
        int col = 0;
        for (Object val : row) {
          if (col > 15) {
            buf.append("...");
            break;
          }
          if (col > 0) {
            buf.append(", ");
          }
          buf.append("{");
          buf.append(columnNames.get(col++));
          buf.append("->").append(val);
          buf.append("}");
        }
        buf.append("]");
      }
    }
    buf.append(")");
    return buf.toString();
  }

  /**
   * Returns whether the query is a simple truth query (no open variables).
   *
   * @return whether the query is a simple truth query (no open variables).
   */
  @Override
  public boolean hasTruthValue() {
    return (truthValue != null);
  }

  /**
   * Returns the truth value for this query.
   *
   * @return the truth value for this query
   * @throws RuntimeException if the query has open variables.
   */
  @Override
  public boolean getTruthValue() {
    if (!hasTruthValue()) {
      throw new RuntimeException("Attempt to get the truth value for a result set with non-truth value data.");
    }
    return truthValue;
  }

  @Override
  public boolean wasNull() throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public byte getByte(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public short getShort(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  @SuppressWarnings("deprecation")
  public BigDecimal getBigDecimal(int columnIndex, int scale) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public byte[] getBytes(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }


  @Override
  public Time getTime(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Timestamp getTimestamp(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public InputStream getAsciiStream(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  @SuppressWarnings("deprecation")
  public InputStream getUnicodeStream(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public InputStream getBinaryStream(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public byte getByte(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public short getShort(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  @SuppressWarnings("deprecation")
  public BigDecimal getBigDecimal(String columnLabel, int scale) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public byte[] getBytes(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Time getTime(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Timestamp getTimestamp(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public InputStream getAsciiStream(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  @SuppressWarnings("deprecation")
  public InputStream getUnicodeStream(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public InputStream getBinaryStream(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public SQLWarning getWarnings() throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void clearWarnings() throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public String getCursorName() throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public ResultSetMetaData getMetaData() throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Reader getCharacterStream(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Reader getCharacterStream(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public BigDecimal getBigDecimal(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public BigDecimal getBigDecimal(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void setFetchDirection(int direction) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public int getFetchDirection() throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void setFetchSize(int rows) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public int getFetchSize() throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public int getType() throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public int getConcurrency() throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public boolean rowUpdated() throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public boolean rowInserted() throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public boolean rowDeleted() throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateNull(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateBoolean(int columnIndex, boolean x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateByte(int columnIndex, byte x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateShort(int columnIndex, short x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateInt(int columnIndex, int x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateLong(int columnIndex, long x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateFloat(int columnIndex, float x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateDouble(int columnIndex, double x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateBigDecimal(int columnIndex, BigDecimal x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateString(int columnIndex, String x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateBytes(int columnIndex, byte[] x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateDate(int columnIndex, Date x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateTime(int columnIndex, Time x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateTimestamp(int columnIndex, Timestamp x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateAsciiStream(int columnIndex, InputStream x, int length) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateBinaryStream(int columnIndex, InputStream x, int length) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateCharacterStream(int columnIndex, Reader x, int length) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateObject(int columnIndex, Object x, int scaleOrLength) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateObject(int columnIndex, Object x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateNull(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateBoolean(String columnLabel, boolean x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateByte(String columnLabel, byte x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateShort(String columnLabel, short x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateInt(String columnLabel, int x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateLong(String columnLabel, long x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateFloat(String columnLabel, float x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateDouble(String columnLabel, double x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateBigDecimal(String columnLabel, BigDecimal x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateString(String columnLabel, String x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateBytes(String columnLabel, byte[] x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateDate(String columnLabel, Date x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateTime(String columnLabel, Time x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateTimestamp(String columnLabel, Timestamp x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateAsciiStream(String columnLabel, InputStream x, int length) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateBinaryStream(String columnLabel, InputStream x, int length) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateCharacterStream(String columnLabel, Reader reader, int length) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateObject(String columnLabel, Object x, int scaleOrLength) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateObject(String columnLabel, Object x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void insertRow() throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateRow() throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void deleteRow() throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void refreshRow() throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void cancelRowUpdates() throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void moveToInsertRow() throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void moveToCurrentRow() throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Statement getStatement() throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Object getObject(int columnIndex, Map<String, Class<?>> map) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Ref getRef(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Blob getBlob(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Clob getClob(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Array getArray(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Object getObject(String columnLabel, Map<String, Class<?>> map) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Ref getRef(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Blob getBlob(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Clob getClob(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Array getArray(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Date getDate(int columnIndex, Calendar cal) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Date getDate(String columnLabel, Calendar cal) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Time getTime(int columnIndex, Calendar cal) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Time getTime(String columnLabel, Calendar cal) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Timestamp getTimestamp(int columnIndex, Calendar cal) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Timestamp getTimestamp(String columnLabel, Calendar cal) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public URL getURL(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public URL getURL(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateRef(int columnIndex, Ref x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateRef(String columnLabel, Ref x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateBlob(int columnIndex, Blob x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateBlob(String columnLabel, Blob x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateClob(int columnIndex, Clob x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateClob(String columnLabel, Clob x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateArray(int columnIndex, Array x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateArray(String columnLabel, Array x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public RowId getRowId(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public RowId getRowId(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateRowId(int columnIndex, RowId x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateRowId(String columnLabel, RowId x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public int getHoldability() throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateNString(int columnIndex, String nString) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateNString(String columnLabel, String nString) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }
  
  @Override
  public void updateNClob(int columnIndex, NClob nClob) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateNClob(String columnLabel, NClob nClob) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public NClob getNClob(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public NClob getNClob(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public SQLXML getSQLXML(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public SQLXML getSQLXML(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateSQLXML(int columnIndex, SQLXML xmlObject) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateSQLXML(String columnLabel, SQLXML xmlObject) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public String getNString(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public String getNString(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Reader getNCharacterStream(int columnIndex) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public Reader getNCharacterStream(String columnLabel) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateNCharacterStream(int columnIndex, Reader x, long length) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateNCharacterStream(String columnLabel, Reader reader, long length) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateAsciiStream(int columnIndex, InputStream x, long length) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateBinaryStream(int columnIndex, InputStream x, long length) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateCharacterStream(int columnIndex, Reader x, long length) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateAsciiStream(String columnLabel, InputStream x, long length) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateBinaryStream(String columnLabel, InputStream x, long length) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateCharacterStream(String columnLabel, Reader reader, long length) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateBlob(int columnIndex, InputStream inputStream, long length) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateBlob(String columnLabel, InputStream inputStream, long length) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateClob(int columnIndex, Reader reader, long length) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateClob(String columnLabel, Reader reader, long length) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateNClob(int columnIndex, Reader reader, long length) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateNClob(String columnLabel, Reader reader, long length) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateNCharacterStream(int columnIndex, Reader x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateNCharacterStream(String columnLabel, Reader reader) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateAsciiStream(int columnIndex, InputStream x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateBinaryStream(int columnIndex, InputStream x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateCharacterStream(int columnIndex, Reader x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateAsciiStream(String columnLabel, InputStream x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateBinaryStream(String columnLabel, InputStream x) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateCharacterStream(String columnLabel, Reader reader) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateBlob(int columnIndex, InputStream inputStream) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateBlob(String columnLabel, InputStream inputStream) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateClob(int columnIndex, Reader reader) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateClob(String columnLabel, Reader reader) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateNClob(int columnIndex, Reader reader) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void updateNClob(String columnLabel, Reader reader) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public <T> T unwrap(Class<T> iface) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public boolean isWrapperFor(Class<?> iface) throws SQLException {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  //// Protected Area
  protected void waitTillProcessingDone() {
  }

  /**
   * Returns the column index for the given <code>col</code>. This version differs
   * from the non-strict version in that it throws detailed error messages.
   *
   * @param col the index name to look up
   * @return the one-based column index for the given <code>col</code
   * @throws IllegalArgumentException if called with an invalid <code>col</code>
   */
  protected int findColumnStrict(String col) throws IllegalArgumentException {
    if (col == null) {
      throw new IllegalArgumentException("Got null column name.");
    }
    int val = columnNames.indexOf(col);
    if (val < 0) {
      throw new IllegalArgumentException("Invalid column: " + col);
    }
    return val + 1;
  }

  /**
   * Creates a new row.
   *
   * @return Returns the new empty row.
   */
  protected List<Object> addEmptyRow() {
    List<Object> row = new ArrayList<Object>();
    rs.add(row);
    for (int i = 0, size = columnNames.size(); i < size; i++) {
      row.add(null);
    }
    return row;
  }

  //// Private Area
  /**
   * Throws an error if this <code>AbstractResultSet</code> object is not open.
   *
   * @param methodName the method name of the method calling this method so that
   * an appropriate error message can be generated from it.
   * @throws RuntimeException if this <code>AbstractResultSet</code> object is not open
   */
  protected void ensureOpen(String methodName) {
    if (isClosed) {
      throw new RuntimeException(methodName
              + "() called on a closed AbstractResultSet.");
    }
  }

  protected void setIsClosed(boolean newVal) {
    isClosed = newVal;
  }

  protected List<List<Object>> getRS() {
    return rs;
  }

  protected void setTruthValue(Boolean newVal) {
    truthValue = newVal;
  }

  /** Get the actual list of column names. Changes to returned list
   * therefore destructively modify the list of column names of this result set.
   * @return list of column names.
   */
  protected List<String> getColumnNamesUnsafe() {
    return columnNames;
  }
  //// Internal Rep
  /** Maximum time to wait in milliseconds when closing the inference worker. */
  private static final long MSECS_TO_WAIT_FOR_CLOSE = 10000;
  /** The rows accumulated so far in this result set. For synchronous queries
   * this will always be set to all the results.
   */
  private final List<List<Object>> rs = new ArrayList<List<Object>>(128);
  /** The possible column names for this query. It is currently based on
   * results retreived so far.
   */
  private final List<String> columnNames = new ArrayList<String>(8);
  /** The current row number (zero-based). */
  private int cursor = -1;
  /** The current row. Null if cursor is before the beginning or after the end of the result set. */
  private List<Object> curRow = null;
  /** Indicates whether this result set is closed. */
  private volatile boolean isClosed = false;
  /** If the query has no open variable, then this holds the truth value result
   * for the query. Will be null when the query has open variables.
   */
  private Boolean truthValue = null;
}
