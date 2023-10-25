package com.example.myphoto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class DenLu {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 其他初始化代码...
    }

    public void onButtonClick(View view) {
        // 创建一个 Intent 对象，指定当前上下文和目标 Activity 类
        Intent intent = new Intent(this, ZuChe.class);

        // 启动目标 Activity
        startActivity(intent);
    }
}
