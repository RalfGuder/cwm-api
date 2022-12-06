/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.datatypes;



public interface UnionDiscriminator {

  public boolean exists( org.omg.java.cwm.objectmodel.core.StructuralFeature discriminator, org.omg.java.cwm.foundation.datatypes.Union discriminatedUnion );

  public java.util.Collection<? extends org.omg.java.cwm.foundation.datatypes.Union> getDiscriminatedUnion( org.omg.java.cwm.objectmodel.core.StructuralFeature discriminator );

  public org.omg.java.cwm.objectmodel.core.StructuralFeature getDiscriminator( org.omg.java.cwm.foundation.datatypes.Union discriminatedUnion );

  public boolean add( org.omg.java.cwm.objectmodel.core.StructuralFeature discriminator, org.omg.java.cwm.foundation.datatypes.Union discriminatedUnion );

  public boolean remove( org.omg.java.cwm.objectmodel.core.StructuralFeature discriminator, org.omg.java.cwm.foundation.datatypes.Union discriminatedUnion );

}
