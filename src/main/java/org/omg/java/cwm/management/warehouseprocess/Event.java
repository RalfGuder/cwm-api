/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseprocess;



public interface Event{

  public boolean exists( org.omg.java.cwm.management.warehouseprocess.WarehouseProcess warehouseProcess, org.omg.java.cwm.management.warehouseprocess.events.WarehouseEvent warehouseEvent );

  public java.util.Collection<? extends org.omg.java.cwm.management.warehouseprocess.events.WarehouseEvent> getWarehouseEvent( org.omg.java.cwm.management.warehouseprocess.WarehouseProcess warehouseProcess );

  public org.omg.java.cwm.management.warehouseprocess.WarehouseProcess getWarehouseProcess( org.omg.java.cwm.management.warehouseprocess.events.WarehouseEvent warehouseEvent );

  public boolean add( org.omg.java.cwm.management.warehouseprocess.WarehouseProcess warehouseProcess, org.omg.java.cwm.management.warehouseprocess.events.WarehouseEvent warehouseEvent );

  public boolean remove( org.omg.java.cwm.management.warehouseprocess.WarehouseProcess warehouseProcess, org.omg.java.cwm.management.warehouseprocess.events.WarehouseEvent warehouseEvent );

}
