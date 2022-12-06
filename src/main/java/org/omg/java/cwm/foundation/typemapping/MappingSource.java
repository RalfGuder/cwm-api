/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.typemapping;



public interface MappingSource{

  public boolean exists( org.omg.java.cwm.objectmodel.core.Classifier sourceType, org.omg.java.cwm.foundation.typemapping.TypeMapping mappingFrom );

  public java.util.Collection<? extends org.omg.java.cwm.foundation.typemapping.TypeMapping> getMappingFrom( org.omg.java.cwm.objectmodel.core.Classifier sourceType );

  public org.omg.java.cwm.objectmodel.core.Classifier getSourceType( org.omg.java.cwm.foundation.typemapping.TypeMapping mappingFrom );

  public boolean add( org.omg.java.cwm.objectmodel.core.Classifier sourceType, org.omg.java.cwm.foundation.typemapping.TypeMapping mappingFrom );

  public boolean remove( org.omg.java.cwm.objectmodel.core.Classifier sourceType, org.omg.java.cwm.foundation.typemapping.TypeMapping mappingFrom );

}
