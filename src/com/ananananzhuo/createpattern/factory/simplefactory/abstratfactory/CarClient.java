package com.ananananzhuo.createpattern.factory.simplefactory.abstratfactory;

public class CarClient {
    public static void main(String[] args) {
        new BikeCarFactory().makeTrafficTool().drive();
        new TrainCarFactory().makeTrafficTool().drive();
    }
}
