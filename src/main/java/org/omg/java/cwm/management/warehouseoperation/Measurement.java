/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseoperation;



public interface Measurement
extends org.omg.java.cwm.objectmodel.core.ModelElement {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public float getValue();

  public void setValue( float value );

  public java.lang.String getUnit();

  public void setUnit( java.lang.String value );

  public java.lang.String getType();

  public void setType( java.lang.String value );

  public java.lang.String getCreationDate();

  public void setCreationDate( java.lang.String value );

  public java.lang.String getEffectiveDate();

  public void setEffectiveDate( java.lang.String value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.objectmodel.core.ModelElement getModelElement();

  public void setModelElement( org.omg.java.cwm.objectmodel.core.ModelElement value );

}
