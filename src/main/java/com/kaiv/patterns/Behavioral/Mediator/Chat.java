package com.kaiv.patterns.Behavioral.Mediator;

public interface Chat {
    void  sendMessage(String message, Colleague colleague);
    void addColleague(Colleague colleague);
}
