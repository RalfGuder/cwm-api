/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.instance;



public interface SlotValue{

  public boolean exists( org.omg.java.cwm.objectmodel.instance.Slot valueSlot, org.omg.java.cwm.objectmodel.instance.Instance value );

  public org.omg.java.cwm.objectmodel.instance.Instance getValue( org.omg.java.cwm.objectmodel.instance.Slot valueSlot );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.instance.Slot> getValueSlot( org.omg.java.cwm.objectmodel.instance.Instance value );

  public boolean add( org.omg.java.cwm.objectmodel.instance.Slot valueSlot, org.omg.java.cwm.objectmodel.instance.Instance value );

  public boolean remove( org.omg.java.cwm.objectmodel.instance.Slot valueSlot, org.omg.java.cwm.objectmodel.instance.Instance value );

}
