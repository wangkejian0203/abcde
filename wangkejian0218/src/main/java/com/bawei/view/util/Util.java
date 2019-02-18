package com.bawei.view.util;

import android.support.v7.app.AppCompatActivity;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class Util {

    private static Util util;
    public Util getUtil(){
        synchronized (util) {
         util = new Util();
        }
        return util;
    }
    OkHttpClient client=new OkHttpClient();
    Request request= new Request.Builder().url("http://365jia.cn/news/api3/365jia/news/headline").build();
    Call call=client.newCall(request);
}
