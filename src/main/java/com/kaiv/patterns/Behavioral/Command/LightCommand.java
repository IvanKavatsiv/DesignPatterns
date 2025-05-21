package com.kaiv.patterns.Behavioral.Command;

public class LightCommand implements Command {

    Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchLight();
    }
}
