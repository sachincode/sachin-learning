package com.sachin.learning.spring.extend;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author shicheng.zhang
 * @since 17-5-15 上午11:05
 */
public class LifecycleBean implements InitializingBean, DisposableBean {

    private String name;

    public void setName(String name) {
        System.out.println("Enter LifecycleBean.setName(). name = " + name);
        this.name = name;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Enter LifecycleBean.destroy()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Enter LifecycleBean.afterPropertiesSet()");
    }

    public void beanStart() {
        System.out.println("Enter LifecycleBean.beanStart()");
    }

    public void beanEnd() {
        System.out.println("Enter LifecycleBean.beanEnd()");
    }
}
