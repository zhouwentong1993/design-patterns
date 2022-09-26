package com.wentong.patterns.state;

public class LockedTurnstileState implements TurnstileState{

    @Override
    public void coin(Turnstile turnstile) {
        turnstile.setUnLocked();
        turnstile.unLock();
    }

    @Override
    public void pass(Turnstile turnstile) {
        turnstile.alarm();
    }

}
