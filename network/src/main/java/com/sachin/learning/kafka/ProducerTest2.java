package com.sachin.learning.kafka;

// import kafka.javaapi.producer.Producer;
// import kafka.producer.KeyedMessage;
// import kafka.producer.ProducerConfig;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author shicheng.zhang
 * @since 17-8-23 下午6:30
 */
public class ProducerTest2 {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static void main(String[] args) throws InterruptedException {
        String topic = "test";

        // Properties props = new Properties();
        // props.put("serializer.class", "kafka.serializer.StringEncoder");
        // props.put("metadata.broker.list", "10.90.182.136:9092");

        // Producer<String, String> producer = new Producer<String, String>(new ProducerConfig(props));
        // for (int i = 0; i < 10; i++) {
        // KeyedMessage<String, String> message = new KeyedMessage<String, String>(topic, "message_" + i);
        // producer.send(message);
        // System.out.println("send " + i);
        // Thread.sleep(1000);
        // }

        Properties props = new Properties();
        props.put("bootstrap.servers", "10.90.182.136:9092");
        //props.put("zookeeper.connect", "10.90.182.136:2181");
        props.put("client.id", "DemoProducer");
        props.put("key.serializer", "org.apache.kafka.common.serialization.IntegerSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        KafkaProducer<Integer, String> producer = new KafkaProducer<>(props);

        for (int i = 0; i < 3; i++) {
            String messageStr = "Message_" + i;
            try {
                RecordMetadata recordMetadata = producer.send(new ProducerRecord<>(topic, i, messageStr)).get();
                System.out.println("Sent message: (" + i + ", " + messageStr + ")");
                try {
                    System.out.println(OBJECT_MAPPER.writeValueAsString(recordMetadata));
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        producer.close();
    }
}
