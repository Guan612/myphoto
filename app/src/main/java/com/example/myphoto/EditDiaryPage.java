package com.example.myphoto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditDiaryPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editdiarypage);

        //获取日记数据
        EditText editTitle = findViewById(R.id.editTitle);
        EditText editContent = findViewById(R.id.editContent);
        Button edSave = findViewById(R.id.edSave);
        Button edExit = findViewById(R.id.edExit);

        //按下按钮时保存日记
        edSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String diaryTitle = editTitle.getText().toString().trim();
                String diaryContent = editContent.getText().toString().trim();

                // 获取当前时间戳
                long timestamp = System.currentTimeMillis();
                //将数据插入数据库
                //插入数据库
                
            }
        });
        //取消回到主页
        edExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClassName("com.example.myphoto","com.example.myphoto.MainActivity");
                startActivity(intent);
            }
        });

    }


}
