package org.example.storage;

import org.example.blocks.SnakeTail;
import org.junit.Test;

import static org.junit.Assert.*;

public class BlockListTest {
    BlockList blockList = new BlockList();
    SnakeTail snakeTail = new SnakeTail(14, 14);


    @Test
    public void removeAllFromListShouldReturn0() {
        blockList.addToQueue(snakeTail);
        blockList.removeAllFromList();
        assertEquals(0, blockList.blockListSize());

    }

    @Test
    public void blockListSizeShouldReturn3() {
        blockList.addToQueue(snakeTail);
        blockList.addToQueue(snakeTail);
        blockList.addToQueue(snakeTail);

        assertEquals(3,blockList.blockListSize());
    }
}