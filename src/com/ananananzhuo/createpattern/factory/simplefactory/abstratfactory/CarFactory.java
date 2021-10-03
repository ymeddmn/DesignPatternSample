package com.ananananzhuo.createpattern.factory.simplefactory.abstratfactory;

/**
 * 抽象工厂类
 * @param <C>
 */
public interface CarFactory<C extends Car> {
    C makeTrafficTool();
}
