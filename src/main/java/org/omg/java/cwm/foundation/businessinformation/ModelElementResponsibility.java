/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.businessinformation;



public interface ModelElementResponsibility{

	public boolean exists( org.omg.java.cwm.objectmodel.core.ModelElement modelElement, org.omg.java.cwm.foundation.businessinformation.ResponsibleParty responsibleParty );

	public java.util.Collection<? extends org.omg.java.cwm.foundation.businessinformation.ResponsibleParty> getResponsibleParty( org.omg.java.cwm.objectmodel.core.ModelElement modelElement );

	public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.ModelElement> getModelElement( org.omg.java.cwm.foundation.businessinformation.ResponsibleParty responsibleParty );

	public boolean add( org.omg.java.cwm.objectmodel.core.ModelElement modelElement, org.omg.java.cwm.foundation.businessinformation.ResponsibleParty responsibleParty );

	public boolean remove( org.omg.java.cwm.objectmodel.core.ModelElement modelElement, org.omg.java.cwm.foundation.businessinformation.ResponsibleParty responsibleParty );

}
