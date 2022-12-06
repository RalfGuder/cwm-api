/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.multidimensional;



public interface CompositesReferenceComponents{

  public boolean exists( org.omg.java.cwm.resource.multidimensional.Dimension composite, org.omg.java.cwm.resource.multidimensional.Dimension component );

  public java.util.Collection getComponent( org.omg.java.cwm.resource.multidimensional.Dimension composite );

  public java.util.Collection getComposite( org.omg.java.cwm.resource.multidimensional.Dimension component );

  public boolean add( org.omg.java.cwm.resource.multidimensional.Dimension composite, org.omg.java.cwm.resource.multidimensional.Dimension component );

  public boolean remove( org.omg.java.cwm.resource.multidimensional.Dimension composite, org.omg.java.cwm.resource.multidimensional.Dimension component );

}
