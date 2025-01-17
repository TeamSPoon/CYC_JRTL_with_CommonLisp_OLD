package com.cyc.kb.client;

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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

import com.cyc.base.cycobject.CycObject;
import com.cyc.base.cycobject.DenotationalTerm;
import com.cyc.base.cycobject.Guid;
import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.kb.KBAPIEnums;
import com.cyc.kb.KBCollection;
import com.cyc.kb.KBIndividual;
import com.cyc.kb.KBObject;
import com.cyc.kb.KBStatus;
import com.cyc.kb.KBAPIEnums.LookupType;
import com.cyc.kb.config.KBAPIDefaultContext;
import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.InvalidNameException;
import com.cyc.kb.exception.KBApiException;
import com.cyc.kb.exception.KBObjectNotFoundException;
import com.cyc.kb.exception.KBTypeConflictException;
import com.cyc.kb.exception.KBTypeException;

/**
 * A <code>KBIndividual</code> object is a facade for a <code>#$Individual</code> 
 * in Cyc KB.
 * 
 * Individual is anything that is not a set or collection. An individual
 * can be abstract or concrete entity. Physical objects, relations, events
 * and even groups are individuals. An individual can have parts but not
 * elements or subsets.
 * 
 * @author Vijay Raj
 * @version $Id: KBIndividualImpl.java 151340 2014-05-19 15:55:29Z vijay $
 */

  // @todo DaveS review documentation
public class KBIndividualImpl extends KBTermImpl implements KBIndividual {

  static final Logger log = Logger.getLogger(KBIndividualImpl.class.getName());
  private static final DenotationalTerm TYPE_CORE =
          new CycConstant("Individual", new Guid("bd58da02-9c29-11b1-9dad-c379636f7270"));

  static DenotationalTerm getClassTypeCore() {
    return TYPE_CORE;
  }

  /**
   * Not part of the KB API. This default constructor only has the effect of
   * ensuring that there is access to a Cyc server.
   */
  KBIndividualImpl() {
    super();
  }

  /**
   * EXPERIMENTAL!!! NOT PART OF THE KB API
   * 
   * A copy constructor to allow higher level APIs to construct
   * subclass objects using super class objects, when appropriate.
   * 
   * @param ind the KBIndividual to be copied
   */
  protected KBIndividualImpl (KBIndividualImpl ind) {
	  super();
	  this.setCore(ind);
  }
  
  /**
   * Not part of the KB API. An implementation-dependent constructor.
   * <p>
   * It is used when the result of query is a CycObject and is known to be or
   * requested to be cast as an KBIndividual.
   *
   * @param cycObject	the CycObject wrapped by <code>KBIndividual</code>. The constructor
   * verifies that the CycObject is an #$Individual
   * 
   * @throws KBTypeException if cycObject is not an #$Individual
   */
  KBIndividualImpl(CycObject cycObject) throws KBTypeException  {
    super(cycObject);
  }

  /**
   * EXPERIMENTAL!!! NOT PART OF THE KB API
   */
  protected KBIndividualImpl(String cycIndStr, List<Object> l) throws KBTypeException, CreateException  {
    super(cycIndStr, l);
  }
  
  /**
   * EXPERIMENTAL!!! NOT PART OF THE KB API
   */
  public static KBIndividual some() throws KBApiException {
    List<Object> l = new ArrayList<Object>();
    l.add(QuantifierImpl.get("thereExists"));
    KBIndividual o = new KBIndividualImpl("?IND", l);
    return o;
  }
  
  /**
   * EXPERIMENTAL!!! NOT PART OF THE KB API
   */
  public static KBObject all() throws KBApiException {
    List<Object> l = new ArrayList<Object>();
    l.add(QuantifierImpl.get("forAll"));
    KBIndividualImpl o = new KBIndividualImpl("?IND", l);
    return o;
  }
  
  /**
   * This is not part of the KB API. finds or creates an individual represented
   * by indStr in the underlying KB
   * <p>
   *
   * @param indStr	the string representing an #$Individual in the KB
   * 
   * @throws CreateException if the #$Individual represented by indStr is not found
   * and could not be created 
   * @throws KBTypeException if the term represented by indStr is not an instance
   * of #$Individual and cannot be made into one. 
   */
  protected KBIndividualImpl(String indStr) throws KBTypeException, CreateException {
    super(indStr);
  }

