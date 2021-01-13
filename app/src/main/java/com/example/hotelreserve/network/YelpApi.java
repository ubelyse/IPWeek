package com.example.hotelreserve.network;

import com.example.hotelreserve.HotelResrve;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface YelpApi {

    @GET("/activities")
    Call<HotelResrve> getHotels(
            @Query("location") String location,
            @Query("term") String term
    );
}
