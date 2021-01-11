package com.example.hotelreserve.network;

import com.example.hotelreserve.ui.YelpBusinessesSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface YelpApi {

    @GET("businesses/search")
    Call<YelpBusinessesSearchResponse> getHotels(
            @Query("location") String location,
            @Query("term") String term
    );
}
