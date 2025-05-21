package com.kaiv.patterns.Behavioral.State;

abstract class State {
    int count = 10;
    abstract public void insertCoin(GumMachine gumMachine);
    abstract public void turnCrank(GumMachine gumMachine);
}
