/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.multidimensional;



public interface MdschemaOwnsDimensionedObjects{

  public boolean exists( org.omg.java.cwm.resource.multidimensional.DimensionedObject dimensionedObject, org.omg.java.cwm.resource.multidimensional.Schema schema );

  public org.omg.java.cwm.resource.multidimensional.Schema getSchema( org.omg.java.cwm.resource.multidimensional.DimensionedObject dimensionedObject );

  public java.util.Collection getDimensionedObject( org.omg.java.cwm.resource.multidimensional.Schema schema );

  public boolean add( org.omg.java.cwm.resource.multidimensional.DimensionedObject dimensionedObject, org.omg.java.cwm.resource.multidimensional.Schema schema );

  public boolean remove( org.omg.java.cwm.resource.multidimensional.DimensionedObject dimensionedObject, org.omg.java.cwm.resource.multidimensional.Schema schema );

}
