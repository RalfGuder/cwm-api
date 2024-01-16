package org.omg.java.cwm.objectmodel.core;


/**
 * In the metamodel an Expression defines a statement that will evaluate to a (possibly
 * empty) set of instances when executed in a context. An Expression does not modify the
 * environment in which it is evaluated. An expression contains an expression string and
 * the name of an interpretation language with which to evaluate the string.
 */
public interface Expression extends Element {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  public java.lang.String getBody();

  public void setBody( java.lang.String value );

  public java.lang.String getLanguage();

  public void setLanguage( java.lang.String value );

}
