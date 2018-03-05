package com.sachin.learning.okhttp3;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class InterceptorTest {


    public static void one() throws IOException {
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new LoggingInterceptor())
                .build();

        Request request = new Request.Builder()
                .url("http://www.publicobject.com/helloworld.txt")
                .header("User-Agent", "OkHttp Example")
                .build();

        Response response = client.newCall(request).execute();
        response.body().close();

    }


    public static void net() throws IOException {
        OkHttpClient client = new OkHttpClient.Builder()
                .addNetworkInterceptor(new LoggingInterceptor())
                .build();

        Request request = new Request.Builder()
                .url("http://www.publicobject.com/helloworld.txt")
                .header("User-Agent", "OkHttp Example")
                .build();

        Response response = client.newCall(request).execute();
        response.body().close();

    }

    public static void main(String[] args) throws IOException {
        one();

        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++=\n");

        net();
    }
}
