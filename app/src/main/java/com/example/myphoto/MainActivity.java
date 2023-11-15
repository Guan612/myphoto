package com.example.myphoto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //跳转按钮定义
        Button Mebtn = (Button)findViewById(R.id.Mebtn);
        Button EditDiary = (Button)findViewById(R.id.EditDiary);

        //初始化ListView
        ListView diaryList = findViewById(R.id.diaryList);
        ArrayList<Diary> diaryListdata = new ArrayList<>();

        //添加数据
        diaryListdata.add(new Diary(R.drawable.default_cover, "标题1", "内容1", "时间1"));
        diaryListdata.add(new Diary(R.drawable.default_cover, "标题2", "内容2", "时间2"));
        diaryListdata.add(new Diary(R.drawable.default_cover, "标题3", "内容3", "时间3"));

        DiaryAdapter adapter = new DiaryAdapter(this, diaryListdata);
        diaryList.setAdapter(adapter);

        //跳转按钮
        //跳转我的
        Mebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent meintent = new Intent(MainActivity.this, MePage.class);
                startActivity(meintent);
            }
        });

        //跳转编辑页
        EditDiary.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent Etintent = new Intent(MainActivity.this, EditDiaryPage.class);
                startActivity(Etintent);
            }
        });
    }
}