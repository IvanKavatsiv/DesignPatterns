package com.kaiv.patterns.Behavioral.Strategy;

public class FlyVehicle implements Flyable{
    @Override
    public void fly() {
        System.out.println("fly");
    }
}
