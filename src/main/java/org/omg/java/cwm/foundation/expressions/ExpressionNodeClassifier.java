/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.expressions;



public interface ExpressionNodeClassifier{

	public boolean exists( org.omg.java.cwm.objectmodel.core.Classifier type, org.omg.java.cwm.foundation.expressions.ExpressionNode expressionNode );

	public java.util.Collection<? extends org.omg.java.cwm.foundation.expressions.ExpressionNode> getExpressionNode( org.omg.java.cwm.objectmodel.core.Classifier type );

	public org.omg.java.cwm.objectmodel.core.Classifier getType( org.omg.java.cwm.foundation.expressions.ExpressionNode expressionNode );

	public boolean add( org.omg.java.cwm.objectmodel.core.Classifier type, org.omg.java.cwm.foundation.expressions.ExpressionNode expressionNode );

	public boolean remove( org.omg.java.cwm.objectmodel.core.Classifier type, org.omg.java.cwm.foundation.expressions.ExpressionNode expressionNode );

}
