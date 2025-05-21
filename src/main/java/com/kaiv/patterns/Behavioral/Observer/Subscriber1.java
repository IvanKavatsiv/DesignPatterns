package com.kaiv.patterns.Behavioral.Observer;

public class Subscriber1 implements MyObservable{
    @Override
    public void callMe(String msg) {
        System.out.println("Subscriber1 " + msg);
    }
}
