package com.kaiv.patterns.Structural.Flyweight;

public class Main {

    public static void main(String[] args) {

        PersonCache cache = new PersonCache();
        StudentUnivercityInfo mike = cache.getStudentUnivercityInfo("management");
        StudentUnivercityInfo mike2 = cache.getStudentUnivercityInfo("management");
        System.out.println(mike2 == mike2);

    }
}
