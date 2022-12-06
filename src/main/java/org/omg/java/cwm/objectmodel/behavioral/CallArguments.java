/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.behavioral;



public interface CallArguments{

  public boolean exists( org.omg.java.cwm.objectmodel.behavioral.Argument actualArgument, org.omg.java.cwm.objectmodel.behavioral.CallAction callAction );

  public org.omg.java.cwm.objectmodel.behavioral.CallAction getCallAction( org.omg.java.cwm.objectmodel.behavioral.Argument actualArgument );

  public java.util.List<? extends org.omg.java.cwm.objectmodel.behavioral.Argument> getActualArgument( org.omg.java.cwm.objectmodel.behavioral.CallAction callAction );

  public boolean add( org.omg.java.cwm.objectmodel.behavioral.Argument actualArgument, org.omg.java.cwm.objectmodel.behavioral.CallAction callAction );

  public boolean remove( org.omg.java.cwm.objectmodel.behavioral.Argument actualArgument, org.omg.java.cwm.objectmodel.behavioral.CallAction callAction );

}
