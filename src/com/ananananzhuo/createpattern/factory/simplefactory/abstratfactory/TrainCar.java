package com.ananananzhuo.createpattern.factory.simplefactory.abstratfactory;

public class TrainCar implements Car{
    @Override
    public void drive() {
        System.out.println("开火车");
    }
}
