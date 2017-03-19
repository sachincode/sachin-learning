package com.sachin.learning.chapter5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class Article23 {

    // 有限制类型参数 <E extends Number>
    // 递归类型限制 <T extends Comparable<T>>
    // 有限制通配符类型 List<? extends Number>
    // 范型方法 static <E> List<E> asList(E[] a)
    // 类型令牌 String.class

    public static void main(String[] args) {

        List<String> strings = new ArrayList<String>();
        unsafeAdd(strings, new Integer(42)); // 这一步可以执行成功
        String s = strings.get(0); // 这里执行失败
        System.out.println();

        Set<String> stringSet = new HashSet<String>();
        Set<Long> longSet = new HashSet<Long>();
        numElementsInCommon(stringSet, longSet);
        System.out.println();
    }

    // 可以将任何元素放到原生态类型的集合中
    public static void unsafeAdd(List list, Object o) {
        list.add(o);
    }

    // ? 无限制的通配符类型
    // 不能将任何类型(除了null)放(add)到 Collection<?>中
    public static int numElementsInCommon(Set<?> s1, Set<?> s2) {
        int result = 0;
        for (Object o : s1) {
            if (s2.contains(o)) {
                result++;
            }
        }
        return result;
    }
}
