package com.sachin.learning.spring.extend;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author shicheng.zhang
 * @since 17-5-12 下午7:02
 */
public class AwareBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    private String beanName;
    private ApplicationContext applicationContext;
    private BeanFactory beanFactory;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext, " + applicationContext);
        this.applicationContext = applicationContext;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory, " + beanFactory);
        this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName, " + name);
        this.beanName = name;
    }
}
