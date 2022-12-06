/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.multidimensional;



public interface MdschemaOwnsDimensions {

  public boolean exists( org.omg.java.cwm.resource.multidimensional.Dimension dimension, org.omg.java.cwm.resource.multidimensional.Schema schema );

  public org.omg.java.cwm.resource.multidimensional.Schema getSchema( org.omg.java.cwm.resource.multidimensional.Dimension dimension );

  public java.util.Collection getDimension( org.omg.java.cwm.resource.multidimensional.Schema schema );

  public boolean add( org.omg.java.cwm.resource.multidimensional.Dimension dimension, org.omg.java.cwm.resource.multidimensional.Schema schema );

  public boolean remove( org.omg.java.cwm.resource.multidimensional.Dimension dimension, org.omg.java.cwm.resource.multidimensional.Schema schema );

}
