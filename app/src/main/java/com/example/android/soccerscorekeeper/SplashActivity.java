package com.example.android.soccerscorekeeper;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
    Animation anim_logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ImageView image = (ImageView) findViewById(R.id.logo);
        Animation roll = AnimationUtils.loadAnimation(this, R.anim.anim_logo);
        image.startAnimation(roll);
    //Start opens Main Activity after Splash Activity
        //source:https://stackoverflow.com/questions/39259623/run-main-activity-after-splash-screen
        Handler handle=new Handler();
        handle.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent =new
                        Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                SplashActivity.this.finish();
            }
        },3000);
        //end
    }
}

