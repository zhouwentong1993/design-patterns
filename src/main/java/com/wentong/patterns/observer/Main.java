package com.wentong.patterns.observer;

public class Main {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        ConcreteObserver1 observer = new ConcreteObserver1();
        subject.register(observer);
        subject.register(new ConcreteObserver1());
        subject.register(new ConcreteObserver2());
        subject.register(new ConcreteObserver3());
        subject.removeRegister(observer);
        subject.onUpdate();
    }

}
