package com.wentong.patterns.adapter.compose;

public class Adaptee {

    private String name;

    public Adaptee(String name) {
        this.name = name;
    }

    void fa() {
        System.out.println("Adaptee.fa" + name);
    }

    void fb() {
        System.out.println("Adaptee.fb" + name);
    }

    void fc() {
        System.out.println("Adaptee.fc" + name);
    }

}
