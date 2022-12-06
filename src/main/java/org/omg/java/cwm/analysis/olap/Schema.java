/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface Schema
extends org.omg.java.cwm.objectmodel.core.Package {

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

	public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.Cube> getCube();

	public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.Dimension> getDimension();

  	public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.DeploymentGroup> getDeploymentGroup();

}
