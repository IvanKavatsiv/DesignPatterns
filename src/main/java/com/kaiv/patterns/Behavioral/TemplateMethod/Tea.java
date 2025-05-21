package com.kaiv.patterns.Behavioral.TemplateMethod;

public class Tea extends Drink {

    @Override
    void addDrink() {
        System.out.println("adding tea");
    }

    @Override
    void addConditment() {
        System.out.println("adding lemon");
    }
}
