package com.kaiv.patterns.Behavioral.ChainOfResponsibility;

public class MessagePrintHandler extends MessageHandler{
    public MessagePrintHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String msg) {
        System.out.println(msg);
    }
}
