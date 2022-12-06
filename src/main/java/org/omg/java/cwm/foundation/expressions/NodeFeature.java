/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.expressions;



public interface NodeFeature{

  public boolean exists( org.omg.java.cwm.objectmodel.core.Feature feature, org.omg.java.cwm.foundation.expressions.FeatureNode featureNode );

  public java.util.Collection<? extends  org.omg.java.cwm.foundation.expressions.FeatureNode> getFeatureNode( org.omg.java.cwm.objectmodel.core.Feature feature );

  public org.omg.java.cwm.objectmodel.core.Feature getFeature( org.omg.java.cwm.foundation.expressions.FeatureNode featureNode );

  public boolean add( org.omg.java.cwm.objectmodel.core.Feature feature, org.omg.java.cwm.foundation.expressions.FeatureNode featureNode );

  public boolean remove( org.omg.java.cwm.objectmodel.core.Feature feature, org.omg.java.cwm.foundation.expressions.FeatureNode featureNode );

}
