package com.kaiv.patterns.Structural.Bridge;

public class Car extends Vehicle {

    public Car(CarModel carModel) {
        super(carModel);
    }

    @Override
    void drive() {
        carModel.drive("drive car");
    }
}
