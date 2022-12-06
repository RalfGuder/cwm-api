/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.multidimensional;



public interface DimensionOwnsMemberSets {

  public boolean exists( org.omg.java.cwm.resource.multidimensional.MemberSet memberSet, org.omg.java.cwm.resource.multidimensional.Dimension dimension );

  public org.omg.java.cwm.resource.multidimensional.Dimension getDimension( org.omg.java.cwm.resource.multidimensional.MemberSet memberSet );

  public java.util.Collection getMemberSet( org.omg.java.cwm.resource.multidimensional.Dimension dimension );

  public boolean add( org.omg.java.cwm.resource.multidimensional.MemberSet memberSet, org.omg.java.cwm.resource.multidimensional.Dimension dimension );

  public boolean remove( org.omg.java.cwm.resource.multidimensional.MemberSet memberSet, org.omg.java.cwm.resource.multidimensional.Dimension dimension );

}
