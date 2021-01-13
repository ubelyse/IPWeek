
package com.example.hotelreserve;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelResrve {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("resource_state")
    @Expose
    private Integer resourceState;
    @SerializedName("external_id")
    @Expose
    private Object externalId;
    @SerializedName("upload_id")
    @Expose
    private Object uploadId;
    @SerializedName("athlete")
    @Expose
    private Athlete athlete;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("distance")
    @Expose
    private Integer distance;
    @SerializedName("moving_time")
    @Expose
    private Integer movingTime;
    @SerializedName("elapsed_time")
    @Expose
    private Integer elapsedTime;
    @SerializedName("total_elevation_gain")
    @Expose
    private Integer totalElevationGain;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("start_date_local")
    @Expose
    private String startDateLocal;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("utc_offset")
    @Expose
    private Integer utcOffset;
    @SerializedName("achievement_count")
    @Expose
    private Integer achievementCount;
    @SerializedName("kudos_count")
    @Expose
    private Integer kudosCount;
    @SerializedName("comment_count")
    @Expose
    private Integer commentCount;
    @SerializedName("athlete_count")
    @Expose
    private Integer athleteCount;
    @SerializedName("photo_count")
    @Expose
    private Integer photoCount;
    @SerializedName("map")
    @Expose
    private Map map;
    @SerializedName("trainer")
    @Expose
    private Boolean trainer;
    @SerializedName("commute")
    @Expose
    private Boolean commute;
    @SerializedName("manual")
    @Expose
    private Boolean manual;
    @SerializedName("private")
    @Expose
    private Boolean _private;
    @SerializedName("flagged")
    @Expose
    private Boolean flagged;
    @SerializedName("gear_id")
    @Expose
    private String gearId;
    @SerializedName("from_accepted_tag")
    @Expose
    private Object fromAcceptedTag;
    @SerializedName("average_speed")
    @Expose
    private Integer averageSpeed;
    @SerializedName("max_speed")
    @Expose
    private Integer maxSpeed;
    @SerializedName("device_watts")
    @Expose
    private Boolean deviceWatts;
    @SerializedName("has_heartrate")
    @Expose
    private Boolean hasHeartrate;
    @SerializedName("pr_count")
    @Expose
    private Integer prCount;
    @SerializedName("total_photo_count")
    @Expose
    private Integer totalPhotoCount;
    @SerializedName("has_kudoed")
    @Expose
    private Boolean hasKudoed;
    @SerializedName("workout_type")
    @Expose
    private Object workoutType;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("calories")
    @Expose
    private Integer calories;
    @SerializedName("segment_efforts")
    @Expose
    private List<Object> segmentEfforts = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public HotelResrve() {
    }

    /**
     * 
     * @param uploadId
     * @param distance
     * @param timezone
     * @param movingTime
     * @param description
     * @param gearId
     * @param prCount
     * @param type
     * @param manual
     * @param achievementCount
     * @param photoCount
     * @param segmentEfforts
     * @param _private
     * @param flagged
     * @param trainer
     * @param resourceState
     * @param id
     * @param athleteCount
     * @param map
     * @param utcOffset
     * @param deviceWatts
     * @param athlete
     * @param totalPhotoCount
     * @param startDateLocal
     * @param externalId
     * @param hasKudoed
     * @param averageSpeed
     * @param maxSpeed
     * @param calories
     * @param commentCount
     * @param hasHeartrate
     * @param kudosCount
     * @param workoutType
     * @param name
     * @param fromAcceptedTag
     * @param totalElevationGain
     * @param commute
     * @param startDate
     * @param elapsedTime
     */
    public HotelResrve(Integer id, Integer resourceState, Object externalId, Object uploadId, Athlete athlete, String name, Integer distance, Integer movingTime, Integer elapsedTime, Integer totalElevationGain, String type, String startDate, String startDateLocal, String timezone, Integer utcOffset, Integer achievementCount, Integer kudosCount, Integer commentCount, Integer athleteCount, Integer photoCount, Map map, Boolean trainer, Boolean commute, Boolean manual, Boolean _private, Boolean flagged, String gearId, Object fromAcceptedTag, Integer averageSpeed, Integer maxSpeed, Boolean deviceWatts, Boolean hasHeartrate, Integer prCount, Integer totalPhotoCount, Boolean hasKudoed, Object workoutType, Object description, Integer calories, List<Object> segmentEfforts) {
        super();
        this.id = id;
        this.resourceState = resourceState;
        this.externalId = externalId;
        this.uploadId = uploadId;
        this.athlete = athlete;
        this.name = name;
        this.distance = distance;
        this.movingTime = movingTime;
        this.elapsedTime = elapsedTime;
        this.totalElevationGain = totalElevationGain;
        this.type = type;
        this.startDate = startDate;
        this.startDateLocal = startDateLocal;
        this.timezone = timezone;
        this.utcOffset = utcOffset;
        this.achievementCount = achievementCount;
        this.kudosCount = kudosCount;
        this.commentCount = commentCount;
        this.athleteCount = athleteCount;
        this.photoCount = photoCount;
        this.map = map;
        this.trainer = trainer;
        this.commute = commute;
        this.manual = manual;
        this._private = _private;
        this.flagged = flagged;
        this.gearId = gearId;
        this.fromAcceptedTag = fromAcceptedTag;
        this.averageSpeed = averageSpeed;
        this.maxSpeed = maxSpeed;
        this.deviceWatts = deviceWatts;
        this.hasHeartrate = hasHeartrate;
        this.prCount = prCount;
        this.totalPhotoCount = totalPhotoCount;
        this.hasKudoed = hasKudoed;
        this.workoutType = workoutType;
        this.description = description;
        this.calories = calories;
        this.segmentEfforts = segmentEfforts;
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

    public Object getExternalId() {
        return externalId;
    }

    public void setExternalId(Object externalId) {
        this.externalId = externalId;
    }

    public Object getUploadId() {
        return uploadId;
    }

    public void setUploadId(Object uploadId) {
        this.uploadId = uploadId;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getMovingTime() {
        return movingTime;
    }

    public void setMovingTime(Integer movingTime) {
        this.movingTime = movingTime;
    }

    public Integer getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public Integer getTotalElevationGain() {
        return totalElevationGain;
    }

    public void setTotalElevationGain(Integer totalElevationGain) {
        this.totalElevationGain = totalElevationGain;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartDateLocal() {
        return startDateLocal;
    }

    public void setStartDateLocal(String startDateLocal) {
        this.startDateLocal = startDateLocal;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Integer getUtcOffset() {
        return utcOffset;
    }

    public void setUtcOffset(Integer utcOffset) {
        this.utcOffset = utcOffset;
    }

    public Integer getAchievementCount() {
        return achievementCount;
    }

    public void setAchievementCount(Integer achievementCount) {
        this.achievementCount = achievementCount;
    }

    public Integer getKudosCount() {
        return kudosCount;
    }

    public void setKudosCount(Integer kudosCount) {
        this.kudosCount = kudosCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getAthleteCount() {
        return athleteCount;
    }

    public void setAthleteCount(Integer athleteCount) {
        this.athleteCount = athleteCount;
    }

    public Integer getPhotoCount() {
        return photoCount;
    }

    public void setPhotoCount(Integer photoCount) {
        this.photoCount = photoCount;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Boolean getTrainer() {
        return trainer;
    }

    public void setTrainer(Boolean trainer) {
        this.trainer = trainer;
    }

    public Boolean getCommute() {
        return commute;
    }

    public void setCommute(Boolean commute) {
        this.commute = commute;
    }

    public Boolean getManual() {
        return manual;
    }

    public void setManual(Boolean manual) {
        this.manual = manual;
    }

    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    public Boolean getFlagged() {
        return flagged;
    }

    public void setFlagged(Boolean flagged) {
        this.flagged = flagged;
    }

    public String getGearId() {
        return gearId;
    }

    public void setGearId(String gearId) {
        this.gearId = gearId;
    }

    public Object getFromAcceptedTag() {
        return fromAcceptedTag;
    }

    public void setFromAcceptedTag(Object fromAcceptedTag) {
        this.fromAcceptedTag = fromAcceptedTag;
    }

    public Integer getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(Integer averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Boolean getDeviceWatts() {
        return deviceWatts;
    }

    public void setDeviceWatts(Boolean deviceWatts) {
        this.deviceWatts = deviceWatts;
    }

    public Boolean getHasHeartrate() {
        return hasHeartrate;
    }

    public void setHasHeartrate(Boolean hasHeartrate) {
        this.hasHeartrate = hasHeartrate;
    }

    public Integer getPrCount() {
        return prCount;
    }

    public void setPrCount(Integer prCount) {
        this.prCount = prCount;
    }

    public Integer getTotalPhotoCount() {
        return totalPhotoCount;
    }

    public void setTotalPhotoCount(Integer totalPhotoCount) {
        this.totalPhotoCount = totalPhotoCount;
    }

    public Boolean getHasKudoed() {
        return hasKudoed;
    }

    public void setHasKudoed(Boolean hasKudoed) {
        this.hasKudoed = hasKudoed;
    }

    public Object getWorkoutType() {
        return workoutType;
    }

    public void setWorkoutType(Object workoutType) {
        this.workoutType = workoutType;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public List<Object> getSegmentEfforts() {
        return segmentEfforts;
    }

    public void setSegmentEfforts(List<Object> segmentEfforts) {
        this.segmentEfforts = segmentEfforts;
    }

}
