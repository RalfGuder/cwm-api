/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational;



public interface View
extends org.omg.java.cwm.resource.relational.NamedColumnSet {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public boolean isReadOnly();

  public void setReadOnly( boolean value );

  public boolean isCheckOption();

  public void setCheckOption( boolean value );

  public org.omg.java.cwm.foundation.datatypes.QueryExpression getQueryExpression();

  public void setQueryExpression( org.omg.java.cwm.foundation.datatypes.QueryExpression value );

}
