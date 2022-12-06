/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.resource.multidimensional;



public interface MultidimensionalPackage{

  public org.omg.java.cwm.objectmodel.core.CorePackage getCore();

  public org.omg.java.cwm.objectmodel.instance.InstancePackage getInstance();

  public org.omg.java.cwm.resource.multidimensional.DimensionClass getDimension();

  public org.omg.java.cwm.resource.multidimensional.DimensionedObjectClass getDimensionedObject();

  public org.omg.java.cwm.resource.multidimensional.MemberClass getMember();

  public org.omg.java.cwm.resource.multidimensional.MemberSetClass getMemberSet();

  public org.omg.java.cwm.resource.multidimensional.MemberValueClass getMemberValue();

  public org.omg.java.cwm.resource.multidimensional.SchemaClass getSchema();

  public org.omg.java.cwm.resource.multidimensional.DimensionOwnsMemberSets getDimensionOwnsMemberSets();

  public org.omg.java.cwm.resource.multidimensional.MdschemaOwnsDimensions getMdschemaOwnsDimensions();

  public org.omg.java.cwm.resource.multidimensional.MdschemaOwnsDimensionedObjects getMdschemaOwnsDimensionedObjects();

  public org.omg.java.cwm.resource.multidimensional.CompositesReferenceComponents getCompositesReferenceComponents();

  public org.omg.java.cwm.resource.multidimensional.DimensionsReferenceDimensionedObjects getDimensionsReferenceDimensionedObjects();

}
