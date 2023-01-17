package com.example.ex0113.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import androidx.databinding.DataBindingUtil
import com.example.ex0113.R
import com.example.ex0113.databinding.ActivityIntroBinding


class IntroActivity : AppCompatActivity() {
    //바인딩 추가
    private lateinit var binding : ActivityIntroBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

       /* val btnjoin = findViewById<Button>(R.id.btnjoin)
        val btnlogin = findViewById<Button>(R.id.btnlogin)

*/

        binding = DataBindingUtil.setContentView(this, R.layout.activity_intro)

        // 버튼 클릭시 이벤트 처리
        // 회원가입액티비티로 이동
       binding.btnjoin.setOnClickListener {
            val intent = Intent(this, JoinActivity::class.java)
            startActivity(intent)
        }
        
        // 로그인액티비티로 이동
        binding.btnlogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            
        }


        }
    }
