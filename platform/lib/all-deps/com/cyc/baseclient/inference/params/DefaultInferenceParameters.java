package com.cyc.baseclient.inference.params;

//// External Imports
import com.cyc.base.CycAccess;
import com.cyc.base.CycConnectionException;
import com.cyc.base.cycobject.CycList;
import java.util.*;
import com.cyc.baseclient.CycObjectFactory;
import com.cyc.baseclient.cycobject.CycArrayList;
import com.cyc.base.cycobject.CycObject;
import com.cyc.base.cycobject.CycSymbolI;
import com.cyc.base.inference.InferenceParameterValue;
import com.cyc.base.inference.InferenceParameters;
import com.cyc.baseclient.CycClientManager;
import com.cyc.baseclient.cycobject.CycSymbol;
import com.cyc.baseclient.cycobject.DefaultCycObject;
import static com.cyc.baseclient.inference.params.InferenceParametersSymbols.*;

/**
 * <P>DefaultInferenceParameters is designed to...
 *
 * <P>Copyright (c) 2004 - 2006 Cycorp, Inc. All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author zelal
 * @date August 14, 2005, 2:46 PM
 * @version $Id: DefaultInferenceParameters.java 150938 2014-05-02 21:39:12Z nwinant $
 */
public class DefaultInferenceParameters extends SpecifiedInferenceParameters {

  //// Constructors
  /** Creates a new instance of DefaultInferenceParameters. */
  public DefaultInferenceParameters(CycAccess cycAccess) {
    this.cycAccess = cycAccess;
  }

  /** Creates a new instance of DefaultInferenceParameters. */
  public DefaultInferenceParameters(CycAccess cycAccess,
          boolean shouldReturnAnswersInHL) {
    this.cycAccess = cycAccess;
    try {
      if (!cycAccess.isOpenCyc()) {
        if (shouldReturnAnswersInHL) {
          getAnswersInHL();
        } else {
          getAnswersInEL();
        }
      }
    } catch (CycConnectionException ex) {
      throw new RuntimeException("Unable to reach Cyc image " + cycAccess, ex);
    }
  }

  public static DefaultInferenceParameters fromPlist(CycAccess cycAccess,
          List plist) {
    DefaultInferenceParameters combinedQueryInferenceParams = new DefaultInferenceParameters(
            cycAccess);
    for (final Iterator<Object> plistIterator = plist.iterator(); plistIterator.hasNext();) {
      CycSymbolI key = (CycSymbolI) plistIterator.next();
      Object value = plistIterator.next();
      combinedQueryInferenceParams.put(key, value);
    }
    return combinedQueryInferenceParams;
  }

  /**
   * Creates a new instance of DefaultInferenceParameters.
   *
   * @param cycAccess the CycAccess object that these parameters are connected to.
   * @param params specified parameters to be added to the object. This string should consist of a series of keywords
   * followed by the values for those keywords. The keywords can be found by looking for the #$sublIdentifier for the desired
   * inference parameter in the Cyc KB. For example, to limit a query to single-depth transformation and to allow at most
   * 5 seconds per query, use the string ":max-transformation-depth 1 :max-time 5".
   */
  public DefaultInferenceParameters(CycAccess cycAccess, String params) {
    this.cycAccess = cycAccess;
    if (params == null && params.isEmpty()) {
      return;
    }
    CycList paramList = null;
    try {
      paramList = getParams(cycAccess, params);
    } catch (Exception ex) {
      throw new RuntimeException(
              "Problem parsing '" + params + "' as inference parameter list.",
              ex);
    }
    Iterator<Object> paramIter = paramList.iterator();
    while (paramIter.hasNext()) {
      Object key = paramIter.next();
      Object value = paramIter.next();
      if (key instanceof CycSymbolI) {
        put((CycSymbolI) key, value);
      } else {
        throw new RuntimeException(
                "'" + key + "' is not a valid inference parameter name.");
      }
    }
  }
  private static Map<String, CycList> paramCache = new HashMap<String, CycList>();

