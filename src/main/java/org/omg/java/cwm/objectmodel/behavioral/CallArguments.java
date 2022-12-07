/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */

package org.omg.java.cwm.objectmodel.behavioral;

import java.util.List;

public interface CallArguments {

  public boolean exists(Argument actualArgument, CallAction callAction);

  public CallAction getCallAction(Argument actualArgument);

  public List<? extends Argument> getActualArgument(CallAction callAction);

  public boolean add(Argument actualArgument, CallAction callAction);

  public boolean remove(Argument actualArgument, CallAction callAction);

}
