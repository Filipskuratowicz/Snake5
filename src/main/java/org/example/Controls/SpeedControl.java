package org.example.Controls;

import org.example.timer.AnimationTimerExt;
import org.example.storage.BlockList;

public class SpeedControl {

    int speed = 200;
    int oldLenght;

    public void speedUpSnake(AnimationTimerExt animationTimerExt, BlockList blockList) {
        int newListSize = blockList.blockListSize();

        if (oldLenght != newListSize) {
            oldLenght = newListSize;
            speed -= 0.2;

            if (speed >= 30) {
                animationTimerExt.setSleepNs(speed);
            }
        }
    }
}
