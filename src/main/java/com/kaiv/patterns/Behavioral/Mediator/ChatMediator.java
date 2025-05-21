package com.kaiv.patterns.Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Chat{
    List<Colleague> list = new ArrayList<>();

    @Override
    public void sendMessage(String message, Colleague me) {
        list.forEach(colleague -> {
            if(colleague != me){
                colleague.printMessage(message);
            }
        });
    }

    @Override
    public void addColleague(Colleague colleague) {
        list.add(colleague);
    }
}
