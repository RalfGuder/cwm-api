/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface MemberSelection
extends org.omg.java.cwm.objectmodel.core.CoreClass {

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.analysis.olap.Dimension getDimension();

  public void setDimension( org.omg.java.cwm.analysis.olap.Dimension value );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.MemberSelectionGroup> getMemberSelectionGroup();

}
