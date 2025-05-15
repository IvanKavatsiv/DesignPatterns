package com.kaiv.patterns.Structural.Decorator;

public class DoughForPizza implements Pizza{
    @Override
    public String makePizza() {
        return "with";
    }
}
