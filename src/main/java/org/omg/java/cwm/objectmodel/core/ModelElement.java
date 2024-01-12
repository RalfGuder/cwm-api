package org.omg.java.cwm.objectmodel.core;

import java.util.Collection;

/**
 * A <b>abstract</b> model element is an element that is an abstraction drawn 
 * from the system being modeled.
 */
public interface ModelElement extends Element {

  /**
   * Gets the 'name' property value.
   * 
   * <p>An identifier for the ModelElement within its containing Namespace.
   *
   * @return A string.
   */
  public String getName();

  /**
   * Sets the 'name' property value.
   * 
   * <p>An identifier for the ModelElement within its containing Namespace.
   *
   * @param value is a string.
   */
  public void setName(java.lang.String value);

  /**
   * Gets the 'visibility' property value.
   * 
   * <p>Specifies extent of the visibility of the ModelElement within its owning 
   * Namespace.
   *
   * @return An VisibilityKind instance.
   */
  public VisibilityKind getVisibility();

  /**
   * Sets the 'visibility' property value.
   * 
   * <p>Specifies extent of the visibility of the ModelElement within its owning 
   * Namespace.
   *
   * @param value is an VisibilityKind instance.
   */
  public void setVisibility(VisibilityKind value);

  /**
   * Gets the 'clientDependency' property value.
   * 
   * <p>Inverse of client. Designates a set of Dependency in which the ModelElement 
   * is a client.
   *
   * @return A collection of zero or more Dependency instances.
   */
  public Collection<? extends Dependency> getClientDependency();

  /**
   * Gets the 'constraint' property value.
   * 
   * <p>A set of Constraints affecting the element. A constraint that must be satisfied 
   * by the model element. A model element may have a set of constraints. The constraint 
   * is to be evaluated when the system is stable; that is, not in the middle of 
   * an atomic operation.
   *
   * @return A collection of zero or more Constraint instances.
   */
  public Collection<? extends Constraint> getConstraint();

  /**
   * Gets the 'importer' property values.
   * 
   * <p>References the set of Package instances that import the ModelElement.
   *
   * @return A collection of zero or more Package instances.
   */
  public Collection<? extends Package> getImporter();

  /**
   * Gets the 'namespace' property value.
   * 
   * <p>Designates the Namespace that contains the ModelElement. Every ModelElement 
   * except a root element must belong to exactly one Namespace or else be a composite 
   * part of another ModelElement (which is a kind of virtual namespace). The pathname 
   * of Namespace or ModelElement names starting from the root package provides 
   * a unique designation for every ModelElement. The association attribute visibility 
   * specifies the visibility of the element outside its namespace (see ElementOwnership).
   *
   * @return An Namespace instance.
   */
  public Namespace getNamespace();

  /**
   * Sets the 'namespace' property value.
   * 
   * <p>Designates the Namespace that contains the ModelElement. Every ModelElement 
   * except a root element must belong to exactly one Namespace or else be a composite 
   * part of another ModelElement (which is a kind of virtual namespace). The pathname 
   * of Namespace or ModelElement names starting from the root package provides 
   * a unique designation for every ModelElement. The association attribute visibility 
   * specifies the visibility of the element outside its namespace (see ElementOwnership).
   *
   * @param value is an Namespace instance.
   */
  public void setNamespace(Namespace value);
  
  /**
   * Gets the 'taggedValue' property value.
   * 
   * <p>References the set of TaggedValue instances that extend the ModelElement.
   * 
   * <p>A model element must have at most one tagged value with a given tag name.
   *
   * @return  A collection of zero or more TaggedValue instances.
   */
  public Collection<? extends TaggedValue> getTaggedValue();
  
  /**
   * Sets the 'taggedValue' property value.
   * 
   * <p>References the set of TaggedValue instances that extend the ModelElement.
   * 
   * @param value is an TaggedValue instance.
   */
  public void setTaggedValue(TaggedValue value);

}
