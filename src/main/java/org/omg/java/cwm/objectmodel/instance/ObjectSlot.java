/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.instance;



public interface ObjectSlot{

  public boolean exists( org.omg.java.cwm.objectmodel.instance.Slot slot, org.omg.java.cwm.objectmodel.instance.Object object );

  public org.omg.java.cwm.objectmodel.instance.Object getObject( org.omg.java.cwm.objectmodel.instance.Slot slot );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.instance.Slot> getSlot( org.omg.java.cwm.objectmodel.instance.Object object );

  public boolean add( org.omg.java.cwm.objectmodel.instance.Slot slot, org.omg.java.cwm.objectmodel.instance.Object object );

  public boolean remove( org.omg.java.cwm.objectmodel.instance.Slot slot, org.omg.java.cwm.objectmodel.instance.Object object );

}
