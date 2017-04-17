package com.sachin.learning.callback;

/**
 * 回调的核心就是回调方将本身即this传递给调用方
 * @author shicheng.zhang
 * @since 17-4-17 上午9:54
 */
public class CallbackTest {

    public static void main(String[] args) {
        Student jack = new Jack();
        Teacher teacher = new Teacher(jack);

        teacher.askQuestion();

        Integer a = 200;
        Integer b = 200;
        System.out.println(a == b);
    }
}
