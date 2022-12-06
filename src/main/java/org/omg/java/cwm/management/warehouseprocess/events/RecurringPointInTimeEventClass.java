/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseprocess.events;



public interface RecurringPointInTimeEventClass{

  public org.omg.java.cwm.management.warehouseprocess.events.RecurringPointInTimeEvent createRecurringPointInTimeEvent( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, org.omg.java.cwm.management.warehouseprocess.datatype.RecurringType _recurringType, int _frequencyFactor, java.lang.Integer _month, java.lang.Integer _dayOfMonth, org.omg.java.cwm.management.warehouseprocess.datatype.DayOfWeek _dayOfWeek, java.lang.Integer _hour, java.lang.Integer _minute, int _second );

  public org.omg.java.cwm.management.warehouseprocess.events.RecurringPointInTimeEvent createRecurringPointInTimeEvent();

}
