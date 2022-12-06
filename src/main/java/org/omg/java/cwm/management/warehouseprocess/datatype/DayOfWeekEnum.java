/*
 * CWM Version 1.0, Java(TM) Metadata Interface Version 1.0
 */
package org.omg.java.cwm.management.warehouseprocess.datatype;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

import java.io.Serializable;



public final class DayOfWeekEnum implements DayOfWeek, Serializable {

  private static final long serialVersionUID = 1L;

  public static final DayOfWeekEnum MONDAY = new DayOfWeekEnum("monday");

  public static final DayOfWeekEnum TUESDAY = new DayOfWeekEnum("tuesday");

  public static final DayOfWeekEnum WEDNESDAY = new DayOfWeekEnum("wednesday");

  public static final DayOfWeekEnum THURSDAY = new DayOfWeekEnum("thursday");

  public static final DayOfWeekEnum FRIDAY = new DayOfWeekEnum("friday");

  public static final DayOfWeekEnum SATURDAY = new DayOfWeekEnum("saturday");

  public static final DayOfWeekEnum SUNDAY = new DayOfWeekEnum("sunday");

  public static final DayOfWeekEnum NONWORKING_DAY = new DayOfWeekEnum("nonworkingDay");

  private static final java.util.List<String> typeName = unmodifiableList(asList(new String[] {"WarehouseProcess","DataType","DayOfWeek"}));

  private final java.lang.String literalName;

  private DayOfWeekEnum( java.lang.String literalName ) {
    this.literalName = literalName;
  }

  public java.util.List<String> refTypeName() {
    return typeName;
  }

  public java.lang.String toString() {
    return literalName;
  }

  public boolean equals( java.lang.Object other ) {
    return (other instanceof org.omg.java.cwm.management.warehouseprocess.datatype.DayOfWeekEnum)?other == this: false;
  }

  protected java.lang.Object readResolve()
    throws java.io.InvalidObjectException {
    try {
      return forName(literalName);
    } catch ( java.lang.IllegalArgumentException iae ) {
      throw new java.io.InvalidObjectException(iae.getMessage());
    }
  }

  public int hashCode() {
    return literalName.hashCode();
  }

  public static org.omg.java.cwm.management.warehouseprocess.datatype.DayOfWeek forName( java.lang.String value ) {
    if ( value.equals(MONDAY.literalName) ) return MONDAY;
    if ( value.equals(TUESDAY.literalName) ) return TUESDAY;
    if ( value.equals(WEDNESDAY.literalName) ) return WEDNESDAY;
    if ( value.equals(THURSDAY.literalName) ) return THURSDAY;
    if ( value.equals(FRIDAY.literalName) ) return FRIDAY;
    if ( value.equals(SATURDAY.literalName) ) return SATURDAY;
    if ( value.equals(SUNDAY.literalName) ) return SUNDAY;
    if ( value.equals(NONWORKING_DAY.literalName) ) return NONWORKING_DAY;
    throw new java.lang.IllegalArgumentException("Unknown enumeration value '"+value+"' for type 'WarehouseProcess.DataType.DayOfWeek'");
  }

}
