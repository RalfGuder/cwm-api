/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.softwaredeployment;



public interface ProviderConnectionClass{

  public org.omg.java.cwm.foundation.softwaredeployment.ProviderConnection createProviderConnection( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, boolean _isReadOnly );

  public org.omg.java.cwm.foundation.softwaredeployment.ProviderConnection createProviderConnection();

}
