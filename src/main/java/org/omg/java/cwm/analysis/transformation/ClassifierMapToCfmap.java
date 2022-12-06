/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.transformation;



public interface ClassifierMapToCfmap {

  public boolean exists( org.omg.java.cwm.analysis.transformation.ClassifierFeatureMap cfMap, org.omg.java.cwm.analysis.transformation.ClassifierMap classifierMap );

  public org.omg.java.cwm.analysis.transformation.ClassifierMap getClassifierMap( org.omg.java.cwm.analysis.transformation.ClassifierFeatureMap cfMap );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.transformation.ClassifierFeatureMap> getCfMap( org.omg.java.cwm.analysis.transformation.ClassifierMap classifierMap );

  public boolean add( org.omg.java.cwm.analysis.transformation.ClassifierFeatureMap cfMap, org.omg.java.cwm.analysis.transformation.ClassifierMap classifierMap );

  public boolean remove( org.omg.java.cwm.analysis.transformation.ClassifierFeatureMap cfMap, org.omg.java.cwm.analysis.transformation.ClassifierMap classifierMap );

}
