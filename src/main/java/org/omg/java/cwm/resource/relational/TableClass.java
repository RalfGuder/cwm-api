/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational;



public interface TableClass {

  public org.omg.java.cwm.resource.relational.Table createTable( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, boolean _isAbstract, boolean _isTemporary, java.lang.String _temporaryScope, boolean _isSystem );

  public org.omg.java.cwm.resource.relational.Table createTable();

}
