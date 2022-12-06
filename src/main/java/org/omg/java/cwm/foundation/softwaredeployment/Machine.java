/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.softwaredeployment;


/**
 * A Machine represents a computer. The Site at which the Machine is located and the
 * Components deployed on the Machine may be recorded. 
 *
 */
public interface Machine
extends org.omg.java.cwm.objectmodel.core.Namespace {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

	public java.util.List<String> getIpAddress();

  	public java.util.List<String> getHostName();

  	public java.lang.String getMachineId();

  	public void setMachineId( java.lang.String value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  	public org.omg.java.cwm.foundation.softwaredeployment.Site getSite();

  	public void setSite( org.omg.java.cwm.foundation.softwaredeployment.Site value );	

	public java.util.Collection<? extends org.omg.java.cwm.foundation.softwaredeployment.DeployedComponent> getDeployedComponent();

}
