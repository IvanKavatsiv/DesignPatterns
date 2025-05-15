package com.kaiv.patterns.Structural.Proxy;

public class RealService implements Service {
    @Override
    public void perform() {
        System.out.println("RealService: Performing action...");
    }
}
