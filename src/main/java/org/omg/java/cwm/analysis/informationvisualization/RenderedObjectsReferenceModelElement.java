/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.informationvisualization;



public interface RenderedObjectsReferenceModelElement{

  public boolean exists( org.omg.java.cwm.analysis.informationvisualization.RenderedObject renderedObject, org.omg.java.cwm.objectmodel.core.ModelElement modelElement );

  public org.omg.java.cwm.objectmodel.core.ModelElement getModelElement( org.omg.java.cwm.analysis.informationvisualization.RenderedObject renderedObject );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.informationvisualization.RenderedObject> getRenderedObject( org.omg.java.cwm.objectmodel.core.ModelElement modelElement );

  public boolean add( org.omg.java.cwm.analysis.informationvisualization.RenderedObject renderedObject, org.omg.java.cwm.objectmodel.core.ModelElement modelElement );

  public boolean remove( org.omg.java.cwm.analysis.informationvisualization.RenderedObject renderedObject, org.omg.java.cwm.objectmodel.core.ModelElement modelElement );

}
