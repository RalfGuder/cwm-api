/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface DimensionDeployment
extends org.omg.java.cwm.objectmodel.core.CoreClass {

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.analysis.olap.HierarchyLevelAssociation getHierarchyLevelAssociation();

  public void setHierarchyLevelAssociation( org.omg.java.cwm.analysis.olap.HierarchyLevelAssociation value );

  public org.omg.java.cwm.analysis.olap.ValueBasedHierarchy getValueBasedHierarchy();

  public void setValueBasedHierarchy( org.omg.java.cwm.analysis.olap.ValueBasedHierarchy value );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.StructureMap> getStructureMap();

  public org.omg.java.cwm.analysis.olap.StructureMap getListOfValues();

  public void setListOfValues( org.omg.java.cwm.analysis.olap.StructureMap value );

  public org.omg.java.cwm.analysis.olap.StructureMap getImmediateParent();

  public void setImmediateParent( org.omg.java.cwm.analysis.olap.StructureMap value );

  public org.omg.java.cwm.analysis.olap.DeploymentGroup getDeploymentGroup();

  public void setDeploymentGroup( org.omg.java.cwm.analysis.olap.DeploymentGroup value );

}
