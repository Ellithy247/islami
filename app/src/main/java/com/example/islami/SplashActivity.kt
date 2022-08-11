package com.example.islami

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        Handler().postDelayed(Runnable {

            startHomeActivity()


        },2000);

    }

    private fun startHomeActivity() {

        val intent = Intent(this,HomeActivity::class.java)
        startActivity(intent)
        finish();

    }
    }
