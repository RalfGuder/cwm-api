/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface MemberSelectionGroup
extends org.omg.java.cwm.objectmodel.core.CoreClass {

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

	public org.omg.java.cwm.analysis.olap.CubeRegion getCubeRegion();

	public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.MemberSelection> getMemberSelection();

	public void setCubeRegion( org.omg.java.cwm.analysis.olap.CubeRegion value );

}
