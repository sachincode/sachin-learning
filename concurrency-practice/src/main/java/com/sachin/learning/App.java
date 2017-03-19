package com.sachin.learning;

import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int i = Runtime.getRuntime().availableProcessors();
        System.out.println(i);

        Date ZERO = new Date(0);
        System.out.println(ZERO);
    }
}
