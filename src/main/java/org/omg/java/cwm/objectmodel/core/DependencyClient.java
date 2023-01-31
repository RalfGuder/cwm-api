/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.core;

import javax.jmi.reflect.RefAssociation;

public interface DependencyClient extends RefAssociation{

  public boolean exists( org.omg.java.cwm.objectmodel.core.ModelElement client, org.omg.java.cwm.objectmodel.core.Dependency clientDependency );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.Dependency> getClientDependency( org.omg.java.cwm.objectmodel.core.ModelElement client );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.ModelElement> getClient( org.omg.java.cwm.objectmodel.core.Dependency clientDependency );

  public boolean add( org.omg.java.cwm.objectmodel.core.ModelElement client, org.omg.java.cwm.objectmodel.core.Dependency clientDependency );

  public boolean remove( org.omg.java.cwm.objectmodel.core.ModelElement client, org.omg.java.cwm.objectmodel.core.Dependency clientDependency );

}
