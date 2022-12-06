/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational;



public interface SqlindexClass {

  public org.omg.java.cwm.resource.relational.Sqlindex createSqlindex( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, boolean _isPartitioning, boolean _isSorted, boolean _isUnique, java.lang.String _filterCondition, boolean _isNullable, boolean _autoUpdate );

  public org.omg.java.cwm.resource.relational.Sqlindex createSqlindex();

}
