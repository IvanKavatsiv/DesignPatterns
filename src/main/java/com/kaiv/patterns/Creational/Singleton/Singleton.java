package com.kaiv.patterns.Creational.Singleton;

public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {
        // приватний конструктор
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