  private static CycList getParams(CycAccess cyc, String params) throws CycConnectionException {
    if (paramCache.containsKey(params)) {
      return paramCache.get(params);
    } else {
      CycList paramList = cyc.converse().converseList("'(" + params + ")");
      paramCache.put(params, paramList);
      return paramList;
    }
  }

  public static DefaultInferenceParameters fromSpecifiedInferenceParameters(
          CycAccess cycAccess, SpecifiedInferenceParameters oldParameters) {
    return oldParameters.toDefaultInferenceParameters(cycAccess);
  }

  //// Public Area
  @Override
  public CycAccess getCycAccess() {
    return cycAccess;
  }

  public void getAnswersInHL() {
    put(ANSWER_LANGUAGE, HL);
  }

  public void getAnswersInEL() {
    put(ANSWER_LANGUAGE, EL);
  }

  @Override
  public InferenceParameters setMaxNumber(final Integer max) {
    put(MAX_NUMBER, max);
    return this;
  }

  @Override
  public InferenceParameters setMaxTransformationDepth(Integer max) {
    put(MAX_TRANSFORMATION_DEPTH, max);
    return this;
  }

  @Override
  public void setProblemStorePath(final String path) {
    final CycList problemStoreForm = CycArrayList.makeCycList(LOAD_PROBLEM_STORE,
            path);
    put(PROBLEM_STORE, problemStoreForm);
  }

  private boolean getBoolean(CycSymbolI paramName) {
    Object rawValue = get(paramName);
    if (rawValue instanceof Boolean) {
      return (Boolean) rawValue;
    } else {
      rawValue = getDefaultInferenceParameterDescriptions().getDefaultInferenceParameters().get(
              paramName);
      return (rawValue instanceof Boolean) ? (Boolean) rawValue : false;
    }
  }

  @Override
  public boolean getAbductionAllowed() {
    return getBoolean(ABDUCTION_ALLOWED);
  }

  public void setAllowIndeterminateResults(boolean b) {
    final CycSymbolI value = b ? CycObjectFactory.t : CycObjectFactory.nil;
    put(ALLOW_INDETERMINATE_RESULTS, value);
  }

  public void setConditionalSentence(boolean b) {
    final CycSymbolI value = b ? CycObjectFactory.t : CycObjectFactory.nil;
    put(CONDITIONAL_SENTENCE, value);
  }

  public boolean getConditionalSentence() {
    return getBoolean(CONDITIONAL_SENTENCE);
  }

  public void setIntermediateStepValidationLevel(CycSymbolI value) {
    put(INTERMEDIATE_STEP_VALIDATION_LEVEL, value);
  }

  public CycSymbolI getIntermediateStepValidationLevel() {
    Object rawValue = get(INTERMEDIATE_STEP_VALIDATION_LEVEL);
    if (rawValue instanceof CycSymbolI) {
      return (CycSymbolI) rawValue;
    } else {
      rawValue = getDefaultInferenceParameterDescriptions().getDefaultInferenceParameters().get(
              INTERMEDIATE_STEP_VALIDATION_LEVEL);
      return (rawValue instanceof CycSymbolI) ? (CycSymbolI) rawValue : CycObjectFactory.nil;
    }
  }

  @Override
  public Object put(CycSymbolI parameterName, Object value) {
    // @Hack if the value is :UNKNOWN the parameter will not be set and it is assumed that 
    // Cyc uses its own default for that particular parameter
    if (value instanceof CycSymbolI && ((CycSymbolI) value).toString().equals(
            ":UNKNOWN")) {
      return null;
    }
    if (":PROBLEM-STORE".equals(parameterName.toString())) {
      if (value instanceof CycArrayList || value instanceof CycSymbolI || value instanceof Integer) {
        return map.put(parameterName, value);
      } else if (CycObjectFactory.nil.equals(value)) {
        return map.put(parameterName, value);
      } else {
        throw new RuntimeException("Got invalid value " + value + " (" + value.getClass().getSimpleName() + ")"
                + " for parameter " + parameterName);
      }
    }
    InferenceParameter param = getInferenceParameter(parameterName);
    value = param.canonicalizeValue(value);
    if (!param.isValidValue(value)) {
      throw new RuntimeException(
              "Got invalid value " + value + " for parameter " + parameterName);
    }
    return map.put(parameterName, value);
  }

