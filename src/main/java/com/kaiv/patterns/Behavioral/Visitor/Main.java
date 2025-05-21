package com.kaiv.patterns.Behavioral.Visitor;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Dog();
        dog.accept(new SoundVisitor());
        dog.accept(new EatVisitor());

        Animal cat = new Cat();
        cat.accept(new SoundVisitor());
        cat.accept(new EatVisitor());

    }

}
