package com.sachin.learning.innerclass.anonymity;

/**
 * @author shicheng.zhang
 * @since 17-4-20 下午10:05
 */
public class Param {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override public String toString() {
        return "Param{" +
                "name='" + name + '\'' +
                '}';
    }
}
