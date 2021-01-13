package com.example.hotelreserve.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.hotelreserve.Business;
import com.example.hotelreserve.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HotelsListAdapter extends RecyclerView.Adapter<HotelsListAdapter.HotelsViewHolder>{
    private List<Business> mhotels;
    private Context mContext;

    public HotelsListAdapter(Context context, List<Business> hotels) {
        mContext = context;
        mhotels = hotels;
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

        @BindView(R.id.hotelimage) ImageView mhotelimage;
        @BindView(R.id.hotelname) TextView mhotelname;
        @BindView(R.id.categoryTextView) TextView mCategoryTextView;
        @BindView(R.id.rating) TextView mrating;
        private Context mContext;

        public HotelsViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
        }

        public void bindHotel(Business hotel) {
            Picasso.get().load(hotel.getImageUrl()).into(mhotelimage);
            mhotelname.setText(hotel.getName());
            mCategoryTextView.setText(hotel.getCategories().get(0).getTitle());
            mrating.setText("Rating: " + hotel.getRating() + "/5");
        }
    }
}
