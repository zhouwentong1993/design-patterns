package com.wentong.patterns.state;

public interface TurnstileState {

    void coin(Turnstile turnstile);

    void pass(Turnstile turnstile);

}