  /**
   * This is not part of the KB API. finds or creates; or finds an individual
   * represented by indStr in the underlying KB based on input ENUM
   * <p>
   *
   * @param indStr	the string representing an #$Individual in the KB
   * @param lookup the enum to specify LookupType: FIND or FIND_OR_CREATE
   * 
   * @throws CreateException 
   * @throws KBTypeException 
   *
   * @throws KBObjectNotFoundException	if the #$Individual represented by indStr
   * is not found and could not be created
   * @throws InvalidNameException if the string indStr does not conform to Cyc constant-naming
   * conventions
   * 
   * @throws KBTypeException  if the term represented by indStr is not an #$Individual and lookup is
   * set to find only {@link LookupType#FIND} an #$Individual
   * @throws KBTypeConflictException if the term represented by indStr is not an #$Individual,
   * and lookup is set to find or create; and if the term cannot be made an #$Individual by asserting
   * new knowledge.
   */
  KBIndividualImpl(String indStr, LookupType lookup) throws KBTypeException, CreateException   {
    super(indStr, lookup);
  }

  /**
   * Get the
   * <code>KBIndividual</code> with the name
   * <code>nameOrId</code>. Throws exceptions if there is no KB term by that
   * name, or if it is not already an instance of #$Individual.
   *
   * @param nameOrId the string representation or the HLID of the #$Individual
   * 
   * @return  a new KBIndividual
   * 
   * @throws KBTypeException
   * @throws CreateException 
   */
  public static KBIndividualImpl get(String nameOrId) throws KBTypeException, CreateException {
    return KBObjectFactory.get(nameOrId, KBIndividualImpl.class);
  }

  /**
   * Get the
   * <code>KBIndividual</code> object that corresponds to
   * <code>cycObject</code>. Throws exceptions if the object isn't in the KB, or if
   * it's not already an instance of
   * <code>#$Individual</code>.
   *
   * @param cycObject the CycObject wrapped by KBIndividual. The method
   * verifies that the CycObject is an #$Individual
   * 
   * @return a new KBIndividual 
   * 
   * @throws CreateException 
   * @throws KBTypeException
   */
  @Deprecated
  public static KBIndividualImpl get(CycObject cycObject) throws KBTypeException, CreateException  {
    return KBObjectFactory.get(cycObject, KBIndividualImpl.class);
  }

  /**
   * Find or create a
   * <code>KBIndividual</code> object named
   * <code>nameOrId</code>. If no object exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of
   * <code>#$Individual</code>. If there is already an object in the KB called
   * <code>nameOrId</code>, and it is already a
   * <code>#$Individual</code>, it will be returned. If it is not already a
   * <code>#$Individual</code>, but can be made into one by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into a
   * <code>#$Individual</code> by adding assertions (i.e. some existing
   * assertion prevents it from being a
   * <code>#$Individual</code>), a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param nameOrId  the string representation or the HLID of the #$Individual
   * 
   * @return a new KBIndividual
   * 
   * @throws KBTypeException 
   * @throws CreateException 
   */
  public static KBIndividualImpl findOrCreate(String nameOrId) throws CreateException, KBTypeException  {
    return KBObjectFactory.findOrCreate(nameOrId, KBIndividualImpl.class);
  }

  /**
   * Find or create a KBIndividual object from
   * <code>cycObject</code>. If
   * <code>cycObject</code> is already a
   * <code>#$Individual</code>, an appropriate
   * <code>KBIndividual</code> object will be returned. If
   * <code>object</code> is not already a
   * <code>#$Individual</code>, but can be made into one by addition of
   * assertions to the KB, such assertions will be made, and the relevant object
   * will be returned. If
   * <code>cycObject</code> cannot be turned into a
   * <code>#$Individual</code> by adding assertions (i.e. some existing
   * assertion prevents it from being a
   * <code>#$Individual</code>, a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param cycObject the CycObject wrapped by KBIndividual. The method
   * verifies that the CycObject is an #$Individual
   * 
   * @return a new KBIndividual
   * 
   * @throws KBTypeException 
   * @throws CreateException 
   */
  @Deprecated
  public static KBIndividualImpl findOrCreate(CycObject cycObject) throws CreateException, KBTypeException  {
    return KBObjectFactory.findOrCreate(cycObject, KBIndividualImpl.class);
  }

