package com.sachin.learning.chapter10;

import java.util.concurrent.TimeUnit;

/**
 * @author shicheng.zhang
 * @date 16-12-4
 * @time 下午5:20
 * @Description:
 */
public class Article66 {

    private static volatile boolean stop;

    public static void main(String[] args) throws InterruptedException {
        Thread background = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!stop) {
                    i++;
                }
            }


        });
        background.start();
        TimeUnit.SECONDS.sleep(1);
        stop = true;
    }
}
