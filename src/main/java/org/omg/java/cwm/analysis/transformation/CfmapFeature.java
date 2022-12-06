/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.transformation;



public interface CfmapFeature{

  public boolean exists( org.omg.java.cwm.objectmodel.core.Feature feature, org.omg.java.cwm.analysis.transformation.ClassifierFeatureMap cfMap );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.transformation.ClassifierFeatureMap> getCfMap( org.omg.java.cwm.objectmodel.core.Feature feature );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.Feature> getFeature( org.omg.java.cwm.analysis.transformation.ClassifierFeatureMap cfMap );

  public boolean add( org.omg.java.cwm.objectmodel.core.Feature feature, org.omg.java.cwm.analysis.transformation.ClassifierFeatureMap cfMap );

  public boolean remove( org.omg.java.cwm.objectmodel.core.Feature feature, org.omg.java.cwm.analysis.transformation.ClassifierFeatureMap cfMap );

}
