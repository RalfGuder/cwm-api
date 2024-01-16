package org.omg.java.cwm.objectmodel.core;


/**
 * An Attribute describes a named slot within a Classifier that may hold a value.
 */
public interface Attribute extends StructuralFeature {

	/**
	 * Read the 'initialValue' property value.
         *
	 * <p>An Expression specifying the value of the attribute upon initialization. It is meant to be
	 * evaluated at the time the object is initialized. (Note that an explicit constructor may supersede
	 * an initial value.)
	 */
	public Expression getInitialValue();
	
	/**
	 * Write the 'initialValue' property.
         *
	 * <p>An Expression specifying the value of the attribute upon initialization. It is meant to be
	 * evaluated at the time the object is initialized. (Note that an explicit constructor may supersede
	 * an initial value.)
         *
	 * @param value as Expression
	 */
	public void setInitialValue( Expression value );

}
