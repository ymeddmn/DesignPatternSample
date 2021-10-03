package com.ananananzhuo.createpattern.singleinstance;


import com.ananananzhuo.createpattern.Print;
import com.ananananzhuo.createpattern.Print1;

/**
 * 线程安全单例
 */
public class LazyThreadSafeSingleTon implements Print, Print1 {
    private static LazyThreadSafeSingleTon instance = null;

    private LazyThreadSafeSingleTon() {
    }

    public static synchronized LazyThreadSafeSingleTon getInstance() {
        if (instance == null) {
            instance = new LazyThreadSafeSingleTon();
        }
        return instance;
    }

    @Override
    public void printSomeThing() {
        System.out.println("线程安全懒汉单例");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {
            final int index = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    LazyThreadSafeSingleTon myInstance = LazyThreadSafeSingleTon.getInstance();
                    myInstance.printMsg("索引：" + index + "   " + myInstance.toString());
                }
            }).start();
        }
    }

    @Override
    public void printMsg(String msg) {
        System.out.println(msg);
    }
}