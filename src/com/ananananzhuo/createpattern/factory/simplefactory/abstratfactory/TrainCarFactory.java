package com.ananananzhuo.createpattern.factory.simplefactory.abstratfactory;

public class TrainCarFactory implements CarFactory<TrainCar>{
    @Override
    public TrainCar makeTrafficTool() {
        return new TrainCar();
    }
}
