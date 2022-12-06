/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.softwaredeployment;



public interface DataManager
extends org.omg.java.cwm.foundation.softwaredeployment.DeployedComponent {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

	public boolean isCaseSensitive();

  	public void setCaseSensitive( boolean value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  	public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.Package> getDataPackage();

}
