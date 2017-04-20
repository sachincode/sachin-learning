package com.sachin.learning.innerclass;

/**
 * 成员内部类
 *
 * @author shicheng.zhang
 * @since 17-4-20 下午8:58
 */
public class OuterClass {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void outerDisplay() {
        System.out.println("outer...");
    }

    public class InnerClass {
        public void innerDisplay() {
            name = "inner...";
            System.out.println(name);
            outerDisplay();
        }
    }
}
