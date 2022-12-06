package org.omg.cwm.objectmodel.core;

/**
 * In the metamodel an Expression defines a statement that will evaluate to a (possibly
 * empty) set of instances when executed in a context. An Expression does not modify the
 * environment in which it is evaluated. An expression contains an expression string and
 * the name of an interpretation language with which to evaluate the string.
 *
 */
public interface Expression extends Element {
  
  /**
   * The text of the expression expressed in the given language.
   * 
   * <ul>
   * <li>type: String
   * <li>multiplicity: exactly one
   * </ul>
   *
   * @return a String
   */
  java.lang.String getBody();
  
  /**
   * The text of the expression expressed in the given language.
   * 
   * <ul>
   * <li>type: String
   * <li>multiplicity: exactly one
   * </ul>
   *
   * @param body is a string
   */
  void setBody(java.lang.String body);
  
  /**
   * Names the language in which the expression body is represented. The interpretation of the
   * expression depends on the language. If the language name is omitted, no interpretation for the
   * expression can be assumed. In general, a language name should be spelled and capitalized
   * exactly as it appears in the document defining the language. For example, use COBOL, not
   * Cobol; use Ada, not ADA; use PostScript, not Postscript.
   * 
   * <ul>
   * <li>type: Name
   * <li>multiplicity: zero or one
   * </ul>
   * 
   * @return a name
   */
  Name getLanguage();

  /**
   * Names the language in which the expression body is represented. The interpretation of the
   * expression depends on the language. If the language name is omitted, no interpretation for the
   * expression can be assumed. In general, a language name should be spelled and capitalized
   * exactly as it appears in the document defining the language. For example, use COBOL, not
   * Cobol; use Ada, not ADA; use PostScript, not Postscript.
   * 
   * <ul>
   * <li>type: Name
   * <li>multiplicity: zero or one
   * </ul>
   * 
   * @return a name
   */
 void setLanguage(Name name);
}
