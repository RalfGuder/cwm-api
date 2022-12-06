/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.businessinformation;



public interface ModelElementDescription {

  public boolean exists( org.omg.java.cwm.objectmodel.core.ModelElement modelElement, org.omg.java.cwm.foundation.businessinformation.Description description );

  /**
   * The ModelElementDescription association connects a Description instance with the
   * ModelElement instances to which it applies.
   * @param modelElement
   * @return
   */
  public java.util.Collection<? extends org.omg.java.cwm.foundation.businessinformation.Description> getDescription( org.omg.java.cwm.objectmodel.core.ModelElement modelElement );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.ModelElement> getModelElement( org.omg.java.cwm.foundation.businessinformation.Description description );

  public boolean add( org.omg.java.cwm.objectmodel.core.ModelElement modelElement, org.omg.java.cwm.foundation.businessinformation.Description description );

  public boolean remove( org.omg.java.cwm.objectmodel.core.ModelElement modelElement, org.omg.java.cwm.foundation.businessinformation.Description description );

}
