package com.kaiv.patterns.Behavioral.Strategy;

public abstract class Car {

    Flyable flyable;

    public Car(Flyable flyable) {
        this.flyable = flyable;
    }

    public  void fly(){
        flyable.fly();
    }

    abstract void run();
    public void stop(){
        System.out.println("stop");
    }
}
