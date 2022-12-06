/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseoperation;



public interface ActivityExecution
extends org.omg.java.cwm.management.warehouseoperation.TransformationExecution {

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.analysis.transformation.TransformationActivity getTransformationActivity();

  public void setTransformationActivity( org.omg.java.cwm.analysis.transformation.TransformationActivity value );

  public java.util.Collection getStepExecution();

}
