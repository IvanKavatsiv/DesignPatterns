package com.kaiv.patterns.Structural.Bridge;

public class Audi  implements CarModel{
    @Override
    public void drive(String str) {
        System.out.println(str + " Audi");
    }
}
