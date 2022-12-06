/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.transformation;

import org.omg.java.cwm.objectmodel.core.Dependency;

public interface StepPrecedence
extends org.omg.java.cwm.objectmodel.core.Dependency {

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

	/**
	 * @see Dependency#getSupplier()
	 */
	public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.ModelElement> getPrecedingStep();

	/**
	 * @see Dependency#getClient()
	 */
	public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.ModelElement> getSucceedingStep();

}
