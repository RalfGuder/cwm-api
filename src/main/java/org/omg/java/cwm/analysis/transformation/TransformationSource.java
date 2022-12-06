/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.transformation;



public interface TransformationSource {

  public boolean exists( org.omg.java.cwm.analysis.transformation.Transformation sourceTransformation, org.omg.java.cwm.analysis.transformation.DataObjectSet source );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.transformation.DataObjectSet> getSource( org.omg.java.cwm.analysis.transformation.Transformation sourceTransformation );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.transformation.Transformation> getSourceTransformation( org.omg.java.cwm.analysis.transformation.DataObjectSet source );

  public boolean add( org.omg.java.cwm.analysis.transformation.Transformation sourceTransformation, org.omg.java.cwm.analysis.transformation.DataObjectSet source );

  public boolean remove( org.omg.java.cwm.analysis.transformation.Transformation sourceTransformation, org.omg.java.cwm.analysis.transformation.DataObjectSet source );

}
