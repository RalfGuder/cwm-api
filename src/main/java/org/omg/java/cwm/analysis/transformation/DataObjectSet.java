/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.transformation;



public interface DataObjectSet
extends org.omg.java.cwm.objectmodel.core.ModelElement {

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

	public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.ModelElement> getElement();

	public java.util.Collection<? extends org.omg.java.cwm.analysis.transformation.Transformation> getSourceTransformation();

	public java.util.Collection<? extends org.omg.java.cwm.analysis.transformation.Transformation> getTargetTransformation();

}
