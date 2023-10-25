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
        Button mButton=findViewById(R.id.jumpRegistration);
        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClassName("com.example.myphoto","com.example.myphoto.ZuChePage");
                startActivity(intent);
            }
        });
    }

}