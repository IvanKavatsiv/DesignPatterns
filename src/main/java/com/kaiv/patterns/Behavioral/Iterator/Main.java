package com.kaiv.patterns.Behavioral.Iterator;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.forEach(System.out::println);

    }
}
