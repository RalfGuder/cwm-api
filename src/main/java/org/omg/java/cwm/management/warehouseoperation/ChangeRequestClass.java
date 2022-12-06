/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseoperation;



public interface ChangeRequestClass{

  public org.omg.java.cwm.management.warehouseoperation.ChangeRequest createChangeRequest( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, java.lang.String _changeDescription, java.lang.String _changeReason, java.lang.String _status, boolean _completed, java.lang.String _requestDate, java.lang.String _completionDate );

  public org.omg.java.cwm.management.warehouseoperation.ChangeRequest createChangeRequest();

}
