/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.transformation;



public interface DataObjectSetElement {

  public boolean exists( org.omg.java.cwm.objectmodel.core.ModelElement element, org.omg.java.cwm.analysis.transformation.DataObjectSet set );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.transformation.DataObjectSet> getSet( org.omg.java.cwm.objectmodel.core.ModelElement element );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.ModelElement> getElement( org.omg.java.cwm.analysis.transformation.DataObjectSet set );

  public boolean add( org.omg.java.cwm.objectmodel.core.ModelElement element, org.omg.java.cwm.analysis.transformation.DataObjectSet set );

  public boolean remove( org.omg.java.cwm.objectmodel.core.ModelElement element, org.omg.java.cwm.analysis.transformation.DataObjectSet set );

}
