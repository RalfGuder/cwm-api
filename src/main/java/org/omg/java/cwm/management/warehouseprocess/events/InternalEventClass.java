/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseprocess.events;



public interface InternalEventClass{

  public org.omg.java.cwm.management.warehouseprocess.events.InternalEvent createInternalEvent( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, org.omg.java.cwm.objectmodel.core.BooleanExpression _condition );

  public org.omg.java.cwm.management.warehouseprocess.events.InternalEvent createInternalEvent();

}
