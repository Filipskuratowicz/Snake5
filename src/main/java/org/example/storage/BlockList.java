package org.example.storage;

import javafx.scene.Scene;
import org.example.BlockClone;

import java.util.ArrayList;


public class BlockList {
    boolean first = true;

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


    public void removeFromScene(Scene scene, BlockList blockList, int lenght, BlockClone blC) {
        if (blC.getPosy() == 15 && blC.getPosx() == 15 && first == true) {
            blC.setPositionOutside(400, 400);
            first = false;
        }
        if (blockList.blockListSize() >= lenght) {
//            blockList.removeFromScene();
            BlockClone bC = blockQueue.get(1);
            bC.setPositionOutside(400,400);
            blockQueue.remove(1);
    }
}

//    public void removeFromScene() {
//        BlockClone bC = blockQueue.get(1);
//        bC.setPositionOutside(400,400);
//        blockQueue.remove(1);
//    }
}
