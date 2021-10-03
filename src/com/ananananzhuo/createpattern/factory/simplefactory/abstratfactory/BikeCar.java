package com.ananananzhuo.createpattern.factory.simplefactory.abstratfactory;

public class BikeCar implements Car{
    @Override
    public void drive() {
        System.out.println("骑自行车");
    }
}
