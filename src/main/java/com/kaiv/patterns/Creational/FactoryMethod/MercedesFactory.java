package com.kaiv.patterns.Creational.FactoryMethod;

public class MercedesFactory extends CarFactory{
    @Override
    Car getCar() {
        return new Mercedes();
    }
}
