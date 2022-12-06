/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.informationvisualization;



public interface RenderedObject
extends org.omg.java.cwm.objectmodel.core.Classifier {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.foundation.expressions.ExpressionNode getFormula();

  public void setFormula( org.omg.java.cwm.foundation.expressions.ExpressionNode value );

  public java.lang.String getAction();

  public void setAction( java.lang.String value );

  public java.lang.String getFileName();

  public void setFileName( java.lang.String value );

  public java.lang.String getType();

  public void setType( java.lang.String value );

  public java.lang.String getUrl();

  public void setUrl( java.lang.String value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public java.util.Collection<? extends org.omg.java.cwm.analysis.informationvisualization.Rendering> getRendering();

  public org.omg.java.cwm.analysis.informationvisualization.Rendering getDefaultRendering();

  public void setDefaultRendering( org.omg.java.cwm.analysis.informationvisualization.Rendering value );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.informationvisualization.RenderedObject> getComponent();

  public java.util.Collection<? extends org.omg.java.cwm.analysis.informationvisualization.RenderedObject> getComposite();

  public java.util.Collection<? extends org.omg.java.cwm.analysis.informationvisualization.RenderedObject> getNeighbor();

  public java.util.Collection<? extends org.omg.java.cwm.analysis.informationvisualization.RenderedObject> getReferencingNeighbor();

  public org.omg.java.cwm.objectmodel.core.ModelElement getModelElement();

  public void setModelElement( org.omg.java.cwm.objectmodel.core.ModelElement value );

  public org.omg.java.cwm.analysis.informationvisualization.RenderedObjectSet getRenderedObjectSet();

  public void setRenderedObjectSet( org.omg.java.cwm.analysis.informationvisualization.RenderedObjectSet value );

}
