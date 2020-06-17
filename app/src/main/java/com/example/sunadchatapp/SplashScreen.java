package com.example.sunadchatapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    private static final int SPLASH_DISPLAY_TIME = 2000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(this, "Welcome to Chat! @ $unad raj", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            public void run() {

                Intent intent = new Intent();
                intent.setClass(SplashScreen.this,
                        StartActivity.class);

                SplashScreen.this.startActivity(intent);
                SplashScreen.this.finish();

            }
        }, SPLASH_DISPLAY_TIME);

        //startActivity(new Intent(this,StartActivity.class));
    }
}
