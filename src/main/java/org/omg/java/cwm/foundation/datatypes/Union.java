/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.foundation.datatypes;

/**
 * The Union class represents programming language unions and similarly structured 
 * data types. Because of the diversity of union semantics found across software 
 * systems, the Union and UnionMember classes are likely candidates for 
 * specialization to better capture union semantics in specific language 
 * extension packages.
 * 
 * <p>A discriminated Union has a collection of UnionMembers that determine the 
 * sets of contents that the Union may contain. Such Unions have an attribute 
 * called the discriminator that identifies the memberCase value of the 
 * UnionMember that the Union currently contains. The discriminator is found via 
 * the UnionDiscriminator association to StructuralFeature. The discriminator 
 * may be embedded within UnionMembers or may be located outside the discriminator. 
 * If it is located within UnionMembers, the discriminator should occur in every 
 * UnionMember at the same location (often, the first).
 * 
 * <p>Undiscriminated unions (for example, a C language union) are also supported, 
 * but have an empty discriminator reference, and the memberCase attribute of 
 * the UnionMembers it contains is ignored.
 * 
 * <p>Undiscriminated Unions are often used to represent alternate views of a 
 * single physical storage area. A fine degree of control over this aspect of 
 * Unions may be obtained by creating a class that derives from both UnionMember 
 * and FixedOffsetField (in the CWM Record package) and setting the offset 
 * attribute instances of that class accordingly.
 * 
 * <p>A Union can have at most one default UnionMember instance. [C-4-2]
 */
public interface Union
extends org.omg.java.cwm.objectmodel.core.Classifier {

	// ------------------------------------------------
	// -----   Reference-Generated                -----
	// ------------------------------------------------

  /**
   * Identifies the StructuralFeature instance that serves as the discriminator 
   * for the Union.
   * 
   * @return StructuralFeature
   */
  public org.omg.java.cwm.objectmodel.core.StructuralFeature getDiscriminator();

  public void setDiscriminator( org.omg.java.cwm.objectmodel.core.StructuralFeature value );

}
