package com.kaiv.patterns.Behavioral.Command;

public class Light {
    boolean isOn;

    public void switchLight(){
        this.isOn = !this.isOn;
        System.out.println("Light is " + (isOn ? "on" : "off"));
    }
}
