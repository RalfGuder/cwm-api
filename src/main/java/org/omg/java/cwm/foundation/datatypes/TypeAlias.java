/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.datatypes;


/**
 * 
 * The TypeAlias class is intended to provide a renaming capability for 
 * Classifier instances. This class is required to support situations in which 
 * creation of an alias for a class effectively creates a new class. For example, 
 * CORBA IDL type aliases have different typeCodes than their base types and are 
 * therefore treated as distinct types.
 *
 */
public interface TypeAlias
extends org.omg.java.cwm.objectmodel.core.DataType {

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  /**
   * Identifies the Classifier instance for which this TypeAlias instance acts 
   * as an alias.
   *
   * @return Classifier
   */
  public org.omg.java.cwm.objectmodel.core.Classifier getType();

  public void setType( org.omg.java.cwm.objectmodel.core.Classifier value );

}