  /**
   * Find or create a
   * <code>KBIndividual</code> object named
   * <code>nameOrId</code>, and also make it an instance of
   * <code>constraintCol</code> in the default context specified by
   * {@link KBAPIDefaultContext#forAssertion()}. If no object
   * exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of both
   * <code>#$Individual</code> and
   * <code>constraintCol</code>. If there is already an object in the
   * KB called
   * <code>nameOrId</code>, and it is already both a
   * <code>#$Individual</code> and a
   * <code>constraintCol</code>, it will be returned. If it is not
   * already both a
   * <code>#$Individual</code> and a
   * <code>constraintCol</code>, but can be made so by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into both a
   * <code>#$Individual</code> and a
   * <code>constraintCol</code> by adding assertions, a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param nameOrId  the string representation or the HLID of the #$Individual
   * @param constraintCol the collection that this #$Individual will instantiate
   * 
   * @return a new KBIndividual
   * 
   * @throws KBTypeException 
   * @throws CreateException 
   */
  public static KBIndividualImpl findOrCreate(String nameOrId, KBCollection constraintCol) throws CreateException, KBTypeException  {
    return KBObjectFactory.findOrCreate(nameOrId, constraintCol, KBIndividualImpl.class);
  }

  /**
   * Find or create a
   * <code>KBIndividual</code> object named
   * <code>nameOrId</code>, and also make it an instance of
   * <code>constraintCol</code> in the default context specified by
   * {@link KBAPIDefaultContext#forAssertion()}. If no object
   * exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of both
   * <code>#$Individual</code> and
   * <code>constraintCol</code>. If there is already an object in the
   * KB called
   * <code>nameOrId</code>, and it is already both a
   * <code>#$Individual</code> and a
   * <code>constraintCol</code>, it will be returned. If it is not
   * already both a
   * <code>#$Individual</code> and a
   * <code>constraintCol</code>, but can be made so by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into both a
   * <code>#$Individual</code> and a
   * <code>constraintCol</code> by adding assertions, a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param nameOrId  the string representation or the HLID of the #$Individual
   * @param constraintColStr the string representation of the collection that 
   * this #$Individual will instantiate
   * 
   * @return a new KBIndividual
   * 
   * @throws KBTypeException 
   * @throws CreateException 
   */
  public static KBIndividualImpl findOrCreate(String nameOrId, String constraintColStr) throws CreateException, KBTypeException  {
    return KBObjectFactory.findOrCreate(nameOrId, constraintColStr, KBIndividualImpl.class);
  }

  /**
   * Find or create a
   * <code>KBIndividual</code> object named
   * <code>nameOrId</code>, and also make it an instance of
   * <code>constraintCol</code> in
   * <code>ctx</code>. If no object exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of both
   * <code>#$Individual</code> and
   * <code>constraintCol</code>. If there is already an object in the
   * KB called
   * <code>nameOrId</code>, and it is already both a
   * <code>#$Individual</code> and a
   * <code>constraintCol</code>, it will be returned. If it is not
   * already both a
   * <code>#$Individual</code> and a
   * <code>constraintCol</code>, but can be made so by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into both a
   * <code>#$Individual</code> and a
   * <code>constraintCol</code> by adding assertions, a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param nameOrId  the string representation or the HLID of the #$Individual
   * @param constraintCol the collection that this #$Individual will instantiate
   * @param ctx the context in which the resulting object must be an instance of
   * constraintCol
   * 
   * @return a new KBIndividual
   * 
   * @throws KBTypeException 
   * @throws CreateException 
   */
  public static KBIndividualImpl findOrCreate(String nameOrId, KBCollection constraintCol, ContextImpl ctx) 
      throws CreateException, KBTypeException  {
    return KBObjectFactory.findOrCreate(nameOrId, constraintCol, ctx, KBIndividualImpl.class);
  }

