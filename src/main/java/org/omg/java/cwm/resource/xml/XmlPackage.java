/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.xml;



public interface XmlPackage{

  public org.omg.java.cwm.objectmodel.core.CorePackage getCore();

  public org.omg.java.cwm.objectmodel.instance.InstancePackage getInstance();

  public org.omg.java.cwm.resource.xml.SchemaClass getSchema();

  public org.omg.java.cwm.resource.xml.ElementTypeClass getElementType();

  public org.omg.java.cwm.resource.xml.AttributeClass getAttribute();

  public org.omg.java.cwm.resource.xml.ContentClass getContent();

  public org.omg.java.cwm.resource.xml.ElementContentClass getElementContent();

  public org.omg.java.cwm.resource.xml.MixedContentClass getMixedContent();

  public org.omg.java.cwm.resource.xml.ElementTypeReferenceClass getElementTypeReference();

  public org.omg.java.cwm.resource.xml.TextClass getText();

  public org.omg.java.cwm.resource.xml.ElementClass getElement();

  public org.omg.java.cwm.resource.xml.DocumentClass getDocument();

  public org.omg.java.cwm.resource.xml.MixedContentText getMixedContentText();

  public org.omg.java.cwm.resource.xml.ContentElementTypeReference getContentElementTypeReference();

  public org.omg.java.cwm.resource.xml.OwnedElementContent getOwnedElementContent();

  public org.omg.java.cwm.resource.xml.ElementTypeContent getElementTypeContent();

}
