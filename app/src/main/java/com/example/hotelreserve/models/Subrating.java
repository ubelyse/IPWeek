
package com.example.hotelreserve.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Subrating {

    @SerializedName("rating_image_url")
    @Expose
    private String ratingImageUrl;
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
    public Subrating() {
    }

    /**
     * 
     * @param localizedName
     * @param name
     * @param ratingImageUrl
     * @param value
     */
    public Subrating(String ratingImageUrl, String name, String value, String localizedName) {
        super();
        this.ratingImageUrl = ratingImageUrl;
        this.name = name;
        this.value = value;
        this.localizedName = localizedName;
    }

    public String getRatingImageUrl() {
        return ratingImageUrl;
    }

    public void setRatingImageUrl(String ratingImageUrl) {
        this.ratingImageUrl = ratingImageUrl;
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
