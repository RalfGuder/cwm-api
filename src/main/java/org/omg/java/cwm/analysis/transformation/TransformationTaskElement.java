/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.transformation;



public interface TransformationTaskElement{

  public boolean exists( org.omg.java.cwm.analysis.transformation.TransformationTask task, org.omg.java.cwm.analysis.transformation.Transformation transformation );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.transformation.Transformation> getTransformation( org.omg.java.cwm.analysis.transformation.TransformationTask task );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.transformation.TransformationTask> getTask( org.omg.java.cwm.analysis.transformation.Transformation transformation );

  public boolean add( org.omg.java.cwm.analysis.transformation.TransformationTask task, org.omg.java.cwm.analysis.transformation.Transformation transformation );

  public boolean remove( org.omg.java.cwm.analysis.transformation.TransformationTask task, org.omg.java.cwm.analysis.transformation.Transformation transformation );

}
