package com.example.hotelreserve.ui;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hotelreserve.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ChosenActivity extends AppCompatActivity {

    @BindView(R.id.locationTextView)  TextView mLocationTextView;
    @BindView(R.id.listView)  ListView mListView;

    private String[] MorningActivities=new String[]{"Stretch","Drink water","Exercise","Eat breakfast","Read a motivational quote","Listen to music","Do a mental puzzle","Get updated on the news","Plan your day","Pack a healthy snack for the day"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chosen);
        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, MorningActivities);
        mListView.setAdapter(adapter);

    }

}