/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface DimensionDeploymentHasImmediateParent{

  public boolean exists( org.omg.java.cwm.analysis.olap.StructureMap immediateParent, org.omg.java.cwm.analysis.olap.DimensionDeployment dimensionDeploymentIp );

  public org.omg.java.cwm.analysis.olap.DimensionDeployment getDimensionDeploymentIp( org.omg.java.cwm.analysis.olap.StructureMap immediateParent );

  public org.omg.java.cwm.analysis.olap.StructureMap getImmediateParent( org.omg.java.cwm.analysis.olap.DimensionDeployment dimensionDeploymentIp );

  public boolean add( org.omg.java.cwm.analysis.olap.StructureMap immediateParent, org.omg.java.cwm.analysis.olap.DimensionDeployment dimensionDeploymentIp );

  public boolean remove( org.omg.java.cwm.analysis.olap.StructureMap immediateParent, org.omg.java.cwm.analysis.olap.DimensionDeployment dimensionDeploymentIp );

}
