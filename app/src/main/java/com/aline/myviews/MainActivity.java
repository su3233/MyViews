package com.aline.myviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.aline.myviews.anim.AnimActivity;
import com.aline.myviews.anim.ValueAnimatorActivity;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        findViewById(R.id.bt_base_view).setOnClickListener(this);
        findViewById(R.id.bt_base_anim).setOnClickListener(this);
        findViewById(R.id.bt_value_anim).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_base_view:
                startActivity(new Intent(MainActivity.this, BaseViewActivity.class));
                break;
            case R.id.bt_base_anim:
                startActivity(new Intent(MainActivity.this, AnimActivity.class));
                break;
            case R.id.bt_value_anim:
                startActivity(new Intent(MainActivity.this, ValueAnimatorActivity.class));
                break;
        }
    }
}