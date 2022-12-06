/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseoperation;



public interface ChangeRequest
extends org.omg.java.cwm.objectmodel.core.ModelElement {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public java.lang.String getChangeDescription();

  public void setChangeDescription( java.lang.String value );

  public java.lang.String getChangeReason();

  public void setChangeReason( java.lang.String value );

  public java.lang.String getStatus();

  public void setStatus( java.lang.String value );

  public boolean isCompleted();

  public void setCompleted( boolean value );

  public java.lang.String getRequestDate();

  public void setRequestDate( java.lang.String value );

  public java.lang.String getCompletionDate();

  public void setCompletionDate( java.lang.String value );

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  public java.util.Collection<? extends  org.omg.java.cwm.objectmodel.core.ModelElement> getModelElement();

}
