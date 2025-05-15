package com.kaiv.patterns.Creational.AbstractFactory;

public class Main {

    public static void main(String[] args) {

        AbstractFactory abstractFactory = new MercedesFactory();
        Car car = abstractFactory.getCar();
        Bike bike = abstractFactory.getBike();
        car.drive();
        bike.drive();

    }
}
