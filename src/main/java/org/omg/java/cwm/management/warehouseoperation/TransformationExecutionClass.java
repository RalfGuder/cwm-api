/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseoperation;

public interface TransformationExecutionClass {

	public org.omg.java.cwm.management.warehouseoperation.TransformationExecution createTransformationExecution(
			java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility,
			java.lang.String _startDate, java.lang.String _endDate, boolean _inProgress, java.lang.Boolean _successful,
			org.omg.java.cwm.objectmodel.core.Expression _status);

	public org.omg.java.cwm.management.warehouseoperation.TransformationExecution createTransformationExecution();

}
