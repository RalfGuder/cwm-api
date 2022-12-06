/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface CubeDeployment
extends org.omg.java.cwm.objectmodel.core.CoreClass {

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.analysis.olap.CubeRegion getCubeRegion();

  public void setCubeRegion( org.omg.java.cwm.analysis.olap.CubeRegion value );

  public org.omg.java.cwm.analysis.olap.DeploymentGroup getDeploymentGroup();

  public void setDeploymentGroup( org.omg.java.cwm.analysis.olap.DeploymentGroup value );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.ContentMap> getContentMap();

}
