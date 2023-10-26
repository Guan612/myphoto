package com.example.myphoto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DenLuPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.denlupage);

        //跳转登录页面
        Button jumpRegistrationButton=findViewById(R.id.jumpRegistration);
        jumpRegistrationButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClassName("com.example.myphoto","com.example.myphoto.ZuChePage");
                startActivity(intent);
            }
        });

        //跳转主页
        Button loginButton=findViewById(R.id.login);
        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClassName("com.example.myphoto","com.example.myphoto.MainActivity");
                startActivity(intent);
            }
        });
    }

}