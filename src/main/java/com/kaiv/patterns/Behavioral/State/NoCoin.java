package com.kaiv.patterns.Behavioral.State;


import java.util.Random;

public class NoCoin extends State {

    @Override
    public void insertCoin(GumMachine gumMachine) {
        if (new Random().nextBoolean()){
            System.out.println("you win!");
            gumMachine.state = new Winner();
        }
        else {
            gumMachine.state = new HasCoin();
        }
    }

    @Override
    public void turnCrank(GumMachine gumMachine) {
        System.out.println("no coin");
    }
}
