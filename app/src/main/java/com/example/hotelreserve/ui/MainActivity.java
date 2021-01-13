package com.example.hotelreserve.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hotelreserve.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = MainActivity.class.getSimpleName();
    @BindView(R.id.findHotel) Button mhotel;
    @BindView(R.id.locationEditText) EditText mlocation;
    @BindView(R.id.appNameTextView) TextView mAppNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Typeface caviarFont = Typeface.createFromAsset(getAssets(), "fonts/CaviarDreams.ttf");
        mAppNameTextView.setTypeface(caviarFont);
        mhotel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v == mhotel) {
            Intent intent = new Intent(MainActivity.this, HotelActivity.class);
            String location = mlocation.getText().toString();
            intent.putExtra("location", location);
            startActivity(intent);
        }
    }
}