/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.businessinformation;


/**
 * The ContactResourceLocator association relates ResourceLocator instances to the
 * Contact instances in which they participate.
 */
public interface ContactResourceLocator {

	public boolean exists( org.omg.java.cwm.foundation.businessinformation.ResourceLocator url, org.omg.java.cwm.foundation.businessinformation.Contact contact );

	public java.util.Collection<? extends org.omg.java.cwm.foundation.businessinformation.Contact> getContact( org.omg.java.cwm.foundation.businessinformation.ResourceLocator url );

	public java.util.List<? extends org.omg.java.cwm.foundation.businessinformation.ResourceLocator> getUrl( org.omg.java.cwm.foundation.businessinformation.Contact contact );

	public boolean add( org.omg.java.cwm.foundation.businessinformation.ResourceLocator url, org.omg.java.cwm.foundation.businessinformation.Contact contact );

	public boolean remove( org.omg.java.cwm.foundation.businessinformation.ResourceLocator url, org.omg.java.cwm.foundation.businessinformation.Contact contact );

}
