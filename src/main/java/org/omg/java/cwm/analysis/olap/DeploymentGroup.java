/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface DeploymentGroup
extends org.omg.java.cwm.objectmodel.core.Package {

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.analysis.olap.Schema getSchema();

  public void setSchema( org.omg.java.cwm.analysis.olap.Schema value );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.CubeDeployment> getCubeDeployment();

  public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.DimensionDeployment> getDimensionDeployment();

}
