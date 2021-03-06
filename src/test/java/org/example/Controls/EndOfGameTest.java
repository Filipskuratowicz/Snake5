package org.example.Controls;

import org.example.blocks.SnakeHead;
import org.example.blocks.SnakeTail;
import org.example.storage.BlockList;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class EndOfGameTest {

    final SnakeHead snakeHead = new SnakeHead(10, 10);
    final SnakeHead snakeHeadOutsideBand = new SnakeHead(30, 7);
    BlockList blockList = new BlockList();
    SnakeTail blockCloned = new SnakeTail(snakeHead.getPosX()+10, snakeHead.getPosY());
    SnakeTail blockCloned1 = new SnakeTail(snakeHead.getPosX(), snakeHead.getPosY());
    EndOfGame endOfGameM = new EndOfGame();

    @Test
    public void returnInformationEndAfterSnakeCrashOnSnakeShouldChangeEndOfGameToFalse() {
        endOfGameM.crashOnBand(snakeHeadOutsideBand);

        assertFalse(endOfGameM.returnInformationEnd());
    }

    @Test
    public void returnInformationEndAfterSnakeCrashOnBandShouldChangeEndOfGameToFalse() {
        blockList.addToQueue(blockCloned);
        blockList.addToQueue(blockCloned1);
        ArrayList<SnakeTail> arrayList = blockList.BlockCloneList();
        endOfGameM.crashOnYourself(snakeHead, arrayList);

        assertFalse(endOfGameM.returnInformationEnd());
    }
}