/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseoperation;



public interface StepExecution
extends org.omg.java.cwm.management.warehouseoperation.TransformationExecution {

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.analysis.transformation.TransformationStep getTransformationStep();

  public void setTransformationStep( org.omg.java.cwm.analysis.transformation.TransformationStep value );

  public org.omg.java.cwm.management.warehouseoperation.ActivityExecution getActivityExecution();

  public void setActivityExecution( org.omg.java.cwm.management.warehouseoperation.ActivityExecution value );

  public org.omg.java.cwm.objectmodel.behavioral.CallAction getCallAction();

  public void setCallAction( org.omg.java.cwm.objectmodel.behavioral.CallAction value );

}
