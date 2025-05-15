package com.kaiv.patterns.Creational.Prototype;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Mike", 22);
        Person person2 = person.clone();

        System.out.println(person != person2);
        System.out.println(person.name != person2.name);

    }

}
