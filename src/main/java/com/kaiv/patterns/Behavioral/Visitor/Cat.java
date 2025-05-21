package com.kaiv.patterns.Behavioral.Visitor;

public class Cat implements Animal{
    @Override
    public void accept(AnimalVisitor animalVisitor) {
        animalVisitor.action(this);
    }
}
