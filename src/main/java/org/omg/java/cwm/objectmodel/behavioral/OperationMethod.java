/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.behavioral;



public interface OperationMethod{

  public boolean exists( org.omg.java.cwm.objectmodel.behavioral.Operation specification, org.omg.java.cwm.objectmodel.behavioral.Method method );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.behavioral.Method> getMethod( org.omg.java.cwm.objectmodel.behavioral.Operation specification );

  public org.omg.java.cwm.objectmodel.behavioral.Operation getSpecification( org.omg.java.cwm.objectmodel.behavioral.Method method );

  public boolean add( org.omg.java.cwm.objectmodel.behavioral.Operation specification, org.omg.java.cwm.objectmodel.behavioral.Method method );

  public boolean remove( org.omg.java.cwm.objectmodel.behavioral.Operation specification, org.omg.java.cwm.objectmodel.behavioral.Method method );

}
