/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.informationvisualization;



public interface CompositesReferenceComponents{

  public boolean exists( org.omg.java.cwm.analysis.informationvisualization.RenderedObject composite, org.omg.java.cwm.analysis.informationvisualization.RenderedObject component );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.informationvisualization.RenderedObject> getComponent( org.omg.java.cwm.analysis.informationvisualization.RenderedObject composite );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.informationvisualization.RenderedObject> getComposite( org.omg.java.cwm.analysis.informationvisualization.RenderedObject component );

  public boolean add( org.omg.java.cwm.analysis.informationvisualization.RenderedObject composite, org.omg.java.cwm.analysis.informationvisualization.RenderedObject component );

  public boolean remove( org.omg.java.cwm.analysis.informationvisualization.RenderedObject composite, org.omg.java.cwm.analysis.informationvisualization.RenderedObject component );

}
