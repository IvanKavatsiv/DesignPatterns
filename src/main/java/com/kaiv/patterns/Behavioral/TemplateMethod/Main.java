package com.kaiv.patterns.Behavioral.TemplateMethod;

public class Main {

    public static void main(String[] args) {

        Drink drinkTea = new Tea();
        drinkTea.makeDrink();

        System.out.println("----------------");

        Drink drinkCoffee = new Coffee();
        drinkCoffee.makeDrink();

    }

}
