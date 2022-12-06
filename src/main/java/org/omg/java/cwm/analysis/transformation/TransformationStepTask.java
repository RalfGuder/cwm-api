/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.transformation;



public interface TransformationStepTask {

  public boolean exists( org.omg.java.cwm.analysis.transformation.TransformationStep step, org.omg.java.cwm.analysis.transformation.TransformationTask task );

  public org.omg.java.cwm.analysis.transformation.TransformationTask getTask( org.omg.java.cwm.analysis.transformation.TransformationStep step );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.transformation.TransformationStep> getStep( org.omg.java.cwm.analysis.transformation.TransformationTask task );

  public boolean add( org.omg.java.cwm.analysis.transformation.TransformationStep step, org.omg.java.cwm.analysis.transformation.TransformationTask task );

  public boolean remove( org.omg.java.cwm.analysis.transformation.TransformationStep step, org.omg.java.cwm.analysis.transformation.TransformationTask task );

}
