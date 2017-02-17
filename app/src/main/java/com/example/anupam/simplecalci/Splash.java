package com.example.anupam.simplecalci;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
public class Splash extends AppCompatActivity {

    public static int Splash_time = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splash.this,Calculator.class);
                startActivity(i);
                finish();
            }
        },3000);

        final ImageView img= (ImageView) findViewById(R.id.imageView);
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation);
        img.setAnimation(animation);






        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
