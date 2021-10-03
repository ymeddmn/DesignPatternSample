package com.ananananzhuo.createpattern.singleinstance;

import com.ananananzhuo.createpattern.Print1;

/**
 * 双检索方式实现线程安全单例模式
 */
public class DoubleLockThreadSafeSingleTon implements Print1 {
    private static volatile DoubleLockThreadSafeSingleTon instance;//volatie是必须的
    private DoubleLockThreadSafeSingleTon(){}

    public static DoubleLockThreadSafeSingleTon getInstance() {
        if(instance==null){
            synchronized (DoubleLockThreadSafeSingleTon.class){
                if (instance==null){
                    instance=new DoubleLockThreadSafeSingleTon();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i=0;i<200;i++){
            System.out.println(DoubleLockThreadSafeSingleTon.getInstance().toString());
        }
    }

    @Override
    public void printMsg(String msg) {
        System.out.println(msg);
    }
}
