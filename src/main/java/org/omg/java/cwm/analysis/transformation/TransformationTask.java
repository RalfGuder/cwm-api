/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.transformation;



public interface TransformationTask
extends org.omg.java.cwm.foundation.softwaredeployment.Component {

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

	public java.util.Collection<? extends org.omg.java.cwm.analysis.transformation.Transformation> getTransformation();

  public java.util.Collection<? extends org.omg.java.cwm.analysis.transformation.TransformationTask> getInverseTask();

  public java.util.Collection<? extends org.omg.java.cwm.analysis.transformation.TransformationTask> getOriginalTask();

}
