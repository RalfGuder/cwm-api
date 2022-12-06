/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.transformation;



public interface InverseTransformationTask{

  public boolean exists( org.omg.java.cwm.analysis.transformation.TransformationTask originalTask, org.omg.java.cwm.analysis.transformation.TransformationTask inverseTask );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.transformation.TransformationTask> getInverseTask( org.omg.java.cwm.analysis.transformation.TransformationTask originalTask );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.transformation.TransformationTask> getOriginalTask( org.omg.java.cwm.analysis.transformation.TransformationTask inverseTask );

  public boolean add( org.omg.java.cwm.analysis.transformation.TransformationTask originalTask, org.omg.java.cwm.analysis.transformation.TransformationTask inverseTask );

  public boolean remove( org.omg.java.cwm.analysis.transformation.TransformationTask originalTask, org.omg.java.cwm.analysis.transformation.TransformationTask inverseTask );

}
