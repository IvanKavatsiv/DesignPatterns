package com.kaiv.patterns.Creational.AbstractFactory;

public class MercedesFactory implements AbstractFactory{
    @Override
    public Car getCar() {
        return new Mercedes();
    }

    @Override
    public Bike getBike() {
        return new MercedesBike();
    }
}
