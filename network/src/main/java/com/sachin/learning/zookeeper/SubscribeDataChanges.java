package com.sachin.learning.zookeeper;

import java.util.List;

import org.I0Itec.zkclient.IZkChildListener;
import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;
import org.apache.zookeeper.CreateMode;

/**
 * @author shicheng.zhang
 * @since 17-8-23 下午5:51
 */
public class SubscribeDataChanges {

    private static final String ZK_ADDRESS = "10.90.182.136:2181";

    private static class ZKDataListener implements IZkDataListener {
        @Override
        public void handleDataChange(String s, Object o) throws Exception {
            System.out.println("change: " + s + " : " + o);
        }

        @Override
        public void handleDataDeleted(String s) throws Exception {
            System.out.println("delete: " + s);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ZkClient zkClient = new ZkClient(ZK_ADDRESS, 10000, 10000, new SerializableSerializer());
        System.out.println("connected ok!");

        zkClient.subscribeDataChanges("/test/boy/five", new ZKDataListener());
        System.out.println("add listener");
        Thread.sleep(1000);

        zkClient.writeData("/test/boy/five", "new five data");
        System.out.println("write");

        Thread.sleep(5000);

        boolean delete = zkClient.delete("/test/boy/five");
        System.out.println(delete);

        Thread.sleep(10000);
    }
}
