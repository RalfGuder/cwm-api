/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface CubeOwnsCubeDimensionAssociations{

  public boolean exists( org.omg.java.cwm.analysis.olap.Cube cube, org.omg.java.cwm.analysis.olap.CubeDimensionAssociation cubeDimensionAssociation );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.CubeDimensionAssociation> getCubeDimensionAssociation( org.omg.java.cwm.analysis.olap.Cube cube );

  public org.omg.java.cwm.analysis.olap.Cube getCube( org.omg.java.cwm.analysis.olap.CubeDimensionAssociation cubeDimensionAssociation );

  public boolean add( org.omg.java.cwm.analysis.olap.Cube cube, org.omg.java.cwm.analysis.olap.CubeDimensionAssociation cubeDimensionAssociation );

  public boolean remove( org.omg.java.cwm.analysis.olap.Cube cube, org.omg.java.cwm.analysis.olap.CubeDimensionAssociation cubeDimensionAssociation );

}
