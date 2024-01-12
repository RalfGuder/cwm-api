package org.omg.java.cwm.objectmodel.core;

import java.util.Collection;

/**
 * A <b>abstract</b> model element is an element that is an abstraction drawn 
 * from the system being modeled.
 *
 * @author Ralf Guder
 *
 */
public interface ModelElement extends Element {

  public String getName();

  public void setName(java.lang.String value);

  public org.omg.java.cwm.objectmodel.core.VisibilityKind getVisibility();

  public void setVisibility(org.omg.java.cwm.objectmodel.core.VisibilityKind value);

  // ------------------------------------------------
  // ----- Reference-Generated -----
  // ------------------------------------------------

  public Collection<? extends Dependency> getClientDependency();

  public Collection<? extends Constraint> getConstraint();

  public Collection<? extends Package> getImporter();

  public org.omg.java.cwm.objectmodel.core.Namespace getNamespace();

  public void setNamespace(org.omg.java.cwm.objectmodel.core.Namespace value);

}
