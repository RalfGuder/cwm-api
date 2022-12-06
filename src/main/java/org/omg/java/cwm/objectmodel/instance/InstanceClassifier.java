/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.instance;



public interface InstanceClassifier {

  public boolean exists( org.omg.java.cwm.objectmodel.instance.Instance instance, org.omg.java.cwm.objectmodel.core.Classifier classifier );

  public org.omg.java.cwm.objectmodel.core.Classifier getClassifier( org.omg.java.cwm.objectmodel.instance.Instance instance );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.instance.Instance> getInstance( org.omg.java.cwm.objectmodel.core.Classifier classifier );

  public boolean add( org.omg.java.cwm.objectmodel.instance.Instance instance, org.omg.java.cwm.objectmodel.core.Classifier classifier );

  public boolean remove( org.omg.java.cwm.objectmodel.instance.Instance instance, org.omg.java.cwm.objectmodel.core.Classifier classifier );

}
