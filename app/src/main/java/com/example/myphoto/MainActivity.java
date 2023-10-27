package com.example.myphoto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button testbtn = (Button)findViewById(R.id.testbtn);
        //测试登录按钮，后面修改
        testbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent testintent = new Intent(MainActivity.this, DenLuPage.class);
                startActivity(testintent);
            }
        });
    }
}