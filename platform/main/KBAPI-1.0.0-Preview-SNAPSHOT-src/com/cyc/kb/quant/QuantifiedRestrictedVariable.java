package com.cyc.kb.quant;

/*
 * #%L
 * KBAPI
 * %%
 * Copyright (C) 1995 - 2014 Cycorp, Inc
 * %%
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 * #L%
 */

import com.cyc.base.cycobject.CycObject;
import com.cyc.kb.client.KBCollectionImpl;
import com.cyc.kb.client.KBPredicateImpl;
import com.cyc.kb.client.QuantifierImpl;
import com.cyc.kb.client.SentenceImpl;
import com.cyc.kb.client.VariableImpl;
import com.cyc.kb.exception.KBApiException;


/**
 *
 * @author vijay
 */
public class QuantifiedRestrictedVariable extends SentenceImpl {
  private QuantifierImpl quantifier;
  // private KBCollection collection;
  
  // Unquantified Literal
  private RestrictedVariable restrictedVariable;
  
  protected QuantifiedRestrictedVariable (CycObject core) throws KBApiException {
    super(core);
    // Should we attempt to set quantifier and collection from
    // the CycFormulaSentence.
  }
  
//  
//  public QuantifiedRestrictedVariable (Quantifier q, KBCollection c) throws KBApiException{
//    // Send in CycFormulaSentence here.
//    this(doSomething(q, c));
//    this.quantifier = q;
//    this.collection = c;
//  }
//  
//  private static CycFormulaSentence doSomething(Quantifier q, KBCollection c) throws KBApiException {
//    /*
//    CycFormulaSentence cfs = null;
//    Variable v = new Variable("?IND");
//    Predicate p = Predicate.get("isa");
//    
//    cfs = CycFormulaSentence.makeCycFormulaSentence(p.getCore(), v.getCore(), c.getCore());
//    return CycFormulaSentence.makeCycFormulaSentence(q.getCore(), v.getCore(), cfs);
//    */
//
//    CycFormulaSentence cfs = c.toSentence();
//    return CycFormulaSentence.makeCycFormulaSentence(q.getCore(), c.getVariable().getCore(), cfs);
//
//  }

  public QuantifiedRestrictedVariable (QuantifierImpl q, RestrictedVariable ul) throws KBApiException {
    this(ul.getCore());
    this.setQuantifier(q);
    this.setRestrictedVariable(ul);
  }
  
  
  public QuantifierImpl getQuantifier() {
    return quantifier;
  }

  private void setQuantifier(QuantifierImpl quantifier) {
    this.quantifier = quantifier;
  }

  public RestrictedVariable getRestrictedVariable() {
    return restrictedVariable;
  }

  private void setRestrictedVariable(RestrictedVariable restrictedVariable) {
    this.restrictedVariable = restrictedVariable;
  }
  
  @Override
  protected boolean isValidCore(CycObject tempCore)  {
    // We are constructing the sentence, we will be sure it is WFF.
    // If we check the WFF of the CycLSentence we are generating, WFF will create
    // a skolem term for the "thereExists ?IND" of the QuantifiedCollection.
    return true;
  }
  
}
