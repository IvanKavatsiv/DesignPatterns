package com.kaiv.patterns.Behavioral.Command;

public class Button {

    Command command;

    public Button(Command command) {
        this.command = command;
    }

    void pressButton(){
        command.execute();
    }
}
