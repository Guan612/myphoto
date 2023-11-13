package com.example.myphoto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
                EditText usernameEditText = findViewById(R.id.userid);
                EditText passwordEditText = findViewById(R.id.password);

                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // 执行登录验证逻辑
                if (verifyCredentials(username, password)) {
                    // 验证成功，进行页面跳转
                    // 在这里添加跳转逻辑，例如启动下一个Activity或跳转到主界面
                    Intent intent=new Intent();
                    intent.setClassName("com.example.myphoto","com.example.myphoto.MainActivity");
                    startActivity(intent);
                } else {
                    // 验证失败，给出相应的提示或处理逻辑
                }

            }
        });

        //登录发送信息给后台

    }

    //数据库相关部分
    private boolean verifyCredentials(String username, String password) {
        MyDatabaseHelper databaseHelper = new MyDatabaseHelper(getApplicationContext());
        SQLiteDatabase db = databaseHelper.getReadableDatabase();

        // 执行查询操作
        String[] projection = {"username"};
        String selection = "username = ? AND password = ?";
        String[] selectionArgs = {username, password};
        Cursor cursor = db.query("users", projection, selection, selectionArgs, null, null, null);

        boolean credentialsMatch = cursor.moveToFirst();

        // 关闭数据库连接和游标
        cursor.close();
        db.close();

        return credentialsMatch;

    }

}