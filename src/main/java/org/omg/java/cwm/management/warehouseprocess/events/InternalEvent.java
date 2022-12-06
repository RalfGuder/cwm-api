/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseprocess.events;



public interface InternalEvent
extends org.omg.java.cwm.management.warehouseprocess.events.WarehouseEvent {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.objectmodel.core.BooleanExpression getCondition();

  public void setCondition( org.omg.java.cwm.objectmodel.core.BooleanExpression value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public java.util.Collection<? extends org.omg.java.cwm.management.warehouseprocess.WarehouseProcess> getTriggeringWp();

}
