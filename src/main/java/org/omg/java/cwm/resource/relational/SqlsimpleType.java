/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational;



public interface SqlsimpleType
extends org.omg.java.cwm.resource.relational.SqldataType, org.omg.java.cwm.objectmodel.core.DataType {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public java.lang.Integer getCharacterMaximumLength();

  public void setCharacterMaximumLength( java.lang.Integer value );

  public java.lang.Integer getCharacterOctetLength();

  public void setCharacterOctetLength( java.lang.Integer value );

  public java.lang.Integer getNumericPrecision();

  public void setNumericPrecision( java.lang.Integer value );

  public java.lang.Integer getNumericPrecisionRadix();

  public void setNumericPrecisionRadix( java.lang.Integer value );

  public java.lang.Integer getNumericScale();

  public void setNumericScale( java.lang.Integer value );

  public java.lang.Integer getDateTimePrecision();

  public void setDateTimePrecision( java.lang.Integer value );

}
