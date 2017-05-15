package com.sachin.learning.spring.extend;

/**
 * @author shicheng.zhang
 * @since 17-5-12 下午7:28
 */
public class CommonBean {

    private String commonName;

    public CommonBean() {
        System.out.println("Enter CommonBean.CommonBean()");
    }

    public void setCommonName(String commonName) {
        System.out.println("Enter CommonBean.setCommonName(). commonName = " + commonName);
        this.commonName = commonName;
    }

    public void initMethod() {
        System.out.println("+++ CommonBean.initMethod(), commonName = " + commonName);
    }
}
