/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.core;

import javax.jmi.reflect.RefAssociation;

public interface ElementConstraint extends RefAssociation{

  public boolean exists( org.omg.java.cwm.objectmodel.core.ModelElement constrainedElement, org.omg.java.cwm.objectmodel.core.Constraint constraint );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.Constraint> getConstraint( org.omg.java.cwm.objectmodel.core.ModelElement constrainedElement );

  public java.util.List<? extends org.omg.java.cwm.objectmodel.core.ModelElement> getConstrainedElement( org.omg.java.cwm.objectmodel.core.Constraint constraint );

  public boolean add( org.omg.java.cwm.objectmodel.core.ModelElement constrainedElement, org.omg.java.cwm.objectmodel.core.Constraint constraint );

  public boolean remove( org.omg.java.cwm.objectmodel.core.ModelElement constrainedElement, org.omg.java.cwm.objectmodel.core.Constraint constraint );

}
