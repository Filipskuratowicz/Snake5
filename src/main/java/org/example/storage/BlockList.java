package org.example.storage;

import javafx.scene.Scene;
import org.example.BlockClone;

import java.util.ArrayList;


public class BlockList {

    ArrayList<BlockClone> blockQueue=new ArrayList<>() {
    };



    public void addToQueue(BlockClone blockClone) {
        blockQueue.add(blockClone);
    }
    public int blockListSize() {
       int blockS = blockQueue.size();
        return blockS;
    }

    public ArrayList BlockCloneList() {
        return blockQueue;
    }

    public void removeFromScene(Scene scene, BlockList blockList, int lenght) {
        if (blockList.blockListSize() >= lenght) {
            blockList.removeFromScene();
    }
}

    public void removeFromScene() {
        BlockClone bC = blockQueue.get(1);
        System.out.println(bC.toString());
        System.out.println(bC.toString());
        bC.setPositionOutside(400,400);
        blockQueue.remove(1);
    }
}
