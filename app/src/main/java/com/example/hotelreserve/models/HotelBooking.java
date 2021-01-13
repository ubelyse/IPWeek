
package com.example.hotelreserve.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelBooking {

    @SerializedName("bookable")
    @Expose
    private Boolean bookable;
    @SerializedName("booking_url")
    @Expose
    private String bookingUrl;

    /**
     * No args constructor for use in serialization
     * 
     */
    public HotelBooking() {
    }

    /**
     * 
     * @param bookable
     * @param bookingUrl
     */
    public HotelBooking(Boolean bookable, String bookingUrl) {
        super();
        this.bookable = bookable;
        this.bookingUrl = bookingUrl;
    }

    public Boolean getBookable() {
        return bookable;
    }

    public void setBookable(Boolean bookable) {
        this.bookable = bookable;
    }

    public String getBookingUrl() {
        return bookingUrl;
    }

    public void setBookingUrl(String bookingUrl) {
        this.bookingUrl = bookingUrl;
    }

}
