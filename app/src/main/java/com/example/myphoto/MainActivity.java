package com.example.myphoto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //测试登录按钮，后面修改
        Button testbtn = (Button)findViewById(R.id.testbtn);

        //初始化webView
        WebView testweb = findViewById(R.id.testweb);
        testweb.getSettings().setJavaScriptEnabled(true); // 启用JavaScript支持
        testweb.loadUrl("https://cn.bing.com");

        //测试跳转按钮
        testbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent testintent = new Intent(MainActivity.this, DenLuPage.class);
                startActivity(testintent);
            }
        });

        //初始化web,先清除缓存
        testweb.clearCache(true);
        testweb.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // 在WebView中加载链接，而不是打开默认的浏览器应用
                view.loadUrl(url);
                return true;
            }
        });

        testweb.setWebChromeClient(new WebChromeClient() {
            // 处理JavaScript对话框、进度等事件
            // 可以根据需要重写相应的方法
        });
    }
}