package com.kaiv.patterns.Structural.Decorator;

public class PeperoniPizza implements Pizza{

    Pizza pizza;

    public PeperoniPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return  pizza.makePizza() + " peperoni";
    }
}
