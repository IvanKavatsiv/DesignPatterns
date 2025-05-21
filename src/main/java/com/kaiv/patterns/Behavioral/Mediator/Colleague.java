package com.kaiv.patterns.Behavioral.Mediator;

abstract class Colleague {

    Chat chat;
    String name;

    public Colleague(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    abstract void sendMessage(String message);
    abstract void printMessage(String message);
}
