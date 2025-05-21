package com.kaiv.patterns.Behavioral.Visitor;

interface Animal {
    void accept(AnimalVisitor animalVisitor);
}
