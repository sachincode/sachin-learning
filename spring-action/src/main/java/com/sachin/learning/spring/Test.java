package com.sachin.learning.spring;

import com.sachin.learning.spring.extend.Animal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * http://www.importnew.com/22775.html
 *
 * @author shicheng.zhang
 * @since 17-5-12 下午6:58
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Object awareBean = applicationContext.getBean("awareBean");

        System.out.println("-------------------------");
        Animal animal = (Animal) applicationContext.getBean("animal");
        animal.move();
        System.out.println("-------------------------");

        System.out.println();
    }


}
