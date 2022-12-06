/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.expressions;



public interface ReferencedElement {

	public boolean exists( org.omg.java.cwm.objectmodel.core.ModelElement modelElement, org.omg.java.cwm.foundation.expressions.ElementNode elementNode );

	public java.util.Collection<? extends org.omg.java.cwm.foundation.expressions.ElementNode> getElementNode( org.omg.java.cwm.objectmodel.core.ModelElement modelElement );

	public org.omg.java.cwm.objectmodel.core.ModelElement getModelElement( org.omg.java.cwm.foundation.expressions.ElementNode elementNode );

	public boolean add( org.omg.java.cwm.objectmodel.core.ModelElement modelElement, org.omg.java.cwm.foundation.expressions.ElementNode elementNode );

	public boolean remove( org.omg.java.cwm.objectmodel.core.ModelElement modelElement, org.omg.java.cwm.foundation.expressions.ElementNode elementNode );

}
