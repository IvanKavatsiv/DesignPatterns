package com.kaiv.patterns.Structural.Bridge;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicleCar = new Car(new Toyota());
        vehicleCar.drive();

        Vehicle vehicleTrack = new Track(new Audi());
        vehicleTrack.drive();

    }
}