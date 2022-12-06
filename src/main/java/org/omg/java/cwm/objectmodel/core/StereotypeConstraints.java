/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.core;



public interface StereotypeConstraints {

  public boolean exists( org.omg.java.cwm.objectmodel.core.Constraint stereotypeConstraint, org.omg.java.cwm.objectmodel.core.Stereotype constrainedStereotype );
  public org.omg.java.cwm.objectmodel.core.Stereotype getConstrainedStereotype( org.omg.java.cwm.objectmodel.core.Constraint stereotypeConstraint );
  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.Constraint> getStereotypeConstraint( org.omg.java.cwm.objectmodel.core.Stereotype constrainedStereotype );
  public boolean add( org.omg.java.cwm.objectmodel.core.Constraint stereotypeConstraint, org.omg.java.cwm.objectmodel.core.Stereotype constrainedStereotype );
  public boolean remove( org.omg.java.cwm.objectmodel.core.Constraint stereotypeConstraint, org.omg.java.cwm.objectmodel.core.Stereotype constrainedStereotype );

}
