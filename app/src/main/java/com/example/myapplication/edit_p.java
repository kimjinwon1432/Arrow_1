package com.example.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class edit_p extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_p);

        findViewById(R.id.Edit).setOnClickListener(this);
    }

    public void onClick(View v){
        switch (v.getId()) {
            case R.id.Edit:
                new AlertDialog.Builder(this)
                        .setTitle("내정보수정 결과")
                        .setMessage("내정보수정에 성공하셨습니다.")
                        .setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dlg, int sumthin) {

                            }
                        })
                        .show();
                break;

            case R.id.cancel:
                this.finish();
                break;
        }
    }
    public void hom(View v){ // 클릭이벤트. 버튼에 OnClick하고 이름을 맞춰줘야한다
        Intent intent001 = new Intent(this,MainActivity.class); // Intent라는 함수 사용법. Intent intent이름 = new Intent(this,불러올페이지이름.class)
        startActivity(intent001); // intent이름 을 시작하겠다.
    }// 만약 추가하고싶다면 java > com.example.myapplication에 마우스 오른쪽버튼 new > activity로 추가하면됨.

    public void lo_co(View v){
        Intent intent002 = new Intent(this,logina.class);
        startActivity(intent002);
    }
    public void myp(View v){
        Intent intent003 = new Intent(this,MyPagea.class);
        startActivity(intent003);
    }
    public void stream(View v) {
        Intent intent004 = new Intent(this, Streaminga.class);
        startActivity(intent004);
    }
    public void Pers(View v) {
        Intent intent005 = new Intent(this, Perchasea.class);
        startActivity(intent005);
    }
    public void comu(View v) {
        Intent intent006 = new Intent(this, Communitya.class);
        startActivity(intent006);
    }
}
