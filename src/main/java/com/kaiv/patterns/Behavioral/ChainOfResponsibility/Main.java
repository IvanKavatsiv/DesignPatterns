package com.kaiv.patterns.Behavioral.ChainOfResponsibility;

public class Main {

    public static void main(String[] args) {

        MessageHandler messageHandler = new MessageAddExclamationMarkHandler(new MessageVerifyHandler(new MessagePrintHandler(null)));
        messageHandler.handle("hello world");

    }

}
