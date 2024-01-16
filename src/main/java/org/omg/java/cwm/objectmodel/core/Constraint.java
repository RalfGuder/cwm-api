package org.omg.java.cwm.objectmodel.core;

import java.util.List;

/**
 * A constraint is a semantic condition or restriction expressed in text.
 *
 * <p>In the metamodel a Constraint is a BooleanExpression on an associated
 * ModelElement(s) that must be true for the model to be well formed. This restriction
 * can be stated in natural language, or in different kinds of languages with well defined
 * semantics. Certain Constraints are predefined, others may be user defined. Note that a
 * Constraint is an assertion, not an executable mechanism.
 *
 * <p>The specification is written as an expression in a designated constraint language. The
 * language can be specially designed for writing constraints (such as OCL), a
 * programming language, mathematical notation, or natural language. If constraints are
 * to be enforced by a model editor tool, then the tool must understand the syntax and
 * semantics of the constraint language. Because the choice of language is arbitrary,
 * constraints can be used as an extension mechanism.
 *
 * <p>The constraint concept allows new semantics to be specified linguistically for a model
 * element. In the metamodel a Constraint directly attached to a ModelElement describes
 * semantic restrictions that this ModelElement must obey.
 *
 * <p>A Constraint cannot be applied to itself. [C-3-1]
 */
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
