package com.wentong.patterns.state;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTurnstile {

    private boolean thankYouCalled = false;
    private boolean alarmCalled = false;
    private boolean lockCalled = false;
    private boolean unLockCalled = false;

    private Turnstile turnstile;

    @Before
    public void setUp() {
        TurnstileController controller = new TurnstileController() {

            @Override
            public void thankYou() {
                thankYouCalled = true;
            }

            @Override
            public void alarm() {
                alarmCalled = true;
            }

            @Override
            public void lock() {
                lockCalled = true;
            }

            @Override
            public void unLock() {
                unLockCalled = true;
            }
        };

        turnstile = new Turnstile(controller);
    }

    @Test
    public void testInitialConditions() {
        assertTrue(turnstile.isLocked());
    }

    @Test
    public void testCoinInLockedState() {
        turnstile.setLocked();
        turnstile.coin();
        assertTrue(turnstile.isUnlocked());
        assertTrue(unLockCalled);
    }

    @Test
    public void testCoinInUnLockState() {
        turnstile.setUnLocked();
        turnstile.coin();
        assertTrue(thankYouCalled);
        assertTrue(turnstile.isUnlocked());
    }

    @Test
    public void testPassInLockState() {
        turnstile.setLocked();
        turnstile.pass();
        assertTrue(alarmCalled);
        assertTrue(turnstile.isLocked());
    }

    @Test
    public void testPassInUnLockState() {
        turnstile.setUnLocked();
        turnstile.pass();
        assertTrue(turnstile.isLocked());
        assertTrue(lockCalled);

    }


}
