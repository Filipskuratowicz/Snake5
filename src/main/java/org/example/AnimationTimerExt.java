package org.example;

import javafx.animation.AnimationTimer;

public abstract class  AnimationTimerExt extends AnimationTimer {

    private long sleepNs = 0;

    long prevTime = 0;

    public AnimationTimerExt( long sleepMs) {
        this.sleepNs = sleepMs * 1_000_000;
    }

    public void setSleepNs(long sleepNs) {
        this.sleepNs = sleepNs;
    }

    @Override
    public void handle(long now) {


        if ((now - prevTime) < sleepNs) {
            return;
        }

        prevTime = now;

        handle();
    }

    public abstract void handle();

}
