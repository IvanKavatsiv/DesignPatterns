package com.kaiv.patterns.Behavioral.Visitor;

public class SoundVisitor implements AnimalVisitor{
    @Override
    public void action(Dog dog) {
        System.out.println("wof");
    }

    @Override
    public void action(Cat cat) {
        System.out.println("meow");
    }
}
