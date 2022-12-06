/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseprocess;



public interface WarehouseStepRunsTransformationStep{

  public boolean exists( org.omg.java.cwm.analysis.transformation.TransformationStep transformationStep, org.omg.java.cwm.management.warehouseprocess.WarehouseStep warehouseStep );

  public java.util.Collection getWarehouseStep( org.omg.java.cwm.analysis.transformation.TransformationStep transformationStep );

  public org.omg.java.cwm.analysis.transformation.TransformationStep getTransformationStep( org.omg.java.cwm.management.warehouseprocess.WarehouseStep warehouseStep );

  public boolean add( org.omg.java.cwm.analysis.transformation.TransformationStep transformationStep, org.omg.java.cwm.management.warehouseprocess.WarehouseStep warehouseStep );

  public boolean remove( org.omg.java.cwm.analysis.transformation.TransformationStep transformationStep, org.omg.java.cwm.management.warehouseprocess.WarehouseStep warehouseStep );

}
