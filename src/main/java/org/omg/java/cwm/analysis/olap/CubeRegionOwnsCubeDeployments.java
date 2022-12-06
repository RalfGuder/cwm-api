/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface CubeRegionOwnsCubeDeployments{

  public boolean exists( org.omg.java.cwm.analysis.olap.CubeDeployment cubeDeployment, org.omg.java.cwm.analysis.olap.CubeRegion cubeRegion );

  public org.omg.java.cwm.analysis.olap.CubeRegion getCubeRegion( org.omg.java.cwm.analysis.olap.CubeDeployment cubeDeployment );

  public java.util.List<? extends  org.omg.java.cwm.analysis.olap.CubeDeployment> getCubeDeployment( org.omg.java.cwm.analysis.olap.CubeRegion cubeRegion );

  public boolean add( org.omg.java.cwm.analysis.olap.CubeDeployment cubeDeployment, org.omg.java.cwm.analysis.olap.CubeRegion cubeRegion );

  public boolean remove( org.omg.java.cwm.analysis.olap.CubeDeployment cubeDeployment, org.omg.java.cwm.analysis.olap.CubeRegion cubeRegion );

}
