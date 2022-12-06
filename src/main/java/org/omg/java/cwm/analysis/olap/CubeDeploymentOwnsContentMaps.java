/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface CubeDeploymentOwnsContentMaps{

  public boolean exists( org.omg.java.cwm.analysis.olap.ContentMap contentMap, org.omg.java.cwm.analysis.olap.CubeDeployment cubeDeployment );

  public org.omg.java.cwm.analysis.olap.CubeDeployment getCubeDeployment( org.omg.java.cwm.analysis.olap.ContentMap contentMap );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.ContentMap> getContentMap( org.omg.java.cwm.analysis.olap.CubeDeployment cubeDeployment );

  public boolean add( org.omg.java.cwm.analysis.olap.ContentMap contentMap, org.omg.java.cwm.analysis.olap.CubeDeployment cubeDeployment );

  public boolean remove( org.omg.java.cwm.analysis.olap.ContentMap contentMap, org.omg.java.cwm.analysis.olap.CubeDeployment cubeDeployment );

}
