/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseoperation;



public interface WarehouseOperationPackage{

  public org.omg.java.cwm.objectmodel.core.CorePackage getCore();

  public org.omg.java.cwm.analysis.transformation.TransformationPackage getTransformation();

  public org.omg.java.cwm.objectmodel.behavioral.BehavioralPackage getBehavioral();

  public org.omg.java.cwm.management.warehouseoperation.MeasurementClass getMeasurement();

  public org.omg.java.cwm.management.warehouseoperation.ChangeRequestClass getChangeRequest();

  public org.omg.java.cwm.management.warehouseoperation.TransformationExecutionClass getTransformationExecution();

  public org.omg.java.cwm.management.warehouseoperation.ActivityExecutionClass getActivityExecution();

  public org.omg.java.cwm.management.warehouseoperation.StepExecutionClass getStepExecution();

  public org.omg.java.cwm.management.warehouseoperation.StepExecutionCallAction getStepExecutionCallAction();

  public org.omg.java.cwm.management.warehouseoperation.ModelElementChangeRequest getModelElementChangeRequest();

  public org.omg.java.cwm.management.warehouseoperation.ModelElementMeasurement getModelElementMeasurement();

  public org.omg.java.cwm.management.warehouseoperation.ActivityStepExecutions getActivityStepExecutions();

  public org.omg.java.cwm.management.warehouseoperation.TransformationActivityExecutions getTransformationActivityExecutions();

  public org.omg.java.cwm.management.warehouseoperation.TransformationStepExecutions getTransformationStepExecutions();

}
