/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface HierarchyLevelAssociationOwnsDimensionDeployments{

  public boolean exists( org.omg.java.cwm.analysis.olap.DimensionDeployment dimensionDeployment, org.omg.java.cwm.analysis.olap.HierarchyLevelAssociation hierarchyLevelAssociation );

  public org.omg.java.cwm.analysis.olap.HierarchyLevelAssociation getHierarchyLevelAssociation( org.omg.java.cwm.analysis.olap.DimensionDeployment dimensionDeployment );

  public java.util.List<? extends org.omg.java.cwm.analysis.olap.DimensionDeployment> getDimensionDeployment( org.omg.java.cwm.analysis.olap.HierarchyLevelAssociation hierarchyLevelAssociation );

  public boolean add( org.omg.java.cwm.analysis.olap.DimensionDeployment dimensionDeployment, org.omg.java.cwm.analysis.olap.HierarchyLevelAssociation hierarchyLevelAssociation );

  public boolean remove( org.omg.java.cwm.analysis.olap.DimensionDeployment dimensionDeployment, org.omg.java.cwm.analysis.olap.HierarchyLevelAssociation hierarchyLevelAssociation );

}
