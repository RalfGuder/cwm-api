/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.instance;


/**
 * A data value is an instance with no identity. In the metamodel, DataValue is a child of
 * Instance that cannot change its state; that is, all operations that are applicable to it are
 * pure functions or queries that do not cause any side effects. DataValues are typically
 * used as attribute values.
 * 
 * @author Ralf Guder
 *
 */
public interface DataValue
extends org.omg.java.cwm.objectmodel.instance.Instance {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public java.lang.String getValue();

  public void setValue( java.lang.String value );

}
