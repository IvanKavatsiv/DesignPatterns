package com.kaiv.patterns.Behavioral.Strategy;

public class Ferrari extends Car{
    public Ferrari(Flyable flyable) {
        super(flyable);
    }

    @Override
    void run() {
        System.out.println("run Ferrari");
    }
}
