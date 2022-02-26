package com.skyoo.intent_20220226_exam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        btnReturn.setOnClickListener {

            // 이전 화면(메인화면)으로 돌아가는 코드 입력...

            // 바로 아래 코드는 메인과 서브화면만 계속 왔다갔다...문제 있음.
//            val myIntent = Intent(this, MainActivity::class.java)
//            startActivity(myIntent)

            // 이전 화면 돌아가는 코드 다시 입력하지 말고, 현재 화면을 끝내면 자연스럽게 이전화면으로 돌아감
            // 그래서 지금 화면을 끝내는 코드 finish() 임
            finish()


        }


    }
}