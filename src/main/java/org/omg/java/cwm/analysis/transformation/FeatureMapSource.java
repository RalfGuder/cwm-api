/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.transformation;



public interface FeatureMapSource {

  public boolean exists( org.omg.java.cwm.objectmodel.core.Feature source, org.omg.java.cwm.analysis.transformation.FeatureMap featureMap );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.transformation.FeatureMap> getFeatureMap( org.omg.java.cwm.objectmodel.core.Feature source );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.Feature> getSource( org.omg.java.cwm.analysis.transformation.FeatureMap featureMap );

  public boolean add( org.omg.java.cwm.objectmodel.core.Feature source, org.omg.java.cwm.analysis.transformation.FeatureMap featureMap );

  public boolean remove( org.omg.java.cwm.objectmodel.core.Feature source, org.omg.java.cwm.analysis.transformation.FeatureMap featureMap );

}
