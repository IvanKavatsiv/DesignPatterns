package com.kaiv.patterns.Behavioral.Memento;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Originator.Memento> list = new ArrayList<>();

        Originator originator = new Originator();
        originator.setState("one");
        originator.setState("two");
        list.add(originator.saveState());
        originator.setState("three");
        System.out.println(originator.state);
        originator.restoreFromMemento(list.get(0));
        System.out.println(originator.state);

    }

}
