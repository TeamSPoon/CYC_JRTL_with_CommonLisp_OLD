package com.cyc.kb;

import com.cyc.kb.exception.CreateException;
import com.cyc.kb.exception.DeleteException;
import com.cyc.kb.exception.KBTypeException;

public interface Fact extends Assertion {

  /**
   * gets the object in <code>getPos</code> argument position of the fact as an
   * object of type <code>O</code>
   * 
   * @param getPos
   *          the argument position of the object returned
   * @param O
   *          the type the returned object is cast to
   * 
   * @return the object as a <code>O</code> from <code>getPos</code> argument
   *         position of the fact
   *         
   * @throws CreateException 
   * @throws KBTypeException 
   */
  public <O> O getArgument(int getPos) throws KBTypeException, CreateException;

  /**
   * Remove this <code>Fact</code> from the KB. It should be noted that deleting
   * a <code>Fact</code> from the KB does not mean that the information
   * contained in that Fact will necessarily become unknown to Cyc. For example,
   * there are many cases where a Fact may be asserted but also be easily
   * inferrible. In those cases, the Fact will no longer be represented in Cyc
   * as a separate assertion, but Cyc's inference system will continue to behave
   * as if it were present in the KB because it is so easily inferrible.
   * <p>
   * There are also cases where <code>Fact</code>s can not be deleted. The most
   * prominent of these cases is when the underlying assertion has been forward
   * derived from some other assertion(s). In such cases, the only way to remove
   * the <code>Fact</code> is to remove enough of the assertions it is derived
   * from to prevent it from being inferred. As a general rule of thumb, if you
   * assert something to the Cyc KB, you will also be able to delete it. And you
   * can also delete the vast majority of assertions that were already present
   * in the KB. Extreme care should be taken when deleting Facts that you didn't
   * create, since the process of deletion destructively modified the KB, and
   * deleting facts that Cyc critically relies on may cause it to behave in
   * erratic ways.
   * 
   * @throws DeleteException
   *           when the underlying assertion can't be removed from the KB.
   * @todo write tests to make sure DeleteException is correctly thrown.
   */
  public void delete() throws DeleteException;

  // If this is a meta-fact, then the toString will not have the nice
  // "(ist ctx fact")
  /**
   * Format: (ist <context> <formula>)
   * Example: (ist SomeAirlineLogMt (isa FlightXYZ-APITest Flying-Move))
   */
  public String toString();

}