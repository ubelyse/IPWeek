package com.example.hotelreserve.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hotelreserve.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.findHotel) Button mhotel;
    @BindView(R.id.locationEditText)
    EditText mlocation;
    @BindView(R.id.appNameTextView) TextView mappname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mhotel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == mhotel) {
            String location = mlocation.getText().toString();
            Intent intent = new Intent(MainActivity.this, HotelActivity.class);
            intent.putExtra("location", location);
            startActivity(intent);
        }
    }
}