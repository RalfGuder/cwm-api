/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface Cube
extends org.omg.java.cwm.objectmodel.core.CoreClass {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public boolean isVirtual();

  public void setVirtual( boolean value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.CubeDimensionAssociation> getCubeDimensionAssociation();

  public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.CubeRegion> getCubeRegion();

  public org.omg.java.cwm.analysis.olap.Schema getSchema();

  public void setSchema( org.omg.java.cwm.analysis.olap.Schema value );

}
