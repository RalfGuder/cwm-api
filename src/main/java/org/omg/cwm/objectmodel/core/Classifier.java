package org.omg.cwm.objectmodel.core;

/**
 * A classifier is an element that describes structural and behavioral features; it comes in
 * several specific forms, including class, data type, interface, component, and others that
 * are defined in other metamodel packages. Classifier is often used as a type.
 * 
 * <p>In the metamodel a Classifier may declare a collection of Features, such as Attributes,
 * Operations, and Methods. It has a name, which is unique in the Namespace enclosing
 * the Classifier. Classifier is an abstract metaclass.
 * 
 * <p>Classifier is a child of Namespace. As a Namespace, a Classifier may declare other
 * Classifiers nested in its scope. Nested Classifiers may be accessed by other Classifiers
 * only if the nested Classifiers have adequate visibility. There are no data value or state
 * consequences of nested Classifiers; that is, it is not an aggregation or composition.
 * 
 * <p><b>Abstract</b>
 */
public interface Classifier extends Namespace {
  
  /**
   * An abstract Classifier is not instantiable.
   *
   * @return True or false.
   */
  java.lang.Boolean isAbstract();
  
  /**
   * An abstract Classifier is not instantiable.
   *
   * @param value is true or false.
   */
  void setAbstract(java.lang.Boolean value);
  
  /**
   * An ordered list of Features owned by the Classifier.
   *
   * <p>Definiert durch {@linkplain ClassifierFeature#getFeature(Classifier)}
   *
   * @return an Collection.
   */
  java.util.Collection<Feature> getFeature();

}
