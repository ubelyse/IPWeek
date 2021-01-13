package com.example.hotelreserve.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotelreserve.Business;
import com.example.hotelreserve.Category;
import com.example.hotelreserve.R;
import com.example.hotelreserve.YelpBusinessesSearchResponse;
import com.example.hotelreserve.adapter.HotelArrayAdapter;
import com.example.hotelreserve.adapter.HotelsListAdapter;
import com.example.hotelreserve.network.YelpApi;
import com.example.hotelreserve.network.YelpClient;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HotelActivity extends AppCompatActivity {

    private static final String TAG = HotelActivity.class.getSimpleName();

    @BindView(R.id.locationTextView) TextView mLocationTextView;
    @BindView(R.id.listView) ListView mListView;
    @BindView(R.id.errorTextView) TextView mErrorTextView;
    @BindView(R.id.progressBar) ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        ButterKnife.bind(this);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String hotel = ((TextView)view).getText().toString();
                Toast.makeText(HotelActivity.this, hotel, Toast.LENGTH_LONG).show();
            }
        });

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("Here are all the hotels near: " + location);

        YelpApi client = YelpClient.getClient();

        Call<YelpBusinessesSearchResponse> call = client.getHotels(location, "hotels");

        call.enqueue(new Callback<YelpBusinessesSearchResponse>() {
            @Override
            public void onResponse(Call<YelpBusinessesSearchResponse> call, Response<YelpBusinessesSearchResponse> response) {
                hideProgressBar();

                if (response.isSuccessful()) {
                    List<Business> hotelList = response.body().getBusinesses();
                    String[] hotels = new String[hotelList.size()];
                    String[] categories = new String[hotelList.size()];

                    for (int i = 0; i < hotels.length; i++){
                        hotels[i] = hotelList.get(i).getName();
                    }

                    for (int i = 0; i < categories.length; i++) {
                        Category category = hotelList.get(i).getCategories().get(0);
                        categories[i] = category.getTitle();
                    }

                    ArrayAdapter adapter
                            = new HotelArrayAdapter(HotelActivity.this, android.R.layout.simple_list_item_1, hotels, categories);
                    mListView.setAdapter(adapter);

                    showHotels();
                } else {
                    showUnsuccessfulMessage();
                }
            }

            @Override
            public void onFailure(Call<YelpBusinessesSearchResponse> call, Throwable t) {
                hideProgressBar();
                showFailureMessage();
            }

        });
    }

    private void showFailureMessage() {
        mErrorTextView.setText("Something went wrong. Please check your Internet connection and try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showUnsuccessfulMessage() {
        mErrorTextView.setText("Something went wrong. Please try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showHotels() {
        mListView.setVisibility(View.VISIBLE);
        mLocationTextView.setVisibility(View.VISIBLE);
    }

    private void hideProgressBar() {
        mProgressBar.setVisibility(View.GONE);
    }
}
