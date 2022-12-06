/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational;



public interface Column
extends org.omg.java.cwm.objectmodel.core.Attribute {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public java.lang.Integer getPrecision();

  public void setPrecision( java.lang.Integer value );

  public java.lang.Integer getScale();

  public void setScale( java.lang.Integer value );

  public org.omg.java.cwm.resource.relational.enumerations.NullableType getIsNullable();

  public void setIsNullable( org.omg.java.cwm.resource.relational.enumerations.NullableType value );

  public java.lang.Integer getLength();

  public void setLength( java.lang.Integer value );

  public java.lang.String getCollationName();

  public void setCollationName( java.lang.String value );

  public java.lang.String getCharacterSetName();

  public void setCharacterSetName( java.lang.String value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.resource.relational.NamedColumnSet getOptionScopeColumnSet();

  public void setOptionScopeColumnSet( org.omg.java.cwm.resource.relational.NamedColumnSet value );

  public org.omg.java.cwm.resource.relational.SqlstructuredType getReferencedTableType();

  public void setReferencedTableType( org.omg.java.cwm.resource.relational.SqlstructuredType value );

}
