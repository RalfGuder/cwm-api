/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.transformation;

import org.omg.java.cwm.objectmodel.core.ModelElement;
import org.omg.java.cwm.objectmodel.core.Namespace;

public interface TransformationActivity
extends org.omg.java.cwm.objectmodel.core.Subsystem {
	

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

	/**
	 * When the TransformationActivity was created.
	 */
	public java.lang.String getCreationDate();
	/**
	 * When the TransformationActivity was created.
	 * @param value
	 */
	public void setCreationDate( java.lang.String value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

	/**
	 * Identifies the TransformationSteps owned by the TransformationActivity.
	 * @see Namespace#getOwnedElement()
	 */
	public java.util.Collection<? extends ModelElement> getStep();

}
