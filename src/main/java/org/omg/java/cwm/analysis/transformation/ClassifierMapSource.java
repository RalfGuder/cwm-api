/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.transformation;



public interface ClassifierMapSource {

  public boolean exists( org.omg.java.cwm.objectmodel.core.Classifier source, org.omg.java.cwm.analysis.transformation.ClassifierMap classifierMap );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.transformation.ClassifierMap> getClassifierMap( org.omg.java.cwm.objectmodel.core.Classifier source );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.Classifier> getSource( org.omg.java.cwm.analysis.transformation.ClassifierMap classifierMap );

  public boolean add( org.omg.java.cwm.objectmodel.core.Classifier source, org.omg.java.cwm.analysis.transformation.ClassifierMap classifierMap );

  public boolean remove( org.omg.java.cwm.objectmodel.core.Classifier source, org.omg.java.cwm.analysis.transformation.ClassifierMap classifierMap );

}
