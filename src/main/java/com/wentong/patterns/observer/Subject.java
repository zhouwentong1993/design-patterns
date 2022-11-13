package com.wentong.patterns.observer;

public interface Subject {

    void register(Observer observer);

    void removeRegister(Observer observer);

    void onUpdate();
}
