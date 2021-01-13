package com.example.hotelreserve.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.hotelreserve.Business;
import com.example.hotelreserve.R;
import com.example.hotelreserve.adapter.HotelsPageADapter;

import org.parceler.Parcels;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HotelDetailActivity extends AppCompatActivity {
    @BindView(R.id.viewPager)
    ViewPager mViewPager;
    private HotelsPageADapter adapterViewPager;
    List<Business> mhotels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_detail);

        ButterKnife.bind(this);

        mhotels = Parcels.unwrap(getIntent().getParcelableExtra("hotels"));
        int startingPosition = getIntent().getIntExtra("position", 0);

        adapterViewPager = new HotelsPageADapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT, mhotels);
        mViewPager.setAdapter(adapterViewPager);
        mViewPager.setCurrentItem(startingPosition);
    }
}