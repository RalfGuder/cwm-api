/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.core;



public interface RangeMultiplicity{

  public boolean exists( org.omg.java.cwm.objectmodel.core.Multiplicity multiplicity, org.omg.java.cwm.objectmodel.core.MultiplicityRange range );
  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.MultiplicityRange> getRange( org.omg.java.cwm.objectmodel.core.Multiplicity multiplicity );
  public org.omg.java.cwm.objectmodel.core.Multiplicity getMultiplicity( org.omg.java.cwm.objectmodel.core.MultiplicityRange range );
  public boolean add( org.omg.java.cwm.objectmodel.core.Multiplicity multiplicity, org.omg.java.cwm.objectmodel.core.MultiplicityRange range );
  public boolean remove( org.omg.java.cwm.objectmodel.core.Multiplicity multiplicity, org.omg.java.cwm.objectmodel.core.MultiplicityRange range );

}
