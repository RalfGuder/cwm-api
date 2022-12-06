/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface LevelBasedHierarchyOwnsHierarchyLevelAssociations{

  public boolean exists( org.omg.java.cwm.analysis.olap.LevelBasedHierarchy levelBasedHierarchy, org.omg.java.cwm.analysis.olap.HierarchyLevelAssociation hierarchyLevelAssociation );

  public java.util.List<? extends org.omg.java.cwm.analysis.olap.HierarchyLevelAssociation> getHierarchyLevelAssociation( org.omg.java.cwm.analysis.olap.LevelBasedHierarchy levelBasedHierarchy );

  public org.omg.java.cwm.analysis.olap.LevelBasedHierarchy getLevelBasedHierarchy( org.omg.java.cwm.analysis.olap.HierarchyLevelAssociation hierarchyLevelAssociation );

  public boolean add( org.omg.java.cwm.analysis.olap.LevelBasedHierarchy levelBasedHierarchy, org.omg.java.cwm.analysis.olap.HierarchyLevelAssociation hierarchyLevelAssociation );

  public boolean remove( org.omg.java.cwm.analysis.olap.LevelBasedHierarchy levelBasedHierarchy, org.omg.java.cwm.analysis.olap.HierarchyLevelAssociation hierarchyLevelAssociation );

}
