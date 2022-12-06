/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.informationvisualization;



public interface Rendering
extends org.omg.java.cwm.objectmodel.core.Feature {

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

  public java.util.Collection<? extends org.omg.java.cwm.analysis.informationvisualization.RenderedObject> getRenderedObject();

  public java.util.Collection<? extends org.omg.java.cwm.analysis.informationvisualization.RenderedObject> getDefaultedRenderedObject();

  public org.omg.java.cwm.analysis.informationvisualization.RenderedObjectSet getRenderedObjectSet();

  public void setRenderedObjectSet( org.omg.java.cwm.analysis.informationvisualization.RenderedObjectSet value );

}
