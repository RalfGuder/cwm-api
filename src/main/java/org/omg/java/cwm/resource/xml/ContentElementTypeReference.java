/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.xml;



public interface ContentElementTypeReference{

  public boolean exists( org.omg.java.cwm.resource.xml.ElementTypeReference ownedElementType, org.omg.java.cwm.resource.xml.Content ownerContent );

  public java.util.Collection getOwnerContent( org.omg.java.cwm.resource.xml.ElementTypeReference ownedElementType );

  public java.util.Collection getOwnedElementType( org.omg.java.cwm.resource.xml.Content ownerContent );

  public boolean add( org.omg.java.cwm.resource.xml.ElementTypeReference ownedElementType, org.omg.java.cwm.resource.xml.Content ownerContent );

  public boolean remove( org.omg.java.cwm.resource.xml.ElementTypeReference ownedElementType, org.omg.java.cwm.resource.xml.Content ownerContent );

}
