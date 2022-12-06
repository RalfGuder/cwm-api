/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.behavioral;



public interface ParameterType{

  public boolean exists( org.omg.java.cwm.objectmodel.behavioral.Parameter parameter, org.omg.java.cwm.objectmodel.core.Classifier type );

  public org.omg.java.cwm.objectmodel.core.Classifier getType( org.omg.java.cwm.objectmodel.behavioral.Parameter parameter );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.behavioral.Parameter> getParameter( org.omg.java.cwm.objectmodel.core.Classifier type );

  public boolean add( org.omg.java.cwm.objectmodel.behavioral.Parameter parameter, org.omg.java.cwm.objectmodel.core.Classifier type );

  public boolean remove( org.omg.java.cwm.objectmodel.behavioral.Parameter parameter, org.omg.java.cwm.objectmodel.core.Classifier type );

}
