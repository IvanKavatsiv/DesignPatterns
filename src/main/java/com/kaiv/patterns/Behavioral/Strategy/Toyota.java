package com.kaiv.patterns.Behavioral.Strategy;

public class Toyota extends Car{
    public Toyota(Flyable flyable) {
        super(flyable);
    }

    @Override
    void run() {
        System.out.println("run Toyota");
    }
}
