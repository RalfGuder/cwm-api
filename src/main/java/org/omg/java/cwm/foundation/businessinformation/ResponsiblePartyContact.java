/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.businessinformation;



public interface ResponsiblePartyContact {

	public boolean exists( org.omg.java.cwm.foundation.businessinformation.Contact contact, org.omg.java.cwm.foundation.businessinformation.ResponsibleParty responsibleParty );

	public java.util.Collection<? extends org.omg.java.cwm.foundation.businessinformation.ResponsibleParty> getResponsibleParty( org.omg.java.cwm.foundation.businessinformation.Contact contact );

	public java.util.List<? extends org.omg.java.cwm.foundation.businessinformation.Contact> getContact( org.omg.java.cwm.foundation.businessinformation.ResponsibleParty responsibleParty );

	public boolean add( org.omg.java.cwm.foundation.businessinformation.Contact contact, org.omg.java.cwm.foundation.businessinformation.ResponsibleParty responsibleParty );

	public boolean remove( org.omg.java.cwm.foundation.businessinformation.Contact contact, org.omg.java.cwm.foundation.businessinformation.ResponsibleParty responsibleParty );

}
