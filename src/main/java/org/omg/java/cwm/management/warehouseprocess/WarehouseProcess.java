/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseprocess;



public interface WarehouseProcess
extends org.omg.java.cwm.objectmodel.core.ModelElement {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public boolean isStaticDefinition();

  public void setStaticDefinition( boolean value );

  public boolean isSequential();

  public void setSequential( boolean value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public java.util.Collection<? extends org.omg.java.cwm.management.warehouseprocess.events.WarehouseEvent> getWarehouseEvent();

  public java.util.Collection<? extends org.omg.java.cwm.management.warehouseprocess.events.InternalEvent> getInternalEvent();

}
