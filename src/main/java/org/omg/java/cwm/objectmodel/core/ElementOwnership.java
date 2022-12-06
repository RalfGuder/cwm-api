/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.core;



public interface ElementOwnership{

  public boolean exists( org.omg.java.cwm.objectmodel.core.ModelElement ownedElement, org.omg.java.cwm.objectmodel.core.Namespace namespace );

  public org.omg.java.cwm.objectmodel.core.Namespace getNamespace( org.omg.java.cwm.objectmodel.core.ModelElement ownedElement );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.ModelElement> getOwnedElement( org.omg.java.cwm.objectmodel.core.Namespace namespace );

  public boolean add( org.omg.java.cwm.objectmodel.core.ModelElement ownedElement, org.omg.java.cwm.objectmodel.core.Namespace namespace );

  public boolean remove( org.omg.java.cwm.objectmodel.core.ModelElement ownedElement, org.omg.java.cwm.objectmodel.core.Namespace namespace );

}
