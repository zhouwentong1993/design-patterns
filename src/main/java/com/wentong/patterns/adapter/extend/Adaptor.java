package com.wentong.patterns.adapter.extend;

public class Adaptor extends Adaptee implements ITarget{


    public Adaptor(String name) {
        super(name);
    }

    public void f1() {
        super.fa();
    }

    public void f2() {
        super.fb();
    }

    public void f3() {
        super.fc();
    }
}
