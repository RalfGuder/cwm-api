/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.softwaredeployment;



public interface ComponentClass {

	public org.omg.java.cwm.foundation.softwaredeployment.Component createComponent( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, boolean _isAbstract );

	public org.omg.java.cwm.foundation.softwaredeployment.Component createComponent();

}
