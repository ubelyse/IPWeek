package com.example.hotelreserve.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hotelreserve.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DailyChoose extends AppCompatActivity {
    @BindView(R.id.sectionRadioGroup) RadioGroup mrdgrup;
    @BindView(R.id.radioButton1) RadioButton mbtn1;
    @BindView(R.id.radioButton2) RadioButton mbtn2;
    @BindView(R.id.radioButton3) RadioButton mbtn3;
    @BindView(R.id.radioButton4) RadioButton mbtn4;

    @BindView(R.id.submitButton) Button msubmit;
   // @BindView(R.id.RestaurantFind) Button mresto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_choose);
        ButterKnife.bind(this);

       /* mresto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DailyChoose.this,MainActivity.class);
                startActivity(intent);
            }
        });*/

        msubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mbtn1.isChecked()) {
                    Intent intent = new Intent(DailyChoose.this, ChosenActivity.class);
                    startActivity(intent);
                }
                else if(mbtn2.isChecked()){
                    Intent intent = new Intent(DailyChoose.this, ChoseMidDay.class);
                    startActivity(intent);
                }

                else if(mbtn3.isChecked()){
                    Intent intent = new Intent(DailyChoose.this, ChoseAfternoon.class);
                    startActivity(intent);
                }

                else if(mbtn4.isChecked()){
                    Intent intent = new Intent(DailyChoose.this, ChoseEvening.class);
                    startActivity(intent);
                }
            }
        });
    }

}