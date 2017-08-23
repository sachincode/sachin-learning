package com.sachin.learning.kafka;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;


import java.util.Properties;

/**
 * @author shicheng.zhang
 * @since 17-8-23 下午6:30
 */
public class ProducerTest {


    public static void main(String[] args) throws InterruptedException {
        String topic = "test";

        Properties props = new Properties();
        props.put("serializer.class", "kafka.serializer.StringEncoder");
        props.put("metadata.broker.list", "10.90.182.136:9092");

        Producer<String, String> producer = new Producer<String, String>(new ProducerConfig(props));
        for (int i = 0; i < 10; i++) {
            KeyedMessage<String, String> message = new KeyedMessage<String, String>(topic, "message_" + i);
            producer.send(message);
            System.out.println("send " + i);
            Thread.sleep(1000);
        }

        
        producer.close();
    }
}
