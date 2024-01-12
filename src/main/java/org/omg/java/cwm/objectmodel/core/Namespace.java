package org.omg.java.cwm.objectmodel.core;


/**
 * A <b>abstract</b> namespace is a part of a model that contains a set of model 
 * elements each of whose names designates a unique element within the namespace.
 * 
 * <p>In the metamodel, a Namespace is a ModelElement that can own other ModelElements, 
 * such as Classifiers. The name of each owned ModelElement must be unique within 
 * the Namespace. Moreover, each contained ModelElement is owned by at most one 
 * Namespace. The concrete subclasses of Namespace may have additional constraints 
 * on which kind of elements may be contained.
 * 
 * <p>Namespace is an abstract metaclass.
 * 
 * <p>Note that explicit parts of a model element, such as the features of a Classifier, 
 * are not modeled as owned elements in a namespace. A namespace is used for unstructured 
 * contents such as the contents of a package, or a class declared inside the scope 
 * of another class.
 */
public interface Namespace extends ModelElement {

  /**
   * Gets the '' property value.
   * 
   * <p>A set of ModelElements owned by the Namespace. The ModelElement’s visibility 
   * attribute states whether the element is visible outside the namespace.
   *
   * @return An collection of zero or more ModelElement instances.
   */
  public java.util.Collection<? extends ModelElement> getOwnedElement();

}
