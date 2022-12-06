/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface HierarchyLevelAssociation
extends org.omg.java.cwm.objectmodel.core.CoreClass {

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.analysis.olap.LevelBasedHierarchy getLevelBasedHierarchy();

  public void setLevelBasedHierarchy( org.omg.java.cwm.analysis.olap.LevelBasedHierarchy value );

  public org.omg.java.cwm.analysis.olap.Level getCurrentLevel();

  public void setCurrentLevel( org.omg.java.cwm.analysis.olap.Level value );

  public java.util.List<? extends org.omg.java.cwm.analysis.olap.DimensionDeployment> getDimensionDeployment();

}
