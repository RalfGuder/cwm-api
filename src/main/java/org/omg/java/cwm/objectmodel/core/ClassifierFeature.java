/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.core;



public interface ClassifierFeature {

  public boolean exists( Classifier owner, Feature feature );
  public java.util.List<? extends org.omg.java.cwm.objectmodel.core.Feature> getFeature( Classifier owner );
  public Classifier getOwner( Feature feature );
  public boolean add( Classifier owner, Feature feature );
  public boolean remove( Classifier owner, Feature feature );

}
