package com.example.hotelreserve.adapter;

import android.content.Context;
import android.widget.ArrayAdapter;

public class HotelArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mhotels;
    private String[] mkitchen;

    public HotelArrayAdapter(Context mContext, int resource, String[] hotels, String[] mkitchen) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mhotels = hotels;
        this.mkitchen = mkitchen;
    }

    @Override
    public Object getItem(int position) {
        String hotels = mhotels[position];
        String kitchen = mkitchen[position];
        return String.format("%s \nServes great: %s", hotels, kitchen);
    }

    @Override
    public int getCount() {
        return mhotels.length;
    }
}

