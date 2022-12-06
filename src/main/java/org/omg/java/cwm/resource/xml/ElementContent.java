/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.xml;



public interface ElementContent
extends org.omg.java.cwm.resource.xml.Content {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.resource.xml.OccurrenceType getOrder();

  public void setOrder( org.omg.java.cwm.resource.xml.OccurrenceType value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public java.util.Collection getOwnedContent();

  public java.util.Collection getOwnerContent();

}
