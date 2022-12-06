/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.businessinformation;



public interface Contact
extends org.omg.java.cwm.objectmodel.core.ModelElement {

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

	public java.util.List<? extends org.omg.java.cwm.foundation.businessinformation.Email> getEmail();

	public java.util.List<? extends org.omg.java.cwm.foundation.businessinformation.Location> getLocation();

	public java.util.Collection<? extends org.omg.java.cwm.foundation.businessinformation.ResponsibleParty> getResponsibleParty();

  	public java.util.List<? extends org.omg.java.cwm.foundation.businessinformation.Telephone> getTelephone();

  	public java.util.List<? extends org.omg.java.cwm.foundation.businessinformation.ResourceLocator> getUrl();

}
