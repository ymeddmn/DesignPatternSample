package com.ananananzhuo.createpattern.factory.simplefactory.simplefactory;

public class SimpleFactory {
    static TaxiCar makeTaxiCar(){
        return new TaxiCar();
    }
    static TruckCar makeTruckCar(){
        return new TruckCar();
    }

    public static void main(String[] args) {
        SimpleFactory.makeTaxiCar().drive();
        SimpleFactory.makeTruckCar().drive();
    }
}
class TaxiCar{
    void drive(){
        System.out.println("开出租");
    }
}

class TruckCar{
    void drive(){
        System.out.println("开卡车");
    }
}