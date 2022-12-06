/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.softwaredeployment;



public interface SoftwareSystemClass{

	public org.omg.java.cwm.foundation.softwaredeployment.SoftwareSystem createSoftwareSystem( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, boolean _isAbstract, java.lang.String _type, java.lang.String _subtype, java.lang.String _supplier, java.lang.String _version );

	public org.omg.java.cwm.foundation.softwaredeployment.SoftwareSystem createSoftwareSystem();

}
