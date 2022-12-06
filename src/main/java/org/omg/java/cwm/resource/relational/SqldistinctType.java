/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational;



public interface SqldistinctType
extends org.omg.java.cwm.resource.relational.SqldataType, org.omg.java.cwm.foundation.datatypes.TypeAlias {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public java.lang.Integer getLength();

  public void setLength( java.lang.Integer value );

  public java.lang.Integer getPrecision();

  public void setPrecision( java.lang.Integer value );

  public java.lang.Integer getScale();

  public void setScale( java.lang.Integer value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.resource.relational.SqlsimpleType getSqlSimpleType();

  public void setSqlSimpleType( org.omg.java.cwm.resource.relational.SqlsimpleType value );

}
