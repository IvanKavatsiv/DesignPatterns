package com.kaiv.patterns.Structural.Decorator;

public class Main {

    public static void main(String[] args) {

        Pizza cheesePizza = new CheesePizza(new DoughForPizza());
        Pizza peperoniCheesePizza = new PeperoniPizza(cheesePizza);

        System.out.println(peperoniCheesePizza.makePizza());

    }
}
