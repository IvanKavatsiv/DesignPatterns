package com.kaiv.patterns.Behavioral.Strategy;

public class Tractor extends Car{


    public Tractor(Flyable flyable) {
        super(flyable);
    }

    @Override
    void run() {
        System.out.println("run Tractor");
    }
}
