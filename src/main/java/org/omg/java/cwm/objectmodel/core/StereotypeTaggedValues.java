/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.core;



public interface StereotypeTaggedValues{

  public boolean exists( org.omg.java.cwm.objectmodel.core.TaggedValue requiredTag, org.omg.java.cwm.objectmodel.core.Stereotype stereotype );
  public org.omg.java.cwm.objectmodel.core.Stereotype getStereotype( org.omg.java.cwm.objectmodel.core.TaggedValue requiredTag );
  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.TaggedValue> getRequiredTag( org.omg.java.cwm.objectmodel.core.Stereotype stereotype );
  public boolean add( org.omg.java.cwm.objectmodel.core.TaggedValue requiredTag, org.omg.java.cwm.objectmodel.core.Stereotype stereotype );
  public boolean remove( org.omg.java.cwm.objectmodel.core.TaggedValue requiredTag, org.omg.java.cwm.objectmodel.core.Stereotype stereotype );

}
