/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.objectmodel.core;



public interface ImportedElements{

  public boolean exists( org.omg.java.cwm.objectmodel.core.ModelElement importedElement, org.omg.java.cwm.objectmodel.core.Package importer );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.Package> getImporter( org.omg.java.cwm.objectmodel.core.ModelElement importedElement );

  public java.util.Collection<? extends org.omg.java.cwm.objectmodel.core.ModelElement> getImportedElement( org.omg.java.cwm.objectmodel.core.Package importer );

  public boolean add( org.omg.java.cwm.objectmodel.core.ModelElement importedElement, org.omg.java.cwm.objectmodel.core.Package importer );

  public boolean remove( org.omg.java.cwm.objectmodel.core.ModelElement importedElement, org.omg.java.cwm.objectmodel.core.Package importer );

}
