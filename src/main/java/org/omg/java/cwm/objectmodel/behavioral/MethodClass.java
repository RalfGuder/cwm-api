/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.behavioral;



public interface MethodClass{

  public org.omg.java.cwm.objectmodel.behavioral.Method createMethod( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, org.omg.java.cwm.objectmodel.core.ScopeKind _ownerScope, boolean _isQuery, org.omg.java.cwm.objectmodel.core.ProcedureExpression _body );

  public org.omg.java.cwm.objectmodel.behavioral.Method createMethod();

}
