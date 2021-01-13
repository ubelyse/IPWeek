package com.example.hotelreserve.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotelreserve.adapter.HotelsListAdapter;
import com.example.hotelreserve.R;
import com.example.hotelreserve.models.Hotels;
import com.example.hotelreserve.network.YelpClient;

import java.io.IOException;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class HotelActivity extends AppCompatActivity {
    public static final String TAG = HotelActivity.class.getSimpleName();
    private ArrayList<Hotels> hotels = new ArrayList<>();
    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;
    private HotelsListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        getHotels(location);
    }

    private void getHotels(String location){
        final YelpClient yelpClient = new YelpClient();
        yelpClient.findHotels(location, new Callback(){

            @Override
            public void onFailure(okhttp3.Call call, IOException e){
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                hotels = yelpClient.processResults(response);
                HotelActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        mAdapter = new HotelsListAdapter(getApplicationContext(), hotels);
                        mRecyclerView.setAdapter(mAdapter);
                        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(HotelActivity.this);
                        mRecyclerView.setLayoutManager(layoutManager);
                        mRecyclerView.setHasFixedSize(true);
                    }
                });
            }
        });
    }

}
