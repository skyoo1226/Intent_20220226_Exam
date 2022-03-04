package com.skyoo.intent_20220226_exam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)

        btnSave.setOnClickListener {

//            입력한 닉네임을 변수로 담고,
            val inputNickname = edtNickname.text.toString()

//            putExtra를 통해서 데이터를 담아주는 용도의 Intent 생성.
            // 출발지와 도착지 명시 필요 X
            val resultIntent = Intent()
            resultIntent.putExtra("nick", inputNickname)

//            OK누른게 맞는지? + 어떤 데이터를 가지고 돌아갈건지 => 결과로 설정.
//            백 버튼을 누르면 변경 없이 그냥 돌아 감.
            setResult(RESULT_OK, resultIntent)

//            이전 화면으로 복귀
            finish()


        }

    }
}