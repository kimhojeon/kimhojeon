package com.example.ex0113.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.ex0113.MainActivity
import com.example.ex0113.R
import com.example.ex0113.databinding.ActivityIntroBinding
import com.example.ex0113.databinding.ActivityJoinBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class JoinActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    private lateinit var binding : ActivityJoinBinding

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
       /* setContentView(R.layout.activity_join)*/
        auth = Firebase.auth

        binding = DataBindingUtil.setContentView(this, R.layout.activity_join)

        binding.BtnJoin.setOnClickListener {

            auth.createUserWithEmailAndPassword("abc@abc.com","abcabc")
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(this,"성공", Toast.LENGTH_LONG).show()
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)

                    } else {
                        Toast.makeText(this,"실패", Toast.LENGTH_LONG).show()

                    }
                }



    /*        // 메소드 생성
            var isGoToJoin = true

            val email = binding.emailArea.text.toString()
            val password1 = binding.pwArea.text.toString()
            val password2 = binding.pwcheck.text.toString()

            // 저기 값이 비어있는지 확인
            if (email.isEmpty()) {
                Toast.makeText(this, "이메일을 입력해주세요", Toast.LENGTH_LONG).show()
                isGoToJoin = false
            }
            if (password1.isEmpty()) {
                Toast.makeText(this, "비밀번호을 입력해주세요", Toast.LENGTH_LONG).show()
                isGoToJoin = false
            }
            if (password2.isEmpty()) {
                Toast.makeText(this, "비밀번호를 확인해주세요", Toast.LENGTH_LONG).show()
                isGoToJoin = false
            }
            // 비밀번호 2개가 같은지 확인
            if (!password1.equals(password2)) {
                Toast.makeText(this, "비밀번호를 똑같이 입력해주세요", Toast.LENGTH_LONG).show()
                isGoToJoin = false
            }
            if (password1.length < 5) {
                Toast.makeText(this, "비밀번호를 6자리 이상 입력해주세요", Toast.LENGTH_LONG).show()
                isGoToJoin = false
            }
        if(isGoToJoin){
            auth.createUserWithEmailAndPassword("abc@abc.com","abcabc")
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(this,"성공", Toast.LENGTH_LONG).show()
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)

                    } else {
                        Toast.makeText(this,"실패", Toast.LENGTH_LONG).show()

                    }
                }
            }
*/
            
        }

    }

}