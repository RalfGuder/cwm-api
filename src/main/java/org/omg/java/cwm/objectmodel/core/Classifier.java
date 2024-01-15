package org.omg.java.cwm.objectmodel.core;

import java.util.List;

/**
 * A classifier is an element that describes structural and behavioral features; 
 * it comes in several specific forms, including class, data type, interface, component,
 * and others that are defined in other metamodel packages. Classifier is often 
 * used as a type.
 * 
 * <p>In the metamodel a Classifier may declare a collection of Features, such as 
 * Attributes, Operations, and Methods. It has a name, which is unique in the Namespace 
 * enclosing the Classifier. Classifier is an abstract metaclass.
 * 
 * <p>Classifier is a child of Namespace. As a Namespace, a Classifier may declare 
 * other Classifiers nested in its scope. Nested Classifiers may be accessed by 
 * other Classifiers only if the nested Classifiers have adequate visibility. There 
 * are no data value or state consequences of nested Classifiers; that is, it is 
 * not an aggregation or composition.
 *
 * <p>This class ist abstract.
 */
public interface Classifier extends Namespace {

  /**
   * Gets the 'abstract' property value.
   * 
   * <p>An abstract Classifier is not instantiable.
   *
   * @return <i>true</i> or <i>false</i>.
   */
  public boolean isAbstract();

  /**
   * Sets the 'abstract' property value.
   * 
   * <p>An abstract Classifier is not instantiable.
   *
   * @param value is <i>true</i> or <i>false</i>.
   */
  public void setAbstract(boolean value);

  /**
   * Gets the '' property value.
   * 
   * <p>An ordered list of Features owned by the Classifier.
   *
   * @return A List of zero or more ordered {@linkplain Feature} instances.
   */
  public List<? extends Feature> getFeature();

}
