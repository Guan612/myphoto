package com.example.myphoto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

//DiaryAdapter类的继承关系，继承自BaseAdapter
public class DiaryAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Diary> diaryList;

    public DiaryAdapter(Context context, ArrayList<Diary> diaryList) {
        this.context = context;
        this.diaryList = diaryList;
    }
    @Override
    public int getCount() {
        return diaryList.size();
    }

    @Override
    public Object getItem(int position) {
        return diaryList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // 获取数据项
        Diary diary = diaryList.get(position);

        // 检查是否有可重用的视图
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.diarycard, parent, false);
        }

        // 获取布局中的视图
        ImageView diaryImage = convertView.findViewById(R.id.diaryImage);
        TextView diaryTitle = convertView.findViewById(R.id.diaryTitle);
        TextView diaryContent = convertView.findViewById(R.id.diaryContent);
        TextView diaryTime = convertView.findViewById(R.id.diaryTime);

        // 设置数据到视图中
        diaryImage.setImageResource(diary.getImageResource());
        diaryTitle.setText(diary.getTitle());
        diaryContent.setText(diary.getContent());
        diaryTime.setText(diary.getTime());

        return convertView;
    }
    // ...
}

