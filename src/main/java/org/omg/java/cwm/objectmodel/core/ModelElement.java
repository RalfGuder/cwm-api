/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.core;



public interface ModelElement
extends org.omg.java.cwm.objectmodel.core.Element, javax.jmi.reflect.RefObject {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public java.lang.String getName();

  public void setName( java.lang.String value );

  public org.omg.java.cwm.objectmodel.core.VisibilityKind getVisibility();

  public void setVisibility( org.omg.java.cwm.objectmodel.core.VisibilityKind value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.Dependency> getClientDependency();

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.Constraint> getConstraint();

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.Package> getImporter();

  public org.omg.java.cwm.objectmodel.core.Namespace getNamespace();

  public void setNamespace( org.omg.java.cwm.objectmodel.core.Namespace value );

}
