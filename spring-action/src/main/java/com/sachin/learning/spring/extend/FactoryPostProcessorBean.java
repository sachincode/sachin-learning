package com.sachin.learning.spring.extend;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.TypeConverter;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author shicheng.zhang
 * @since 17-5-15 上午11:16
 */
public class FactoryPostProcessorBean implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("++++++ Enter FactoryPostProcessorBean.postProcessBeanFactory()");

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("animal");
        MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
        System.out.println("scope before change：" + beanDefinition.getScope());
        System.out.println("beanProperty：" + propertyValues);
    }
}
