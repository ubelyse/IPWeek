package com.example.hotelreserve;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HotelsListAdapter extends RecyclerView.Adapter<HotelsListAdapter.HotelsViewHolder>{
    private List<Business> mhotels;
    private Context mContext;

    public HotelsListAdapter(List<Business> mhotels, Context mContext) {
        this.mhotels = mhotels;
        this.mContext = mContext;
    }

    @Override
    public HotelsListAdapter.HotelsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hotel_list_item, parent, false);
        HotelsViewHolder viewHolder = new HotelsViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(HotelsListAdapter.HotelsViewHolder holder, int position) {
        holder.bindHotel(mhotels.get(position));
    }

    @Override
    public int getItemCount() {
        return mhotels.size();
    }



    public class HotelsViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.restaurantImageView) ImageView mRestaurantImageView;
        @BindView(R.id.restaurantNameTextView) TextView mNameTextView;
        @BindView(R.id.categoryTextView) TextView mCategoryTextView;
        @BindView(R.id.ratingTextView) TextView mRatingTextView;private Context mContext;

        public HotelsViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
        }

        public void bindHotel(Business restaurant) {
            Picasso.get().load(restaurant.getImageUrl()).into(mRestaurantImageView);
            mNameTextView.setText(restaurant.getName());
            mCategoryTextView.setText(restaurant.getCategories().get(0).getTitle());
            mRatingTextView.setText("Rating: " + restaurant.getRating() + "/5");
        }
    }
}
