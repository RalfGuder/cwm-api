/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.behavioral;



public interface CalledOperation{

  public boolean exists( org.omg.java.cwm.objectmodel.behavioral.CallAction callAction, org.omg.java.cwm.objectmodel.behavioral.Operation operation );

  public org.omg.java.cwm.objectmodel.behavioral.Operation getOperation( org.omg.java.cwm.objectmodel.behavioral.CallAction callAction );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.behavioral.CallAction> getCallAction( org.omg.java.cwm.objectmodel.behavioral.Operation operation );

  public boolean add( org.omg.java.cwm.objectmodel.behavioral.CallAction callAction, org.omg.java.cwm.objectmodel.behavioral.Operation operation );

  public boolean remove( org.omg.java.cwm.objectmodel.behavioral.CallAction callAction, org.omg.java.cwm.objectmodel.behavioral.Operation operation );

}
