/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.xml;



public interface MixedContentText {

  public boolean exists( org.omg.java.cwm.resource.xml.Text text, org.omg.java.cwm.resource.xml.MixedContent ownerContent );

  public org.omg.java.cwm.resource.xml.MixedContent getOwnerContent( org.omg.java.cwm.resource.xml.Text text );

  public org.omg.java.cwm.resource.xml.Text getText( org.omg.java.cwm.resource.xml.MixedContent ownerContent );

  public boolean add( org.omg.java.cwm.resource.xml.Text text, org.omg.java.cwm.resource.xml.MixedContent ownerContent );

  public boolean remove( org.omg.java.cwm.resource.xml.Text text, org.omg.java.cwm.resource.xml.MixedContent ownerContent );

}
