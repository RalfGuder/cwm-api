/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface SchemaOwnsDeploymentGroups{

  public boolean exists( org.omg.java.cwm.analysis.olap.DeploymentGroup deploymentGroup, org.omg.java.cwm.analysis.olap.Schema schema );

  public org.omg.java.cwm.analysis.olap.Schema getSchema( org.omg.java.cwm.analysis.olap.DeploymentGroup deploymentGroup );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.DeploymentGroup> getDeploymentGroup( org.omg.java.cwm.analysis.olap.Schema schema );

  public boolean add( org.omg.java.cwm.analysis.olap.DeploymentGroup deploymentGroup, org.omg.java.cwm.analysis.olap.Schema schema );

  public boolean remove( org.omg.java.cwm.analysis.olap.DeploymentGroup deploymentGroup, org.omg.java.cwm.analysis.olap.Schema schema );

}
