
package com.example.hotelreserve;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Map {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("polyline")
    @Expose
    private Object polyline;
    @SerializedName("resource_state")
    @Expose
    private Integer resourceState;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Map() {
    }

    /**
     * 
     * @param resourceState
     * @param id
     * @param polyline
     */
    public Map(String id, Object polyline, Integer resourceState) {
        super();
        this.id = id;
        this.polyline = polyline;
        this.resourceState = resourceState;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getPolyline() {
        return polyline;
    }

    public void setPolyline(Object polyline) {
        this.polyline = polyline;
    }

    public Integer getResourceState() {
        return resourceState;
    }

    public void setResourceState(Integer resourceState) {
        this.resourceState = resourceState;
    }

}
