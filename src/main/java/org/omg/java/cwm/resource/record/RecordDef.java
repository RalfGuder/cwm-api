/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.record;



public interface RecordDef
extends org.omg.java.cwm.objectmodel.core.CoreClass {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public java.lang.String getFieldDelimiter();

  public void setFieldDelimiter( java.lang.String value );

  public boolean isFixedWidth();

  public void setFixedWidth( boolean value );

  public java.lang.String getTextDelimiter();

  public void setTextDelimiter( java.lang.String value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public java.util.Collection getFile();

}
