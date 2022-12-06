/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseoperation;

import org.omg.java.cwm.objectmodel.core.Expression;
import org.omg.java.cwm.objectmodel.core.VisibilityKind;

public interface StepExecutionClass {

	public StepExecution createStepExecution(String _name, VisibilityKind _visibility, String _startDate,
			String _endDate, boolean _inProgress, Boolean _successful, Expression _status);

	public StepExecution createStepExecution();

}
