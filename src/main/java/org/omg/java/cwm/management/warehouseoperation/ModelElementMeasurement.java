/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseoperation;



public interface ModelElementMeasurement{

  public boolean exists( org.omg.java.cwm.objectmodel.core.ModelElement modelElement, org.omg.java.cwm.management.warehouseoperation.Measurement measurement );

  public java.util.List<? extends org.omg.java.cwm.management.warehouseoperation.Measurement> getMeasurement( org.omg.java.cwm.objectmodel.core.ModelElement modelElement );

  public org.omg.java.cwm.objectmodel.core.ModelElement getModelElement( org.omg.java.cwm.management.warehouseoperation.Measurement measurement );

  public boolean add( org.omg.java.cwm.objectmodel.core.ModelElement modelElement, org.omg.java.cwm.management.warehouseoperation.Measurement measurement );

  public boolean remove( org.omg.java.cwm.objectmodel.core.ModelElement modelElement, org.omg.java.cwm.management.warehouseoperation.Measurement measurement );

}
