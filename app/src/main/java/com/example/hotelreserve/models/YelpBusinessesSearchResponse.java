
package com.example.hotelreserve.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class YelpBusinessesSearchResponse {

    @SerializedName("address_obj")
    @Expose
    private AddressObj addressObj;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("location_id")
    @Expose
    private String locationId;
    @SerializedName("trip_types")
    @Expose
    private List<TripType> tripTypes = null;
    @SerializedName("write_review")
    @Expose
    private String writeReview;
    @SerializedName("ancestors")
    @Expose
    private List<Ancestor> ancestors = null;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("hours")
    @Expose
    private Object hours;
    @SerializedName("percent_recommended")
    @Expose
    private Object percentRecommended;
    @SerializedName("hotel_booking")
    @Expose
    private HotelBooking hotelBooking;
    @SerializedName("review_rating_count")
    @Expose
    private ReviewRatingCount reviewRatingCount;
    @SerializedName("subratings")
    @Expose
    private List<Subrating> subratings = null;
    @SerializedName("ranking_data")
    @Expose
    private RankingData rankingData;
    @SerializedName("photo_count")
    @Expose
    private String photoCount;
    @SerializedName("location_string")
    @Expose
    private String locationString;
    @SerializedName("web_url")
    @Expose
    private String webUrl;
    @SerializedName("price_level")
    @Expose
    private String priceLevel;
    @SerializedName("rating_image_url")
    @Expose
    private String ratingImageUrl;
    @SerializedName("awards")
    @Expose
    private List<Award> awards = null;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("num_reviews")
    @Expose
    private String numReviews;
    @SerializedName("category")
    @Expose
    private Category category;
    @SerializedName("subcategory")
    @Expose
    private List<Subcategory> subcategory = null;
    @SerializedName("see_all_photos")
    @Expose
    private String seeAllPhotos;

    /**
     * No args constructor for use in serialization
     * 
     */
    public YelpBusinessesSearchResponse() {
    }

    /**
     * 
     * @param latitude
     * @param percentRecommended
     * @param rating
     * @param numReviews
     * @param priceLevel
     * @param addressObj
     * @param photoCount
     * @param locationId
     * @param ancestors
     * @param seeAllPhotos
     * @param longitude
     * @param rankingData
     * @param hours
     * @param reviewRatingCount
     * @param hotelBooking
     * @param subratings
     * @param writeReview
     * @param webUrl
     * @param awards
     * @param locationString
     * @param name
     * @param tripTypes
     * @param ratingImageUrl
     * @param category
     * @param subcategory
     */
    public YelpBusinessesSearchResponse(AddressObj addressObj, String latitude, String rating, String locationId, List<TripType> tripTypes, String writeReview, List<Ancestor> ancestors, String longitude, Object hours, Object percentRecommended, HotelBooking hotelBooking, ReviewRatingCount reviewRatingCount, List<Subrating> subratings, RankingData rankingData, String photoCount, String locationString, String webUrl, String priceLevel, String ratingImageUrl, List<Award> awards, String name, String numReviews, Category category, List<Subcategory> subcategory, String seeAllPhotos) {
        super();
        this.addressObj = addressObj;
        this.latitude = latitude;
        this.rating = rating;
        this.locationId = locationId;
        this.tripTypes = tripTypes;
        this.writeReview = writeReview;
        this.ancestors = ancestors;
        this.longitude = longitude;
        this.hours = hours;
        this.percentRecommended = percentRecommended;
        this.hotelBooking = hotelBooking;
        this.reviewRatingCount = reviewRatingCount;
        this.subratings = subratings;
        this.rankingData = rankingData;
        this.photoCount = photoCount;
        this.locationString = locationString;
        this.webUrl = webUrl;
        this.priceLevel = priceLevel;
        this.ratingImageUrl = ratingImageUrl;
        this.awards = awards;
        this.name = name;
        this.numReviews = numReviews;
        this.category = category;
        this.subcategory = subcategory;
        this.seeAllPhotos = seeAllPhotos;
    }

    public AddressObj getAddressObj() {
        return addressObj;
    }

    public void setAddressObj(AddressObj addressObj) {
        this.addressObj = addressObj;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public List<TripType> getTripTypes() {
        return tripTypes;
    }

    public void setTripTypes(List<TripType> tripTypes) {
        this.tripTypes = tripTypes;
    }

    public String getWriteReview() {
        return writeReview;
    }

    public void setWriteReview(String writeReview) {
        this.writeReview = writeReview;
    }

    public List<Ancestor> getAncestors() {
        return ancestors;
    }

    public void setAncestors(List<Ancestor> ancestors) {
        this.ancestors = ancestors;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Object getHours() {
        return hours;
    }

    public void setHours(Object hours) {
        this.hours = hours;
    }

    public Object getPercentRecommended() {
        return percentRecommended;
    }

    public void setPercentRecommended(Object percentRecommended) {
        this.percentRecommended = percentRecommended;
    }

    public HotelBooking getHotelBooking() {
        return hotelBooking;
    }

    public void setHotelBooking(HotelBooking hotelBooking) {
        this.hotelBooking = hotelBooking;
    }

    public ReviewRatingCount getReviewRatingCount() {
        return reviewRatingCount;
    }

    public void setReviewRatingCount(ReviewRatingCount reviewRatingCount) {
        this.reviewRatingCount = reviewRatingCount;
    }

    public List<Subrating> getSubratings() {
        return subratings;
    }

    public void setSubratings(List<Subrating> subratings) {
        this.subratings = subratings;
    }

    public RankingData getRankingData() {
        return rankingData;
    }

    public void setRankingData(RankingData rankingData) {
        this.rankingData = rankingData;
    }

    public String getPhotoCount() {
        return photoCount;
    }

    public void setPhotoCount(String photoCount) {
        this.photoCount = photoCount;
    }

    public String getLocationString() {
        return locationString;
    }

    public void setLocationString(String locationString) {
        this.locationString = locationString;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getPriceLevel() {
        return priceLevel;
    }

    public void setPriceLevel(String priceLevel) {
        this.priceLevel = priceLevel;
    }

    public String getRatingImageUrl() {
        return ratingImageUrl;
    }

    public void setRatingImageUrl(String ratingImageUrl) {
        this.ratingImageUrl = ratingImageUrl;
    }

    public List<Award> getAwards() {
        return awards;
    }

    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumReviews() {
        return numReviews;
    }

    public void setNumReviews(String numReviews) {
        this.numReviews = numReviews;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Subcategory> getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(List<Subcategory> subcategory) {
        this.subcategory = subcategory;
    }

    public String getSeeAllPhotos() {
        return seeAllPhotos;
    }

    public void setSeeAllPhotos(String seeAllPhotos) {
        this.seeAllPhotos = seeAllPhotos;
    }

}
