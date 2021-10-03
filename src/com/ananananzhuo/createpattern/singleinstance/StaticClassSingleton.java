package com.ananananzhuo.createpattern.singleinstance;

import com.ananananzhuo.createpattern.Print;
import com.ananananzhuo.createpattern.Print1;

/**
 * 静态内部类实现单例
 */
public class StaticClassSingleton implements Print {
    private StaticClassSingleton() {
    }

    public static StaticClassSingleton getInstance() {
        return StaticClassSingletonHolder.instance;
    }

    static class StaticClassSingletonHolder {
        static StaticClassSingleton instance = new StaticClassSingleton();
    }

    @Override
    public void printSomeThing() {
        System.out.println("静态内部类实现单例");
    }

    public static void main(String[] args) {
        StaticClassSingleton.getInstance().printSomeThing();
    }
}
