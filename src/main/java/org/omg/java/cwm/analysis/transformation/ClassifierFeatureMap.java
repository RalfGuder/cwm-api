/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.transformation;



public interface ClassifierFeatureMap
extends org.omg.java.cwm.objectmodel.core.ModelElement {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.objectmodel.core.ProcedureExpression getFunction();

  public void setFunction( org.omg.java.cwm.objectmodel.core.ProcedureExpression value );

  public java.lang.String getFunctionDescription();

  public void setFunctionDescription( java.lang.String value );

  public boolean isClassifierToFeature();

  public void setClassifierToFeature( boolean value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.Classifier> getClassifier();

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.Feature> getFeature();

  public org.omg.java.cwm.analysis.transformation.ClassifierMap getClassifierMap();

  public void setClassifierMap( org.omg.java.cwm.analysis.transformation.ClassifierMap value );

}
