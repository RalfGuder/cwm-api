/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseprocess;



public interface WarehouseProcessPackage{

  public org.omg.java.cwm.management.warehouseprocess.datatype.DataTypePackage getDataType();

  public org.omg.java.cwm.management.warehouseprocess.events.EventsPackage getEvents();

  public org.omg.java.cwm.objectmodel.core.CorePackage getCore();

  public org.omg.java.cwm.analysis.transformation.TransformationPackage getTransformation();

  public org.omg.java.cwm.objectmodel.behavioral.BehavioralPackage getBehavioral();

  public org.omg.java.cwm.management.warehouseprocess.WarehouseProcessClass getWarehouseProcess();

  public org.omg.java.cwm.management.warehouseprocess.WarehouseStepClass getWarehouseStep();

  public org.omg.java.cwm.management.warehouseprocess.ProcessPackageClass getProcessPackage();

  public org.omg.java.cwm.management.warehouseprocess.WarehouseActivityClass getWarehouseActivity();

  public org.omg.java.cwm.management.warehouseprocess.WarehouseActivityRunsTransformationActivity getWarehouseActivityRunsTransformationActivity();

  public org.omg.java.cwm.management.warehouseprocess.WarehouseActivityStep getWarehouseActivityStep();

  public org.omg.java.cwm.management.warehouseprocess.WarehouseStepRunsTransformationStep getWarehouseStepRunsTransformationStep();

  public org.omg.java.cwm.management.warehouseprocess.TriggeringProcess getTriggeringProcess();

  public org.omg.java.cwm.management.warehouseprocess.Event getEvent();

  public org.omg.java.cwm.management.warehouseprocess.EventUsesCustomCalendar getEventUsesCustomCalendar();

}
