/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.softwaredeployment;



public interface DeployedComponentClass{

  public org.omg.java.cwm.foundation.softwaredeployment.DeployedComponent createDeployedComponent( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, java.lang.String _pathname );

  public org.omg.java.cwm.foundation.softwaredeployment.DeployedComponent createDeployedComponent();

}
