package com.kaiv.patterns.Structural.Proxy;

public class Main {

    public static void main(String[] args) {
        Service proxy = new LoggingProxy(new RealService());
        proxy.perform();
    }

}
