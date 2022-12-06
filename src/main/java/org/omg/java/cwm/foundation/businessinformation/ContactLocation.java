/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.businessinformation;



public interface ContactLocation{

  public boolean exists( org.omg.java.cwm.foundation.businessinformation.Location location, org.omg.java.cwm.foundation.businessinformation.Contact contact );

  public java.util.Collection<? extends org.omg.java.cwm.foundation.businessinformation.Contact> getContact( org.omg.java.cwm.foundation.businessinformation.Location location );

  public java.util.List<? extends org.omg.java.cwm.foundation.businessinformation.Location> getLocation( org.omg.java.cwm.foundation.businessinformation.Contact contact );

  public boolean add( org.omg.java.cwm.foundation.businessinformation.Location location, org.omg.java.cwm.foundation.businessinformation.Contact contact );

  public boolean remove( org.omg.java.cwm.foundation.businessinformation.Location location, org.omg.java.cwm.foundation.businessinformation.Contact contact );

}
