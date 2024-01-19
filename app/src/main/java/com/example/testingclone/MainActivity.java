package com.example.testingclone;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private static final long SPLASH_DELAY = 3000; // 3 seconds

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the window to fullscreen without a title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        // Delay the launch of the next activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the second activity
                Intent intent = new Intent(MainActivity.this, LoginPage.class);
                startActivity(intent);

                // Finish the current activity to prevent going back to it
                finish();
            }
        }, SPLASH_DELAY);
    }
}