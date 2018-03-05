package com.sachin.learning.okhttp3;

import okhttp3.*;

import java.io.IOException;

public class GetTest {


    public static void sync() {
        String url = "https://www.baidu.com";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).header("log-level", "debug").build();
        Call call = client.newCall(request);
        try {
            Response response = call.execute();
            System.out.println(response.code());
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void async() {
        String url = "http://publicobject.com/helloworld.txt";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).header("log-level", "debug").build();
        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                System.out.println("我是异步线程,线程Id为:" + Thread.currentThread().getId());
                System.out.println(response.body().string());
            }
        });
        for (int i = 0; i < 10; i++) {
            System.out.println("我是主线程,线程Id为:" + Thread.currentThread().getId());
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        async();
    }
}
