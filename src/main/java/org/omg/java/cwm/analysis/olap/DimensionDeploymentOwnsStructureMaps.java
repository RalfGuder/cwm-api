/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface DimensionDeploymentOwnsStructureMaps{

  public boolean exists( org.omg.java.cwm.analysis.olap.StructureMap structureMap, org.omg.java.cwm.analysis.olap.DimensionDeployment dimensionDeployment );

  public org.omg.java.cwm.analysis.olap.DimensionDeployment getDimensionDeployment( org.omg.java.cwm.analysis.olap.StructureMap structureMap );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.StructureMap> getStructureMap( org.omg.java.cwm.analysis.olap.DimensionDeployment dimensionDeployment );

  public boolean add( org.omg.java.cwm.analysis.olap.StructureMap structureMap, org.omg.java.cwm.analysis.olap.DimensionDeployment dimensionDeployment );

  public boolean remove( org.omg.java.cwm.analysis.olap.StructureMap structureMap, org.omg.java.cwm.analysis.olap.DimensionDeployment dimensionDeployment );

}
