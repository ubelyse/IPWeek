
package com.example.hotelreserve.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Award {

    @SerializedName("award_type")
    @Expose
    private String awardType;
    @SerializedName("year")
    @Expose
    private String year;
    @SerializedName("images")
    @Expose
    private Images images;
    @SerializedName("categories")
    @Expose
    private List<Object> categories = null;
    @SerializedName("display_name")
    @Expose
    private String displayName;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Award() {
    }

    /**
     * 
     * @param images
     * @param year
     * @param displayName
     * @param categories
     * @param awardType
     */
    public Award(String awardType, String year, Images images, List<Object> categories, String displayName) {
        super();
        this.awardType = awardType;
        this.year = year;
        this.images = images;
        this.categories = categories;
        this.displayName = displayName;
    }

    public String getAwardType() {
        return awardType;
    }

    public void setAwardType(String awardType) {
        this.awardType = awardType;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public List<Object> getCategories() {
        return categories;
    }

    public void setCategories(List<Object> categories) {
        this.categories = categories;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

}
