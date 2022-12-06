/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.analysis.informationvisualization;



public interface RenderingClass {

  public org.omg.java.cwm.analysis.informationvisualization.Rendering createRendering( java.lang.String _name, org.omg.java.cwm.objectmodel.core.VisibilityKind _visibility, org.omg.java.cwm.objectmodel.core.ScopeKind _ownerScope, org.omg.java.cwm.foundation.expressions.ExpressionNode _formula, java.lang.String _action, java.lang.String _fileName, java.lang.String _type, java.lang.String _url );

  public org.omg.java.cwm.analysis.informationvisualization.Rendering createRendering();

}
