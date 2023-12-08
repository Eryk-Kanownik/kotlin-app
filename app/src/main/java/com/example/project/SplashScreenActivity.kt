package com.example.project

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.ComponentActivity

class SplashScreenActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler().postDelayed({
            val intent = Intent(this@SplashScreenActivity, MainActivity::class.java);
            startActivity(intent);
            finish();
        },3000)
    }
}