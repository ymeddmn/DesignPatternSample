package com.ananananzhuo.createpattern.singleinstance;

import com.ananananzhuo.createpattern.Print;

/**
 * 非线程安全懒汉
 */
public class LazySingleTon implements Print {
    private static LazySingleTon INSTANCE=null ;
    private LazySingleTon(){}

    public static LazySingleTon getInstance(){
        if (INSTANCE==null){
            INSTANCE=new LazySingleTon();
        }
        return INSTANCE;
    }

    @Override
    public void printSomeThing() {
        System.out.println("非线程安全懒汉单例模式");
    }

//    public static void main(String[] args) {
//        LazySingleTon.getInstance().printSomeThing();
//    }
}
