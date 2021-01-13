
package com.example.hotelreserve.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TripType {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("localized_name")
    @Expose
    private String localizedName;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TripType() {
    }

    /**
     * 
     * @param localizedName
     * @param name
     * @param value
     */
    public TripType(String name, String value, String localizedName) {
        super();
        this.name = name;
        this.value = value;
        this.localizedName = localizedName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
    }

}
