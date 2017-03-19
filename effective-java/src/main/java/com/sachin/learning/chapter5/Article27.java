package com.sachin.learning.chapter5;

import com.sachin.learning.App;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author shicheng.zhang
 * @date 16-11-26
 * @time 下午10:23
 * @Description:
 */
public class Article27 {

    public static void main(String[] args) {
        List<Long> longs = new ArrayList<Long>();
        longs.add(1L);
        longs.add(2L);
        longs.add(3L);
        Long max = max(longs);
        System.out.println(max);

        List<App> apps = new ArrayList<App>();
    }

    public static <T extends Comparable<T>> T max(List<T> list) {
        Iterator<T> iterator = list.iterator();
        T result = iterator.next();
        while (iterator.hasNext()) {
            T t = iterator.next();
            if (t.compareTo(result) > 0) {
                result = t;
            }
        }
        return result;
    }

    public static <T extends Comparable<? super T>> T maxT(List<? extends T> list) {
        Iterator<? extends T> iterator = list.iterator();
        T result = iterator.next();
        while (iterator.hasNext()) {
            T t = iterator.next();
            if (t.compareTo(result) > 0) {
                result = t;
            }
        }
        return result;
    }
}
