/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface SchemaOwnsDimensions {

  public boolean exists( org.omg.java.cwm.analysis.olap.Dimension dimension, org.omg.java.cwm.analysis.olap.Schema schema );

  public org.omg.java.cwm.analysis.olap.Schema getSchema( org.omg.java.cwm.analysis.olap.Dimension dimension );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.Dimension> getDimension( org.omg.java.cwm.analysis.olap.Schema schema );

  public boolean add( org.omg.java.cwm.analysis.olap.Dimension dimension, org.omg.java.cwm.analysis.olap.Schema schema );

  public boolean remove( org.omg.java.cwm.analysis.olap.Dimension dimension, org.omg.java.cwm.analysis.olap.Schema schema );

}
