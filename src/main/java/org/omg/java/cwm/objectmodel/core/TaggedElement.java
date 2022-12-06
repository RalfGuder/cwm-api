/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.core;


public interface TaggedElement{

  public boolean exists( ModelElement modelElement, TaggedValue taggedValue );

  public java.util.Collection<TaggedValue> getTaggedValue( ModelElement modelElement );

  public ModelElement getModelElement( TaggedValue taggedValue );

  public boolean add( ModelElement modelElement, TaggedValue taggedValue );

  public boolean remove( ModelElement modelElement, TaggedValue taggedValue );

}
