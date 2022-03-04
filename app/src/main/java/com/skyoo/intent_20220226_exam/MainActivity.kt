package com.skyoo.intent_20220226_exam

import android.content.Intent
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
            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)

        }

        btnSendMessage.setOnClickListener {

//            send메세지가 눌리면 보낸 메세지(edtMesage)를 보여줘야하는데,
        //            이때 ViewMessageActivity로 메세지를 가지고 화면 이동
            val  myIntent = Intent(this, ViewMessageMainActivity::class.java)

            startActivity(myIntent)

        }

    }


}