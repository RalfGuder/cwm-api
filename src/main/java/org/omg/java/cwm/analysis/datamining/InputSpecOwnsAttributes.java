/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.datamining;



public interface InputSpecOwnsAttributes {

  public boolean exists( org.omg.java.cwm.analysis.datamining.ApplicationInputSpecification inputSpec, org.omg.java.cwm.analysis.datamining.ApplicationAttribute inputAttribute );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.datamining.ApplicationAttribute> getInputAttribute( org.omg.java.cwm.analysis.datamining.ApplicationInputSpecification inputSpec );

  public org.omg.java.cwm.analysis.datamining.ApplicationInputSpecification getInputSpec( org.omg.java.cwm.analysis.datamining.ApplicationAttribute inputAttribute );

  public boolean add( org.omg.java.cwm.analysis.datamining.ApplicationInputSpecification inputSpec, org.omg.java.cwm.analysis.datamining.ApplicationAttribute inputAttribute );

  public boolean remove( org.omg.java.cwm.analysis.datamining.ApplicationInputSpecification inputSpec, org.omg.java.cwm.analysis.datamining.ApplicationAttribute inputAttribute );

}
