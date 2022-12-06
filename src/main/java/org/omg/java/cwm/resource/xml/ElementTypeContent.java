/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.xml;



public interface ElementTypeContent {

  public boolean exists( org.omg.java.cwm.resource.xml.Content content, org.omg.java.cwm.resource.xml.ElementType elementType );

  public java.util.Collection getElementType( org.omg.java.cwm.resource.xml.Content content );

  public org.omg.java.cwm.resource.xml.Content getContent( org.omg.java.cwm.resource.xml.ElementType elementType );

  public boolean add( org.omg.java.cwm.resource.xml.Content content, org.omg.java.cwm.resource.xml.ElementType elementType );

  public boolean remove( org.omg.java.cwm.resource.xml.Content content, org.omg.java.cwm.resource.xml.ElementType elementType );

}
