/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.businessinformation;



public interface Document
extends org.omg.java.cwm.objectmodel.core.Namespace {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

	public java.lang.String getReference();

  	public void setReference( java.lang.String value );

  	public java.lang.String getType();

  	public void setType( java.lang.String value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  	public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.ModelElement> getModelElement();

}
