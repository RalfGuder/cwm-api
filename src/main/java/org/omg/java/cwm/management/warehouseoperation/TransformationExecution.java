/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseoperation;



public interface TransformationExecution
extends org.omg.java.cwm.objectmodel.core.ModelElement {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public java.lang.String getStartDate();

  public void setStartDate( java.lang.String value );

  public java.lang.String getEndDate();

  public void setEndDate( java.lang.String value );

  public boolean isInProgress();

  public void setInProgress( boolean value );

  public java.lang.Boolean isSuccessful();

  public void setSuccessful( java.lang.Boolean value );

  public org.omg.java.cwm.objectmodel.core.Expression getStatus();

  public void setStatus( org.omg.java.cwm.objectmodel.core.Expression value );

}
