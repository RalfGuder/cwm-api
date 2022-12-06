/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.transformation;

import org.omg.java.cwm.objectmodel.core.ModelElement;
import org.omg.java.cwm.objectmodel.core.Namespace;

public interface TransformationMap
extends org.omg.java.cwm.analysis.transformation.Transformation {

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

	/**
	 * Identifies the ClassifierMaps owned by the TransformationMap.
	 * @see Namespace#getOwnedElement()
	 * @see #getOwnedElement()
	 */
	public java.util.Collection<? extends ModelElement> getClassifierMap();

}
