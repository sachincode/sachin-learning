package com.sachin.learning.zookeeper;

import org.I0Itec.zkclient.IZkChildListener;
import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;
import org.apache.zookeeper.CreateMode;

import java.util.List;

/**
 * @author shicheng.zhang
 * @since 17-8-23 下午5:51
 */
public class SubscribeChildChanges {

    private static final String ZK_ADDRESS = "10.90.182.136:2181";

    private static class ZKChildListener implements IZkChildListener {

        @Override
        public void handleChildChange(String s, List<String> list) throws Exception {
            System.out.println(s);
            System.out.println(list);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ZkClient zkClient = new ZkClient(ZK_ADDRESS, 10000, 10000, new SerializableSerializer());
        System.out.println("connected ok!");

        zkClient.subscribeChildChanges("/test/boy", new ZKChildListener());
        System.out.println("add listener");
        Thread.sleep(1000);

//        String s = zkClient.create("/test/boy/five", "boy five data", CreateMode.PERSISTENT);
//        System.out.println(s);
//
//        Thread.sleep(5000);
//
//        s = zkClient.create("/test/boy/six", "boy six data", CreateMode.PERSISTENT);
//        System.out.println(s);

        boolean delete = zkClient.delete("/test/boy/six");
        System.out.println(delete);

        Thread.sleep(10000);
    }
}
