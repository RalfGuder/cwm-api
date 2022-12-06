/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseprocess;



public interface TriggeringProcess{

  public boolean exists( org.omg.java.cwm.management.warehouseprocess.WarehouseProcess triggeringWp, org.omg.java.cwm.management.warehouseprocess.events.InternalEvent internalEvent );

  public java.util.Collection<? extends org.omg.java.cwm.management.warehouseprocess.events.InternalEvent> getInternalEvent( org.omg.java.cwm.management.warehouseprocess.WarehouseProcess triggeringWp );

  public java.util.Collection<? extends org.omg.java.cwm.management.warehouseprocess.WarehouseProcess> getTriggeringWp( org.omg.java.cwm.management.warehouseprocess.events.InternalEvent internalEvent );

  public boolean add( org.omg.java.cwm.management.warehouseprocess.WarehouseProcess triggeringWp, org.omg.java.cwm.management.warehouseprocess.events.InternalEvent internalEvent );

  public boolean remove( org.omg.java.cwm.management.warehouseprocess.WarehouseProcess triggeringWp, org.omg.java.cwm.management.warehouseprocess.events.InternalEvent internalEvent );

}
