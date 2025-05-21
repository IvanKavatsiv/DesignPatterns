package com.kaiv.patterns.Behavioral.Visitor;

public class EatVisitor implements AnimalVisitor{
    @Override
    public void action(Dog dog) {
        System.out.println("eat meat");
    }

    @Override
    public void action(Cat cat) {
        System.out.println("drink milk");
    }
}
