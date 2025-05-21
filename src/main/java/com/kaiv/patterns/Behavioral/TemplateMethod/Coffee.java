package com.kaiv.patterns.Behavioral.TemplateMethod;

public class Coffee extends Drink {

    @Override
    void addDrink() {
        System.out.println("adding coffee");
    }

    @Override
    void addConditment() {
        System.out.println("adding milk");
    }
}
