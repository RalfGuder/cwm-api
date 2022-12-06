/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseoperation;



public interface TransformationActivityExecutions{

  public boolean exists( org.omg.java.cwm.analysis.transformation.TransformationActivity transformationActivity, org.omg.java.cwm.management.warehouseoperation.ActivityExecution execution );

  public java.util.Collection<? extends org.omg.java.cwm.management.warehouseoperation.ActivityExecution> getExecution( org.omg.java.cwm.analysis.transformation.TransformationActivity transformationActivity );

  public org.omg.java.cwm.analysis.transformation.TransformationActivity getTransformationActivity( org.omg.java.cwm.management.warehouseoperation.ActivityExecution execution );

  public boolean add( org.omg.java.cwm.analysis.transformation.TransformationActivity transformationActivity, org.omg.java.cwm.management.warehouseoperation.ActivityExecution execution );

  public boolean remove( org.omg.java.cwm.analysis.transformation.TransformationActivity transformationActivity, org.omg.java.cwm.management.warehouseoperation.ActivityExecution execution );

}
