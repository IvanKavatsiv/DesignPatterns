package com.kaiv.patterns.Behavioral.State;

public class HasCoin extends State{
    @Override
    public void insertCoin(GumMachine gumMachine) {
        System.out.println("you have set coin already");
    }

    @Override
    public void turnCrank(GumMachine gumMachine) {
        if (count <= 0){
            gumMachine.state = new SoldOut();
        }
        else {
            System.out.println("Selling...");
            count--;
            gumMachine.state = new NoCoin();
        }
    }
}
