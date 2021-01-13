
package com.example.hotelreserve;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Athlete {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("resource_state")
    @Expose
    private Integer resourceState;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Athlete() {
    }

    /**
     * 
     * @param resourceState
     * @param id
     */
    public Athlete(Integer id, Integer resourceState) {
        super();
        this.id = id;
        this.resourceState = resourceState;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getResourceState() {
        return resourceState;
    }

    public void setResourceState(Integer resourceState) {
        this.resourceState = resourceState;
    }

}
