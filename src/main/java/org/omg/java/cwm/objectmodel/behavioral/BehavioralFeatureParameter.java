/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.behavioral;



public interface BehavioralFeatureParameter{

  public boolean exists( org.omg.java.cwm.objectmodel.behavioral.BehavioralFeature behavioralFeature, org.omg.java.cwm.objectmodel.behavioral.Parameter parameter );

  public java.util.List<? extends org.omg.java.cwm.objectmodel.behavioral.Parameter> getParameter( org.omg.java.cwm.objectmodel.behavioral.BehavioralFeature behavioralFeature );

  public org.omg.java.cwm.objectmodel.behavioral.BehavioralFeature getBehavioralFeature( org.omg.java.cwm.objectmodel.behavioral.Parameter parameter );

  public boolean add( org.omg.java.cwm.objectmodel.behavioral.BehavioralFeature behavioralFeature, org.omg.java.cwm.objectmodel.behavioral.Parameter parameter );

  public boolean remove( org.omg.java.cwm.objectmodel.behavioral.BehavioralFeature behavioralFeature, org.omg.java.cwm.objectmodel.behavioral.Parameter parameter );

}
