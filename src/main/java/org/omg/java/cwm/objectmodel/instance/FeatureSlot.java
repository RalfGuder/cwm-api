/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.instance;



public interface FeatureSlot{

  public boolean exists( org.omg.java.cwm.objectmodel.core.StructuralFeature feature, org.omg.java.cwm.objectmodel.instance.Slot slot );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.instance.Slot> getSlot( org.omg.java.cwm.objectmodel.core.StructuralFeature feature );

  public org.omg.java.cwm.objectmodel.core.StructuralFeature getFeature( org.omg.java.cwm.objectmodel.instance.Slot slot );

  public boolean add( org.omg.java.cwm.objectmodel.core.StructuralFeature feature, org.omg.java.cwm.objectmodel.instance.Slot slot );

  public boolean remove( org.omg.java.cwm.objectmodel.core.StructuralFeature feature, org.omg.java.cwm.objectmodel.instance.Slot slot );

}
