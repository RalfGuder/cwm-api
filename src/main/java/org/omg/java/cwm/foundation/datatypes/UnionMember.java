/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.datatypes;


/**
 * UnionMembers are described as features of a Union and each represents one of 
 * the members of a Union. Note, however, that multiple case values can map to 
 * a single UnionMember. If isDefault is true, the union member is the default 
 * member. UnionMember instances are allowed to have a memberCase and be the 
 * default case.
 * 
 * <p>UnionMember instances often represent structured storage areas. A 
 * particular UnionMember may be associated with a Classifier that describes its 
 * internal structure via the StructuralFeatureType association (defined in the 
 * ObjectModel::Core package). For example, the Record::Group class, itself a 
 * Classifier, can be used as the type of a UnionMember in a manner completely 
 * analogous to how it is used to describe the type of a structured field (see 
 * the instance diagrams in the Record metamodel chapter for details).
 */
public interface UnionMember
extends org.omg.java.cwm.objectmodel.core.Attribute {

	// ------------------------------------------------
	// -----   Attribute-Generated                -----
	// ------------------------------------------------

  /**
   * Contains the value of the Union’s discriminator for this UnionMember.
   *
   * @return  Expression
   */
  public org.omg.java.cwm.objectmodel.core.Expression getMemberCase();

  public void setMemberCase( org.omg.java.cwm.objectmodel.core.Expression value );

  /**
   * Indicates if this UnionMember is the default member of the Union (implying 
   * that when unstated, the Union's discriminator would assume this instance's 
   * memberCase value).
   *
   * @return <tt>true</tt> or <tt>false</tt>
   */
  public boolean isDefault();

  public void setDefault( boolean value );

}
