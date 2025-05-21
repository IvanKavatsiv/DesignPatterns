package com.kaiv.patterns.Behavioral.ChainOfResponsibility;

public class MessageAddExclamationMarkHandler extends MessageHandler {
    public MessageAddExclamationMarkHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String msg) {
        messageHandler.handle(msg + "!");
    }
}
