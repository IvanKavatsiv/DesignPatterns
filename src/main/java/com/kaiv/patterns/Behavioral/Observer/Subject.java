package com.kaiv.patterns.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    List<MyObservable> list = new ArrayList<>();

    public void subscribe(MyObservable myObservable){
        list.add(myObservable);
    }

    public void unSubscribe(MyObservable myObservable){
        list.remove(myObservable);
    }

    public void notifyAllSubscribers(String msg){

        list.forEach(item -> item.callMe(msg));

    }

}
