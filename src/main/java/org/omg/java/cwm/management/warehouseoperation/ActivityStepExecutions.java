/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseoperation;



public interface ActivityStepExecutions {

  public boolean exists( org.omg.java.cwm.management.warehouseoperation.ActivityExecution activityExecution, org.omg.java.cwm.management.warehouseoperation.StepExecution stepExecution );

  public java.util.Collection<? extends org.omg.java.cwm.management.warehouseoperation.StepExecution> getStepExecution( org.omg.java.cwm.management.warehouseoperation.ActivityExecution activityExecution );

  public org.omg.java.cwm.management.warehouseoperation.ActivityExecution getActivityExecution( org.omg.java.cwm.management.warehouseoperation.StepExecution stepExecution );

  public boolean add( org.omg.java.cwm.management.warehouseoperation.ActivityExecution activityExecution, org.omg.java.cwm.management.warehouseoperation.StepExecution stepExecution );

  public boolean remove( org.omg.java.cwm.management.warehouseoperation.ActivityExecution activityExecution, org.omg.java.cwm.management.warehouseoperation.StepExecution stepExecution );

}
