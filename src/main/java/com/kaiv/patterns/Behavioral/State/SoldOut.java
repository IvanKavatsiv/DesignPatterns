package com.kaiv.patterns.Behavioral.State;

public class SoldOut extends State {
    @Override
    public void insertCoin(GumMachine gumMachine) {
        System.out.println("no gums");
    }

    @Override
    public void turnCrank(GumMachine gumMachine) {
        System.out.println("no gums");
    }
}
