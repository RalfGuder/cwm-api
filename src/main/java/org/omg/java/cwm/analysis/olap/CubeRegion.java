/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface CubeRegion
extends org.omg.java.cwm.objectmodel.core.CoreClass {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public boolean isReadOnly();

  public void setReadOnly( boolean value );

  public boolean isFullyRealized();

  public void setFullyRealized( boolean value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.MemberSelectionGroup> getMemberSelectionGroup();

  public org.omg.java.cwm.analysis.olap.Cube getCube();

  public void setCube( org.omg.java.cwm.analysis.olap.Cube value );

  public java.util.List<? extends  org.omg.java.cwm.analysis.olap.CubeDeployment> getCubeDeployment();

}
