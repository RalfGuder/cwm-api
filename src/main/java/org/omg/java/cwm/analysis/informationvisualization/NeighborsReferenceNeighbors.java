/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.informationvisualization;



public interface NeighborsReferenceNeighbors{

  public boolean exists( org.omg.java.cwm.analysis.informationvisualization.RenderedObject neighbor, org.omg.java.cwm.analysis.informationvisualization.RenderedObject referencingNeighbor );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.informationvisualization.RenderedObject> getReferencingNeighbor( org.omg.java.cwm.analysis.informationvisualization.RenderedObject neighbor );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.informationvisualization.RenderedObject> getNeighbor( org.omg.java.cwm.analysis.informationvisualization.RenderedObject referencingNeighbor );

  public boolean add( org.omg.java.cwm.analysis.informationvisualization.RenderedObject neighbor, org.omg.java.cwm.analysis.informationvisualization.RenderedObject referencingNeighbor );

  public boolean remove( org.omg.java.cwm.analysis.informationvisualization.RenderedObject neighbor, org.omg.java.cwm.analysis.informationvisualization.RenderedObject referencingNeighbor );

}
