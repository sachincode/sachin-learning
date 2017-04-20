package com.sachin.learning.innerclass;

/**
 * 局部内部类
 * 定义在方法里
 * @author shicheng.zhang
 * @since 17-4-20 下午9:08
 */
public class Parce15 {

    public Runnable getRunnable(String str) {
        class InnerRunnable implements Runnable {
            private String name;

            private InnerRunnable(String name) {
                this.name = name;
            }

            @Override public void run() {
                System.out.println(name);
            }
        }
        return new InnerRunnable(str);
    }

    public static void main(String[] args) {
        Parce15 parce15 = new Parce15();
        Runnable runnable = parce15.getRunnable("局部内部类：定义在方法里");
        runnable.run();
    }
}
