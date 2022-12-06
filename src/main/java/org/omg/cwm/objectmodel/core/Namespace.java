package org.omg.cwm.objectmodel.core;

import java.util.Collection;

/**
 * A namespace is a part of a model that contains a set of ModelElements each of whose
 * names designates a unique element within the namespace.
 * 
 * <p>In the metamodel, a Namespace is a ModelElement that can own other ModelElements, 
 * such as Classifiers. The name of each owned ModelElement must be unique within the 
 * Namespace. Moreover, each contained ModelElement is owned by at most one Namespace. 
 * The concrete subclasses of Namespace may have additional constraints on which 
 * kind of elements may be contained.
 * 
 * <p>Namespace is an <b>abstract</b> metaclass.
 * 
 * <p>Note that explicit parts of a model element, such as the features of a Classifier, are not
 * modeled as owned elements in a namespace. A namespace is used for unstructured
 * contents such as the contents of a package, or a class declared inside the scope of
 * another class.
 *
 */
public interface Namespace extends ModelElement {
  
  /**
   * A set of ModelElements owned by the Namespace. The ModelElement’s visibility attribute
   * states whether the element is visible outside the namespace.
   * 
   * <ul>
   * <li>class: ModelElement
   * <li>defined by: ElementOwnership::ownedElement
   * <li>multiplicity: zero or more
   * <li>inverse: ModelElement::namespace
   * </ul>
   *
   * @return a collection
   */
  Collection<ModelElement> getOwnedElement();
  

}
