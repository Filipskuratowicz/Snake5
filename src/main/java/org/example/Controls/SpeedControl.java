package org.example.Controls;

import org.example.timer.AnimationTimerExt;
import org.example.storage.BlockList;

public class SpeedControl {

    int speed = 200;
    int oldLength;

    public void speedUpSnake(AnimationTimerExt animationTimerExt, BlockList blockList) {

        int newListSize = blockList.blockListSize();
        if (oldLength != newListSize) {
            oldLength = newListSize;
            speed -= 2;
            if (speed >= 30) {
                animationTimerExt.setSleepNs(speed);
            }
        }
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
