
package com.example.hotelreserve.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddressObj {

    @SerializedName("street1")
    @Expose
    private String street1;
    @SerializedName("street2")
    @Expose
    private String street2;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("postalcode")
    @Expose
    private String postalcode;
    @SerializedName("address_string")
    @Expose
    private String addressString;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AddressObj() {
    }

    /**
     * 
     * @param country
     * @param city
     * @param postalcode
     * @param addressString
     * @param street1
     * @param street2
     * @param state
     */
    public AddressObj(String street1, String street2, String city, String state, String country, String postalcode, String addressString) {
        super();
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.postalcode = postalcode;
        this.addressString = addressString;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getAddressString() {
        return addressString;
    }

    public void setAddressString(String addressString) {
        this.addressString = addressString;
    }

}
