/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.businessinformation;


/**
 * The ContactEmail association indicates the Email instances relevant used by Contact
 * instances. 
 */
public interface ContactEmail{

  public boolean exists( org.omg.java.cwm.foundation.businessinformation.Email email, org.omg.java.cwm.foundation.businessinformation.Contact contact );

  /**
   * Identifies the Contact instance(s) for which this Email instance is relevant.
   * @param email
   * @return
   */
  public java.util.Collection<? extends org.omg.java.cwm.foundation.businessinformation.Contact> getContact( org.omg.java.cwm.foundation.businessinformation.Email email );

  public java.util.List<? extends org.omg.java.cwm.foundation.businessinformation.Email> getEmail( org.omg.java.cwm.foundation.businessinformation.Contact contact );

  public boolean add( org.omg.java.cwm.foundation.businessinformation.Email email, org.omg.java.cwm.foundation.businessinformation.Contact contact );

  public boolean remove( org.omg.java.cwm.foundation.businessinformation.Email email, org.omg.java.cwm.foundation.businessinformation.Contact contact );

}
