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
import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HotelDetailFragment extends Fragment implements View.OnClickListener{
    @BindView(R.id.hotelimage) ImageView mhotelimage;
    @BindView(R.id.hotelnametxt) TextView mNameLabel;
    @BindView(R.id.hoteltype) TextView mCategoriesLabel;
    @BindView(R.id.ratingTextView) TextView mRatingLabel;
    @BindView(R.id.websiteTextView) TextView mWebsiteLabel;
    @BindView(R.id.phoneTextView) TextView mPhoneLabel;
    @BindView(R.id.addressTextView) TextView mAddressLabel;
    @BindView(R.id.savehotelbtn) TextView mSaveRestaurantButton;

    private Business mhotel;

    public HotelDetailFragment() {
        // Required empty public constructor
    }

    public static HotelDetailFragment newInstance(Business hotel) {
        HotelDetailFragment hotelDetailFragment = new HotelDetailFragment();
        Bundle args = new Bundle();
        args.putParcelable("hotel", Parcels.wrap(hotel));
        hotelDetailFragment.setArguments(args);
        return hotelDetailFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mhotel = Parcels.unwrap(getArguments().getParcelable("hotel"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hotel_detail, container, false);
        ButterKnife.bind(this, view);

        Picasso.get().load(mhotel.getImageUrl()).into(mhotelimage);
        List<String> categories = new ArrayList<>();

        for (Category category: mhotel.getCategories()) {
            categories.add(category.getTitle());
        }

        mNameLabel.setText(mhotel.getName());
        mCategoriesLabel.setText(android.text.TextUtils.join(", ", categories));
        mRatingLabel.setText(Double.toString(mhotel.getRating()) + "/5");
        mPhoneLabel.setText(mhotel.getPhone());
        mAddressLabel.setText(mhotel.getLocation().toString());

        mWebsiteLabel.setOnClickListener(this);
        mPhoneLabel.setOnClickListener(this);
        mAddressLabel.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if (v == mWebsiteLabel) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse(mhotel.getUrl()));
            startActivity(webIntent);
        }
        if (v == mPhoneLabel) {
            Intent phoneIntent = new Intent(Intent.ACTION_DIAL,
                    Uri.parse("tel:" + mhotel.getPhone()));
            startActivity(phoneIntent);
        }
        if (v == mAddressLabel) {
            Intent mapIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("geo:" + mhotel.getCoordinates().getLatitude()
                            + "," + mhotel.getCoordinates().getLongitude()
                            + "?q=(" + mhotel.getName() + ")"));
            startActivity(mapIntent);
        }
    }
}