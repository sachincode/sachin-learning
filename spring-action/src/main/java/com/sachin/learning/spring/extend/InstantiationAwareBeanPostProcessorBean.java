package com.sachin.learning.spring.extend;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.support.InstantiationStrategy;

import java.beans.PropertyDescriptor;

/**
 * @author shicheng.zhang
 * @since 17-5-15 上午11:38
 */
public class InstantiationAwareBeanPostProcessorBean implements InstantiationAwareBeanPostProcessor {

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("------ Enter InstantiationAwareBeanPostProcessorBean.postProcessBeforeInstantiation()");
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("------ Enter InstantiationAwareBeanPostProcessorBean.postProcessAfterInstantiation()");
        return true;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean,
            String beanName) throws BeansException {
        System.out.println("------ Enter InstantiationAwareBeanPostProcessorBean.postProcessPropertyValues()");
        return pvs;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("------ Enter InstantiationAwareBeanPostProcessorBean.postProcessBeforeInitialization()");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("------ Enter InstantiationAwareBeanPostProcessorBean.postProcessAfterInitialization()");
        return bean;
    }
}
