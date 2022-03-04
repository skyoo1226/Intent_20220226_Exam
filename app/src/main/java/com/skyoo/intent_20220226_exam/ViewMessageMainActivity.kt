package com.skyoo.intent_20220226_exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_message_main.*

class ViewMessageMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_message_main)

//        이전화면에서 보내준 메세지(문구)를 변수에 담아 둠
        val message = intent.getStringExtra("메세지")

//         위 변수에 담아 둔 메세지(문구)를 텍스트뷰의 text속성에 set 함.
        txtMessage.text = message

    }
}