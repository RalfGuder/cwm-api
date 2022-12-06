/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface HierarchyLevelAssocsReferenceLevel{

  public boolean exists( org.omg.java.cwm.analysis.olap.Level currentLevel, org.omg.java.cwm.analysis.olap.HierarchyLevelAssociation hierarchyLevelAssociation );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.HierarchyLevelAssociation> getHierarchyLevelAssociation( org.omg.java.cwm.analysis.olap.Level currentLevel );

  public org.omg.java.cwm.analysis.olap.Level getCurrentLevel( org.omg.java.cwm.analysis.olap.HierarchyLevelAssociation hierarchyLevelAssociation );

  public boolean add( org.omg.java.cwm.analysis.olap.Level currentLevel, org.omg.java.cwm.analysis.olap.HierarchyLevelAssociation hierarchyLevelAssociation );

  public boolean remove( org.omg.java.cwm.analysis.olap.Level currentLevel, org.omg.java.cwm.analysis.olap.HierarchyLevelAssociation hierarchyLevelAssociation );

}
