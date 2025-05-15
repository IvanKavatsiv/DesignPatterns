package com.kaiv.patterns.Creational.FactoryMethod;

abstract public class CarFactory {

    public void buildCar(){

        Car car = getCar();
        car.drive();
        // more needed logic with car

    }

    abstract Car getCar();

}
