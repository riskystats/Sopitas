package com.example.pepe.sopitas;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new CountDownTimer(1800,600){

            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(SplashActivity.this,LogInActivity.class);
                startActivity(intent);
            }
        }.start();
    }
}
