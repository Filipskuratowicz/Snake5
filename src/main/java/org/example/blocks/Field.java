package org.example.blocks;

import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import org.example.App;
import org.example.Controls.EndOfGame;
import org.example.Controls.FoodControl;
import org.example.Controls.SpeedControl;
import org.example.storage.BlockList;

public class Field extends Pane {

    public Field(int width, int height) {

        setMinSize(width * App.rectangle, height * App.rectangle);
    setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, null, null)));
    setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(1))));
    }

    public void addBlock(SnakeHead block) {
        getChildren().add(block);
    }
    public void addCloneBlock(SnakeTail block) {
        getChildren().add(block);
    }
    public void addFood(FoodForSnake food) {
        getChildren().add(food);
    }

    public void resetAll(SnakeHead head, BlockList blockList, EndOfGame endOfGame,
                         FoodControl foodControl, SpeedControl speedControl) {
        head.setPosX(150);
        head.setPosY(150);
        endOfGame.setGameEnd(true);
        blockList.removeAllFromList();
        System.out.println("How many blocks in the snakeTail:  " + blockList.blockListSize());
        blockList.setFirstBlock(true);
        head.setDirection(4);
        head.setVerHor(true);
        foodControl.setLength(40);
        speedControl.setSpeed(200);
    }
}
