package com.kaiv.patterns.Behavioral.Strategy;

public class Main {

    public static void main(String[] args) {

        Car ferrari = new Ferrari(new FlyVehicle());
        Car toyota = new Toyota(new FlyVehicle());
        Car tractor = new Tractor(new NotFlyingVehicle());

        ferrari.fly();
        toyota.fly();
        tractor.fly();

    }

}
