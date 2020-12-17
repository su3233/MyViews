package com.aline.myviews.anim;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.aline.myviews.BaseActivity;
import com.aline.myviews.R;

public class AnimActivity extends BaseActivity {

    @Override
    protected int getLayout() {
        return R.layout.activity_anim;
    }

    @Override
    protected void initView() {
        final TextView tv_anim = findViewById(R.id.tv_anim_view);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.view_anim);
        findViewById(R.id.bt_start_anim).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_anim.startAnimation(animation);
            }
        });
    }
}