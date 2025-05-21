package com.kaiv.patterns.Behavioral.Observer;

public class Subscriber2 implements MyObservable{
    @Override
    public void callMe(String msg) {
        System.out.println("Subscriber2 " + msg);
    }
}
