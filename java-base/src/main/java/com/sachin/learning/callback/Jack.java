package com.sachin.learning.callback;

/**
 * @author shicheng.zhang
 * @since 17-4-17 上午9:52
 */
public class Jack implements Student {

    @Override
    public void resolveQuestion(Callback callback) {
        try {
            System.out.println("我开始解题！");
            Thread.sleep(3000);
            System.out.println("我做出来了！");
        } catch (InterruptedException e) {
            System.out.println("我不会这道题目！");
        }
        callback.tellAnswer(3);
    }
}
