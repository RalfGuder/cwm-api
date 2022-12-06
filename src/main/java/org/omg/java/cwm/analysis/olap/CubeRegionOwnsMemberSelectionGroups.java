/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface CubeRegionOwnsMemberSelectionGroups{

  public boolean exists( org.omg.java.cwm.analysis.olap.MemberSelectionGroup memberSelectionGroup, org.omg.java.cwm.analysis.olap.CubeRegion cubeRegion );

  public org.omg.java.cwm.analysis.olap.CubeRegion getCubeRegion( org.omg.java.cwm.analysis.olap.MemberSelectionGroup memberSelectionGroup );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.MemberSelectionGroup> getMemberSelectionGroup( org.omg.java.cwm.analysis.olap.CubeRegion cubeRegion );

  public boolean add( org.omg.java.cwm.analysis.olap.MemberSelectionGroup memberSelectionGroup, org.omg.java.cwm.analysis.olap.CubeRegion cubeRegion );

  public boolean remove( org.omg.java.cwm.analysis.olap.MemberSelectionGroup memberSelectionGroup, org.omg.java.cwm.analysis.olap.CubeRegion cubeRegion );

}
