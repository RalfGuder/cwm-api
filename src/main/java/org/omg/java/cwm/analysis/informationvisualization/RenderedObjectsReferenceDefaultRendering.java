/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.informationvisualization;



public interface RenderedObjectsReferenceDefaultRendering{

  public boolean exists( org.omg.java.cwm.analysis.informationvisualization.Rendering defaultRendering, org.omg.java.cwm.analysis.informationvisualization.RenderedObject defaultedRenderedObject );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.informationvisualization.RenderedObject> getDefaultedRenderedObject( org.omg.java.cwm.analysis.informationvisualization.Rendering defaultRendering );

  public org.omg.java.cwm.analysis.informationvisualization.Rendering getDefaultRendering( org.omg.java.cwm.analysis.informationvisualization.RenderedObject defaultedRenderedObject );

  public boolean add( org.omg.java.cwm.analysis.informationvisualization.Rendering defaultRendering, org.omg.java.cwm.analysis.informationvisualization.RenderedObject defaultedRenderedObject );

  public boolean remove( org.omg.java.cwm.analysis.informationvisualization.Rendering defaultRendering, org.omg.java.cwm.analysis.informationvisualization.RenderedObject defaultedRenderedObject );

}
