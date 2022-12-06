/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational;



public interface ViewClass {

  public org.omg.java.cwm.resource.relational.View createView( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, boolean _isAbstract, boolean _isReadOnly, boolean _checkOption, org.omg.java.cwm.foundation.datatypes.QueryExpression _queryExpression );

  public org.omg.java.cwm.resource.relational.View createView();

}
