package com.kaiv.patterns.Behavioral.Visitor;

interface AnimalVisitor {
    void action(Dog dog);
    void action(Cat cat);
}
