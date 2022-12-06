/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.expressions;



public interface OperationArgument{

  public boolean exists( org.omg.java.cwm.foundation.expressions.FeatureNode featureNode, org.omg.java.cwm.foundation.expressions.ExpressionNode argument );

  public java.util.List<? extends org.omg.java.cwm.foundation.expressions.ExpressionNode> getArgument( org.omg.java.cwm.foundation.expressions.FeatureNode featureNode );

  public org.omg.java.cwm.foundation.expressions.FeatureNode getFeatureNode( org.omg.java.cwm.foundation.expressions.ExpressionNode argument );

  public boolean add( org.omg.java.cwm.foundation.expressions.FeatureNode featureNode, org.omg.java.cwm.foundation.expressions.ExpressionNode argument );

  public boolean remove( org.omg.java.cwm.foundation.expressions.FeatureNode featureNode, org.omg.java.cwm.foundation.expressions.ExpressionNode argument );

}
