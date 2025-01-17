package com.cyc.baseclient.kbtool;

import com.cyc.base.CycAccess;
import com.cyc.base.CycConnectionException;
import com.cyc.base.cycobject.CycAssertion;
import com.cyc.base.cycobject.CycConstantI;
import com.cyc.base.cycobject.FormulaSentence;
import com.cyc.base.cycobject.Fort;
import com.cyc.base.cycobject.CycList;
import com.cyc.base.cycobject.CycObject;
import com.cyc.base.kbtool.UnassertTool;
import java.util.Iterator;
import java.util.List;
import com.cyc.baseclient.AbstractKBTool;
import static com.cyc.baseclient.CommonConstants.baseKB;
import com.cyc.baseclient.CycClientManager;
import com.cyc.base.CycApiException;
import com.cyc.baseclient.CycObjectFactory;
import static com.cyc.baseclient.api.SubLAPIHelper.makeSubLStmt;
import com.cyc.baseclient.cycobject.CycArrayList;
import com.cyc.baseclient.cycobject.DefaultCycAssertion;
import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.baseclient.cycobject.CycFormulaSentence;

/**
 *
 * @author nwinant
 */
public class CycUnassertTool extends AbstractKBTool implements UnassertTool {
  
  public CycUnassertTool(CycAccess client) {
    super(client);
  }
  
  public CycUnassertTool() {
    super();
  }
  
  
  // Public
  
