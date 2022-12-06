/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.xml;



public interface OwnedElementContent{

  public boolean exists( org.omg.java.cwm.resource.xml.ElementContent ownerContent, org.omg.java.cwm.resource.xml.ElementContent ownedContent );

  public java.util.Collection getOwnedContent( org.omg.java.cwm.resource.xml.ElementContent ownerContent );

  public java.util.Collection getOwnerContent( org.omg.java.cwm.resource.xml.ElementContent ownedContent );

  public boolean add( org.omg.java.cwm.resource.xml.ElementContent ownerContent, org.omg.java.cwm.resource.xml.ElementContent ownedContent );

  public boolean remove( org.omg.java.cwm.resource.xml.ElementContent ownerContent, org.omg.java.cwm.resource.xml.ElementContent ownedContent );

}
