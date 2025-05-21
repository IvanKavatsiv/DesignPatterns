package com.kaiv.patterns.Behavioral.TemplateMethod;

abstract class Drink {

    private void boilWater(){
        System.out.println("boiling water");
    }

    abstract void addDrink();

    private void addSugar(){
        System.out.println("adding sugar");
    }

    abstract void addConditment();

    public void makeDrink() {
        boilWater();
        addDrink();
        addSugar();
        addConditment();
    }

}
