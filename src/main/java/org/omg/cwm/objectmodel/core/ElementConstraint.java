package org.omg.cwm.objectmodel.core;

import java.util.Collection;

/**
 * The <b>protected</b> ElementConstraint association provides linkages between 
 * ModelElements and the Constraint instances that constrain their state. Note 
 * that a Constraint instance may not simultaneously participate in both the 
 * ElementConstraint and the StereotypeConstraint associations.
 *
 */
public interface ElementConstraint {
  boolean add(ModelElement constrainedElement, Constraint constraint);
  
  boolean exists(ModelElement constrainedElement, Constraint constraint);
  
  boolean remove(ModelElement constrainedElement, Constraint constraint);
  
  /**
   * Identifies the ModelElements whose state is constrained by the Constraint instance.
   *
   * @param constraint is the Constraint instance.
   * @return Zero or more ModelElements as a ordered collection.
   */
  Collection<ModelElement> getConstrainedElement(Constraint constraint);
  
  /**
   * Identifies the Constraint instances that restrict the possible states that 
   * a ModelElement may take.
   *
   * @param constrainedElement is a ModelElement.
   * @return Zero or more Constraint instances as a Collection.
   */
  Collection<Constraint> getConstraint(ModelElement constrainedElement);
}