  /**
   * Find or create a
   * <code>KBIndividual</code> object named
   * <code>nameOrId</code>, and also make it an instance of
   * <code>constraintCol</code> in
   * <code>ctx</code>. If no object exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of both
   * <code>#$Individual</code> and
   * <code>constraintCol</code>. If there is already an object in the
   * KB called
   * <code>nameOrId</code>, and it is already both a
   * <code>#$Individual</code> and a
   * <code>constraintCol</code>, it will be returned. If it is not
   * already both a
   * <code>#$Individual</code> and a
   * <code>constraintCol</code>, but can be made so by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into both a
   * <code>#$Individual</code> and a
   * <code>constraintCol</code> by adding assertions, a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param nameOrId the string representation or the HLID of the term
   * @param constraintColStr the string representation of the collection that 
   * this #$Individual will instantiate
   * @param ctxStr the context in which the resulting object must be an instance of
   * constraintCol
   * 
   * @return a new KBIndividual 
   * 
   * @throws KBTypeException 
   * @throws CreateException 
   */
  public static KBIndividualImpl findOrCreate(String nameOrId, String constraintColStr, String ctxStr) 
      throws CreateException, KBTypeException  {
    return KBObjectFactory.findOrCreate(nameOrId, constraintColStr, ctxStr, KBIndividualImpl.class);
  }

  /**
   * Checks whether entity exists in KB and is an instance of #$Individual. If
   * false, {@link #getStatus(String)} may yield more information. This method
   * is equivalent to
   * <code>getStatus(nameOrId).equals(KBStatus.EXISTS_AS_TYPE)</code>.
   *
   * @param nameOrId either the name or HL ID of an entity in the KB
   * @return <code>true</code> if entity exists in KB and is an instance of
   * #$Individual
   */
  public static boolean existsAsType(String nameOrId)  {
    return getStatus(nameOrId).equals(KBStatus.EXISTS_AS_TYPE);
  }

  /**
   * Checks whether entity exists in KB and is an instance of #$Individual. If
   * false, {@link #getStatus(CycObject)} may yield more information. This
   * method is equivalent to
   * <code>getStatus(object).equals(KBStatus.EXISTS_AS_TYPE)</code>.
   *
   * @param cycObject the CycObject representation of a KB entity
   * @return <code>true</code> if entity exists in KB and is an instance of
   * #$Individual
   */
  public static boolean existsAsType(CycObject cycObject)  {
    return getStatus(cycObject).equals(KBStatus.EXISTS_AS_TYPE);
  }

  /**
   * Returns an KBStatus enum which describes whether
   * <code>nameOrId</code> exists in the KB and is an instance of
   * <code>#$Individual</code>.
   *
   * @param nameOrId either the name or HL ID of an entity in the KB
   * @return an enum describing the existential status of the entity in the KB
   */
  public static KBStatus getStatus(String nameOrId)  {
    return KBObjectFactory.getStatus(nameOrId, KBIndividualImpl.class);

  }

  /**
   * Returns an KBStatus enum which describes whether
   * <code>cycObject</code> exists in the KB and is an instance of
   * <code>#$Individual</code>.
   *
   * @param cycObject the CycObject representation of a KB entity
   * @return an enum describing the existential status of the entity in the KB
   */
  public static KBStatus getStatus(CycObject object)  {
    return KBObjectFactory.getStatus(object, KBIndividualImpl.class);
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.KBIndividual#instanceOf()
   */
  @Override
  public Collection<KBCollection> instanceOf() {
    return instanceOf("");
  }

  /* (non-Javadoc)
   * @see com.cyc.kb.KBIndividual#instanceOf(java.lang.String)
   */
  @Override
  public Collection<KBCollection> instanceOf(String ctxStr) {
    return (this.<KBCollection>getValues("isa", 1, 2, ctxStr));
  }

  @Override
  String getTypeString() {
    return getClassTypeString();
  }

  /**
   * Get the string representation of the KB type that this class corresponds
   * to.
   *
   * @return #$Individual
   */
  public static String getClassTypeString() {
    return "#$Individual";
  }
}
