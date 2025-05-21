package com.kaiv.patterns.Behavioral.State;

public class Winner extends State {
    @Override
    public void insertCoin(GumMachine gumMachine) {
        System.out.println("you are winner");
    }

    @Override
    public void turnCrank(GumMachine gumMachine) {
        System.out.println("get gum");
        gumMachine.state = new NoCoin();
    }
}