  /**
   * Kills a Cyc constant without issuing a transcript operation. If CYCCONSTANT is a microtheory,
   * then all the contained assertions are deleted from the KB, the Cyc Truth Maintenance System
   * (TMS) will automatically delete any derived assertions whose sole support is the killed
   * term(s).
   *
   * @param cycConstant the constant term to be removed from the KB
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public synchronized void killWithoutTranscript(CycConstantI cycConstant)
          throws CycConnectionException, CycApiException {
    kill(cycConstant, false, false);
  }

  /**
   * Kills the given Cyc constants. If CYCCONSTANT is a microtheory, then all the contained
   * assertions are deleted from the KB, the Cyc Truth Maintenance System (TMS) will automatically
   * delete any derived assertions whose sole support is the killed term(s).
   *
   * @param cycConstants the list of constant terms to be removed from the KB
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public synchronized void kill(CycConstantI[] cycConstants)
          throws CycConnectionException, CycApiException {
    for (int i = 0; i < cycConstants.length; i++) {
      kill(cycConstants[i]);
    }
  }

  /**
   * Kills the given Cyc constants. If CYCCONSTANT is a microtheory, then all the contained
   * assertions are deleted from the KB, the Cyc Truth Maintenance System (TMS) will automatically
   * delete any derived assertions whose sole support is the killed term(s).
   *
   * @param cycConstants the list of constant terms to be removed from the KB
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public synchronized void kill(List cycConstants)
          throws CycConnectionException, CycApiException {
    for (int i = 0; i < cycConstants.size(); i++) {
      kill((CycConstant) cycConstants.get(i));
    }
  }

  /**
   * Kills a reified Cyc term. If CYCFORT is a microtheory, then all the
   * contained assertions are deleted from the KB, the Cyc Truth Maintenance System (TMS) will
   * automatically delete any derived assertions whose sole support is the killed term(s).
   *
   * @param cycFort the NART term to be removed from the KB
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public synchronized void kill(Fort cycFort)
          throws CycConnectionException, CycApiException {
    kill(cycFort, true, true);
  }

  /**
   * Kills a reified Cyc term. If CYCFORT is a microtheory, then all the
   * contained assertions are deleted from the KB, the Cyc Truth Maintenance System (TMS) will
   * automatically delete any derived assertions whose sole support is the killed term(s).
   *
   * @param cycFort the NART term to be removed from the KB
   * @param bookkeeping
   * @param transcript
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public synchronized void kill(Fort cycFort, boolean bookkeeping,
          boolean transcript)
          throws CycConnectionException, CycApiException {
    final String fn = (transcript) ? "ke-kill-now" : "cyc-kill";
    String command = "(" + fn + " " + cycFort.stringApiValue() + ")";
    if (bookkeeping) {
      command = getConverse().wrapBookkeeping(command);
    }
    getConverse().converseBoolean(command);
    if (cycFort instanceof CycConstant) {
      CycObjectFactory.removeCaches((CycConstant) cycFort);
    }
  }
  
  /**
   * Unasserts the given sentence with bookkeeping and without placing it on the transcript queue.
   *
   * @param sentence the given sentence for unassertion
   * @param mt the microtheory from which the assertion is removed
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void unassertWithBookkeepingAndWithoutTranscript(CycList sentence,
          CycObject mt)
          throws CycConnectionException,
          CycApiException {
    if (getCurrentTransaction() != null) {
      getCurrentTransaction().noteForUnassertion(getCyc().getHostName(), baseKB, true, false);
    } else {
      String command = getConverse().wrapBookkeeping("(cyc-unassert " + sentence.stringApiValue()
              + makeELMt_inner(mt).stringApiValue() + ")");
      boolean unassertOk = getConverse().converseBoolean(command);

      if (!unassertOk) {
        throw new CycApiException("Could not unassert from mt: " + makeELMt_inner(
                mt) + "\n  "
                + sentence.cyclify());
      }
    }
  }

  /**
   * Unasserts the given ground atomic formula (gaf) in the specified microtheory MT.
   *
   * @param gaf the gaf in the form of a CycArrayList
   * @param mt the microtheory in which the assertion is made
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void unassertGaf(CycList gaf,
          CycObject mt)
          throws CycConnectionException, CycApiException {
    unassertGaf(CycFormulaSentence.makeCycFormulaSentence(gaf), mt, true, true);
  }

  /**
   * Unasserts the given ground atomic formula (gaf) in the specified microtheory MT.
   *
   * @param gaf the gaf in the form of a CycArrayList
   * @param mt the microtheory in which the assertion is made
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void unassertGaf(FormulaSentence gaf, CycObject mt)
          throws CycConnectionException, CycApiException {
    unassertGaf(gaf, mt, true, true);
  }

  /**
   * Unasserts the given ground atomic formula (gaf) in the specified
   * microtheory MT.
   *
   * @param gaf the gaf in the form of a CycArrayList
   * @param mt the microtheory in which the assertion is made
   * @param bookkeeping
   * @param transcript
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void unassertGaf(FormulaSentence gaf, CycObject mt,
          boolean bookkeeping,
          boolean transcript)
          throws CycConnectionException, CycApiException {
    if (getCurrentTransaction() != null) {
      getCurrentTransaction().noteForUnassertion(gaf.stringApiValue(), makeELMt_inner(
              mt), bookkeeping, transcript);
    } else {
      final String fn = (transcript) ? "ke-unassert-now" : "cyc-unassert";
      String command = "(" + fn + " " + gaf.stringApiValue()
              + makeELMt_inner(mt).stringApiValue() + ")";
      if (bookkeeping) {
        command = getConverse().wrapBookkeeping(command);
      }
      getConverse().converseVoid(command);
    }
  }

  /**
   * Unasserts the given assertion.
   *
   * @param assertion the assertion in the form of a DefaultCycAssertion
   * @param bookkeeping
   * @param transcript
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  @Override
  public void unassertAssertion(CycAssertion assertion,
          boolean bookkeeping,
          boolean transcript)
          throws CycConnectionException, CycApiException {
    if (getCurrentTransaction() != null) {
      getCurrentTransaction().noteForUnassertion(assertion.stringApiValue(), makeELMt_inner(assertion.getMt()), bookkeeping, transcript);
    } else {
      final String fn = (transcript) ? "ke-unassert" : "cyc-unassert";
      String command = "(" + fn + " " + assertion.getELFormula(CycClientManager.get().getCurrentAccess()).stringApiValue() + " " 
              + assertion.getMt().stringApiValue() + ")";
      if (bookkeeping) {
        command = getConverse().wrapBookkeeping(command);
      }
      getConverse().converseVoid(command);
    }
  }
  
  /**
   * Unasserts all assertions from the given mt, with a transcript record of the unassert
   * operation.
   *
   * @param mt the microtheory from which to delete all its assertions
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public void unassertMtContentsWithTranscript(CycObject mt)
          throws CycConnectionException, CycApiException {
    CycList assertions = getCyc().getLookupTool().getAllAssertionsInMt(mt);
    Iterator iter = assertions.iterator();

    while (iter.hasNext()) {
      DefaultCycAssertion assertion = (DefaultCycAssertion) iter.next();
      String command = getConverse().wrapBookkeeping(makeSubLStmt("ke-unassert-now", assertion,
              makeELMt_inner(mt)));
      getConverse().converseVoid(command);
    }
  }

  /**
   * Unasserts all assertions from the given mt, without a transcript record of the unassert
   * operation.
   *
   * @param mt the microtheory from which to delete all its assertions
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public void unassertMtContentsWithoutTranscript(CycObject mt)
          throws CycConnectionException,
          CycApiException {
    CycList assertions = getCyc().getLookupTool().getAllAssertionsInMt(mt);
    Iterator iter = assertions.iterator();

    while (iter.hasNext()) {
      DefaultCycAssertion assertion = (DefaultCycAssertion) iter.next();
      String command = makeSubLStmt("cyc-unassert", assertion, makeELMt_inner(mt));
      getConverse().converseVoid(command);
    }
  }

  /**
   * Unasserts all assertions from the given mt having the given predicate and arg1, without a
   * transcript record of the unassert operation.
   *
   * @param predicate the given predicate or null to match all predicates
   * @param arg1 the given arg1
   * @param mt the microtheory from which to delete the matched assertions
   *
   * @throws CycConnectionException if a communications error occurs
   * @throws CycApiException if the Cyc server returns an error
   */
  @Override
  public void unassertMatchingAssertionsWithoutTranscript(Fort predicate,
          Object arg1,
          CycObject mt)
          throws CycConnectionException,
          CycApiException {
    CycList assertions = getCyc().getLookupTool().getAllAssertionsInMt(mt);
    Iterator iter = assertions.iterator();

    while (iter.hasNext()) {
      DefaultCycAssertion assertion = (DefaultCycAssertion) iter.next();
      CycList sentence = assertion.getFormula();

      if (sentence.size() < 2) {
        continue;
      }

      if (!(arg1.equals(sentence.second()))) {
        continue;
      }

      if ((predicate != null) && (!(predicate.equals(sentence.first())))) {
        continue;
      }

      String command = "(cyc-unassert " + assertion.stringApiValue()
              + makeELMt_inner(mt).stringApiValue() + "))";
      getConverse().converseVoid(command);
    }
  }
}