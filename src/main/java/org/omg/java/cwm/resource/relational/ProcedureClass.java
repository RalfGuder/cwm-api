/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational;



public interface ProcedureClass {

  public org.omg.java.cwm.resource.relational.Procedure createProcedure( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, org.omg.java.cwm.objectmodel.core.ScopeKind _ownerScope, boolean _isQuery, org.omg.java.cwm.objectmodel.core.ProcedureExpression _body, org.omg.java.cwm.resource.relational.enumerations.ProcedureType _type );

  public org.omg.java.cwm.resource.relational.Procedure createProcedure();

}
