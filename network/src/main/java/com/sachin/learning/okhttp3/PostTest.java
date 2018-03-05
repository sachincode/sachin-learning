package com.sachin.learning.okhttp3;

import okhttp3.*;

import java.io.IOException;

public class PostTest {


    public static void form() {
        String url = "https://www.baidu.com/";
        OkHttpClient okHttpClient = new OkHttpClient();
        FormBody body = new FormBody.Builder().add("key", "value").build();
        Request request = new Request.Builder().url(url).post(body).build();
        try {
            Response response = okHttpClient.newCall(request).execute();
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


//    MediaType JSON = MediaType.parse("application/json; charset=utf-8");
//    RequestBody body = RequestBody.create(JSON, "你的json");


//    RequestBody requestBody = new MultipartBody.Builder()
//            .setType(MultipartBody.FORM)
//            .addFormDataPart("file", file.getName(), RequestBody.create(MediaType.parse("image/png"), file))
//            .build();


    public static void main(String[] args) {
        form();

    }
}
