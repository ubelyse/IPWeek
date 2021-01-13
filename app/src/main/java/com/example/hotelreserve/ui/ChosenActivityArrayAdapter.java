package com.example.hotelreserve.ui;

import android.content.Context;
import android.widget.ArrayAdapter;

public class ChosenActivityArrayAdapter extends ArrayAdapter {

    private Context mContext;
    private String[] mMorningActivities;
    private String[] mMiddayActivities;

    public ChosenActivityArrayAdapter(Context mContext, int resource, String[] mMorningActivities, String[] mMiddayActivities){
        super(mContext, resource);
        this.mContext = mContext;
        this.mMorningActivities = mMorningActivities;
        this.mMiddayActivities = mMiddayActivities;
    }

    @Override
    public Object getItem(int position) {
        String morning = mMorningActivities[position];
        String midday = mMiddayActivities[position];
        return String.format("%s \nServes great: %s", morning, midday);
    }

   /*@Override
    public int getCount() {
        return mMorningActivities.length;
    }*/
}
