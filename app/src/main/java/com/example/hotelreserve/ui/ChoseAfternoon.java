package com.example.hotelreserve.ui;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.hotelreserve.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ChoseAfternoon extends com.example.hotelreserve.ui.ChosenActivity {
    @BindView(R.id.locationTextView)
    TextView mLocationTextView;
    @BindView(R.id.listView)
    ListView mListView;

    private String[] AfternoonActivties=new String[]{"Explore Photography","Explore Sewing","Explore Woodworking"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chosen);
        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, AfternoonActivties);
        mListView.setAdapter(adapter);

    }
}
