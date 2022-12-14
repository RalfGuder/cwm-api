/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.transformation;



public interface ClassifierMap
extends org.omg.java.cwm.objectmodel.core.Namespace {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.objectmodel.core.ProcedureExpression getFunction();

  public void setFunction( org.omg.java.cwm.objectmodel.core.ProcedureExpression value );

  public java.lang.String getFunctionDescription();

  public void setFunctionDescription( java.lang.String value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.Classifier> getSource();

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.Classifier> getTarget();

  public org.omg.java.cwm.objectmodel.core.Namespace getTransformationMap();

  public void setTransformationMap( org.omg.java.cwm.objectmodel.core.Namespace value );

  public java.util.Collection<? extends  org.omg.java.cwm.analysis.transformation.FeatureMap> getFeatureMap();

  public java.util.Collection<? extends org.omg.java.cwm.analysis.transformation.ClassifierFeatureMap> getCfMap();

}
