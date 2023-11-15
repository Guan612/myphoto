package com.example.myphoto;

//创建一个包含日记信息的数据类
public class Diary {

    //定义日记卡片的一些数据类
    private int imageResource;
    private String title;
    private String content;
    private String time;

    public Diary(int imageResource, String title, String content, String time) {
        this.imageResource = imageResource;
        this.title = title;
        this.content = content;
        this.time = time;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getTime() {
        return time;
    }
}
