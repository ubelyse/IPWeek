package com.example.hotelreserve.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.hotelreserve.R;
import com.example.hotelreserve.adapter.HotelsPageADapter;
import com.example.hotelreserve.models.AddressObj;
import com.example.hotelreserve.models.Hotels;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HotelDetailActivity extends AppCompatActivity {
    @BindView(R.id.viewPager) ViewPager mViewPager;
    private HotelsPageADapter adapterViewPager;
    ArrayList<Hotels> mhotels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_detail);

        ButterKnife.bind(this);

        mhotels = Parcels.unwrap(getIntent().getParcelableExtra("hotels"));
        int startingPosition = getIntent().getIntExtra("position", 0);

        adapterViewPager = new HotelsPageADapter(getSupportFragmentManager(), mhotels);
        mViewPager.setAdapter(adapterViewPager);
        mViewPager.setCurrentItem(startingPosition);
    }
}