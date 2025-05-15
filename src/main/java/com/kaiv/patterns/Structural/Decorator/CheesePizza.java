package com.kaiv.patterns.Structural.Decorator;

public class CheesePizza implements Pizza{

    Pizza pizza;

    public CheesePizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + " cheese";
    }
}
