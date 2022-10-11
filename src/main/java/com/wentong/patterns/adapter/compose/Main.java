package com.wentong.patterns.adapter.compose;

public class Main {

    public static void main(String[] args) {
        Adaptor hello = new Adaptor(new Adaptee("hello"));
        hello.f1();
    }

}
