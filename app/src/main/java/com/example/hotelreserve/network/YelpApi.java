package com.example.hotelreserve.network;

import com.example.hotelreserve.ui.YelpBusinessesSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface YelpApi {

    @GET("businesses/popular?api_key=GfNSmB2VXmIYk9CEkgEdItPoBPgPB1FvK4KsHxV6aGgdZvfORtpFBhvu3SrkZmh1kFJmM0AO8mh6us9m4-j_0PbXqSvTrcmtorSNjWGfvzRzpr-5K88pCAnHYgX7X3Yx\"")
    Call<YelpBusinessesSearchResponse> getHotels(
            @Query("location") String location,
            @Query("term") String term
    );
}
