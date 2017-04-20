package com.sachin.learning.innerclass;

/**
 * 局部内部类 定义在作用域内
 * 
 * @author shicheng.zhang
 * @since 17-4-20 下午9:14
 */
public class Parce16 {

    private void internalTracking(boolean b) {
        if (b) {
            class TrackingSlip {
                private String id;

                TrackingSlip(String s) {
                    id = s;
                }

                String getId() {
                    return id;
                }
            }

            TrackingSlip ts = new TrackingSlip("定义在作用域内");
            String string = ts.getId();
            System.out.println(string);
        }
    }

    public void track() {
        internalTracking(true);
    }

    public static void main(String[] args) {
        Parce16 parce16 = new Parce16();
        parce16.track();
    }
}
