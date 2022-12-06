/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational;



public interface Sqlindex
extends org.omg.java.cwm.foundation.keysindexes.Index {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public java.lang.String getFilterCondition();

  public void setFilterCondition( java.lang.String value );

  public boolean isNullable();

  public void setNullable( boolean value );

  public boolean isAutoUpdate();

  public void setAutoUpdate( boolean value );

}
