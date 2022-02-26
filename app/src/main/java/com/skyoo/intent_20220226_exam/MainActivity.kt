package com.skyoo.intent_20220226_exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// 유투브 49:00참조

        btnMoveOther.setOnClickListener {

            // OtherActivity 화면으로 이동하는 코드...


        }

    }


}