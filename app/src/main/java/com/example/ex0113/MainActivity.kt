package com.example.ex0113

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.ex0113.fragment.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    
    // 프래그먼트 초기 선언

    private lateinit var chatFragment: ChatFragment
    private lateinit var listFragment: ListFragment
    private lateinit var mainFragment: MainFragment
    private lateinit var newsFragment: NewsFragment
    private lateinit var writeFragment: WriteFragment







    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






    }

    }
