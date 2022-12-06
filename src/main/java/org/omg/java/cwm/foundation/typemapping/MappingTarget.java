/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.typemapping;



public interface MappingTarget {

  public boolean exists( org.omg.java.cwm.objectmodel.core.Classifier targetType, org.omg.java.cwm.foundation.typemapping.TypeMapping mappingTo );

  public java.util.Collection<? extends org.omg.java.cwm.foundation.typemapping.TypeMapping> getMappingTo( org.omg.java.cwm.objectmodel.core.Classifier targetType );

  public org.omg.java.cwm.objectmodel.core.Classifier getTargetType( org.omg.java.cwm.foundation.typemapping.TypeMapping mappingTo );

  public boolean add( org.omg.java.cwm.objectmodel.core.Classifier targetType, org.omg.java.cwm.foundation.typemapping.TypeMapping mappingTo );

  public boolean remove( org.omg.java.cwm.objectmodel.core.Classifier targetType, org.omg.java.cwm.foundation.typemapping.TypeMapping mappingTo );

}
