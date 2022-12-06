/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface Dimension
extends org.omg.java.cwm.objectmodel.core.CoreClass {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public boolean isTime();

  public void setTime( boolean value );

  public boolean isMeasure();

  public void setMeasure( boolean value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.Hierarchy> getHierarchy();

  public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.MemberSelection> getMemberSelection();

  public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.CubeDimensionAssociation> getCubeDimensionAssociation();

  public org.omg.java.cwm.analysis.olap.Hierarchy getDisplayDefault();

  public void setDisplayDefault( org.omg.java.cwm.analysis.olap.Hierarchy value );

  public org.omg.java.cwm.analysis.olap.Schema getSchema();

  public void setSchema( org.omg.java.cwm.analysis.olap.Schema value );

}
