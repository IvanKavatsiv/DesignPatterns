package com.kaiv.patterns.Behavioral.ChainOfResponsibility;

abstract class MessageHandler {

    MessageHandler messageHandler;

    public MessageHandler(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    abstract void  handle(String msg);
}
