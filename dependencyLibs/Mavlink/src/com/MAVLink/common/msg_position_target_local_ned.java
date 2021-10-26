/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE POSITION_TARGET_LOCAL_NED PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
 * Reports the current commanded vehicle position, velocity, and acceleration as specified by the autopilot. This should match the commands sent in SET_POSITION_TARGET_LOCAL_NED if the vehicle is being controlled this way.
 */
public class msg_position_target_local_ned extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_POSITION_TARGET_LOCAL_NED = 85;
    public static final int MAVLINK_MSG_LENGTH = 51;
    private static final long serialVersionUID = MAVLINK_MSG_ID_POSITION_TARGET_LOCAL_NED;

      
    /**
     * Timestamp (time since system boot).
     */
    public long time_boot_ms;
      
    /**
     * X Position in NED frame
     */
    public float x;
      
    /**
     * Y Position in NED frame
     */
    public float y;
      
    /**
     * Z Position in NED frame (note, altitude is negative in NED)
     */
    public float z;
      
    /**
     * X velocity in NED frame
     */
    public float vx;
      
    /**
     * Y velocity in NED frame
     */
    public float vy;
      
    /**
     * Z velocity in NED frame
     */
    public float vz;
      
    /**
     * X acceleration or force (if bit 10 of type_mask is set) in NED frame in meter / s^2 or N
     */
    public float afx;
      
    /**
     * Y acceleration or force (if bit 10 of type_mask is set) in NED frame in meter / s^2 or N
     */
    public float afy;
      
    /**
     * Z acceleration or force (if bit 10 of type_mask is set) in NED frame in meter / s^2 or N
     */
    public float afz;
      
    /**
     * yaw setpoint
     */
    public float yaw;
      
    /**
     * yaw rate setpoint
     */
    public float yaw_rate;
      
    /**
     * Bitmap to indicate which dimensions should be ignored by the vehicle.
     */
    public int type_mask;
      
    /**
     * Valid options are: MAV_FRAME_LOCAL_NED = 1, MAV_FRAME_LOCAL_OFFSET_NED = 7, MAV_FRAME_BODY_NED = 8, MAV_FRAME_BODY_OFFSET_NED = 9
     */
    public short coordinate_frame;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_POSITION_TARGET_LOCAL_NED;
        
        packet.payload.putUnsignedInt(time_boot_ms);
        packet.payload.putFloat(x);
        packet.payload.putFloat(y);
        packet.payload.putFloat(z);
        packet.payload.putFloat(vx);
        packet.payload.putFloat(vy);
        packet.payload.putFloat(vz);
        packet.payload.putFloat(afx);
        packet.payload.putFloat(afy);
        packet.payload.putFloat(afz);
        packet.payload.putFloat(yaw);
        packet.payload.putFloat(yaw_rate);
        packet.payload.putUnsignedShort(type_mask);
        packet.payload.putUnsignedByte(coordinate_frame);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a position_target_local_ned message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_boot_ms = payload.getUnsignedInt();
        this.x = payload.getFloat();
        this.y = payload.getFloat();
        this.z = payload.getFloat();
        this.vx = payload.getFloat();
        this.vy = payload.getFloat();
        this.vz = payload.getFloat();
        this.afx = payload.getFloat();
        this.afy = payload.getFloat();
        this.afz = payload.getFloat();
        this.yaw = payload.getFloat();
        this.yaw_rate = payload.getFloat();
        this.type_mask = payload.getUnsignedShort();
        this.coordinate_frame = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_position_target_local_ned() {
        this.msgid = MAVLINK_MSG_ID_POSITION_TARGET_LOCAL_NED;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_position_target_local_ned( long time_boot_ms, float x, float y, float z, float vx, float vy, float vz, float afx, float afy, float afz, float yaw, float yaw_rate, int type_mask, short coordinate_frame) {
        this.msgid = MAVLINK_MSG_ID_POSITION_TARGET_LOCAL_NED;

        this.time_boot_ms = time_boot_ms;
        this.x = x;
        this.y = y;
        this.z = z;
        this.vx = vx;
        this.vy = vy;
        this.vz = vz;
        this.afx = afx;
        this.afy = afy;
        this.afz = afz;
        this.yaw = yaw;
        this.yaw_rate = yaw_rate;
        this.type_mask = type_mask;
        this.coordinate_frame = coordinate_frame;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_position_target_local_ned( long time_boot_ms, float x, float y, float z, float vx, float vy, float vz, float afx, float afy, float afz, float yaw, float yaw_rate, int type_mask, short coordinate_frame, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_POSITION_TARGET_LOCAL_NED;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_boot_ms = time_boot_ms;
        this.x = x;
        this.y = y;
        this.z = z;
        this.vx = vx;
        this.vy = vy;
        this.vz = vz;
        this.afx = afx;
        this.afy = afy;
        this.afz = afz;
        this.yaw = yaw;
        this.yaw_rate = yaw_rate;
        this.type_mask = type_mask;
        this.coordinate_frame = coordinate_frame;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_position_target_local_ned(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_POSITION_TARGET_LOCAL_NED;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

                                
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_POSITION_TARGET_LOCAL_NED - sysid:"+sysid+" compid:"+compid+" time_boot_ms:"+time_boot_ms+" x:"+x+" y:"+y+" z:"+z+" vx:"+vx+" vy:"+vy+" vz:"+vz+" afx:"+afx+" afy:"+afy+" afz:"+afz+" yaw:"+yaw+" yaw_rate:"+yaw_rate+" type_mask:"+type_mask+" coordinate_frame:"+coordinate_frame+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_POSITION_TARGET_LOCAL_NED";
    }
}
        