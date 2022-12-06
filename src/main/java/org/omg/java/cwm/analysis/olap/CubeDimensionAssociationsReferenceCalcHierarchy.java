/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface CubeDimensionAssociationsReferenceCalcHierarchy{

  public boolean exists( org.omg.java.cwm.analysis.olap.Hierarchy calcHierarchy, org.omg.java.cwm.analysis.olap.CubeDimensionAssociation cubeDimensionAssociation );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.CubeDimensionAssociation> getCubeDimensionAssociation( org.omg.java.cwm.analysis.olap.Hierarchy calcHierarchy );

  public org.omg.java.cwm.analysis.olap.Hierarchy getCalcHierarchy( org.omg.java.cwm.analysis.olap.CubeDimensionAssociation cubeDimensionAssociation );

  public boolean add( org.omg.java.cwm.analysis.olap.Hierarchy calcHierarchy, org.omg.java.cwm.analysis.olap.CubeDimensionAssociation cubeDimensionAssociation );

  public boolean remove( org.omg.java.cwm.analysis.olap.Hierarchy calcHierarchy, org.omg.java.cwm.analysis.olap.CubeDimensionAssociation cubeDimensionAssociation );

}
