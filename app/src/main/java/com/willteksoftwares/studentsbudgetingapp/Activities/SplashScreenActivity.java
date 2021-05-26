package com.willteksoftwares.studentsbudgetingapp.Activities;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.willteksoftwares.studentsbudgetingapp.R;


public class SplashScreenActivity extends AppCompatActivity {
    private static int SPLASH = 3000;
    Animation animation;
    private ImageView ImageView;
    private TextView appName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);

        animation = AnimationUtils.loadAnimation(this, R.anim.animation);

        ImageView = findViewById(R.id.ImageView);
        appName = findViewById(R.id.appName);

        ImageView.setAnimation(animation);
        appName.setAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }

        }, SPLASH);
    }
}