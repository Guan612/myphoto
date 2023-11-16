package com.example.myphoto;

import androidx.appcompat.app.AppCompatActivity;

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

        //按下按钮时保存日记
        edSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String diaryTitle = editTitle.getText().toString().trim();
                String diaryContent = editContent.getText().toString().trim();
            }
        });

    }


}
