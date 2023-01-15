package com.example.ex0113

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase


class LoginActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        auth = Firebase.auth




        val btn_join = findViewById<Button>(R.id.bnt_join)
        btn_join.setOnClickListener {
            val email = findViewById<EditText>(R.id.edt_id)
            val pw = findViewById<EditText>(R.id.edt_pw)

            //로그찍기
            Log.d("MAIN",email.text.toString() )
            Log.d("MAIN",pw.text.toString())
        }


        }
    }
