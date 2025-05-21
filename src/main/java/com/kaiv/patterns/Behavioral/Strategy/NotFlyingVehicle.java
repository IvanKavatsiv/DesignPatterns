package com.kaiv.patterns.Behavioral.Strategy;

public class NotFlyingVehicle implements Flyable{
    @Override
    public void fly() {
        System.out.println("cannot fly");
    }
}
