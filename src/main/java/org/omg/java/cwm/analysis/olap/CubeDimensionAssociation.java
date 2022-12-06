/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface CubeDimensionAssociation
extends org.omg.java.cwm.objectmodel.core.CoreClass {

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.analysis.olap.Dimension getDimension();

  public void setDimension( org.omg.java.cwm.analysis.olap.Dimension value );

  public org.omg.java.cwm.analysis.olap.Cube getCube();

  public void setCube( org.omg.java.cwm.analysis.olap.Cube value );

  public org.omg.java.cwm.analysis.olap.Hierarchy getCalcHierarchy();

  public void setCalcHierarchy( org.omg.java.cwm.analysis.olap.Hierarchy value );

}
