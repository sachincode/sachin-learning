package com.sachin.learning.zookeeper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;
import org.apache.zookeeper.data.Stat;

/**
 * @author shicheng.zhang
 * @since 17-8-23 下午3:27
 */
public class ZkClientTest {

    private static final String ZK_ADDRESS = "10.90.182.136:2181";

    public static void main(String[] args) throws JsonProcessingException {
        ZkClient zkClient = new ZkClient(ZK_ADDRESS, 10000, 10000, new SerializableSerializer());
        System.out.println("connected ok!");
        Stat stat = new Stat();
        Object o = zkClient.readData("/test/boy/one", stat);
        System.out.println(o);
        System.out.println(new ObjectMapper().writeValueAsString(stat));

    }
}
