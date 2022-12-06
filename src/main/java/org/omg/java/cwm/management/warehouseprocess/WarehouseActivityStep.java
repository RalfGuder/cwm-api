/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseprocess;



public interface WarehouseActivityStep {

  public boolean exists( org.omg.java.cwm.management.warehouseprocess.WarehouseActivity warehouseActivity, org.omg.java.cwm.management.warehouseprocess.WarehouseStep warehouseStep );

  public java.util.List getWarehouseStep( org.omg.java.cwm.management.warehouseprocess.WarehouseActivity warehouseActivity );

  public org.omg.java.cwm.management.warehouseprocess.WarehouseActivity getWarehouseActivity( org.omg.java.cwm.management.warehouseprocess.WarehouseStep warehouseStep );

  public boolean add( org.omg.java.cwm.management.warehouseprocess.WarehouseActivity warehouseActivity, org.omg.java.cwm.management.warehouseprocess.WarehouseStep warehouseStep );

  public boolean remove( org.omg.java.cwm.management.warehouseprocess.WarehouseActivity warehouseActivity, org.omg.java.cwm.management.warehouseprocess.WarehouseStep warehouseStep );

}
