/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational;



public interface UniqueConstraint
extends org.omg.java.cwm.foundation.keysindexes.UniqueKey {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.resource.relational.enumerations.DeferrabilityType getDeferrability();

  public void setDeferrability( org.omg.java.cwm.resource.relational.enumerations.DeferrabilityType value );

}
