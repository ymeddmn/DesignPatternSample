package com.ananananzhuo.createpattern.singleinstance;

import com.ananananzhuo.createpattern.Print;

public class HungrySingletom implements Print {
    private HungrySingletom() {
    }

    private static HungrySingletom INSTANCE = new HungrySingletom();

    public static HungrySingletom getInstance() {
        return INSTANCE;
    }

    @Override
    public void printSomeThing() {
        System.out.println("恶汉打印数据");
    }
}

class Client {
    public static void main(String[] args) {
        HungrySingletom.getInstance().printSomeThing();
    }
}