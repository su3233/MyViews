package com.aline.myviews.anim;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.aline.myviews.BaseActivity;
import com.aline.myviews.R;

public class ValueAnimatorActivity extends BaseActivity {


    private TextView tv_value;

    @Override
    protected int getLayout() {
        return R.layout.activity_value_animator;
    }

    @Override
    protected void initView() {
        tv_value = findViewById(R.id.tv_value);
        tv_value.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("click me");
            }
        });
        findViewById(R.id.bt_value_animator).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doAnimator();
            }
        });

    }

    private void doAnimator() {
        final ValueAnimator valueAnimator = ValueAnimator.ofInt(0, 400);
        valueAnimator.setDuration(1000);
        valueAnimator.start();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int currValue = (int) valueAnimator.getAnimatedValue();
                tv_value.layout(currValue, currValue, currValue + tv_value.getWidth(), currValue + tv_value.getHeight());
            }
        });
    }
}