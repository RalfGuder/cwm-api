/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.businessinformation;



public interface Telephone
extends org.omg.java.cwm.objectmodel.core.ModelElement {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

	public java.lang.String getPhoneNumber();

	public void setPhoneNumber( java.lang.String value );

	public java.lang.String getPhoneType();

	public void setPhoneType( java.lang.String value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

	public java.util.Collection<? extends org.omg.java.cwm.foundation.businessinformation.Contact> getContact();

}
