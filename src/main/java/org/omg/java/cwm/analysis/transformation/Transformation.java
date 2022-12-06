/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.transformation;

import org.omg.java.cwm.objectmodel.core.Dependency;
import org.omg.java.cwm.objectmodel.core.ProcedureExpression;

public interface Transformation
extends org.omg.java.cwm.objectmodel.core.Namespace {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public ProcedureExpression getFunction();

  public void setFunction( ProcedureExpression value );

  public String getFunctionDescription();

  public void setFunctionDescription( java.lang.String value );

  public boolean isPrimary();

  public void setPrimary( boolean value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  /**
   * Identifies the sources of the Transformation.
   * @see TransformationSource#getSource(Transformation)
   */
  public java.util.Collection<? extends DataObjectSet> getSource();

  /**
   * Identifies the targets of the Transformation.
   * @see TransformationTarget#getTarget(Transformation)
   */
  public java.util.Collection<? extends DataObjectSet> getTarget();

  /**
   * Identifies the TransformationUse dependency.
   * @see Dependency#getClientDependency()
   */
  public java.util.Collection<? extends Dependency> getUse();

}
