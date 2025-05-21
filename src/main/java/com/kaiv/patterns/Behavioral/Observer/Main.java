package com.kaiv.patterns.Behavioral.Observer;

public class Main {

    public static void main(String[] args) {

        Subject subject = new Subject();

        Subscriber1 subscriber1 = new Subscriber1();
        Subscriber2 subscriber2 = new Subscriber2();

        subject.subscribe(subscriber1);
        subject.subscribe(subscriber2);

        subject.notifyAllSubscribers("hello");

        subject.unSubscribe(subscriber1);

        subject.notifyAllSubscribers("hello");

    }

}
