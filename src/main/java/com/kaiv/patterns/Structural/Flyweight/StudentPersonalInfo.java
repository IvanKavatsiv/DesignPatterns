package com.kaiv.patterns.Structural.Flyweight;

public class StudentPersonalInfo {

    String name;
    int age;
    String homeAddress;
    int course;
    double avrMark;

    public StudentPersonalInfo(String name, int age, String homeAddress, int course, double avrMark) {
        this.name = name;
        this.age = age;
        this.homeAddress = homeAddress;
        this.course = course;
        this.avrMark = avrMark;
    }
}
