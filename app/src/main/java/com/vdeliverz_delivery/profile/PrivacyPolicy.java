package com.vdeliverz_delivery.profile;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.vdeliverz_delivery.R;


public class PrivacyPolicy extends AppCompatActivity {

    ImageView iv_back;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_privacy_policy);
        iv_back=findViewById(R.id.iv_back);

        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callnextscreen();
            }
        });
    }

    private  void callnextscreen(){
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        callnextscreen();
    }

}
