package com.wentong.patterns.observer;

public class ConcreteObserver1 implements Observer {

    @Override
    public void doSomething() {
        System.out.println("ConcreteObserver1.doSomething");
    }

}
