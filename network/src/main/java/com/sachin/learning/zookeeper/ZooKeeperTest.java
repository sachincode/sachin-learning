package com.sachin.learning.zookeeper;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;

import java.util.List;

/**
 * @author shicheng.zhang
 * @since 17-8-23 下午3:13
 */
public class ZooKeeperTest {


    private static final String ZK_ADDRESS = "10.90.182.136:2181";


    public static void main(String[] args) throws Exception {

        ZooKeeper zooKeeper = new ZooKeeper(ZK_ADDRESS, 2000 * 20, null);

//        String s = zooKeeper
//                .create("/test", "test data".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
//        System.out.println(s);

//        Stat stat = zooKeeper.setData("/test", "test data update".getBytes(), -1);
//        System.out.println(stat);

//        Stat stat1 = new Stat();
//        byte[] data = zooKeeper.getData("/test", false, stat1);
//        System.out.println(new String(data));

//        String s = zooKeeper
//                .create("/test/girl", "girl data".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
//        System.out.println(s);

//        Stat exists = zooKeeper.exists("/test/girl", false);
//        if (exists == null) {
//            System.out.println("节点不存在");
//        } else {
//            System.out.println("节点存在");
//        }

        List<String> children = zooKeeper.getChildren("/test", false);
        System.out.println(children);

//        for (int i = 0; i < 3; i++) {
//            String s = zooKeeper.create("/test/auto", ("auto" + i).getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE,
//                    CreateMode.PERSISTENT_SEQUENTIAL);
//            System.out.println(s);
//        }

        System.out.println();

    }
}
