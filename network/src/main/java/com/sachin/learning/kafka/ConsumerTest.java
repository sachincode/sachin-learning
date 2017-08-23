package com.sachin.learning.kafka;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author shicheng.zhang
 * @since 17-8-23 下午6:30
 */
public class ConsumerTest {

    public static void main(String[] args) {
        InetAddress address = null;
        try {
            address = InetAddress.getLocalHost();
            System.out.println(address.getCanonicalHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


    }
}
