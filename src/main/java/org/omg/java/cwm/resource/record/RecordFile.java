/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.record;



public interface RecordFile
extends org.omg.java.cwm.objectmodel.core.Package {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public boolean isSelfDescribing();

  public void setSelfDescribing( boolean value );

  public java.lang.Integer getRecordDelimiter();

  public void setRecordDelimiter( java.lang.Integer value );

  public java.lang.Integer getSkipRecords();

  public void setSkipRecords( java.lang.Integer value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public java.util.List getRecord();

}
