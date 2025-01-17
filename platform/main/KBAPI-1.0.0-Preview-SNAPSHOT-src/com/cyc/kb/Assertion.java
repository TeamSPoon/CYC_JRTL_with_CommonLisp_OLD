package com.cyc.kb;

import java.util.Collection;

import com.cyc.kb.KBAPIEnums.Direction;
import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.DeleteException;
import com.cyc.kb.exception.KBTypeException;

public interface Assertion extends KBObject {

  /**
   * the context associated with the assertion. The assertion is true in this
   * and any context that inherits this context.
   *
   * @return the context of the assertion
   *
   * NOTE: Even though we have the assertion object, when we try to retrieve a 
   * context, we could still not find it, if the object is "stale". Currently we 
   * do not synchronize the API objects with the KB. This method throws a runtime
   * exception if it couldn't find the context.
   */
  public Context context();

  /**
   * the collection of assertions that directly support this assertion.&nbsp;For
   * assertions that are not deduced, the collection will be empty.
   *
   * An assertion can be "asserted assertion", that is, asserted locally by a
   * cyclist. Or an assertion can be "deduced assertion", that is, the inference
   * engine has justification to believe that the sentence is true in a given
   * context. A deduced assertion has one or more independent arguments
   * (justifications) supporting the assertion. A deduction is a type of
   * argument for an assertion. Assertion by a cyclist is also an argument.
   *
   * A deduction has multiple "supports", some of these supports are due to HL
   * modules and others may be asserted or deduced assertions. This method
   * returns the "asserted assertions" that support the deductions, supporting
   * this assertion.
   *
   * @return a set of supporting assertions
   * 
   * @throws KBTypeException 
   * @throws CreateException 
   */
  public Collection<Assertion> getSupportingAssertions()
      throws KBTypeException, CreateException;

  /**
   * Returns true if this assertion is supported by other assertions, false if
   * this assertion is not deduced from anything else. Note that an assertion
   * can be both a deduced assertion and an asserted assertion at the same time.
   *
   * @return true if this assertion is supported by other assertions
   *  
   */
  public boolean isDeducedAssertion();

  /**
   * Is <code>this</code> a ground atomic formula? This will return true for
   * <code>Assertion</code>s that represent Cyc GAFs, and false for anything else.
   * 
   * @return true iff this KBObject is a ground atomic formula
   */
  public boolean isGroundAtomicFormula();

  /**
   * Returns true if this assertion is asserted directly in the KB (i.e.&nbsp;at
   * least one of its supporting arguments is not deduced from something else).
   * Note that an assertion can be both a deduced assertion and an asserted
   * assertion at the same time.
   *
   * @return true if this assertion is asserted directly in the KB
   * 
   */
  public boolean isAssertedAssertion();

  /**
   * the direction of the assertion. 
   * 
   * @return the direction of the assertion.
   * 
   */
  public Direction getDirection();

  /**
   * Remove this
   * <code>Assertion</code> from the KB. It should be noted that deleting an
   * <code>Assertion</code> from the KB does not mean that the information
   * contained in that that assertion will necessarily become unknown to Cyc.
   * For example, there are many cases where an Assertion may be asserted but
   * also be easily inferrible. In those cases, the Assertion will no longer be
   * represented in Cyc as a separate assertion, but Cyc's inference system will
   * continue to behave as if it were present in the KB because it is easily
   * inferrible.<p>
   * There are also cases where
   * <code>Assertions</code>s can not be deleted. The most prominent of these
   * cases is when the underlying assertion has been forward deduced from some
   * other assertion(s). In such cases, the only way to remove the
   * <code>Assertion</code> is to remove enough of the assertions it is deduced
   * from, to prevent it from being inferred (e.g from
   * {@link getSupportingAssertions}). As a general rule of thumb, if you assert
   * something to the Cyc KB, you will also be able to delete it. And you can
   * also delete the vast majority of assertions that were already present in
   * the KB. Extreme care should be taken when deleting Assertions that you
   * didn't create, since the process of deletion destructively modified the KB,
   * and deleting facts that Cyc critically relies on may cause it to behave in
   * erratic ways.
   *
   * @throws DeleteException when the underlying assertion can't be removed from
   * the KB.
   */
  public void delete() throws DeleteException;

}