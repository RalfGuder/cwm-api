/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.xml;



public interface Content
extends org.omg.java.cwm.objectmodel.core.ModelElement {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.resource.xml.ContentType getType();

  public void setType( org.omg.java.cwm.resource.xml.ContentType value );

  public org.omg.java.cwm.resource.xml.OccurrenceType getOccurrence();

  public void setOccurrence( org.omg.java.cwm.resource.xml.OccurrenceType value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public java.util.Collection getElementType();

  public java.util.Collection getOwnedElementType();

}
