package com.example.ex_1228empty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //1. 코틀린 인터페이스가 아닌 자바 인터페이스여야 한다
    // 그 인터페이스는 딱 하나의 메소드만 가져야 한다
}