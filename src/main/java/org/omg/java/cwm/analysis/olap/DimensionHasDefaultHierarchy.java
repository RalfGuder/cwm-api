/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface DimensionHasDefaultHierarchy{

  public boolean exists( org.omg.java.cwm.analysis.olap.Hierarchy displayDefault, org.omg.java.cwm.analysis.olap.Dimension defaultedDimension );

  public org.omg.java.cwm.analysis.olap.Dimension getDefaultedDimension( org.omg.java.cwm.analysis.olap.Hierarchy displayDefault );

  public org.omg.java.cwm.analysis.olap.Hierarchy getDisplayDefault( org.omg.java.cwm.analysis.olap.Dimension defaultedDimension );

  public boolean add( org.omg.java.cwm.analysis.olap.Hierarchy displayDefault, org.omg.java.cwm.analysis.olap.Dimension defaultedDimension );

  public boolean remove( org.omg.java.cwm.analysis.olap.Hierarchy displayDefault, org.omg.java.cwm.analysis.olap.Dimension defaultedDimension );

}
