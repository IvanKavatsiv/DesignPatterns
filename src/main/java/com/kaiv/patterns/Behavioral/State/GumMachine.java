package com.kaiv.patterns.Behavioral.State;

public class GumMachine {

    State state = new NoCoin();

    public void insertCoin(){
        state.insertCoin(this);
    }

    public void turnCrank(){
        state.turnCrank(this);
    }

}
