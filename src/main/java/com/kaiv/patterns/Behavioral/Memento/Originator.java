package com.kaiv.patterns.Behavioral.Memento;

public class Originator {
    String state;

    public void setState(String state){
        this.state = state;
    }

    public Memento saveState(){
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento memento){
        this.state = memento.state;
    }

    static class Memento{

        String state;

        public Originator.Memento saveState(){
            return new Memento(this.state);
        }

        public void restoreFromMemento(Memento memento){
            this.state = memento.state;
        }

        public Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }

}