  @Override
  public String stringApiValue() {
    if (size() <= 0) {
      return CycObjectFactory.nil.stringApiValue();
    }
    StringBuilder buf = new StringBuilder("(LIST ");
    for (Iterator<CycSymbolI> iter = keySet().iterator(); iter.hasNext();) {
      CycSymbolI key = iter.next();
      buf.append(DefaultCycObject.stringApiValue(key));
      buf.append(" ");
      final Object val = get(key);
      buf.append(parameterValueStringApiValue(key, val));
      if (iter.hasNext()) {
        buf.append(" ");
      }
    }
    buf.append(")");
    return buf.toString();
  }

  @Override
  public Object cycListApiValue() {
    if (size() <= 0) {
      return CycArrayList.EMPTY_CYC_LIST;
    }
    CycArrayList<Object> cycList = new CycArrayList<Object>();
    for (Iterator<CycSymbolI> iter = keySet().iterator(); iter.hasNext();) {
      CycSymbolI key = iter.next();
      cycList.add(key);
      final Object val = get(key);
      cycList.add(parameterValueCycListApiValue(key, val));
    }
    return cycList;
  }

  /* @return the CycArrayList API value for val qua value for key. */
  @Override
  public Object parameterValueCycListApiValue(final CycSymbolI key,
          final Object val) {
    final InferenceParameter param = getInferenceParameter(key);
    return param.parameterValueCycListApiValue(val);
  }

  @Override
  public Object clone() {
    DefaultInferenceParameters copy = new DefaultInferenceParameters(cycAccess);
    Iterator<CycSymbolI> iterator = this.keySet().iterator();
    while (iterator.hasNext()) {
      CycSymbolI key = iterator.next();
      Object value = this.get(key); // note: this might should be cloned
      copy.put(key, value);
    }
    return copy;
  }

  @Override
  public DefaultInferenceParameters toDefaultInferenceParameters(CycAccess cyc) {
    if (this.getCycAccess() == cyc) {
      return this;
    } else {
      DefaultInferenceParameters copy = new DefaultInferenceParameters(cycAccess);
      Iterator<CycSymbolI> iterator = this.keySet().iterator();
      while (iterator.hasNext()) {
        CycSymbolI key = iterator.next();
        Object value = this.get(key); // note: this might should be cloned
        copy.put(key, value);
      }
      return copy;
    }
  }

  public static Object getInfiniteValue() {
    return null;
  }

  public static boolean isInfiniteValue(final Object value) {
    return null == value;
  }

  //// Protected Area
  //// Private Area
  private int size() {
    return map.size();
  }

  private InferenceParameterDescriptions getDefaultInferenceParameterDescriptions() {
    if (defaultInferenceParameterDescriptions == null) {
      initializeDefaultInferenceParameterDescriptions();
    }
    return defaultInferenceParameterDescriptions;
  }

  private void initializeDefaultInferenceParameterDescriptions() {
    defaultInferenceParameterDescriptions =
            DefaultInferenceParameterDescriptions.getDefaultInferenceParameterDescriptions(
            cycAccess);
  }

  private InferenceParameter getInferenceParameter(CycSymbolI parameterName) throws RuntimeException {
    InferenceParameterDescriptions descriptions = getDefaultInferenceParameterDescriptions();
    if (descriptions == null) {
      throw new RuntimeException("Cannot find inference parameter descriptions");
    }
    InferenceParameter param = (InferenceParameter) descriptions.get(
            parameterName);
    if (param == null) {
      throw new RuntimeException("No parameter found by name " + parameterName);
    }
    return param;
  }

  private static boolean isProblemStoreSpecification(final CycSymbolI key,
          final Object val) {
    return (":PROBLEM-STORE".equals(key.toString())) && (val instanceof List);
  }

