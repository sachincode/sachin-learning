package com.sachin.learning.spring.extend;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author shicheng.zhang
 * @since 17-5-12 下午7:19
 */
public class AnimalFactoryBean implements FactoryBean<Animal> {

    private String animal;

    @Override public Animal getObject() throws Exception {
        if ("Monkey".equals(animal)) {
            return new Monkey();
        } else if ("Tiger".equals(animal)) {
            return new Tiger();
        } else {
            return null;
        }
    }

    @Override public Class<?> getObjectType() {
        return Animal.class;
    }

    @Override public boolean isSingleton() {
        return true;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }
}
