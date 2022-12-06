/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseprocess.events;



public interface EventsPackage{

  public org.omg.java.cwm.management.warehouseprocess.events.WarehouseEventClass getWarehouseEvent();

  public org.omg.java.cwm.management.warehouseprocess.events.ScheduleEventClass getScheduleEvent();

  public org.omg.java.cwm.management.warehouseprocess.events.PointInTimeEventClass getPointInTimeEvent();

  public org.omg.java.cwm.management.warehouseprocess.events.CustomCalendarEventClass getCustomCalendarEvent();

  public org.omg.java.cwm.management.warehouseprocess.events.CustomCalendarClass getCustomCalendar();

  public org.omg.java.cwm.management.warehouseprocess.events.CalendarDateClass getCalendarDate();

  public org.omg.java.cwm.management.warehouseprocess.events.IntervalEventClass getIntervalEvent();

  public org.omg.java.cwm.management.warehouseprocess.events.ExternalEventClass getExternalEvent();

  public org.omg.java.cwm.management.warehouseprocess.events.InternalEventClass getInternalEvent();

  public org.omg.java.cwm.management.warehouseprocess.events.CascadeEventClass getCascadeEvent();

  public org.omg.java.cwm.management.warehouseprocess.events.RetryEventClass getRetryEvent();

  public org.omg.java.cwm.management.warehouseprocess.events.RecurringPointInTimeEventClass getRecurringPointInTimeEvent();

}
