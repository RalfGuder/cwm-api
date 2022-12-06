/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.core;


/**
 * An Attribute describes a named slot within a Classifier that may hold a value.
 */
public interface Attribute
extends org.omg.java.cwm.objectmodel.core.StructuralFeature {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

	/**
	 * Read the <tt>initialValue</tt> property.
	 * <p>
	 * An Expression specifying the value of the attribute upon initialization. It is meant to be
	 * evaluated at the time the object is initialized. (Note that an explicit constructor may supersede
	 * an initial value.)
	 */
	public org.omg.java.cwm.objectmodel.core.Expression getInitialValue();
	/**
	 * Write the <tt>initialValue</tt> property.
	 * <p>
	 * An Expression specifying the value of the attribute upon initialization. It is meant to be
	 * evaluated at the time the object is initialized. (Note that an explicit constructor may supersede
	 * an initial value.)
	 * @param value as Expression
	 */
	public void setInitialValue( org.omg.java.cwm.objectmodel.core.Expression value );

}
