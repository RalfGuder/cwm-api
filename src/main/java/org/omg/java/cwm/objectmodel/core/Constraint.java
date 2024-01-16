package org.omg.java.cwm.objectmodel.core;

import java.util.List;

public interface Constraint extends ModelElement {

  /**
   * Gets the 'body' property value.
   * 
   * <p>A BooleanExpression that must be true when evaluated for an instance of 
   * a system to be well formed. A boolean expression defining the constraint. Expressions 
   * are written as strings in a designated language. For the model to be well formed, 
   * the expression must always yield a true value when evaluated for instances 
   * of the constrained elements at any time when the system is stable; that is, 
   * not during the execution of an atomic operation.
   * 
   * @return An {@linkplain BooleanExpression} instance.
   */
  public BooleanExpression getBody();

  /**
   * Sets the 'body' property value.
   * 
   * <p>A BooleanExpression that must be true when evaluated for an instance of 
   * a system to be well formed. A boolean expression defining the constraint. Expressions 
   * are written as strings in a designated language. For the model to be well formed, 
   * the expression must always yield a true value when evaluated for instances 
   * of the constrained elements at any time when the system is stable; that is, 
   * not during the execution of an atomic operation.
   *
   * @param value is bn {@linkplain BooleanExpression} instance.
   */
  public void setBody( BooleanExpression value );


  /**
   * Gets the '' property value.
   * 
   * <p>A ModelElement or list of ModelElements affected by the Constraint.
   * 
   * @return A List of zero or more {@linkplain ModelElement} instances.
   */
  public List<? extends ModelElement> getConstrainedElement();

}
