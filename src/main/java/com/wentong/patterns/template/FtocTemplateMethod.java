package com.wentong.patterns.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FtocTemplateMethod extends Application{

    public static void main(String[] args) {
        new FtocTemplateMethod().run();
    }

    private BufferedReader reader;

    protected void init() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    protected void doSomething() {
        try {
            String s = reader.readLine();
            if (s == null || s.length() == 0) {
                setDone(true);
            } else {
                System.out.println("hello: " + s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected void cleanUp() {
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
