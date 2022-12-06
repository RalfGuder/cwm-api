/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.behavioral;



public interface ParameterClass{

  public org.omg.java.cwm.objectmodel.behavioral.Parameter createParameter( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, org.omg.java.cwm.objectmodel.core.Expression _defaultValue, org.omg.java.cwm.objectmodel.behavioral.ParameterDirectionKind _kind );
  public org.omg.java.cwm.objectmodel.behavioral.Parameter createParameter();

}
