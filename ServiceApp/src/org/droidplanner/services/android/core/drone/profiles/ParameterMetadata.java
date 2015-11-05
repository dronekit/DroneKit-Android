package org.droidplanner.services.android.core.drone.profiles;

public class ParameterMetadata {

    /**
     * One of {@link com.MAVLink.enums.MAV_AUTOPILOT}
     */
    private final int autopilotFamily;

    /**
     * One of {@link org.droidplanner.services.android.core.firmware.FirmwareType}
     */
    private String autopilotType;

    private String group;
    private String name;

    /**
     * One of {@link com.MAVLink.enums.MAV_PARAM_TYPE}
     */
    private int dataType;

    private String displayName;
    private String description;

    private String units;
    private String range;
    private String values;

    public ParameterMetadata(int autopilotFamily) {
        this.autopilotFamily = autopilotFamily;
    }

    public int getAutopilotFamily() {
        return autopilotFamily;
    }

    public String getAutopilotType() {
        return autopilotType;
    }

    public void setAutopilotType(String autopilotType) {
        this.autopilotType = autopilotType;
    }

    public int getDataType() {
        return dataType;
    }

    public void setDataType(int dataType) {
        this.dataType = dataType;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }
}
