package com.kaiv.patterns.Structural.Bridge;

public class Toyota implements CarModel{
    @Override
    public void drive(String str) {
        System.out.println(str + " Toyota");
    }
}
