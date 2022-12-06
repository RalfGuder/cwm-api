/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseprocess.events;



public interface RecurringPointInTimeEvent
extends org.omg.java.cwm.management.warehouseprocess.events.PointInTimeEvent {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.management.warehouseprocess.datatype.RecurringType getRecurringType();

  public void setRecurringType( org.omg.java.cwm.management.warehouseprocess.datatype.RecurringType value );

  public int getFrequencyFactor();

  public void setFrequencyFactor( int value );

  public java.lang.Integer getMonth();

  public void setMonth( java.lang.Integer value );

  public java.lang.Integer getDayOfMonth();

  public void setDayOfMonth( java.lang.Integer value );

  public org.omg.java.cwm.management.warehouseprocess.datatype.DayOfWeek getDayOfWeek();

  public void setDayOfWeek( org.omg.java.cwm.management.warehouseprocess.datatype.DayOfWeek value );

  public java.lang.Integer getHour();

  public void setHour( java.lang.Integer value );

  public java.lang.Integer getMinute();

  public void setMinute( java.lang.Integer value );

  public int getSecond();

  public void setSecond( int value );

}
