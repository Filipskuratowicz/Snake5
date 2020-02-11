package org.example.storage;

import org.example.BlockClone;

import java.util.ArrayList;


public class BlockList {

    ArrayList<BlockClone> blockQueue=new ArrayList<>() {
    };

    public void addToQueue(BlockClone blockClone) {
        blockQueue.add(blockClone);
    }

    public void removeFromScene() {
        BlockClone bC = blockQueue.get(1);
//        System.out.println(bC.toString()+ "1 get");
        bC.setPositionOutside(400,400);
//        System.out.println(bC.toString() + "po zmianie cor");
        blockQueue.remove(1);
    }

    public int blockListSize() {
       int blockS = blockQueue.size();
        return blockS;
    }

    public ArrayList BlockCloneList() {
        return blockQueue;
    }


}
