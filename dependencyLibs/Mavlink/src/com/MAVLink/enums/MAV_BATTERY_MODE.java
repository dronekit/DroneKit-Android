/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package com.MAVLink.enums;

/** 
 * Battery mode. Note, the normal operation mode (i.e. when flying) should be reported as MAV_BATTERY_MODE_UNKNOWN to allow message trimming in normal flight.
 */
public class MAV_BATTERY_MODE {
   public static final int MAV_BATTERY_MODE_UNKNOWN = 0; /* Battery mode not supported/unknown battery mode/normal operation. | */
   public static final int MAV_BATTERY_MODE_AUTO_DISCHARGING = 1; /* Battery is auto discharging (towards storage level). | */
   public static final int MAV_BATTERY_MODE_HOT_SWAP = 2; /* Battery in hot-swap mode (current limited to prevent spikes that might damage sensitive electrical circuits). | */
   public static final int MAV_BATTERY_MODE_ENUM_END = 3; /*  | */
}
            