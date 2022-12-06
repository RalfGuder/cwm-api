/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseprocess.events;



public interface IntervalEventClass{

  public org.omg.java.cwm.management.warehouseprocess.events.IntervalEvent createIntervalEvent( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, float _duration );

  public org.omg.java.cwm.management.warehouseprocess.events.IntervalEvent createIntervalEvent();

}
