/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.core;

/**
 * The DependencyClient association links Dependency instances with ModelElements that act as clients in the represented dependency relationship.
 */
public interface DependencyClient{

  public boolean exists( org.omg.java.cwm.objectmodel.core.ModelElement client, org.omg.java.cwm.objectmodel.core.Dependency clientDependency );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.Dependency> getClientDependency( org.omg.java.cwm.objectmodel.core.ModelElement client );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.ModelElement> getClient( org.omg.java.cwm.objectmodel.core.Dependency clientDependency );

  public boolean add( org.omg.java.cwm.objectmodel.core.ModelElement client, org.omg.java.cwm.objectmodel.core.Dependency clientDependency );

  public boolean remove( org.omg.java.cwm.objectmodel.core.ModelElement client, org.omg.java.cwm.objectmodel.core.Dependency clientDependency );

}
