package com.ananananzhuo.createpattern.factory.simplefactory.abstratfactory;

public class BikeCarFactory implements CarFactory<BikeCar>{
    @Override
    public BikeCar makeTrafficTool() {
        return new BikeCar();
    }
}
