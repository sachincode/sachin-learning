package com.sachin.learning.classloader;


/**
 * http://www.importnew.com/18566.html
 *
 * @author shicheng.zhang
 * @since 17-5-2 上午11:05
 */
public class StaticTest {

    public static void main(String[] args) {
        staticFunction();
    }

    static StaticTest staticTest = new StaticTest();


    static {
        System.out.println("1");
    }


    {
        System.out.println("2");
    }

    StaticTest() {
        System.out.println("3");
        System.out.println("a=" + a + ", b=" + b);
    }

    private static void staticFunction() {
        System.out.println("4");
    }

    int a = 110;
    static int b = 112;
}
