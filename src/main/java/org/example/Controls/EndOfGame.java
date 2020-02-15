package org.example.Controls;

import javafx.stage.Stage;
import org.example.blocks.SnakeHead;
import org.example.blocks.SnakeTail;

import java.util.ArrayList;

public class EndOfGame extends Stage {


    public void crashOnBand(Stage stage, SnakeHead block) {
        if (block.getPosX() == 300 || block.getPosY() == 300) {
            stage.hide();
        }
        if (block.getPosX() == -10 || block.getPosY() == -10) {
            stage.hide();
        }
    }

    public void crashOnYourself(Stage stage, SnakeHead block, ArrayList<SnakeTail> arr) {

            arr.stream().skip(1).forEach(e -> {
                if (e.getPosy()*10 == block.getPosY() && e.getPosx()*10 == block.getPosX()) {
                    stage.hide();
                }
            });
    }
}




