package com.aline.myviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BaseViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_view);
    }
}