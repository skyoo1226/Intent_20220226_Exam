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

//            입력된 메세지 데이터를 변수로 담아 둬야 함-나중에 불러 오기 위함.
            val inputMessage = edtMessage.text.toString()

            // OtherActivity 화면으로 이동하는 코드...
            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)

        }

        btnSendMessage.setOnClickListener {

            val inputMessage = edtMessage.text.toString()

//            send메세지가 눌리면 보낸 메세지(edtMesage)를 보여줘야하는데,
        //            이때 ViewMessageActivity로 메세지를 가지고 화면 이동
            val  myIntent = Intent(this, ViewMessageMainActivity::class.java)

//            myIntent에 보내 온 메세지(inputMessage 변수로 만든)를 첨부해야 함
            myIntent.putExtra("메세지", inputMessage)

            startActivity(myIntent)

        }

    }


}