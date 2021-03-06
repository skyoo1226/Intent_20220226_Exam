package com.skyoo.intent_20220226_exam

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    멤버변수 입력 - 코드 초반부 첫번째 {에 만드는 변수
    val REQ_CODE_NICKNAME = 1000

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

//        유투브 1:56분 참조  - 닉네일 변경. Intent(3) 강의
        btnEditNickname.setOnClickListener {

            val myIntent = Intent(this, EditNicknameActivity::class.java)
            // 1000은 닉네임을 변경하러 간다는 표식 임을 requestCode에 1000 대신 위에 멤버변수로 지정 한 REQ_CODE_NICKNAME을 입력함.
            startActivityForResult(myIntent, REQ_CODE_NICKNAME)

        }

        btnDial.setOnClickListener {
//            어디에 전화를 걸고싶은지? 폰번 저장
            val inputPhoneNum = edtPhoneNum.text.toString()

//            전화연결 정보 형태 (Uri)로, 폰번 가공.
            // 어디에 전화를 걸지 정보 가공. "tel: 띄어쓰기 없이 적어야 에러 없음.
            val myUri = Uri.parse("tel:${inputPhoneNum}")

//            전화 앱으로 화면 전환
            val myIntent = Intent( Intent.ACTION_DIAL, myUri )
            startActivity(myIntent)
        }

        btnCall.setOnClickListener {

//            사용법이 맞게 작성되어도, 권한문제로 앱 강제종료 됨
            val inputPhoneNum = edtPhoneNum.text.toString()
            val myUri = Uri.parse("tel:${inputPhoneNum}")
            val myIntent = Intent( Intent.ACTION_CALL, myUri )
            startActivity(myIntent)
        }

        btnSms.setOnClickListener {
            val inputPhoneNum = edtPhoneNum.text.toString()
            val myUri = Uri.parse("smsto:${inputPhoneNum}")
            val myIntent = Intent( Intent.ACTION_SENDTO, myUri )

//            안드로이드에서 제공되는 화면에 미리 보낼 내용 첨부해서 보여줌
            myIntent.putExtra("sms_body", "이 앱을 공유해주세요!")

            startActivity(myIntent)
        }

        btnNaverLink.setOnClickListener {
            val myUri = Uri.parse("https://naver.com")  //사이트 연결은 'https://'으로 시작
            val myIntent = Intent( Intent.ACTION_VIEW, myUri )
            startActivity(myIntent)
        }

        btnKakaoAppLink.setOnClickListener {
            val myUri = Uri.parse("market://details?id=com.kakao.talk") //앱 연결은 'market://'으로 시작
            val myIntent = Intent( Intent.ACTION_VIEW, myUri )
            startActivity(myIntent)
        }



    }
//  onActivityResult 입력 시 2줄 자동 생성. super.onActivityResult(re...까지
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

//        어떤 요청을 마치고 돌아온건지 확인. => 닉네임을 가지러 다녀온게 맞는지?
    if (requestCode == REQ_CODE_NICKNAME) {

//            OK눌렀어야 반영. => RESULT_OK가 맞는가?
        if (resultCode == Activity.RESULT_OK) {

//                닉네임 요청과  OK 둘다 맞으면
//                첨부된 새 닉네임을 꺼내서 텍스트뷰에 반영
            val newNickname = data?.getStringExtra("nick")
            txtNickname.text = newNickname

            }

        }

    }


}