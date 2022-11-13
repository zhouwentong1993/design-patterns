package com.wentong.patterns.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ConcreteSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void removeRegister(Observer observer) {
        observers.removeIf(o -> Objects.equals(observer, o));
    }

    public void onUpdate() {
        for (Observer observer : observers) {
            observer.doSomething();
        }
    }
}
