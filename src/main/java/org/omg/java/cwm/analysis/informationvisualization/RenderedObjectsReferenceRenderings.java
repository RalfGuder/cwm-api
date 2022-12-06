/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.informationvisualization;



public interface RenderedObjectsReferenceRenderings{

  public boolean exists( org.omg.java.cwm.analysis.informationvisualization.Rendering rendering, org.omg.java.cwm.analysis.informationvisualization.RenderedObject renderedObject );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.informationvisualization.RenderedObject> getRenderedObject( org.omg.java.cwm.analysis.informationvisualization.Rendering rendering );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.informationvisualization.Rendering> getRendering( org.omg.java.cwm.analysis.informationvisualization.RenderedObject renderedObject );

  public boolean add( org.omg.java.cwm.analysis.informationvisualization.Rendering rendering, org.omg.java.cwm.analysis.informationvisualization.RenderedObject renderedObject );

  public boolean remove( org.omg.java.cwm.analysis.informationvisualization.Rendering rendering, org.omg.java.cwm.analysis.informationvisualization.RenderedObject renderedObject );

}
