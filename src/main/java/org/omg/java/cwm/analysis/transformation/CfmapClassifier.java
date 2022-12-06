/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.transformation;



public interface CfmapClassifier {

  public boolean exists( org.omg.java.cwm.objectmodel.core.Classifier classifier, org.omg.java.cwm.analysis.transformation.ClassifierFeatureMap cfMap );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.transformation.ClassifierFeatureMap> getCfMap( org.omg.java.cwm.objectmodel.core.Classifier classifier );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.Classifier> getClassifier( org.omg.java.cwm.analysis.transformation.ClassifierFeatureMap cfMap );

  public boolean add( org.omg.java.cwm.objectmodel.core.Classifier classifier, org.omg.java.cwm.analysis.transformation.ClassifierFeatureMap cfMap );

  public boolean remove( org.omg.java.cwm.objectmodel.core.Classifier classifier, org.omg.java.cwm.analysis.transformation.ClassifierFeatureMap cfMap );

}
