package com.kaiv.patterns.Behavioral.Visitor;

public class Dog implements Animal{
    @Override
    public void accept(AnimalVisitor animalVisitor) {
        animalVisitor.action(this);
    }
}
