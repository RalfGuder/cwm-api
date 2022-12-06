/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseoperation;



public interface StepExecutionCallAction {

  public boolean exists( org.omg.java.cwm.objectmodel.behavioral.CallAction callAction, org.omg.java.cwm.management.warehouseoperation.StepExecution stepExecution );

  public java.util.Collection<? extends org.omg.java.cwm.management.warehouseoperation.StepExecution> getStepExecution( org.omg.java.cwm.objectmodel.behavioral.CallAction callAction );

  public org.omg.java.cwm.objectmodel.behavioral.CallAction getCallAction( org.omg.java.cwm.management.warehouseoperation.StepExecution stepExecution );

  public boolean add( org.omg.java.cwm.objectmodel.behavioral.CallAction callAction, org.omg.java.cwm.management.warehouseoperation.StepExecution stepExecution );

  public boolean remove( org.omg.java.cwm.objectmodel.behavioral.CallAction callAction, org.omg.java.cwm.management.warehouseoperation.StepExecution stepExecution );

}
