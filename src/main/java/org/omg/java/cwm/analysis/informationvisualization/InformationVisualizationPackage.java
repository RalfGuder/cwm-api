/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.informationvisualization;



public interface InformationVisualizationPackage{

  public org.omg.java.cwm.foundation.expressions.ExpressionsPackage getExpressions();

  public org.omg.java.cwm.objectmodel.core.CorePackage getCore();

  public org.omg.java.cwm.analysis.informationvisualization.RenderedObjectClass getRenderedObject();

  public org.omg.java.cwm.analysis.informationvisualization.RenderedObjectSetClass getRenderedObjectSet();

  public org.omg.java.cwm.analysis.informationvisualization.RenderingClass getRendering();

  public org.omg.java.cwm.analysis.informationvisualization.XslrenderingClass getXslrendering();

  public org.omg.java.cwm.analysis.informationvisualization.RenderedObjectSetOwnsRenderings getRenderedObjectSetOwnsRenderings();

  public org.omg.java.cwm.analysis.informationvisualization.RenderedObjectSetOwnsRenderedObjects getRenderedObjectSetOwnsRenderedObjects();

  public org.omg.java.cwm.analysis.informationvisualization.NeighborsReferenceNeighbors getNeighborsReferenceNeighbors();

  public org.omg.java.cwm.analysis.informationvisualization.RenderedObjectsReferenceModelElement getRenderedObjectsReferenceModelElement();

  public org.omg.java.cwm.analysis.informationvisualization.RenderedObjectsReferenceDefaultRendering getRenderedObjectsReferenceDefaultRendering();

  public org.omg.java.cwm.analysis.informationvisualization.RenderedObjectsReferenceRenderings getRenderedObjectsReferenceRenderings();

  public org.omg.java.cwm.analysis.informationvisualization.CompositesReferenceComponents getCompositesReferenceComponents();

}
