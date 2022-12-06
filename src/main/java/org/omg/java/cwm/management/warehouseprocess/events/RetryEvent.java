/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseprocess.events;



public interface RetryEvent
extends org.omg.java.cwm.management.warehouseprocess.events.InternalEvent {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public float getWaitDuration();

  public void setWaitDuration( float value );

  public int getMaxCount();

  public void setMaxCount( int value );

}
