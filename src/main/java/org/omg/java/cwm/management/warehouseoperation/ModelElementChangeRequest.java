/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseoperation;



public interface ModelElementChangeRequest{

  public boolean exists( org.omg.java.cwm.objectmodel.core.ModelElement modelElement, org.omg.java.cwm.management.warehouseoperation.ChangeRequest changeRequest );

  public java.util.List<? extends org.omg.java.cwm.management.warehouseoperation.ChangeRequest> getChangeRequest( org.omg.java.cwm.objectmodel.core.ModelElement modelElement );

  public java.util.Collection<? extends  org.omg.java.cwm.objectmodel.core.ModelElement> getModelElement( org.omg.java.cwm.management.warehouseoperation.ChangeRequest changeRequest );

  public boolean add( org.omg.java.cwm.objectmodel.core.ModelElement modelElement, org.omg.java.cwm.management.warehouseoperation.ChangeRequest changeRequest );

  public boolean remove( org.omg.java.cwm.objectmodel.core.ModelElement modelElement, org.omg.java.cwm.management.warehouseoperation.ChangeRequest changeRequest );

}
