package com.wentong.patterns.state;

public class UnLockedTurnstileState implements TurnstileState {
    @Override
    public void coin(Turnstile turnstile) {
        turnstile.thankYou();
    }

    @Override
    public void pass(Turnstile turnstile) {
        turnstile.setLocked();
        turnstile.lock();
    }
}
