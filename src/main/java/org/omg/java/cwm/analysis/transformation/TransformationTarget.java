/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.transformation;



public interface TransformationTarget {

  public boolean exists( org.omg.java.cwm.analysis.transformation.Transformation targetTransformation, org.omg.java.cwm.analysis.transformation.DataObjectSet target );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.transformation.DataObjectSet> getTarget( org.omg.java.cwm.analysis.transformation.Transformation targetTransformation );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.transformation.Transformation> getTargetTransformation( org.omg.java.cwm.analysis.transformation.DataObjectSet target );

  public boolean add( org.omg.java.cwm.analysis.transformation.Transformation targetTransformation, org.omg.java.cwm.analysis.transformation.DataObjectSet target );

  public boolean remove( org.omg.java.cwm.analysis.transformation.Transformation targetTransformation, org.omg.java.cwm.analysis.transformation.DataObjectSet target );

}
