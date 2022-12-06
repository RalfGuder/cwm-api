/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface DimensionOwnsHierarchies{

  public boolean exists( org.omg.java.cwm.analysis.olap.Dimension dimension, org.omg.java.cwm.analysis.olap.Hierarchy hierarchy );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.Hierarchy> getHierarchy( org.omg.java.cwm.analysis.olap.Dimension dimension );

  public org.omg.java.cwm.analysis.olap.Dimension getDimension( org.omg.java.cwm.analysis.olap.Hierarchy hierarchy );

  public boolean add( org.omg.java.cwm.analysis.olap.Dimension dimension, org.omg.java.cwm.analysis.olap.Hierarchy hierarchy );

  public boolean remove( org.omg.java.cwm.analysis.olap.Dimension dimension, org.omg.java.cwm.analysis.olap.Hierarchy hierarchy );

}
