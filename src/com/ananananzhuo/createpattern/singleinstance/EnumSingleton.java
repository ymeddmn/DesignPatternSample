package com.ananananzhuo.createpattern.singleinstance;

import com.ananananzhuo.createpattern.Print;
import com.ananananzhuo.createpattern.Print1;

/**
 * 枚举实现单例模式
 */
public enum EnumSingleton implements Print {
    INSTANCE{
        @Override
        public void action(){
            System.out.println("INSTANCE单例方法");
        }
    },DEFAULT{
        @Override
        public void action(){
            System.out.println("DEFAULT单例方法");
        }
    };

    @Override
    public void printSomeThing() {
        System.out.println(name());

    }

    public static void main(String[] args) {
        EnumSingleton.INSTANCE.printSomeThing();
        EnumSingleton.DEFAULT.printSomeThing();
        EnumSingleton.INSTANCE.action();
        EnumSingleton.DEFAULT.action();
    }

    public void action() {

    }
}