  /* @return the string API value for val qua value for key. */
  private String parameterValueStringApiValue(final CycSymbolI key,
          final Object val) {
    final Object cycListApiValue = parameterValueCycListApiValue(key, val);
    if (val instanceof InferenceParameterValue) {
      return ((InferenceParameterValue) val).stringApiValue();
    } else if (isProblemStoreSpecification(key, cycListApiValue)) {
      return problemStoreStringApiValue((List) cycListApiValue);
    } else if (cycListApiValue instanceof CycObject) {
      return ((CycObject) cycListApiValue).stringApiValue();
    } else if (cycListApiValue instanceof DefaultInferenceParameterValueDescription) {
      DefaultInferenceParameterValueDescription param = (DefaultInferenceParameterValueDescription) cycListApiValue;
      Object value = param.getValue();
      String ret = DefaultCycObject.stringApiValue(value);
      return (ret);
    } else {
      return (DefaultCycObject.stringApiValue(cycListApiValue));
    }
  }

  @Override
  public String toString() {
    final int maxLen = 10;
    StringBuilder builder = new StringBuilder();
    builder.append("DefaultInferenceParameters [");
    if (cycAccess != null) {
      builder.append("cycAccess=").append(cycAccess).append(", ");
    }
    if (defaultInferenceParameterDescriptions != null) {
      builder.append("defaultInferenceParameterDescriptions=").append(
              toString(defaultInferenceParameterDescriptions.entrySet(), maxLen));
    }
    builder.append("]");
    return builder.toString();
  }

  private String toString(Collection<?> collection, int maxLen) {
    StringBuilder builder = new StringBuilder();
    builder.append("[");
    int i = 0;
    for (Iterator<?> iterator = collection.iterator(); iterator.hasNext() && i < maxLen; i++) {
      if (i > 0) {
        builder.append(", ");
      }
      builder.append(iterator.next());
    }
    builder.append("]");
    return builder.toString();
  }

//@hack -- Only way to pass a problem store is to pass a form that evaluates to one:
  private static String problemStoreStringApiValue(final List val) {
    final StringBuffer buf = new StringBuffer("(");
    for (Iterator i = ((List) val).iterator(); i.hasNext();) {
      final Object item = i.next();
      if (item instanceof String) {
        buf.append(DefaultCycObject.stringApiValue(item));
      } else {
        buf.append(item);
      }
      buf.append(" ");
    }
    buf.append(")");
    return buf.toString();
  }
  //// Internal Rep
  private final CycAccess cycAccess;
  private InferenceParameterDescriptions defaultInferenceParameterDescriptions = null;
  //// Main

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    try {
      System.out.println("Starting...");
      CycAccess cycAccess = CycClientManager.get().getAccess("public1", 3640);
      InferenceParameters parameters = new DefaultInferenceParameters(cycAccess);
      parameters.put(new CycSymbol(":MAX-NUMBER"), new Integer(10));
      parameters.put(new CycSymbol(":PROBABLY-APPROXIMATELY-DONE"), new Double(
              0.5));
      parameters.put(new CycSymbol(":ABDUCTION-ALLOWED?"), Boolean.TRUE);
      parameters.put(new CycSymbol(":EQUALITY-REASONING-METHOD"), new CycSymbol(
              ":CZER-EQUAL"));
      try {
        parameters.put(new CycSymbol(":MAX-NUMBER"), new CycSymbol(":BINDINGS"));
        System.out.println("Failed to catch exception.");
      } catch (Exception e) {
      } // ignore
      try {
        parameters.put(new CycSymbol(":PROBABLY-APPROXIMATELY-DONE"),
                new CycSymbol(":BINDINGS"));
        System.out.println("Failed to catch exception.");
      } catch (Exception e) {
      } // ignore
      try {
        parameters.put(new CycSymbol(":ABDUCTION-ALLOWED?"), new CycSymbol(
                ":BINDINGS"));
        System.out.println("Failed to catch exception.");
      } catch (Exception e) {
      } // ignore
      try {
        parameters.put(new CycSymbol(":EQUALITY-REASONING-METHOD"), new Double(
                0.5));
        System.out.println("Failed to catch exception.");
      } catch (Exception e) {
      } // ignore
      System.out.println("PARAMETERS: " + parameters.stringApiValue());
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      System.out.println("Exiting...");
      System.exit(0);
    }
  }
}
