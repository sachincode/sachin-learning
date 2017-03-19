package com.sachin.learning.chapter10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/**
 * @author shicheng.zhang
 * @date 16-12-4
 * @time 下午5:20
 * @Description:
 */
public class Article67 {

    private static volatile boolean stop;

    public static void main(String[] args) throws InterruptedException {
        List<String> strings = new ArrayList<String>();
        strings.add("a");
        strings.add("b");
        System.out.println(strings);
        for (String s : strings) {
            if (s.equals("a")) {
                strings.remove(s);
            }
            //strings.add("c");
        }
        System.out.println(strings);

        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "a");
        map.put("b", "b");
        System.out.println(map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().equals("a")) {
                map.remove(entry.getKey());
            }
            //map.put("c", "c");
        }
        System.out.println(map);

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
        list.add("a");
        list.add("b");
        System.out.println(list);
        for (String s : list) {
            list.remove(s);
            list.add("c");
        }
        System.out.println(list);
    }
}
