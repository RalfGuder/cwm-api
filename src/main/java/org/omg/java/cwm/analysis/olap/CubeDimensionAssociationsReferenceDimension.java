/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface CubeDimensionAssociationsReferenceDimension{

  public boolean exists( org.omg.java.cwm.analysis.olap.Dimension dimension, org.omg.java.cwm.analysis.olap.CubeDimensionAssociation cubeDimensionAssociation );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.CubeDimensionAssociation> getCubeDimensionAssociation( org.omg.java.cwm.analysis.olap.Dimension dimension );

  public org.omg.java.cwm.analysis.olap.Dimension getDimension( org.omg.java.cwm.analysis.olap.CubeDimensionAssociation cubeDimensionAssociation );

  public boolean add( org.omg.java.cwm.analysis.olap.Dimension dimension, org.omg.java.cwm.analysis.olap.CubeDimensionAssociation cubeDimensionAssociation );

  public boolean remove( org.omg.java.cwm.analysis.olap.Dimension dimension, org.omg.java.cwm.analysis.olap.CubeDimensionAssociation cubeDimensionAssociation );

}
