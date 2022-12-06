/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.businessinformation;



public interface ResponsibleParty
extends org.omg.java.cwm.objectmodel.core.Namespace {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

	public java.lang.String getResponsibility();

  	public void setResponsibility( java.lang.String value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

	public java.util.List<? extends org.omg.java.cwm.foundation.businessinformation.Contact> getContact();

	public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.ModelElement> getModelElement();

}
