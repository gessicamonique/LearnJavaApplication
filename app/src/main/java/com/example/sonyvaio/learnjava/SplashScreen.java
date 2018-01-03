package com.example.sonyvaio.learnjava;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity implements Runnable {

        private static int DELAY = 3000;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash_screen);

            Handler h = new Handler();
            h.postDelayed(this, DELAY);

        }

        @Override
        public void run() {

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();

        }
}

