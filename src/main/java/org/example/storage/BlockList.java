package org.example.storage;

import org.example.blocks.SnakeTail;

import java.util.ArrayList;


public class BlockList {

    ArrayList<SnakeTail> blockQueue=new ArrayList<>() {};

    boolean firstBlock = true;

    public void addToQueue(SnakeTail blockClone) {
        blockQueue.add(blockClone);
    }

    public int blockListSize() {
       int blockS = blockQueue.size();
        return blockS;
    }

    public ArrayList BlockCloneList() {
        return blockQueue;
    }

    public void removeFromScene(BlockList blockList, int lenght, SnakeTail blC) {

        if (blC.getPosy() == 15 && blC.getPosx() == 15 && firstBlock == true) {
            blC.setPositionOutside();
            firstBlock = false;
        }
        else if (blockList.blockListSize() >= lenght) {
            SnakeTail bC = blockQueue.get(1);
            bC.setPositionOutside();
            blockQueue.remove(1);
    }
}

    public int  removeAllFromList() {
        blockQueue.removeAll(blockQueue);
        return blockListSize();
    }

    public void setFirstBlock(boolean firstBlock) {
        this.firstBlock = firstBlock;
    }
}
