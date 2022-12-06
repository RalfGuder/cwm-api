/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.relational;



public interface ColumnOptionsColumnSet {

  public boolean exists( org.omg.java.cwm.resource.relational.Column optionScopeColumn, org.omg.java.cwm.resource.relational.NamedColumnSet optionScopeColumnSet );

  public org.omg.java.cwm.resource.relational.NamedColumnSet getOptionScopeColumnSet( org.omg.java.cwm.resource.relational.Column optionScopeColumn );

  public java.util.Collection getOptionScopeColumn( org.omg.java.cwm.resource.relational.NamedColumnSet optionScopeColumnSet );

  public boolean add( org.omg.java.cwm.resource.relational.Column optionScopeColumn, org.omg.java.cwm.resource.relational.NamedColumnSet optionScopeColumnSet );

  public boolean remove( org.omg.java.cwm.resource.relational.Column optionScopeColumn, org.omg.java.cwm.resource.relational.NamedColumnSet optionScopeColumnSet );

}
