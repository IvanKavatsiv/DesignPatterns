package com.kaiv.patterns.Structural.Bridge;

public class Track extends Vehicle {

    public Track(CarModel carModel) {
        super(carModel);
    }

    @Override
    void drive() {
        carModel.drive("drive track");
    }
}
