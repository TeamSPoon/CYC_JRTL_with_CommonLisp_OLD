/*
 * ResultSet.java
 *
 * Created on August 10, 2004, 2:04 PM
 */

package com.cyc.baseclient.util.query;

import java.util.Date;
import java.util.Iterator;

/**
 * @version $Id: QueryResultSet.java 150536 2014-04-15 20:54:59Z nwinant $
 * @author  mreimers
 */
public interface QueryResultSet {
  public Iterator<QueryResult> getResultSetIterator();
  public Query getQuery();
  public Date getTimeStamp();
  public void addQueryResult(QueryResult queryResult);
  public Justification getJustificationForIndex(int i);
  
}
