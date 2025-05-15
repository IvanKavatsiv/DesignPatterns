package com.kaiv.patterns.Structural.Facade;

public class LivingRoom {

    RoomFacade roomFacade = new RoomFacade();

    public void pressButton(String channel, String temperature){

        roomFacade.pressButton(channel, temperature);

    }

}
