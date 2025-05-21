package com.kaiv.patterns.Behavioral.Mediator;

public class Main {

    public static void main(String[] args) {

        Chat chat = new ChatMediator();
        ColleagueImpl ivan = new ColleagueImpl(chat, "Ivan");
        chat.addColleague(ivan);
        chat.addColleague(new ColleagueImpl(chat, "Mike"));
        chat.addColleague(new ColleagueImpl(chat, "Den"));
        ivan.sendMessage("hello");

    }
}