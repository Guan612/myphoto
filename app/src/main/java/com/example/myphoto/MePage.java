package com.example.myphoto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mepage);

        Button goMainactivy = findViewById(R.id.goMainactivy);
        Button goLogin = findViewById(R.id.goLogin);
        Button goAbout = findViewById(R.id.AboutMe);
        //返回主页跳转
        goMainactivy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClassName("com.example.myphoto","com.example.myphoto.MainActivity");
                startActivity(intent);
            }

        });
        //登录按钮跳转
        goLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClassName("com.example.myphoto","com.example.myphoto.DenLuPage");
                startActivity(intent);
            }
        });
        //关于页面跳转
        goAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClassName("com.example.myphoto","com.example.myphoto.AboutPage");
                startActivity(intent);
            }
        });


    }
}