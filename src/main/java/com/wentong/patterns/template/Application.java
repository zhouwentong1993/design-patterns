package com.wentong.patterns.template;

public abstract class Application {

    private boolean isDone = false;

    public void run() {
        init();
        while (!isDone) {
            doSomething();
        }

        cleanUp();

    }

    protected abstract void init();

    protected abstract void doSomething();

    protected abstract void cleanUp();

    protected void setDone(boolean isDone) {
        this.isDone = isDone;
    }

}
