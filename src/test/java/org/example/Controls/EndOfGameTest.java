package org.example.Controls;

import org.example.blocks.SnakeHead;
import org.example.blocks.SnakeTail;
import org.example.storage.BlockList;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class EndOfGameTest {

    SnakeHead snakeHead = new SnakeHead(10, 10);
    SnakeHead snakeHeadOutsideBand = new SnakeHead(30, 7);
    BlockList blockList = new BlockList();
    SnakeTail blockClonned = new SnakeTail(snakeHead.getPosX()+10, snakeHead.getPosY());
    SnakeTail blockClonned1 = new SnakeTail(snakeHead.getPosX(), snakeHead.getPosY());
    EndOfGame endOfGameM = new EndOfGame();

    @Test
    public void returnInformationEndAfterSnakeCrashOnSnakeShouldChangeEndOfGameToFalse() {
        endOfGameM.crashOnBand(snakeHeadOutsideBand);
        assertEquals(false, endOfGameM.returnInformationEnd());
    }

    @Test
    public void returnInformationEndAfterSnakeCrashOnBandShouldChangeEndOfGameToFalse() {
        blockList.addToQueue(blockClonned);
        blockList.addToQueue(blockClonned1);
        ArrayList arrayList = blockList.BlockCloneList();
        endOfGameM.crashOnYourself(snakeHead, arrayList);

        assertEquals(false, endOfGameM.returnInformationEnd());
    }
}