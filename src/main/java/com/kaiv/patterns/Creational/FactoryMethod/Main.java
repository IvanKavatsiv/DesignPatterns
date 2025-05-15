package com.kaiv.patterns.Creational.FactoryMethod;

public class Main {

    public static void main(String[] args) {

        CarFactory carFactory = new MercedesFactory();
        carFactory.buildCar();

    }
}
