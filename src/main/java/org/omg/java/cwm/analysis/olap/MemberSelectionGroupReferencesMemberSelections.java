/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.olap;



public interface MemberSelectionGroupReferencesMemberSelections{

  public boolean exists( org.omg.java.cwm.analysis.olap.MemberSelection memberSelection, org.omg.java.cwm.analysis.olap.MemberSelectionGroup memberSelectionGroup );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.MemberSelectionGroup> getMemberSelectionGroup( org.omg.java.cwm.analysis.olap.MemberSelection memberSelection );

  public java.util.Collection<? extends org.omg.java.cwm.analysis.olap.MemberSelection> getMemberSelection( org.omg.java.cwm.analysis.olap.MemberSelectionGroup memberSelectionGroup );

  public boolean add( org.omg.java.cwm.analysis.olap.MemberSelection memberSelection, org.omg.java.cwm.analysis.olap.MemberSelectionGroup memberSelectionGroup );

  public boolean remove( org.omg.java.cwm.analysis.olap.MemberSelection memberSelection, org.omg.java.cwm.analysis.olap.MemberSelectionGroup memberSelectionGroup );

}
