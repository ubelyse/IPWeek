package com.example.hotelreserve.ui;

import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hotelreserve.R;
import com.example.hotelreserve.models.AddressObj;
import com.example.hotelreserve.models.Category;
import com.example.hotelreserve.models.Hotels;
import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HotelDetailFragment extends Fragment {
    @BindView(R.id.hotelimage) ImageView mImageLabel;
    @BindView(R.id.hotelnametxt) TextView mNameLabel;
    @BindView(R.id.hoteltype) TextView mCategoriesLabel;
    @BindView(R.id.ratingTextView) TextView mRatingLabel;
    @BindView(R.id.websiteTextView) TextView mWebsiteLabel;
    @BindView(R.id.phoneTextView) TextView mPhoneLabel;
    @BindView(R.id.addressTextView) TextView mAddressLabel;
    @BindView(R.id.savehotelbtn) TextView mSaveRestaurantButton;

    private Hotels mhotels;

    public HotelDetailFragment() {
        // Required empty public constructor
    }

    public static HotelDetailFragment newInstance(Hotels hotels){
        HotelDetailFragment restaurantDetailFragment = new HotelDetailFragment();
        Bundle args = new Bundle();
        args.putParcelable("hotels", Parcels.wrap(hotels));
        restaurantDetailFragment.setArguments(args);
        return restaurantDetailFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mhotels = Parcels.unwrap(getArguments().getParcelable("hotels"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hotel_detail, container, false);
        ButterKnife.bind(this, view);
        Picasso.get().load(mhotels.getImageUrl()).into(mImageLabel);
        mNameLabel.setText(mhotels.getName());
        mCategoriesLabel.setText(android.text.TextUtils.join(", ", mhotels.getCategories()));
        mRatingLabel.setText(Double.toString(mhotels.getRating()) + "/5");
        mPhoneLabel.setText(mhotels.getPhone());
        mAddressLabel.setText(android.text.TextUtils.join(", ", mhotels.getAddress()));
        return view;
    }
}