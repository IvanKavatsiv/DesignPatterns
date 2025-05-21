package com.kaiv.patterns.Behavioral.State;

public class Main {

    public static void main(String[] args) {

        GumMachine gumMachine = new GumMachine();
        gumMachine.insertCoin();
        gumMachine.insertCoin();
        gumMachine.turnCrank();

    }

}
