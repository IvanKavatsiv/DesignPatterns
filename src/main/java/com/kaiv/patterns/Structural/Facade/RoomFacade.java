package com.kaiv.patterns.Structural.Facade;

public class RoomFacade {

    Tv tv = new Tv();
    AirConditioner airConditioner = new AirConditioner();
    Light light = new Light();

    public void pressButton(String channel, String temperature){

        tv.playChannel(channel);
        airConditioner.setTemp(temperature);
        light.turnLight();

    }

}
