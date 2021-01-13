
package com.example.hotelreserve.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ancestor {

    @SerializedName("abbrv")
    @Expose
    private Object abbrv;
    @SerializedName("level")
    @Expose
    private String level;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("location_id")
    @Expose
    private String locationId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Ancestor() {
    }

    /**
     * 
     * @param abbrv
     * @param level
     * @param locationId
     * @param name
     */
    public Ancestor(Object abbrv, String level, String name, String locationId) {
        super();
        this.abbrv = abbrv;
        this.level = level;
        this.name = name;
        this.locationId = locationId;
    }

    public Object getAbbrv() {
        return abbrv;
    }

    public void setAbbrv(Object abbrv) {
        this.abbrv = abbrv;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

}
