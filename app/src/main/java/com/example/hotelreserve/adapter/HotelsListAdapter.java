package com.example.hotelreserve.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.hotelreserve.R;
import com.example.hotelreserve.models.Hotels;
import com.example.hotelreserve.ui.HotelDetailActivity;
import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HotelsListAdapter extends RecyclerView.Adapter<HotelsListAdapter.HotelViewHolder> {
    private ArrayList<Hotels> mhotels = new ArrayList<>();
    private Context mContext;

    public HotelsListAdapter(Context context, ArrayList<Hotels> hotels){
        mContext = context;
        mhotels = hotels;
    }

    @Override
    public HotelsListAdapter.HotelViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hotel_list_item, parent, false);
        HotelViewHolder viewHolder = new HotelViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(HotelsListAdapter.HotelViewHolder holder, int position){
        holder.bindHotels(mhotels.get(position));
    }

    @Override
    public int getItemCount(){
        return mhotels.size();
    }

    public class HotelViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        @BindView(R.id.hotelimage) ImageView mhotelimage;
        @BindView(R.id.hotelnametxt) TextView mNameTextView;
        @BindView(R.id.categoryTextView) TextView mCategoryTextView;
        @BindView(R.id.ratingTextView) TextView mRatingTextView;

        private Context mContext;

        public HotelViewHolder(View itemView){
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
            itemView.setOnClickListener(this);
        }

        public void bindHotels(Hotels hotels) {
            mNameTextView.setText(hotels.getName());
            mCategoryTextView.setText(hotels.getCategories().get(0));
            mRatingTextView.setText("Rating: " + hotels.getRating() + "/5");
            Picasso.get().load(hotels.getImageUrl()).into(mhotelimage);
        }

        @Override
        public void onClick(View v){
            int itemPosition = getLayoutPosition();
            Intent intent = new Intent(mContext, HotelDetailActivity.class);
            intent.putExtra("position", itemPosition);
            intent.putExtra("hotels", Parcels.wrap(mhotels));
            mContext.startActivity(intent);
        }
    }
}
