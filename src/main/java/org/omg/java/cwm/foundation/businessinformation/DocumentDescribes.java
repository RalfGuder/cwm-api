/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.businessinformation;


/**
 * The DocumentDescribes association connects a Document instance with the
 * ModelElement instances to which it pertains.
 */
public interface DocumentDescribes {

  public boolean exists( org.omg.java.cwm.objectmodel.core.ModelElement modelElement, org.omg.java.cwm.foundation.businessinformation.Document document );

  public java.util.Collection<? extends org.omg.java.cwm.foundation.businessinformation.Document> getDocument( org.omg.java.cwm.objectmodel.core.ModelElement modelElement );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.ModelElement> getModelElement( org.omg.java.cwm.foundation.businessinformation.Document document );

  public boolean add( org.omg.java.cwm.objectmodel.core.ModelElement modelElement, org.omg.java.cwm.foundation.businessinformation.Document document );

  public boolean remove( org.omg.java.cwm.objectmodel.core.ModelElement modelElement, org.omg.java.cwm.foundation.businessinformation.Document document );

}
