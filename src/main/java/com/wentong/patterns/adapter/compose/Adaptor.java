package com.wentong.patterns.adapter.compose;

public class Adaptor implements ITarget{

    private Adaptee adaptee;

    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void f1() {
        adaptee.fa();
    }

    public void f2() {
        adaptee.fb();
    }

    public void f3() {
        adaptee.fc();
    }
}
