/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface DeploymentGroupReferencesCubeDeployments{

  public boolean exists( org.omg.java.cwm.analysis.olap.CubeDeployment cubeDeployment, org.omg.java.cwm.analysis.olap.DeploymentGroup deploymentGroup );

  public org.omg.java.cwm.analysis.olap.DeploymentGroup getDeploymentGroup( org.omg.java.cwm.analysis.olap.CubeDeployment cubeDeployment );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.CubeDeployment> getCubeDeployment( org.omg.java.cwm.analysis.olap.DeploymentGroup deploymentGroup );

  public boolean add( org.omg.java.cwm.analysis.olap.CubeDeployment cubeDeployment, org.omg.java.cwm.analysis.olap.DeploymentGroup deploymentGroup );

  public boolean remove( org.omg.java.cwm.analysis.olap.CubeDeployment cubeDeployment, org.omg.java.cwm.analysis.olap.DeploymentGroup deploymentGroup );

}
