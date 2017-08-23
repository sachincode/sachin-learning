package com.sachin.learning.zookeeper;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;

/**
 * @author shicheng.zhang
 * @since 17-8-23 下午4:07
 */
public class ZKWatcher implements Watcher {
    @Override
    public void process(WatchedEvent event) {
        if (event.getType() == Event.EventType.NodeCreated) {
            System.out.println("create");
        }
        if (event.getType() == Event.EventType.NodeDeleted) {
            System.out.println("delete");
        }
        if (event.getType() == Event.EventType.NodeDataChanged) {
            System.out.println("data update");
        }
        if (event.getType() == Event.EventType.NodeChildrenChanged) {
            System.out.println("child update");
        }
    }
}
