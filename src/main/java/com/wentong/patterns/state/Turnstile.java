package com.wentong.patterns.state;

public class Turnstile {

    private static LockedTurnstileState lockedTurnstileState = new LockedTurnstileState();
    private static UnLockedTurnstileState unLockedTurnstileState = new UnLockedTurnstileState();

    private TurnstileState turnstileState = lockedTurnstileState;
    private TurnstileController turnstileController;

    public Turnstile(TurnstileController turnstileController) {
        this.turnstileController = turnstileController;
    }

    public void coin() {
        turnstileState.coin(this);
    }

    public void pass() {
        turnstileState.pass(this);
    }

    public void setLocked() {
        this.turnstileState = lockedTurnstileState;
    }

    public void setUnLocked() {
        this.turnstileState = unLockedTurnstileState;
    }

    public boolean isLocked() {
        return turnstileState == lockedTurnstileState;
    }

    public boolean isUnlocked() {
        return turnstileState == unLockedTurnstileState;
    }

    void thankYou() {
        this.turnstileController.thankYou();
    }

    void alarm() {
        this.turnstileController.alarm();
    }

    void lock() {
        this.turnstileController.lock();
    }

    void unLock() {
        this.turnstileController.unLock();

    }

}

