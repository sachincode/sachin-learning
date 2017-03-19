package com.sachin.learning.chapter5;

/**
 * @author shicheng.zhang
 * @date 16-12-17
 * @time 下午11:00
 * @Description:
 */
public interface Board {
    int getMaxX();
    int getMaxY();
    int getValue(int x, int y);
    int setNewValue(int x, int y, int value);
    void commitNewValues();
    boolean hasConverged();
    void waitForConvergence();
    Board getSubBoard(int numPartitions, int index);
}
