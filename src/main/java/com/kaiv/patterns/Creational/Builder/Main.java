package com.kaiv.patterns.Creational.Builder;

public class Main {

    public static void main(String[] args) {

        User user = new User.Builder()
                .firstName("Ivan")
                .lastName("Ivanov")
                .age(30)
                .email("ivan@example.com")
                .build();

        System.out.println(user);

    }
}
