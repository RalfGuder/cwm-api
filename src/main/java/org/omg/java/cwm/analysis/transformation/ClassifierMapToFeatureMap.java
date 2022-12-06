/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.transformation;



public interface ClassifierMapToFeatureMap{

  public boolean exists( org.omg.java.cwm.analysis.transformation.FeatureMap featureMap, org.omg.java.cwm.analysis.transformation.ClassifierMap classifierMap );

  public org.omg.java.cwm.analysis.transformation.ClassifierMap getClassifierMap( org.omg.java.cwm.analysis.transformation.FeatureMap featureMap );

  public java.util.Collection<? extends  org.omg.java.cwm.analysis.transformation.FeatureMap> getFeatureMap( org.omg.java.cwm.analysis.transformation.ClassifierMap classifierMap );

  public boolean add( org.omg.java.cwm.analysis.transformation.FeatureMap featureMap, org.omg.java.cwm.analysis.transformation.ClassifierMap classifierMap );

  public boolean remove( org.omg.java.cwm.analysis.transformation.FeatureMap featureMap, org.omg.java.cwm.analysis.transformation.ClassifierMap classifierMap );

}
