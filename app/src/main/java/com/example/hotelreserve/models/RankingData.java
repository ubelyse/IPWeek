
package com.example.hotelreserve.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RankingData {

    @SerializedName("ranking_string")
    @Expose
    private String rankingString;
    @SerializedName("ranking_out_of")
    @Expose
    private String rankingOutOf;
    @SerializedName("geo_location_id")
    @Expose
    private String geoLocationId;
    @SerializedName("ranking")
    @Expose
    private String ranking;
    @SerializedName("geo_location_name")
    @Expose
    private String geoLocationName;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RankingData() {
    }

    /**
     * 
     * @param geoLocationName
     * @param rankingOutOf
     * @param rankingString
     * @param ranking
     * @param geoLocationId
     */
    public RankingData(String rankingString, String rankingOutOf, String geoLocationId, String ranking, String geoLocationName) {
        super();
        this.rankingString = rankingString;
        this.rankingOutOf = rankingOutOf;
        this.geoLocationId = geoLocationId;
        this.ranking = ranking;
        this.geoLocationName = geoLocationName;
    }

    public String getRankingString() {
        return rankingString;
    }

    public void setRankingString(String rankingString) {
        this.rankingString = rankingString;
    }

    public String getRankingOutOf() {
        return rankingOutOf;
    }

    public void setRankingOutOf(String rankingOutOf) {
        this.rankingOutOf = rankingOutOf;
    }

    public String getGeoLocationId() {
        return geoLocationId;
    }

    public void setGeoLocationId(String geoLocationId) {
        this.geoLocationId = geoLocationId;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public String getGeoLocationName() {
        return geoLocationName;
    }

    public void setGeoLocationName(String geoLocationName) {
        this.geoLocationName = geoLocationName;
    }

}
