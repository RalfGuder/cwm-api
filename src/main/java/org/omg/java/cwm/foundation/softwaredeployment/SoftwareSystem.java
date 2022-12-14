/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.softwaredeployment;



public interface SoftwareSystem
extends org.omg.java.cwm.objectmodel.core.Subsystem {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public java.lang.String getType();

  public void setType( java.lang.String value );

  public java.lang.String getSubtype();

  public void setSubtype( java.lang.String value );

  public java.lang.String getSupplier();

  public void setSupplier( java.lang.String value );

  public java.lang.String getVersion();

  public void setVersion( java.lang.String value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public java.util.Collection<? extends org.omg.java.cwm.foundation.typemapping.TypeSystem> getTypespace();

}
