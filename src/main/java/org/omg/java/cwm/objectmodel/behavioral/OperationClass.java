/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.behavioral;



public interface OperationClass{

  public org.omg.java.cwm.objectmodel.behavioral.Operation createOperation( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, org.omg.java.cwm.objectmodel.core.ScopeKind _ownerScope, boolean _isQuery, boolean _isAbstract );

  public org.omg.java.cwm.objectmodel.behavioral.Operation createOperation();

}
