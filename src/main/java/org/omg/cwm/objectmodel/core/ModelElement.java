package org.omg.cwm.objectmodel.core;

import java.util.Collection;

/**
 * A model element is an element that is an abstraction drawn from the system being
 * modeled.
 * 
 * <p>In the metamodel a ModelElement is a named entity in a Model. It is the base for all
 * modeling metaclasses in the CWM. All other modeling metaclasses are either direct or
 * indirect subclasses of ModelElement.
 * 
 * <p>The ModelElement is <b>abstract</b>.
 * 
 * <p><b>Constraints:</b>
 * 
 * <p>Tags associated with a model element (directly via a property list or indirectly via a 
 * stereotype) must not clash with any meta attributes associated with the model element.
 * [C-3-3]
 * 
 * <p>A model element must have at most one tagged value with a given tag name. [C-3-4]
 * 
 * <p>A stereotype cannot extend itself. [C-3-5]
 *
 */
public interface ModelElement extends org.omg.cwm.objectmodel.core.Element {
  
  /**
   * An identifier for the ModelElement within its containing Namespace.
   * 
   * <ul>
   * <li>type: Name
   * <li>multiplicity: exactly one
   * </ul> 
   *
   * @return a Name
   */
  Name getName();

  /**
   * An identifier for the ModelElement within its containing Namespace.
   * 
   * <ul>
   * <li>type: Name
   * <li>multiplicity: exactly one
   * </ul> 
   *
   * @param name is a Name
   */
  void setName(Name name);
  
  /**
   * Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * 
   * <ul>
   * <li>type: VisibilityKind
   * <li>multiplicity: exactly one
   * </ul>
   *
   * @return a VisibilityKind
   */
  VisibilityKind getVisibility();

  /**
   * Specifies extent of the visibility of the ModelElement within its owning Namespace.
   * 
   * <ul>
   * <li>type: VisibilityKind
   * <li>multiplicity: exactly one
   * </ul>
   *
   * @param visibility a VisibilityKind
   */
  void setVisibility(VisibilityKind visibility);
  
  /**
   * Inverse of client. Designates a set of Dependency in which the ModelElement is a client.
   * 
   * <ul>
   * <li>class: Dependency
   * <li>defined by: DependencyClient::clientDependency
   * <li>multiplicity: zero or more
   * <li>inverse: Dependency::client
   * </ul>
   *
   * @return a Collection
   */
  Collection<org.omg.cwm.objectmodel.core.Dependency> getClientDependency();
  
  /**
   * A set of Constraints affecting the element. A constraint that must be satisfied by the model
   * element. A model element may have a set of constraints. The constraint is to be evaluated
   * when the system is stable; that is, not in the middle of an atomic operation.
   * 
   * <ul>
   * <li>class: Constraint
   * <li>defined by: ElementConstraint
   * <li>multiplicity: zero or more
   * <li>inverse: Constraint::constrainedElement
   * </ul>
   *
   * @return A collection of zero or more Constraint items.
   */
  Collection<org.omg.cwm.objectmodel.core.Constraint> getConstraint();
  
  /**
   * References the set of Package instances that import the ModelElement.
   * 
   * <ul>
   * <li>class: Package
   * <li>defined by: ImportedElements::importer
   * <li>multiplicity: zero or more
   * <li>inverse: Package::importedElement
   * </ul>
   *
   * @return A collection of zero or more Package items.
   */
  Collection<org.omg.cwm.objectmodel.core.Package> getImporter();
  
  /**
   * Designates the Namespace that contains the ModelElement. Every ModelElement except a
   * root element must belong to exactly one Namespace or else be a composite part of another
   * ModelElement (which is a kind of virtual namespace). The pathname of Namespace or
   * ModelElement names starting from the root package provides a unique designation for every
   * ModelElement. The association attribute visibility specifies the visibility of the element
   * outside its namespace (see ElementOwnership).
   * 
   * <ul>
   * <li>class: Namespace
   * <li>defined by: ElementOwnership::namespace
   * <li>multiplicity: zero or one
   * <li>inverse: Namespace::ownedElement
   * </ul>
   *
   * @return Zero or one Namespace
   */
  Namespace getNamespace();
  
  /**
   * References the set of TaggedValue instances that extend the ModelElement.
   * 
   * <ul>
   * <li>class: TaggedValue
   * <li>defined by: TaggedElement::taggedValue
   * <li>multiplicity: zero or more
   * <li>inverse: TaggedValue::modelElement
   * </ul>
   *
   * @return a collection.
   */
  Collection<org.omg.cwm.objectmodel.core.TaggedValue> getTaggedValue();
}
