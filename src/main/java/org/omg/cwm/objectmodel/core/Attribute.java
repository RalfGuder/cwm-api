package org.omg.cwm.objectmodel.core;

/**
 * An Attribute describes a named slot within a Classifier that may hold a value.
 *
 */
public interface Attribute extends StructuralFeature {
  
  /**
   * An Expression specifying the value of the attribute upon initialization. 
   * It is meant to be evaluated at the time the object is initialized. 
   * (Note that an explicit constructor may supersede an initial value.)
   *
   * @param value is the Expression.
   */
  void setInitialValue(Expression value);
  
  /**
   * An Expression specifying the value of the attribute upon initialization. 
   * It is meant to be evaluated at the time the object is initialized. 
   * (Note that an explicit constructor may supersede an initial value.)
   *
   * @return An Expression.
   */
  Expression getInitialValue();

}
