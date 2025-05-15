package com.kaiv.patterns.Creational.FactoryMethod;

public class BmwFactory extends CarFactory{
    @Override
    Car getCar() {
        return new Bmw();
    }
}
