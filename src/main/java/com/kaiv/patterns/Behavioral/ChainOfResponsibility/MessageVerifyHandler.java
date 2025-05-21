package com.kaiv.patterns.Behavioral.ChainOfResponsibility;

public class MessageVerifyHandler extends MessageHandler{
    public MessageVerifyHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String msg) {
        if (!msg.matches(".*\\d.*")){
            messageHandler.handle(msg);
        }
    }
}
