package com.gr.as.buju.utils;

import android.content.Context;

import com.gr.as.buju.R;
import com.gr.as.buju.entity.NewsBean;

import java.util.ArrayList;

public class NewsUtils {
    public static ArrayList<NewsBean> getAllNews(Context context) {
        ArrayList<NewsBean> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            NewsBean newsBean1 = new NewsBean();
            newsBean1.title = "鸟瞰暴雨后的武汉 全市已转移16万人次";
            newsBean1.des = "7月5-6日，武汉普降暴雨-大暴雨，中心城区、蔡甸部分地区出现特大暴雨。江夏大道汤逊湖大桥段，被湖水冲破的路障。记者贾代腾飞 陈卓摄";
            newsBean1.icon = context.getResources().getDrawable(R.drawable.ic_menu_send);
            newsBean1.news_url = "http://slide.news.sina.com.cn/s/slide_1_2841_101020.html#p=1";
            arrayList.add(newsBean1);
        }
        return arrayList;
    }
}