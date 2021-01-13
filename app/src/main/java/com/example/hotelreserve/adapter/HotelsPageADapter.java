package com.example.hotelreserve.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.hotelreserve.models.Hotels;
import com.example.hotelreserve.ui.HotelDetailFragment;

import java.util.ArrayList;
import java.util.List;

public class HotelsPageADapter extends FragmentPagerAdapter {
    private ArrayList<Hotels> mhotels;

    public HotelsPageADapter(FragmentManager fm, ArrayList<Hotels> hotels){
        super(fm);
        mhotels = hotels;
    }

    @Override
    public Fragment getItem(int position){
        return HotelDetailFragment.newInstance(mhotels.get(position));
    }

    @Override
    public int getCount(){
        return mhotels.size();
    }

    @Override
    public CharSequence getPageTitle(int position){
        return mhotels.get(position).getName();
    }
}
