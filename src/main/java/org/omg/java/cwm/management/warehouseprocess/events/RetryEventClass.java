/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseprocess.events;



public interface RetryEventClass {

  public org.omg.java.cwm.management.warehouseprocess.events.RetryEvent createRetryEvent( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, org.omg.java.cwm.objectmodel.core.BooleanExpression _condition, float _waitDuration, int _maxCount );

  public org.omg.java.cwm.management.warehouseprocess.events.RetryEvent createRetryEvent();

}
