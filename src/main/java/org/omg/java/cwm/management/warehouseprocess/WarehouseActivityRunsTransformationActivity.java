/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseprocess;



public interface WarehouseActivityRunsTransformationActivity{

  public boolean exists( org.omg.java.cwm.management.warehouseprocess.WarehouseActivity warehouseActivity, org.omg.java.cwm.analysis.transformation.TransformationActivity transformationActivity );

  public org.omg.java.cwm.analysis.transformation.TransformationActivity getTransformationActivity( org.omg.java.cwm.management.warehouseprocess.WarehouseActivity warehouseActivity );

  public java.util.Collection getWarehouseActivity( org.omg.java.cwm.analysis.transformation.TransformationActivity transformationActivity );

  public boolean add( org.omg.java.cwm.management.warehouseprocess.WarehouseActivity warehouseActivity, org.omg.java.cwm.analysis.transformation.TransformationActivity transformationActivity );

  public boolean remove( org.omg.java.cwm.management.warehouseprocess.WarehouseActivity warehouseActivity, org.omg.java.cwm.analysis.transformation.TransformationActivity transformationActivity );

}
