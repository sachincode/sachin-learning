package com.sachin.learning.innerclass.anonymity;

/**
 * 匿名内部类
 * http://www.cnblogs.com/chenssy/p/3390871.html
 * @author shicheng.zhang
 * @since 17-4-20 下午9:23
 */
public class OuterClass {

    public InnerClass getInnerClass(final int num, final String str) {
        return new InnerClass() {
            int number = num + 3;
            @Override public int getNumber() {
                System.out.println(str);
                return number;
            }
        };
    }

    public InnerClass getInnerClass(final Param param) {
        return new InnerClass() {
            @Override public int getNumber() {
                System.out.println(param);
                param.setName("param inner inner");
                System.out.println(param);
                return 1;
            }
        };
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.getInnerClass(1, "inner...");
        System.out.println(innerClass.getNumber());
        System.out.println("-----------------------------");

        Param param = new Param();
        param.setName("param inner");
        InnerClass innerClass1 = outerClass.getInnerClass(param);
        System.out.println(innerClass1.getNumber());
        param.setName("param inner 1");
        System.out.println();
    }
}
