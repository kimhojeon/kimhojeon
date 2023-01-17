package com.example.ex0113

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.ex0113.auth.IntroActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var handler = Handler()
        handler.postDelayed({
            //인트로액티비티로 전환
            var intent = Intent(this, IntroActivity::class.java)
            startActivity(intent)
        }, 3000)

    }

    override fun onPause() {
        super.onPause()
        finish()
    }
    }
