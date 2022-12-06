/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseoperation;



public interface TransformationStepExecutions{

  public boolean exists( org.omg.java.cwm.management.warehouseoperation.StepExecution execution, org.omg.java.cwm.analysis.transformation.TransformationStep transformationStep );

  public org.omg.java.cwm.analysis.transformation.TransformationStep getTransformationStep( org.omg.java.cwm.management.warehouseoperation.StepExecution execution );

  public java.util.Collection<? extends org.omg.java.cwm.management.warehouseoperation.StepExecution> getExecution( org.omg.java.cwm.analysis.transformation.TransformationStep transformationStep );

  public boolean add( org.omg.java.cwm.management.warehouseoperation.StepExecution execution, org.omg.java.cwm.analysis.transformation.TransformationStep transformationStep );

  public boolean remove( org.omg.java.cwm.management.warehouseoperation.StepExecution execution, org.omg.java.cwm.analysis.transformation.TransformationStep transformationStep );

}
