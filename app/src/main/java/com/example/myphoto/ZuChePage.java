package com.example.myphoto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import java.io.IOException;
import java.net.URL;

public class ZuChePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zuchepage);

        EditText userid = findViewById(R.id.userid);
        EditText password = findViewById(R.id.password);
        RadioButton allowUserProtocol = findViewById(R.id.allowUserProtocol);
        Button register = findViewById(R.id.register);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText userIdEditText = findViewById(R.id.userid);
                EditText passwordEditText = findViewById(R.id.password);
                RadioButton allowUserProtocolRadioButton = findViewById(R.id.allowUserProtocol);

                String userId = userIdEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                boolean allowUserProtocol = allowUserProtocolRadioButton.isChecked();

                if (allowUserProtocol) {
                    // 在这里执行注册逻辑和数据库写入操作
                    // 可以调用相关的数据库操作方法，将用户名和密码写入数据库
                } else {
                    // 用户未同意用户协议，给出相应的提示或处理逻辑
                }
            }
        });
    };
}