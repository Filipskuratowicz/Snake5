package org.example.storage;

import org.example.blocks.SnakeTail;
import org.junit.Test;

import static org.junit.Assert.*;

public class BlockListTest {

    @Test
    public void removeAllFromList() {
        BlockList blockList = new BlockList();
        SnakeTail snakeTail = new SnakeTail(14, 14);
        blockList.addToQueue(snakeTail);
        assertEquals(1, blockList.blockListSize());
    }
}