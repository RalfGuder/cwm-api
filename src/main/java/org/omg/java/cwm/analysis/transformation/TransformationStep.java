/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.transformation;

import org.omg.java.cwm.objectmodel.core.Constraint;
import org.omg.java.cwm.objectmodel.core.Dependency;
import org.omg.java.cwm.objectmodel.core.Namespace;

public interface TransformationStep
extends org.omg.java.cwm.objectmodel.core.ModelElement {

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  /**
   * Identifies the TransformationTask that the TransformationStep performs.
   * @see TransformationStepTask#getTask(TransformationStep)
   */
  public TransformationTask getTask();

  /**
   * Identifies the TransformationTask that the TransformationStep performs.
   * @see TransformationStepTask#add(TransformationStep, TransformationTask)
   */
  public void setTask( TransformationTask value );

  /**
   * Identifies the TransformationActivity that owns the TransformationStep.
   * @see Namespace#getNamespace()
   */
  public Namespace getActivity();

  /**
   * Identifies the TransformationActivity that owns the TransformationStep.
   * @see Namespace#setNamespace(Namespace)
   */
  public void setActivity( Namespace value );

  /**
   * Identifies the PrecedenceConstraint.
   * @see Constraint#getConstraint()
   */
  public java.util.Collection<? extends Constraint> getPrecedence();

  /**
   * Identifies the preceding StepPrecedence dependency.
   * @see Dependency#getClient()
   */
  public java.util.Collection<? extends Dependency> getPrecedingStep();

  /**
   * Identifies the succeeding StepPrecedence dependency.
   * @see Dependency#getSupplier()
   */
  public java.util.Collection<? extends Dependency> getSucceedingStep();

}
