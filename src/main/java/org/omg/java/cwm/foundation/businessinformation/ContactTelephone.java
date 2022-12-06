/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.businessinformation;


/**
 * The ContactTelephone association relates telephones to the Contact instances that
 * reference them.
 */
public interface ContactTelephone {

  public boolean exists( org.omg.java.cwm.foundation.businessinformation.Telephone telephone, org.omg.java.cwm.foundation.businessinformation.Contact contact );

  public java.util.Collection<? extends org.omg.java.cwm.foundation.businessinformation.Contact> getContact( org.omg.java.cwm.foundation.businessinformation.Telephone telephone );

  public java.util.List<? extends org.omg.java.cwm.foundation.businessinformation.Telephone> getTelephone( org.omg.java.cwm.foundation.businessinformation.Contact contact );

  public boolean add( org.omg.java.cwm.foundation.businessinformation.Telephone telephone, org.omg.java.cwm.foundation.businessinformation.Contact contact );

  public boolean remove( org.omg.java.cwm.foundation.businessinformation.Telephone telephone, org.omg.java.cwm.foundation.businessinformation.Contact contact );

}
