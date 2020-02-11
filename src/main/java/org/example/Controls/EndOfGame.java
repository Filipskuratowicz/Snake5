package org.example.Controls;

import javafx.stage.Stage;
import org.example.Block;
import org.example.BlockClone;
import org.example.storage.BlockList;

import java.util.ArrayList;

public class EndOfGame extends Stage {

    BlockList blockList;
    boolean crash = false;


    public void crashOnBand(Stage stage, Block block) {
        if (block.getPosX() == 300 || block.getPosY() == 300) {
            stage.hide();
        }
        if (block.getPosX() == -10 || block.getPosY() == -10) {
            stage.hide();
        }
    }

//    public void showList( Block block, ArrayList<BlockClone> arr){
//        for (BlockClone o : arr.subList(1, arr.size())) {
//
//        }
//    }

    public void crashOnYourself(Stage stage, Block block, ArrayList<BlockClone> arr) {
        for (BlockClone o : arr) {
            System.out.println( " Posx blockClone = " + o.getPosx() + " block =" + block.getPosX());
        }
            arr.stream().skip(1).forEach(e -> {
                if (e.getPosy()*10 == block.getPosY() && e.getPosx()*10 == block.getPosX()) {
                    stage.hide();
                }
            });
    }
}
//            System.out.println( " Posx blockClone = " + o.getPosx() + " block =" + block.getPosX());

//            if (o.getPosx() == block.getPosX() / 10) {
//                System.out.println();
//                crash = true;
//            }
//            if (o.getPosy() == block.getPosY() / 10) {
//                crash = true;
//
//            }


//    public void stageHideMethod(Stage stage) {
//        if (crash == true) {
//            stage.hide();
//        }
//    }



