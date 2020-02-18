package org.example.Controls;

import org.example.blocks.SnakeHead;
import org.example.blocks.SnakeTail;

import java.util.ArrayList;

public class EndOfGame {
    boolean isGameEnd =true;

    public void crashOnBand(SnakeHead block) {
        if (block.getPosX() == 300 || block.getPosY() == 300) {
            isGameEnd = false;
        }
        if (block.getPosX() == -10 || block.getPosY() == -10) {
            isGameEnd = false;
        }

    }

    public void crashOnYourself(SnakeHead block, ArrayList<SnakeTail> arr) {

            arr.stream().skip(1).forEach(e -> {
                if (e.getPosy()*10 == block.getPosY() && e.getPosx()*10 == block.getPosX()) {
                    isGameEnd = false;
                }
            });
    }

    public boolean returnInformationEnd() {
        return isGameEnd;
    }

    public void setGameEnd(boolean gameEnd) {
        isGameEnd = gameEnd;
    }
}




