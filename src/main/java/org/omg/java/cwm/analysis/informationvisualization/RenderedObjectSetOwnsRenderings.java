/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.informationvisualization;



public interface RenderedObjectSetOwnsRenderings{

  public boolean exists( org.omg.java.cwm.analysis.informationvisualization.Rendering rendering, org.omg.java.cwm.analysis.informationvisualization.RenderedObjectSet renderedObjectSet );

  public org.omg.java.cwm.analysis.informationvisualization.RenderedObjectSet getRenderedObjectSet( org.omg.java.cwm.analysis.informationvisualization.Rendering rendering );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.informationvisualization.Rendering> getRendering( org.omg.java.cwm.analysis.informationvisualization.RenderedObjectSet renderedObjectSet );

  public boolean add( org.omg.java.cwm.analysis.informationvisualization.Rendering rendering, org.omg.java.cwm.analysis.informationvisualization.RenderedObjectSet renderedObjectSet );

  public boolean remove( org.omg.java.cwm.analysis.informationvisualization.Rendering rendering, org.omg.java.cwm.analysis.informationvisualization.RenderedObjectSet renderedObjectSet );

}
