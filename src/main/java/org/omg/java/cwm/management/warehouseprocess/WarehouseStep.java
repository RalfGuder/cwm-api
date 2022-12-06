/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseprocess;



public interface WarehouseStep
extends org.omg.java.cwm.management.warehouseprocess.WarehouseProcess {

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.analysis.transformation.TransformationStep getTransformationStep();

  public void setTransformationStep( org.omg.java.cwm.analysis.transformation.TransformationStep value );

  public org.omg.java.cwm.management.warehouseprocess.WarehouseActivity getWarehouseActivity();

  public void setWarehouseActivity( org.omg.java.cwm.management.warehouseprocess.WarehouseActivity value );

}
