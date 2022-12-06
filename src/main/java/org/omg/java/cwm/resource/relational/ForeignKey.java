/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational;



public interface ForeignKey
extends org.omg.java.cwm.foundation.keysindexes.KeyRelationship {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public org.omg.java.cwm.resource.relational.enumerations.ReferentialRuleType getDeleteRule();

  public void setDeleteRule( org.omg.java.cwm.resource.relational.enumerations.ReferentialRuleType value );

  public org.omg.java.cwm.resource.relational.enumerations.ReferentialRuleType getUpdateRule();

  public void setUpdateRule( org.omg.java.cwm.resource.relational.enumerations.ReferentialRuleType value );

  public org.omg.java.cwm.resource.relational.enumerations.DeferrabilityType getDeferrability();

  public void setDeferrability( org.omg.java.cwm.resource.relational.enumerations.DeferrabilityType value );

}
