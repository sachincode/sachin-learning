package com.sachin.learning.spring.extend;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author shicheng.zhang
 * @since 17-5-12 下午7:30
 */
public class PostProcessorBean implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("++++++ Enter PostProcessorBean.postProcessBeforeInitialization(). beanName = " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("++++++ Enter PostProcessorBean.postProcessAfterInitialization(). beanName = " + beanName);
        return bean;
    }
}
