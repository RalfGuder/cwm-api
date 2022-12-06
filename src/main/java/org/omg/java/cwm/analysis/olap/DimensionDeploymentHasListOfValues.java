/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface DimensionDeploymentHasListOfValues{

  public boolean exists( org.omg.java.cwm.analysis.olap.StructureMap listOfValues, org.omg.java.cwm.analysis.olap.DimensionDeployment dimensionDeploymentLv );

  public org.omg.java.cwm.analysis.olap.DimensionDeployment getDimensionDeploymentLv( org.omg.java.cwm.analysis.olap.StructureMap listOfValues );

  public org.omg.java.cwm.analysis.olap.StructureMap getListOfValues( org.omg.java.cwm.analysis.olap.DimensionDeployment dimensionDeploymentLv );

  public boolean add( org.omg.java.cwm.analysis.olap.StructureMap listOfValues, org.omg.java.cwm.analysis.olap.DimensionDeployment dimensionDeploymentLv );

  public boolean remove( org.omg.java.cwm.analysis.olap.StructureMap listOfValues, org.omg.java.cwm.analysis.olap.DimensionDeployment dimensionDeploymentLv );

}
