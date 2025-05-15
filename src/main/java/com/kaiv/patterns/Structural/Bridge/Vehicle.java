package com.kaiv.patterns.Structural.Bridge;

public abstract class Vehicle {

    CarModel carModel;

    public Vehicle(CarModel carModel) {
        this.carModel = carModel;
    }

    abstract void drive();

}
