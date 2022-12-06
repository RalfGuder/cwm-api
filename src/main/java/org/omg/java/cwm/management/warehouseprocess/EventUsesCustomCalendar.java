/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseprocess;



public interface EventUsesCustomCalendar {

  public boolean exists( org.omg.java.cwm.management.warehouseprocess.events.CustomCalendar customCalendar, org.omg.java.cwm.management.warehouseprocess.events.CustomCalendarEvent customCalendarEvent );

  public java.util.Collection<? extends org.omg.java.cwm.management.warehouseprocess.events.CustomCalendarEvent> getCustomCalendarEvent( org.omg.java.cwm.management.warehouseprocess.events.CustomCalendar customCalendar );

  public org.omg.java.cwm.management.warehouseprocess.events.CustomCalendar getCustomCalendar( org.omg.java.cwm.management.warehouseprocess.events.CustomCalendarEvent customCalendarEvent );

  public boolean add( org.omg.java.cwm.management.warehouseprocess.events.CustomCalendar customCalendar, org.omg.java.cwm.management.warehouseprocess.events.CustomCalendarEvent customCalendarEvent );

  public boolean remove( org.omg.java.cwm.management.warehouseprocess.events.CustomCalendar customCalendar, org.omg.java.cwm.management.warehouseprocess.events.CustomCalendarEvent customCalendarEvent );

}
