/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface CubeOwnsCubeRegions {

  public boolean exists( org.omg.java.cwm.analysis.olap.CubeRegion cubeRegion, org.omg.java.cwm.analysis.olap.Cube cube );

  public org.omg.java.cwm.analysis.olap.Cube getCube( org.omg.java.cwm.analysis.olap.CubeRegion cubeRegion );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.CubeRegion> getCubeRegion( org.omg.java.cwm.analysis.olap.Cube cube );

  public boolean add( org.omg.java.cwm.analysis.olap.CubeRegion cubeRegion, org.omg.java.cwm.analysis.olap.Cube cube );

  public boolean remove( org.omg.java.cwm.analysis.olap.CubeRegion cubeRegion, org.omg.java.cwm.analysis.olap.Cube cube );

}
