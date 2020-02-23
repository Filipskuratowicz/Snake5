package org.example.storage;

import org.example.blocks.SnakeTail;

import java.util.ArrayList;


public class BlockList {

    ArrayList<SnakeTail> blockQueue = new ArrayList<>() {};

    boolean firstBlock = true;

    public void addToQueue(SnakeTail blockClone) {
        blockQueue.add(blockClone);
    }

    public int blockListSize() {
       return blockQueue.size();
    }

    public ArrayList<SnakeTail> BlockCloneList() {
        return blockQueue;
    }

    public void removeFromScene(BlockList blockList, int length, SnakeTail blC) {

        if (blC.getPosy() == 15 && blC.getPosx() == 15 && firstBlock) {
            blC.setPositionOutside();
            firstBlock = false;
        }
        else if (blockList.blockListSize() >= length) {
            SnakeTail bC = blockQueue.get(1);
            bC.setPositionOutside();
            blockQueue.remove(1);
    }
}

    public void removeAllFromList() {

        blockQueue.forEach(SnakeTail::setPositionOutside);
        blockQueue.removeAll(blockQueue.subList(0, blockQueue.size()));
    }

    public void setFirstBlock(boolean firstBlock) {
        this.firstBlock = firstBlock;
    }
}
