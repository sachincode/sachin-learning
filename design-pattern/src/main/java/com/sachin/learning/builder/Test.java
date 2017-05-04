package com.sachin.learning.builder;

/**
 * @author shicheng.zhang
 * @since 17-5-4 下午4:43
 */
public class Test {

    public static void main(String[] args) {
        Person person = new Person.PersonBuilder().firstName("Jack").lastName("chen").build();
        System.out.println(person);

        Person person1 = new Person.PersonBuilder("fang", "chen", "lian").city("beijing").state("china")
                .street("haidian").build();
        System.out.println(person1);
    }
}
